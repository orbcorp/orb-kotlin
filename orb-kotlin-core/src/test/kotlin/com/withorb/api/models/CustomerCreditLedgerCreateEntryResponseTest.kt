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

internal class CustomerCreditLedgerCreateEntryResponseTest {

    @Test
    fun ofIncrement() {
        val increment =
            CustomerCreditLedgerCreateEntryResponse.Increment.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.Increment.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.Increment.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.Increment.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.Increment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofIncrement(increment)

        assertThat(customerCreditLedgerCreateEntryResponse.increment()).isEqualTo(increment)
        assertThat(customerCreditLedgerCreateEntryResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.amendment()).isNull()
    }

    @Test
    fun ofIncrementRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofIncrement(
                CustomerCreditLedgerCreateEntryResponse.Increment.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.Increment.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.Increment.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.Increment.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.Increment.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofDecrement() {
        val decrement =
            CustomerCreditLedgerCreateEntryResponse.Decrement.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.Decrement.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.Decrement.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.Decrement.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.Decrement.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofDecrement(decrement)

        assertThat(customerCreditLedgerCreateEntryResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.decrement()).isEqualTo(decrement)
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.amendment()).isNull()
    }

    @Test
    fun ofDecrementRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofDecrement(
                CustomerCreditLedgerCreateEntryResponse.Decrement.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.Decrement.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.Decrement.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.Decrement.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.Decrement.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .eventId("event_id")
                    .invoiceId("invoice_id")
                    .priceId("price_id")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofExpirationChange() {
        val expirationChange =
            CustomerCreditLedgerCreateEntryResponse.ExpirationChange.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChange.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChange.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChange.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.ExpirationChange.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofExpirationChange(expirationChange)

        assertThat(customerCreditLedgerCreateEntryResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChange())
            .isEqualTo(expirationChange)
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.amendment()).isNull()
    }

    @Test
    fun ofExpirationChangeRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofExpirationChange(
                CustomerCreditLedgerCreateEntryResponse.ExpirationChange.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChange.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChange.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChange.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.ExpirationChange.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofCreditBlockExpiry() {
        val creditBlockExpiry =
            CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofCreditBlockExpiry(creditBlockExpiry)

        assertThat(customerCreditLedgerCreateEntryResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiry())
            .isEqualTo(creditBlockExpiry)
        assertThat(customerCreditLedgerCreateEntryResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.amendment()).isNull()
    }

    @Test
    fun ofCreditBlockExpiryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofCreditBlockExpiry(
                CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.CreditBlockExpiry.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofVoid() {
        val void =
            CustomerCreditLedgerCreateEntryResponse.Void.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.Void.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.Void.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(CustomerCreditLedgerCreateEntryResponse.Void.EntryStatus.COMMITTED)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.Void.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofVoid(void)

        assertThat(customerCreditLedgerCreateEntryResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.void()).isEqualTo(void)
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.amendment()).isNull()
    }

    @Test
    fun ofVoidRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofVoid(
                CustomerCreditLedgerCreateEntryResponse.Void.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.Void.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.Void.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(CustomerCreditLedgerCreateEntryResponse.Void.EntryStatus.COMMITTED)
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.Void.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofVoidInitiated() {
        val voidInitiated =
            CustomerCreditLedgerCreateEntryResponse.VoidInitiated.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiated.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiated.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiated.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.VoidInitiated.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofVoidInitiated(voidInitiated)

        assertThat(customerCreditLedgerCreateEntryResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiated()).isEqualTo(voidInitiated)
        assertThat(customerCreditLedgerCreateEntryResponse.amendment()).isNull()
    }

    @Test
    fun ofVoidInitiatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofVoidInitiated(
                CustomerCreditLedgerCreateEntryResponse.VoidInitiated.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiated.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiated.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiated.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.VoidInitiated.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
    }

    @Test
    fun ofAmendment() {
        val amendment =
            CustomerCreditLedgerCreateEntryResponse.Amendment.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerCreateEntryResponse.Amendment.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerCreateEntryResponse.Amendment.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerCreateEntryResponse.Amendment.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerCreateEntryResponse.Amendment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofAmendment(amendment)

        assertThat(customerCreditLedgerCreateEntryResponse.increment()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.decrement()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.void()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerCreateEntryResponse.amendment()).isEqualTo(amendment)
    }

    @Test
    fun ofAmendmentRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerCreateEntryResponse =
            CustomerCreditLedgerCreateEntryResponse.ofAmendment(
                CustomerCreditLedgerCreateEntryResponse.Amendment.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerCreateEntryResponse.Amendment.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerCreateEntryResponse.Amendment.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerCreateEntryResponse.Amendment.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerCreateEntryResponse.Amendment.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerCreateEntryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerCreateEntryResponse),
                jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerCreateEntryResponse)
            .isEqualTo(customerCreditLedgerCreateEntryResponse)
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
        val customerCreditLedgerCreateEntryResponse =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<CustomerCreditLedgerCreateEntryResponse>(),
                )

        val e =
            assertThrows<OrbInvalidDataException> {
                customerCreditLedgerCreateEntryResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
