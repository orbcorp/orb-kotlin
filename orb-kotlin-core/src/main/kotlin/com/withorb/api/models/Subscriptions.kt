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
import java.util.Objects

@NoAutoDetect
class Subscriptions
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Subscription>> = JsonMissing.of(),
    @JsonProperty("pagination_metadata")
    @ExcludeMissing
    private val paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Subscription> = data.getRequired("data")

    fun paginationMetadata(): PaginationMetadata =
        paginationMetadata.getRequired("pagination_metadata")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Subscription>> = data

    @JsonProperty("pagination_metadata")
    @ExcludeMissing
    fun _paginationMetadata(): JsonField<PaginationMetadata> = paginationMetadata

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Subscriptions = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        paginationMetadata().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<MutableList<Subscription>>? = null
        private var paginationMetadata: JsonField<PaginationMetadata>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptions: Subscriptions) = apply {
            data = subscriptions.data.map { it.toMutableList() }
            paginationMetadata = subscriptions.paginationMetadata
            additionalProperties = subscriptions.additionalProperties.toMutableMap()
        }

        fun data(data: List<Subscription>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Subscription>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Subscription) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(data)
                }
        }

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

        fun build(): Subscriptions =
            Subscriptions(
                checkNotNull(data) { "`data` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(paginationMetadata) {
                    "`paginationMetadata` is required but was not set"
                },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Subscriptions && data == other.data && paginationMetadata == other.paginationMetadata && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, paginationMetadata, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscriptions{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"
}
