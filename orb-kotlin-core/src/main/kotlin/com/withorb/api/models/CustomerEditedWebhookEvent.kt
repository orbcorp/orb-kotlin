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
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/** Issued when a customer is updated. */
class CustomerEditedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customer: JsonField<Customer>,
    private val properties: JsonField<Properties>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("customer") @ExcludeMissing customer: JsonField<Customer> = JsonMissing.of(),
        @JsonProperty("properties")
        @ExcludeMissing
        properties: JsonField<Properties> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, createdAt, customer, properties, type, mutableMapOf())

    /**
     * The ID of this webhook event.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The time at which this event was created, to the second.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A customer is a buyer of your products, and the other party to the billing relationship.
     *
     * In Orb, customers are assigned system generated identifiers automatically, but it's often
     * desirable to have these match existing identifiers in your system. To avoid having to
     * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
     * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
     * information about how these aliases work in Orb.
     *
     * In addition to having an identifier in your system, a customer may exist in a payment
     * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum
     * field to express this mapping.
     *
     * A customer also has a timezone (from the standard
     * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
     * timezone. See [Timezone localization](/essentials/timezones) for information on what this
     * timezone parameter influences within Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): Customer = customer.getRequired("customer")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun properties(): Properties = properties.getRequired("properties")

    /**
     * The event this payload describes.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    /**
     * Returns the raw JSON value of [properties].
     *
     * Unlike [properties], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("properties")
    @ExcludeMissing
    fun _properties(): JsonField<Properties> = properties

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [CustomerEditedWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .customer()
         * .properties()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerEditedWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customer: JsonField<Customer>? = null
        private var properties: JsonField<Properties>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerEditedWebhookEvent: CustomerEditedWebhookEvent) = apply {
            id = customerEditedWebhookEvent.id
            createdAt = customerEditedWebhookEvent.createdAt
            customer = customerEditedWebhookEvent.customer
            properties = customerEditedWebhookEvent.properties
            type = customerEditedWebhookEvent.type
            additionalProperties = customerEditedWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The ID of this webhook event. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The time at which this event was created, to the second. */
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
         * A customer is a buyer of your products, and the other party to the billing relationship.
         *
         * In Orb, customers are assigned system generated identifiers automatically, but it's often
         * desirable to have these match existing identifiers in your system. To avoid having to
         * denormalize Orb ID information, you can pass in an `external_customer_id` with your own
         * identifier. See [Customer ID Aliases](/events-and-metrics/customer-aliases) for further
         * information about how these aliases work in Orb.
         *
         * In addition to having an identifier in your system, a customer may exist in a payment
         * provider solution like Stripe. Use the `payment_provider_id` and the `payment_provider`
         * enum field to express this mapping.
         *
         * A customer also has a timezone (from the standard
         * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your
         * account's timezone. See [Timezone localization](/essentials/timezones) for information on
         * what this timezone parameter influences within Orb.
         */
        fun customer(customer: Customer) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [Customer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        fun properties(properties: Properties) = properties(JsonField.of(properties))

        /**
         * Sets [Builder.properties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.properties] with a well-typed [Properties] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun properties(properties: JsonField<Properties>) = apply { this.properties = properties }

        /** The event this payload describes. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [CustomerEditedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .customer()
         * .properties()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerEditedWebhookEvent =
            CustomerEditedWebhookEvent(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("customer", customer),
                checkRequired("properties", properties),
                checkRequired("type", type),
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
    fun validate(): CustomerEditedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        customer().validate()
        properties().validate()
        type().validate()
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
            (if (createdAt.asKnown() == null) 0 else 1) +
            (customer.asKnown()?.validity() ?: 0) +
            (properties.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0)

    class Properties
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val previousAttributes: JsonField<PreviousAttributes>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("previous_attributes")
            @ExcludeMissing
            previousAttributes: JsonField<PreviousAttributes> = JsonMissing.of()
        ) : this(previousAttributes, mutableMapOf())

        /**
         * metadata values are non-null on the wire (deleting a key removes it from storage); the
         * Optional[str] values only exist on the new half of a metadata FieldChange.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun previousAttributes(): PreviousAttributes =
            previousAttributes.getRequired("previous_attributes")

        /**
         * Returns the raw JSON value of [previousAttributes].
         *
         * Unlike [previousAttributes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("previous_attributes")
        @ExcludeMissing
        fun _previousAttributes(): JsonField<PreviousAttributes> = previousAttributes

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
             * Returns a mutable builder for constructing an instance of [Properties].
             *
             * The following fields are required:
             * ```kotlin
             * .previousAttributes()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Properties]. */
        class Builder internal constructor() {

            private var previousAttributes: JsonField<PreviousAttributes>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(properties: Properties) = apply {
                previousAttributes = properties.previousAttributes
                additionalProperties = properties.additionalProperties.toMutableMap()
            }

            /**
             * metadata values are non-null on the wire (deleting a key removes it from storage);
             * the Optional[str] values only exist on the new half of a metadata FieldChange.
             */
            fun previousAttributes(previousAttributes: PreviousAttributes) =
                previousAttributes(JsonField.of(previousAttributes))

            /**
             * Sets [Builder.previousAttributes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previousAttributes] with a well-typed
             * [PreviousAttributes] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun previousAttributes(previousAttributes: JsonField<PreviousAttributes>) = apply {
                this.previousAttributes = previousAttributes
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
             * Returns an immutable instance of [Properties].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .previousAttributes()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Properties =
                Properties(
                    checkRequired("previousAttributes", previousAttributes),
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
        fun validate(): Properties = apply {
            if (validated) {
                return@apply
            }

            previousAttributes().validate()
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
        internal fun validity(): Int = (previousAttributes.asKnown()?.validity() ?: 0)

        /**
         * metadata values are non-null on the wire (deleting a key removes it from storage); the
         * Optional[str] values only exist on the new half of a metadata FieldChange.
         */
        class PreviousAttributes
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val autoCollection: JsonField<Boolean>,
            private val billingAddress: JsonField<Address>,
            private val defaultPaymentMethodId: JsonField<String>,
            private val email: JsonField<String>,
            private val emailDelivery: JsonField<Boolean>,
            private val externalCustomerId: JsonField<String>,
            private val metadata: JsonField<Metadata>,
            private val name: JsonField<String>,
            private val paymentProvider: JsonField<String>,
            private val paymentProviderId: JsonField<String>,
            private val shippingAddress: JsonField<Address>,
            private val taxId: JsonField<CustomerTaxId>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auto_collection")
                @ExcludeMissing
                autoCollection: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("billing_address")
                @ExcludeMissing
                billingAddress: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("default_payment_method_id")
                @ExcludeMissing
                defaultPaymentMethodId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("email_delivery")
                @ExcludeMissing
                emailDelivery: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("external_customer_id")
                @ExcludeMissing
                externalCustomerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("metadata")
                @ExcludeMissing
                metadata: JsonField<Metadata> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_provider")
                @ExcludeMissing
                paymentProvider: JsonField<String> = JsonMissing.of(),
                @JsonProperty("payment_provider_id")
                @ExcludeMissing
                paymentProviderId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("shipping_address")
                @ExcludeMissing
                shippingAddress: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("tax_id")
                @ExcludeMissing
                taxId: JsonField<CustomerTaxId> = JsonMissing.of(),
            ) : this(
                autoCollection,
                billingAddress,
                defaultPaymentMethodId,
                email,
                emailDelivery,
                externalCustomerId,
                metadata,
                name,
                paymentProvider,
                paymentProviderId,
                shippingAddress,
                taxId,
                mutableMapOf(),
            )

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun billingAddress(): Address? = billingAddress.getNullable("billing_address")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun defaultPaymentMethodId(): String? =
                defaultPaymentMethodId.getNullable("default_payment_method_id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun email(): String? = email.getNullable("email")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun emailDelivery(): Boolean? = emailDelivery.getNullable("email_delivery")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun externalCustomerId(): String? =
                externalCustomerId.getNullable("external_customer_id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun metadata(): Metadata? = metadata.getNullable("metadata")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun paymentProvider(): String? = paymentProvider.getNullable("payment_provider")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun paymentProviderId(): String? = paymentProviderId.getNullable("payment_provider_id")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun shippingAddress(): Address? = shippingAddress.getNullable("shipping_address")

            /**
             * Tax IDs are commonly required to be displayed on customer invoices, which are added
             * to the headers of invoices.
             *
             * ### Supported Tax ID Countries and Types
             * |Country               |Type        |Description                                                                                            |
             * |----------------------|------------|-------------------------------------------------------------------------------------------------------|
             * |Albania               |`al_tin`    |Albania Tax Identification Number                                                                      |
             * |Andorra               |`ad_nrt`    |Andorran NRT Number                                                                                    |
             * |Angola                |`ao_tin`    |Angola Tax Identification Number                                                                       |
             * |Argentina             |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
             * |Armenia               |`am_tin`    |Armenia Tax Identification Number                                                                      |
             * |Aruba                 |`aw_tin`    |Aruba Tax Identification Number                                                                        |
             * |Australia             |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
             * |Australia             |`au_arn`    |Australian Taxation Office Reference Number                                                            |
             * |Austria               |`eu_vat`    |European VAT Number                                                                                    |
             * |Azerbaijan            |`az_tin`    |Azerbaijan Tax Identification Number                                                                   |
             * |Bahamas               |`bs_tin`    |Bahamas Tax Identification Number                                                                      |
             * |Bahrain               |`bh_vat`    |Bahraini VAT Number                                                                                    |
             * |Bangladesh            |`bd_bin`    |Bangladesh Business Identification Number                                                              |
             * |Barbados              |`bb_tin`    |Barbados Tax Identification Number                                                                     |
             * |Belarus               |`by_tin`    |Belarus TIN Number                                                                                     |
             * |Belgium               |`eu_vat`    |European VAT Number                                                                                    |
             * |Benin                 |`bj_ifu`    |Benin Tax Identification Number (Identifiant Fiscal Unique)                                            |
             * |Bolivia               |`bo_tin`    |Bolivian Tax ID                                                                                        |
             * |Bosnia and Herzegovina|`ba_tin`    |Bosnia and Herzegovina Tax Identification Number                                                       |
             * |Brazil                |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
             * |Brazil                |`br_cpf`    |Brazilian CPF Number                                                                                   |
             * |Bulgaria              |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
             * |Bulgaria              |`eu_vat`    |European VAT Number                                                                                    |
             * |Burkina Faso          |`bf_ifu`    |Burkina Faso Tax Identification Number (Numéro d'Identifiant Fiscal Unique)                            |
             * |Cambodia              |`kh_tin`    |Cambodia Tax Identification Number                                                                     |
             * |Cameroon              |`cm_niu`    |Cameroon Tax Identification Number (Numéro d'Identifiant fiscal Unique)                                |
             * |Canada                |`ca_bn`     |Canadian BN                                                                                            |
             * |Canada                |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
             * |Canada                |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
             * |Canada                |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
             * |Canada                |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
             * |Canada                |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
             * |Cape Verde            |`cv_nif`    |Cape Verde Tax Identification Number (Número de Identificação Fiscal)                                  |
             * |Chile                 |`cl_tin`    |Chilean TIN                                                                                            |
             * |China                 |`cn_tin`    |Chinese Tax ID                                                                                         |
             * |Colombia              |`co_nit`    |Colombian NIT Number                                                                                   |
             * |Congo-Kinshasa        |`cd_nif`    |Congo (DR) Tax Identification Number (Número de Identificação Fiscal)                                  |
             * |Costa Rica            |`cr_tin`    |Costa Rican Tax ID                                                                                     |
             * |Croatia               |`eu_vat`    |European VAT Number                                                                                    |
             * |Croatia               |`hr_oib`    |Croatian Personal Identification Number (OIB)                                                          |
             * |Cyprus                |`eu_vat`    |European VAT Number                                                                                    |
             * |Czech Republic        |`eu_vat`    |European VAT Number                                                                                    |
             * |Denmark               |`eu_vat`    |European VAT Number                                                                                    |
             * |Dominican Republic    |`do_rcn`    |Dominican RCN Number                                                                                   |
             * |Ecuador               |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
             * |Egypt                 |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
             * |El Salvador           |`sv_nit`    |El Salvadorian NIT Number                                                                              |
             * |Estonia               |`eu_vat`    |European VAT Number                                                                                    |
             * |Ethiopia              |`et_tin`    |Ethiopia Tax Identification Number                                                                     |
             * |European Union        |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
             * |Faroe Islands         |`fo_vat`    |Faroe Islands VAT Number                                                                               |
             * |Finland               |`eu_vat`    |European VAT Number                                                                                    |
             * |France                |`eu_vat`    |European VAT Number                                                                                    |
             * |Georgia               |`ge_vat`    |Georgian VAT                                                                                           |
             * |Germany               |`de_stn`    |German Tax Number (Steuernummer)                                                                       |
             * |Germany               |`eu_vat`    |European VAT Number                                                                                    |
             * |Gibraltar             |`gi_tin`    |Gibraltar Tax Identification Number                                                                    |
             * |Greece                |`eu_vat`    |European VAT Number                                                                                    |
             * |Guinea                |`gn_nif`    |Guinea Tax Identification Number (Número de Identificação Fiscal)                                      |
             * |Hong Kong             |`hk_br`     |Hong Kong BR Number                                                                                    |
             * |Hungary               |`eu_vat`    |European VAT Number                                                                                    |
             * |Hungary               |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
             * |Iceland               |`is_vat`    |Icelandic VAT                                                                                          |
             * |India                 |`in_gst`    |Indian GST Number                                                                                      |
             * |Indonesia             |`id_npwp`   |Indonesian NPWP Number                                                                                 |
             * |Ireland               |`eu_vat`    |European VAT Number                                                                                    |
             * |Israel                |`il_vat`    |Israel VAT                                                                                             |
             * |Italy                 |`eu_vat`    |European VAT Number                                                                                    |
             * |Italy                 |`it_cf`     |Italian Codice Fiscale Number                                                                          |
             * |Japan                 |`jp_cn`     |Japanese Corporate Number (*Hōjin Bangō*)                                                              |
             * |Japan                 |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (*Tōroku Kokugai Jigyōsha no Tōroku Bangō*)|
             * |Japan                 |`jp_trn`    |Japanese Tax Registration Number (*Tōroku Bangō*)                                                      |
             * |Kazakhstan            |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
             * |Kenya                 |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
             * |Kyrgyzstan            |`kg_tin`    |Kyrgyzstan Tax Identification Number                                                                   |
             * |Laos                  |`la_tin`    |Laos Tax Identification Number                                                                         |
             * |Latvia                |`eu_vat`    |European VAT Number                                                                                    |
             * |Liechtenstein         |`li_uid`    |Liechtensteinian UID Number                                                                            |
             * |Liechtenstein         |`li_vat`    |Liechtenstein VAT Number                                                                               |
             * |Lithuania             |`eu_vat`    |European VAT Number                                                                                    |
             * |Luxembourg            |`eu_vat`    |European VAT Number                                                                                    |
             * |Malaysia              |`my_frp`    |Malaysian FRP Number                                                                                   |
             * |Malaysia              |`my_itn`    |Malaysian ITN                                                                                          |
             * |Malaysia              |`my_sst`    |Malaysian SST Number                                                                                   |
             * |Malta                 |`eu_vat`    |European VAT Number                                                                                    |
             * |Mauritania            |`mr_nif`    |Mauritania Tax Identification Number (Número de Identificação Fiscal)                                  |
             * |Mexico                |`mx_rfc`    |Mexican RFC Number                                                                                     |
             * |Moldova               |`md_vat`    |Moldova VAT Number                                                                                     |
             * |Montenegro            |`me_pib`    |Montenegro PIB Number                                                                                  |
             * |Morocco               |`ma_vat`    |Morocco VAT Number                                                                                     |
             * |Nepal                 |`np_pan`    |Nepal PAN Number                                                                                       |
             * |Netherlands           |`eu_vat`    |European VAT Number                                                                                    |
             * |New Zealand           |`nz_gst`    |New Zealand GST Number                                                                                 |
             * |Nigeria               |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
             * |North Macedonia       |`mk_vat`    |North Macedonia VAT Number                                                                             |
             * |Northern Ireland      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
             * |Norway                |`no_vat`    |Norwegian VAT Number                                                                                   |
             * |Norway                |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
             * |Oman                  |`om_vat`    |Omani VAT Number                                                                                       |
             * |Paraguay              |`py_ruc`    |Paraguayan RUC Number                                                                                  |
             * |Peru                  |`pe_ruc`    |Peruvian RUC Number                                                                                    |
             * |Philippines           |`ph_tin`    |Philippines Tax Identification Number                                                                  |
             * |Poland                |`eu_vat`    |European VAT Number                                                                                    |
             * |Poland                |`pl_nip`    |Polish Tax ID Number                                                                                   |
             * |Portugal              |`eu_vat`    |European VAT Number                                                                                    |
             * |Romania               |`eu_vat`    |European VAT Number                                                                                    |
             * |Romania               |`ro_tin`    |Romanian Tax ID Number                                                                                 |
             * |Russia                |`ru_inn`    |Russian INN                                                                                            |
             * |Russia                |`ru_kpp`    |Russian KPP                                                                                            |
             * |Saudi Arabia          |`sa_vat`    |Saudi Arabia VAT                                                                                       |
             * |Senegal               |`sn_ninea`  |Senegal NINEA Number                                                                                   |
             * |Serbia                |`rs_pib`    |Serbian PIB Number                                                                                     |
             * |Singapore             |`sg_gst`    |Singaporean GST                                                                                        |
             * |Singapore             |`sg_uen`    |Singaporean UEN                                                                                        |
             * |Slovakia              |`eu_vat`    |European VAT Number                                                                                    |
             * |Slovenia              |`eu_vat`    |European VAT Number                                                                                    |
             * |Slovenia              |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
             * |South Africa          |`za_vat`    |South African VAT Number                                                                               |
             * |South Korea           |`kr_brn`    |Korean BRN                                                                                             |
             * |Spain                 |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
             * |Spain                 |`eu_vat`    |European VAT Number                                                                                    |
             * |Sri Lanka             |`lk_vat`    |Sri Lanka VAT Number                                                                                   |
             * |Suriname              |`sr_fin`    |Suriname FIN Number                                                                                    |
             * |Sweden                |`eu_vat`    |European VAT Number                                                                                    |
             * |Switzerland           |`ch_uid`    |Switzerland UID Number                                                                                 |
             * |Switzerland           |`ch_vat`    |Switzerland VAT Number                                                                                 |
             * |Taiwan                |`tw_vat`    |Taiwanese VAT                                                                                          |
             * |Tajikistan            |`tj_tin`    |Tajikistan Tax Identification Number                                                                   |
             * |Tanzania              |`tz_vat`    |Tanzania VAT Number                                                                                    |
             * |Thailand              |`th_vat`    |Thai VAT                                                                                               |
             * |Turkey                |`tr_tin`    |Turkish Tax Identification Number                                                                      |
             * |Uganda                |`ug_tin`    |Uganda Tax Identification Number                                                                       |
             * |Ukraine               |`ua_vat`    |Ukrainian VAT                                                                                          |
             * |United Arab Emirates  |`ae_trn`    |United Arab Emirates TRN                                                                               |
             * |United Kingdom        |`gb_vat`    |United Kingdom VAT Number                                                                              |
             * |United States         |`us_ein`    |United States EIN                                                                                      |
             * |Uruguay               |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
             * |Uzbekistan            |`uz_tin`    |Uzbekistan TIN Number                                                                                  |
             * |Uzbekistan            |`uz_vat`    |Uzbekistan VAT Number                                                                                  |
             * |Venezuela             |`ve_rif`    |Venezuelan RIF Number                                                                                  |
             * |Vietnam               |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
             * |Zambia                |`zm_tin`    |Zambia Tax Identification Number                                                                       |
             * |Zimbabwe              |`zw_tin`    |Zimbabwe Tax Identification Number                                                                     |
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
             *   server responded with an unexpected value).
             */
            fun taxId(): CustomerTaxId? = taxId.getNullable("tax_id")

            /**
             * Returns the raw JSON value of [autoCollection].
             *
             * Unlike [autoCollection], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("auto_collection")
            @ExcludeMissing
            fun _autoCollection(): JsonField<Boolean> = autoCollection

            /**
             * Returns the raw JSON value of [billingAddress].
             *
             * Unlike [billingAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_address")
            @ExcludeMissing
            fun _billingAddress(): JsonField<Address> = billingAddress

            /**
             * Returns the raw JSON value of [defaultPaymentMethodId].
             *
             * Unlike [defaultPaymentMethodId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("default_payment_method_id")
            @ExcludeMissing
            fun _defaultPaymentMethodId(): JsonField<String> = defaultPaymentMethodId

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
             * Returns the raw JSON value of [externalCustomerId].
             *
             * Unlike [externalCustomerId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun _externalCustomerId(): JsonField<String> = externalCustomerId

            /**
             * Returns the raw JSON value of [metadata].
             *
             * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metadata")
            @ExcludeMissing
            fun _metadata(): JsonField<Metadata> = metadata

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [paymentProvider].
             *
             * Unlike [paymentProvider], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_provider")
            @ExcludeMissing
            fun _paymentProvider(): JsonField<String> = paymentProvider

            /**
             * Returns the raw JSON value of [paymentProviderId].
             *
             * Unlike [paymentProviderId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_provider_id")
            @ExcludeMissing
            fun _paymentProviderId(): JsonField<String> = paymentProviderId

            /**
             * Returns the raw JSON value of [shippingAddress].
             *
             * Unlike [shippingAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("shipping_address")
            @ExcludeMissing
            fun _shippingAddress(): JsonField<Address> = shippingAddress

            /**
             * Returns the raw JSON value of [taxId].
             *
             * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<CustomerTaxId> = taxId

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
                 * Returns a mutable builder for constructing an instance of [PreviousAttributes].
                 */
                fun builder() = Builder()
            }

            /** A builder for [PreviousAttributes]. */
            class Builder internal constructor() {

                private var autoCollection: JsonField<Boolean> = JsonMissing.of()
                private var billingAddress: JsonField<Address> = JsonMissing.of()
                private var defaultPaymentMethodId: JsonField<String> = JsonMissing.of()
                private var email: JsonField<String> = JsonMissing.of()
                private var emailDelivery: JsonField<Boolean> = JsonMissing.of()
                private var externalCustomerId: JsonField<String> = JsonMissing.of()
                private var metadata: JsonField<Metadata> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var paymentProvider: JsonField<String> = JsonMissing.of()
                private var paymentProviderId: JsonField<String> = JsonMissing.of()
                private var shippingAddress: JsonField<Address> = JsonMissing.of()
                private var taxId: JsonField<CustomerTaxId> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(previousAttributes: PreviousAttributes) = apply {
                    autoCollection = previousAttributes.autoCollection
                    billingAddress = previousAttributes.billingAddress
                    defaultPaymentMethodId = previousAttributes.defaultPaymentMethodId
                    email = previousAttributes.email
                    emailDelivery = previousAttributes.emailDelivery
                    externalCustomerId = previousAttributes.externalCustomerId
                    metadata = previousAttributes.metadata
                    name = previousAttributes.name
                    paymentProvider = previousAttributes.paymentProvider
                    paymentProviderId = previousAttributes.paymentProviderId
                    shippingAddress = previousAttributes.shippingAddress
                    taxId = previousAttributes.taxId
                    additionalProperties = previousAttributes.additionalProperties.toMutableMap()
                }

                fun autoCollection(autoCollection: Boolean?) =
                    autoCollection(JsonField.ofNullable(autoCollection))

                /**
                 * Alias for [Builder.autoCollection].
                 *
                 * This unboxed primitive overload exists for backwards compatibility.
                 */
                fun autoCollection(autoCollection: Boolean) =
                    autoCollection(autoCollection as Boolean?)

                /**
                 * Sets [Builder.autoCollection] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.autoCollection] with a well-typed [Boolean]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                    this.autoCollection = autoCollection
                }

                fun billingAddress(billingAddress: Address?) =
                    billingAddress(JsonField.ofNullable(billingAddress))

                /**
                 * Sets [Builder.billingAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingAddress] with a well-typed [Address]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billingAddress(billingAddress: JsonField<Address>) = apply {
                    this.billingAddress = billingAddress
                }

                fun defaultPaymentMethodId(defaultPaymentMethodId: String?) =
                    defaultPaymentMethodId(JsonField.ofNullable(defaultPaymentMethodId))

                /**
                 * Sets [Builder.defaultPaymentMethodId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.defaultPaymentMethodId] with a well-typed
                 * [String] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun defaultPaymentMethodId(defaultPaymentMethodId: JsonField<String>) = apply {
                    this.defaultPaymentMethodId = defaultPaymentMethodId
                }

                fun email(email: String?) = email(JsonField.ofNullable(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun emailDelivery(emailDelivery: JsonField<Boolean>) = apply {
                    this.emailDelivery = emailDelivery
                }

                fun externalCustomerId(externalCustomerId: String?) =
                    externalCustomerId(JsonField.ofNullable(externalCustomerId))

                /**
                 * Sets [Builder.externalCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                    this.externalCustomerId = externalCustomerId
                }

                fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                /**
                 * Sets [Builder.metadata] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun paymentProvider(paymentProvider: String?) =
                    paymentProvider(JsonField.ofNullable(paymentProvider))

                /**
                 * Sets [Builder.paymentProvider] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentProvider] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentProvider(paymentProvider: JsonField<String>) = apply {
                    this.paymentProvider = paymentProvider
                }

                fun paymentProviderId(paymentProviderId: String?) =
                    paymentProviderId(JsonField.ofNullable(paymentProviderId))

                /**
                 * Sets [Builder.paymentProviderId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentProviderId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
                    this.paymentProviderId = paymentProviderId
                }

                fun shippingAddress(shippingAddress: Address?) =
                    shippingAddress(JsonField.ofNullable(shippingAddress))

                /**
                 * Sets [Builder.shippingAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.shippingAddress] with a well-typed [Address]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun shippingAddress(shippingAddress: JsonField<Address>) = apply {
                    this.shippingAddress = shippingAddress
                }

                /**
                 * Tax IDs are commonly required to be displayed on customer invoices, which are
                 * added to the headers of invoices.
                 *
                 * ### Supported Tax ID Countries and Types
                 * |Country               |Type        |Description                                                                                            |
                 * |----------------------|------------|-------------------------------------------------------------------------------------------------------|
                 * |Albania               |`al_tin`    |Albania Tax Identification Number                                                                      |
                 * |Andorra               |`ad_nrt`    |Andorran NRT Number                                                                                    |
                 * |Angola                |`ao_tin`    |Angola Tax Identification Number                                                                       |
                 * |Argentina             |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
                 * |Armenia               |`am_tin`    |Armenia Tax Identification Number                                                                      |
                 * |Aruba                 |`aw_tin`    |Aruba Tax Identification Number                                                                        |
                 * |Australia             |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
                 * |Australia             |`au_arn`    |Australian Taxation Office Reference Number                                                            |
                 * |Austria               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Azerbaijan            |`az_tin`    |Azerbaijan Tax Identification Number                                                                   |
                 * |Bahamas               |`bs_tin`    |Bahamas Tax Identification Number                                                                      |
                 * |Bahrain               |`bh_vat`    |Bahraini VAT Number                                                                                    |
                 * |Bangladesh            |`bd_bin`    |Bangladesh Business Identification Number                                                              |
                 * |Barbados              |`bb_tin`    |Barbados Tax Identification Number                                                                     |
                 * |Belarus               |`by_tin`    |Belarus TIN Number                                                                                     |
                 * |Belgium               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Benin                 |`bj_ifu`    |Benin Tax Identification Number (Identifiant Fiscal Unique)                                            |
                 * |Bolivia               |`bo_tin`    |Bolivian Tax ID                                                                                        |
                 * |Bosnia and Herzegovina|`ba_tin`    |Bosnia and Herzegovina Tax Identification Number                                                       |
                 * |Brazil                |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
                 * |Brazil                |`br_cpf`    |Brazilian CPF Number                                                                                   |
                 * |Bulgaria              |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
                 * |Bulgaria              |`eu_vat`    |European VAT Number                                                                                    |
                 * |Burkina Faso          |`bf_ifu`    |Burkina Faso Tax Identification Number (Numéro d'Identifiant Fiscal Unique)                            |
                 * |Cambodia              |`kh_tin`    |Cambodia Tax Identification Number                                                                     |
                 * |Cameroon              |`cm_niu`    |Cameroon Tax Identification Number (Numéro d'Identifiant fiscal Unique)                                |
                 * |Canada                |`ca_bn`     |Canadian BN                                                                                            |
                 * |Canada                |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
                 * |Canada                |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
                 * |Canada                |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
                 * |Canada                |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
                 * |Canada                |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
                 * |Cape Verde            |`cv_nif`    |Cape Verde Tax Identification Number (Número de Identificação Fiscal)                                  |
                 * |Chile                 |`cl_tin`    |Chilean TIN                                                                                            |
                 * |China                 |`cn_tin`    |Chinese Tax ID                                                                                         |
                 * |Colombia              |`co_nit`    |Colombian NIT Number                                                                                   |
                 * |Congo-Kinshasa        |`cd_nif`    |Congo (DR) Tax Identification Number (Número de Identificação Fiscal)                                  |
                 * |Costa Rica            |`cr_tin`    |Costa Rican Tax ID                                                                                     |
                 * |Croatia               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Croatia               |`hr_oib`    |Croatian Personal Identification Number (OIB)                                                          |
                 * |Cyprus                |`eu_vat`    |European VAT Number                                                                                    |
                 * |Czech Republic        |`eu_vat`    |European VAT Number                                                                                    |
                 * |Denmark               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Dominican Republic    |`do_rcn`    |Dominican RCN Number                                                                                   |
                 * |Ecuador               |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
                 * |Egypt                 |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
                 * |El Salvador           |`sv_nit`    |El Salvadorian NIT Number                                                                              |
                 * |Estonia               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Ethiopia              |`et_tin`    |Ethiopia Tax Identification Number                                                                     |
                 * |European Union        |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
                 * |Faroe Islands         |`fo_vat`    |Faroe Islands VAT Number                                                                               |
                 * |Finland               |`eu_vat`    |European VAT Number                                                                                    |
                 * |France                |`eu_vat`    |European VAT Number                                                                                    |
                 * |Georgia               |`ge_vat`    |Georgian VAT                                                                                           |
                 * |Germany               |`de_stn`    |German Tax Number (Steuernummer)                                                                       |
                 * |Germany               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Gibraltar             |`gi_tin`    |Gibraltar Tax Identification Number                                                                    |
                 * |Greece                |`eu_vat`    |European VAT Number                                                                                    |
                 * |Guinea                |`gn_nif`    |Guinea Tax Identification Number (Número de Identificação Fiscal)                                      |
                 * |Hong Kong             |`hk_br`     |Hong Kong BR Number                                                                                    |
                 * |Hungary               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Hungary               |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
                 * |Iceland               |`is_vat`    |Icelandic VAT                                                                                          |
                 * |India                 |`in_gst`    |Indian GST Number                                                                                      |
                 * |Indonesia             |`id_npwp`   |Indonesian NPWP Number                                                                                 |
                 * |Ireland               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Israel                |`il_vat`    |Israel VAT                                                                                             |
                 * |Italy                 |`eu_vat`    |European VAT Number                                                                                    |
                 * |Italy                 |`it_cf`     |Italian Codice Fiscale Number                                                                          |
                 * |Japan                 |`jp_cn`     |Japanese Corporate Number (*Hōjin Bangō*)                                                              |
                 * |Japan                 |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (*Tōroku Kokugai Jigyōsha no Tōroku Bangō*)|
                 * |Japan                 |`jp_trn`    |Japanese Tax Registration Number (*Tōroku Bangō*)                                                      |
                 * |Kazakhstan            |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
                 * |Kenya                 |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
                 * |Kyrgyzstan            |`kg_tin`    |Kyrgyzstan Tax Identification Number                                                                   |
                 * |Laos                  |`la_tin`    |Laos Tax Identification Number                                                                         |
                 * |Latvia                |`eu_vat`    |European VAT Number                                                                                    |
                 * |Liechtenstein         |`li_uid`    |Liechtensteinian UID Number                                                                            |
                 * |Liechtenstein         |`li_vat`    |Liechtenstein VAT Number                                                                               |
                 * |Lithuania             |`eu_vat`    |European VAT Number                                                                                    |
                 * |Luxembourg            |`eu_vat`    |European VAT Number                                                                                    |
                 * |Malaysia              |`my_frp`    |Malaysian FRP Number                                                                                   |
                 * |Malaysia              |`my_itn`    |Malaysian ITN                                                                                          |
                 * |Malaysia              |`my_sst`    |Malaysian SST Number                                                                                   |
                 * |Malta                 |`eu_vat`    |European VAT Number                                                                                    |
                 * |Mauritania            |`mr_nif`    |Mauritania Tax Identification Number (Número de Identificação Fiscal)                                  |
                 * |Mexico                |`mx_rfc`    |Mexican RFC Number                                                                                     |
                 * |Moldova               |`md_vat`    |Moldova VAT Number                                                                                     |
                 * |Montenegro            |`me_pib`    |Montenegro PIB Number                                                                                  |
                 * |Morocco               |`ma_vat`    |Morocco VAT Number                                                                                     |
                 * |Nepal                 |`np_pan`    |Nepal PAN Number                                                                                       |
                 * |Netherlands           |`eu_vat`    |European VAT Number                                                                                    |
                 * |New Zealand           |`nz_gst`    |New Zealand GST Number                                                                                 |
                 * |Nigeria               |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
                 * |North Macedonia       |`mk_vat`    |North Macedonia VAT Number                                                                             |
                 * |Northern Ireland      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
                 * |Norway                |`no_vat`    |Norwegian VAT Number                                                                                   |
                 * |Norway                |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
                 * |Oman                  |`om_vat`    |Omani VAT Number                                                                                       |
                 * |Paraguay              |`py_ruc`    |Paraguayan RUC Number                                                                                  |
                 * |Peru                  |`pe_ruc`    |Peruvian RUC Number                                                                                    |
                 * |Philippines           |`ph_tin`    |Philippines Tax Identification Number                                                                  |
                 * |Poland                |`eu_vat`    |European VAT Number                                                                                    |
                 * |Poland                |`pl_nip`    |Polish Tax ID Number                                                                                   |
                 * |Portugal              |`eu_vat`    |European VAT Number                                                                                    |
                 * |Romania               |`eu_vat`    |European VAT Number                                                                                    |
                 * |Romania               |`ro_tin`    |Romanian Tax ID Number                                                                                 |
                 * |Russia                |`ru_inn`    |Russian INN                                                                                            |
                 * |Russia                |`ru_kpp`    |Russian KPP                                                                                            |
                 * |Saudi Arabia          |`sa_vat`    |Saudi Arabia VAT                                                                                       |
                 * |Senegal               |`sn_ninea`  |Senegal NINEA Number                                                                                   |
                 * |Serbia                |`rs_pib`    |Serbian PIB Number                                                                                     |
                 * |Singapore             |`sg_gst`    |Singaporean GST                                                                                        |
                 * |Singapore             |`sg_uen`    |Singaporean UEN                                                                                        |
                 * |Slovakia              |`eu_vat`    |European VAT Number                                                                                    |
                 * |Slovenia              |`eu_vat`    |European VAT Number                                                                                    |
                 * |Slovenia              |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
                 * |South Africa          |`za_vat`    |South African VAT Number                                                                               |
                 * |South Korea           |`kr_brn`    |Korean BRN                                                                                             |
                 * |Spain                 |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
                 * |Spain                 |`eu_vat`    |European VAT Number                                                                                    |
                 * |Sri Lanka             |`lk_vat`    |Sri Lanka VAT Number                                                                                   |
                 * |Suriname              |`sr_fin`    |Suriname FIN Number                                                                                    |
                 * |Sweden                |`eu_vat`    |European VAT Number                                                                                    |
                 * |Switzerland           |`ch_uid`    |Switzerland UID Number                                                                                 |
                 * |Switzerland           |`ch_vat`    |Switzerland VAT Number                                                                                 |
                 * |Taiwan                |`tw_vat`    |Taiwanese VAT                                                                                          |
                 * |Tajikistan            |`tj_tin`    |Tajikistan Tax Identification Number                                                                   |
                 * |Tanzania              |`tz_vat`    |Tanzania VAT Number                                                                                    |
                 * |Thailand              |`th_vat`    |Thai VAT                                                                                               |
                 * |Turkey                |`tr_tin`    |Turkish Tax Identification Number                                                                      |
                 * |Uganda                |`ug_tin`    |Uganda Tax Identification Number                                                                       |
                 * |Ukraine               |`ua_vat`    |Ukrainian VAT                                                                                          |
                 * |United Arab Emirates  |`ae_trn`    |United Arab Emirates TRN                                                                               |
                 * |United Kingdom        |`gb_vat`    |United Kingdom VAT Number                                                                              |
                 * |United States         |`us_ein`    |United States EIN                                                                                      |
                 * |Uruguay               |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
                 * |Uzbekistan            |`uz_tin`    |Uzbekistan TIN Number                                                                                  |
                 * |Uzbekistan            |`uz_vat`    |Uzbekistan VAT Number                                                                                  |
                 * |Venezuela             |`ve_rif`    |Venezuelan RIF Number                                                                                  |
                 * |Vietnam               |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
                 * |Zambia                |`zm_tin`    |Zambia Tax Identification Number                                                                       |
                 * |Zimbabwe              |`zw_tin`    |Zimbabwe Tax Identification Number                                                                     |
                 */
                fun taxId(taxId: CustomerTaxId?) = taxId(JsonField.ofNullable(taxId))

                /**
                 * Sets [Builder.taxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxId] with a well-typed [CustomerTaxId] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taxId(taxId: JsonField<CustomerTaxId>) = apply { this.taxId = taxId }

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
                 * Returns an immutable instance of [PreviousAttributes].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PreviousAttributes =
                    PreviousAttributes(
                        autoCollection,
                        billingAddress,
                        defaultPaymentMethodId,
                        email,
                        emailDelivery,
                        externalCustomerId,
                        metadata,
                        name,
                        paymentProvider,
                        paymentProviderId,
                        shippingAddress,
                        taxId,
                        additionalProperties.toMutableMap(),
                    )
            }

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
            fun validate(): PreviousAttributes = apply {
                if (validated) {
                    return@apply
                }

                autoCollection()
                billingAddress()?.validate()
                defaultPaymentMethodId()
                email()
                emailDelivery()
                externalCustomerId()
                metadata()?.validate()
                name()
                paymentProvider()
                paymentProviderId()
                shippingAddress()?.validate()
                taxId()?.validate()
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
                    (billingAddress.asKnown()?.validity() ?: 0) +
                    (if (defaultPaymentMethodId.asKnown() == null) 0 else 1) +
                    (if (email.asKnown() == null) 0 else 1) +
                    (if (emailDelivery.asKnown() == null) 0 else 1) +
                    (if (externalCustomerId.asKnown() == null) 0 else 1) +
                    (metadata.asKnown()?.validity() ?: 0) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (paymentProvider.asKnown() == null) 0 else 1) +
                    (if (paymentProviderId.asKnown() == null) 0 else 1) +
                    (shippingAddress.asKnown()?.validity() ?: 0) +
                    (taxId.asKnown()?.validity() ?: 0)

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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws OrbInvalidDataException if any value type in this object doesn't match
                 *   its expected type.
                 */
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PreviousAttributes &&
                    autoCollection == other.autoCollection &&
                    billingAddress == other.billingAddress &&
                    defaultPaymentMethodId == other.defaultPaymentMethodId &&
                    email == other.email &&
                    emailDelivery == other.emailDelivery &&
                    externalCustomerId == other.externalCustomerId &&
                    metadata == other.metadata &&
                    name == other.name &&
                    paymentProvider == other.paymentProvider &&
                    paymentProviderId == other.paymentProviderId &&
                    shippingAddress == other.shippingAddress &&
                    taxId == other.taxId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    autoCollection,
                    billingAddress,
                    defaultPaymentMethodId,
                    email,
                    emailDelivery,
                    externalCustomerId,
                    metadata,
                    name,
                    paymentProvider,
                    paymentProviderId,
                    shippingAddress,
                    taxId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PreviousAttributes{autoCollection=$autoCollection, billingAddress=$billingAddress, defaultPaymentMethodId=$defaultPaymentMethodId, email=$email, emailDelivery=$emailDelivery, externalCustomerId=$externalCustomerId, metadata=$metadata, name=$name, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, shippingAddress=$shippingAddress, taxId=$taxId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Properties &&
                previousAttributes == other.previousAttributes &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(previousAttributes, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Properties{previousAttributes=$previousAttributes, additionalProperties=$additionalProperties}"
    }

    /** The event this payload describes. */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CUSTOMER_EDITED = of("customer.edited")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CUSTOMER_EDITED
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER_EDITED,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                CUSTOMER_EDITED -> Value.CUSTOMER_EDITED
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
                CUSTOMER_EDITED -> Known.CUSTOMER_EDITED
                else -> throw OrbInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerEditedWebhookEvent &&
            id == other.id &&
            createdAt == other.createdAt &&
            customer == other.customer &&
            properties == other.properties &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, createdAt, customer, properties, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerEditedWebhookEvent{id=$id, createdAt=$createdAt, customer=$customer, properties=$properties, type=$type, additionalProperties=$additionalProperties}"
}
