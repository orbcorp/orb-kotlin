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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.models
import com.withorb.api.services.async.PlanServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * This endpoint returns a list of all [plans](/core-concepts#plan-and-price) for
 * an account in a list format. The list of plans is ordered starting from the most
 * recently created plan. The response also includes
 * [`pagination_metadata`](/api-reference/pagination), which lets the caller
 * retrieve the next page of results if they exist.
 */
class PlanListPageAsync private constructor(
    private val plansService: PlanServiceAsync,
    private val params: PlanListParams,
    private val response: Response,

) {

    fun response(): Response = response

    fun data(): List<Plan> = response().data()

    fun paginationMetadata(): PaginationMetadata = response().paginationMetadata()

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is PlanListPageAsync && plansService == other.plansService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(plansService, params, response) /* spotless:on */

    override fun toString() = "PlanListPageAsync{plansService=$plansService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
      if (data().isEmpty()) {
        return false;
      }

      return paginationMetadata().nextCursor() != null
    }

    fun getNextPageParams(): PlanListParams? {
      if (!hasNextPage()) {
        return null
      }

      return PlanListParams.builder().from(params).apply {paginationMetadata().nextCursor()?.let{ this.cursor(it) } }.build()
    }

    suspend fun getNextPage(): PlanListPageAsync? {
      return getNextPageParams()?.let {
          plansService.list(it)
      }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(plansService: PlanServiceAsync, params: PlanListParams, response: Response) =
            PlanListPageAsync(
              plansService,
              params,
              response,
            )
    }

    @NoAutoDetect
    class Response @JsonCreator constructor(
        @JsonProperty("data") private val data: JsonField<List<Plan>> = JsonMissing.of(),
        @JsonProperty("pagination_metadata") private val paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        fun data(): List<Plan> = data.getNullable("data") ?: listOf()

        fun paginationMetadata(): PaginationMetadata = paginationMetadata.getRequired("pagination_metadata")

        @JsonProperty("data")
        fun _data(): JsonField<List<Plan>>? = data

        @JsonProperty("pagination_metadata")
        fun _paginationMetadata(): JsonField<PaginationMetadata>? = paginationMetadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response =
            apply {
                if (validated) {
                  return@apply
                }

                data().map { it.validate() }
                paginationMetadata().validate()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Response && data == other.data && paginationMetadata == other.paginationMetadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(data, paginationMetadata, additionalProperties) /* spotless:on */

        override fun toString() = "Response{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"

        companion object {

            /** Returns a mutable builder for constructing an instance of [PlanListPageAsync]. */
            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Plan>> = JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(page: Response) =
                apply {
                    this.data = page.data
                    this.paginationMetadata = page.paginationMetadata
                    this.additionalProperties.putAll(page.additionalProperties)
                }

            fun data(data: List<Plan>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Plan>>) = apply { this.data = data }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) = paginationMetadata(JsonField.of(paginationMetadata))

            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply { this.paginationMetadata = paginationMetadata }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    this.additionalProperties.put(key, value)
                }

            fun build() =
                Response(
                  data,
                  paginationMetadata,
                  additionalProperties.toImmutable(),
                )
        }
    }

    class AutoPager(
        private val firstPage: PlanListPageAsync,

    ) : Flow<Plan> {

        override suspend fun collect(collector: FlowCollector<Plan>) {
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
