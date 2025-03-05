// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint allows you to create a new ledger entry for a specified customer's balance. This
 * can be used to increment balance, deduct credits, and change the expiry date of existing credits.
 *
 * ## Effects of adding a ledger entry
 * 1. After calling this endpoint, [Fetch Credit Balance](fetch-customer-credits) will return a
 *    credit block that represents the changes (i.e. balance changes or transfers).
 * 2. A ledger entry will be added to the credits ledger for this customer, and therefore returned
 *    in the [View Credits Ledger](fetch-customer-credits-ledger) response as well as serialized in
 *    the response to this request. In the case of deductions without a specified block, multiple
 *    ledger entries may be created if the deduction spans credit blocks.
 * 3. If `invoice_settings` is specified, an invoice will be created that reflects the cost of the
 *    credits (based on `amount` and `per_unit_cost_basis`).
 *
 * ## Adding credits
 *
 * Adding credits is done by creating an entry of type `increment`. This requires the caller to
 * specify a number of credits as well as an optional expiry date in `YYYY-MM-DD` format. Orb also
 * recommends specifying a description to assist with auditing. When adding credits, the caller can
 * also specify a cost basis per-credit, to indicate how much in USD a customer paid for a single
 * credit in a block. This can later be used for revenue recognition.
 *
 * The following snippet illustrates a sample request body to increment credits which will expire in
 * January of 2022.
 *
 * ```json
 * {
 *   "entry_type": "increment",
 *   "amount": 100,
 *   "expiry_date": "2022-12-28",
 *   "per_unit_cost_basis": "0.20",
 *   "description": "Purchased 100 credits"
 * }
 * ```
 *
 * Note that by default, Orb will always first increment any _negative_ balance in existing blocks
 * before adding the remaining amount to the desired credit block.
 *
 * ### Invoicing for credits
 *
 * By default, Orb manipulates the credit ledger but does not charge for credits. However, if you
 * pass `invoice_settings` in the body of this request, Orb will also generate a one-off invoice for
 * the customer for the credits pre-purchase. Note that you _must_ provide the
 * `per_unit_cost_basis`, since the total charges on the invoice are calculated by multiplying the
 * cost basis with the number of credit units added.
 *
 * ## Deducting Credits
 *
 * Orb allows you to deduct credits from a customer by creating an entry of type `decrement`. Orb
 * matches the algorithm for automatic deductions for determining which credit blocks to decrement
 * from. In the case that the deduction leads to multiple ledger entries, the response from this
 * endpoint will be the final deduction. Orb also optionally allows specifying a description to
 * assist with auditing.
 *
 * The following snippet illustrates a sample request body to decrement credits.
 *
 * ```json
 * {
 *   "entry_type": "decrement",
 *   "amount": 20,
 *   "description": "Removing excess credits"
 * }
 * ```
 *
 * ## Changing credits expiry
 *
 * If you'd like to change when existing credits expire, you should create a ledger entry of type
 * `expiration_change`. For this entry, the required parameter `expiry_date` identifies the
 * _originating_ block, and the required parameter `target_expiry_date` identifies when the
 * transferred credits should now expire. A new credit block will be created with expiry date
 * `target_expiry_date`, with the same cost basis data as the original credit block, if present.
 *
 * Note that the balance of the block with the given `expiry_date` must be at least equal to the
 * desired transfer amount determined by the `amount` parameter.
 *
 * The following snippet illustrates a sample request body to extend the expiration date of credits
 * by one year:
 * ```json
 * {
 *   "entry_type": "expiration_change",
 *   "amount": 10,
 *   "expiry_date": "2022-12-28",
 *   "block_id": "UiUhFWeLHPrBY4Ad",
 *   "target_expiry_date": "2023-12-28",
 *   "description": "Extending credit validity"
 * }
 * ```
 *
 * ## Voiding credits
 *
 * If you'd like to void a credit block, create a ledger entry of type `void`. For this entry,
 * `block_id` is required to identify the block, and `amount` indicates how many credits to void, up
 * to the block's initial balance. Pass in a `void_reason` of `refund` if the void is due to a
 * refund.
 *
 * ## Amendment
 *
 * If you'd like to undo a decrement on a credit block, create a ledger entry of type `amendment`.
 * For this entry, `block_id` is required to identify the block that was originally decremented
 * from, and `amount` indicates how many credits to return to the customer, up to the block's
 * initial balance.
 */
