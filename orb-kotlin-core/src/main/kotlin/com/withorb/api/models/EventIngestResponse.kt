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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class EventIngestResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val validationFailed: JsonField<List<ValidationFailed>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("validation_failed")
        @ExcludeMissing
        validationFailed: JsonField<List<ValidationFailed>> = JsonMissing.of()
    ) : this(validationFailed, mutableMapOf())

    /**
     * Contains all failing validation events. In the case of a 200, this array will always be
     * empty. This field will always be present.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun validationFailed(): List<ValidationFailed> =
        validationFailed.getRequired("validation_failed")

    /**
     * Returns the raw JSON value of [validationFailed].
     *
     * Unlike [validationFailed], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("validation_failed")
    @ExcludeMissing
    fun _validationFailed(): JsonField<List<ValidationFailed>> = validationFailed

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
         * Returns a mutable builder for constructing an instance of [EventIngestResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .validationFailed()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EventIngestResponse]. */
    class Builder internal constructor() {

        private var validationFailed: JsonField<MutableList<ValidationFailed>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventIngestResponse: EventIngestResponse) = apply {
            validationFailed = eventIngestResponse.validationFailed.map { it.toMutableList() }
            additionalProperties = eventIngestResponse.additionalProperties.toMutableMap()
        }

        /**
         * Contains all failing validation events. In the case of a 200, this array will always be
         * empty. This field will always be present.
         */
        fun validationFailed(validationFailed: List<ValidationFailed>) =
            validationFailed(JsonField.of(validationFailed))

        /**
         * Sets [Builder.validationFailed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.validationFailed] with a well-typed
         * `List<ValidationFailed>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun validationFailed(validationFailed: JsonField<List<ValidationFailed>>) = apply {
            this.validationFailed = validationFailed.map { it.toMutableList() }
        }

        /**
         * Adds a single [ValidationFailed] to [Builder.validationFailed].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addValidationFailed(validationFailed: ValidationFailed) = apply {
            this.validationFailed =
                (this.validationFailed ?: JsonField.of(mutableListOf())).also {
                    checkKnown("validationFailed", it).add(validationFailed)
                }
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
         * Returns an immutable instance of [EventIngestResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .validationFailed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventIngestResponse =
            EventIngestResponse(
                checkRequired("validationFailed", validationFailed).map { it.toImmutable() },
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
    fun validate(): EventIngestResponse = apply {
        if (validated) {
            return@apply
        }

        validationFailed().forEach { it.validate() }
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
        (validationFailed.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class ValidationFailed
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val idempotencyKey: JsonField<String>,
        private val validationErrors: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("idempotency_key")
            @ExcludeMissing
            idempotencyKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("validation_errors")
            @ExcludeMissing
            validationErrors: JsonField<List<String>> = JsonMissing.of(),
        ) : this(idempotencyKey, validationErrors, mutableMapOf())

        /**
         * The passed idempotency_key corresponding to the validation_errors
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun idempotencyKey(): String = idempotencyKey.getRequired("idempotency_key")

        /**
         * An array of strings corresponding to validation failures for this idempotency_key.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun validationErrors(): List<String> = validationErrors.getRequired("validation_errors")

        /**
         * Returns the raw JSON value of [idempotencyKey].
         *
         * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun _idempotencyKey(): JsonField<String> = idempotencyKey

        /**
         * Returns the raw JSON value of [validationErrors].
         *
         * Unlike [validationErrors], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("validation_errors")
        @ExcludeMissing
        fun _validationErrors(): JsonField<List<String>> = validationErrors

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
             * Returns a mutable builder for constructing an instance of [ValidationFailed].
             *
             * The following fields are required:
             * ```kotlin
             * .idempotencyKey()
             * .validationErrors()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ValidationFailed]. */
        class Builder internal constructor() {

            private var idempotencyKey: JsonField<String>? = null
            private var validationErrors: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(validationFailed: ValidationFailed) = apply {
                idempotencyKey = validationFailed.idempotencyKey
                validationErrors = validationFailed.validationErrors.map { it.toMutableList() }
                additionalProperties = validationFailed.additionalProperties.toMutableMap()
            }

            /** The passed idempotency_key corresponding to the validation_errors */
            fun idempotencyKey(idempotencyKey: String) =
                idempotencyKey(JsonField.of(idempotencyKey))

            /**
             * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
                this.idempotencyKey = idempotencyKey
            }

            /**
             * An array of strings corresponding to validation failures for this idempotency_key.
             */
            fun validationErrors(validationErrors: List<String>) =
                validationErrors(JsonField.of(validationErrors))

            /**
             * Sets [Builder.validationErrors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.validationErrors] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun validationErrors(validationErrors: JsonField<List<String>>) = apply {
                this.validationErrors = validationErrors.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [validationErrors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addValidationError(validationError: String) = apply {
                validationErrors =
                    (validationErrors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("validationErrors", it).add(validationError)
                    }
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
             * Returns an immutable instance of [ValidationFailed].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .idempotencyKey()
             * .validationErrors()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ValidationFailed =
                ValidationFailed(
                    checkRequired("idempotencyKey", idempotencyKey),
                    checkRequired("validationErrors", validationErrors).map { it.toImmutable() },
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
        fun validate(): ValidationFailed = apply {
            if (validated) {
                return@apply
            }

            idempotencyKey()
            validationErrors()
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
            (if (idempotencyKey.asKnown() == null) 0 else 1) +
                (validationErrors.asKnown()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ValidationFailed &&
                idempotencyKey == other.idempotencyKey &&
                validationErrors == other.validationErrors &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(idempotencyKey, validationErrors, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ValidationFailed{idempotencyKey=$idempotencyKey, validationErrors=$validationErrors, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventIngestResponse &&
            validationFailed == other.validationFailed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(validationFailed, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventIngestResponse{validationFailed=$validationFailed, additionalProperties=$additionalProperties}"
}
