// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.JsonNull
import com.withorb.api.core.JsonField
import com.withorb.api.core.Enum
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.errors.OrbInvalidDataException

@JsonDeserialize(builder = SubscriptionFetchScheduleResponse.Builder::class)
@NoAutoDetect
class SubscriptionFetchScheduleResponse private constructor(
  private val startDate: JsonField<OffsetDateTime>,
  private val endDate: JsonField<OffsetDateTime>,
  private val createdAt: JsonField<OffsetDateTime>,
  private val plan: JsonField<Plan>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

    fun endDate(): OffsetDateTime? = endDate.getNullable("end_date")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun plan(): Plan = plan.getRequired("plan")

    @JsonProperty("start_date")
    @ExcludeMissing
    fun _startDate() = startDate

    @JsonProperty("end_date")
    @ExcludeMissing
    fun _endDate() = endDate

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    @JsonProperty("plan")
    @ExcludeMissing
    fun _plan() = plan

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): SubscriptionFetchScheduleResponse = apply {
        if (!validated) {
          startDate()
          endDate()
          createdAt()
          plan().validate()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is SubscriptionFetchScheduleResponse &&
          this.startDate == other.startDate &&
          this.endDate == other.endDate &&
          this.createdAt == other.createdAt &&
          this.plan == other.plan &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            startDate,
            endDate,
            createdAt,
            plan,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "SubscriptionFetchScheduleResponse{startDate=$startDate, endDate=$endDate, createdAt=$createdAt, plan=$plan, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var plan: JsonField<Plan> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(subscriptionFetchScheduleResponse: SubscriptionFetchScheduleResponse) = apply {
            this.startDate = subscriptionFetchScheduleResponse.startDate
            this.endDate = subscriptionFetchScheduleResponse.endDate
            this.createdAt = subscriptionFetchScheduleResponse.createdAt
            this.plan = subscriptionFetchScheduleResponse.plan
            additionalProperties(subscriptionFetchScheduleResponse.additionalProperties)
        }

        fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

        @JsonProperty("start_date")
        @ExcludeMissing
        fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
            this.startDate = startDate
        }

        fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

        @JsonProperty("end_date")
        @ExcludeMissing
        fun endDate(endDate: JsonField<OffsetDateTime>) = apply {
            this.endDate = endDate
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        fun plan(plan: Plan) = plan(JsonField.of(plan))

        @JsonProperty("plan")
        @ExcludeMissing
        fun plan(plan: JsonField<Plan>) = apply {
            this.plan = plan
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

        fun build(): SubscriptionFetchScheduleResponse = SubscriptionFetchScheduleResponse(
            startDate,
            endDate,
            createdAt,
            plan,
            additionalProperties.toUnmodifiable(),
        )
    }

    @JsonDeserialize(builder = Plan.Builder::class)
    @NoAutoDetect
    class Plan private constructor(
      private val id: JsonField<String>,
      private val externalPlanId: JsonField<String>,
      private val name: JsonField<String>,
      private val additionalProperties: Map<String, JsonValue>,

    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun id(): String? = id.getNullable("id")

        /**
         * An optional user-defined ID for this plan resource, used throughout the system
         * as an alias for this Plan. Use this field to identify a plan by an existing
         * identifier in your system.
         */
        fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

        fun name(): String? = name.getNullable("name")

        @JsonProperty("id")
        @ExcludeMissing
        fun _id() = id

        /**
         * An optional user-defined ID for this plan resource, used throughout the system
         * as an alias for this Plan. Use this field to identify a plan by an existing
         * identifier in your system.
         */
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        fun _externalPlanId() = externalPlanId

        @JsonProperty("name")
        @ExcludeMissing
        fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Plan = apply {
            if (!validated) {
              id()
              externalPlanId()
              name()
              validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Plan &&
              this.id == other.id &&
              this.externalPlanId == other.externalPlanId &&
              this.name == other.name &&
              this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
          if (hashCode == 0) {
            hashCode = Objects.hash(
                id,
                externalPlanId,
                name,
                additionalProperties,
            )
          }
          return hashCode
        }

        override fun toString() = "Plan{id=$id, externalPlanId=$externalPlanId, name=$name, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var externalPlanId: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(plan: Plan) = apply {
                this.id = plan.id
                this.externalPlanId = plan.externalPlanId
                this.name = plan.name
                additionalProperties(plan.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply {
                this.id = id
            }

            /**
             * An optional user-defined ID for this plan resource, used throughout the system
             * as an alias for this Plan. Use this field to identify a plan by an existing
             * identifier in your system.
             */
            fun externalPlanId(externalPlanId: String) = externalPlanId(JsonField.of(externalPlanId))

            /**
             * An optional user-defined ID for this plan resource, used throughout the system
             * as an alias for this Plan. Use this field to identify a plan by an existing
             * identifier in your system.
             */
            @JsonProperty("external_plan_id")
            @ExcludeMissing
            fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                this.externalPlanId = externalPlanId
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply {
                this.name = name
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

            fun build(): Plan = Plan(
                id,
                externalPlanId,
                name,
                additionalProperties.toUnmodifiable(),
            )
        }
    }
}