class CustomerCreditLedgerCreateEntryParams
private constructor(
    private val customerId: String,
    private val addCreditLedgerEntryRequest: AddCreditLedgerEntryRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String = customerId

    fun addCreditLedgerEntryRequest(): AddCreditLedgerEntryRequest = addCreditLedgerEntryRequest

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): AddCreditLedgerEntryRequest = addCreditLedgerEntryRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> customerId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerCreateEntryParams].
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * .addCreditLedgerEntryRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCreditLedgerCreateEntryParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var customerId: String? = null
        private var addCreditLedgerEntryRequest: AddCreditLedgerEntryRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerCreditLedgerCreateEntryParams: CustomerCreditLedgerCreateEntryParams
        ) = apply {
            customerId = customerCreditLedgerCreateEntryParams.customerId
            addCreditLedgerEntryRequest =
                customerCreditLedgerCreateEntryParams.addCreditLedgerEntryRequest
            additionalHeaders = customerCreditLedgerCreateEntryParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerCreditLedgerCreateEntryParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        fun addCreditLedgerEntryRequest(addCreditLedgerEntryRequest: AddCreditLedgerEntryRequest) =
            apply {
                this.addCreditLedgerEntryRequest = addCreditLedgerEntryRequest
            }

        fun addCreditLedgerEntryRequest(
            incrementCreditLedgerEntryRequestParams:
                AddCreditLedgerEntryRequest.AddIncrementCreditLedgerEntryRequestParams
        ) =
            addCreditLedgerEntryRequest(
                AddCreditLedgerEntryRequest.ofIncrementCreditLedgerEntryRequestParams(
                    incrementCreditLedgerEntryRequestParams
                )
            )

        fun addIncrementCreditLedgerEntryRequestParamsCreditLedgerEntryRequest(amount: Double) =
            addCreditLedgerEntryRequest(
                AddCreditLedgerEntryRequest.AddIncrementCreditLedgerEntryRequestParams.builder()
                    .entryType(
                        AddCreditLedgerEntryRequest.AddIncrementCreditLedgerEntryRequestParams
                            .EntryType
                            .INCREMENT
                    )
                    .amount(amount)
                    .build()
            )

        fun addCreditLedgerEntryRequest(
            decrementCreditLedgerEntryRequestParams:
                AddCreditLedgerEntryRequest.AddDecrementCreditLedgerEntryRequestParams
        ) =
            addCreditLedgerEntryRequest(
                AddCreditLedgerEntryRequest.ofDecrementCreditLedgerEntryRequestParams(
                    decrementCreditLedgerEntryRequestParams
                )
            )

        fun addDecrementCreditLedgerEntryRequestParamsCreditLedgerEntryRequest(amount: Double) =
            addCreditLedgerEntryRequest(
                AddCreditLedgerEntryRequest.AddDecrementCreditLedgerEntryRequestParams.builder()
                    .entryType(
                        AddCreditLedgerEntryRequest.AddDecrementCreditLedgerEntryRequestParams
                            .EntryType
                            .DECREMENT
                    )
                    .amount(amount)
                    .build()
            )

        fun addCreditLedgerEntryRequest(
            expirationChangeCreditLedgerEntryRequestParams:
                AddCreditLedgerEntryRequest.AddExpirationChangeCreditLedgerEntryRequestParams
        ) =
            addCreditLedgerEntryRequest(
                AddCreditLedgerEntryRequest.ofExpirationChangeCreditLedgerEntryRequestParams(
                    expirationChangeCreditLedgerEntryRequestParams
                )
            )

        fun addCreditLedgerEntryRequest(
            voidCreditLedgerEntryRequestParams:
                AddCreditLedgerEntryRequest.AddVoidCreditLedgerEntryRequestParams
        ) =
            addCreditLedgerEntryRequest(
                AddCreditLedgerEntryRequest.ofVoidCreditLedgerEntryRequestParams(
                    voidCreditLedgerEntryRequestParams
                )
            )

        fun addCreditLedgerEntryRequest(
            amendmentCreditLedgerEntryRequestParams:
                AddCreditLedgerEntryRequest.AddAmendmentCreditLedgerEntryRequestParams
        ) =
            addCreditLedgerEntryRequest(
                AddCreditLedgerEntryRequest.ofAmendmentCreditLedgerEntryRequestParams(
                    amendmentCreditLedgerEntryRequestParams
                )
            )

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): CustomerCreditLedgerCreateEntryParams =
            CustomerCreditLedgerCreateEntryParams(
                checkRequired("customerId", customerId),
                checkRequired("addCreditLedgerEntryRequest", addCreditLedgerEntryRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerCreateEntryParams && customerId == other.customerId && addCreditLedgerEntryRequest == other.addCreditLedgerEntryRequest && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, addCreditLedgerEntryRequest, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreditLedgerCreateEntryParams{customerId=$customerId, addCreditLedgerEntryRequest=$addCreditLedgerEntryRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
