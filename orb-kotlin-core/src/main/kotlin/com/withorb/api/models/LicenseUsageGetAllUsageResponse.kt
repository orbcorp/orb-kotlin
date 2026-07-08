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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

class LicenseUsageGetAllUsageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val paginationMetadata: JsonField<PaginationMetadata>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("pagination_metadata")
        @ExcludeMissing
        paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
    ) : this(data, paginationMetadata, mutableMapOf())

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paginationMetadata(): PaginationMetadata =
        paginationMetadata.getRequired("pagination_metadata")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    /**
     * Returns the raw JSON value of [paginationMetadata].
     *
     * Unlike [paginationMetadata], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pagination_metadata")
    @ExcludeMissing
    fun _paginationMetadata(): JsonField<PaginationMetadata> = paginationMetadata

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
         * Returns a mutable builder for constructing an instance of
         * [LicenseUsageGetAllUsageResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .paginationMetadata()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [LicenseUsageGetAllUsageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var paginationMetadata: JsonField<PaginationMetadata>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(licenseUsageGetAllUsageResponse: LicenseUsageGetAllUsageResponse) =
            apply {
                data = licenseUsageGetAllUsageResponse.data.map { it.toMutableList() }
                paginationMetadata = licenseUsageGetAllUsageResponse.paginationMetadata
                additionalProperties =
                    licenseUsageGetAllUsageResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun paginationMetadata(paginationMetadata: PaginationMetadata) =
            paginationMetadata(JsonField.of(paginationMetadata))

        /**
         * Sets [Builder.paginationMetadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paginationMetadata] with a well-typed
         * [PaginationMetadata] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
            this.paginationMetadata = paginationMetadata
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
         * Returns an immutable instance of [LicenseUsageGetAllUsageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * .paginationMetadata()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseUsageGetAllUsageResponse =
            LicenseUsageGetAllUsageResponse(
                checkRequired("data", data).map { it.toImmutable() },
                checkRequired("paginationMetadata", paginationMetadata),
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
    fun validate(): LicenseUsageGetAllUsageResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        paginationMetadata().validate()
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
        (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (paginationMetadata.asKnown()?.validity() ?: 0)

    /**
     * The LicenseUsage resource represents usage and remaining credits for a license over a date
     * range.
     *
     * When grouped by 'day' only, license_id and external_license_id will be null as the data is
     * aggregated across all licenses.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allocatedCredits: JsonField<Double>,
        private val consumedCredits: JsonField<Double>,
        private val endDate: JsonField<LocalDate>,
        private val licenseTypeId: JsonField<String>,
        private val pricingUnit: JsonField<String>,
        private val remainingCredits: JsonField<Double>,
        private val startDate: JsonField<LocalDate>,
        private val subscriptionId: JsonField<String>,
        private val allocationEligibleCredits: JsonField<Double>,
        private val externalLicenseId: JsonField<String>,
        private val licenseId: JsonField<String>,
        private val sharedPoolCredits: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allocated_credits")
            @ExcludeMissing
            allocatedCredits: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("consumed_credits")
            @ExcludeMissing
            consumedCredits: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("license_type_id")
            @ExcludeMissing
            licenseTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pricing_unit")
            @ExcludeMissing
            pricingUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("remaining_credits")
            @ExcludeMissing
            remainingCredits: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allocation_eligible_credits")
            @ExcludeMissing
            allocationEligibleCredits: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("external_license_id")
            @ExcludeMissing
            externalLicenseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("license_id")
            @ExcludeMissing
            licenseId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("shared_pool_credits")
            @ExcludeMissing
            sharedPoolCredits: JsonField<Double> = JsonMissing.of(),
        ) : this(
            allocatedCredits,
            consumedCredits,
            endDate,
            licenseTypeId,
            pricingUnit,
            remainingCredits,
            startDate,
            subscriptionId,
            allocationEligibleCredits,
            externalLicenseId,
            licenseId,
            sharedPoolCredits,
            mutableMapOf(),
        )

        /**
         * The total credits allocated to this license for the period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun allocatedCredits(): Double = allocatedCredits.getRequired("allocated_credits")

        /**
         * The credits consumed by this license for the period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun consumedCredits(): Double = consumedCredits.getRequired("consumed_credits")

        /**
         * The end date of the usage period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endDate(): LocalDate = endDate.getRequired("end_date")

        /**
         * The unique identifier for the license type.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun licenseTypeId(): String = licenseTypeId.getRequired("license_type_id")

        /**
         * The pricing unit for the credits (e.g., 'credits').
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricingUnit(): String = pricingUnit.getRequired("pricing_unit")

        /**
         * The remaining credits available for this license (allocated - consumed).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun remainingCredits(): Double = remainingCredits.getRequired("remaining_credits")

        /**
         * The start date of the usage period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): LocalDate = startDate.getRequired("start_date")

        /**
         * The unique identifier for the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

        /**
         * Credits consumed while the license was active (eligible for individual allocation
         * deduction).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocationEligibleCredits(): Double? =
            allocationEligibleCredits.getNullable("allocation_eligible_credits")

        /**
         * The external identifier for the license. Null when grouped by day only.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalLicenseId(): String? = externalLicenseId.getNullable("external_license_id")

        /**
         * The unique identifier for the license. Null when grouped by day only.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun licenseId(): String? = licenseId.getNullable("license_id")

        /**
         * Credits consumed while the license was inactive (draws from shared pool, not individual
         * allocation).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun sharedPoolCredits(): Double? = sharedPoolCredits.getNullable("shared_pool_credits")

        /**
         * Returns the raw JSON value of [allocatedCredits].
         *
         * Unlike [allocatedCredits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocated_credits")
        @ExcludeMissing
        fun _allocatedCredits(): JsonField<Double> = allocatedCredits

        /**
         * Returns the raw JSON value of [consumedCredits].
         *
         * Unlike [consumedCredits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("consumed_credits")
        @ExcludeMissing
        fun _consumedCredits(): JsonField<Double> = consumedCredits

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<LocalDate> = endDate

        /**
         * Returns the raw JSON value of [licenseTypeId].
         *
         * Unlike [licenseTypeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("license_type_id")
        @ExcludeMissing
        fun _licenseTypeId(): JsonField<String> = licenseTypeId

        /**
         * Returns the raw JSON value of [pricingUnit].
         *
         * Unlike [pricingUnit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pricing_unit")
        @ExcludeMissing
        fun _pricingUnit(): JsonField<String> = pricingUnit

        /**
         * Returns the raw JSON value of [remainingCredits].
         *
         * Unlike [remainingCredits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("remaining_credits")
        @ExcludeMissing
        fun _remainingCredits(): JsonField<Double> = remainingCredits

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<LocalDate> = startDate

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /**
         * Returns the raw JSON value of [allocationEligibleCredits].
         *
         * Unlike [allocationEligibleCredits], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allocation_eligible_credits")
        @ExcludeMissing
        fun _allocationEligibleCredits(): JsonField<Double> = allocationEligibleCredits

        /**
         * Returns the raw JSON value of [externalLicenseId].
         *
         * Unlike [externalLicenseId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_license_id")
        @ExcludeMissing
        fun _externalLicenseId(): JsonField<String> = externalLicenseId

        /**
         * Returns the raw JSON value of [licenseId].
         *
         * Unlike [licenseId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("license_id") @ExcludeMissing fun _licenseId(): JsonField<String> = licenseId

        /**
         * Returns the raw JSON value of [sharedPoolCredits].
         *
         * Unlike [sharedPoolCredits], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shared_pool_credits")
        @ExcludeMissing
        fun _sharedPoolCredits(): JsonField<Double> = sharedPoolCredits

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .allocatedCredits()
             * .consumedCredits()
             * .endDate()
             * .licenseTypeId()
             * .pricingUnit()
             * .remainingCredits()
             * .startDate()
             * .subscriptionId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var allocatedCredits: JsonField<Double>? = null
            private var consumedCredits: JsonField<Double>? = null
            private var endDate: JsonField<LocalDate>? = null
            private var licenseTypeId: JsonField<String>? = null
            private var pricingUnit: JsonField<String>? = null
            private var remainingCredits: JsonField<Double>? = null
            private var startDate: JsonField<LocalDate>? = null
            private var subscriptionId: JsonField<String>? = null
            private var allocationEligibleCredits: JsonField<Double> = JsonMissing.of()
            private var externalLicenseId: JsonField<String> = JsonMissing.of()
            private var licenseId: JsonField<String> = JsonMissing.of()
            private var sharedPoolCredits: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                allocatedCredits = data.allocatedCredits
                consumedCredits = data.consumedCredits
                endDate = data.endDate
                licenseTypeId = data.licenseTypeId
                pricingUnit = data.pricingUnit
                remainingCredits = data.remainingCredits
                startDate = data.startDate
                subscriptionId = data.subscriptionId
                allocationEligibleCredits = data.allocationEligibleCredits
                externalLicenseId = data.externalLicenseId
                licenseId = data.licenseId
                sharedPoolCredits = data.sharedPoolCredits
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** The total credits allocated to this license for the period. */
            fun allocatedCredits(allocatedCredits: Double) =
                allocatedCredits(JsonField.of(allocatedCredits))

            /**
             * Sets [Builder.allocatedCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocatedCredits] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allocatedCredits(allocatedCredits: JsonField<Double>) = apply {
                this.allocatedCredits = allocatedCredits
            }

            /** The credits consumed by this license for the period. */
            fun consumedCredits(consumedCredits: Double) =
                consumedCredits(JsonField.of(consumedCredits))

            /**
             * Sets [Builder.consumedCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.consumedCredits] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun consumedCredits(consumedCredits: JsonField<Double>) = apply {
                this.consumedCredits = consumedCredits
            }

            /** The end date of the usage period. */
            fun endDate(endDate: LocalDate) = endDate(JsonField.of(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<LocalDate>) = apply { this.endDate = endDate }

            /** The unique identifier for the license type. */
            fun licenseTypeId(licenseTypeId: String) = licenseTypeId(JsonField.of(licenseTypeId))

            /**
             * Sets [Builder.licenseTypeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseTypeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun licenseTypeId(licenseTypeId: JsonField<String>) = apply {
                this.licenseTypeId = licenseTypeId
            }

            /** The pricing unit for the credits (e.g., 'credits'). */
            fun pricingUnit(pricingUnit: String) = pricingUnit(JsonField.of(pricingUnit))

            /**
             * Sets [Builder.pricingUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricingUnit(pricingUnit: JsonField<String>) = apply {
                this.pricingUnit = pricingUnit
            }

            /** The remaining credits available for this license (allocated - consumed). */
            fun remainingCredits(remainingCredits: Double) =
                remainingCredits(JsonField.of(remainingCredits))

            /**
             * Sets [Builder.remainingCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remainingCredits] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remainingCredits(remainingCredits: JsonField<Double>) = apply {
                this.remainingCredits = remainingCredits
            }

            /** The start date of the usage period. */
            fun startDate(startDate: LocalDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<LocalDate>) = apply { this.startDate = startDate }

            /** The unique identifier for the subscription. */
            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
            }

            /**
             * Credits consumed while the license was active (eligible for individual allocation
             * deduction).
             */
            fun allocationEligibleCredits(allocationEligibleCredits: Double?) =
                allocationEligibleCredits(JsonField.ofNullable(allocationEligibleCredits))

            /**
             * Alias for [Builder.allocationEligibleCredits].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allocationEligibleCredits(allocationEligibleCredits: Double) =
                allocationEligibleCredits(allocationEligibleCredits as Double?)

            /**
             * Sets [Builder.allocationEligibleCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationEligibleCredits] with a well-typed
             * [Double] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allocationEligibleCredits(allocationEligibleCredits: JsonField<Double>) = apply {
                this.allocationEligibleCredits = allocationEligibleCredits
            }

            /** The external identifier for the license. Null when grouped by day only. */
            fun externalLicenseId(externalLicenseId: String?) =
                externalLicenseId(JsonField.ofNullable(externalLicenseId))

            /**
             * Sets [Builder.externalLicenseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalLicenseId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalLicenseId(externalLicenseId: JsonField<String>) = apply {
                this.externalLicenseId = externalLicenseId
            }

            /** The unique identifier for the license. Null when grouped by day only. */
            fun licenseId(licenseId: String?) = licenseId(JsonField.ofNullable(licenseId))

            /**
             * Sets [Builder.licenseId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun licenseId(licenseId: JsonField<String>) = apply { this.licenseId = licenseId }

            /**
             * Credits consumed while the license was inactive (draws from shared pool, not
             * individual allocation).
             */
            fun sharedPoolCredits(sharedPoolCredits: Double?) =
                sharedPoolCredits(JsonField.ofNullable(sharedPoolCredits))

            /**
             * Alias for [Builder.sharedPoolCredits].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun sharedPoolCredits(sharedPoolCredits: Double) =
                sharedPoolCredits(sharedPoolCredits as Double?)

            /**
             * Sets [Builder.sharedPoolCredits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sharedPoolCredits] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sharedPoolCredits(sharedPoolCredits: JsonField<Double>) = apply {
                this.sharedPoolCredits = sharedPoolCredits
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .allocatedCredits()
             * .consumedCredits()
             * .endDate()
             * .licenseTypeId()
             * .pricingUnit()
             * .remainingCredits()
             * .startDate()
             * .subscriptionId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("allocatedCredits", allocatedCredits),
                    checkRequired("consumedCredits", consumedCredits),
                    checkRequired("endDate", endDate),
                    checkRequired("licenseTypeId", licenseTypeId),
                    checkRequired("pricingUnit", pricingUnit),
                    checkRequired("remainingCredits", remainingCredits),
                    checkRequired("startDate", startDate),
                    checkRequired("subscriptionId", subscriptionId),
                    allocationEligibleCredits,
                    externalLicenseId,
                    licenseId,
                    sharedPoolCredits,
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
        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            allocatedCredits()
            consumedCredits()
            endDate()
            licenseTypeId()
            pricingUnit()
            remainingCredits()
            startDate()
            subscriptionId()
            allocationEligibleCredits()
            externalLicenseId()
            licenseId()
            sharedPoolCredits()
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
            (if (allocatedCredits.asKnown() == null) 0 else 1) +
                (if (consumedCredits.asKnown() == null) 0 else 1) +
                (if (endDate.asKnown() == null) 0 else 1) +
                (if (licenseTypeId.asKnown() == null) 0 else 1) +
                (if (pricingUnit.asKnown() == null) 0 else 1) +
                (if (remainingCredits.asKnown() == null) 0 else 1) +
                (if (startDate.asKnown() == null) 0 else 1) +
                (if (subscriptionId.asKnown() == null) 0 else 1) +
                (if (allocationEligibleCredits.asKnown() == null) 0 else 1) +
                (if (externalLicenseId.asKnown() == null) 0 else 1) +
                (if (licenseId.asKnown() == null) 0 else 1) +
                (if (sharedPoolCredits.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                allocatedCredits == other.allocatedCredits &&
                consumedCredits == other.consumedCredits &&
                endDate == other.endDate &&
                licenseTypeId == other.licenseTypeId &&
                pricingUnit == other.pricingUnit &&
                remainingCredits == other.remainingCredits &&
                startDate == other.startDate &&
                subscriptionId == other.subscriptionId &&
                allocationEligibleCredits == other.allocationEligibleCredits &&
                externalLicenseId == other.externalLicenseId &&
                licenseId == other.licenseId &&
                sharedPoolCredits == other.sharedPoolCredits &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allocatedCredits,
                consumedCredits,
                endDate,
                licenseTypeId,
                pricingUnit,
                remainingCredits,
                startDate,
                subscriptionId,
                allocationEligibleCredits,
                externalLicenseId,
                licenseId,
                sharedPoolCredits,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{allocatedCredits=$allocatedCredits, consumedCredits=$consumedCredits, endDate=$endDate, licenseTypeId=$licenseTypeId, pricingUnit=$pricingUnit, remainingCredits=$remainingCredits, startDate=$startDate, subscriptionId=$subscriptionId, allocationEligibleCredits=$allocationEligibleCredits, externalLicenseId=$externalLicenseId, licenseId=$licenseId, sharedPoolCredits=$sharedPoolCredits, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseUsageGetAllUsageResponse &&
            data == other.data &&
            paginationMetadata == other.paginationMetadata &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(data, paginationMetadata, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LicenseUsageGetAllUsageResponse{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"
}
