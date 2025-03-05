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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class PlanMinifiedModel
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("external_plan_id")
    @ExcludeMissing
    private val externalPlanId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String? = id.getNullable("id")

    /**
     * An optional user-defined ID for this plan resource, used throughout the system as an alias
     * for this Plan. Use this field to identify a plan by an existing identifier in your system.
     */
    fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

    fun name(): String? = name.getNullable("name")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * An optional user-defined ID for this plan resource, used throughout the system as an alias
     * for this Plan. Use this field to identify a plan by an existing identifier in your system.
     */
    @JsonProperty("external_plan_id")
    @ExcludeMissing
    fun _externalPlanId(): JsonField<String> = externalPlanId

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PlanMinifiedModel = apply {
        if (validated) {
            return@apply
        }

        id()
        externalPlanId()
        name()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PlanMinifiedModel].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .externalPlanId()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanMinifiedModel]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var externalPlanId: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(planMinifiedModel: PlanMinifiedModel) = apply {
            id = planMinifiedModel.id
            externalPlanId = planMinifiedModel.externalPlanId
            name = planMinifiedModel.name
            additionalProperties = planMinifiedModel.additionalProperties.toMutableMap()
        }

        fun id(id: String?) = id(JsonField.ofNullable(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(externalPlanId: String?) =
            externalPlanId(JsonField.ofNullable(externalPlanId))

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(externalPlanId: JsonField<String>) = apply {
            this.externalPlanId = externalPlanId
        }

        fun name(name: String?) = name(JsonField.ofNullable(name))

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

        fun build(): PlanMinifiedModel =
            PlanMinifiedModel(
                checkRequired("id", id),
                checkRequired("externalPlanId", externalPlanId),
                checkRequired("name", name),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanMinifiedModel && id == other.id && externalPlanId == other.externalPlanId && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, externalPlanId, name, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanMinifiedModel{id=$id, externalPlanId=$externalPlanId, name=$name, additionalProperties=$additionalProperties}"
}
