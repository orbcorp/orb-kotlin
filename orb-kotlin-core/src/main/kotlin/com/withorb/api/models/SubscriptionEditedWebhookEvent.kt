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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Issued when a subscription is updated. */
class SubscriptionEditedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val properties: JsonField<Properties>,
    private val subscription: JsonField<Subscription>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<Subscription> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, createdAt, properties, subscription, type, mutableMapOf())

    /**
     * The ID of this webhook event.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The time at which this event was created, to the second.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * A [subscription](/core-concepts#subscription) represents the purchase of a plan by a
     * customer.
     *
     * By default, subscriptions begin on the day that they're created and renew automatically for
     * each billing cycle at the cadence that's configured in the plan definition.
     *
     * Subscriptions also default to **beginning of month alignment**, which means the first invoice
     * issued for the subscription will have pro-rated charges between the `start_date` and the
     * first of the following month. Subsequent billing periods will always start and end on a month
     * boundary (e.g. subsequent month starts for monthly billing).
     *
     * Depending on the plan configuration, any _flat_ recurring fees will be billed either at the
     * beginning (in-advance) or end (in-arrears) of each billing cycle. Plans default to
     * **in-advance billing**. Usage-based fees are billed in arrears as usage is accumulated. In
     * the normal course of events, you can expect an invoice to contain usage-based charges for the
     * previous period, and a recurring fee for the following period.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscription(): Subscription = subscription.getRequired("subscription")

    /**
     * The event this payload describes.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<Subscription> = subscription

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionEditedWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .properties()
         * .subscription()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionEditedWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var properties: JsonField<Properties>? = null
        private var subscription: JsonField<Subscription>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionEditedWebhookEvent: SubscriptionEditedWebhookEvent) = apply {
            id = subscriptionEditedWebhookEvent.id
            createdAt = subscriptionEditedWebhookEvent.createdAt
            properties = subscriptionEditedWebhookEvent.properties
            subscription = subscriptionEditedWebhookEvent.subscription
            type = subscriptionEditedWebhookEvent.type
            additionalProperties =
                subscriptionEditedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The ID of this webhook event. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time at which this event was created, to the second. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        /**
         * A [subscription](/core-concepts#subscription) represents the purchase of a plan by a
         * customer.
         *
         * By default, subscriptions begin on the day that they're created and renew automatically
         * for each billing cycle at the cadence that's configured in the plan definition.
         *
         * Subscriptions also default to **beginning of month alignment**, which means the first
         * invoice issued for the subscription will have pro-rated charges between the `start_date`
         * and the first of the following month. Subsequent billing periods will always start and
         * end on a month boundary (e.g. subsequent month starts for monthly billing).
         *
         * Depending on the plan configuration, any _flat_ recurring fees will be billed either at
         * the beginning (in-advance) or end (in-arrears) of each billing cycle. Plans default to
         * **in-advance billing**. Usage-based fees are billed in arrears as usage is accumulated.
         * In the normal course of events, you can expect an invoice to contain usage-based charges
         * for the previous period, and a recurring fee for the following period.
         */
        fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

        /**
         * Sets [Builder.subscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscription] with a well-typed [Subscription] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** The event this payload describes. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [SubscriptionEditedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .properties()
         * .subscription()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionEditedWebhookEvent =
            SubscriptionEditedWebhookEvent(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("properties", properties),
                checkRequired("subscription", subscription),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws OrbInvalidDataException if any value type in this object doesn't match its expected
     *   type.
     */
    fun validate(): SubscriptionEditedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        properties().validate()
        subscription().validate()
        type().validate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (properties.asKnown()?.validity() ?: 0) +
            (subscription.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0)

    class Properties
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val previousAttributes: JsonField<PreviousAttributes>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("previous_attributes")
            @ExcludeMissing
            previousAttributes: JsonField<PreviousAttributes> = JsonMissing.of()
        ) : this(previousAttributes, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun previousAttributes(): PreviousAttributes =
            previousAttributes.getRequired("previous_attributes")

        /**
         * Returns the raw JSON value of [previousAttributes].
         *
         * Unlike [previousAttributes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("previous_attributes")
        @ExcludeMissing
        fun _previousAttributes(): JsonField<PreviousAttributes> = previousAttributes

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

            /**
             * Returns a mutable builder for constructing an instance of [Properties].
             *
             * The following fields are required:
             * ```kotlin
             * .previousAttributes()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var previousAttributes: JsonField<PreviousAttributes>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(properties: Properties) = apply {
                previousAttributes = properties.previousAttributes
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

            fun previousAttributes(previousAttributes: PreviousAttributes) =
                previousAttributes(JsonField.of(previousAttributes))

            /**
             * Sets [Builder.previousAttributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousAttributes] with a well-typed
             * [PreviousAttributes] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun previousAttributes(previousAttributes: JsonField<PreviousAttributes>) = apply {
                this.previousAttributes = previousAttributes
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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .previousAttributes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Properties =
                Properties(
                    checkRequired("previousAttributes", previousAttributes),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Properties = apply {
            if (validated) {
                return@apply
            }

            previousAttributes().validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = (previousAttributes.asKnown()?.validity() ?: 0)

        class PreviousAttributes
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val autoCollection: JsonField<Boolean>,
            private val autoIssuance: JsonField<Boolean>,
            private val defaultInvoiceMemo: JsonField<String>,
            private val invoicingThreshold: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val netTerms: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auto_collection")
                @ExcludeMissing
                autoCollection: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("auto_issuance")
                @ExcludeMissing
                autoIssuance: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("default_invoice_memo")
                @ExcludeMissing
                defaultInvoiceMemo: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoicing_threshold")
                @ExcludeMissing
                invoicingThreshold: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("net_terms")
                @ExcludeMissing
                netTerms: JsonField<Long> = JsonMissing.of(),
            ) : this(
                autoCollection,
                autoIssuance,
                defaultInvoiceMemo,
                invoicingThreshold,
                metadata,
                netTerms,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun autoIssuance(): Boolean? = autoIssuance.getNullable("auto_issuance")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun defaultInvoiceMemo(): String? =
                defaultInvoiceMemo.getNullable("default_invoice_memo")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun invoicingThreshold(): String? =
                invoicingThreshold.getNullable("invoicing_threshold")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun netTerms(): Long? = netTerms.getNullable("net_terms")

            /**
             * Returns the raw JSON value of [autoCollection].
             *
             * Unlike [autoCollection], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("auto_collection")
            @ExcludeMissing
            fun _autoCollection(): JsonField<Boolean> = autoCollection

            /**
             * Returns the raw JSON value of [autoIssuance].
             *
             * Unlike [autoIssuance], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auto_issuance")
            @ExcludeMissing
            fun _autoIssuance(): JsonField<Boolean> = autoIssuance

            /**
             * Returns the raw JSON value of [defaultInvoiceMemo].
             *
             * Unlike [defaultInvoiceMemo], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("default_invoice_memo")
            @ExcludeMissing
            fun _defaultInvoiceMemo(): JsonField<String> = defaultInvoiceMemo

            /**
             * Returns the raw JSON value of [invoicingThreshold].
             *
             * Unlike [invoicingThreshold], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoicing_threshold")
            @ExcludeMissing
            fun _invoicingThreshold(): JsonField<String> = invoicingThreshold

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [netTerms].
             *
             * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

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

                /**
                 * Returns a mutable builder for constructing an instance of [PreviousAttributes].
                 */
                fun builder() = Builder()
            }

            /** A builder for [PreviousAttributes]. */
            class Builder internal constructor() {

                private var autoCollection: JsonField<Boolean> = JsonMissing.of()
                private var autoIssuance: JsonField<Boolean> = JsonMissing.of()
                private var defaultInvoiceMemo: JsonField<String> = JsonMissing.of()
                private var invoicingThreshold: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var netTerms: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(previousAttributes: PreviousAttributes) = apply {
                    autoCollection = previousAttributes.autoCollection
                    autoIssuance = previousAttributes.autoIssuance
                    defaultInvoiceMemo = previousAttributes.defaultInvoiceMemo
                    invoicingThreshold = previousAttributes.invoicingThreshold
                    metadata = previousAttributes.metadata
                    netTerms = previousAttributes.netTerms
                    additionalProperties = previousAttributes.additionalProperties.toMutableMap()
                }

                fun autoCollection(autoCollection: Boolean?) =
                    autoCollection(JsonField.ofNullable(autoCollection))

                /**
                 * Alias for [Builder.autoCollection].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun autoCollection(autoCollection: Boolean) =
                    autoCollection(autoCollection as Boolean?)

                /**
                 * Sets [Builder.autoCollection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.autoCollection] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                    this.autoCollection = autoCollection
                }

                fun autoIssuance(autoIssuance: Boolean?) =
                    autoIssuance(JsonField.ofNullable(autoIssuance))

                /**
                 * Alias for [Builder.autoIssuance].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun autoIssuance(autoIssuance: Boolean) = autoIssuance(autoIssuance as Boolean?)

                /**
                 * Sets [Builder.autoIssuance] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.autoIssuance] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun autoIssuance(autoIssuance: JsonField<Boolean>) = apply {
                    this.autoIssuance = autoIssuance
                }

                fun defaultInvoiceMemo(defaultInvoiceMemo: String?) =
                    defaultInvoiceMemo(JsonField.ofNullable(defaultInvoiceMemo))

                /**
                 * Sets [Builder.defaultInvoiceMemo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defaultInvoiceMemo] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun defaultInvoiceMemo(defaultInvoiceMemo: JsonField<String>) = apply {
                    this.defaultInvoiceMemo = defaultInvoiceMemo
                }

                fun invoicingThreshold(invoicingThreshold: String?) =
                    invoicingThreshold(JsonField.ofNullable(invoicingThreshold))

                /**
                 * Sets [Builder.invoicingThreshold] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicingThreshold] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoicingThreshold(invoicingThreshold: JsonField<String>) = apply {
                    this.invoicingThreshold = invoicingThreshold
                }

                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun netTerms(netTerms: Long?) = netTerms(JsonField.ofNullable(netTerms))

                /**
                 * Alias for [Builder.netTerms].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

                /**
                 * Sets [Builder.netTerms] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.netTerms] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PreviousAttributes].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PreviousAttributes =
                    PreviousAttributes(
                        autoCollection,
                        autoIssuance,
                        defaultInvoiceMemo,
                        invoicingThreshold,
                        metadata,
                        netTerms,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PreviousAttributes = apply {
                if (validated) {
                    return@apply
                }

                autoCollection()
                autoIssuance()
                defaultInvoiceMemo()
                invoicingThreshold()
                metadata()?.validate()
                netTerms()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (autoCollection.asKnown() == null) 0 else 1) +
                    (if (autoIssuance.asKnown() == null) 0 else 1) +
                    (if (defaultInvoiceMemo.asKnown() == null) 0 else 1) +
                    (if (invoicingThreshold.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (netTerms.asKnown() == null) 0 else 1)

            class Metadata
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Metadata]. */
                    fun builder() = Builder()
                }

                /** A builder for [Metadata]. */
                class Builder internal constructor() {

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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Metadata].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Metadata = Metadata(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Metadata = apply {
                    if (validated) {
                        return@apply
                    }

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
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metadata && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PreviousAttributes &&
                    autoCollection == other.autoCollection &&
                    autoIssuance == other.autoIssuance &&
                    defaultInvoiceMemo == other.defaultInvoiceMemo &&
                    invoicingThreshold == other.invoicingThreshold &&
                    metadata == other.metadata &&
                    netTerms == other.netTerms &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    autoCollection,
                    autoIssuance,
                    defaultInvoiceMemo,
                    invoicingThreshold,
                    metadata,
                    netTerms,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PreviousAttributes{autoCollection=$autoCollection, autoIssuance=$autoIssuance, defaultInvoiceMemo=$defaultInvoiceMemo, invoicingThreshold=$invoicingThreshold, metadata=$metadata, netTerms=$netTerms, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties &&
                previousAttributes == other.previousAttributes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(previousAttributes, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Properties{previousAttributes=$previousAttributes, additionalProperties=$additionalProperties}"
    }

    /** The event this payload describes. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SUBSCRIPTION_EDITED = of("subscription.edited")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SUBSCRIPTION_EDITED
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUBSCRIPTION_EDITED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SUBSCRIPTION_EDITED -> Value.SUBSCRIPTION_EDITED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                SUBSCRIPTION_EDITED -> Known.SUBSCRIPTION_EDITED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws OrbInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionEditedWebhookEvent &&
            id == other.id &&
            createdAt == other.createdAt &&
            properties == other.properties &&
            subscription == other.subscription &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, properties, subscription, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionEditedWebhookEvent{id=$id, createdAt=$createdAt, properties=$properties, subscription=$subscription, type=$type, additionalProperties=$additionalProperties}"
}
