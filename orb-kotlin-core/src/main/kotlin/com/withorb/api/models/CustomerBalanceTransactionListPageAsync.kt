// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.services.async.customers.BalanceTransactionServiceAsync
import java.util.Collections
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * ## The customer balance
 *
 * The customer balance is an amount in the customer's currency, which Orb automatically applies to
 * subsequent invoices. This balance can be adjusted manually via Orb's webapp on the customer
 * details page. You can use this balance to provide a fixed mid-period credit to the customer.
 * Commonly, this is done due to system downtime/SLA violation, or an adhoc adjustment discussed
 * with the customer.
 *
 * If the balance is a positive value at the time of invoicing, it represents that the customer has
 * credit that should be used to offset the amount due on the next issued invoice. In this case, Orb
 * will automatically reduce the next invoice by the balance amount, and roll over any remaining
 * balance if the invoice is fully discounted.
 *
 * If the balance is a negative value at the time of invoicing, Orb will increase the invoice's
 * amount due with a positive adjustment, and reset the balance to 0.
 *
 * This endpoint retrieves all customer balance transactions in reverse chronological order for a
 * single customer, providing a complete audit trail of all adjustments and invoice applications.
 *
 * ## Eligibility
 *
 * The customer balance can only be applied to invoices or adjusted manually if invoices are not
 * synced to a separate invoicing provider. If a payment gateway such as Stripe is used, the balance
 * will be applied to the invoice before forwarding payment to the gateway.
 */
class CustomerBalanceTransactionListPageAsync
private constructor(
    private val balanceTransactionsService: BalanceTransactionServiceAsync,
    private val params: CustomerBalanceTransactionListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<CustomerBalanceTransactionListResponse> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerBalanceTransactionListPageAsync && balanceTransactionsService == other.balanceTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balanceTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "CustomerBalanceTransactionListPageAsync{balanceTransactionsService=$balanceTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return paginationMetadata().nextCursor() != null
    }

    fun getNextPageParams(): CustomerBalanceTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return CustomerBalanceTransactionListParams.builder()
            .from(params)
            .apply { paginationMetadata().nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    suspend fun getNextPage(): CustomerBalanceTransactionListPageAsync? {
        return getNextPageParams()?.let { balanceTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            balanceTransactionsService: BalanceTransactionServiceAsync,
            params: CustomerBalanceTransactionListParams,
            response: Response,
        ) = CustomerBalanceTransactionListPageAsync(balanceTransactionsService, params, response)
    }

    class Response(
        private val data: JsonField<List<CustomerBalanceTransactionListResponse>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data")
            data: JsonField<List<CustomerBalanceTransactionListResponse>> = JsonMissing.of(),
            @JsonProperty("pagination_metadata")
            paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        ) : this(data, paginationMetadata, mutableMapOf())

        fun data(): List<CustomerBalanceTransactionListResponse> =
            data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata =
            paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): JsonField<List<CustomerBalanceTransactionListResponse>>? = data

        @JsonProperty("pagination_metadata")
        fun _paginationMetadata(): JsonField<PaginationMetadata>? = paginationMetadata

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            data().map { it.validate() }
            paginationMetadata().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: OrbInvalidDataException) {
                false
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && data == other.data && paginationMetadata == other.paginationMetadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, paginationMetadata, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [CustomerBalanceTransactionListPageAsync].
             */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CustomerBalanceTransactionListResponse>> =
                JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CustomerBalanceTransactionListResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<CustomerBalanceTransactionListResponse>>) = apply {
                this.data = data
            }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) =
                paginationMetadata(JsonField.of(paginationMetadata))

            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
                this.paginationMetadata = paginationMetadata
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            /**
             * Returns an immutable instance of [Response].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Response =
                Response(data, paginationMetadata, additionalProperties.toMutableMap())
        }
    }

    class AutoPager(private val firstPage: CustomerBalanceTransactionListPageAsync) :
        Flow<CustomerBalanceTransactionListResponse> {

        override suspend fun collect(
            collector: FlowCollector<CustomerBalanceTransactionListResponse>
        ) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
