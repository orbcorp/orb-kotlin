// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toImmutable
import java.util.Objects

@JsonDeserialize(builder = EventIngestResponse.Builder::class)
@NoAutoDetect
class EventIngestResponse
private constructor(
    private val debug: JsonField<Debug>,
    private val validationFailed: JsonField<List<ValidationFailed>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * Optional debug information (only present when debug=true is passed to the endpoint). Contains
     * ingested and duplicate event idempotency keys.
     */
    fun debug(): Debug? = debug.getNullable("debug")

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
    @JsonProperty("debug") @ExcludeMissing fun _debug() = debug

    /**
     * Contains all failing validation events. In the case of a 200, this array will always be
     * empty. This field will always be present.
     */
    @JsonProperty("validation_failed") @ExcludeMissing fun _validationFailed() = validationFailed

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): EventIngestResponse = apply {
        if (!validated) {
            debug()?.validate()
            validationFailed().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var debug: JsonField<Debug> = JsonMissing.of()
        private var validationFailed: JsonField<List<ValidationFailed>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(eventIngestResponse: EventIngestResponse) = apply {
            this.debug = eventIngestResponse.debug
            this.validationFailed = eventIngestResponse.validationFailed
            additionalProperties(eventIngestResponse.additionalProperties)
        }

        /**
         * Optional debug information (only present when debug=true is passed to the endpoint).
         * Contains ingested and duplicate event idempotency keys.
         */
        fun debug(debug: Debug) = debug(JsonField.of(debug))

        /**
         * Optional debug information (only present when debug=true is passed to the endpoint).
         * Contains ingested and duplicate event idempotency keys.
         */
        @JsonProperty("debug")
        @ExcludeMissing
        fun debug(debug: JsonField<Debug>) = apply { this.debug = debug }

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
        @JsonProperty("validation_failed")
        @ExcludeMissing
        fun validationFailed(validationFailed: JsonField<List<ValidationFailed>>) = apply {
            this.validationFailed = validationFailed
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

        fun build(): EventIngestResponse =
            EventIngestResponse(
                debug,
                validationFailed.map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = ValidationFailed.Builder::class)
    @NoAutoDetect
    class ValidationFailed
    private constructor(
        private val idempotencyKey: JsonField<String>,
        private val validationErrors: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** The passed idempotency_key corresponding to the validation_errors */
        fun idempotencyKey(): String = idempotencyKey.getRequired("idempotency_key")

        /** An array of strings corresponding to validation failures for this idempotency_key. */
        fun validationErrors(): List<String> = validationErrors.getRequired("validation_errors")

        /** The passed idempotency_key corresponding to the validation_errors */
        @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

        /** An array of strings corresponding to validation failures for this idempotency_key. */
        @JsonProperty("validation_errors")
        @ExcludeMissing
        fun _validationErrors() = validationErrors

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ValidationFailed = apply {
            if (!validated) {
                idempotencyKey()
                validationErrors()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var idempotencyKey: JsonField<String> = JsonMissing.of()
            private var validationErrors: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(validationFailed: ValidationFailed) = apply {
                this.idempotencyKey = validationFailed.idempotencyKey
                this.validationErrors = validationFailed.validationErrors
                additionalProperties(validationFailed.additionalProperties)
            }

            /** The passed idempotency_key corresponding to the validation_errors */
            fun idempotencyKey(idempotencyKey: String) =
                idempotencyKey(JsonField.of(idempotencyKey))

            /** The passed idempotency_key corresponding to the validation_errors */
            @JsonProperty("idempotency_key")
            @ExcludeMissing
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
            @JsonProperty("validation_errors")
            @ExcludeMissing
            fun validationErrors(validationErrors: JsonField<List<String>>) = apply {
                this.validationErrors = validationErrors
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

            fun build(): ValidationFailed =
                ValidationFailed(
                    idempotencyKey,
                    validationErrors.map { it.toImmutable() },
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
    @JsonDeserialize(builder = Debug.Builder::class)
    @NoAutoDetect
    class Debug
    private constructor(
        private val duplicate: JsonField<List<String>>,
        private val ingested: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun duplicate(): List<String> = duplicate.getRequired("duplicate")

        fun ingested(): List<String> = ingested.getRequired("ingested")

        @JsonProperty("duplicate") @ExcludeMissing fun _duplicate() = duplicate

        @JsonProperty("ingested") @ExcludeMissing fun _ingested() = ingested

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Debug = apply {
            if (!validated) {
                duplicate()
                ingested()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var duplicate: JsonField<List<String>> = JsonMissing.of()
            private var ingested: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(debug: Debug) = apply {
                this.duplicate = debug.duplicate
                this.ingested = debug.ingested
                additionalProperties(debug.additionalProperties)
            }

            fun duplicate(duplicate: List<String>) = duplicate(JsonField.of(duplicate))

            @JsonProperty("duplicate")
            @ExcludeMissing
            fun duplicate(duplicate: JsonField<List<String>>) = apply { this.duplicate = duplicate }

            fun ingested(ingested: List<String>) = ingested(JsonField.of(ingested))

            @JsonProperty("ingested")
            @ExcludeMissing
            fun ingested(ingested: JsonField<List<String>>) = apply { this.ingested = ingested }

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

            fun build(): Debug =
                Debug(
                    duplicate.map { it.toImmutable() },
                    ingested.map { it.toImmutable() },
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

        return /* spotless:off */ other is EventIngestResponse && debug == other.debug && validationFailed == other.validationFailed && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(debug, validationFailed, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EventIngestResponse{debug=$debug, validationFailed=$validationFailed, additionalProperties=$additionalProperties}"
}
