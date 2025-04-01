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
import com.withorb.api.services.blocking.CreditNoteService
import java.util.Collections
import java.util.Objects

/**
 * Get a paginated list of CreditNotes. Users can also filter by customer_id, subscription_id, or
 * external_customer_id. The credit notes will be returned in reverse chronological order by
 * `creation_time`.
 */
class CreditNoteListPage
private constructor(
    private val creditNotesService: CreditNoteService,
    private val params: CreditNoteListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<CreditNote> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteListPage && creditNotesService == other.creditNotesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(creditNotesService, params, response) /* spotless:on */

    override fun toString() =
        "CreditNoteListPage{creditNotesService=$creditNotesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return paginationMetadata().nextCursor() != null
    }

    fun getNextPageParams(): CreditNoteListParams? {
        if (!hasNextPage()) {
            return null
        }

        return CreditNoteListParams.builder()
            .from(params)
            .apply { paginationMetadata().nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    fun getNextPage(): CreditNoteListPage? {
        return getNextPageParams()?.let { creditNotesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            creditNotesService: CreditNoteService,
            params: CreditNoteListParams,
            response: Response,
        ) = CreditNoteListPage(creditNotesService, params, response)
    }

    class Response(
        private val data: JsonField<List<CreditNote>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") data: JsonField<List<CreditNote>> = JsonMissing.of(),
            @JsonProperty("pagination_metadata")
            paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        ) : this(data, paginationMetadata, mutableMapOf())

        fun data(): List<CreditNote> = data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata =
            paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data") fun _data(): JsonField<List<CreditNote>>? = data

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

            /** Returns a mutable builder for constructing an instance of [CreditNoteListPage]. */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CreditNote>> = JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CreditNote>) = data(JsonField.of(data))

            fun data(data: JsonField<List<CreditNote>>) = apply { this.data = data }

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

    class AutoPager(private val firstPage: CreditNoteListPage) : Sequence<CreditNote> {

        override fun iterator(): Iterator<CreditNote> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
