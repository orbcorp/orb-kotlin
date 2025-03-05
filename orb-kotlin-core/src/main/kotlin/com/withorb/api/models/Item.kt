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
import java.time.OffsetDateTime
import java.util.Objects

/**
 * The Item resource represents a sellable product or good. Items are associated with all line
 * items, billable metrics, and prices and are used for defining external sync behavior for invoices
 * and tax calculation purposes.
 */
@NoAutoDetect
class Item
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("external_connections")
    @ExcludeMissing
    private val externalConnections: JsonField<List<ItemExternalConnectionModel>> =
        JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun externalConnections(): List<ItemExternalConnectionModel> =
        externalConnections.getRequired("external_connections")

    fun name(): String = name.getRequired("name")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("external_connections")
    @ExcludeMissing
    fun _externalConnections(): JsonField<List<ItemExternalConnectionModel>> = externalConnections

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Item = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        externalConnections().forEach { it.validate() }
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Item].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .externalConnections()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Item]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var externalConnections: JsonField<MutableList<ItemExternalConnectionModel>>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(item: Item) = apply {
            id = item.id
            createdAt = item.createdAt
            externalConnections = item.externalConnections.map { it.toMutableList() }
            name = item.name
            additionalProperties = item.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun externalConnections(externalConnections: List<ItemExternalConnectionModel>) =
            externalConnections(JsonField.of(externalConnections))

        fun externalConnections(externalConnections: JsonField<List<ItemExternalConnectionModel>>) =
            apply {
                this.externalConnections = externalConnections.map { it.toMutableList() }
            }

        fun addExternalConnection(externalConnection: ItemExternalConnectionModel) = apply {
            externalConnections =
                (externalConnections ?: JsonField.of(mutableListOf())).also {
                    checkKnown("externalConnections", it).add(externalConnection)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

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

        fun build(): Item =
            Item(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("externalConnections", externalConnections).map { it.toImmutable() },
                checkRequired("name", name),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Item && id == other.id && createdAt == other.createdAt && externalConnections == other.externalConnections && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, externalConnections, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Item{id=$id, createdAt=$createdAt, externalConnections=$externalConnections, name=$name, additionalProperties=$additionalProperties}"
}
