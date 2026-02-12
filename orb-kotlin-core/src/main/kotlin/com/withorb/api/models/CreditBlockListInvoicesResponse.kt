// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class CreditBlockListInvoicesResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val block: JsonField<Block>,
    private val invoices: JsonField<List<Invoice>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("block") @ExcludeMissing block: JsonField<Block> = JsonMissing.of(),
        @JsonProperty("invoices")
        @ExcludeMissing
        invoices: JsonField<List<Invoice>> = JsonMissing.of(),
    ) : this(block, invoices, mutableMapOf())

    /**
     * The Credit Block resource models prepaid credits within Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun block(): Block = block.getRequired("block")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoices(): List<Invoice> = invoices.getRequired("invoices")

    /**
     * Returns the raw JSON value of [block].
     *
     * Unlike [block], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("block") @ExcludeMissing fun _block(): JsonField<Block> = block

    /**
     * Returns the raw JSON value of [invoices].
     *
     * Unlike [invoices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoices") @ExcludeMissing fun _invoices(): JsonField<List<Invoice>> = invoices

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
         * [CreditBlockListInvoicesResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .block()
         * .invoices()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditBlockListInvoicesResponse]. */
    class Builder internal constructor() {

        private var block: JsonField<Block>? = null
        private var invoices: JsonField<MutableList<Invoice>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditBlockListInvoicesResponse: CreditBlockListInvoicesResponse) =
            apply {
                block = creditBlockListInvoicesResponse.block
                invoices = creditBlockListInvoicesResponse.invoices.map { it.toMutableList() }
                additionalProperties =
                    creditBlockListInvoicesResponse.additionalProperties.toMutableMap()
            }

        /** The Credit Block resource models prepaid credits within Orb. */
        fun block(block: Block) = block(JsonField.of(block))

        /**
         * Sets [Builder.block] to an arbitrary JSON value.
         *
         * You should usually call [Builder.block] with a well-typed [Block] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun block(block: JsonField<Block>) = apply { this.block = block }

        fun invoices(invoices: List<Invoice>) = invoices(JsonField.of(invoices))

        /**
         * Sets [Builder.invoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoices] with a well-typed `List<Invoice>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoices(invoices: JsonField<List<Invoice>>) = apply {
            this.invoices = invoices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Invoice] to [invoices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInvoice(invoice: Invoice) = apply {
            invoices =
                (invoices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("invoices", it).add(invoice)
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
         * Returns an immutable instance of [CreditBlockListInvoicesResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .block()
         * .invoices()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CreditBlockListInvoicesResponse =
            CreditBlockListInvoicesResponse(
                checkRequired("block", block),
                checkRequired("invoices", invoices).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CreditBlockListInvoicesResponse = apply {
        if (validated) {
            return@apply
        }

        block().validate()
        invoices().forEach { it.validate() }
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
        (block.asKnown()?.validity() ?: 0) +
            (invoices.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /** The Credit Block resource models prepaid credits within Orb. */
    class Block
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val balance: JsonField<Double>,
        private val effectiveDate: JsonField<OffsetDateTime>,
        private val expiryDate: JsonField<OffsetDateTime>,
        private val filters: JsonField<List<Filter>>,
        private val maximumInitialBalance: JsonField<Double>,
        private val metadata: JsonField<Metadata>,
        private val perUnitCostBasis: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("balance") @ExcludeMissing balance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("expiry_date")
            @ExcludeMissing
            expiryDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("filters")
            @ExcludeMissing
            filters: JsonField<List<Filter>> = JsonMissing.of(),
            @JsonProperty("maximum_initial_balance")
            @ExcludeMissing
            maximumInitialBalance: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("per_unit_cost_basis")
            @ExcludeMissing
            perUnitCostBasis: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(
            id,
            balance,
            effectiveDate,
            expiryDate,
            filters,
            maximumInitialBalance,
            metadata,
            perUnitCostBasis,
            status,
            mutableMapOf(),
        )

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun balance(): Double = balance.getRequired("balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun effectiveDate(): OffsetDateTime? = effectiveDate.getNullable("effective_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiryDate(): OffsetDateTime? = expiryDate.getNullable("expiry_date")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun filters(): List<Filter> = filters.getRequired("filters")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumInitialBalance(): Double? =
            maximumInitialBalance.getNullable("maximum_initial_balance")

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Metadata = metadata.getRequired("metadata")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun perUnitCostBasis(): String? = perUnitCostBasis.getNullable("per_unit_cost_basis")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [balance].
         *
         * Unlike [balance], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<Double> = balance

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

        /**
         * Returns the raw JSON value of [expiryDate].
         *
         * Unlike [expiryDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiry_date")
        @ExcludeMissing
        fun _expiryDate(): JsonField<OffsetDateTime> = expiryDate

        /**
         * Returns the raw JSON value of [filters].
         *
         * Unlike [filters], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filters") @ExcludeMissing fun _filters(): JsonField<List<Filter>> = filters

        /**
         * Returns the raw JSON value of [maximumInitialBalance].
         *
         * Unlike [maximumInitialBalance], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maximum_initial_balance")
        @ExcludeMissing
        fun _maximumInitialBalance(): JsonField<Double> = maximumInitialBalance

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [perUnitCostBasis].
         *
         * Unlike [perUnitCostBasis], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("per_unit_cost_basis")
        @ExcludeMissing
        fun _perUnitCostBasis(): JsonField<String> = perUnitCostBasis

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
             * Returns a mutable builder for constructing an instance of [Block].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .balance()
             * .effectiveDate()
             * .expiryDate()
             * .filters()
             * .maximumInitialBalance()
             * .metadata()
             * .perUnitCostBasis()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Block]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var balance: JsonField<Double>? = null
            private var effectiveDate: JsonField<OffsetDateTime>? = null
            private var expiryDate: JsonField<OffsetDateTime>? = null
            private var filters: JsonField<MutableList<Filter>>? = null
            private var maximumInitialBalance: JsonField<Double>? = null
            private var metadata: JsonField<Metadata>? = null
            private var perUnitCostBasis: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(block: Block) = apply {
                id = block.id
                balance = block.balance
                effectiveDate = block.effectiveDate
                expiryDate = block.expiryDate
                filters = block.filters.map { it.toMutableList() }
                maximumInitialBalance = block.maximumInitialBalance
                metadata = block.metadata
                perUnitCostBasis = block.perUnitCostBasis
                status = block.status
                additionalProperties = block.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun balance(balance: Double) = balance(JsonField.of(balance))

            /**
             * Sets [Builder.balance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.balance] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun balance(balance: JsonField<Double>) = apply { this.balance = balance }

            fun effectiveDate(effectiveDate: OffsetDateTime?) =
                effectiveDate(JsonField.ofNullable(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                this.effectiveDate = effectiveDate
            }

            fun expiryDate(expiryDate: OffsetDateTime?) =
                expiryDate(JsonField.ofNullable(expiryDate))

            /**
             * Sets [Builder.expiryDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiryDate] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiryDate(expiryDate: JsonField<OffsetDateTime>) = apply {
                this.expiryDate = expiryDate
            }

            fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

            /**
             * Sets [Builder.filters] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filters] with a well-typed `List<Filter>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filters(filters: JsonField<List<Filter>>) = apply {
                this.filters = filters.map { it.toMutableList() }
            }

            /**
             * Adds a single [Filter] to [filters].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFilter(filter: Filter) = apply {
                filters =
                    (filters ?: JsonField.of(mutableListOf())).also {
                        checkKnown("filters", it).add(filter)
                    }
            }

            fun maximumInitialBalance(maximumInitialBalance: Double?) =
                maximumInitialBalance(JsonField.ofNullable(maximumInitialBalance))

            /**
             * Alias for [Builder.maximumInitialBalance].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maximumInitialBalance(maximumInitialBalance: Double) =
                maximumInitialBalance(maximumInitialBalance as Double?)

            /**
             * Sets [Builder.maximumInitialBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumInitialBalance] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maximumInitialBalance(maximumInitialBalance: JsonField<Double>) = apply {
                this.maximumInitialBalance = maximumInitialBalance
            }

            /**
             * User specified key-value pairs for the resource. If not present, this defaults to an
             * empty dictionary. Individual keys can be removed by setting the value to `null`, and
             * the entire metadata mapping can be cleared by setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun perUnitCostBasis(perUnitCostBasis: String?) =
                perUnitCostBasis(JsonField.ofNullable(perUnitCostBasis))

            /**
             * Sets [Builder.perUnitCostBasis] to an arbitrary JSON value.
             *
             * You should usually call [Builder.perUnitCostBasis] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun perUnitCostBasis(perUnitCostBasis: JsonField<String>) = apply {
                this.perUnitCostBasis = perUnitCostBasis
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Block].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .balance()
             * .effectiveDate()
             * .expiryDate()
             * .filters()
             * .maximumInitialBalance()
             * .metadata()
             * .perUnitCostBasis()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Block =
                Block(
                    checkRequired("id", id),
                    checkRequired("balance", balance),
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("expiryDate", expiryDate),
                    checkRequired("filters", filters).map { it.toImmutable() },
                    checkRequired("maximumInitialBalance", maximumInitialBalance),
                    checkRequired("metadata", metadata),
                    checkRequired("perUnitCostBasis", perUnitCostBasis),
                    checkRequired("status", status),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Block = apply {
            if (validated) {
                return@apply
            }

            id()
            balance()
            effectiveDate()
            expiryDate()
            filters().forEach { it.validate() }
            maximumInitialBalance()
            metadata().validate()
            perUnitCostBasis()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (if (balance.asKnown() == null) 0 else 1) +
                (if (effectiveDate.asKnown() == null) 0 else 1) +
                (if (expiryDate.asKnown() == null) 0 else 1) +
                (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (maximumInitialBalance.asKnown() == null) 0 else 1) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (perUnitCostBasis.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0)

        class Filter
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val field: JsonField<Field>,
            private val operator: JsonField<Operator>,
            private val values: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("field") @ExcludeMissing field: JsonField<Field> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("values")
                @ExcludeMissing
                values: JsonField<List<String>> = JsonMissing.of(),
            ) : this(field, operator, values, mutableMapOf())

            /**
             * The property of the price to filter on.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun field(): Field = field.getRequired("field")

            /**
             * Should prices that match the filter be included or excluded.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * The IDs or values that match this filter.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun values(): List<String> = values.getRequired("values")

            /**
             * Returns the raw JSON value of [field].
             *
             * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<Field> = field

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [values].
             *
             * Unlike [values], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("values") @ExcludeMissing fun _values(): JsonField<List<String>> = values

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
                 * Returns a mutable builder for constructing an instance of [Filter].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .field()
                 * .operator()
                 * .values()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Filter]. */
            class Builder internal constructor() {

                private var field: JsonField<Field>? = null
                private var operator: JsonField<Operator>? = null
                private var values: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(filter: Filter) = apply {
                    field = filter.field
                    operator = filter.operator
                    values = filter.values.map { it.toMutableList() }
                    additionalProperties = filter.additionalProperties.toMutableMap()
                }

                /** The property of the price to filter on. */
                fun field(field: Field) = field(JsonField.of(field))

                /**
                 * Sets [Builder.field] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.field] with a well-typed [Field] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun field(field: JsonField<Field>) = apply { this.field = field }

                /** Should prices that match the filter be included or excluded. */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                /** The IDs or values that match this filter. */
                fun values(values: List<String>) = values(JsonField.of(values))

                /**
                 * Sets [Builder.values] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.values] with a well-typed `List<String>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun values(values: JsonField<List<String>>) = apply {
                    this.values = values.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [values].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addValue(value: String) = apply {
                    values =
                        (values ?: JsonField.of(mutableListOf())).also {
                            checkKnown("values", it).add(value)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Filter].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .field()
                 * .operator()
                 * .values()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Filter =
                    Filter(
                        checkRequired("field", field),
                        checkRequired("operator", operator),
                        checkRequired("values", values).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Filter = apply {
                if (validated) {
                    return@apply
                }

                field().validate()
                operator().validate()
                values()
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
                (field.asKnown()?.validity() ?: 0) +
                    (operator.asKnown()?.validity() ?: 0) +
                    (values.asKnown()?.size ?: 0)

            /** The property of the price to filter on. */
            class Field @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PRICE_ID = of("price_id")

                    val ITEM_ID = of("item_id")

                    val PRICE_TYPE = of("price_type")

                    val CURRENCY = of("currency")

                    val PRICING_UNIT_ID = of("pricing_unit_id")

                    fun of(value: String) = Field(JsonField.of(value))
                }

                /** An enum containing [Field]'s known values. */
                enum class Known {
                    PRICE_ID,
                    ITEM_ID,
                    PRICE_TYPE,
                    CURRENCY,
                    PRICING_UNIT_ID,
                }

                /**
                 * An enum containing [Field]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Field] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PRICE_ID,
                    ITEM_ID,
                    PRICE_TYPE,
                    CURRENCY,
                    PRICING_UNIT_ID,
                    /**
                     * An enum member indicating that [Field] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PRICE_ID -> Value.PRICE_ID
                        ITEM_ID -> Value.ITEM_ID
                        PRICE_TYPE -> Value.PRICE_TYPE
                        CURRENCY -> Value.CURRENCY
                        PRICING_UNIT_ID -> Value.PRICING_UNIT_ID
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
                        PRICE_ID -> Known.PRICE_ID
                        ITEM_ID -> Known.ITEM_ID
                        PRICE_TYPE -> Known.PRICE_TYPE
                        CURRENCY -> Known.CURRENCY
                        PRICING_UNIT_ID -> Known.PRICING_UNIT_ID
                        else -> throw OrbInvalidDataException("Unknown Field: $value")
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

                fun validate(): Field = apply {
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

                    return other is Field && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Should prices that match the filter be included or excluded. */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val INCLUDES = of("includes")

                    val EXCLUDES = of("excludes")

                    fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    INCLUDES,
                    EXCLUDES,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INCLUDES,
                    EXCLUDES,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        INCLUDES -> Value.INCLUDES
                        EXCLUDES -> Value.EXCLUDES
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
                        INCLUDES -> Known.INCLUDES
                        EXCLUDES -> Known.EXCLUDES
                        else -> throw OrbInvalidDataException("Unknown Operator: $value")
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

                fun validate(): Operator = apply {
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

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Filter &&
                    field == other.field &&
                    operator == other.operator &&
                    values == other.values &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(field, operator, values, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Filter{field=$field, operator=$operator, values=$values, additionalProperties=$additionalProperties}"
        }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        class Metadata
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Metadata]. */
                fun builder() = Builder()
            }

            /** A builder for [Metadata]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(metadata: Metadata) = apply {
                    additionalProperties = metadata.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Metadata].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            fun validate(): Metadata = apply {
                if (validated) {
                    return@apply
                }

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
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Metadata && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val ACTIVE = of("active")

                val PENDING_PAYMENT = of("pending_payment")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ACTIVE,
                PENDING_PAYMENT,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACTIVE,
                PENDING_PAYMENT,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ACTIVE -> Value.ACTIVE
                    PENDING_PAYMENT -> Value.PENDING_PAYMENT
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
                    ACTIVE -> Known.ACTIVE
                    PENDING_PAYMENT -> Known.PENDING_PAYMENT
                    else -> throw OrbInvalidDataException("Unknown Status: $value")
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

            return other is Block &&
                id == other.id &&
                balance == other.balance &&
                effectiveDate == other.effectiveDate &&
                expiryDate == other.expiryDate &&
                filters == other.filters &&
                maximumInitialBalance == other.maximumInitialBalance &&
                metadata == other.metadata &&
                perUnitCostBasis == other.perUnitCostBasis &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                balance,
                effectiveDate,
                expiryDate,
                filters,
                maximumInitialBalance,
                metadata,
                perUnitCostBasis,
                status,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Block{id=$id, balance=$balance, effectiveDate=$effectiveDate, expiryDate=$expiryDate, filters=$filters, maximumInitialBalance=$maximumInitialBalance, metadata=$metadata, perUnitCostBasis=$perUnitCostBasis, status=$status, additionalProperties=$additionalProperties}"
    }

    class Invoice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val customer: JsonField<CustomerMinified>,
        private val invoiceNumber: JsonField<String>,
        private val status: JsonField<Status>,
        private val subscription: JsonField<SubscriptionMinified>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<CustomerMinified> = JsonMissing.of(),
            @JsonProperty("invoice_number")
            @ExcludeMissing
            invoiceNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("subscription")
            @ExcludeMissing
            subscription: JsonField<SubscriptionMinified> = JsonMissing.of(),
        ) : this(id, customer, invoiceNumber, status, subscription, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): CustomerMinified = customer.getRequired("customer")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun subscription(): SubscriptionMinified? = subscription.getNullable("subscription")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [customer].
         *
         * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer")
        @ExcludeMissing
        fun _customer(): JsonField<CustomerMinified> = customer

        /**
         * Returns the raw JSON value of [invoiceNumber].
         *
         * Unlike [invoiceNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_number")
        @ExcludeMissing
        fun _invoiceNumber(): JsonField<String> = invoiceNumber

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [subscription].
         *
         * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription")
        @ExcludeMissing
        fun _subscription(): JsonField<SubscriptionMinified> = subscription

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
             * Returns a mutable builder for constructing an instance of [Invoice].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .customer()
             * .invoiceNumber()
             * .status()
             * .subscription()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Invoice]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var customer: JsonField<CustomerMinified>? = null
            private var invoiceNumber: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var subscription: JsonField<SubscriptionMinified>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoice: Invoice) = apply {
                id = invoice.id
                customer = invoice.customer
                invoiceNumber = invoice.invoiceNumber
                status = invoice.status
                subscription = invoice.subscription
                additionalProperties = invoice.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun customer(customer: CustomerMinified) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [CustomerMinified] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customer(customer: JsonField<CustomerMinified>) = apply { this.customer = customer }

            fun invoiceNumber(invoiceNumber: String) = invoiceNumber(JsonField.of(invoiceNumber))

            /**
             * Sets [Builder.invoiceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
                this.invoiceNumber = invoiceNumber
            }

            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            fun subscription(subscription: SubscriptionMinified?) =
                subscription(JsonField.ofNullable(subscription))

            /**
             * Sets [Builder.subscription] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscription] with a well-typed
             * [SubscriptionMinified] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun subscription(subscription: JsonField<SubscriptionMinified>) = apply {
                this.subscription = subscription
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
             * Returns an immutable instance of [Invoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .customer()
             * .invoiceNumber()
             * .status()
             * .subscription()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Invoice =
                Invoice(
                    checkRequired("id", id),
                    checkRequired("customer", customer),
                    checkRequired("invoiceNumber", invoiceNumber),
                    checkRequired("status", status),
                    checkRequired("subscription", subscription),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Invoice = apply {
            if (validated) {
                return@apply
            }

            id()
            customer().validate()
            invoiceNumber()
            status().validate()
            subscription()?.validate()
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
            (if (id.asKnown() == null) 0 else 1) +
                (customer.asKnown()?.validity() ?: 0) +
                (if (invoiceNumber.asKnown() == null) 0 else 1) +
                (status.asKnown()?.validity() ?: 0) +
                (subscription.asKnown()?.validity() ?: 0)

        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val ISSUED = of("issued")

                val PAID = of("paid")

                val SYNCED = of("synced")

                val VOID = of("void")

                val DRAFT = of("draft")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                ISSUED,
                PAID,
                SYNCED,
                VOID,
                DRAFT,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ISSUED,
                PAID,
                SYNCED,
                VOID,
                DRAFT,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    ISSUED -> Value.ISSUED
                    PAID -> Value.PAID
                    SYNCED -> Value.SYNCED
                    VOID -> Value.VOID
                    DRAFT -> Value.DRAFT
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
                    ISSUED -> Known.ISSUED
                    PAID -> Known.PAID
                    SYNCED -> Known.SYNCED
                    VOID -> Known.VOID
                    DRAFT -> Known.DRAFT
                    else -> throw OrbInvalidDataException("Unknown Status: $value")
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

            return other is Invoice &&
                id == other.id &&
                customer == other.customer &&
                invoiceNumber == other.invoiceNumber &&
                status == other.status &&
                subscription == other.subscription &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, customer, invoiceNumber, status, subscription, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Invoice{id=$id, customer=$customer, invoiceNumber=$invoiceNumber, status=$status, subscription=$subscription, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CreditBlockListInvoicesResponse &&
            block == other.block &&
            invoices == other.invoices &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(block, invoices, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditBlockListInvoicesResponse{block=$block, invoices=$invoices, additionalProperties=$additionalProperties}"
}
