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
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

/**
 * This endpoint can be used to clear scheduled updates to the quantity for a fixed
 * fee.
 *
 * If there are no updates scheduled, a request validation error will be returned
 * with a 400 status code.
 */
class SubscriptionUnscheduleFixedFeeQuantityUpdatesParams private constructor(
    private val subscriptionId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,

) : Params {

    fun subscriptionId(): String = subscriptionId

    /** Price for which the updates should be cleared. Must be a fixed fee. */
    fun priceId(): String = body.priceId()

    /** Price for which the updates should be cleared. Must be a fixed fee. */
    fun _priceId(): JsonField<String> = body._priceId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
      return when (index) {
          0 -> subscriptionId
          else -> ""
      }
    }

    @NoAutoDetect
    class Body @JsonCreator private constructor(
        @JsonProperty("price_id") @ExcludeMissing private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        /** Price for which the updates should be cleared. Must be a fixed fee. */
        fun priceId(): String = priceId.getRequired("price_id")

        /** Price for which the updates should be cleared. Must be a fixed fee. */
        @JsonProperty("price_id")
        @ExcludeMissing
        fun _priceId(): JsonField<String> = priceId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body =
            apply {
                if (validated) {
                  return@apply
                }

                priceId()
                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             *
             * ```kotlin
             * .priceId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var priceId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) =
                apply {
                    priceId = body.priceId
                    additionalProperties = body.additionalProperties.toMutableMap()
                }

            /** Price for which the updates should be cleared. Must be a fixed fee. */
            fun priceId(priceId: String) = priceId(JsonField.of(priceId))

            /** Price for which the updates should be cleared. Must be a fixed fee. */
            fun priceId(priceId: JsonField<String>) =
                apply {
                    this.priceId = priceId
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

            fun putAdditionalProperty(key: String, value: JsonValue) =
                apply {
                    additionalProperties.put(key, value)
                }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                apply {
                    this.additionalProperties.putAll(additionalProperties)
                }

            fun removeAdditionalProperty(key: String) =
                apply {
                    additionalProperties.remove(key)
                }

            fun removeAllAdditionalProperties(keys: Set<String>) =
                apply {
                    keys.forEach(::removeAdditionalProperty)
                }

            fun build(): Body =
                Body(
                  checkRequired(
                    "priceId", priceId
                  ), additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Body && priceId == other.priceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(priceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Body{priceId=$priceId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionUnscheduleFixedFeeQuantityUpdatesParams].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .subscriptionId()
         * .priceId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionUnscheduleFixedFeeQuantityUpdatesParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionUnscheduleFixedFeeQuantityUpdatesParams: SubscriptionUnscheduleFixedFeeQuantityUpdatesParams) =
            apply {
                subscriptionId = subscriptionUnscheduleFixedFeeQuantityUpdatesParams.subscriptionId
                body = subscriptionUnscheduleFixedFeeQuantityUpdatesParams.body.toBuilder()
                additionalHeaders = subscriptionUnscheduleFixedFeeQuantityUpdatesParams.additionalHeaders.toBuilder()
                additionalQueryParams = subscriptionUnscheduleFixedFeeQuantityUpdatesParams.additionalQueryParams.toBuilder()
            }

        fun subscriptionId(subscriptionId: String) =
            apply {
                this.subscriptionId = subscriptionId
            }

        /** Price for which the updates should be cleared. Must be a fixed fee. */
        fun priceId(priceId: String) =
            apply {
                body.priceId(priceId)
            }

        /** Price for which the updates should be cleared. Must be a fixed fee. */
        fun priceId(priceId: JsonField<String>) =
            apply {
                body.priceId(priceId)
            }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.additionalProperties(additionalBodyProperties)
            }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) =
            apply {
                body.putAdditionalProperty(
                  key, value
                )
            }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) =
            apply {
                body.removeAdditionalProperty(key)
            }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) =
            apply {
                body.removeAllAdditionalProperties(keys)
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

        fun build(): SubscriptionUnscheduleFixedFeeQuantityUpdatesParams =
            SubscriptionUnscheduleFixedFeeQuantityUpdatesParams(
              checkRequired(
                "subscriptionId", subscriptionId
              ),
              body.build(),
              additionalHeaders.build(),
              additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is SubscriptionUnscheduleFixedFeeQuantityUpdatesParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() = "SubscriptionUnscheduleFixedFeeQuantityUpdatesParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
