// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

class DimensionalPriceGroupCreateParams
constructor(
    private val billableMetricId: String,
    private val dimensions: List<String>,
    private val name: String,
    private val externalDimensionalPriceGroupId: String?,
    private val metadata: Metadata?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun billableMetricId(): String = billableMetricId

    fun dimensions(): List<String> = dimensions

    fun name(): String = name

    fun externalDimensionalPriceGroupId(): String? = externalDimensionalPriceGroupId

    fun metadata(): Metadata? = metadata

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): DimensionalPriceGroupCreateBody {
        return DimensionalPriceGroupCreateBody(
            billableMetricId,
            dimensions,
            name,
            externalDimensionalPriceGroupId,
            metadata,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class DimensionalPriceGroupCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("billable_metric_id") private val billableMetricId: String,
        @JsonProperty("dimensions") private val dimensions: List<String>,
        @JsonProperty("name") private val name: String,
        @JsonProperty("external_dimensional_price_group_id")
        private val externalDimensionalPriceGroupId: String?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("billable_metric_id") fun billableMetricId(): String = billableMetricId

        /** The set of keys (in order) used to disambiguate prices in the group. */
        @JsonProperty("dimensions") fun dimensions(): List<String> = dimensions

        @JsonProperty("name") fun name(): String = name

        @JsonProperty("external_dimensional_price_group_id")
        fun externalDimensionalPriceGroupId(): String? = externalDimensionalPriceGroupId

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var billableMetricId: String? = null
            private var dimensions: List<String>? = null
            private var name: String? = null
            private var externalDimensionalPriceGroupId: String? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(dimensionalPriceGroupCreateBody: DimensionalPriceGroupCreateBody) =
                apply {
                    billableMetricId = dimensionalPriceGroupCreateBody.billableMetricId
                    dimensions = dimensionalPriceGroupCreateBody.dimensions.toMutableList()
                    name = dimensionalPriceGroupCreateBody.name
                    externalDimensionalPriceGroupId =
                        dimensionalPriceGroupCreateBody.externalDimensionalPriceGroupId
                    metadata = dimensionalPriceGroupCreateBody.metadata
                    additionalProperties =
                        dimensionalPriceGroupCreateBody.additionalProperties.toMutableMap()
                }

            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The set of keys (in order) used to disambiguate prices in the group. */
            fun dimensions(dimensions: List<String>) = apply { this.dimensions = dimensions }

            fun name(name: String) = apply { this.name = name }

            fun externalDimensionalPriceGroupId(externalDimensionalPriceGroupId: String?) = apply {
                this.externalDimensionalPriceGroupId = externalDimensionalPriceGroupId
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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

            fun build(): DimensionalPriceGroupCreateBody =
                DimensionalPriceGroupCreateBody(
                    checkNotNull(billableMetricId) {
                        "`billableMetricId` is required but was not set"
                    },
                    checkNotNull(dimensions) { "`dimensions` is required but was not set" }
                        .toImmutable(),
                    checkNotNull(name) { "`name` is required but was not set" },
                    externalDimensionalPriceGroupId,
                    metadata,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DimensionalPriceGroupCreateBody && billableMetricId == other.billableMetricId && dimensions == other.dimensions && name == other.name && externalDimensionalPriceGroupId == other.externalDimensionalPriceGroupId && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billableMetricId, dimensions, name, externalDimensionalPriceGroupId, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DimensionalPriceGroupCreateBody{billableMetricId=$billableMetricId, dimensions=$dimensions, name=$name, externalDimensionalPriceGroupId=$externalDimensionalPriceGroupId, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var billableMetricId: String? = null
        private var dimensions: MutableList<String> = mutableListOf()
        private var name: String? = null
        private var externalDimensionalPriceGroupId: String? = null
        private var metadata: Metadata? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(dimensionalPriceGroupCreateParams: DimensionalPriceGroupCreateParams) =
            apply {
                billableMetricId = dimensionalPriceGroupCreateParams.billableMetricId
                dimensions = dimensionalPriceGroupCreateParams.dimensions.toMutableList()
                name = dimensionalPriceGroupCreateParams.name
                externalDimensionalPriceGroupId =
                    dimensionalPriceGroupCreateParams.externalDimensionalPriceGroupId
                metadata = dimensionalPriceGroupCreateParams.metadata
                additionalHeaders = dimensionalPriceGroupCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dimensionalPriceGroupCreateParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    dimensionalPriceGroupCreateParams.additionalBodyProperties.toMutableMap()
            }

        fun billableMetricId(billableMetricId: String) = apply {
            this.billableMetricId = billableMetricId
        }

        /** The set of keys (in order) used to disambiguate prices in the group. */
        fun dimensions(dimensions: List<String>) = apply {
            this.dimensions.clear()
            this.dimensions.addAll(dimensions)
        }

        /** The set of keys (in order) used to disambiguate prices in the group. */
        fun addDimension(dimension: String) = apply { this.dimensions.add(dimension) }

        fun name(name: String) = apply { this.name = name }

        fun externalDimensionalPriceGroupId(externalDimensionalPriceGroupId: String) = apply {
            this.externalDimensionalPriceGroupId = externalDimensionalPriceGroupId
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): DimensionalPriceGroupCreateParams =
            DimensionalPriceGroupCreateParams(
                checkNotNull(billableMetricId) { "`billableMetricId` is required but was not set" },
                dimensions.toImmutable(),
                checkNotNull(name) { "`name` is required but was not set" },
                externalDimensionalPriceGroupId,
                metadata,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DimensionalPriceGroupCreateParams && billableMetricId == other.billableMetricId && dimensions == other.dimensions && name == other.name && externalDimensionalPriceGroupId == other.externalDimensionalPriceGroupId && metadata == other.metadata && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(billableMetricId, dimensions, name, externalDimensionalPriceGroupId, metadata, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "DimensionalPriceGroupCreateParams{billableMetricId=$billableMetricId, dimensions=$dimensions, name=$name, externalDimensionalPriceGroupId=$externalDimensionalPriceGroupId, metadata=$metadata, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
