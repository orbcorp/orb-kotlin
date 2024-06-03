// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.services.blocking.customers.credits.TopUpService
import java.util.Objects

class CustomerCreditTopUpListByExternalIdPage
private constructor(
    private val topUpsService: TopUpService,
    private val params: CustomerCreditTopUpListByExternalIdParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun data(): List<CustomerCreditTopUpListByExternalIdResponse> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreditTopUpListByExternalIdPage &&
            this.topUpsService == other.topUpsService &&
            this.params == other.params &&
            this.response == other.response
    }

    override fun hashCode(): Int {
        return Objects.hash(
            topUpsService,
            params,
            response,
        )
    }

    override fun toString() =
        "CustomerCreditTopUpListByExternalIdPage{topUpsService=$topUpsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return paginationMetadata().nextCursor() != null
    }

    fun getNextPageParams(): CustomerCreditTopUpListByExternalIdParams? {
        if (!hasNextPage()) {
            return null
        }

        return CustomerCreditTopUpListByExternalIdParams.builder()
            .from(params)
            .apply { paginationMetadata().nextCursor()?.let { this.cursor(it) } }
            .build()
    }

    fun getNextPage(): CustomerCreditTopUpListByExternalIdPage? {
        return getNextPageParams()?.let { topUpsService.listByExternalId(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            topUpsService: TopUpService,
            params: CustomerCreditTopUpListByExternalIdParams,
            response: Response
        ) =
            CustomerCreditTopUpListByExternalIdPage(
                topUpsService,
                params,
                response,
            )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response
    constructor(
        private val data: JsonField<List<CustomerCreditTopUpListByExternalIdResponse>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<CustomerCreditTopUpListByExternalIdResponse> =
            data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata =
            paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): JsonField<List<CustomerCreditTopUpListByExternalIdResponse>>? = data

        @JsonProperty("pagination_metadata")
        fun _paginationMetadata(): JsonField<PaginationMetadata>? = paginationMetadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Response = apply {
            if (!validated) {
                data().map { it.validate() }
                paginationMetadata().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Response &&
                this.data == other.data &&
                this.paginationMetadata == other.paginationMetadata &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            return Objects.hash(
                data,
                paginationMetadata,
                additionalProperties,
            )
        }

        override fun toString() =
            "CustomerCreditTopUpListByExternalIdPage.Response{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<CustomerCreditTopUpListByExternalIdResponse>> =
                JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<CustomerCreditTopUpListByExternalIdResponse>) =
                data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<CustomerCreditTopUpListByExternalIdResponse>>) = apply {
                this.data = data
            }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) =
                paginationMetadata(JsonField.of(paginationMetadata))

            @JsonProperty("pagination_metadata")
            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
                this.paginationMetadata = paginationMetadata
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() =
                Response(
                    data,
                    paginationMetadata,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class AutoPager
    constructor(
        private val firstPage: CustomerCreditTopUpListByExternalIdPage,
    ) : Sequence<CustomerCreditTopUpListByExternalIdResponse> {

        override fun iterator(): Iterator<CustomerCreditTopUpListByExternalIdResponse> = iterator {
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
