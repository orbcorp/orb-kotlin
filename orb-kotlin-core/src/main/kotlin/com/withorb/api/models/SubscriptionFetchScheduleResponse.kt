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
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class SubscriptionFetchScheduleResponse
@JsonCreator
private constructor(
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("end_date")
    @ExcludeMissing
    private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("plan")
    @ExcludeMissing
    private val plan: JsonField<PlanMinifiedModel> = JsonMissing.of(),
    @JsonProperty("start_date")
    @ExcludeMissing
    private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    fun plan(): PlanMinifiedModel = plan.getRequired("plan")

    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<OffsetDateTime> = endDate

    @JsonProperty("plan") @ExcludeMissing fun _plan(): JsonField<PlanMinifiedModel> = plan

    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate(): JsonField<OffsetDateTime> = startDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): SubscriptionFetchScheduleResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        endDate()
        plan().validate()
        startDate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionFetchScheduleResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .createdAt()
         * .endDate()
         * .plan()
         * .startDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionFetchScheduleResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var endDate: JsonField<OffsetDateTime>? = null
        private var plan: JsonField<PlanMinifiedModel>? = null
        private var startDate: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionFetchScheduleResponse: SubscriptionFetchScheduleResponse) =
            apply {
                createdAt = subscriptionFetchScheduleResponse.createdAt
                endDate = subscriptionFetchScheduleResponse.endDate
                plan = subscriptionFetchScheduleResponse.plan
                startDate = subscriptionFetchScheduleResponse.startDate
                additionalProperties =
                    subscriptionFetchScheduleResponse.additionalProperties.toMutableMap()
            }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun endDate(endDate: OffsetDateTime?) = endDate(JsonField.ofNullable(endDate))

        fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

        fun plan(plan: PlanMinifiedModel) = plan(JsonField.of(plan))

        fun plan(plan: JsonField<PlanMinifiedModel>) = apply { this.plan = plan }

        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        fun startDate(startDate: JsonField<OffsetDateTime>) = apply { this.startDate = startDate }

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

        fun build(): SubscriptionFetchScheduleResponse =
            SubscriptionFetchScheduleResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("endDate", endDate),
                checkRequired("plan", plan),
                checkRequired("startDate", startDate),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionFetchScheduleResponse && createdAt == other.createdAt && endDate == other.endDate && plan == other.plan && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdAt, endDate, plan, startDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SubscriptionFetchScheduleResponse{createdAt=$createdAt, endDate=$endDate, plan=$plan, startDate=$startDate, additionalProperties=$additionalProperties}"
}
