// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.allMaxBy
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PlanMigrationListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val effectiveTime: JsonField<EffectiveTime>,
    private val planId: JsonField<String>,
    private val status: JsonField<Status>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("effective_time")
        @ExcludeMissing
        effectiveTime: JsonField<EffectiveTime> = JsonMissing.of(),
        @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
    ) : this(id, effectiveTime, planId, status, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun effectiveTime(): EffectiveTime? = effectiveTime.getNullable("effective_time")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun planId(): String = planId.getRequired("plan_id")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [effectiveTime].
     *
     * Unlike [effectiveTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effective_time")
    @ExcludeMissing
    fun _effectiveTime(): JsonField<EffectiveTime> = effectiveTime

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [PlanMigrationListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .effectiveTime()
         * .planId()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanMigrationListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var effectiveTime: JsonField<EffectiveTime>? = null
        private var planId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(planMigrationListResponse: PlanMigrationListResponse) = apply {
            id = planMigrationListResponse.id
            effectiveTime = planMigrationListResponse.effectiveTime
            planId = planMigrationListResponse.planId
            status = planMigrationListResponse.status
            additionalProperties = planMigrationListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun effectiveTime(effectiveTime: EffectiveTime?) =
            effectiveTime(JsonField.ofNullable(effectiveTime))

        /**
         * Sets [Builder.effectiveTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveTime] with a well-typed [EffectiveTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveTime(effectiveTime: JsonField<EffectiveTime>) = apply {
            this.effectiveTime = effectiveTime
        }

        /** Alias for calling [effectiveTime] with `EffectiveTime.ofLocalDate(localDate)`. */
        fun effectiveTime(localDate: LocalDate) =
            effectiveTime(EffectiveTime.ofLocalDate(localDate))

        /** Alias for calling [effectiveTime] with `EffectiveTime.ofOffsetDate(offsetDate)`. */
        fun effectiveTime(offsetDate: OffsetDateTime) =
            effectiveTime(EffectiveTime.ofOffsetDate(offsetDate))

        /** Alias for calling [effectiveTime] with `EffectiveTime.ofUnionMember2(unionMember2)`. */
        fun effectiveTime(unionMember2: EffectiveTime.UnionMember2) =
            effectiveTime(EffectiveTime.ofUnionMember2(unionMember2))

        fun planId(planId: String) = planId(JsonField.of(planId))

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

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
         * Returns an immutable instance of [PlanMigrationListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .effectiveTime()
         * .planId()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PlanMigrationListResponse =
            PlanMigrationListResponse(
                checkRequired("id", id),
                checkRequired("effectiveTime", effectiveTime),
                checkRequired("planId", planId),
                checkRequired("status", status),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PlanMigrationListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        effectiveTime()?.validate()
        planId()
        status().validate()
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
            (effectiveTime.asKnown()?.validity() ?: 0) +
            (if (planId.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0)

    @JsonDeserialize(using = EffectiveTime.Deserializer::class)
    @JsonSerialize(using = EffectiveTime.Serializer::class)
    class EffectiveTime
    private constructor(
        private val localDate: LocalDate? = null,
        private val offsetDate: OffsetDateTime? = null,
        private val unionMember2: UnionMember2? = null,
        private val _json: JsonValue? = null,
    ) {

        fun localDate(): LocalDate? = localDate

        fun offsetDate(): OffsetDateTime? = offsetDate

        fun unionMember2(): UnionMember2? = unionMember2

        fun isLocalDate(): Boolean = localDate != null

        fun isOffsetDate(): Boolean = offsetDate != null

        fun isUnionMember2(): Boolean = unionMember2 != null

        fun asLocalDate(): LocalDate = localDate.getOrThrow("localDate")

        fun asOffsetDate(): OffsetDateTime = offsetDate.getOrThrow("offsetDate")

        fun asUnionMember2(): UnionMember2 = unionMember2.getOrThrow("unionMember2")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                localDate != null -> visitor.visitLocalDate(localDate)
                offsetDate != null -> visitor.visitOffsetDate(offsetDate)
                unionMember2 != null -> visitor.visitUnionMember2(unionMember2)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): EffectiveTime = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitLocalDate(localDate: LocalDate) {}

                    override fun visitOffsetDate(offsetDate: OffsetDateTime) {}

                    override fun visitUnionMember2(unionMember2: UnionMember2) {
                        unionMember2.validate()
                    }
                }
            )
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
            accept(
                object : Visitor<Int> {
                    override fun visitLocalDate(localDate: LocalDate) = 1

                    override fun visitOffsetDate(offsetDate: OffsetDateTime) = 1

                    override fun visitUnionMember2(unionMember2: UnionMember2) =
                        unionMember2.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EffectiveTime &&
                localDate == other.localDate &&
                offsetDate == other.offsetDate &&
                unionMember2 == other.unionMember2
        }

        override fun hashCode(): Int = Objects.hash(localDate, offsetDate, unionMember2)

        override fun toString(): String =
            when {
                localDate != null -> "EffectiveTime{localDate=$localDate}"
                offsetDate != null -> "EffectiveTime{offsetDate=$offsetDate}"
                unionMember2 != null -> "EffectiveTime{unionMember2=$unionMember2}"
                _json != null -> "EffectiveTime{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid EffectiveTime")
            }

        companion object {

            fun ofLocalDate(localDate: LocalDate) = EffectiveTime(localDate = localDate)

            fun ofOffsetDate(offsetDate: OffsetDateTime) = EffectiveTime(offsetDate = offsetDate)

            fun ofUnionMember2(unionMember2: UnionMember2) =
                EffectiveTime(unionMember2 = unionMember2)
        }

        /**
         * An interface that defines how to map each variant of [EffectiveTime] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitLocalDate(localDate: LocalDate): T

            fun visitOffsetDate(offsetDate: OffsetDateTime): T

            fun visitUnionMember2(unionMember2: UnionMember2): T

            /**
             * Maps an unknown variant of [EffectiveTime] to a value of type [T].
             *
             * An instance of [EffectiveTime] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown EffectiveTime: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<EffectiveTime>(EffectiveTime::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): EffectiveTime {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<UnionMember2>())?.let {
                                EffectiveTime(unionMember2 = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LocalDate>())?.let {
                                EffectiveTime(localDate = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                EffectiveTime(offsetDate = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> EffectiveTime(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<EffectiveTime>(EffectiveTime::class) {

            override fun serialize(
                value: EffectiveTime,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.localDate != null -> generator.writeObject(value.localDate)
                    value.offsetDate != null -> generator.writeObject(value.offsetDate)
                    value.unionMember2 != null -> generator.writeObject(value.unionMember2)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid EffectiveTime")
                }
            }
        }

        class UnionMember2 @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val END_OF_TERM = of("end_of_term")

                fun of(value: String) = UnionMember2(JsonField.of(value))
            }

            /** An enum containing [UnionMember2]'s known values. */
            enum class Known {
                END_OF_TERM
            }

            /**
             * An enum containing [UnionMember2]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UnionMember2] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                END_OF_TERM,
                /**
                 * An enum member indicating that [UnionMember2] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    END_OF_TERM -> Value.END_OF_TERM
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
                    END_OF_TERM -> Known.END_OF_TERM
                    else -> throw OrbInvalidDataException("Unknown UnionMember2: $value")
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

            fun validate(): UnionMember2 = apply {
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

                return other is UnionMember2 && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val NOT_STARTED = of("not_started")

            val IN_PROGRESS = of("in_progress")

            val COMPLETED = of("completed")

            val ACTION_NEEDED = of("action_needed")

            val CANCELED = of("canceled")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            NOT_STARTED,
            IN_PROGRESS,
            COMPLETED,
            ACTION_NEEDED,
            CANCELED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            NOT_STARTED,
            IN_PROGRESS,
            COMPLETED,
            ACTION_NEEDED,
            CANCELED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                NOT_STARTED -> Value.NOT_STARTED
                IN_PROGRESS -> Value.IN_PROGRESS
                COMPLETED -> Value.COMPLETED
                ACTION_NEEDED -> Value.ACTION_NEEDED
                CANCELED -> Value.CANCELED
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
                NOT_STARTED -> Known.NOT_STARTED
                IN_PROGRESS -> Known.IN_PROGRESS
                COMPLETED -> Known.COMPLETED
                ACTION_NEEDED -> Known.ACTION_NEEDED
                CANCELED -> Known.CANCELED
                else -> throw OrbInvalidDataException("Unknown Status: $value")
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

        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlanMigrationListResponse &&
            id == other.id &&
            effectiveTime == other.effectiveTime &&
            planId == other.planId &&
            status == other.status &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, effectiveTime, planId, status, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanMigrationListResponse{id=$id, effectiveTime=$effectiveTime, planId=$planId, status=$status, additionalProperties=$additionalProperties}"
}
