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
class AutoCollectionModel
@JsonCreator
private constructor(
    @JsonProperty("enabled")
    @ExcludeMissing
    private val enabled: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("next_attempt_at")
    @ExcludeMissing
    private val nextAttemptAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("num_attempts")
    @ExcludeMissing
    private val numAttempts: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("previously_attempted_at")
    @ExcludeMissing
    private val previouslyAttemptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** True only if auto-collection is enabled for this invoice. */
    fun enabled(): Boolean? = enabled.getNullable("enabled")

    /**
     * If the invoice is scheduled for auto-collection, this field will reflect when the next
     * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for this
     * invoice, this field will be `null`.
     */
    fun nextAttemptAt(): OffsetDateTime? = nextAttemptAt.getNullable("next_attempt_at")

    /** Number of auto-collection payment attempts. */
    fun numAttempts(): Long? = numAttempts.getNullable("num_attempts")

    /**
     * If Orb has ever attempted payment auto-collection for this invoice, this field will reflect
     * when that attempt occurred. In conjunction with `next_attempt_at`, this can be used to tell
     * whether the invoice is currently in dunning (that is, `previously_attempted_at` is non-null,
     * and `next_attempt_time` is non-null), or if dunning has been exhausted
     * (`previously_attempted_at` is non-null, but `next_attempt_time` is null).
     */
    fun previouslyAttemptedAt(): OffsetDateTime? =
        previouslyAttemptedAt.getNullable("previously_attempted_at")

    /** True only if auto-collection is enabled for this invoice. */
    @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

    /**
     * If the invoice is scheduled for auto-collection, this field will reflect when the next
     * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for this
     * invoice, this field will be `null`.
     */
    @JsonProperty("next_attempt_at")
    @ExcludeMissing
    fun _nextAttemptAt(): JsonField<OffsetDateTime> = nextAttemptAt

    /** Number of auto-collection payment attempts. */
    @JsonProperty("num_attempts") @ExcludeMissing fun _numAttempts(): JsonField<Long> = numAttempts

    /**
     * If Orb has ever attempted payment auto-collection for this invoice, this field will reflect
     * when that attempt occurred. In conjunction with `next_attempt_at`, this can be used to tell
     * whether the invoice is currently in dunning (that is, `previously_attempted_at` is non-null,
     * and `next_attempt_time` is non-null), or if dunning has been exhausted
     * (`previously_attempted_at` is non-null, but `next_attempt_time` is null).
     */
    @JsonProperty("previously_attempted_at")
    @ExcludeMissing
    fun _previouslyAttemptedAt(): JsonField<OffsetDateTime> = previouslyAttemptedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AutoCollectionModel = apply {
        if (validated) {
            return@apply
        }

        enabled()
        nextAttemptAt()
        numAttempts()
        previouslyAttemptedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AutoCollectionModel].
         *
         * The following fields are required:
         * ```kotlin
         * .enabled()
         * .nextAttemptAt()
         * .numAttempts()
         * .previouslyAttemptedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AutoCollectionModel]. */
    class Builder internal constructor() {

        private var enabled: JsonField<Boolean>? = null
        private var nextAttemptAt: JsonField<OffsetDateTime>? = null
        private var numAttempts: JsonField<Long>? = null
        private var previouslyAttemptedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(autoCollectionModel: AutoCollectionModel) = apply {
            enabled = autoCollectionModel.enabled
            nextAttemptAt = autoCollectionModel.nextAttemptAt
            numAttempts = autoCollectionModel.numAttempts
            previouslyAttemptedAt = autoCollectionModel.previouslyAttemptedAt
            additionalProperties = autoCollectionModel.additionalProperties.toMutableMap()
        }

        /** True only if auto-collection is enabled for this invoice. */
        fun enabled(enabled: Boolean?) = enabled(JsonField.ofNullable(enabled))

        /** True only if auto-collection is enabled for this invoice. */
        fun enabled(enabled: Boolean) = enabled(enabled as Boolean?)

        /** True only if auto-collection is enabled for this invoice. */
        fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

        /**
         * If the invoice is scheduled for auto-collection, this field will reflect when the next
         * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for
         * this invoice, this field will be `null`.
         */
        fun nextAttemptAt(nextAttemptAt: OffsetDateTime?) =
            nextAttemptAt(JsonField.ofNullable(nextAttemptAt))

        /**
         * If the invoice is scheduled for auto-collection, this field will reflect when the next
         * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for
         * this invoice, this field will be `null`.
         */
        fun nextAttemptAt(nextAttemptAt: JsonField<OffsetDateTime>) = apply {
            this.nextAttemptAt = nextAttemptAt
        }

        /** Number of auto-collection payment attempts. */
        fun numAttempts(numAttempts: Long?) = numAttempts(JsonField.ofNullable(numAttempts))

        /** Number of auto-collection payment attempts. */
        fun numAttempts(numAttempts: Long) = numAttempts(numAttempts as Long?)

        /** Number of auto-collection payment attempts. */
        fun numAttempts(numAttempts: JsonField<Long>) = apply { this.numAttempts = numAttempts }

        /**
         * If Orb has ever attempted payment auto-collection for this invoice, this field will
         * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be
         * used to tell whether the invoice is currently in dunning (that is,
         * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
         * dunning has been exhausted (`previously_attempted_at` is non-null, but
         * `next_attempt_time` is null).
         */
        fun previouslyAttemptedAt(previouslyAttemptedAt: OffsetDateTime?) =
            previouslyAttemptedAt(JsonField.ofNullable(previouslyAttemptedAt))

        /**
         * If Orb has ever attempted payment auto-collection for this invoice, this field will
         * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be
         * used to tell whether the invoice is currently in dunning (that is,
         * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
         * dunning has been exhausted (`previously_attempted_at` is non-null, but
         * `next_attempt_time` is null).
         */
        fun previouslyAttemptedAt(previouslyAttemptedAt: JsonField<OffsetDateTime>) = apply {
            this.previouslyAttemptedAt = previouslyAttemptedAt
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

        fun build(): AutoCollectionModel =
            AutoCollectionModel(
                checkRequired("enabled", enabled),
                checkRequired("nextAttemptAt", nextAttemptAt),
                checkRequired("numAttempts", numAttempts),
                checkRequired("previouslyAttemptedAt", previouslyAttemptedAt),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AutoCollectionModel && enabled == other.enabled && nextAttemptAt == other.nextAttemptAt && numAttempts == other.numAttempts && previouslyAttemptedAt == other.previouslyAttemptedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(enabled, nextAttemptAt, numAttempts, previouslyAttemptedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AutoCollectionModel{enabled=$enabled, nextAttemptAt=$nextAttemptAt, numAttempts=$numAttempts, previouslyAttemptedAt=$previouslyAttemptedAt, additionalProperties=$additionalProperties}"
}
