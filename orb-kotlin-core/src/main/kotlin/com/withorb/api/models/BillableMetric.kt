// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

/**
 * The Metric resource represents a calculation of a quantity based on events.
 * Metrics are defined by the query that transforms raw usage events into
 * meaningful values for your customers.
 */
@NoAutoDetect
class BillableMetric @JsonCreator private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description") @ExcludeMissing private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("item") @ExcludeMissing private val item: JsonField<Item> = JsonMissing.of(),
    @JsonProperty("metadata") @ExcludeMissing private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status") @ExcludeMissing private val status: JsonField<Status> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

) {

    fun id(): String = id.getRequired("id")

    fun description(): String? = description.getNullable("description")

    /**
     * The Item resource represents a sellable product or good. Items are associated
     * with all line items, billable metrics, and prices and are used for defining
     * external sync behavior for invoices and tax calculation purposes.
     */
    fun item(): Item = item.getRequired("item")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults
     * to an empty dictionary. Individual keys can be removed by setting the value to
     * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun name(): String = name.getRequired("name")

    fun status(): Status = status.getRequired("status")

    @JsonProperty("id")
    @ExcludeMissing
    fun _id(): JsonField<String> = id

    @JsonProperty("description")
    @ExcludeMissing
    fun _description(): JsonField<String> = description

    /**
     * The Item resource represents a sellable product or good. Items are associated
     * with all line items, billable metrics, and prices and are used for defining
     * external sync behavior for invoices and tax calculation purposes.
     */
    @JsonProperty("item")
    @ExcludeMissing
    fun _item(): JsonField<Item> = item

    /**
     * User specified key-value pairs for the resource. If not present, this defaults
     * to an empty dictionary. Individual keys can be removed by setting the value to
     * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @JsonProperty("metadata")
    @ExcludeMissing
    fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("name")
    @ExcludeMissing
    fun _name(): JsonField<String> = name

    @JsonProperty("status")
    @ExcludeMissing
    fun _status(): JsonField<Status> = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): BillableMetric =
        apply {
            if (validated) {
              return@apply
            }

            id()
            description()
            item().validate()
            metadata().validate()
            name()
            status()
            validated = true
        }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BillableMetric].
         *
         * The following fields are required:
         *
         * ```kotlin
         * .id()
         * .description()
         * .item()
         * .metadata()
         * .name()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BillableMetric]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var description: JsonField<String>? = null
        private var item: JsonField<Item>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(billableMetric: BillableMetric) =
            apply {
                id = billableMetric.id
                description = billableMetric.description
                item = billableMetric.item
                metadata = billableMetric.metadata
                name = billableMetric.name
                status = billableMetric.status
                additionalProperties = billableMetric.additionalProperties.toMutableMap()
            }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) =
            apply {
                this.id = id
            }

        fun description(description: String?) = description(JsonField.ofNullable(description))

        fun description(description: JsonField<String>) =
            apply {
                this.description = description
            }

        /**
         * The Item resource represents a sellable product or good. Items are associated
         * with all line items, billable metrics, and prices and are used for defining
         * external sync behavior for invoices and tax calculation purposes.
         */
        fun item(item: Item) = item(JsonField.of(item))

        /**
         * The Item resource represents a sellable product or good. Items are associated
         * with all line items, billable metrics, and prices and are used for defining
         * external sync behavior for invoices and tax calculation purposes.
         */
        fun item(item: JsonField<Item>) =
            apply {
                this.item = item
            }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults
         * to an empty dictionary. Individual keys can be removed by setting the value to
         * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
         * `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults
         * to an empty dictionary. Individual keys can be removed by setting the value to
         * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
         * `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) =
            apply {
                this.metadata = metadata
            }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) =
            apply {
                this.name = name
            }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) =
            apply {
                this.status = status
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

        fun build(): BillableMetric =
            BillableMetric(
              checkRequired(
                "id", id
              ),
              checkRequired(
                "description", description
              ),
              checkRequired(
                "item", item
              ),
              checkRequired(
                "metadata", metadata
              ),
              checkRequired(
                "name", name
              ),
              checkRequired(
                "status", status
              ),
              additionalProperties.toImmutable(),
            )
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults
     * to an empty dictionary. Individual keys can be removed by setting the value to
     * `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @NoAutoDetect
    class Metadata @JsonCreator private constructor(
        @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),

    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata =
            apply {
                if (validated) {
                  return@apply
                }

                validated = true
            }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) =
                apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
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

    class Status @JsonCreator private constructor(
        private val value: JsonField<String>,

    ) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that
         * doesn't match any known member, and you want to know that value. For example, if
         * the SDK is on an older version than the API, then the API may respond with new
         * members that the SDK is unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("active")

            val DRAFT = of("draft")

            val ARCHIVED = of("archived")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            DRAFT,
            ARCHIVED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         *
         * - It was deserialized from data that doesn't match any known member. For
         *   example, if the SDK is on an older version than the API, then the API may
         *   respond with new members that the SDK is unaware of.
         *
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            DRAFT,
            ARCHIVED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or
         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if
         * you want to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DRAFT -> Value.DRAFT
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and
         * don't want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known
         * member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DRAFT -> Known.DRAFT
                ARCHIVED -> Known.ARCHIVED
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for
         * debugging and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the
         * expected primitive type.
         */
        fun asString(): String = _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return /* spotless:off */ other is BillableMetric && id == other.id && description == other.description && item == other.item && metadata == other.metadata && name == other.name && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, description, item, metadata, name, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() = "BillableMetric{id=$id, description=$description, item=$item, metadata=$metadata, name=$name, status=$status, additionalProperties=$additionalProperties}"
}
