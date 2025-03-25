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
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * This endpoint is used to update the trial end date for a subscription. The new trial end date
 * must be within the time range of the current plan (i.e. the new trial end date must be on or
 * after the subscription's start date on the current plan, and on or before the subscription end
 * date).
 *
 * In order to retroactively remove a trial completely, the end date can be set to the transition
 * date of the subscription to this plan (or, if this is the first plan for this subscription, the
 * subscription's start date). In order to end a trial immediately, the keyword `immediate` can be
 * provided as the trial end date.
 *
 * By default, Orb will shift only the trial end date (and price intervals that start or end on the
 * previous trial end date), and leave all other future price intervals untouched. If the `shift`
 * parameter is set to `true`, Orb will shift all subsequent price and adjustment intervals by the
 * same amount as the trial end date shift (so, e.g., if a plan change is scheduled or an add-on
 * price was added, that change will be pushed back by the same amount of time the trial is
 * extended).
 */
class SubscriptionUpdateTrialParams
private constructor(
    private val subscriptionId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String = subscriptionId

    /**
     * The new date that the trial should end, or the literal string `immediate` to end the trial
     * immediately.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialEndDate(): TrialEndDate = body.trialEndDate()

    /**
     * If true, shifts subsequent price and adjustment intervals (preserving their durations, but
     * adjusting their absolute dates).
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun shift(): Boolean? = body.shift()

    /**
     * Returns the raw JSON value of [trialEndDate].
     *
     * Unlike [trialEndDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _trialEndDate(): JsonField<TrialEndDate> = body._trialEndDate()

    /**
     * Returns the raw JSON value of [shift].
     *
     * Unlike [shift], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _shift(): JsonField<Boolean> = body._shift()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionUpdateTrialParams].
         *
         * The following fields are required:
         * ```kotlin
         * .subscriptionId()
         * .trialEndDate()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdateTrialParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionUpdateTrialParams: SubscriptionUpdateTrialParams) = apply {
            subscriptionId = subscriptionUpdateTrialParams.subscriptionId
            body = subscriptionUpdateTrialParams.body.toBuilder()
            additionalHeaders = subscriptionUpdateTrialParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionUpdateTrialParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /**
         * The new date that the trial should end, or the literal string `immediate` to end the
         * trial immediately.
         */
        fun trialEndDate(trialEndDate: TrialEndDate) = apply { body.trialEndDate(trialEndDate) }

        /**
         * Sets [Builder.trialEndDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialEndDate] with a well-typed [TrialEndDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun trialEndDate(trialEndDate: JsonField<TrialEndDate>) = apply {
            body.trialEndDate(trialEndDate)
        }

        /**
         * Alias for calling [trialEndDate] with `TrialEndDate.ofOffsetDateTime(offsetDateTime)`.
         */
        fun trialEndDate(offsetDateTime: OffsetDateTime) = apply {
            body.trialEndDate(offsetDateTime)
        }

        /** Alias for calling [trialEndDate] with `TrialEndDate.ofUnionMember1(unionMember1)`. */
        fun trialEndDate(unionMember1: TrialEndDate.UnionMember1) = apply {
            body.trialEndDate(unionMember1)
        }

        /**
         * If true, shifts subsequent price and adjustment intervals (preserving their durations,
         * but adjusting their absolute dates).
         */
        fun shift(shift: Boolean) = apply { body.shift(shift) }

        /**
         * Sets [Builder.shift] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shift] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun shift(shift: JsonField<Boolean>) = apply { body.shift(shift) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SubscriptionUpdateTrialParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .subscriptionId()
         * .trialEndDate()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SubscriptionUpdateTrialParams =
            SubscriptionUpdateTrialParams(
                checkRequired("subscriptionId", subscriptionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    internal fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val trialEndDate: JsonField<TrialEndDate>,
        private val shift: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("trial_end_date")
            @ExcludeMissing
            trialEndDate: JsonField<TrialEndDate> = JsonMissing.of(),
            @JsonProperty("shift") @ExcludeMissing shift: JsonField<Boolean> = JsonMissing.of(),
        ) : this(trialEndDate, shift, mutableMapOf())

        /**
         * The new date that the trial should end, or the literal string `immediate` to end the
         * trial immediately.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trialEndDate(): TrialEndDate = trialEndDate.getRequired("trial_end_date")

        /**
         * If true, shifts subsequent price and adjustment intervals (preserving their durations,
         * but adjusting their absolute dates).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun shift(): Boolean? = shift.getNullable("shift")

        /**
         * Returns the raw JSON value of [trialEndDate].
         *
         * Unlike [trialEndDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_end_date")
        @ExcludeMissing
        fun _trialEndDate(): JsonField<TrialEndDate> = trialEndDate

        /**
         * Returns the raw JSON value of [shift].
         *
         * Unlike [shift], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("shift") @ExcludeMissing fun _shift(): JsonField<Boolean> = shift

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .trialEndDate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var trialEndDate: JsonField<TrialEndDate>? = null
            private var shift: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                trialEndDate = body.trialEndDate
                shift = body.shift
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The new date that the trial should end, or the literal string `immediate` to end the
             * trial immediately.
             */
            fun trialEndDate(trialEndDate: TrialEndDate) = trialEndDate(JsonField.of(trialEndDate))

            /**
             * Sets [Builder.trialEndDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialEndDate] with a well-typed [TrialEndDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialEndDate(trialEndDate: JsonField<TrialEndDate>) = apply {
                this.trialEndDate = trialEndDate
            }

            /**
             * Alias for calling [trialEndDate] with
             * `TrialEndDate.ofOffsetDateTime(offsetDateTime)`.
             */
            fun trialEndDate(offsetDateTime: OffsetDateTime) =
                trialEndDate(TrialEndDate.ofOffsetDateTime(offsetDateTime))

            /**
             * Alias for calling [trialEndDate] with `TrialEndDate.ofUnionMember1(unionMember1)`.
             */
            fun trialEndDate(unionMember1: TrialEndDate.UnionMember1) =
                trialEndDate(TrialEndDate.ofUnionMember1(unionMember1))

            /**
             * If true, shifts subsequent price and adjustment intervals (preserving their
             * durations, but adjusting their absolute dates).
             */
            fun shift(shift: Boolean) = shift(JsonField.of(shift))

            /**
             * Sets [Builder.shift] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shift] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun shift(shift: JsonField<Boolean>) = apply { this.shift = shift }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .trialEndDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("trialEndDate", trialEndDate),
                    shift,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            trialEndDate().validate()
            shift()
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && trialEndDate == other.trialEndDate && shift == other.shift && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(trialEndDate, shift, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{trialEndDate=$trialEndDate, shift=$shift, additionalProperties=$additionalProperties}"
    }

    /**
     * The new date that the trial should end, or the literal string `immediate` to end the trial
     * immediately.
     */
    @JsonDeserialize(using = TrialEndDate.Deserializer::class)
    @JsonSerialize(using = TrialEndDate.Serializer::class)
    class TrialEndDate
    private constructor(
        private val offsetDateTime: OffsetDateTime? = null,
        private val unionMember1: UnionMember1? = null,
        private val _json: JsonValue? = null,
    ) {

        fun offsetDateTime(): OffsetDateTime? = offsetDateTime

        fun unionMember1(): UnionMember1? = unionMember1

        fun isOffsetDateTime(): Boolean = offsetDateTime != null

        fun isUnionMember1(): Boolean = unionMember1 != null

        fun asOffsetDateTime(): OffsetDateTime = offsetDateTime.getOrThrow("offsetDateTime")

        fun asUnionMember1(): UnionMember1 = unionMember1.getOrThrow("unionMember1")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                offsetDateTime != null -> visitor.visitOffsetDateTime(offsetDateTime)
                unionMember1 != null -> visitor.visitUnionMember1(unionMember1)
                else -> visitor.unknown(_json)
            }
        }

        private var validated: Boolean = false

        fun validate(): TrialEndDate = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitOffsetDateTime(offsetDateTime: OffsetDateTime) {}

                    override fun visitUnionMember1(unionMember1: UnionMember1) {}
                }
            )
            validated = true
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TrialEndDate && offsetDateTime == other.offsetDateTime && unionMember1 == other.unionMember1 /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(offsetDateTime, unionMember1) /* spotless:on */

        override fun toString(): String =
            when {
                offsetDateTime != null -> "TrialEndDate{offsetDateTime=$offsetDateTime}"
                unionMember1 != null -> "TrialEndDate{unionMember1=$unionMember1}"
                _json != null -> "TrialEndDate{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TrialEndDate")
            }

        companion object {

            fun ofOffsetDateTime(offsetDateTime: OffsetDateTime) =
                TrialEndDate(offsetDateTime = offsetDateTime)

            fun ofUnionMember1(unionMember1: UnionMember1) =
                TrialEndDate(unionMember1 = unionMember1)
        }

        /**
         * An interface that defines how to map each variant of [TrialEndDate] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitOffsetDateTime(offsetDateTime: OffsetDateTime): T

            fun visitUnionMember1(unionMember1: UnionMember1): T

            /**
             * Maps an unknown variant of [TrialEndDate] to a value of type [T].
             *
             * An instance of [TrialEndDate] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown TrialEndDate: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<TrialEndDate>(TrialEndDate::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TrialEndDate {
                val json = JsonValue.fromJsonNode(node)

                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                    return TrialEndDate(offsetDateTime = it, _json = json)
                }
                tryDeserialize(node, jacksonTypeRef<UnionMember1>())?.let {
                    return TrialEndDate(unionMember1 = it, _json = json)
                }

                return TrialEndDate(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<TrialEndDate>(TrialEndDate::class) {

            override fun serialize(
                value: TrialEndDate,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.offsetDateTime != null -> generator.writeObject(value.offsetDateTime)
                    value.unionMember1 != null -> generator.writeObject(value.unionMember1)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TrialEndDate")
                }
            }
        }

        class UnionMember1 @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val IMMEDIATE = of("immediate")

                fun of(value: String) = UnionMember1(JsonField.of(value))
            }

            /** An enum containing [UnionMember1]'s known values. */
            enum class Known {
                IMMEDIATE
            }

            /**
             * An enum containing [UnionMember1]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [UnionMember1] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                IMMEDIATE,
                /**
                 * An enum member indicating that [UnionMember1] was instantiated with an unknown
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
                    IMMEDIATE -> Value.IMMEDIATE
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
                    IMMEDIATE -> Known.IMMEDIATE
                    else -> throw OrbInvalidDataException("Unknown UnionMember1: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnionMember1 && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUpdateTrialParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionUpdateTrialParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
