// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

/**
 * The Metric resource represents a calculation of a quantity based on events. Metrics are defined
 * by the query that transforms raw usage events into meaningful values for your customers.
 */
@JsonDeserialize(builder = MetricListResponse.Builder::class)
@NoAutoDetect
class MetricListResponse
private constructor(
    private val metadata: JsonField<Metadata>,
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val status: JsonField<Status>,
    private val item: JsonField<Item>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun id(): String = id.getRequired("id")

    fun name(): String = name.getRequired("name")

    fun description(): String? = description.getNullable("description")

    fun status(): Status = status.getRequired("status")

    /**
     * The Item resource represents a sellable product or good. Items are associated with all line
     * items, billable metrics, and prices and are used for defining external sync behavior for
     * invoices and tax calculation purposes.
     */
    fun item(): Item = item.getRequired("item")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The Item resource represents a sellable product or good. Items are associated with all line
     * items, billable metrics, and prices and are used for defining external sync behavior for
     * invoices and tax calculation purposes.
     */
    @JsonProperty("item") @ExcludeMissing fun _item() = item

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): MetricListResponse = apply {
        if (!validated) {
            metadata().validate()
            id()
            name()
            description()
            status()
            item().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MetricListResponse &&
            this.metadata == other.metadata &&
            this.id == other.id &&
            this.name == other.name &&
            this.description == other.description &&
            this.status == other.status &&
            this.item == other.item &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    metadata,
                    id,
                    name,
                    description,
                    status,
                    item,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "MetricListResponse{metadata=$metadata, id=$id, name=$name, description=$description, status=$status, item=$item, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var item: JsonField<Item> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(metricListResponse: MetricListResponse) = apply {
            this.metadata = metricListResponse.metadata
            this.id = metricListResponse.id
            this.name = metricListResponse.name
            this.description = metricListResponse.description
            this.status = metricListResponse.status
            this.item = metricListResponse.item
            additionalProperties(metricListResponse.additionalProperties)
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The Item resource represents a sellable product or good. Items are associated with all
         * line items, billable metrics, and prices and are used for defining external sync behavior
         * for invoices and tax calculation purposes.
         */
        fun item(item: Item) = item(JsonField.of(item))

        /**
         * The Item resource represents a sellable product or good. Items are associated with all
         * line items, billable metrics, and prices and are used for defining external sync behavior
         * for invoices and tax calculation purposes.
         */
        @JsonProperty("item")
        @ExcludeMissing
        fun item(item: JsonField<Item>) = apply { this.item = item }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): MetricListResponse =
            MetricListResponse(
                metadata,
                id,
                name,
                description,
                status,
                item,
                additionalProperties.toUnmodifiable(),
            )
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(additionalProperties)
            }
            return hashCode
        }

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = Status(JsonField.of("active"))

            val DRAFT = Status(JsonField.of("draft"))

            val ARCHIVED = Status(JsonField.of("archived"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DRAFT,
            ARCHIVED,
        }

        enum class Value {
            ACTIVE,
            DRAFT,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DRAFT -> Value.DRAFT
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DRAFT -> Known.DRAFT
                ARCHIVED -> Known.ARCHIVED
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
