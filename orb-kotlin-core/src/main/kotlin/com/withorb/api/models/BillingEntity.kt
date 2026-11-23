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

/**
 * A billing entity is a legal entity an account invoices from, with its own legal name, address and
 * tax registrations.
 */
class BillingEntity
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val address: JsonField<Address>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val defaultPaymentGatewayConnectionId: JsonField<String>,
    private val externalBillingEntityId: JsonField<String>,
    private val invoiceSettings: JsonField<InvoiceSettings>,
    private val isDefault: JsonField<Boolean>,
    private val legalName: JsonField<String>,
    private val name: JsonField<String>,
    private val paymentGatewayConnections: JsonField<List<PaymentGatewayConnection>>,
    private val status: JsonField<Status>,
    private val taxRegistrations: JsonField<List<TaxRegistration>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("default_payment_gateway_connection_id")
        @ExcludeMissing
        defaultPaymentGatewayConnectionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_billing_entity_id")
        @ExcludeMissing
        externalBillingEntityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_settings")
        @ExcludeMissing
        invoiceSettings: JsonField<InvoiceSettings> = JsonMissing.of(),
        @JsonProperty("is_default")
        @ExcludeMissing
        isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("legal_name") @ExcludeMissing legalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_gateway_connections")
        @ExcludeMissing
        paymentGatewayConnections: JsonField<List<PaymentGatewayConnection>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("tax_registrations")
        @ExcludeMissing
        taxRegistrations: JsonField<List<TaxRegistration>> = JsonMissing.of(),
    ) : this(
        id,
        address,
        createdAt,
        defaultPaymentGatewayConnectionId,
        externalBillingEntityId,
        invoiceSettings,
        isDefault,
        legalName,
        name,
        paymentGatewayConnections,
        status,
        taxRegistrations,
        mutableMapOf(),
    )

    /**
     * The Orb-assigned unique identifier for the billing entity.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The address printed on invoices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun address(): Address? = address.getNullable("address")

    /**
     * The time the billing entity was created.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The ID of the connection Orb charges when the customer is not mapped to any of the billing
     * entity's connections.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun defaultPaymentGatewayConnectionId(): String? =
        defaultPaymentGatewayConnectionId.getNullable("default_payment_gateway_connection_id")

    /**
     * An optional user-defined ID for this billing entity, unique within the account. This cannot
     * be changed after creation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalBillingEntityId(): String? =
        externalBillingEntityId.getNullable("external_billing_entity_id")

    /**
     * The billing entity's own invoice settings. Each null field inherits the account's setting.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceSettings(): InvoiceSettings = invoiceSettings.getRequired("invoice_settings")

    /**
     * Whether this is the account's default billing entity.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isDefault(): Boolean = isDefault.getRequired("is_default")

    /**
     * The legal name printed on invoices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = legalName.getRequired("legal_name")

    /**
     * An internal name for the billing entity.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The payment gateway connections the billing entity collects payments through.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentGatewayConnections(): List<PaymentGatewayConnection> =
        paymentGatewayConnections.getRequired("payment_gateway_connections")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxRegistrations(): List<TaxRegistration> =
        taxRegistrations.getRequired("tax_registrations")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [defaultPaymentGatewayConnectionId].
     *
     * Unlike [defaultPaymentGatewayConnectionId], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    @JsonProperty("default_payment_gateway_connection_id")
    @ExcludeMissing
    fun _defaultPaymentGatewayConnectionId(): JsonField<String> = defaultPaymentGatewayConnectionId

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
     * Unlike [invoiceSettings], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_settings")
    @ExcludeMissing
    fun _invoiceSettings(): JsonField<InvoiceSettings> = invoiceSettings

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

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
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
         * Returns a mutable builder for constructing an instance of [BillingEntity].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .address()
         * .createdAt()
         * .defaultPaymentGatewayConnectionId()
         * .externalBillingEntityId()
         * .invoiceSettings()
         * .isDefault()
         * .legalName()
         * .name()
         * .paymentGatewayConnections()
         * .status()
         * .taxRegistrations()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BillingEntity]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var address: JsonField<Address>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var defaultPaymentGatewayConnectionId: JsonField<String>? = null
        private var externalBillingEntityId: JsonField<String>? = null
        private var invoiceSettings: JsonField<InvoiceSettings>? = null
        private var isDefault: JsonField<Boolean>? = null
        private var legalName: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var paymentGatewayConnections: JsonField<MutableList<PaymentGatewayConnection>>? =
            null
        private var status: JsonField<Status>? = null
        private var taxRegistrations: JsonField<MutableList<TaxRegistration>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(billingEntity: BillingEntity) = apply {
            id = billingEntity.id
            address = billingEntity.address
            createdAt = billingEntity.createdAt
            defaultPaymentGatewayConnectionId = billingEntity.defaultPaymentGatewayConnectionId
            externalBillingEntityId = billingEntity.externalBillingEntityId
            invoiceSettings = billingEntity.invoiceSettings
            isDefault = billingEntity.isDefault
            legalName = billingEntity.legalName
            name = billingEntity.name
            paymentGatewayConnections =
                billingEntity.paymentGatewayConnections.map { it.toMutableList() }
            status = billingEntity.status
            taxRegistrations = billingEntity.taxRegistrations.map { it.toMutableList() }
            additionalProperties = billingEntity.additionalProperties.toMutableMap()
        }

        /** The Orb-assigned unique identifier for the billing entity. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The address printed on invoices. */
        fun address(address: Address?) = address(JsonField.ofNullable(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        /** The time the billing entity was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The ID of the connection Orb charges when the customer is not mapped to any of the
         * billing entity's connections.
         */
        fun defaultPaymentGatewayConnectionId(defaultPaymentGatewayConnectionId: String?) =
            defaultPaymentGatewayConnectionId(
                JsonField.ofNullable(defaultPaymentGatewayConnectionId)
            )

        /**
         * Sets [Builder.defaultPaymentGatewayConnectionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.defaultPaymentGatewayConnectionId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun defaultPaymentGatewayConnectionId(
            defaultPaymentGatewayConnectionId: JsonField<String>
        ) = apply { this.defaultPaymentGatewayConnectionId = defaultPaymentGatewayConnectionId }

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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalBillingEntityId(externalBillingEntityId: JsonField<String>) = apply {
            this.externalBillingEntityId = externalBillingEntityId
        }

        /**
         * The billing entity's own invoice settings. Each null field inherits the account's
         * setting.
         */
        fun invoiceSettings(invoiceSettings: InvoiceSettings) =
            invoiceSettings(JsonField.of(invoiceSettings))

        /**
         * Sets [Builder.invoiceSettings] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceSettings] with a well-typed [InvoiceSettings]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun invoiceSettings(invoiceSettings: JsonField<InvoiceSettings>) = apply {
            this.invoiceSettings = invoiceSettings
        }

        /** Whether this is the account's default billing entity. */
        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        /** The legal name printed on invoices. */
        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        /** An internal name for the billing entity. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The payment gateway connections the billing entity collects payments through. */
        fun paymentGatewayConnections(paymentGatewayConnections: List<PaymentGatewayConnection>) =
            paymentGatewayConnections(JsonField.of(paymentGatewayConnections))

        /**
         * Sets [Builder.paymentGatewayConnections] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentGatewayConnections] with a well-typed
         * `List<PaymentGatewayConnection>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun paymentGatewayConnections(
            paymentGatewayConnections: JsonField<List<PaymentGatewayConnection>>
        ) = apply {
            this.paymentGatewayConnections = paymentGatewayConnections.map { it.toMutableList() }
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
                        checkKnown("paymentGatewayConnections", it).add(paymentGatewayConnection)
                    }
            }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun taxRegistrations(taxRegistrations: List<TaxRegistration>) =
            taxRegistrations(JsonField.of(taxRegistrations))

        /**
         * Sets [Builder.taxRegistrations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxRegistrations] with a well-typed
         * `List<TaxRegistration>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
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
         * Returns an immutable instance of [BillingEntity].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .address()
         * .createdAt()
         * .defaultPaymentGatewayConnectionId()
         * .externalBillingEntityId()
         * .invoiceSettings()
         * .isDefault()
         * .legalName()
         * .name()
         * .paymentGatewayConnections()
         * .status()
         * .taxRegistrations()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BillingEntity =
            BillingEntity(
                checkRequired("id", id),
                checkRequired("address", address),
                checkRequired("createdAt", createdAt),
                checkRequired(
                    "defaultPaymentGatewayConnectionId",
                    defaultPaymentGatewayConnectionId,
                ),
                checkRequired("externalBillingEntityId", externalBillingEntityId),
                checkRequired("invoiceSettings", invoiceSettings),
                checkRequired("isDefault", isDefault),
                checkRequired("legalName", legalName),
                checkRequired("name", name),
                checkRequired("paymentGatewayConnections", paymentGatewayConnections).map {
                    it.toImmutable()
                },
                checkRequired("status", status),
                checkRequired("taxRegistrations", taxRegistrations).map { it.toImmutable() },
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
    fun validate(): BillingEntity = apply {
        if (validated) {
            return@apply
        }

        id()
        address()?.validate()
        createdAt()
        defaultPaymentGatewayConnectionId()
        externalBillingEntityId()
        invoiceSettings().validate()
        isDefault()
        legalName()
        name()
        paymentGatewayConnections().forEach { it.validate() }
        status().validate()
        taxRegistrations().forEach { it.validate() }
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
        (if (id.asKnown() == null) 0 else 1) +
            (address.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (defaultPaymentGatewayConnectionId.asKnown() == null) 0 else 1) +
            (if (externalBillingEntityId.asKnown() == null) 0 else 1) +
            (invoiceSettings.asKnown()?.validity() ?: 0) +
            (if (isDefault.asKnown() == null) 0 else 1) +
            (if (legalName.asKnown() == null) 0 else 1) +
            (if (name.asKnown() == null) 0 else 1) +
            (paymentGatewayConnections.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (taxRegistrations.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * The billing entity's own invoice settings. Each null field inherits the account's setting.
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

            /**
             * Returns a mutable builder for constructing an instance of [InvoiceSettings].
             *
             * The following fields are required:
             * ```kotlin
             * .autoCollection()
             * .automaticTaxEnabled()
             * .emailDelivery()
             * .manualIssuance()
             * .memo()
             * .netTerms()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [InvoiceSettings]. */
        class Builder internal constructor() {

            private var autoCollection: JsonField<Boolean>? = null
            private var automaticTaxEnabled: JsonField<Boolean>? = null
            private var emailDelivery: JsonField<Boolean>? = null
            private var manualIssuance: JsonField<Boolean>? = null
            private var memo: JsonField<String>? = null
            private var netTerms: JsonField<Long>? = null
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
             *
             * The following fields are required:
             * ```kotlin
             * .autoCollection()
             * .automaticTaxEnabled()
             * .emailDelivery()
             * .manualIssuance()
             * .memo()
             * .netTerms()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InvoiceSettings =
                InvoiceSettings(
                    checkRequired("autoCollection", autoCollection),
                    checkRequired("automaticTaxEnabled", automaticTaxEnabled),
                    checkRequired("emailDelivery", emailDelivery),
                    checkRequired("manualIssuance", manualIssuance),
                    checkRequired("memo", memo),
                    checkRequired("netTerms", netTerms),
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
        private val isDefault: JsonField<Boolean>,
        private val paymentGatewayConnectionId: JsonField<String>,
        private val paymentProviderType: JsonField<PaymentProviderType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_default")
            @ExcludeMissing
            isDefault: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("payment_gateway_connection_id")
            @ExcludeMissing
            paymentGatewayConnectionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_provider_type")
            @ExcludeMissing
            paymentProviderType: JsonField<PaymentProviderType> = JsonMissing.of(),
        ) : this(isDefault, paymentGatewayConnectionId, paymentProviderType, mutableMapOf())

        /**
         * Whether this is the billing entity's default payment gateway connection.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isDefault(): Boolean = isDefault.getRequired("is_default")

        /**
         * The ID of the billing entity's payment gateway connection.
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
         * Returns the raw JSON value of [isDefault].
         *
         * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

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
             * .isDefault()
             * .paymentGatewayConnectionId()
             * .paymentProviderType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentGatewayConnection]. */
        class Builder internal constructor() {

            private var isDefault: JsonField<Boolean>? = null
            private var paymentGatewayConnectionId: JsonField<String>? = null
            private var paymentProviderType: JsonField<PaymentProviderType>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentGatewayConnection: PaymentGatewayConnection) = apply {
                isDefault = paymentGatewayConnection.isDefault
                paymentGatewayConnectionId = paymentGatewayConnection.paymentGatewayConnectionId
                paymentProviderType = paymentGatewayConnection.paymentProviderType
                additionalProperties = paymentGatewayConnection.additionalProperties.toMutableMap()
            }

            /** Whether this is the billing entity's default payment gateway connection. */
            fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

            /**
             * Sets [Builder.isDefault] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDefault] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

            /** The ID of the billing entity's payment gateway connection. */
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
             * .isDefault()
             * .paymentGatewayConnectionId()
             * .paymentProviderType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentGatewayConnection =
                PaymentGatewayConnection(
                    checkRequired("isDefault", isDefault),
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

            isDefault()
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
            (if (isDefault.asKnown() == null) 0 else 1) +
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
                isDefault == other.isDefault &&
                paymentGatewayConnectionId == other.paymentGatewayConnectionId &&
                paymentProviderType == other.paymentProviderType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                isDefault,
                paymentGatewayConnectionId,
                paymentProviderType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentGatewayConnection{isDefault=$isDefault, paymentGatewayConnectionId=$paymentGatewayConnectionId, paymentProviderType=$paymentProviderType, additionalProperties=$additionalProperties}"
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACTIVE = of("active")

            val ARCHIVED = of("archived")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            ARCHIVED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            ARCHIVED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
         */
        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

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

    class TaxRegistration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val appliesTo: JsonField<String>,
        private val code: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("applies_to")
            @ExcludeMissing
            appliesTo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(appliesTo, code, value, mutableMapOf())

        /**
         * The jurisdiction the registration applies to. If null, it applies to every customer.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appliesTo(): String? = appliesTo.getNullable("applies_to")

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
         * Returns the raw JSON value of [appliesTo].
         *
         * Unlike [appliesTo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("applies_to") @ExcludeMissing fun _appliesTo(): JsonField<String> = appliesTo

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
             * .appliesTo()
             * .code()
             * .value()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TaxRegistration]. */
        class Builder internal constructor() {

            private var appliesTo: JsonField<String>? = null
            private var code: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(taxRegistration: TaxRegistration) = apply {
                appliesTo = taxRegistration.appliesTo
                code = taxRegistration.code
                value = taxRegistration.value
                additionalProperties = taxRegistration.additionalProperties.toMutableMap()
            }

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
             * .appliesTo()
             * .code()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TaxRegistration =
                TaxRegistration(
                    checkRequired("appliesTo", appliesTo),
                    checkRequired("code", code),
                    checkRequired("value", value),
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

            appliesTo()
            code()
            value()
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
            (if (appliesTo.asKnown() == null) 0 else 1) +
                (if (code.asKnown() == null) 0 else 1) +
                (if (value.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TaxRegistration &&
                appliesTo == other.appliesTo &&
                code == other.code &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(appliesTo, code, value, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxRegistration{appliesTo=$appliesTo, code=$code, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BillingEntity &&
            id == other.id &&
            address == other.address &&
            createdAt == other.createdAt &&
            defaultPaymentGatewayConnectionId == other.defaultPaymentGatewayConnectionId &&
            externalBillingEntityId == other.externalBillingEntityId &&
            invoiceSettings == other.invoiceSettings &&
            isDefault == other.isDefault &&
            legalName == other.legalName &&
            name == other.name &&
            paymentGatewayConnections == other.paymentGatewayConnections &&
            status == other.status &&
            taxRegistrations == other.taxRegistrations &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            address,
            createdAt,
            defaultPaymentGatewayConnectionId,
            externalBillingEntityId,
            invoiceSettings,
            isDefault,
            legalName,
            name,
            paymentGatewayConnections,
            status,
            taxRegistrations,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BillingEntity{id=$id, address=$address, createdAt=$createdAt, defaultPaymentGatewayConnectionId=$defaultPaymentGatewayConnectionId, externalBillingEntityId=$externalBillingEntityId, invoiceSettings=$invoiceSettings, isDefault=$isDefault, legalName=$legalName, name=$name, paymentGatewayConnections=$paymentGatewayConnections, status=$status, taxRegistrations=$taxRegistrations, additionalProperties=$additionalProperties}"
}
