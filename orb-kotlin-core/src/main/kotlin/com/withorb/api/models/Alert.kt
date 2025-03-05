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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * [Alerts within Orb](/product-catalog/configuring-alerts) monitor spending, usage, or credit
 * balance and trigger webhooks when a threshold is exceeded.
 *
 * Alerts created through the API can be scoped to either customers or subscriptions.
 */
@NoAutoDetect
class Alert
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<CustomerMinifiedModel> = JsonMissing.of(),
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("metric")
    @ExcludeMissing
    private val metric: JsonField<Metric> = JsonMissing.of(),
    @JsonProperty("plan") @ExcludeMissing private val plan: JsonField<Plan> = JsonMissing.of(),
    @JsonProperty("subscription")
    @ExcludeMissing
    private val subscription: JsonField<SubscriptionMinifiedModel> = JsonMissing.of(),
    @JsonProperty("thresholds")
    @ExcludeMissing
    private val thresholds: JsonField<List<ThresholdModel>> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Also referred to as alert_id in this documentation. */
    fun id(): String = id.getRequired("id")

    /** The creation time of the resource in Orb. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The name of the currency the credit balance or invoice cost is denominated in. */
    fun currency(): String? = currency.getNullable("currency")

    /** The customer the alert applies to. */
    fun customer(): CustomerMinifiedModel? = customer.getNullable("customer")

    /** Whether the alert is enabled or disabled. */
    fun enabled(): Boolean = enabled.getRequired("enabled")

    /** The metric the alert applies to. */
    fun metric(): Metric? = metric.getNullable("metric")

    /** The plan the alert applies to. */
    fun plan(): Plan? = plan.getNullable("plan")

    /** The subscription the alert applies to. */
    fun subscription(): SubscriptionMinifiedModel? = subscription.getNullable("subscription")

    /** The thresholds that define the conditions under which the alert will be triggered. */
    fun thresholds(): List<ThresholdModel>? = thresholds.getNullable("thresholds")

    /** The type of alert. This must be a valid alert type. */
    fun type(): Type = type.getRequired("type")

    /** Also referred to as alert_id in this documentation. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The creation time of the resource in Orb. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The name of the currency the credit balance or invoice cost is denominated in. */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /** The customer the alert applies to. */
    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerMinifiedModel> = customer

    /** Whether the alert is enabled or disabled. */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /** The metric the alert applies to. */
    @JsonProperty("metric") @ExcludeMissing fun _metric(): JsonField<Metric> = metric

    /** The plan the alert applies to. */
    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<Plan> = plan

    /** The subscription the alert applies to. */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<SubscriptionMinifiedModel> = subscription

    /** The thresholds that define the conditions under which the alert will be triggered. */
    @JsonProperty("thresholds")
    @ExcludeMissing
    fun _thresholds(): JsonField<List<ThresholdModel>> = thresholds

    /** The type of alert. This must be a valid alert type. */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Alert = apply {
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
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Alert].
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

    /** A builder for [Alert]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var customer: JsonField<CustomerMinifiedModel>? = null
        private var enabled: JsonField<Boolean>? = null
        private var metric: JsonField<Metric>? = null
        private var plan: JsonField<Plan>? = null
        private var subscription: JsonField<SubscriptionMinifiedModel>? = null
        private var thresholds: JsonField<MutableList<ThresholdModel>>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(alert: Alert) = apply {
            id = alert.id
            createdAt = alert.createdAt
            currency = alert.currency
            customer = alert.customer
            enabled = alert.enabled
            metric = alert.metric
            plan = alert.plan
            subscription = alert.subscription
            thresholds = alert.thresholds.map { it.toMutableList() }
            type = alert.type
            additionalProperties = alert.additionalProperties.toMutableMap()
        }

        /** Also referred to as alert_id in this documentation. */
        fun id(id: String) = id(JsonField.of(id))

        /** Also referred to as alert_id in this documentation. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        /** The name of the currency the credit balance or invoice cost is denominated in. */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The customer the alert applies to. */
        fun customer(customer: CustomerMinifiedModel?) = customer(JsonField.ofNullable(customer))

        /** The customer the alert applies to. */
        fun customer(customer: JsonField<CustomerMinifiedModel>) = apply {
            this.customer = customer
        }

        /** Whether the alert is enabled or disabled. */
        fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

        /** Whether the alert is enabled or disabled. */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /** The metric the alert applies to. */
        fun metric(metric: Metric?) = metric(JsonField.ofNullable(metric))

        /** The metric the alert applies to. */
        fun metric(metric: JsonField<Metric>) = apply { this.metric = metric }

        /** The plan the alert applies to. */
        fun plan(plan: Plan?) = plan(JsonField.ofNullable(plan))

        /** The plan the alert applies to. */
        fun plan(plan: JsonField<Plan>) = apply { this.plan = plan }

        /** The subscription the alert applies to. */
        fun subscription(subscription: SubscriptionMinifiedModel?) =
            subscription(JsonField.ofNullable(subscription))

        /** The subscription the alert applies to. */
        fun subscription(subscription: JsonField<SubscriptionMinifiedModel>) = apply {
            this.subscription = subscription
        }

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: List<ThresholdModel>?) =
            thresholds(JsonField.ofNullable(thresholds))

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun thresholds(thresholds: JsonField<List<ThresholdModel>>) = apply {
            this.thresholds = thresholds.map { it.toMutableList() }
        }

        /** The thresholds that define the conditions under which the alert will be triggered. */
        fun addThreshold(threshold: ThresholdModel) = apply {
            thresholds =
                (thresholds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("thresholds", it).add(threshold)
                }
        }

        /** The type of alert. This must be a valid alert type. */
        fun type(type: Type) = type(JsonField.of(type))

        /** The type of alert. This must be a valid alert type. */
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

        fun build(): Alert =
            Alert(
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
                additionalProperties.toImmutable(),
            )
    }

    /** The metric the alert applies to. */
    @NoAutoDetect
    class Metric
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metric = apply {
            if (validated) {
                return@apply
            }

            id()
            validated = true
        }

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

            fun id(id: JsonField<String>) = apply { this.id = id }

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

            fun build(): Metric =
                Metric(checkRequired("id", id), additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metric && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metric{id=$id, additionalProperties=$additionalProperties}"
    }

    /** The plan the alert applies to. */
    @NoAutoDetect
    class Plan
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        private val externalPlanId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_version")
        @ExcludeMissing
        private val planVersion: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String? = id.getNullable("id")

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

        fun name(): String? = name.getNullable("name")

        fun planVersion(): String = planVersion.getRequired("plan_version")

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * An optional user-defined ID for this plan resource, used throughout the system as an
         * alias for this Plan. Use this field to identify a plan by an existing identifier in your
         * system.
         */
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        fun _externalPlanId(): JsonField<String> = externalPlanId

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("plan_version")
        @ExcludeMissing
        fun _planVersion(): JsonField<String> = planVersion

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: String?) =
                externalPlanId(JsonField.ofNullable(externalPlanId))

            /**
             * An optional user-defined ID for this plan resource, used throughout the system as an
             * alias for this Plan. Use this field to identify a plan by an existing identifier in
             * your system.
             */
            fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                this.externalPlanId = externalPlanId
            }

            fun name(name: String?) = name(JsonField.ofNullable(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun planVersion(planVersion: String) = planVersion(JsonField.of(planVersion))

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): Plan =
                Plan(
                    checkRequired("id", id),
                    checkRequired("externalPlanId", externalPlanId),
                    checkRequired("name", name),
                    checkRequired("planVersion", planVersion),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Plan && id == other.id && externalPlanId == other.externalPlanId && name == other.name && planVersion == other.planVersion && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, externalPlanId, name, planVersion, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Plan{id=$id, externalPlanId=$externalPlanId, name=$name, planVersion=$planVersion, additionalProperties=$additionalProperties}"
    }

    /** The type of alert. This must be a valid alert type. */
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

            val USAGE_EXCEEDED = of("usage_exceeded")

            val COST_EXCEEDED = of("cost_exceeded")

            val CREDIT_BALANCE_DEPLETED = of("credit_balance_depleted")

            val CREDIT_BALANCE_DROPPED = of("credit_balance_dropped")

            val CREDIT_BALANCE_RECOVERED = of("credit_balance_recovered")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
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
            USAGE_EXCEEDED,
            COST_EXCEEDED,
            CREDIT_BALANCE_DEPLETED,
            CREDIT_BALANCE_DROPPED,
            CREDIT_BALANCE_RECOVERED,
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
                USAGE_EXCEEDED -> Value.USAGE_EXCEEDED
                COST_EXCEEDED -> Value.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Value.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Value.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Value.CREDIT_BALANCE_RECOVERED
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
                USAGE_EXCEEDED -> Known.USAGE_EXCEEDED
                COST_EXCEEDED -> Known.COST_EXCEEDED
                CREDIT_BALANCE_DEPLETED -> Known.CREDIT_BALANCE_DEPLETED
                CREDIT_BALANCE_DROPPED -> Known.CREDIT_BALANCE_DROPPED
                CREDIT_BALANCE_RECOVERED -> Known.CREDIT_BALANCE_RECOVERED
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Alert && id == other.id && createdAt == other.createdAt && currency == other.currency && customer == other.customer && enabled == other.enabled && metric == other.metric && plan == other.plan && subscription == other.subscription && thresholds == other.thresholds && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, currency, customer, enabled, metric, plan, subscription, thresholds, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Alert{id=$id, createdAt=$createdAt, currency=$currency, customer=$customer, enabled=$enabled, metric=$metric, plan=$plan, subscription=$subscription, thresholds=$thresholds, type=$type, additionalProperties=$additionalProperties}"
}
