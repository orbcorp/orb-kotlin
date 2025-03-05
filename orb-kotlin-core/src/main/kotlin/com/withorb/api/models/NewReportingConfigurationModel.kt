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
class NewReportingConfigurationModel
@JsonCreator
private constructor(
    @JsonProperty("exempt")
    @ExcludeMissing
    private val exempt: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun exempt(): Boolean = exempt.getRequired("exempt")

    @JsonProperty("exempt") @ExcludeMissing fun _exempt(): JsonField<Boolean> = exempt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): NewReportingConfigurationModel = apply {
        if (validated) {
            return@apply
        }

        exempt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [NewReportingConfigurationModel].
         *
         * The following fields are required:
         * ```kotlin
         * .exempt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [NewReportingConfigurationModel]. */
    class Builder internal constructor() {

        private var exempt: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(newReportingConfigurationModel: NewReportingConfigurationModel) = apply {
            exempt = newReportingConfigurationModel.exempt
            additionalProperties =
                newReportingConfigurationModel.additionalProperties.toMutableMap()
        }

        fun exempt(exempt: Boolean) = exempt(JsonField.of(exempt))

        fun exempt(exempt: JsonField<Boolean>) = apply { this.exempt = exempt }

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

        fun build(): NewReportingConfigurationModel =
            NewReportingConfigurationModel(
                checkRequired("exempt", exempt),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NewReportingConfigurationModel && exempt == other.exempt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(exempt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NewReportingConfigurationModel{exempt=$exempt, additionalProperties=$additionalProperties}"
}
