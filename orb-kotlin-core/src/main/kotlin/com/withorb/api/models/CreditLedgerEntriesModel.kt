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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class CreditLedgerEntriesModel
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<CreditLedgerEntryModel>> = JsonMissing.of(),
    @JsonProperty("pagination_metadata")
    @ExcludeMissing
    private val paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<CreditLedgerEntryModel> = data.getRequired("data")

    fun paginationMetadata(): PaginationMetadata =
        paginationMetadata.getRequired("pagination_metadata")

    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<CreditLedgerEntryModel>> = data

    @JsonProperty("pagination_metadata")
    @ExcludeMissing
    fun _paginationMetadata(): JsonField<PaginationMetadata> = paginationMetadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreditLedgerEntriesModel = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        paginationMetadata().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditLedgerEntriesModel].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .paginationMetadata()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditLedgerEntriesModel]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<CreditLedgerEntryModel>>? = null
        private var paginationMetadata: JsonField<PaginationMetadata>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditLedgerEntriesModel: CreditLedgerEntriesModel) = apply {
            data = creditLedgerEntriesModel.data.map { it.toMutableList() }
            paginationMetadata = creditLedgerEntriesModel.paginationMetadata
            additionalProperties = creditLedgerEntriesModel.additionalProperties.toMutableMap()
        }

        fun data(data: List<CreditLedgerEntryModel>) = data(JsonField.of(data))

        fun data(data: JsonField<List<CreditLedgerEntryModel>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: CreditLedgerEntryModel) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun addData(incrementLedgerEntry: CreditLedgerEntryModel.IncrementLedgerEntry) =
            addData(CreditLedgerEntryModel.ofIncrementLedgerEntry(incrementLedgerEntry))

        fun addData(decrementLedgerEntry: CreditLedgerEntryModel.DecrementLedgerEntry) =
            addData(CreditLedgerEntryModel.ofDecrementLedgerEntry(decrementLedgerEntry))

        fun addData(
            expirationChangeLedgerEntry: CreditLedgerEntryModel.ExpirationChangeLedgerEntry
        ) =
            addData(
                CreditLedgerEntryModel.ofExpirationChangeLedgerEntry(expirationChangeLedgerEntry)
            )

        fun addData(blockExpiryLedgerEntry: CreditLedgerEntryModel.CreditBlockExpiryLedgerEntry) =
            addData(CreditLedgerEntryModel.ofBlockExpiryLedgerEntry(blockExpiryLedgerEntry))

        fun addData(voidLedgerEntry: CreditLedgerEntryModel.VoidLedgerEntry) =
            addData(CreditLedgerEntryModel.ofVoidLedgerEntry(voidLedgerEntry))

        fun addData(voidInitiatedLedgerEntry: CreditLedgerEntryModel.VoidInitiatedLedgerEntry) =
            addData(CreditLedgerEntryModel.ofVoidInitiatedLedgerEntry(voidInitiatedLedgerEntry))

        fun addData(amendmentLedgerEntry: CreditLedgerEntryModel.AmendmentLedgerEntry) =
            addData(CreditLedgerEntryModel.ofAmendmentLedgerEntry(amendmentLedgerEntry))

        fun paginationMetadata(paginationMetadata: PaginationMetadata) =
            paginationMetadata(JsonField.of(paginationMetadata))

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

        fun build(): CreditLedgerEntriesModel =
            CreditLedgerEntriesModel(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("paginationMetadata", paginationMetadata),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditLedgerEntriesModel && data == other.data && paginationMetadata == other.paginationMetadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, paginationMetadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditLedgerEntriesModel{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"
}
