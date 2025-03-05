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
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.util.Objects

@NoAutoDetect
class CustomerHierarchyConfigModel
@JsonCreator
private constructor(
    @JsonProperty("child_customer_ids")
    @ExcludeMissing
    private val childCustomerIds: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("parent_customer_id")
    @ExcludeMissing
    private val parentCustomerId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A list of child customer IDs to add to the hierarchy. The desired child customers must not
     * already be part of another hierarchy.
     */
    fun childCustomerIds(): List<String>? = childCustomerIds.getNullable("child_customer_ids")

    /**
     * The ID of the parent customer in the hierarchy. The desired parent customer must not be a
     * child of another customer.
     */
    fun parentCustomerId(): String? = parentCustomerId.getNullable("parent_customer_id")

    /**
     * A list of child customer IDs to add to the hierarchy. The desired child customers must not
     * already be part of another hierarchy.
     */
    @JsonProperty("child_customer_ids")
    @ExcludeMissing
    fun _childCustomerIds(): JsonField<List<String>> = childCustomerIds

    /**
     * The ID of the parent customer in the hierarchy. The desired parent customer must not be a
     * child of another customer.
     */
    @JsonProperty("parent_customer_id")
    @ExcludeMissing
    fun _parentCustomerId(): JsonField<String> = parentCustomerId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CustomerHierarchyConfigModel = apply {
        if (validated) {
            return@apply
        }

        childCustomerIds()
        parentCustomerId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerHierarchyConfigModel].
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerHierarchyConfigModel]. */
    class Builder internal constructor() {

        private var childCustomerIds: JsonField<MutableList<String>>? = null
        private var parentCustomerId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerHierarchyConfigModel: CustomerHierarchyConfigModel) = apply {
            childCustomerIds =
                customerHierarchyConfigModel.childCustomerIds.map { it.toMutableList() }
            parentCustomerId = customerHierarchyConfigModel.parentCustomerId
            additionalProperties = customerHierarchyConfigModel.additionalProperties.toMutableMap()
        }

        /**
         * A list of child customer IDs to add to the hierarchy. The desired child customers must
         * not already be part of another hierarchy.
         */
        fun childCustomerIds(childCustomerIds: List<String>) =
            childCustomerIds(JsonField.of(childCustomerIds))

        /**
         * A list of child customer IDs to add to the hierarchy. The desired child customers must
         * not already be part of another hierarchy.
         */
        fun childCustomerIds(childCustomerIds: JsonField<List<String>>) = apply {
            this.childCustomerIds = childCustomerIds.map { it.toMutableList() }
        }

        /**
         * A list of child customer IDs to add to the hierarchy. The desired child customers must
         * not already be part of another hierarchy.
         */
        fun addChildCustomerId(childCustomerId: String) = apply {
            childCustomerIds =
                (childCustomerIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("childCustomerIds", it).add(childCustomerId)
                }
        }

        /**
         * The ID of the parent customer in the hierarchy. The desired parent customer must not be a
         * child of another customer.
         */
        fun parentCustomerId(parentCustomerId: String?) =
            parentCustomerId(JsonField.ofNullable(parentCustomerId))

        /**
         * The ID of the parent customer in the hierarchy. The desired parent customer must not be a
         * child of another customer.
         */
        fun parentCustomerId(parentCustomerId: JsonField<String>) = apply {
            this.parentCustomerId = parentCustomerId
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

        fun build(): CustomerHierarchyConfigModel =
            CustomerHierarchyConfigModel(
                (childCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                parentCustomerId,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerHierarchyConfigModel && childCustomerIds == other.childCustomerIds && parentCustomerId == other.parentCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(childCustomerIds, parentCustomerId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerHierarchyConfigModel{childCustomerIds=$childCustomerIds, parentCustomerId=$parentCustomerId, additionalProperties=$additionalProperties}"
}
