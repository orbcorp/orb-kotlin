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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class CustomerCreditLedgerListPageResponse
private constructor(
    private val data: JsonField<List<CustomerCreditLedgerListResponse>>,
    private val paginationMetadata: JsonField<PaginationMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<CustomerCreditLedgerListResponse>> = JsonMissing.of(),
        @JsonProperty("pagination_metadata")
        @ExcludeMissing
        paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
    ) : this(data, paginationMetadata, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<CustomerCreditLedgerListResponse> = data.getRequired("data")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paginationMetadata(): PaginationMetadata =
        paginationMetadata.getRequired("pagination_metadata")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<CustomerCreditLedgerListResponse>> = data

    /**
     * Returns the raw JSON value of [paginationMetadata].
     *
     * Unlike [paginationMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pagination_metadata")
    @ExcludeMissing
    fun _paginationMetadata(): JsonField<PaginationMetadata> = paginationMetadata

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerCreditLedgerListPageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .paginationMetadata()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCreditLedgerListPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<CustomerCreditLedgerListResponse>>? = null
        private var paginationMetadata: JsonField<PaginationMetadata>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            customerCreditLedgerListPageResponse: CustomerCreditLedgerListPageResponse
        ) = apply {
            data = customerCreditLedgerListPageResponse.data.map { it.toMutableList() }
            paginationMetadata = customerCreditLedgerListPageResponse.paginationMetadata
            additionalProperties =
                customerCreditLedgerListPageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<CustomerCreditLedgerListResponse>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed
         * `List<CustomerCreditLedgerListResponse>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<CustomerCreditLedgerListResponse>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomerCreditLedgerListResponse] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: CustomerCreditLedgerListResponse) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        /**
         * Alias for calling [addData] with
         * `CustomerCreditLedgerListResponse.ofIncrement(increment)`.
         */
        fun addData(increment: IncrementLedgerEntry) =
            addData(CustomerCreditLedgerListResponse.ofIncrement(increment))

        /**
         * Alias for calling [addData] with
         * `CustomerCreditLedgerListResponse.ofDecrement(decrement)`.
         */
        fun addData(decrement: DecrementLedgerEntry) =
            addData(CustomerCreditLedgerListResponse.ofDecrement(decrement))

        /**
         * Alias for calling [addData] with
         * `CustomerCreditLedgerListResponse.ofExpirationChange(expirationChange)`.
         */
        fun addData(expirationChange: ExpirationChangeLedgerEntry) =
            addData(CustomerCreditLedgerListResponse.ofExpirationChange(expirationChange))

        /**
         * Alias for calling [addData] with
         * `CustomerCreditLedgerListResponse.ofCreditBlockExpiry(creditBlockExpiry)`.
         */
        fun addData(creditBlockExpiry: CreditBlockExpiryLedgerEntry) =
            addData(CustomerCreditLedgerListResponse.ofCreditBlockExpiry(creditBlockExpiry))

        /** Alias for calling [addData] with `CustomerCreditLedgerListResponse.ofVoid(void)`. */
        fun addData(void: VoidLedgerEntry) = addData(CustomerCreditLedgerListResponse.ofVoid(void))

        /**
         * Alias for calling [addData] with
         * `CustomerCreditLedgerListResponse.ofVoidInitiated(voidInitiated)`.
         */
        fun addData(voidInitiated: VoidInitiatedLedgerEntry) =
            addData(CustomerCreditLedgerListResponse.ofVoidInitiated(voidInitiated))

        /**
         * Alias for calling [addData] with
         * `CustomerCreditLedgerListResponse.ofAmendment(amendment)`.
         */
        fun addData(amendment: AmendmentLedgerEntry) =
            addData(CustomerCreditLedgerListResponse.ofAmendment(amendment))

        fun paginationMetadata(paginationMetadata: PaginationMetadata) =
            paginationMetadata(JsonField.of(paginationMetadata))

        /**
         * Sets [Builder.paginationMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paginationMetadata] with a well-typed
         * [PaginationMetadata] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
            this.paginationMetadata = paginationMetadata
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CustomerCreditLedgerListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .paginationMetadata()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerCreditLedgerListPageResponse =
            CustomerCreditLedgerListPageResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("paginationMetadata", paginationMetadata),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerCreditLedgerListPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (paginationMetadata.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreditLedgerListPageResponse && data == other.data && paginationMetadata == other.paginationMetadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, paginationMetadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerCreditLedgerListPageResponse{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"
}
