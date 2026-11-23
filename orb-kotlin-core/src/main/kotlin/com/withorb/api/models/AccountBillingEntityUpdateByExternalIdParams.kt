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
 * This endpoint updates a billing entity, including the default one. Omitted fields keep their
 * value. A change to the name, legal name, address, or tax registrations writes a new version of
 * the billing entity; invoices already issued keep the version they were issued with. In
 * `invoice_settings`, null clears a field so it inherits the account's setting; the default billing
 * entity accepts only `memo` and `net_terms`. An archived billing entity cannot be updated until it
 * is unarchived. This endpoint requires an admin API key.
 *
 * `payment_gateway_connections` is the full set of connections the billing entity collects payments
 * through; a connection left out is disconnected from the billing entity. If a payment through a
 * connection left out is still in progress, the whole update is rejected and can be retried once
 * the payment finishes.
 */
class AccountBillingEntityUpdateByExternalIdParams
private constructor(
    private val externalBillingEntityId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalBillingEntityId(): String? = externalBillingEntityId

    /**
     * Replaces the whole address. Omit it to keep the current one.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun address(): AddressInput? = body.address()

    /**
     * The ID of the connection Orb charges when the customer is not mapped to any of the billing
     * entity's connections. Required when `payment_gateway_connections` has more than one entry.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun defaultPaymentGatewayConnectionId(): String? = body.defaultPaymentGatewayConnectionId()

    /**
     * The invoice settings to change. Omitted fields keep their value; null clears a field so it
     * inherits the account's setting.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoiceSettings(): InvoiceSettings? = body.invoiceSettings()

    /**
     * The legal name printed on invoices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun legalName(): String? = body.legalName()

    /**
     * An internal name for the billing entity.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun name(): String? = body.name()

    /**
     * The full set of payment gateway connections the billing entity collects payments through.
     * Omit it to keep the current ones. Naming another billing entity's connection gives this
     * billing entity a connection of its own through the same Stripe account or Adyen merchant
     * account.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentGatewayConnections(): List<PaymentGatewayConnection>? =
        body.paymentGatewayConnections()

    /**
     * The full list of registrations. Omit it to keep the current ones.
     *
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
     * Returns the raw JSON value of [defaultPaymentGatewayConnectionId].
     *
     * Unlike [defaultPaymentGatewayConnectionId], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _defaultPaymentGatewayConnectionId(): JsonField<String> =
        body._defaultPaymentGatewayConnectionId()

    /**
     * Returns the raw JSON value of [invoiceSettings].
     *
     * Unlike [invoiceSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceSettings(): JsonField<InvoiceSettings> = body._invoiceSettings()

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
     * Returns the raw JSON value of [paymentGatewayConnections].
     *
     * Unlike [paymentGatewayConnections], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _paymentGatewayConnections(): JsonField<List<PaymentGatewayConnection>> =
        body._paymentGatewayConnections()

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

        fun none(): AccountBillingEntityUpdateByExternalIdParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountBillingEntityUpdateByExternalIdParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountBillingEntityUpdateByExternalIdParams]. */
    class Builder internal constructor() {

        private var externalBillingEntityId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            accountBillingEntityUpdateByExternalIdParams:
                AccountBillingEntityUpdateByExternalIdParams
        ) = apply {
            externalBillingEntityId =
                accountBillingEntityUpdateByExternalIdParams.externalBillingEntityId
            body = accountBillingEntityUpdateByExternalIdParams.body.toBuilder()
            additionalHeaders =
                accountBillingEntityUpdateByExternalIdParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                accountBillingEntityUpdateByExternalIdParams.additionalQueryParams.toBuilder()
        }

        fun externalBillingEntityId(externalBillingEntityId: String?) = apply {
            this.externalBillingEntityId = externalBillingEntityId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [address]
         * - [defaultPaymentGatewayConnectionId]
         * - [invoiceSettings]
         * - [legalName]
         * - [name]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Replaces the whole address. Omit it to keep the current one. */
        fun address(address: AddressInput?) = apply { body.address(address) }

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [AddressInput] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun address(address: JsonField<AddressInput>) = apply { body.address(address) }

        /**
         * The ID of the connection Orb charges when the customer is not mapped to any of the
         * billing entity's connections. Required when `payment_gateway_connections` has more than
         * one entry.
         */
        fun defaultPaymentGatewayConnectionId(defaultPaymentGatewayConnectionId: String?) = apply {
            body.defaultPaymentGatewayConnectionId(defaultPaymentGatewayConnectionId)
        }

        /**
         * Sets [Builder.defaultPaymentGatewayConnectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultPaymentGatewayConnectionId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun defaultPaymentGatewayConnectionId(
            defaultPaymentGatewayConnectionId: JsonField<String>
        ) = apply { body.defaultPaymentGatewayConnectionId(defaultPaymentGatewayConnectionId) }

        /**
         * The invoice settings to change. Omitted fields keep their value; null clears a field so
         * it inherits the account's setting.
         */
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

        /** The legal name printed on invoices. */
        fun legalName(legalName: String?) = apply { body.legalName(legalName) }

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { body.legalName(legalName) }

        /** An internal name for the billing entity. */
        fun name(name: String?) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * The full set of payment gateway connections the billing entity collects payments through.
         * Omit it to keep the current ones. Naming another billing entity's connection gives this
         * billing entity a connection of its own through the same Stripe account or Adyen merchant
         * account.
         */
        fun paymentGatewayConnections(paymentGatewayConnections: List<PaymentGatewayConnection>?) =
            apply {
                body.paymentGatewayConnections(paymentGatewayConnections)
            }

        /**
         * Sets [Builder.paymentGatewayConnections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentGatewayConnections] with a well-typed
         * `List<PaymentGatewayConnection>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun paymentGatewayConnections(
            paymentGatewayConnections: JsonField<List<PaymentGatewayConnection>>
        ) = apply { body.paymentGatewayConnections(paymentGatewayConnections) }

        /**
         * Adds a single [PaymentGatewayConnection] to [paymentGatewayConnections].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentGatewayConnection(paymentGatewayConnection: PaymentGatewayConnection) =
            apply {
                body.addPaymentGatewayConnection(paymentGatewayConnection)
            }

        /** The full list of registrations. Omit it to keep the current ones. */
        fun taxRegistrations(taxRegistrations: List<TaxRegistration>?) = apply {
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
         * Returns an immutable instance of [AccountBillingEntityUpdateByExternalIdParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AccountBillingEntityUpdateByExternalIdParams =
            AccountBillingEntityUpdateByExternalIdParams(
                externalBillingEntityId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalBillingEntityId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<AddressInput>,
        private val defaultPaymentGatewayConnectionId: JsonField<String>,
        private val invoiceSettings: JsonField<InvoiceSettings>,
        private val legalName: JsonField<String>,
        private val name: JsonField<String>,
        private val paymentGatewayConnections: JsonField<List<PaymentGatewayConnection>>,
        private val taxRegistrations: JsonField<List<TaxRegistration>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address")
            @ExcludeMissing
            address: JsonField<AddressInput> = JsonMissing.of(),
            @JsonProperty("default_payment_gateway_connection_id")
            @ExcludeMissing
            defaultPaymentGatewayConnectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_settings")
            @ExcludeMissing
            invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of(),
            @JsonProperty("legal_name")
            @ExcludeMissing
            legalName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_gateway_connections")
            @ExcludeMissing
            paymentGatewayConnections: JsonField<List<PaymentGatewayConnection>> = JsonMissing.of(),
            @JsonProperty("tax_registrations")
            @ExcludeMissing
            taxRegistrations: JsonField<List<TaxRegistration>> = JsonMissing.of(),
        ) : this(
            address,
            defaultPaymentGatewayConnectionId,
            invoiceSettings,
            legalName,
            name,
            paymentGatewayConnections,
            taxRegistrations,
            mutableMapOf(),
        )

        /**
         * Replaces the whole address. Omit it to keep the current one.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun address(): AddressInput? = address.getNullable("address")

        /**
         * The ID of the connection Orb charges when the customer is not mapped to any of the
         * billing entity's connections. Required when `payment_gateway_connections` has more than
         * one entry.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun defaultPaymentGatewayConnectionId(): String? =
            defaultPaymentGatewayConnectionId.getNullable("default_payment_gateway_connection_id")

        /**
         * The invoice settings to change. Omitted fields keep their value; null clears a field so
         * it inherits the account's setting.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceSettings(): InvoiceSettings? = invoiceSettings.getNullable("invoice_settings")

        /**
         * The legal name printed on invoices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun legalName(): String? = legalName.getNullable("legal_name")

        /**
         * An internal name for the billing entity.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun name(): String? = name.getNullable("name")

        /**
         * The full set of payment gateway connections the billing entity collects payments through.
         * Omit it to keep the current ones. Naming another billing entity's connection gives this
         * billing entity a connection of its own through the same Stripe account or Adyen merchant
         * account.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentGatewayConnections(): List<PaymentGatewayConnection>? =
            paymentGatewayConnections.getNullable("payment_gateway_connections")

        /**
         * The full list of registrations. Omit it to keep the current ones.
         *
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
         * Returns the raw JSON value of [defaultPaymentGatewayConnectionId].
         *
         * Unlike [defaultPaymentGatewayConnectionId], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("default_payment_gateway_connection_id")
        @ExcludeMissing
        fun _defaultPaymentGatewayConnectionId(): JsonField<String> =
            defaultPaymentGatewayConnectionId

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
         * Returns the raw JSON value of [paymentGatewayConnections].
         *
         * Unlike [paymentGatewayConnections], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_gateway_connections")
        @ExcludeMissing
        fun _paymentGatewayConnections(): JsonField<List<PaymentGatewayConnection>> =
            paymentGatewayConnections

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var address: JsonField<AddressInput> = JsonMissing.of()
            private var defaultPaymentGatewayConnectionId: JsonField<String> = JsonMissing.of()
            private var invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of()
            private var legalName: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var paymentGatewayConnections:
                JsonField<MutableList<PaymentGatewayConnection>>? =
                null
            private var taxRegistrations: JsonField<MutableList<TaxRegistration>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                address = body.address
                defaultPaymentGatewayConnectionId = body.defaultPaymentGatewayConnectionId
                invoiceSettings = body.invoiceSettings
                legalName = body.legalName
                name = body.name
                paymentGatewayConnections =
                    body.paymentGatewayConnections.map { it.toMutableList() }
                taxRegistrations = body.taxRegistrations.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Replaces the whole address. Omit it to keep the current one. */
            fun address(address: AddressInput?) = address(JsonField.ofNullable(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [AddressInput] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<AddressInput>) = apply { this.address = address }

            /**
             * The ID of the connection Orb charges when the customer is not mapped to any of the
             * billing entity's connections. Required when `payment_gateway_connections` has more
             * than one entry.
             */
            fun defaultPaymentGatewayConnectionId(defaultPaymentGatewayConnectionId: String?) =
                defaultPaymentGatewayConnectionId(
                    JsonField.ofNullable(defaultPaymentGatewayConnectionId)
                )

            /**
             * Sets [Builder.defaultPaymentGatewayConnectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.defaultPaymentGatewayConnectionId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun defaultPaymentGatewayConnectionId(
                defaultPaymentGatewayConnectionId: JsonField<String>
            ) = apply { this.defaultPaymentGatewayConnectionId = defaultPaymentGatewayConnectionId }

            /**
             * The invoice settings to change. Omitted fields keep their value; null clears a field
             * so it inherits the account's setting.
             */
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

            /** The legal name printed on invoices. */
            fun legalName(legalName: String?) = legalName(JsonField.ofNullable(legalName))

            /**
             * Sets [Builder.legalName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.legalName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

            /** An internal name for the billing entity. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * The full set of payment gateway connections the billing entity collects payments
             * through. Omit it to keep the current ones. Naming another billing entity's connection
             * gives this billing entity a connection of its own through the same Stripe account or
             * Adyen merchant account.
             */
            fun paymentGatewayConnections(
                paymentGatewayConnections: List<PaymentGatewayConnection>?
            ) = paymentGatewayConnections(JsonField.ofNullable(paymentGatewayConnections))

            /**
             * Sets [Builder.paymentGatewayConnections] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentGatewayConnections] with a well-typed
             * `List<PaymentGatewayConnection>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun paymentGatewayConnections(
                paymentGatewayConnections: JsonField<List<PaymentGatewayConnection>>
            ) = apply {
                this.paymentGatewayConnections =
                    paymentGatewayConnections.map { it.toMutableList() }
            }

            /**
             * Adds a single [PaymentGatewayConnection] to [paymentGatewayConnections].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPaymentGatewayConnection(paymentGatewayConnection: PaymentGatewayConnection) =
                apply {
                    paymentGatewayConnections =
                        (paymentGatewayConnections ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentGatewayConnections", it)
                                .add(paymentGatewayConnection)
                        }
                }

            /** The full list of registrations. Omit it to keep the current ones. */
            fun taxRegistrations(taxRegistrations: List<TaxRegistration>?) =
                taxRegistrations(JsonField.ofNullable(taxRegistrations))

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
             */
            fun build(): Body =
                Body(
                    address,
                    defaultPaymentGatewayConnectionId,
                    invoiceSettings,
                    legalName,
                    name,
                    (paymentGatewayConnections ?: JsonMissing.of()).map { it.toImmutable() },
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

            address()?.validate()
            defaultPaymentGatewayConnectionId()
            invoiceSettings()?.validate()
            legalName()
            name()
            paymentGatewayConnections()?.forEach { it.validate() }
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
                (if (defaultPaymentGatewayConnectionId.asKnown() == null) 0 else 1) +
                (invoiceSettings.asKnown()?.validity() ?: 0) +
                (if (legalName.asKnown() == null) 0 else 1) +
                (if (name.asKnown() == null) 0 else 1) +
                (paymentGatewayConnections.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (taxRegistrations.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                address == other.address &&
                defaultPaymentGatewayConnectionId == other.defaultPaymentGatewayConnectionId &&
                invoiceSettings == other.invoiceSettings &&
                legalName == other.legalName &&
                name == other.name &&
                paymentGatewayConnections == other.paymentGatewayConnections &&
                taxRegistrations == other.taxRegistrations &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                defaultPaymentGatewayConnectionId,
                invoiceSettings,
                legalName,
                name,
                paymentGatewayConnections,
                taxRegistrations,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{address=$address, defaultPaymentGatewayConnectionId=$defaultPaymentGatewayConnectionId, invoiceSettings=$invoiceSettings, legalName=$legalName, name=$name, paymentGatewayConnections=$paymentGatewayConnections, taxRegistrations=$taxRegistrations, additionalProperties=$additionalProperties}"
    }

    /**
     * The invoice settings to change. Omitted fields keep their value; null clears a field so it
     * inherits the account's setting.
     */
    class InvoiceSettings
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val autoCollection: JsonField<Boolean>,
        private val automaticTaxEnabled: JsonField<Boolean>,
        private val emailDelivery: JsonField<Boolean>,
        private val manualIssuance: JsonField<Boolean>,
        private val memo: JsonField<String>,
        private val netTerms: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("auto_collection")
            @ExcludeMissing
            autoCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("automatic_tax_enabled")
            @ExcludeMissing
            automaticTaxEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("email_delivery")
            @ExcludeMissing
            emailDelivery: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("manual_issuance")
            @ExcludeMissing
            manualIssuance: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("net_terms") @ExcludeMissing netTerms: JsonField<Long> = JsonMissing.of(),
        ) : this(
            autoCollection,
            automaticTaxEnabled,
            emailDelivery,
            manualIssuance,
            memo,
            netTerms,
            mutableMapOf(),
        )

        /**
         * Whether Orb charges the customer's payment method automatically.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

        /**
         * Whether Orb calculates tax through the tax provider.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun automaticTaxEnabled(): Boolean? =
            automaticTaxEnabled.getNullable("automatic_tax_enabled")

        /**
         * Whether Orb emails invoices to customers.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun emailDelivery(): Boolean? = emailDelivery.getNullable("email_delivery")

        /**
         * Whether invoices stay in draft until issued by hand.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun manualIssuance(): Boolean? = manualIssuance.getNullable("manual_issuance")

        /**
         * The memo printed on the entity's invoices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): String? = memo.getNullable("memo")

        /**
         * The number of days until payment is due, counting the start date as day 1, so net 30 from
         * October 1 is due October 30. The account's
         * [due date calculation method](/invoicing/payments#configuring-net-terms-and-collection-behavior)
         * sets whether the start date is the invoice date or the issuance date.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun netTerms(): Long? = netTerms.getNullable("net_terms")

        /**
         * Returns the raw JSON value of [autoCollection].
         *
         * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun _autoCollection(): JsonField<Boolean> = autoCollection

        /**
         * Returns the raw JSON value of [automaticTaxEnabled].
         *
         * Unlike [automaticTaxEnabled], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("automatic_tax_enabled")
        @ExcludeMissing
        fun _automaticTaxEnabled(): JsonField<Boolean> = automaticTaxEnabled

        /**
         * Returns the raw JSON value of [emailDelivery].
         *
         * Unlike [emailDelivery], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("email_delivery")
        @ExcludeMissing
        fun _emailDelivery(): JsonField<Boolean> = emailDelivery

        /**
         * Returns the raw JSON value of [manualIssuance].
         *
         * Unlike [manualIssuance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("manual_issuance")
        @ExcludeMissing
        fun _manualIssuance(): JsonField<Boolean> = manualIssuance

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [netTerms].
         *
         * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

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

            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var automaticTaxEnabled: JsonField<Boolean> = JsonMissing.of()
            private var emailDelivery: JsonField<Boolean> = JsonMissing.of()
            private var manualIssuance: JsonField<Boolean> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var netTerms: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(invoiceSettings: InvoiceSettings) = apply {
                autoCollection = invoiceSettings.autoCollection
                automaticTaxEnabled = invoiceSettings.automaticTaxEnabled
                emailDelivery = invoiceSettings.emailDelivery
                manualIssuance = invoiceSettings.manualIssuance
                memo = invoiceSettings.memo
                netTerms = invoiceSettings.netTerms
                additionalProperties = invoiceSettings.additionalProperties.toMutableMap()
            }

            /** Whether Orb charges the customer's payment method automatically. */
            fun autoCollection(autoCollection: Boolean?) =
                autoCollection(JsonField.ofNullable(autoCollection))

            /**
             * Alias for [Builder.autoCollection].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

            /**
             * Sets [Builder.autoCollection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.autoCollection] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                this.autoCollection = autoCollection
            }

            /** Whether Orb calculates tax through the tax provider. */
            fun automaticTaxEnabled(automaticTaxEnabled: Boolean?) =
                automaticTaxEnabled(JsonField.ofNullable(automaticTaxEnabled))

            /**
             * Alias for [Builder.automaticTaxEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun automaticTaxEnabled(automaticTaxEnabled: Boolean) =
                automaticTaxEnabled(automaticTaxEnabled as Boolean?)

            /**
             * Sets [Builder.automaticTaxEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.automaticTaxEnabled] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun automaticTaxEnabled(automaticTaxEnabled: JsonField<Boolean>) = apply {
                this.automaticTaxEnabled = automaticTaxEnabled
            }

            /** Whether Orb emails invoices to customers. */
            fun emailDelivery(emailDelivery: Boolean?) =
                emailDelivery(JsonField.ofNullable(emailDelivery))

            /**
             * Alias for [Builder.emailDelivery].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun emailDelivery(emailDelivery: Boolean) = emailDelivery(emailDelivery as Boolean?)

            /**
             * Sets [Builder.emailDelivery] to an arbitrary JSON value.
             *
             * You should usually call [Builder.emailDelivery] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun emailDelivery(emailDelivery: JsonField<Boolean>) = apply {
                this.emailDelivery = emailDelivery
            }

            /** Whether invoices stay in draft until issued by hand. */
            fun manualIssuance(manualIssuance: Boolean?) =
                manualIssuance(JsonField.ofNullable(manualIssuance))

            /**
             * Alias for [Builder.manualIssuance].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun manualIssuance(manualIssuance: Boolean) = manualIssuance(manualIssuance as Boolean?)

            /**
             * Sets [Builder.manualIssuance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.manualIssuance] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun manualIssuance(manualIssuance: JsonField<Boolean>) = apply {
                this.manualIssuance = manualIssuance
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

            /**
             * The number of days until payment is due, counting the start date as day 1, so net 30
             * from October 1 is due October 30. The account's
             * [due date calculation method](/invoicing/payments#configuring-net-terms-and-collection-behavior)
             * sets whether the start date is the invoice date or the issuance date.
             */
            fun netTerms(netTerms: Long?) = netTerms(JsonField.ofNullable(netTerms))

            /**
             * Alias for [Builder.netTerms].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

            /**
             * Sets [Builder.netTerms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netTerms] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

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
                InvoiceSettings(
                    autoCollection,
                    automaticTaxEnabled,
                    emailDelivery,
                    manualIssuance,
                    memo,
                    netTerms,
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
        fun validate(): InvoiceSettings = apply {
            if (validated) {
                return@apply
            }

            autoCollection()
            automaticTaxEnabled()
            emailDelivery()
            manualIssuance()
            memo()
            netTerms()
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
            (if (autoCollection.asKnown() == null) 0 else 1) +
                (if (automaticTaxEnabled.asKnown() == null) 0 else 1) +
                (if (emailDelivery.asKnown() == null) 0 else 1) +
                (if (manualIssuance.asKnown() == null) 0 else 1) +
                (if (memo.asKnown() == null) 0 else 1) +
                (if (netTerms.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceSettings &&
                autoCollection == other.autoCollection &&
                automaticTaxEnabled == other.automaticTaxEnabled &&
                emailDelivery == other.emailDelivery &&
                manualIssuance == other.manualIssuance &&
                memo == other.memo &&
                netTerms == other.netTerms &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                autoCollection,
                automaticTaxEnabled,
                emailDelivery,
                manualIssuance,
                memo,
                netTerms,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceSettings{autoCollection=$autoCollection, automaticTaxEnabled=$automaticTaxEnabled, emailDelivery=$emailDelivery, manualIssuance=$manualIssuance, memo=$memo, netTerms=$netTerms, additionalProperties=$additionalProperties}"
    }

    class PaymentGatewayConnection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val paymentGatewayConnectionId: JsonField<String>,
        private val paymentProviderType: JsonField<PaymentProviderType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("payment_gateway_connection_id")
            @ExcludeMissing
            paymentGatewayConnectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_provider_type")
            @ExcludeMissing
            paymentProviderType: JsonField<PaymentProviderType> = JsonMissing.of(),
        ) : this(paymentGatewayConnectionId, paymentProviderType, mutableMapOf())

        /**
         * The ID of a payment gateway connection of the account.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentGatewayConnectionId(): String =
            paymentGatewayConnectionId.getRequired("payment_gateway_connection_id")

        /**
         * The connection's payment provider.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentProviderType(): PaymentProviderType =
            paymentProviderType.getRequired("payment_provider_type")

        /**
         * Returns the raw JSON value of [paymentGatewayConnectionId].
         *
         * Unlike [paymentGatewayConnectionId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_gateway_connection_id")
        @ExcludeMissing
        fun _paymentGatewayConnectionId(): JsonField<String> = paymentGatewayConnectionId

        /**
         * Returns the raw JSON value of [paymentProviderType].
         *
         * Unlike [paymentProviderType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_provider_type")
        @ExcludeMissing
        fun _paymentProviderType(): JsonField<PaymentProviderType> = paymentProviderType

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
             * Returns a mutable builder for constructing an instance of [PaymentGatewayConnection].
             *
             * The following fields are required:
             * ```kotlin
             * .paymentGatewayConnectionId()
             * .paymentProviderType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentGatewayConnection]. */
        class Builder internal constructor() {

            private var paymentGatewayConnectionId: JsonField<String>? = null
            private var paymentProviderType: JsonField<PaymentProviderType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentGatewayConnection: PaymentGatewayConnection) = apply {
                paymentGatewayConnectionId = paymentGatewayConnection.paymentGatewayConnectionId
                paymentProviderType = paymentGatewayConnection.paymentProviderType
                additionalProperties = paymentGatewayConnection.additionalProperties.toMutableMap()
            }

            /** The ID of a payment gateway connection of the account. */
            fun paymentGatewayConnectionId(paymentGatewayConnectionId: String) =
                paymentGatewayConnectionId(JsonField.of(paymentGatewayConnectionId))

            /**
             * Sets [Builder.paymentGatewayConnectionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentGatewayConnectionId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun paymentGatewayConnectionId(paymentGatewayConnectionId: JsonField<String>) = apply {
                this.paymentGatewayConnectionId = paymentGatewayConnectionId
            }

            /** The connection's payment provider. */
            fun paymentProviderType(paymentProviderType: PaymentProviderType) =
                paymentProviderType(JsonField.of(paymentProviderType))

            /**
             * Sets [Builder.paymentProviderType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentProviderType] with a well-typed
             * [PaymentProviderType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun paymentProviderType(paymentProviderType: JsonField<PaymentProviderType>) = apply {
                this.paymentProviderType = paymentProviderType
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
             * Returns an immutable instance of [PaymentGatewayConnection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .paymentGatewayConnectionId()
             * .paymentProviderType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentGatewayConnection =
                PaymentGatewayConnection(
                    checkRequired("paymentGatewayConnectionId", paymentGatewayConnectionId),
                    checkRequired("paymentProviderType", paymentProviderType),
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
        fun validate(): PaymentGatewayConnection = apply {
            if (validated) {
                return@apply
            }

            paymentGatewayConnectionId()
            paymentProviderType().validate()
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
            (if (paymentGatewayConnectionId.asKnown() == null) 0 else 1) +
                (paymentProviderType.asKnown()?.validity() ?: 0)

        /** The connection's payment provider. */
        class PaymentProviderType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val STRIPE = of("stripe")

                val ADYEN = of("adyen")

                fun of(value: String) = PaymentProviderType(JsonField.of(value))
            }

            /** An enum containing [PaymentProviderType]'s known values. */
            enum class Known {
                STRIPE,
                ADYEN,
            }

            /**
             * An enum containing [PaymentProviderType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PaymentProviderType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRIPE,
                ADYEN,
                /**
                 * An enum member indicating that [PaymentProviderType] was instantiated with an
                 * unknown value.
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
                    STRIPE -> Value.STRIPE
                    ADYEN -> Value.ADYEN
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
                    STRIPE -> Known.STRIPE
                    ADYEN -> Known.ADYEN
                    else -> throw OrbInvalidDataException("Unknown PaymentProviderType: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws OrbInvalidDataException if any value type in this object doesn't match its
             *   expected type.
             */
            fun validate(): PaymentProviderType = apply {
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

                return other is PaymentProviderType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentGatewayConnection &&
                paymentGatewayConnectionId == other.paymentGatewayConnectionId &&
                paymentProviderType == other.paymentProviderType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(paymentGatewayConnectionId, paymentProviderType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentGatewayConnection{paymentGatewayConnectionId=$paymentGatewayConnectionId, paymentProviderType=$paymentProviderType, additionalProperties=$additionalProperties}"
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

        return other is AccountBillingEntityUpdateByExternalIdParams &&
            externalBillingEntityId == other.externalBillingEntityId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(externalBillingEntityId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "AccountBillingEntityUpdateByExternalIdParams{externalBillingEntityId=$externalBillingEntityId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
