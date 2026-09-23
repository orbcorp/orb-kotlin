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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Issued when a billable metric in a subscription exceeds a pre-configured quantity threshold. */
class SubscriptionUsageExceededWebhookEvent
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
         * [SubscriptionUsageExceededWebhookEvent].
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

    /** A builder for [SubscriptionUsageExceededWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var properties: JsonField<Properties>? = null
        private var subscription: JsonField<Subscription>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            subscriptionUsageExceededWebhookEvent: SubscriptionUsageExceededWebhookEvent
        ) = apply {
            id = subscriptionUsageExceededWebhookEvent.id
            createdAt = subscriptionUsageExceededWebhookEvent.createdAt
            properties = subscriptionUsageExceededWebhookEvent.properties
            subscription = subscriptionUsageExceededWebhookEvent.subscription
            type = subscriptionUsageExceededWebhookEvent.type
            additionalProperties =
                subscriptionUsageExceededWebhookEvent.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SubscriptionUsageExceededWebhookEvent].
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
        fun build(): SubscriptionUsageExceededWebhookEvent =
            SubscriptionUsageExceededWebhookEvent(
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
    fun validate(): SubscriptionUsageExceededWebhookEvent = apply {
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
        private val alertConfiguration: JsonField<AlertConfiguration>,
        private val billableMetricId: JsonField<String>,
        private val evaluatedQuantity: JsonField<Double>,
        private val quantityThreshold: JsonField<Double>,
        private val timeframeEnd: JsonField<OffsetDateTime>,
        private val timeframeStart: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alert_configuration")
            @ExcludeMissing
            alertConfiguration: JsonField<AlertConfiguration> = JsonMissing.of(),
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            billableMetricId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("evaluated_quantity")
            @ExcludeMissing
            evaluatedQuantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("quantity_threshold")
            @ExcludeMissing
            quantityThreshold: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("timeframe_end")
            @ExcludeMissing
            timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("timeframe_start")
            @ExcludeMissing
            timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            alertConfiguration,
            billableMetricId,
            evaluatedQuantity,
            quantityThreshold,
            timeframeEnd,
            timeframeStart,
            mutableMapOf(),
        )

        /**
         * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or
         * credit balance and trigger webhooks when a threshold is exceeded.
         *
         * Alerts created through the API can be scoped to either customers or subscriptions.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun alertConfiguration(): AlertConfiguration =
            alertConfiguration.getRequired("alert_configuration")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billableMetricId(): String = billableMetricId.getRequired("billable_metric_id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun evaluatedQuantity(): Double? = evaluatedQuantity.getNullable("evaluated_quantity")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun quantityThreshold(): Double? = quantityThreshold.getNullable("quantity_threshold")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

        /**
         * Returns the raw JSON value of [alertConfiguration].
         *
         * Unlike [alertConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("alert_configuration")
        @ExcludeMissing
        fun _alertConfiguration(): JsonField<AlertConfiguration> = alertConfiguration

        /**
         * Returns the raw JSON value of [billableMetricId].
         *
         * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        /**
         * Returns the raw JSON value of [evaluatedQuantity].
         *
         * Unlike [evaluatedQuantity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("evaluated_quantity")
        @ExcludeMissing
        fun _evaluatedQuantity(): JsonField<Double> = evaluatedQuantity

        /**
         * Returns the raw JSON value of [quantityThreshold].
         *
         * Unlike [quantityThreshold], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("quantity_threshold")
        @ExcludeMissing
        fun _quantityThreshold(): JsonField<Double> = quantityThreshold

        /**
         * Returns the raw JSON value of [timeframeEnd].
         *
         * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeframe_end")
        @ExcludeMissing
        fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

        /**
         * Returns the raw JSON value of [timeframeStart].
         *
         * Unlike [timeframeStart], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("timeframe_start")
        @ExcludeMissing
        fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

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
             * .alertConfiguration()
             * .billableMetricId()
             * .evaluatedQuantity()
             * .quantityThreshold()
             * .timeframeEnd()
             * .timeframeStart()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var alertConfiguration: JsonField<AlertConfiguration>? = null
            private var billableMetricId: JsonField<String>? = null
            private var evaluatedQuantity: JsonField<Double>? = null
            private var quantityThreshold: JsonField<Double>? = null
            private var timeframeEnd: JsonField<OffsetDateTime>? = null
            private var timeframeStart: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(properties: Properties) = apply {
                alertConfiguration = properties.alertConfiguration
                billableMetricId = properties.billableMetricId
                evaluatedQuantity = properties.evaluatedQuantity
                quantityThreshold = properties.quantityThreshold
                timeframeEnd = properties.timeframeEnd
                timeframeStart = properties.timeframeStart
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

            /**
             * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or
             * credit balance and trigger webhooks when a threshold is exceeded.
             *
             * Alerts created through the API can be scoped to either customers or subscriptions.
             */
            fun alertConfiguration(alertConfiguration: AlertConfiguration) =
                alertConfiguration(JsonField.of(alertConfiguration))

            /**
             * Sets [Builder.alertConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alertConfiguration] with a well-typed
             * [AlertConfiguration] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun alertConfiguration(alertConfiguration: JsonField<AlertConfiguration>) = apply {
                this.alertConfiguration = alertConfiguration
            }

            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            /**
             * Sets [Builder.billableMetricId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billableMetricId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            fun evaluatedQuantity(evaluatedQuantity: Double?) =
                evaluatedQuantity(JsonField.ofNullable(evaluatedQuantity))

            /**
             * Alias for [Builder.evaluatedQuantity].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun evaluatedQuantity(evaluatedQuantity: Double) =
                evaluatedQuantity(evaluatedQuantity as Double?)

            /**
             * Sets [Builder.evaluatedQuantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.evaluatedQuantity] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun evaluatedQuantity(evaluatedQuantity: JsonField<Double>) = apply {
                this.evaluatedQuantity = evaluatedQuantity
            }

            fun quantityThreshold(quantityThreshold: Double?) =
                quantityThreshold(JsonField.ofNullable(quantityThreshold))

            /**
             * Alias for [Builder.quantityThreshold].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun quantityThreshold(quantityThreshold: Double) =
                quantityThreshold(quantityThreshold as Double?)

            /**
             * Sets [Builder.quantityThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantityThreshold] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantityThreshold(quantityThreshold: JsonField<Double>) = apply {
                this.quantityThreshold = quantityThreshold
            }

            fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                timeframeEnd(JsonField.of(timeframeEnd))

            /**
             * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframeEnd] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                this.timeframeEnd = timeframeEnd
            }

            fun timeframeStart(timeframeStart: OffsetDateTime) =
                timeframeStart(JsonField.of(timeframeStart))

            /**
             * Sets [Builder.timeframeStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timeframeStart] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                this.timeframeStart = timeframeStart
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
             * .alertConfiguration()
             * .billableMetricId()
             * .evaluatedQuantity()
             * .quantityThreshold()
             * .timeframeEnd()
             * .timeframeStart()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Properties =
                Properties(
                    checkRequired("alertConfiguration", alertConfiguration),
                    checkRequired("billableMetricId", billableMetricId),
                    checkRequired("evaluatedQuantity", evaluatedQuantity),
                    checkRequired("quantityThreshold", quantityThreshold),
                    checkRequired("timeframeEnd", timeframeEnd),
                    checkRequired("timeframeStart", timeframeStart),
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

            alertConfiguration().validate()
            billableMetricId()
            evaluatedQuantity()
            quantityThreshold()
            timeframeEnd()
            timeframeStart()
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
            (alertConfiguration.asKnown()?.validity() ?: 0) +
                (if (billableMetricId.asKnown() == null) 0 else 1) +
                (if (evaluatedQuantity.asKnown() == null) 0 else 1) +
                (if (quantityThreshold.asKnown() == null) 0 else 1) +
                (if (timeframeEnd.asKnown() == null) 0 else 1) +
                (if (timeframeStart.asKnown() == null) 0 else 1)

        /**
         * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or
         * credit balance and trigger webhooks when a threshold is exceeded.
         *
         * Alerts created through the API can be scoped to either customers or subscriptions.
         */
        class AlertConfiguration
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val currency: JsonField<String>,
            private val customer: JsonField<CustomerMinified>,
            private val enabled: JsonField<Boolean>,
            private val metric: JsonField<Metric>,
            private val plan: JsonField<Plan>,
            private val subscription: JsonField<SubscriptionMinified>,
            private val thresholds: JsonField<List<Threshold>>,
            private val type: JsonField<Type>,
            private val balanceAlertStatus: JsonField<List<BalanceAlertStatus>>,
            private val groupingKeys: JsonField<List<String>>,
            private val licenseType: JsonField<LicenseType>,
            private val priceFilters: JsonField<List<PriceFilter>>,
            private val thresholdOverrides: JsonField<List<ThresholdOverride>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer")
                @ExcludeMissing
                customer: JsonField<CustomerMinified> = JsonMissing.of(),
                @JsonProperty("enabled")
                @ExcludeMissing
                enabled: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("metric")
                @ExcludeMissing
                metric: JsonField<Metric> = JsonMissing.of(),
                @JsonProperty("plan") @ExcludeMissing plan: JsonField<Plan> = JsonMissing.of(),
                @JsonProperty("subscription")
                @ExcludeMissing
                subscription: JsonField<SubscriptionMinified> = JsonMissing.of(),
                @JsonProperty("thresholds")
                @ExcludeMissing
                thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("balance_alert_status")
                @ExcludeMissing
                balanceAlertStatus: JsonField<List<BalanceAlertStatus>> = JsonMissing.of(),
                @JsonProperty("grouping_keys")
                @ExcludeMissing
                groupingKeys: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("license_type")
                @ExcludeMissing
                licenseType: JsonField<LicenseType> = JsonMissing.of(),
                @JsonProperty("price_filters")
                @ExcludeMissing
                priceFilters: JsonField<List<PriceFilter>> = JsonMissing.of(),
                @JsonProperty("threshold_overrides")
                @ExcludeMissing
                thresholdOverrides: JsonField<List<ThresholdOverride>> = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                currency,
                customer,
                enabled,
                metric,
                plan,
                subscription,
                thresholds,
                type,
                balanceAlertStatus,
                groupingKeys,
                licenseType,
                priceFilters,
                thresholdOverrides,
                mutableMapOf(),
            )

            /**
             * Also referred to as alert_id in this documentation.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * The creation time of the resource in Orb.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * The name of the currency the credit balance or invoice cost is denominated in.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun currency(): String? = currency.getNullable("currency")

            /**
             * The customer the alert applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun customer(): CustomerMinified? = customer.getNullable("customer")

            /**
             * Whether the alert is enabled or disabled.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun enabled(): Boolean = enabled.getRequired("enabled")

            /**
             * The metric the alert applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metric(): Metric? = metric.getNullable("metric")

            /**
             * The plan the alert applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun plan(): Plan? = plan.getNullable("plan")

            /**
             * The subscription the alert applies to.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun subscription(): SubscriptionMinified? = subscription.getNullable("subscription")

            /**
             * The thresholds that define the conditions under which the alert will be triggered.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun thresholds(): List<Threshold>? = thresholds.getNullable("thresholds")

            /**
             * The type of alert. This must be a valid alert type.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * The current status of the alert. This field is only present for credit balance
             * alerts.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun balanceAlertStatus(): List<BalanceAlertStatus>? =
                balanceAlertStatus.getNullable("balance_alert_status")

            /**
             * The property keys to group cost alerts by. Only present for cost alerts with grouping
             * enabled.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun groupingKeys(): List<String>? = groupingKeys.getNullable("grouping_keys")

            /**
             * Minified license type for alert serialization.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun licenseType(): LicenseType? = licenseType.getNullable("license_type")

            /**
             * Filters scoping which prices are included in spend and grouped cost alert evaluation.
             * Alerts use the price_id, item_id, and price_type fields only; the alert's pricing
             * unit is reported by currency.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun priceFilters(): List<PriceFilter>? = priceFilters.getNullable("price_filters")

            /**
             * Per-group threshold overrides. Each override maps a specific combination of
             * grouping_keys values to a replacement threshold list. Only present for grouped cost
             * alerts that have at least one override.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun thresholdOverrides(): List<ThresholdOverride>? =
                thresholdOverrides.getNullable("threshold_overrides")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            /**
             * Returns the raw JSON value of [customer].
             *
             * Unlike [customer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer")
            @ExcludeMissing
            fun _customer(): JsonField<CustomerMinified> = customer

            /**
             * Returns the raw JSON value of [enabled].
             *
             * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

            /**
             * Returns the raw JSON value of [metric].
             *
             * Unlike [metric], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<Metric> = metric

            /**
             * Returns the raw JSON value of [plan].
             *
             * Unlike [plan], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

            /**
             * Returns the raw JSON value of [subscription].
             *
             * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("subscription")
            @ExcludeMissing
            fun _subscription(): JsonField<SubscriptionMinified> = subscription

            /**
             * Returns the raw JSON value of [thresholds].
             *
             * Unlike [thresholds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("thresholds")
            @ExcludeMissing
            fun _thresholds(): JsonField<List<Threshold>> = thresholds

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [balanceAlertStatus].
             *
             * Unlike [balanceAlertStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("balance_alert_status")
            @ExcludeMissing
            fun _balanceAlertStatus(): JsonField<List<BalanceAlertStatus>> = balanceAlertStatus

            /**
             * Returns the raw JSON value of [groupingKeys].
             *
             * Unlike [groupingKeys], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("grouping_keys")
            @ExcludeMissing
            fun _groupingKeys(): JsonField<List<String>> = groupingKeys

            /**
             * Returns the raw JSON value of [licenseType].
             *
             * Unlike [licenseType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("license_type")
            @ExcludeMissing
            fun _licenseType(): JsonField<LicenseType> = licenseType

            /**
             * Returns the raw JSON value of [priceFilters].
             *
             * Unlike [priceFilters], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("price_filters")
            @ExcludeMissing
            fun _priceFilters(): JsonField<List<PriceFilter>> = priceFilters

            /**
             * Returns the raw JSON value of [thresholdOverrides].
             *
             * Unlike [thresholdOverrides], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("threshold_overrides")
            @ExcludeMissing
            fun _thresholdOverrides(): JsonField<List<ThresholdOverride>> = thresholdOverrides

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
                 * Returns a mutable builder for constructing an instance of [AlertConfiguration].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .createdAt()
                 * .currency()
                 * .customer()
                 * .enabled()
                 * .metric()
                 * .plan()
                 * .subscription()
                 * .thresholds()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AlertConfiguration]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var currency: JsonField<String>? = null
                private var customer: JsonField<CustomerMinified>? = null
                private var enabled: JsonField<Boolean>? = null
                private var metric: JsonField<Metric>? = null
                private var plan: JsonField<Plan>? = null
                private var subscription: JsonField<SubscriptionMinified>? = null
                private var thresholds: JsonField<MutableList<Threshold>>? = null
                private var type: JsonField<Type>? = null
                private var balanceAlertStatus: JsonField<MutableList<BalanceAlertStatus>>? = null
                private var groupingKeys: JsonField<MutableList<String>>? = null
                private var licenseType: JsonField<LicenseType> = JsonMissing.of()
                private var priceFilters: JsonField<MutableList<PriceFilter>>? = null
                private var thresholdOverrides: JsonField<MutableList<ThresholdOverride>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(alertConfiguration: AlertConfiguration) = apply {
                    id = alertConfiguration.id
                    createdAt = alertConfiguration.createdAt
                    currency = alertConfiguration.currency
                    customer = alertConfiguration.customer
                    enabled = alertConfiguration.enabled
                    metric = alertConfiguration.metric
                    plan = alertConfiguration.plan
                    subscription = alertConfiguration.subscription
                    thresholds = alertConfiguration.thresholds.map { it.toMutableList() }
                    type = alertConfiguration.type
                    balanceAlertStatus =
                        alertConfiguration.balanceAlertStatus.map { it.toMutableList() }
                    groupingKeys = alertConfiguration.groupingKeys.map { it.toMutableList() }
                    licenseType = alertConfiguration.licenseType
                    priceFilters = alertConfiguration.priceFilters.map { it.toMutableList() }
                    thresholdOverrides =
                        alertConfiguration.thresholdOverrides.map { it.toMutableList() }
                    additionalProperties = alertConfiguration.additionalProperties.toMutableMap()
                }

                /** Also referred to as alert_id in this documentation. */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The creation time of the resource in Orb. */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /**
                 * The name of the currency the credit balance or invoice cost is denominated in.
                 */
                fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                /** The customer the alert applies to. */
                fun customer(customer: CustomerMinified?) = customer(JsonField.ofNullable(customer))

                /**
                 * Sets [Builder.customer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customer] with a well-typed [CustomerMinified]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customer(customer: JsonField<CustomerMinified>) = apply {
                    this.customer = customer
                }

                /** Whether the alert is enabled or disabled. */
                fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

                /**
                 * Sets [Builder.enabled] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.enabled] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

                /** The metric the alert applies to. */
                fun metric(metric: Metric?) = metric(JsonField.ofNullable(metric))

                /**
                 * Sets [Builder.metric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metric] with a well-typed [Metric] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

                /** The plan the alert applies to. */
                fun plan(plan: Plan?) = plan(JsonField.ofNullable(plan))

                /**
                 * Sets [Builder.plan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.plan] with a well-typed [Plan] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

                /** The subscription the alert applies to. */
                fun subscription(subscription: SubscriptionMinified?) =
                    subscription(JsonField.ofNullable(subscription))

                /**
                 * Sets [Builder.subscription] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subscription] with a well-typed
                 * [SubscriptionMinified] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun subscription(subscription: JsonField<SubscriptionMinified>) = apply {
                    this.subscription = subscription
                }

                /**
                 * The thresholds that define the conditions under which the alert will be
                 * triggered.
                 */
                fun thresholds(thresholds: List<Threshold>?) =
                    thresholds(JsonField.ofNullable(thresholds))

                /**
                 * Sets [Builder.thresholds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thresholds] with a well-typed `List<Threshold>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
                    this.thresholds = thresholds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Threshold] to [thresholds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addThreshold(threshold: Threshold) = apply {
                    thresholds =
                        (thresholds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("thresholds", it).add(threshold)
                        }
                }

                /** The type of alert. This must be a valid alert type. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * The current status of the alert. This field is only present for credit balance
                 * alerts.
                 */
                fun balanceAlertStatus(balanceAlertStatus: List<BalanceAlertStatus>?) =
                    balanceAlertStatus(JsonField.ofNullable(balanceAlertStatus))

                /**
                 * Sets [Builder.balanceAlertStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.balanceAlertStatus] with a well-typed
                 * `List<BalanceAlertStatus>` value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun balanceAlertStatus(balanceAlertStatus: JsonField<List<BalanceAlertStatus>>) =
                    apply {
                        this.balanceAlertStatus = balanceAlertStatus.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [BalanceAlertStatus] to [Builder.balanceAlertStatus].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addBalanceAlertStatus(balanceAlertStatus: BalanceAlertStatus) = apply {
                    this.balanceAlertStatus =
                        (this.balanceAlertStatus ?: JsonField.of(mutableListOf())).also {
                            checkKnown("balanceAlertStatus", it).add(balanceAlertStatus)
                        }
                }

                /**
                 * The property keys to group cost alerts by. Only present for cost alerts with
                 * grouping enabled.
                 */
                fun groupingKeys(groupingKeys: List<String>?) =
                    groupingKeys(JsonField.ofNullable(groupingKeys))

                /**
                 * Sets [Builder.groupingKeys] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.groupingKeys] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun groupingKeys(groupingKeys: JsonField<List<String>>) = apply {
                    this.groupingKeys = groupingKeys.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [groupingKeys].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addGroupingKey(groupingKey: String) = apply {
                    groupingKeys =
                        (groupingKeys ?: JsonField.of(mutableListOf())).also {
                            checkKnown("groupingKeys", it).add(groupingKey)
                        }
                }

                /** Minified license type for alert serialization. */
                fun licenseType(licenseType: LicenseType?) =
                    licenseType(JsonField.ofNullable(licenseType))

                /**
                 * Sets [Builder.licenseType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.licenseType] with a well-typed [LicenseType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun licenseType(licenseType: JsonField<LicenseType>) = apply {
                    this.licenseType = licenseType
                }

                /**
                 * Filters scoping which prices are included in spend and grouped cost alert
                 * evaluation. Alerts use the price_id, item_id, and price_type fields only; the
                 * alert's pricing unit is reported by currency.
                 */
                fun priceFilters(priceFilters: List<PriceFilter>?) =
                    priceFilters(JsonField.ofNullable(priceFilters))

                /**
                 * Sets [Builder.priceFilters] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.priceFilters] with a well-typed
                 * `List<PriceFilter>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun priceFilters(priceFilters: JsonField<List<PriceFilter>>) = apply {
                    this.priceFilters = priceFilters.map { it.toMutableList() }
                }

                /**
                 * Adds a single [PriceFilter] to [priceFilters].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPriceFilter(priceFilter: PriceFilter) = apply {
                    priceFilters =
                        (priceFilters ?: JsonField.of(mutableListOf())).also {
                            checkKnown("priceFilters", it).add(priceFilter)
                        }
                }

                /**
                 * Per-group threshold overrides. Each override maps a specific combination of
                 * grouping_keys values to a replacement threshold list. Only present for grouped
                 * cost alerts that have at least one override.
                 */
                fun thresholdOverrides(thresholdOverrides: List<ThresholdOverride>?) =
                    thresholdOverrides(JsonField.ofNullable(thresholdOverrides))

                /**
                 * Sets [Builder.thresholdOverrides] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.thresholdOverrides] with a well-typed
                 * `List<ThresholdOverride>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun thresholdOverrides(thresholdOverrides: JsonField<List<ThresholdOverride>>) =
                    apply {
                        this.thresholdOverrides = thresholdOverrides.map { it.toMutableList() }
                    }

                /**
                 * Adds a single [ThresholdOverride] to [thresholdOverrides].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addThresholdOverride(thresholdOverride: ThresholdOverride) = apply {
                    thresholdOverrides =
                        (thresholdOverrides ?: JsonField.of(mutableListOf())).also {
                            checkKnown("thresholdOverrides", it).add(thresholdOverride)
                        }
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
                 * Returns an immutable instance of [AlertConfiguration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .createdAt()
                 * .currency()
                 * .customer()
                 * .enabled()
                 * .metric()
                 * .plan()
                 * .subscription()
                 * .thresholds()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AlertConfiguration =
                    AlertConfiguration(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("currency", currency),
                        checkRequired("customer", customer),
                        checkRequired("enabled", enabled),
                        checkRequired("metric", metric),
                        checkRequired("plan", plan),
                        checkRequired("subscription", subscription),
                        checkRequired("thresholds", thresholds).map { it.toImmutable() },
                        checkRequired("type", type),
                        (balanceAlertStatus ?: JsonMissing.of()).map { it.toImmutable() },
                        (groupingKeys ?: JsonMissing.of()).map { it.toImmutable() },
                        licenseType,
                        (priceFilters ?: JsonMissing.of()).map { it.toImmutable() },
                        (thresholdOverrides ?: JsonMissing.of()).map { it.toImmutable() },
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
            fun validate(): AlertConfiguration = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                currency()
                customer()?.validate()
                enabled()
                metric()?.validate()
                plan()?.validate()
                subscription()?.validate()
                thresholds()?.forEach { it.validate() }
                type().validate()
                balanceAlertStatus()?.forEach { it.validate() }
                groupingKeys()
                licenseType()?.validate()
                priceFilters()?.forEach { it.validate() }
                thresholdOverrides()?.forEach { it.validate() }
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
                (if (id.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1) +
                    (customer.asKnown()?.validity() ?: 0) +
                    (if (enabled.asKnown() == null) 0 else 1) +
                    (metric.asKnown()?.validity() ?: 0) +
                    (plan.asKnown()?.validity() ?: 0) +
                    (subscription.asKnown()?.validity() ?: 0) +
                    (thresholds.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (type.asKnown()?.validity() ?: 0) +
                    (balanceAlertStatus.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (groupingKeys.asKnown()?.size ?: 0) +
                    (licenseType.asKnown()?.validity() ?: 0) +
                    (priceFilters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (thresholdOverrides.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

            /** The metric the alert applies to. */
            class Metric
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
                ) : this(id, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                     * Returns a mutable builder for constructing an instance of [Metric].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Metric]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metric: Metric) = apply {
                        id = metric.id
                        additionalProperties = metric.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

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
                     * Returns an immutable instance of [Metric].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Metric =
                        Metric(checkRequired("id", id), additionalProperties.toMutableMap())
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
                fun validate(): Metric = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
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
                internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Metric &&
                        id == other.id &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Metric{id=$id, additionalProperties=$additionalProperties}"
            }

            /** The plan the alert applies to. */
            class Plan
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val externalPlanId: JsonField<String>,
                private val name: JsonField<String>,
                private val planVersion: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("external_plan_id")
                    @ExcludeMissing
                    externalPlanId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("plan_version")
                    @ExcludeMissing
                    planVersion: JsonField<String> = JsonMissing.of(),
                ) : this(id, externalPlanId, name, planVersion, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun id(): String? = id.getNullable("id")

                /**
                 * An optional user-defined ID for this plan resource, used throughout the system as
                 * an alias for this Plan. Use this field to identify a plan by an existing
                 * identifier in your system.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun name(): String? = name.getNullable("name")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun planVersion(): String = planVersion.getRequired("plan_version")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [externalPlanId].
                 *
                 * Unlike [externalPlanId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_plan_id")
                @ExcludeMissing
                fun _externalPlanId(): JsonField<String> = externalPlanId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [planVersion].
                 *
                 * Unlike [planVersion], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("plan_version")
                @ExcludeMissing
                fun _planVersion(): JsonField<String> = planVersion

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
                     * Returns a mutable builder for constructing an instance of [Plan].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .externalPlanId()
                     * .name()
                     * .planVersion()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Plan]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var externalPlanId: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var planVersion: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(plan: Plan) = apply {
                        id = plan.id
                        externalPlanId = plan.externalPlanId
                        name = plan.name
                        planVersion = plan.planVersion
                        additionalProperties = plan.additionalProperties.toMutableMap()
                    }

                    fun id(id: String?) = id(JsonField.ofNullable(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    /**
                     * An optional user-defined ID for this plan resource, used throughout the
                     * system as an alias for this Plan. Use this field to identify a plan by an
                     * existing identifier in your system.
                     */
                    fun externalPlanId(externalPlanId: String?) =
                        externalPlanId(JsonField.ofNullable(externalPlanId))

                    /**
                     * Sets [Builder.externalPlanId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPlanId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                        this.externalPlanId = externalPlanId
                    }

                    fun name(name: String?) = name(JsonField.ofNullable(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun planVersion(planVersion: String) = planVersion(JsonField.of(planVersion))

                    /**
                     * Sets [Builder.planVersion] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.planVersion] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun planVersion(planVersion: JsonField<String>) = apply {
                        this.planVersion = planVersion
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
                     * Returns an immutable instance of [Plan].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .externalPlanId()
                     * .name()
                     * .planVersion()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Plan =
                        Plan(
                            checkRequired("id", id),
                            checkRequired("externalPlanId", externalPlanId),
                            checkRequired("name", name),
                            checkRequired("planVersion", planVersion),
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
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Plan = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    externalPlanId()
                    name()
                    planVersion()
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
                    (if (id.asKnown() == null) 0 else 1) +
                        (if (externalPlanId.asKnown() == null) 0 else 1) +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (planVersion.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Plan &&
                        id == other.id &&
                        externalPlanId == other.externalPlanId &&
                        name == other.name &&
                        planVersion == other.planVersion &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(id, externalPlanId, name, planVersion, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Plan{id=$id, externalPlanId=$externalPlanId, name=$name, planVersion=$planVersion, additionalProperties=$additionalProperties}"
            }

            /**
             * Thresholds are used to define the conditions under which an alert will be triggered.
             */
            class Threshold
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of()
                ) : this(value, mutableMapOf())

                /**
                 * The value at which an alert will fire. For credit balance alerts, the alert will
                 * fire at or below this value. For usage and cost alerts, the alert will fire at or
                 * above this value.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun value(): String = value.getRequired("value")

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                     * Returns a mutable builder for constructing an instance of [Threshold].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .value()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Threshold]. */
                class Builder internal constructor() {

                    private var value: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(threshold: Threshold) = apply {
                        value = threshold.value
                        additionalProperties = threshold.additionalProperties.toMutableMap()
                    }

                    /**
                     * The value at which an alert will fire. For credit balance alerts, the alert
                     * will fire at or below this value. For usage and cost alerts, the alert will
                     * fire at or above this value.
                     */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun value(value: JsonField<String>) = apply { this.value = value }

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
                     * Returns an immutable instance of [Threshold].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .value()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Threshold =
                        Threshold(
                            checkRequired("value", value),
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
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): Threshold = apply {
                    if (validated) {
                        return@apply
                    }

                    value()
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
                internal fun validity(): Int = (if (value.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Threshold &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Threshold{value=$value, additionalProperties=$additionalProperties}"
            }

            /** The type of alert. This must be a valid alert type. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CREDIT_BALANCE_DEPLETED = of("credit_balance_depleted")

                    val CREDIT_BALANCE_DROPPED = of("credit_balance_dropped")

                    val CREDIT_BALANCE_RECOVERED = of("credit_balance_recovered")

                    val USAGE_EXCEEDED = of("usage_exceeded")

                    val COST_EXCEEDED = of("cost_exceeded")

                    val SPEND_EXCEEDED = of("spend_exceeded")

                    val LICENSE_BALANCE_THRESHOLD_REACHED = of("license_balance_threshold_reached")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT_BALANCE_DEPLETED,
                    CREDIT_BALANCE_DROPPED,
                    CREDIT_BALANCE_RECOVERED,
                    USAGE_EXCEEDED,
                    COST_EXCEEDED,
                    SPEND_EXCEEDED,
                    LICENSE_BALANCE_THRESHOLD_REACHED,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREDIT_BALANCE_DEPLETED,
                    CREDIT_BALANCE_DROPPED,
                    CREDIT_BALANCE_RECOVERED,
                    USAGE_EXCEEDED,
                    COST_EXCEEDED,
                    SPEND_EXCEEDED,
                    LICENSE_BALANCE_THRESHOLD_REACHED,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
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
                        CREDIT_BALANCE_DEPLETED -> Value.CREDIT_BALANCE_DEPLETED
                        CREDIT_BALANCE_DROPPED -> Value.CREDIT_BALANCE_DROPPED
                        CREDIT_BALANCE_RECOVERED -> Value.CREDIT_BALANCE_RECOVERED
                        USAGE_EXCEEDED -> Value.USAGE_EXCEEDED
                        COST_EXCEEDED -> Value.COST_EXCEEDED
                        SPEND_EXCEEDED -> Value.SPEND_EXCEEDED
                        LICENSE_BALANCE_THRESHOLD_REACHED -> Value.LICENSE_BALANCE_THRESHOLD_REACHED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        CREDIT_BALANCE_DEPLETED -> Known.CREDIT_BALANCE_DEPLETED
                        CREDIT_BALANCE_DROPPED -> Known.CREDIT_BALANCE_DROPPED
                        CREDIT_BALANCE_RECOVERED -> Known.CREDIT_BALANCE_RECOVERED
                        USAGE_EXCEEDED -> Known.USAGE_EXCEEDED
                        COST_EXCEEDED -> Known.COST_EXCEEDED
                        SPEND_EXCEEDED -> Known.SPEND_EXCEEDED
                        LICENSE_BALANCE_THRESHOLD_REACHED -> Known.LICENSE_BALANCE_THRESHOLD_REACHED
                        else -> throw OrbInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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

            /** Alert status is used to determine if an alert is currently in-alert or not. */
            class BalanceAlertStatus
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val inAlert: JsonField<Boolean>,
                private val thresholdValue: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("in_alert")
                    @ExcludeMissing
                    inAlert: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("threshold_value")
                    @ExcludeMissing
                    thresholdValue: JsonField<String> = JsonMissing.of(),
                ) : this(inAlert, thresholdValue, mutableMapOf())

                /**
                 * Whether the alert is currently in-alert or not.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun inAlert(): Boolean = inAlert.getRequired("in_alert")

                /**
                 * The value of the threshold that defines the alert status.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun thresholdValue(): String = thresholdValue.getRequired("threshold_value")

                /**
                 * Returns the raw JSON value of [inAlert].
                 *
                 * Unlike [inAlert], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("in_alert")
                @ExcludeMissing
                fun _inAlert(): JsonField<Boolean> = inAlert

                /**
                 * Returns the raw JSON value of [thresholdValue].
                 *
                 * Unlike [thresholdValue], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("threshold_value")
                @ExcludeMissing
                fun _thresholdValue(): JsonField<String> = thresholdValue

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
                     * [BalanceAlertStatus].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .inAlert()
                     * .thresholdValue()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [BalanceAlertStatus]. */
                class Builder internal constructor() {

                    private var inAlert: JsonField<Boolean>? = null
                    private var thresholdValue: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(balanceAlertStatus: BalanceAlertStatus) = apply {
                        inAlert = balanceAlertStatus.inAlert
                        thresholdValue = balanceAlertStatus.thresholdValue
                        additionalProperties =
                            balanceAlertStatus.additionalProperties.toMutableMap()
                    }

                    /** Whether the alert is currently in-alert or not. */
                    fun inAlert(inAlert: Boolean) = inAlert(JsonField.of(inAlert))

                    /**
                     * Sets [Builder.inAlert] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.inAlert] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun inAlert(inAlert: JsonField<Boolean>) = apply { this.inAlert = inAlert }

                    /** The value of the threshold that defines the alert status. */
                    fun thresholdValue(thresholdValue: String) =
                        thresholdValue(JsonField.of(thresholdValue))

                    /**
                     * Sets [Builder.thresholdValue] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.thresholdValue] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun thresholdValue(thresholdValue: JsonField<String>) = apply {
                        this.thresholdValue = thresholdValue
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
                     * Returns an immutable instance of [BalanceAlertStatus].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .inAlert()
                     * .thresholdValue()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BalanceAlertStatus =
                        BalanceAlertStatus(
                            checkRequired("inAlert", inAlert),
                            checkRequired("thresholdValue", thresholdValue),
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
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): BalanceAlertStatus = apply {
                    if (validated) {
                        return@apply
                    }

                    inAlert()
                    thresholdValue()
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
                    (if (inAlert.asKnown() == null) 0 else 1) +
                        (if (thresholdValue.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BalanceAlertStatus &&
                        inAlert == other.inAlert &&
                        thresholdValue == other.thresholdValue &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(inAlert, thresholdValue, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BalanceAlertStatus{inAlert=$inAlert, thresholdValue=$thresholdValue, additionalProperties=$additionalProperties}"
            }

            /** Minified license type for alert serialization. */
            class LicenseType
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
                ) : this(id, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

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
                     * Returns a mutable builder for constructing an instance of [LicenseType].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [LicenseType]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(licenseType: LicenseType) = apply {
                        id = licenseType.id
                        additionalProperties = licenseType.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

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
                     * Returns an immutable instance of [LicenseType].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): LicenseType =
                        LicenseType(checkRequired("id", id), additionalProperties.toMutableMap())
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
                fun validate(): LicenseType = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
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
                internal fun validity(): Int = (if (id.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LicenseType &&
                        id == other.id &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LicenseType{id=$id, additionalProperties=$additionalProperties}"
            }

            class PriceFilter
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val field: JsonField<Field>,
                private val operator: JsonField<Operator>,
                private val values: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("field")
                    @ExcludeMissing
                    field: JsonField<Field> = JsonMissing.of(),
                    @JsonProperty("operator")
                    @ExcludeMissing
                    operator: JsonField<Operator> = JsonMissing.of(),
                    @JsonProperty("values")
                    @ExcludeMissing
                    values: JsonField<List<String>> = JsonMissing.of(),
                ) : this(field, operator, values, mutableMapOf())

                /**
                 * The property of the price to filter on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun field(): Field = field.getRequired("field")

                /**
                 * Should prices that match the filter be included or excluded.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun operator(): Operator = operator.getRequired("operator")

                /**
                 * The IDs or values that match this filter.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun values(): List<String> = values.getRequired("values")

                /**
                 * Returns the raw JSON value of [field].
                 *
                 * Unlike [field], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

                /**
                 * Returns the raw JSON value of [operator].
                 *
                 * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("operator")
                @ExcludeMissing
                fun _operator(): JsonField<Operator> = operator

                /**
                 * Returns the raw JSON value of [values].
                 *
                 * Unlike [values], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("values")
                @ExcludeMissing
                fun _values(): JsonField<List<String>> = values

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
                     * Returns a mutable builder for constructing an instance of [PriceFilter].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [PriceFilter]. */
                class Builder internal constructor() {

                    private var field: JsonField<Field>? = null
                    private var operator: JsonField<Operator>? = null
                    private var values: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(priceFilter: PriceFilter) = apply {
                        field = priceFilter.field
                        operator = priceFilter.operator
                        values = priceFilter.values.map { it.toMutableList() }
                        additionalProperties = priceFilter.additionalProperties.toMutableMap()
                    }

                    /** The property of the price to filter on. */
                    fun field(field: Field) = field(JsonField.of(field))

                    /**
                     * Sets [Builder.field] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.field] with a well-typed [Field] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun field(field: JsonField<Field>) = apply { this.field = field }

                    /** Should prices that match the filter be included or excluded. */
                    fun operator(operator: Operator) = operator(JsonField.of(operator))

                    /**
                     * Sets [Builder.operator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.operator] with a well-typed [Operator] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                    /** The IDs or values that match this filter. */
                    fun values(values: List<String>) = values(JsonField.of(values))

                    /**
                     * Sets [Builder.values] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.values] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun values(values: JsonField<List<String>>) = apply {
                        this.values = values.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [values].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addValue(value: String) = apply {
                        values =
                            (values ?: JsonField.of(mutableListOf())).also {
                                checkKnown("values", it).add(value)
                            }
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
                     * Returns an immutable instance of [PriceFilter].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .field()
                     * .operator()
                     * .values()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PriceFilter =
                        PriceFilter(
                            checkRequired("field", field),
                            checkRequired("operator", operator),
                            checkRequired("values", values).map { it.toImmutable() },
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
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): PriceFilter = apply {
                    if (validated) {
                        return@apply
                    }

                    field().validate()
                    operator().validate()
                    values()
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
                    (field.asKnown()?.validity() ?: 0) +
                        (operator.asKnown()?.validity() ?: 0) +
                        (values.asKnown()?.size ?: 0)

                /** The property of the price to filter on. */
                class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val PRICE_ID = of("price_id")

                        val ITEM_ID = of("item_id")

                        val PRICE_TYPE = of("price_type")

                        val CURRENCY = of("currency")

                        val PRICING_UNIT_ID = of("pricing_unit_id")

                        fun of(value: String) = Field(JsonField.of(value))
                    }

                    /** An enum containing [Field]'s known values. */
                    enum class Known {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                    }

                    /**
                     * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Field] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PRICE_ID,
                        ITEM_ID,
                        PRICE_TYPE,
                        CURRENCY,
                        PRICING_UNIT_ID,
                        /**
                         * An enum member indicating that [Field] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            PRICE_ID -> Value.PRICE_ID
                            ITEM_ID -> Value.ITEM_ID
                            PRICE_TYPE -> Value.PRICE_TYPE
                            CURRENCY -> Value.CURRENCY
                            PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            PRICE_ID -> Known.PRICE_ID
                            ITEM_ID -> Known.ITEM_ID
                            PRICE_TYPE -> Known.PRICE_TYPE
                            CURRENCY -> Known.CURRENCY
                            PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                            else -> throw OrbInvalidDataException("Unknown Field: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Field = apply {
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

                        return other is Field && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Should prices that match the filter be included or excluded. */
                class Operator
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val INCLUDES = of("includes")

                        val EXCLUDES = of("excludes")

                        fun of(value: String) = Operator(JsonField.of(value))
                    }

                    /** An enum containing [Operator]'s known values. */
                    enum class Known {
                        INCLUDES,
                        EXCLUDES,
                    }

                    /**
                     * An enum containing [Operator]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Operator] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INCLUDES,
                        EXCLUDES,
                        /**
                         * An enum member indicating that [Operator] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INCLUDES -> Value.INCLUDES
                            EXCLUDES -> Value.EXCLUDES
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INCLUDES -> Known.INCLUDES
                            EXCLUDES -> Known.EXCLUDES
                            else -> throw OrbInvalidDataException("Unknown Operator: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Operator = apply {
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

                        return other is Operator && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PriceFilter &&
                        field == other.field &&
                        operator == other.operator &&
                        values == other.values &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(field, operator, values, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PriceFilter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
            }

            /**
             * A per-group threshold override on a grouped cost alert.
             *
             * An empty `thresholds` list means the group is silenced (never fires). A non-empty
             * list fully replaces the default thresholds for that group.
             */
            class ThresholdOverride
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val groupValues: JsonField<List<String>>,
                private val thresholds: JsonField<List<Threshold>>,
                private val groupKeys: JsonField<List<String>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("group_values")
                    @ExcludeMissing
                    groupValues: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("thresholds")
                    @ExcludeMissing
                    thresholds: JsonField<List<Threshold>> = JsonMissing.of(),
                    @JsonProperty("group_keys")
                    @ExcludeMissing
                    groupKeys: JsonField<List<String>> = JsonMissing.of(),
                ) : this(groupValues, thresholds, groupKeys, mutableMapOf())

                /**
                 * The values identifying this group, ordered to match group_keys when set and the
                 * alert's grouping_keys otherwise.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupValues(): List<String> = groupValues.getRequired("group_values")

                /**
                 * The thresholds applied to this group. An empty list means the group is silenced.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun thresholds(): List<Threshold> = thresholds.getRequired("thresholds")

                /**
                 * The subset of the alert's grouping_keys this override binds. Null when the
                 * override targets one exact group across every grouping key.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun groupKeys(): List<String>? = groupKeys.getNullable("group_keys")

                /**
                 * Returns the raw JSON value of [groupValues].
                 *
                 * Unlike [groupValues], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("group_values")
                @ExcludeMissing
                fun _groupValues(): JsonField<List<String>> = groupValues

                /**
                 * Returns the raw JSON value of [thresholds].
                 *
                 * Unlike [thresholds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("thresholds")
                @ExcludeMissing
                fun _thresholds(): JsonField<List<Threshold>> = thresholds

                /**
                 * Returns the raw JSON value of [groupKeys].
                 *
                 * Unlike [groupKeys], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("group_keys")
                @ExcludeMissing
                fun _groupKeys(): JsonField<List<String>> = groupKeys

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
                     * [ThresholdOverride].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .groupValues()
                     * .thresholds()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [ThresholdOverride]. */
                class Builder internal constructor() {

                    private var groupValues: JsonField<MutableList<String>>? = null
                    private var thresholds: JsonField<MutableList<Threshold>>? = null
                    private var groupKeys: JsonField<MutableList<String>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(thresholdOverride: ThresholdOverride) = apply {
                        groupValues = thresholdOverride.groupValues.map { it.toMutableList() }
                        thresholds = thresholdOverride.thresholds.map { it.toMutableList() }
                        groupKeys = thresholdOverride.groupKeys.map { it.toMutableList() }
                        additionalProperties = thresholdOverride.additionalProperties.toMutableMap()
                    }

                    /**
                     * The values identifying this group, ordered to match group_keys when set and
                     * the alert's grouping_keys otherwise.
                     */
                    fun groupValues(groupValues: List<String>) =
                        groupValues(JsonField.of(groupValues))

                    /**
                     * Sets [Builder.groupValues] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupValues] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun groupValues(groupValues: JsonField<List<String>>) = apply {
                        this.groupValues = groupValues.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [groupValues].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addGroupValue(groupValue: String) = apply {
                        groupValues =
                            (groupValues ?: JsonField.of(mutableListOf())).also {
                                checkKnown("groupValues", it).add(groupValue)
                            }
                    }

                    /**
                     * The thresholds applied to this group. An empty list means the group is
                     * silenced.
                     */
                    fun thresholds(thresholds: List<Threshold>) =
                        thresholds(JsonField.of(thresholds))

                    /**
                     * Sets [Builder.thresholds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.thresholds] with a well-typed
                     * `List<Threshold>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun thresholds(thresholds: JsonField<List<Threshold>>) = apply {
                        this.thresholds = thresholds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Threshold] to [thresholds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addThreshold(threshold: Threshold) = apply {
                        thresholds =
                            (thresholds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("thresholds", it).add(threshold)
                            }
                    }

                    /**
                     * The subset of the alert's grouping_keys this override binds. Null when the
                     * override targets one exact group across every grouping key.
                     */
                    fun groupKeys(groupKeys: List<String>?) =
                        groupKeys(JsonField.ofNullable(groupKeys))

                    /**
                     * Sets [Builder.groupKeys] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupKeys] with a well-typed `List<String>`
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun groupKeys(groupKeys: JsonField<List<String>>) = apply {
                        this.groupKeys = groupKeys.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [groupKeys].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addGroupKey(groupKey: String) = apply {
                        groupKeys =
                            (groupKeys ?: JsonField.of(mutableListOf())).also {
                                checkKnown("groupKeys", it).add(groupKey)
                            }
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
                     * Returns an immutable instance of [ThresholdOverride].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .groupValues()
                     * .thresholds()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ThresholdOverride =
                        ThresholdOverride(
                            checkRequired("groupValues", groupValues).map { it.toImmutable() },
                            checkRequired("thresholds", thresholds).map { it.toImmutable() },
                            (groupKeys ?: JsonMissing.of()).map { it.toImmutable() },
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
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
                fun validate(): ThresholdOverride = apply {
                    if (validated) {
                        return@apply
                    }

                    groupValues()
                    thresholds().forEach { it.validate() }
                    groupKeys()
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
                    (groupValues.asKnown()?.size ?: 0) +
                        (thresholds.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                        (groupKeys.asKnown()?.size ?: 0)

                /**
                 * Thresholds are used to define the conditions under which an alert will be
                 * triggered.
                 */
                class Threshold
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val value: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("value")
                        @ExcludeMissing
                        value: JsonField<String> = JsonMissing.of()
                    ) : this(value, mutableMapOf())

                    /**
                     * The value at which an alert will fire. For credit balance alerts, the alert
                     * will fire at or below this value. For usage and cost alerts, the alert will
                     * fire at or above this value.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun value(): String = value.getRequired("value")

                    /**
                     * Returns the raw JSON value of [value].
                     *
                     * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
                         * Returns a mutable builder for constructing an instance of [Threshold].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .value()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [Threshold]. */
                    class Builder internal constructor() {

                        private var value: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(threshold: Threshold) = apply {
                            value = threshold.value
                            additionalProperties = threshold.additionalProperties.toMutableMap()
                        }

                        /**
                         * The value at which an alert will fire. For credit balance alerts, the
                         * alert will fire at or below this value. For usage and cost alerts, the
                         * alert will fire at or above this value.
                         */
                        fun value(value: String) = value(JsonField.of(value))

                        /**
                         * Sets [Builder.value] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.value] with a well-typed [String] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Threshold].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .value()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): Threshold =
                            Threshold(
                                checkRequired("value", value),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws OrbInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Threshold = apply {
                        if (validated) {
                            return@apply
                        }

                        value()
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
                    internal fun validity(): Int = (if (value.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Threshold &&
                            value == other.value &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(value, additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Threshold{value=$value, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ThresholdOverride &&
                        groupValues == other.groupValues &&
                        thresholds == other.thresholds &&
                        groupKeys == other.groupKeys &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(groupValues, thresholds, groupKeys, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ThresholdOverride{groupValues=$groupValues, thresholds=$thresholds, groupKeys=$groupKeys, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AlertConfiguration &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    currency == other.currency &&
                    customer == other.customer &&
                    enabled == other.enabled &&
                    metric == other.metric &&
                    plan == other.plan &&
                    subscription == other.subscription &&
                    thresholds == other.thresholds &&
                    type == other.type &&
                    balanceAlertStatus == other.balanceAlertStatus &&
                    groupingKeys == other.groupingKeys &&
                    licenseType == other.licenseType &&
                    priceFilters == other.priceFilters &&
                    thresholdOverrides == other.thresholdOverrides &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    createdAt,
                    currency,
                    customer,
                    enabled,
                    metric,
                    plan,
                    subscription,
                    thresholds,
                    type,
                    balanceAlertStatus,
                    groupingKeys,
                    licenseType,
                    priceFilters,
                    thresholdOverrides,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AlertConfiguration{id=$id, createdAt=$createdAt, currency=$currency, customer=$customer, enabled=$enabled, metric=$metric, plan=$plan, subscription=$subscription, thresholds=$thresholds, type=$type, balanceAlertStatus=$balanceAlertStatus, groupingKeys=$groupingKeys, licenseType=$licenseType, priceFilters=$priceFilters, thresholdOverrides=$thresholdOverrides, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties &&
                alertConfiguration == other.alertConfiguration &&
                billableMetricId == other.billableMetricId &&
                evaluatedQuantity == other.evaluatedQuantity &&
                quantityThreshold == other.quantityThreshold &&
                timeframeEnd == other.timeframeEnd &&
                timeframeStart == other.timeframeStart &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                alertConfiguration,
                billableMetricId,
                evaluatedQuantity,
                quantityThreshold,
                timeframeEnd,
                timeframeStart,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Properties{alertConfiguration=$alertConfiguration, billableMetricId=$billableMetricId, evaluatedQuantity=$evaluatedQuantity, quantityThreshold=$quantityThreshold, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalProperties=$additionalProperties}"
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

            val SUBSCRIPTION_USAGE_EXCEEDED = of("subscription.usage_exceeded")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            SUBSCRIPTION_USAGE_EXCEEDED
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
            SUBSCRIPTION_USAGE_EXCEEDED,
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
                SUBSCRIPTION_USAGE_EXCEEDED -> Value.SUBSCRIPTION_USAGE_EXCEEDED
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
                SUBSCRIPTION_USAGE_EXCEEDED -> Known.SUBSCRIPTION_USAGE_EXCEEDED
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

        return other is SubscriptionUsageExceededWebhookEvent &&
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
        "SubscriptionUsageExceededWebhookEvent{id=$id, createdAt=$createdAt, properties=$properties, subscription=$subscription, type=$type, additionalProperties=$additionalProperties}"
}
