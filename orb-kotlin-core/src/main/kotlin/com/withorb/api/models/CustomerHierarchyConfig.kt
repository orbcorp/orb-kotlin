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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class CustomerHierarchyConfig
private constructor(
    private val childCustomerIds: JsonField<List<String>>,
    private val parentCustomerId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("child_customer_ids")
        @ExcludeMissing
        childCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("parent_customer_id")
        @ExcludeMissing
        parentCustomerId: JsonField<String> = JsonMissing.of(),
    ) : this(childCustomerIds, parentCustomerId, mutableMapOf())

    /**
     * A list of child customer IDs to add to the hierarchy. The desired child customers must not
     * already be part of another hierarchy.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun childCustomerIds(): List<String>? = childCustomerIds.getNullable("child_customer_ids")

    /**
     * The ID of the parent customer in the hierarchy. The desired parent customer must not be a
     * child of another customer.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun parentCustomerId(): String? = parentCustomerId.getNullable("parent_customer_id")

    /**
     * Returns the raw JSON value of [childCustomerIds].
     *
     * Unlike [childCustomerIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("child_customer_ids")
    @ExcludeMissing
    fun _childCustomerIds(): JsonField<List<String>> = childCustomerIds

    /**
     * Returns the raw JSON value of [parentCustomerId].
     *
     * Unlike [parentCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("parent_customer_id")
    @ExcludeMissing
    fun _parentCustomerId(): JsonField<String> = parentCustomerId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [CustomerHierarchyConfig]. */
        fun builder() = Builder()
    }

    /** A builder for [CustomerHierarchyConfig]. */
    class Builder internal constructor() {

        private var childCustomerIds: JsonField<MutableList<String>>? = null
        private var parentCustomerId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerHierarchyConfig: CustomerHierarchyConfig) = apply {
            childCustomerIds = customerHierarchyConfig.childCustomerIds.map { it.toMutableList() }
            parentCustomerId = customerHierarchyConfig.parentCustomerId
            additionalProperties = customerHierarchyConfig.additionalProperties.toMutableMap()
        }

        /**
         * A list of child customer IDs to add to the hierarchy. The desired child customers must
         * not already be part of another hierarchy.
         */
        fun childCustomerIds(childCustomerIds: List<String>) =
            childCustomerIds(JsonField.of(childCustomerIds))

        /**
         * Sets [Builder.childCustomerIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.childCustomerIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun childCustomerIds(childCustomerIds: JsonField<List<String>>) = apply {
            this.childCustomerIds = childCustomerIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [childCustomerIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
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
         * Sets [Builder.parentCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        /**
         * Returns an immutable instance of [CustomerHierarchyConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CustomerHierarchyConfig =
            CustomerHierarchyConfig(
                (childCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                parentCustomerId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerHierarchyConfig = apply {
        if (validated) {
            return@apply
        }

        childCustomerIds()
        parentCustomerId()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: OrbInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (childCustomerIds.asKnown()?.size ?: 0) + (if (parentCustomerId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerHierarchyConfig && childCustomerIds == other.childCustomerIds && parentCustomerId == other.parentCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(childCustomerIds, parentCustomerId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerHierarchyConfig{childCustomerIds=$childCustomerIds, parentCustomerId=$parentCustomerId, additionalProperties=$additionalProperties}"
}
