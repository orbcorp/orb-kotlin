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

internal class CustomerCreditLedgerListByExternalIdResponseTest {

    @Test
    fun ofIncrement() {
        val increment =
            CustomerCreditLedgerListByExternalIdResponse.Increment.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.Increment.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.Increment.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.Increment.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.Increment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofIncrement(increment)

        assertThat(customerCreditLedgerListByExternalIdResponse.increment()).isEqualTo(increment)
        assertThat(customerCreditLedgerListByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofIncrementRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofIncrement(
                CustomerCreditLedgerListByExternalIdResponse.Increment.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.Increment.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.Increment.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.Increment.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.Increment.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofDecrement() {
        val decrement =
            CustomerCreditLedgerListByExternalIdResponse.Decrement.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.Decrement.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.Decrement.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.Decrement.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.Decrement.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofDecrement(decrement)

        assertThat(customerCreditLedgerListByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrement()).isEqualTo(decrement)
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofDecrementRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofDecrement(
                CustomerCreditLedgerListByExternalIdResponse.Decrement.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.Decrement.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.Decrement.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.Decrement.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.Decrement.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .eventId("event_id")
                    .invoiceId("invoice_id")
                    .priceId("price_id")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofExpirationChange() {
        val expirationChange =
            CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofExpirationChange(expirationChange)

        assertThat(customerCreditLedgerListByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChange())
            .isEqualTo(expirationChange)
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofExpirationChangeRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofExpirationChange(
                CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.ExpirationChange.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofCreditBlockExpiry() {
        val creditBlockExpiry =
            CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.CreditBlock
                        .builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.Customer
                        .builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.EntryStatus
                        .COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.Metadata
                        .builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofCreditBlockExpiry(creditBlockExpiry)

        assertThat(customerCreditLedgerListByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiry())
            .isEqualTo(creditBlockExpiry)
        assertThat(customerCreditLedgerListByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofCreditBlockExpiryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofCreditBlockExpiry(
                CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.CreditBlockExpiry.Metadata
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofVoid() {
        val void =
            CustomerCreditLedgerListByExternalIdResponse.Void.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.Void.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.Void.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.Void.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.Void.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoid(void)

        assertThat(customerCreditLedgerListByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.void()).isEqualTo(void)
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofVoidRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoid(
                CustomerCreditLedgerListByExternalIdResponse.Void.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.Void.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.Void.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.Void.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.Void.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .voidAmount(0.0)
                    .voidReason("void_reason")
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofVoidInitiated() {
        val voidInitiated =
            CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoidInitiated(voidInitiated)

        assertThat(customerCreditLedgerListByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiated())
            .isEqualTo(voidInitiated)
        assertThat(customerCreditLedgerListByExternalIdResponse.amendment()).isNull()
    }

    @Test
    fun ofVoidInitiatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofVoidInitiated(
                CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.CreditBlock
                            .builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.Customer
                            .builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.EntryStatus
                            .COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.VoidInitiated.Metadata
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

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
    }

    @Test
    fun ofAmendment() {
        val amendment =
            CustomerCreditLedgerListByExternalIdResponse.Amendment.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListByExternalIdResponse.Amendment.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListByExternalIdResponse.Amendment.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListByExternalIdResponse.Amendment.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListByExternalIdResponse.Amendment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofAmendment(amendment)

        assertThat(customerCreditLedgerListByExternalIdResponse.increment()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.void()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListByExternalIdResponse.amendment()).isEqualTo(amendment)
    }

    @Test
    fun ofAmendmentRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListByExternalIdResponse =
            CustomerCreditLedgerListByExternalIdResponse.ofAmendment(
                CustomerCreditLedgerListByExternalIdResponse.Amendment.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListByExternalIdResponse.Amendment.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListByExternalIdResponse.Amendment.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListByExternalIdResponse.Amendment.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListByExternalIdResponse.Amendment.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .startingBalance(0.0)
                    .build()
            )

        val roundtrippedCustomerCreditLedgerListByExternalIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerCreditLedgerListByExternalIdResponse),
                jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
            )

        assertThat(roundtrippedCustomerCreditLedgerListByExternalIdResponse)
            .isEqualTo(customerCreditLedgerListByExternalIdResponse)
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
        val customerCreditLedgerListByExternalIdResponse =
            jsonMapper()
                .convertValue(
                    testCase.value,
                    jacksonTypeRef<CustomerCreditLedgerListByExternalIdResponse>(),
                )

        val e =
            assertThrows<OrbInvalidDataException> {
                customerCreditLedgerListByExternalIdResponse.validate()
            }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
