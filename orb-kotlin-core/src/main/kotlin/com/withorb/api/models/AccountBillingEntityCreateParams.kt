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
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * This endpoint creates a billing entity: a legal entity the account invoices from, with its own
 * legal name, address, tax registrations, and invoice settings. `external_billing_entity_id` cannot
 * be changed after creation. This endpoint requires an admin API key.
 */
class AccountBillingEntityCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The address printed on invoices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun address(): AddressInput = body.address()

    /**
     * The legal name printed on invoices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = body.legalName()

    /**
     * An internal name for the billing entity.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * An optional user-defined ID for this billing entity, unique within the account. This cannot
     * be changed after creation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalBillingEntityId(): String? = body.externalBillingEntityId()

    /**
     * Settings that override the account's for this billing entity.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoiceSettings(): InvoiceSettings? = body.invoiceSettings()

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun taxRegistrations(): List<TaxRegistration>? = body.taxRegistrations()

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _address(): JsonField<AddressInput> = body._address()

    /**
     * Returns the raw JSON value of [legalName].
     *
     * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _legalName(): JsonField<String> = body._legalName()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [externalBillingEntityId].
     *
     * Unlike [externalBillingEntityId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _externalBillingEntityId(): JsonField<String> = body._externalBillingEntityId()

    /**
     * Returns the raw JSON value of [invoiceSettings].
     *
     * Unlike [invoiceSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceSettings(): JsonField<InvoiceSettings> = body._invoiceSettings()

    /**
     * Returns the raw JSON value of [taxRegistrations].
     *
     * Unlike [taxRegistrations], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _taxRegistrations(): JsonField<List<TaxRegistration>> = body._taxRegistrations()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountBillingEntityCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .address()
         * .legalName()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountBillingEntityCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(accountBillingEntityCreateParams: AccountBillingEntityCreateParams) =
            apply {
                body = accountBillingEntityCreateParams.body.toBuilder()
                additionalHeaders = accountBillingEntityCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    accountBillingEntityCreateParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [address]
         * - [legalName]
         * - [name]
         * - [externalBillingEntityId]
         * - [invoiceSettings]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The address printed on invoices. */
        fun address(address: AddressInput) = apply { body.address(address) }

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [AddressInput] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun address(address: JsonField<AddressInput>) = apply { body.address(address) }

        /** The legal name printed on invoices. */
        fun legalName(legalName: String) = apply { body.legalName(legalName) }

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { body.legalName(legalName) }

        /** An internal name for the billing entity. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * An optional user-defined ID for this billing entity, unique within the account. This
         * cannot be changed after creation.
         */
        fun externalBillingEntityId(externalBillingEntityId: String?) = apply {
            body.externalBillingEntityId(externalBillingEntityId)
        }

        /**
         * Sets [Builder.externalBillingEntityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalBillingEntityId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalBillingEntityId(externalBillingEntityId: JsonField<String>) = apply {
            body.externalBillingEntityId(externalBillingEntityId)
        }

        /** Settings that override the account's for this billing entity. */
        fun invoiceSettings(invoiceSettings: InvoiceSettings?) = apply {
            body.invoiceSettings(invoiceSettings)
        }

        /**
         * Sets [Builder.invoiceSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceSettings] with a well-typed [InvoiceSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoiceSettings(invoiceSettings: JsonField<InvoiceSettings>) = apply {
            body.invoiceSettings(invoiceSettings)
        }

        fun taxRegistrations(taxRegistrations: List<TaxRegistration>) = apply {
            body.taxRegistrations(taxRegistrations)
        }

        /**
         * Sets [Builder.taxRegistrations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxRegistrations] with a well-typed
         * `List<TaxRegistration>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun taxRegistrations(taxRegistrations: JsonField<List<TaxRegistration>>) = apply {
            body.taxRegistrations(taxRegistrations)
        }

        /**
         * Adds a single [TaxRegistration] to [taxRegistrations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTaxRegistration(taxRegistration: TaxRegistration) = apply {
            body.addTaxRegistration(taxRegistration)
        }

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
         * Returns an immutable instance of [AccountBillingEntityCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .address()
         * .legalName()
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountBillingEntityCreateParams =
            AccountBillingEntityCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<AddressInput>,
        private val legalName: JsonField<String>,
        private val name: JsonField<String>,
        private val externalBillingEntityId: JsonField<String>,
        private val invoiceSettings: JsonField<InvoiceSettings>,
        private val taxRegistrations: JsonField<List<TaxRegistration>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address")
            @ExcludeMissing
            address: JsonField<AddressInput> = JsonMissing.of(),
            @JsonProperty("legal_name")
            @ExcludeMissing
            legalName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_billing_entity_id")
            @ExcludeMissing
            externalBillingEntityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_settings")
            @ExcludeMissing
            invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of(),
            @JsonProperty("tax_registrations")
            @ExcludeMissing
            taxRegistrations: JsonField<List<TaxRegistration>> = JsonMissing.of(),
        ) : this(
            address,
            legalName,
            name,
            externalBillingEntityId,
            invoiceSettings,
            taxRegistrations,
            mutableMapOf(),
        )

        /**
         * The address printed on invoices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): AddressInput = address.getRequired("address")

        /**
         * The legal name printed on invoices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun legalName(): String = legalName.getRequired("legal_name")

        /**
         * An internal name for the billing entity.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * An optional user-defined ID for this billing entity, unique within the account. This
         * cannot be changed after creation.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalBillingEntityId(): String? =
            externalBillingEntityId.getNullable("external_billing_entity_id")

        /**
         * Settings that override the account's for this billing entity.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceSettings(): InvoiceSettings? = invoiceSettings.getNullable("invoice_settings")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun taxRegistrations(): List<TaxRegistration>? =
            taxRegistrations.getNullable("tax_registrations")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<AddressInput> = address

        /**
         * Returns the raw JSON value of [legalName].
         *
         * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("legal_name") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [externalBillingEntityId].
         *
         * Unlike [externalBillingEntityId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("external_billing_entity_id")
        @ExcludeMissing
        fun _externalBillingEntityId(): JsonField<String> = externalBillingEntityId

        /**
         * Returns the raw JSON value of [invoiceSettings].
         *
         * Unlike [invoiceSettings], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_settings")
        @ExcludeMissing
        fun _invoiceSettings(): JsonField<InvoiceSettings> = invoiceSettings

        /**
         * Returns the raw JSON value of [taxRegistrations].
         *
         * Unlike [taxRegistrations], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tax_registrations")
        @ExcludeMissing
        fun _taxRegistrations(): JsonField<List<TaxRegistration>> = taxRegistrations

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
             * .address()
             * .legalName()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var address: JsonField<AddressInput>? = null
            private var legalName: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var externalBillingEntityId: JsonField<String> = JsonMissing.of()
            private var invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of()
            private var taxRegistrations: JsonField<MutableList<TaxRegistration>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                address = body.address
                legalName = body.legalName
                name = body.name
                externalBillingEntityId = body.externalBillingEntityId
                invoiceSettings = body.invoiceSettings
                taxRegistrations = body.taxRegistrations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The address printed on invoices. */
            fun address(address: AddressInput) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [AddressInput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<AddressInput>) = apply { this.address = address }

            /** The legal name printed on invoices. */
            fun legalName(legalName: String) = legalName(JsonField.of(legalName))

            /**
             * Sets [Builder.legalName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

            /** An internal name for the billing entity. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * An optional user-defined ID for this billing entity, unique within the account. This
             * cannot be changed after creation.
             */
            fun externalBillingEntityId(externalBillingEntityId: String?) =
                externalBillingEntityId(JsonField.ofNullable(externalBillingEntityId))

            /**
             * Sets [Builder.externalBillingEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalBillingEntityId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalBillingEntityId(externalBillingEntityId: JsonField<String>) = apply {
                this.externalBillingEntityId = externalBillingEntityId
            }

            /** Settings that override the account's for this billing entity. */
            fun invoiceSettings(invoiceSettings: InvoiceSettings?) =
                invoiceSettings(JsonField.ofNullable(invoiceSettings))

            /**
             * Sets [Builder.invoiceSettings] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceSettings] with a well-typed [InvoiceSettings]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceSettings(invoiceSettings: JsonField<InvoiceSettings>) = apply {
                this.invoiceSettings = invoiceSettings
            }

            fun taxRegistrations(taxRegistrations: List<TaxRegistration>) =
                taxRegistrations(JsonField.of(taxRegistrations))

            /**
             * Sets [Builder.taxRegistrations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxRegistrations] with a well-typed
             * `List<TaxRegistration>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun taxRegistrations(taxRegistrations: JsonField<List<TaxRegistration>>) = apply {
                this.taxRegistrations = taxRegistrations.map { it.toMutableList() }
            }

            /**
             * Adds a single [TaxRegistration] to [taxRegistrations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTaxRegistration(taxRegistration: TaxRegistration) = apply {
                taxRegistrations =
                    (taxRegistrations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("taxRegistrations", it).add(taxRegistration)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .address()
             * .legalName()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("address", address),
                    checkRequired("legalName", legalName),
                    checkRequired("name", name),
                    externalBillingEntityId,
                    invoiceSettings,
                    (taxRegistrations ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            address().validate()
            legalName()
            name()
            externalBillingEntityId()
            invoiceSettings()?.validate()
            taxRegistrations()?.forEach { it.validate() }
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
            (address.asKnown()?.validity() ?: 0) +
                (if (legalName.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (if (externalBillingEntityId.asKnown() == null) 0 else 1) +
                (invoiceSettings.asKnown()?.validity() ?: 0) +
                (taxRegistrations.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                address == other.address &&
                legalName == other.legalName &&
                name == other.name &&
                externalBillingEntityId == other.externalBillingEntityId &&
                invoiceSettings == other.invoiceSettings &&
                taxRegistrations == other.taxRegistrations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                legalName,
                name,
                externalBillingEntityId,
                invoiceSettings,
                taxRegistrations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{address=$address, legalName=$legalName, name=$name, externalBillingEntityId=$externalBillingEntityId, invoiceSettings=$invoiceSettings, taxRegistrations=$taxRegistrations, additionalProperties=$additionalProperties}"
    }

    /** Settings that override the account's for this billing entity. */
    class InvoiceSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val memo: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of()
        ) : this(memo, mutableMapOf())

        /**
         * The memo printed on the entity's invoices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): String? = memo.getNullable("memo")

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

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

            /** Returns a mutable builder for constructing an instance of [InvoiceSettings]. */
            fun builder() = Builder()
        }

        /** A builder for [InvoiceSettings]. */
        class Builder internal constructor() {

            private var memo: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceSettings: InvoiceSettings) = apply {
                memo = invoiceSettings.memo
                additionalProperties = invoiceSettings.additionalProperties.toMutableMap()
            }

            /** The memo printed on the entity's invoices. */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

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
             * Returns an immutable instance of [InvoiceSettings].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): InvoiceSettings =
                InvoiceSettings(memo, additionalProperties.toMutableMap())
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
        fun validate(): InvoiceSettings = apply {
            if (validated) {
                return@apply
            }

            memo()
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
        internal fun validity(): Int = (if (memo.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceSettings &&
                memo == other.memo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(memo, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceSettings{memo=$memo, additionalProperties=$additionalProperties}"
    }

    class TaxRegistration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val code: JsonField<String>,
        private val value: JsonField<String>,
        private val appliesTo: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applies_to")
            @ExcludeMissing
            appliesTo: JsonField<String> = JsonMissing.of(),
        ) : this(code, value, appliesTo, mutableMapOf())

        /**
         * The tax registration type, for example `DE VAT`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun code(): String = code.getRequired("code")

        /**
         * The registration number.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * The jurisdiction the registration applies to. If null, it applies to every customer.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appliesTo(): String? = appliesTo.getNullable("applies_to")

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        /**
         * Returns the raw JSON value of [appliesTo].
         *
         * Unlike [appliesTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("applies_to") @ExcludeMissing fun _appliesTo(): JsonField<String> = appliesTo

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
             * Returns a mutable builder for constructing an instance of [TaxRegistration].
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TaxRegistration]. */
        class Builder internal constructor() {

            private var code: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var appliesTo: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(taxRegistration: TaxRegistration) = apply {
                code = taxRegistration.code
                value = taxRegistration.value
                appliesTo = taxRegistration.appliesTo
                additionalProperties = taxRegistration.additionalProperties.toMutableMap()
            }

            /** The tax registration type, for example `DE VAT`. */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /** The registration number. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

            /**
             * The jurisdiction the registration applies to. If null, it applies to every customer.
             */
            fun appliesTo(appliesTo: String?) = appliesTo(JsonField.ofNullable(appliesTo))

            /**
             * Sets [Builder.appliesTo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliesTo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appliesTo(appliesTo: JsonField<String>) = apply { this.appliesTo = appliesTo }

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
             * Returns an immutable instance of [TaxRegistration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .code()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TaxRegistration =
                TaxRegistration(
                    checkRequired("code", code),
                    checkRequired("value", value),
                    appliesTo,
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
        fun validate(): TaxRegistration = apply {
            if (validated) {
                return@apply
            }

            code()
            value()
            appliesTo()
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
            (if (code.asKnown() == null) 0 else 1) +
                (if (value.asKnown() == null) 0 else 1) +
                (if (appliesTo.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaxRegistration &&
                code == other.code &&
                value == other.value &&
                appliesTo == other.appliesTo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(code, value, appliesTo, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxRegistration{code=$code, value=$value, appliesTo=$appliesTo, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountBillingEntityCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountBillingEntityCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
