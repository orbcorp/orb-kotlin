// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.Spliterator
import java.util.Spliterators
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonField
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.models.SubscriptionFetchScheduleResponse
import com.withorb.api.services.blocking.SubscriptionService

class SubscriptionFetchSchedulePage private constructor(private val subscriptionsService: SubscriptionService, private val params: SubscriptionFetchScheduleParams, private val response: Response, ) {

    fun response(): Response = response

    fun data(): List<SubscriptionFetchScheduleResponse> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SubscriptionFetchSchedulePage &&
          this.subscriptionsService == other.subscriptionsService &&
          this.params == other.params &&
          this.response == other.response
    }

    override fun hashCode(): Int {
      return Objects.hash(
          subscriptionsService,
          params,
          response,
      )
    }

    override fun toString() = "SubscriptionFetchSchedulePage{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return paginationMetadata().nextCursor() != null
    }

    fun getNextPageParams(): SubscriptionFetchScheduleParams? {
      if (!hasNextPage()) {
        return null
      }

      return SubscriptionFetchScheduleParams.builder().from(params).apply {paginationMetadata().nextCursor()?.let{ this.cursor(it) } }.build()
    }

    fun getNextPage(): SubscriptionFetchSchedulePage? {
      return getNextPageParams()?.let {
          subscriptionsService.fetchSchedule(it)
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(subscriptionsService: SubscriptionService, params: SubscriptionFetchScheduleParams, response: Response) = SubscriptionFetchSchedulePage(
            subscriptionsService,
            params,
            response,
        )
    }

    @JsonDeserialize(builder = Response.Builder::class)
    @NoAutoDetect
    class Response constructor(private val data: JsonField<List<SubscriptionFetchScheduleResponse>>, private val paginationMetadata: JsonField<PaginationMetadata>, private val additionalProperties: Map<String, JsonValue>, ) {

        private var validated: Boolean = false

        fun data(): List<SubscriptionFetchScheduleResponse> = data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata = paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): JsonField<List<SubscriptionFetchScheduleResponse>>? = data

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

        override fun toString() = "SubscriptionFetchSchedulePage.Response{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<SubscriptionFetchScheduleResponse>> = JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) = apply {
                this.data = page.data
                this.paginationMetadata = page.paginationMetadata
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun data(data: List<SubscriptionFetchScheduleResponse>) = data(JsonField.of(data))

            @JsonProperty("data")
            fun data(data: JsonField<List<SubscriptionFetchScheduleResponse>>) = apply { this.data = data }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) = paginationMetadata(JsonField.of(paginationMetadata))

            @JsonProperty("pagination_metadata")
            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply { this.paginationMetadata = paginationMetadata }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(
                data,
                paginationMetadata,
                additionalProperties.toUnmodifiable(),
            )
        }
    }

    class AutoPager constructor(private val firstPage: SubscriptionFetchSchedulePage, ) : Sequence<SubscriptionFetchScheduleResponse> {

        override fun iterator(): Iterator<SubscriptionFetchScheduleResponse> = iterator {
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
