// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import java.util.Objects

/**
 * Reverting a backfill undoes all the effects of closing the backfill. If the
 * backfill is reflected, the status will transition to `pending_revert` while the
 * effects of the backfill are undone. Once all effects are undone, the backfill
 * will transition to `reverted`.
 *
 * If a backfill is reverted before its closed, no usage will be updated as a
 * result of the backfill and it will immediately transition to `reverted`.
 */
class EventBackfillRevertParams private constructor(
    private val backfillId: String,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,

) : Params {

    fun backfillId(): String = backfillId

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun _body(): Map<String, JsonValue>? = additionalBodyProperties.ifEmpty { null }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> backfillId
          else -> ""
      }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventBackfillRevertParams].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .backfillId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventBackfillRevertParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var backfillId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventBackfillRevertParams: EventBackfillRevertParams) =
            apply {
                backfillId = eventBackfillRevertParams.backfillId
                additionalHeaders = eventBackfillRevertParams.additionalHeaders.toBuilder()
                additionalQueryParams = eventBackfillRevertParams.additionalQueryParams.toBuilder()
                additionalBodyProperties = eventBackfillRevertParams.additionalBodyProperties.toMutableMap()
            }

        fun backfillId(backfillId: String) =
            apply {
                this.backfillId = backfillId
            }

        fun additionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.clear()
                putAllAdditionalHeaders(additionalHeaders)
            }

        fun putAdditionalHeader(name: String, value: String) =
            apply {
                additionalHeaders.put(name, value)
            }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.put(name, values)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.putAll(additionalHeaders)
            }

        fun replaceAdditionalHeaders(name: String, value: String) =
            apply {
                additionalHeaders.replace(name, value)
            }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) =
            apply {
                additionalHeaders.replace(name, values)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) =
            apply {
                this.additionalHeaders.replaceAll(additionalHeaders)
            }

        fun removeAdditionalHeaders(name: String) =
            apply {
                additionalHeaders.remove(name)
            }

        fun removeAllAdditionalHeaders(names: Set<String>) =
            apply {
                additionalHeaders.removeAll(names)
            }

        fun additionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.clear()
                putAllAdditionalQueryParams(additionalQueryParams)
            }

        fun putAdditionalQueryParam(key: String, value: String) =
            apply {
                additionalQueryParams.put(key, value)
            }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.put(key, values)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) =
            apply {
                additionalQueryParams.replace(key, value)
            }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) =
            apply {
                additionalQueryParams.replace(key, values)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) =
            apply {
                additionalQueryParams.remove(key)
            }

        fun removeAllAdditionalQueryParams(keys: Set<String>) =
            apply {
                additionalQueryParams.removeAll(keys)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.clear()
                putAllAdditionalBodyProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                additionalBodyProperties.put(key, value)
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                additionalBodyProperties.remove(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                keys.forEach(::removeAdditionalBodyProperty)
            }

        fun build(): EventBackfillRevertParams =
            EventBackfillRevertParams(
              checkRequired(
                "backfillId", backfillId
              ),
              additionalHeaders.build(),
              additionalQueryParams.build(),
              additionalBodyProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is EventBackfillRevertParams && backfillId == other.backfillId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(backfillId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() = "EventBackfillRevertParams{backfillId=$backfillId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
