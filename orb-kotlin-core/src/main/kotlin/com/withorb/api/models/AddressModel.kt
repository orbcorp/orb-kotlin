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
class AddressModel
@JsonCreator
private constructor(
    @JsonProperty("city") @ExcludeMissing private val city: JsonField<String> = JsonMissing.of(),
    @JsonProperty("country")
    @ExcludeMissing
    private val country: JsonField<String> = JsonMissing.of(),
    @JsonProperty("line1") @ExcludeMissing private val line1: JsonField<String> = JsonMissing.of(),
    @JsonProperty("line2") @ExcludeMissing private val line2: JsonField<String> = JsonMissing.of(),
    @JsonProperty("postal_code")
    @ExcludeMissing
    private val postalCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("state") @ExcludeMissing private val state: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun city(): String? = city.getNullable("city")

    fun country(): String? = country.getNullable("country")

    fun line1(): String? = line1.getNullable("line1")

    fun line2(): String? = line2.getNullable("line2")

    fun postalCode(): String? = postalCode.getNullable("postal_code")

    fun state(): String? = state.getNullable("state")

    @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

    @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

    @JsonProperty("postal_code") @ExcludeMissing fun _postalCode(): JsonField<String> = postalCode

    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AddressModel = apply {
        if (validated) {
            return@apply
        }

        city()
        country()
        line1()
        line2()
        postalCode()
        state()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AddressModel].
         *
         * The following fields are required:
         * ```kotlin
         * .city()
         * .country()
         * .line1()
         * .line2()
         * .postalCode()
         * .state()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AddressModel]. */
    class Builder internal constructor() {

        private var city: JsonField<String>? = null
        private var country: JsonField<String>? = null
        private var line1: JsonField<String>? = null
        private var line2: JsonField<String>? = null
        private var postalCode: JsonField<String>? = null
        private var state: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(addressModel: AddressModel) = apply {
            city = addressModel.city
            country = addressModel.country
            line1 = addressModel.line1
            line2 = addressModel.line2
            postalCode = addressModel.postalCode
            state = addressModel.state
            additionalProperties = addressModel.additionalProperties.toMutableMap()
        }

        fun city(city: String?) = city(JsonField.ofNullable(city))

        fun city(city: JsonField<String>) = apply { this.city = city }

        fun country(country: String?) = country(JsonField.ofNullable(country))

        fun country(country: JsonField<String>) = apply { this.country = country }

        fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

        fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

        fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

        fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

        fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

        fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

        fun state(state: String?) = state(JsonField.ofNullable(state))

        fun state(state: JsonField<String>) = apply { this.state = state }

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

        fun build(): AddressModel =
            AddressModel(
                checkRequired("city", city),
                checkRequired("country", country),
                checkRequired("line1", line1),
                checkRequired("line2", line2),
                checkRequired("postalCode", postalCode),
                checkRequired("state", state),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AddressModel && city == other.city && country == other.country && line1 == other.line1 && line2 == other.line2 && postalCode == other.postalCode && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(city, country, line1, line2, postalCode, state, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AddressModel{city=$city, country=$country, line1=$line1, line2=$line2, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
}
