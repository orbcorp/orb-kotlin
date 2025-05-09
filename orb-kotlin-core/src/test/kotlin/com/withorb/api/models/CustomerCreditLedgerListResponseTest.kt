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
    fun ofIncrement() {
        val increment =
            CustomerCreditLedgerListResponse.Increment.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.Increment.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.Increment.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(CustomerCreditLedgerListResponse.Increment.EntryStatus.COMMITTED)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.Increment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofIncrement(increment)

        assertThat(customerCreditLedgerListResponse.increment()).isEqualTo(increment)
        assertThat(customerCreditLedgerListResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListResponse.void()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListResponse.amendment()).isNull()
    }

    @Test
    fun ofIncrementRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofIncrement(
                CustomerCreditLedgerListResponse.Increment.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.Increment.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.Increment.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(CustomerCreditLedgerListResponse.Increment.EntryStatus.COMMITTED)
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.Increment.Metadata.builder()
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
    fun ofDecrement() {
        val decrement =
            CustomerCreditLedgerListResponse.Decrement.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.Decrement.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.Decrement.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(CustomerCreditLedgerListResponse.Decrement.EntryStatus.COMMITTED)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.Decrement.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .eventId("event_id")
                .invoiceId("invoice_id")
                .priceId("price_id")
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofDecrement(decrement)

        assertThat(customerCreditLedgerListResponse.increment()).isNull()
        assertThat(customerCreditLedgerListResponse.decrement()).isEqualTo(decrement)
        assertThat(customerCreditLedgerListResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListResponse.void()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListResponse.amendment()).isNull()
    }

    @Test
    fun ofDecrementRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofDecrement(
                CustomerCreditLedgerListResponse.Decrement.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.Decrement.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.Decrement.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(CustomerCreditLedgerListResponse.Decrement.EntryStatus.COMMITTED)
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.Decrement.Metadata.builder()
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
    fun ofExpirationChange() {
        val expirationChange =
            CustomerCreditLedgerListResponse.ExpirationChange.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.ExpirationChange.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.ExpirationChange.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListResponse.ExpirationChange.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.ExpirationChange.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofExpirationChange(expirationChange)

        assertThat(customerCreditLedgerListResponse.increment()).isNull()
        assertThat(customerCreditLedgerListResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChange()).isEqualTo(expirationChange)
        assertThat(customerCreditLedgerListResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListResponse.void()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListResponse.amendment()).isNull()
    }

    @Test
    fun ofExpirationChangeRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofExpirationChange(
                CustomerCreditLedgerListResponse.ExpirationChange.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.ExpirationChange.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.ExpirationChange.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.ExpirationChange.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.ExpirationChange.Metadata.builder()
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
    fun ofCreditBlockExpiry() {
        val creditBlockExpiry =
            CustomerCreditLedgerListResponse.CreditBlockExpiry.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.CreditBlockExpiry.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.CreditBlockExpiry.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(
                    CustomerCreditLedgerListResponse.CreditBlockExpiry.EntryStatus.COMMITTED
                )
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.CreditBlockExpiry.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofCreditBlockExpiry(creditBlockExpiry)

        assertThat(customerCreditLedgerListResponse.increment()).isNull()
        assertThat(customerCreditLedgerListResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiry())
            .isEqualTo(creditBlockExpiry)
        assertThat(customerCreditLedgerListResponse.void()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListResponse.amendment()).isNull()
    }

    @Test
    fun ofCreditBlockExpiryRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofCreditBlockExpiry(
                CustomerCreditLedgerListResponse.CreditBlockExpiry.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.CreditBlockExpiry.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.CreditBlockExpiry.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.CreditBlockExpiry.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.CreditBlockExpiry.Metadata.builder()
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
    fun ofVoid() {
        val void =
            CustomerCreditLedgerListResponse.Void.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.Void.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.Void.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(CustomerCreditLedgerListResponse.Void.EntryStatus.COMMITTED)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.Void.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListResponse = CustomerCreditLedgerListResponse.ofVoid(void)

        assertThat(customerCreditLedgerListResponse.increment()).isNull()
        assertThat(customerCreditLedgerListResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListResponse.void()).isEqualTo(void)
        assertThat(customerCreditLedgerListResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListResponse.amendment()).isNull()
    }

    @Test
    fun ofVoidRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofVoid(
                CustomerCreditLedgerListResponse.Void.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.Void.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.Void.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(CustomerCreditLedgerListResponse.Void.EntryStatus.COMMITTED)
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.Void.Metadata.builder()
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
    fun ofVoidInitiated() {
        val voidInitiated =
            CustomerCreditLedgerListResponse.VoidInitiated.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.VoidInitiated.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.VoidInitiated.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(CustomerCreditLedgerListResponse.VoidInitiated.EntryStatus.COMMITTED)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.VoidInitiated.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .newBlockExpiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startingBalance(0.0)
                .voidAmount(0.0)
                .voidReason("void_reason")
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofVoidInitiated(voidInitiated)

        assertThat(customerCreditLedgerListResponse.increment()).isNull()
        assertThat(customerCreditLedgerListResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListResponse.void()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiated()).isEqualTo(voidInitiated)
        assertThat(customerCreditLedgerListResponse.amendment()).isNull()
    }

    @Test
    fun ofVoidInitiatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofVoidInitiated(
                CustomerCreditLedgerListResponse.VoidInitiated.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.VoidInitiated.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.VoidInitiated.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(
                        CustomerCreditLedgerListResponse.VoidInitiated.EntryStatus.COMMITTED
                    )
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.VoidInitiated.Metadata.builder()
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
    fun ofAmendment() {
        val amendment =
            CustomerCreditLedgerListResponse.Amendment.builder()
                .id("id")
                .amount(0.0)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .creditBlock(
                    CustomerCreditLedgerListResponse.Amendment.CreditBlock.builder()
                        .id("id")
                        .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .perUnitCostBasis("per_unit_cost_basis")
                        .build()
                )
                .currency("currency")
                .customer(
                    CustomerCreditLedgerListResponse.Amendment.Customer.builder()
                        .id("id")
                        .externalCustomerId("external_customer_id")
                        .build()
                )
                .description("description")
                .endingBalance(0.0)
                .entryStatus(CustomerCreditLedgerListResponse.Amendment.EntryStatus.COMMITTED)
                .ledgerSequenceNumber(0L)
                .metadata(
                    CustomerCreditLedgerListResponse.Amendment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .startingBalance(0.0)
                .build()

        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofAmendment(amendment)

        assertThat(customerCreditLedgerListResponse.increment()).isNull()
        assertThat(customerCreditLedgerListResponse.decrement()).isNull()
        assertThat(customerCreditLedgerListResponse.expirationChange()).isNull()
        assertThat(customerCreditLedgerListResponse.creditBlockExpiry()).isNull()
        assertThat(customerCreditLedgerListResponse.void()).isNull()
        assertThat(customerCreditLedgerListResponse.voidInitiated()).isNull()
        assertThat(customerCreditLedgerListResponse.amendment()).isEqualTo(amendment)
    }

    @Test
    fun ofAmendmentRoundtrip() {
        val jsonMapper = jsonMapper()
        val customerCreditLedgerListResponse =
            CustomerCreditLedgerListResponse.ofAmendment(
                CustomerCreditLedgerListResponse.Amendment.builder()
                    .id("id")
                    .amount(0.0)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .creditBlock(
                        CustomerCreditLedgerListResponse.Amendment.CreditBlock.builder()
                            .id("id")
                            .expiryDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .perUnitCostBasis("per_unit_cost_basis")
                            .build()
                    )
                    .currency("currency")
                    .customer(
                        CustomerCreditLedgerListResponse.Amendment.Customer.builder()
                            .id("id")
                            .externalCustomerId("external_customer_id")
                            .build()
                    )
                    .description("description")
                    .endingBalance(0.0)
                    .entryStatus(CustomerCreditLedgerListResponse.Amendment.EntryStatus.COMMITTED)
                    .ledgerSequenceNumber(0L)
                    .metadata(
                        CustomerCreditLedgerListResponse.Amendment.Metadata.builder()
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
