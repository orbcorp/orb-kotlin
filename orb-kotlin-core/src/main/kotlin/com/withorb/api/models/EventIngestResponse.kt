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
import java.util.Objects

@NoAutoDetect
class EventIngestResponse
@JsonCreator
private constructor(
    @JsonProperty("validation_failed")
    @ExcludeMissing
    private val validationFailed: JsonField<List<ValidationFailed>> = JsonMissing.of(),
    @JsonProperty("debug") @ExcludeMissing private val debug: JsonField<Debug> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * Contains all failing validation events. In the case of a 200, this array will always be
     * empty. This field will always be present.
     */
    fun validationFailed(): List<ValidationFailed> =
        validationFailed.getRequired("validation_failed")

    /**
     * Optional debug information (only present when debug=true is passed to the endpoint). Contains
     * ingested and duplicate event idempotency keys.
     */
    fun debug(): Debug? = debug.getNullable("debug")

    /**
     * Contains all failing validation events. In the case of a 200, this array will always be
     * empty. This field will always be present.
     */
    @JsonProperty("validation_failed")
    @ExcludeMissing
    fun _validationFailed(): JsonField<List<ValidationFailed>> = validationFailed

    /**
     * Optional debug information (only present when debug=true is passed to the endpoint). Contains
     * ingested and duplicate event idempotency keys.
     */
    @JsonProperty("debug") @ExcludeMissing fun _debug(): JsonField<Debug> = debug

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): EventIngestResponse = apply {
        if (validated) {
            return@apply
        }

        validationFailed().forEach { it.validate() }
        debug()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var validationFailed: JsonField<MutableList<ValidationFailed>>? = null
        private var debug: JsonField<Debug> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventIngestResponse: EventIngestResponse) = apply {
            validationFailed = eventIngestResponse.validationFailed.map { it.toMutableList() }
            debug = eventIngestResponse.debug
            additionalProperties = eventIngestResponse.additionalProperties.toMutableMap()
        }

        /**
         * Contains all failing validation events. In the case of a 200, this array will always be
         * empty. This field will always be present.
         */
        fun validationFailed(validationFailed: List<ValidationFailed>) =
            validationFailed(JsonField.of(validationFailed))

        /**
         * Contains all failing validation events. In the case of a 200, this array will always be
         * empty. This field will always be present.
         */
        fun validationFailed(validationFailed: JsonField<List<ValidationFailed>>) = apply {
            this.validationFailed = validationFailed.map { it.toMutableList() }
        }

        /**
         * Contains all failing validation events. In the case of a 200, this array will always be
         * empty. This field will always be present.
         */
        fun addValidationFailed(validationFailed: ValidationFailed) = apply {
            this.validationFailed =
                (this.validationFailed ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(validationFailed)
                }
        }

        /**
         * Optional debug information (only present when debug=true is passed to the endpoint).
         * Contains ingested and duplicate event idempotency keys.
         */
        fun debug(debug: Debug?) = debug(JsonField.ofNullable(debug))

        /**
         * Optional debug information (only present when debug=true is passed to the endpoint).
         * Contains ingested and duplicate event idempotency keys.
         */
        fun debug(debug: JsonField<Debug>) = apply { this.debug = debug }

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

        fun build(): EventIngestResponse =
            EventIngestResponse(
                checkRequired("validationFailed", validationFailed).map { it.toImmutable() },
                debug,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class ValidationFailed
    @JsonCreator
    private constructor(
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        private val idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("validation_errors")
        @ExcludeMissing
        private val validationErrors: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The passed idempotency_key corresponding to the validation_errors */
        fun idempotencyKey(): String = idempotencyKey.getRequired("idempotency_key")

        /** An array of strings corresponding to validation failures for this idempotency_key. */
        fun validationErrors(): List<String> = validationErrors.getRequired("validation_errors")

        /** The passed idempotency_key corresponding to the validation_errors */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun _idempotencyKey(): JsonField<String> = idempotencyKey

        /** An array of strings corresponding to validation failures for this idempotency_key. */
        @JsonProperty("validation_errors")
        @ExcludeMissing
        fun _validationErrors(): JsonField<List<String>> = validationErrors

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ValidationFailed = apply {
            if (validated) {
                return@apply
            }

            idempotencyKey()
            validationErrors()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

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

            /** The passed idempotency_key corresponding to the validation_errors */
            fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
                this.idempotencyKey = idempotencyKey
            }

            /**
             * An array of strings corresponding to validation failures for this idempotency_key.
             */
            fun validationErrors(validationErrors: List<String>) =
                validationErrors(JsonField.of(validationErrors))

            /**
             * An array of strings corresponding to validation failures for this idempotency_key.
             */
            fun validationErrors(validationErrors: JsonField<List<String>>) = apply {
                this.validationErrors = validationErrors.map { it.toMutableList() }
            }

            /**
             * An array of strings corresponding to validation failures for this idempotency_key.
             */
            fun addValidationError(validationError: String) = apply {
                validationErrors =
                    (validationErrors ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(validationError)
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

            fun build(): ValidationFailed =
                ValidationFailed(
                    checkRequired("idempotencyKey", idempotencyKey),
                    checkRequired("validationErrors", validationErrors).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ValidationFailed && idempotencyKey == other.idempotencyKey && validationErrors == other.validationErrors && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(idempotencyKey, validationErrors, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ValidationFailed{idempotencyKey=$idempotencyKey, validationErrors=$validationErrors, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional debug information (only present when debug=true is passed to the endpoint). Contains
     * ingested and duplicate event idempotency keys.
     */
    @NoAutoDetect
    class Debug
    @JsonCreator
    private constructor(
        @JsonProperty("duplicate")
        @ExcludeMissing
        private val duplicate: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("ingested")
        @ExcludeMissing
        private val ingested: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun duplicate(): List<String> = duplicate.getRequired("duplicate")

        fun ingested(): List<String> = ingested.getRequired("ingested")

        @JsonProperty("duplicate")
        @ExcludeMissing
        fun _duplicate(): JsonField<List<String>> = duplicate

        @JsonProperty("ingested")
        @ExcludeMissing
        fun _ingested(): JsonField<List<String>> = ingested

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Debug = apply {
            if (validated) {
                return@apply
            }

            duplicate()
            ingested()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var duplicate: JsonField<MutableList<String>>? = null
            private var ingested: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(debug: Debug) = apply {
                duplicate = debug.duplicate.map { it.toMutableList() }
                ingested = debug.ingested.map { it.toMutableList() }
                additionalProperties = debug.additionalProperties.toMutableMap()
            }

            fun duplicate(duplicate: List<String>) = duplicate(JsonField.of(duplicate))

            fun duplicate(duplicate: JsonField<List<String>>) = apply {
                this.duplicate = duplicate.map { it.toMutableList() }
            }

            fun addDuplicate(duplicate: String) = apply {
                this.duplicate =
                    (this.duplicate ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(duplicate)
                    }
            }

            fun ingested(ingested: List<String>) = ingested(JsonField.of(ingested))

            fun ingested(ingested: JsonField<List<String>>) = apply {
                this.ingested = ingested.map { it.toMutableList() }
            }

            fun addIngested(ingested: String) = apply {
                this.ingested =
                    (this.ingested ?: JsonField.of(mutableListOf())).apply {
                        (asKnown()
                                ?: throw IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                ))
                            .add(ingested)
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

            fun build(): Debug =
                Debug(
                    checkRequired("duplicate", duplicate).map { it.toImmutable() },
                    checkRequired("ingested", ingested).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Debug && duplicate == other.duplicate && ingested == other.ingested && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(duplicate, ingested, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Debug{duplicate=$duplicate, ingested=$ingested, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventIngestResponse && validationFailed == other.validationFailed && debug == other.debug && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(validationFailed, debug, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventIngestResponse{validationFailed=$validationFailed, debug=$debug, additionalProperties=$additionalProperties}"
}
