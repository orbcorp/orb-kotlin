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
class PriceEvaluateResponse @JsonCreator private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<List<EvaluatePriceGroup>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    fun data(): List<EvaluatePriceGroup> = data.getRequired("data")

    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<EvaluatePriceGroup>> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PriceEvaluateResponse =
        apply {
            if (validated) {
              return@apply
            }

            data().forEach { it.validate() }
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PriceEvaluateResponse].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PriceEvaluateResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<EvaluatePriceGroup>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(priceEvaluateResponse: PriceEvaluateResponse) =
            apply {
                data = priceEvaluateResponse.data.map { it.toMutableList() }
                additionalProperties = priceEvaluateResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<EvaluatePriceGroup>) = data(JsonField.of(data))

        fun data(data: JsonField<List<EvaluatePriceGroup>>) =
            apply {
                this.data = data.map { it.toMutableList() }
            }

        fun addData(data: EvaluatePriceGroup) =
            apply {
                this.data = (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
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

        fun build(): PriceEvaluateResponse =
            PriceEvaluateResponse(
              checkRequired(
                "data", data
              ).map { it.toImmutable() }, additionalProperties.toImmutable()
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is PriceEvaluateResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "PriceEvaluateResponse{data=$data, additionalProperties=$additionalProperties}"
}
