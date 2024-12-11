// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.Enum
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.util.Objects

class CustomerCreateParams
constructor(
    private val email: String,
    private val name: String,
    private val accountingSyncConfiguration: AccountingSyncConfiguration?,
    private val additionalEmails: List<String>?,
    private val autoCollection: Boolean?,
    private val billingAddress: BillingAddress?,
    private val currency: String?,
    private val emailDelivery: Boolean?,
    private val externalCustomerId: String?,
    private val metadata: Metadata?,
    private val paymentProvider: PaymentProvider?,
    private val paymentProviderId: String?,
    private val reportingConfiguration: ReportingConfiguration?,
    private val shippingAddress: ShippingAddress?,
    private val taxConfiguration: TaxConfiguration?,
    private val taxId: TaxId?,
    private val timezone: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun email(): String = email

    fun name(): String = name

    fun accountingSyncConfiguration(): AccountingSyncConfiguration? = accountingSyncConfiguration

    fun additionalEmails(): List<String>? = additionalEmails

    fun autoCollection(): Boolean? = autoCollection

    fun billingAddress(): BillingAddress? = billingAddress

    fun currency(): String? = currency

    fun emailDelivery(): Boolean? = emailDelivery

    fun externalCustomerId(): String? = externalCustomerId

    fun metadata(): Metadata? = metadata

    fun paymentProvider(): PaymentProvider? = paymentProvider

    fun paymentProviderId(): String? = paymentProviderId

    fun reportingConfiguration(): ReportingConfiguration? = reportingConfiguration

    fun shippingAddress(): ShippingAddress? = shippingAddress

    fun taxConfiguration(): TaxConfiguration? = taxConfiguration

    fun taxId(): TaxId? = taxId

    fun timezone(): String? = timezone

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): CustomerCreateBody {
        return CustomerCreateBody(
            email,
            name,
            accountingSyncConfiguration,
            additionalEmails,
            autoCollection,
            billingAddress,
            currency,
            emailDelivery,
            externalCustomerId,
            metadata,
            paymentProvider,
            paymentProviderId,
            reportingConfiguration,
            shippingAddress,
            taxConfiguration,
            taxId,
            timezone,
            additionalBodyProperties,
        )
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = CustomerCreateBody.Builder::class)
    @NoAutoDetect
    class CustomerCreateBody
    internal constructor(
        private val email: String?,
        private val name: String?,
        private val accountingSyncConfiguration: AccountingSyncConfiguration?,
        private val additionalEmails: List<String>?,
        private val autoCollection: Boolean?,
        private val billingAddress: BillingAddress?,
        private val currency: String?,
        private val emailDelivery: Boolean?,
        private val externalCustomerId: String?,
        private val metadata: Metadata?,
        private val paymentProvider: PaymentProvider?,
        private val paymentProviderId: String?,
        private val reportingConfiguration: ReportingConfiguration?,
        private val shippingAddress: ShippingAddress?,
        private val taxConfiguration: TaxConfiguration?,
        private val taxId: TaxId?,
        private val timezone: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        @JsonProperty("email") fun email(): String? = email

        /** The full name of the customer */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("accounting_sync_configuration")
        fun accountingSyncConfiguration(): AccountingSyncConfiguration? =
            accountingSyncConfiguration

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        @JsonProperty("additional_emails") fun additionalEmails(): List<String>? = additionalEmails

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         */
        @JsonProperty("auto_collection") fun autoCollection(): Boolean? = autoCollection

        @JsonProperty("billing_address") fun billingAddress(): BillingAddress? = billingAddress

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         */
        @JsonProperty("currency") fun currency(): String? = currency

        @JsonProperty("email_delivery") fun emailDelivery(): Boolean? = emailDelivery

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        @JsonProperty("external_customer_id") fun externalCustomerId(): String? = externalCustomerId

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        @JsonProperty("payment_provider") fun paymentProvider(): PaymentProvider? = paymentProvider

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        @JsonProperty("payment_provider_id") fun paymentProviderId(): String? = paymentProviderId

        @JsonProperty("reporting_configuration")
        fun reportingConfiguration(): ReportingConfiguration? = reportingConfiguration

        @JsonProperty("shipping_address") fun shippingAddress(): ShippingAddress? = shippingAddress

        @JsonProperty("tax_configuration")
        fun taxConfiguration(): TaxConfiguration? = taxConfiguration

        /**
         * Tax IDs are commonly required to be displayed on customer invoices, which are added to
         * the headers of invoices.
         *
         * ### Supported Tax ID Countries and Types
         * |Country             |Type        |Description                                                                                            |
         * |--------------------|------------|-------------------------------------------------------------------------------------------------------|
         * |Andorra             |`ad_nrt`    |Andorran NRT Number                                                                                    |
         * |Argentina           |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
         * |Australia           |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
         * |Australia           |`au_arn`    |Australian Taxation Office Reference Number                                                            |
         * |Austria             |`eu_vat`    |European VAT Number                                                                                    |
         * |Bahrain             |`bh_vat`    |Bahraini VAT Number                                                                                    |
         * |Belgium             |`eu_vat`    |European VAT Number                                                                                    |
         * |Bolivia             |`bo_tin`    |Bolivian Tax ID                                                                                        |
         * |Brazil              |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
         * |Brazil              |`br_cpf`    |Brazilian CPF Number                                                                                   |
         * |Bulgaria            |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
         * |Bulgaria            |`eu_vat`    |European VAT Number                                                                                    |
         * |Canada              |`ca_bn`     |Canadian BN                                                                                            |
         * |Canada              |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
         * |Canada              |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
         * |Canada              |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
         * |Canada              |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
         * |Canada              |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
         * |Chile               |`cl_tin`    |Chilean TIN                                                                                            |
         * |China               |`cn_tin`    |Chinese Tax ID                                                                                         |
         * |Colombia            |`co_nit`    |Colombian NIT Number                                                                                   |
         * |Costa Rica          |`cr_tin`    |Costa Rican Tax ID                                                                                     |
         * |Croatia             |`eu_vat`    |European VAT Number                                                                                    |
         * |Cyprus              |`eu_vat`    |European VAT Number                                                                                    |
         * |Czech Republic      |`eu_vat`    |European VAT Number                                                                                    |
         * |Denmark             |`eu_vat`    |European VAT Number                                                                                    |
         * |Dominican Republic  |`do_rcn`    |Dominican RCN Number                                                                                   |
         * |Ecuador             |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
         * |Egypt               |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
         * |El Salvador         |`sv_nit`    |El Salvadorian NIT Number                                                                              |
         * |Estonia             |`eu_vat`    |European VAT Number                                                                                    |
         * |EU                  |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
         * |Finland             |`eu_vat`    |European VAT Number                                                                                    |
         * |France              |`eu_vat`    |European VAT Number                                                                                    |
         * |Georgia             |`ge_vat`    |Georgian VAT                                                                                           |
         * |Germany             |`eu_vat`    |European VAT Number                                                                                    |
         * |Greece              |`eu_vat`    |European VAT Number                                                                                    |
         * |Hong Kong           |`hk_br`     |Hong Kong BR Number                                                                                    |
         * |Hungary             |`eu_vat`    |European VAT Number                                                                                    |
         * |Hungary             |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
         * |Iceland             |`is_vat`    |Icelandic VAT                                                                                          |
         * |India               |`in_gst`    |Indian GST Number                                                                                      |
         * |Indonesia           |`id_npwp`   |Indonesian NPWP Number                                                                                 |
         * |Ireland             |`eu_vat`    |European VAT Number                                                                                    |
         * |Israel              |`il_vat`    |Israel VAT                                                                                             |
         * |Italy               |`eu_vat`    |European VAT Number                                                                                    |
         * |Japan               |`jp_cn`     |Japanese Corporate Number (_Hōjin Bangō_)                                                              |
         * |Japan               |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_)|
         * |Japan               |`jp_trn`    |Japanese Tax Registration Number (_Tōroku Bangō_)                                                      |
         * |Kazakhstan          |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
         * |Kenya               |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
         * |Latvia              |`eu_vat`    |European VAT Number                                                                                    |
         * |Liechtenstein       |`li_uid`    |Liechtensteinian UID Number                                                                            |
         * |Lithuania           |`eu_vat`    |European VAT Number                                                                                    |
         * |Luxembourg          |`eu_vat`    |European VAT Number                                                                                    |
         * |Malaysia            |`my_frp`    |Malaysian FRP Number                                                                                   |
         * |Malaysia            |`my_itn`    |Malaysian ITN                                                                                          |
         * |Malaysia            |`my_sst`    |Malaysian SST Number                                                                                   |
         * |Malta               |`eu_vat `   |European VAT Number                                                                                    |
         * |Mexico              |`mx_rfc`    |Mexican RFC Number                                                                                     |
         * |Netherlands         |`eu_vat`    |European VAT Number                                                                                    |
         * |New Zealand         |`nz_gst`    |New Zealand GST Number                                                                                 |
         * |Nigeria             |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
         * |Norway              |`no_vat`    |Norwegian VAT Number                                                                                   |
         * |Norway              |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
         * |Oman                |`om_vat`    |Omani VAT Number                                                                                       |
         * |Peru                |`pe_ruc`    |Peruvian RUC Number                                                                                    |
         * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
         * |Poland              |`eu_vat`    |European VAT Number                                                                                    |
         * |Portugal            |`eu_vat`    |European VAT Number                                                                                    |
         * |Romania             |`eu_vat`    |European VAT Number                                                                                    |
         * |Romania             |`ro_tin`    |Romanian Tax ID Number                                                                                 |
         * |Russia              |`ru_inn`    |Russian INN                                                                                            |
         * |Russia              |`ru_kpp`    |Russian KPP                                                                                            |
         * |Saudi Arabia        |`sa_vat`    |Saudi Arabia VAT                                                                                       |
         * |Serbia              |`rs_pib`    |Serbian PIB Number                                                                                     |
         * |Singapore           |`sg_gst`    |Singaporean GST                                                                                        |
         * |Singapore           |`sg_uen`    |Singaporean UEN                                                                                        |
         * |Slovakia            |`eu_vat`    |European VAT Number                                                                                    |
         * |Slovenia            |`eu_vat`    |European VAT Number                                                                                    |
         * |Slovenia            |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
         * |South Africa        |`za_vat`    |South African VAT Number                                                                               |
         * |South Korea         |`kr_brn`    |Korean BRN                                                                                             |
         * |Spain               |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
         * |Spain               |`eu_vat`    |European VAT Number                                                                                    |
         * |Sweden              |`eu_vat`    |European VAT Number                                                                                    |
         * |Switzerland         |`ch_vat`    |Switzerland VAT Number                                                                                 |
         * |Taiwan              |`tw_vat`    |Taiwanese VAT                                                                                          |
         * |Thailand            |`th_vat`    |Thai VAT                                                                                               |
         * |Turkey              |`tr_tin`    |Turkish Tax Identification Number                                                                      |
         * |Ukraine             |`ua_vat`    |Ukrainian VAT                                                                                          |
         * |United Arab Emirates|`ae_trn`    |United Arab Emirates TRN                                                                               |
         * |United Kingdom      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
         * |United Kingdom      |`gb_vat`    |United Kingdom VAT Number                                                                              |
         * |United States       |`us_ein`    |United States EIN                                                                                      |
         * |Uruguay             |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
         * |Venezuela           |`ve_rif`    |Venezuelan RIF Number                                                                                  |
         * |Vietnam             |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
         */
        @JsonProperty("tax_id") fun taxId(): TaxId? = taxId

        /**
         * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`.
         * This defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        @JsonProperty("timezone") fun timezone(): String? = timezone

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var email: String? = null
            private var name: String? = null
            private var accountingSyncConfiguration: AccountingSyncConfiguration? = null
            private var additionalEmails: List<String>? = null
            private var autoCollection: Boolean? = null
            private var billingAddress: BillingAddress? = null
            private var currency: String? = null
            private var emailDelivery: Boolean? = null
            private var externalCustomerId: String? = null
            private var metadata: Metadata? = null
            private var paymentProvider: PaymentProvider? = null
            private var paymentProviderId: String? = null
            private var reportingConfiguration: ReportingConfiguration? = null
            private var shippingAddress: ShippingAddress? = null
            private var taxConfiguration: TaxConfiguration? = null
            private var taxId: TaxId? = null
            private var timezone: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customerCreateBody: CustomerCreateBody) = apply {
                this.email = customerCreateBody.email
                this.name = customerCreateBody.name
                this.accountingSyncConfiguration = customerCreateBody.accountingSyncConfiguration
                this.additionalEmails = customerCreateBody.additionalEmails
                this.autoCollection = customerCreateBody.autoCollection
                this.billingAddress = customerCreateBody.billingAddress
                this.currency = customerCreateBody.currency
                this.emailDelivery = customerCreateBody.emailDelivery
                this.externalCustomerId = customerCreateBody.externalCustomerId
                this.metadata = customerCreateBody.metadata
                this.paymentProvider = customerCreateBody.paymentProvider
                this.paymentProviderId = customerCreateBody.paymentProviderId
                this.reportingConfiguration = customerCreateBody.reportingConfiguration
                this.shippingAddress = customerCreateBody.shippingAddress
                this.taxConfiguration = customerCreateBody.taxConfiguration
                this.taxId = customerCreateBody.taxId
                this.timezone = customerCreateBody.timezone
                additionalProperties(customerCreateBody.additionalProperties)
            }

            /**
             * A valid customer email, to be used for notifications. When Orb triggers payment
             * through a payment gateway, this email will be used for any automatically issued
             * receipts.
             */
            @JsonProperty("email") fun email(email: String) = apply { this.email = email }

            /** The full name of the customer */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("accounting_sync_configuration")
            fun accountingSyncConfiguration(
                accountingSyncConfiguration: AccountingSyncConfiguration
            ) = apply { this.accountingSyncConfiguration = accountingSyncConfiguration }

            /**
             * Additional email addresses for this customer. If populated, these email addresses
             * will be CC'd for customer communications.
             */
            @JsonProperty("additional_emails")
            fun additionalEmails(additionalEmails: List<String>) = apply {
                this.additionalEmails = additionalEmails
            }

            /**
             * Used to determine if invoices for this customer will automatically attempt to charge
             * a saved payment method, if available. This parameter defaults to `True` when a
             * payment provider is provided on customer creation.
             */
            @JsonProperty("auto_collection")
            fun autoCollection(autoCollection: Boolean) = apply {
                this.autoCollection = autoCollection
            }

            @JsonProperty("billing_address")
            fun billingAddress(billingAddress: BillingAddress) = apply {
                this.billingAddress = billingAddress
            }

            /**
             * An ISO 4217 currency string used for the customer's invoices and balance. If not set
             * at creation time, will be set at subscription creation time.
             */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            @JsonProperty("email_delivery")
            fun emailDelivery(emailDelivery: Boolean) = apply { this.emailDelivery = emailDelivery }

            /**
             * An optional user-defined ID for this customer resource, used throughout the system as
             * an alias for this Customer. Use this field to identify a customer by an existing
             * identifier in your system.
             */
            @JsonProperty("external_customer_id")
            fun externalCustomerId(externalCustomerId: String) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /**
             * This is used for creating charges or invoices in an external system via Orb. When not
             * in test mode, the connection must first be configured in the Orb webapp.
             */
            @JsonProperty("payment_provider")
            fun paymentProvider(paymentProvider: PaymentProvider) = apply {
                this.paymentProvider = paymentProvider
            }

            /**
             * The ID of this customer in an external payments solution, such as Stripe. This is
             * used for creating charges or invoices in the external system via Orb.
             */
            @JsonProperty("payment_provider_id")
            fun paymentProviderId(paymentProviderId: String) = apply {
                this.paymentProviderId = paymentProviderId
            }

            @JsonProperty("reporting_configuration")
            fun reportingConfiguration(reportingConfiguration: ReportingConfiguration) = apply {
                this.reportingConfiguration = reportingConfiguration
            }

            @JsonProperty("shipping_address")
            fun shippingAddress(shippingAddress: ShippingAddress) = apply {
                this.shippingAddress = shippingAddress
            }

            @JsonProperty("tax_configuration")
            fun taxConfiguration(taxConfiguration: TaxConfiguration) = apply {
                this.taxConfiguration = taxConfiguration
            }

            /**
             * Tax IDs are commonly required to be displayed on customer invoices, which are added
             * to the headers of invoices.
             *
             * ### Supported Tax ID Countries and Types
             * |Country             |Type        |Description                                                                                            |
             * |--------------------|------------|-------------------------------------------------------------------------------------------------------|
             * |Andorra             |`ad_nrt`    |Andorran NRT Number                                                                                    |
             * |Argentina           |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
             * |Australia           |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
             * |Australia           |`au_arn`    |Australian Taxation Office Reference Number                                                            |
             * |Austria             |`eu_vat`    |European VAT Number                                                                                    |
             * |Bahrain             |`bh_vat`    |Bahraini VAT Number                                                                                    |
             * |Belgium             |`eu_vat`    |European VAT Number                                                                                    |
             * |Bolivia             |`bo_tin`    |Bolivian Tax ID                                                                                        |
             * |Brazil              |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
             * |Brazil              |`br_cpf`    |Brazilian CPF Number                                                                                   |
             * |Bulgaria            |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
             * |Bulgaria            |`eu_vat`    |European VAT Number                                                                                    |
             * |Canada              |`ca_bn`     |Canadian BN                                                                                            |
             * |Canada              |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
             * |Canada              |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
             * |Canada              |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
             * |Canada              |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
             * |Canada              |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
             * |Chile               |`cl_tin`    |Chilean TIN                                                                                            |
             * |China               |`cn_tin`    |Chinese Tax ID                                                                                         |
             * |Colombia            |`co_nit`    |Colombian NIT Number                                                                                   |
             * |Costa Rica          |`cr_tin`    |Costa Rican Tax ID                                                                                     |
             * |Croatia             |`eu_vat`    |European VAT Number                                                                                    |
             * |Cyprus              |`eu_vat`    |European VAT Number                                                                                    |
             * |Czech Republic      |`eu_vat`    |European VAT Number                                                                                    |
             * |Denmark             |`eu_vat`    |European VAT Number                                                                                    |
             * |Dominican Republic  |`do_rcn`    |Dominican RCN Number                                                                                   |
             * |Ecuador             |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
             * |Egypt               |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
             * |El Salvador         |`sv_nit`    |El Salvadorian NIT Number                                                                              |
             * |Estonia             |`eu_vat`    |European VAT Number                                                                                    |
             * |EU                  |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
             * |Finland             |`eu_vat`    |European VAT Number                                                                                    |
             * |France              |`eu_vat`    |European VAT Number                                                                                    |
             * |Georgia             |`ge_vat`    |Georgian VAT                                                                                           |
             * |Germany             |`eu_vat`    |European VAT Number                                                                                    |
             * |Greece              |`eu_vat`    |European VAT Number                                                                                    |
             * |Hong Kong           |`hk_br`     |Hong Kong BR Number                                                                                    |
             * |Hungary             |`eu_vat`    |European VAT Number                                                                                    |
             * |Hungary             |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
             * |Iceland             |`is_vat`    |Icelandic VAT                                                                                          |
             * |India               |`in_gst`    |Indian GST Number                                                                                      |
             * |Indonesia           |`id_npwp`   |Indonesian NPWP Number                                                                                 |
             * |Ireland             |`eu_vat`    |European VAT Number                                                                                    |
             * |Israel              |`il_vat`    |Israel VAT                                                                                             |
             * |Italy               |`eu_vat`    |European VAT Number                                                                                    |
             * |Japan               |`jp_cn`     |Japanese Corporate Number (_Hōjin Bangō_)                                                              |
             * |Japan               |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_)|
             * |Japan               |`jp_trn`    |Japanese Tax Registration Number (_Tōroku Bangō_)                                                      |
             * |Kazakhstan          |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
             * |Kenya               |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
             * |Latvia              |`eu_vat`    |European VAT Number                                                                                    |
             * |Liechtenstein       |`li_uid`    |Liechtensteinian UID Number                                                                            |
             * |Lithuania           |`eu_vat`    |European VAT Number                                                                                    |
             * |Luxembourg          |`eu_vat`    |European VAT Number                                                                                    |
             * |Malaysia            |`my_frp`    |Malaysian FRP Number                                                                                   |
             * |Malaysia            |`my_itn`    |Malaysian ITN                                                                                          |
             * |Malaysia            |`my_sst`    |Malaysian SST Number                                                                                   |
             * |Malta               |`eu_vat `   |European VAT Number                                                                                    |
             * |Mexico              |`mx_rfc`    |Mexican RFC Number                                                                                     |
             * |Netherlands         |`eu_vat`    |European VAT Number                                                                                    |
             * |New Zealand         |`nz_gst`    |New Zealand GST Number                                                                                 |
             * |Nigeria             |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
             * |Norway              |`no_vat`    |Norwegian VAT Number                                                                                   |
             * |Norway              |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
             * |Oman                |`om_vat`    |Omani VAT Number                                                                                       |
             * |Peru                |`pe_ruc`    |Peruvian RUC Number                                                                                    |
             * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
             * |Poland              |`eu_vat`    |European VAT Number                                                                                    |
             * |Portugal            |`eu_vat`    |European VAT Number                                                                                    |
             * |Romania             |`eu_vat`    |European VAT Number                                                                                    |
             * |Romania             |`ro_tin`    |Romanian Tax ID Number                                                                                 |
             * |Russia              |`ru_inn`    |Russian INN                                                                                            |
             * |Russia              |`ru_kpp`    |Russian KPP                                                                                            |
             * |Saudi Arabia        |`sa_vat`    |Saudi Arabia VAT                                                                                       |
             * |Serbia              |`rs_pib`    |Serbian PIB Number                                                                                     |
             * |Singapore           |`sg_gst`    |Singaporean GST                                                                                        |
             * |Singapore           |`sg_uen`    |Singaporean UEN                                                                                        |
             * |Slovakia            |`eu_vat`    |European VAT Number                                                                                    |
             * |Slovenia            |`eu_vat`    |European VAT Number                                                                                    |
             * |Slovenia            |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
             * |South Africa        |`za_vat`    |South African VAT Number                                                                               |
             * |South Korea         |`kr_brn`    |Korean BRN                                                                                             |
             * |Spain               |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
             * |Spain               |`eu_vat`    |European VAT Number                                                                                    |
             * |Sweden              |`eu_vat`    |European VAT Number                                                                                    |
             * |Switzerland         |`ch_vat`    |Switzerland VAT Number                                                                                 |
             * |Taiwan              |`tw_vat`    |Taiwanese VAT                                                                                          |
             * |Thailand            |`th_vat`    |Thai VAT                                                                                               |
             * |Turkey              |`tr_tin`    |Turkish Tax Identification Number                                                                      |
             * |Ukraine             |`ua_vat`    |Ukrainian VAT                                                                                          |
             * |United Arab Emirates|`ae_trn`    |United Arab Emirates TRN                                                                               |
             * |United Kingdom      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
             * |United Kingdom      |`gb_vat`    |United Kingdom VAT Number                                                                              |
             * |United States       |`us_ein`    |United States EIN                                                                                      |
             * |Uruguay             |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
             * |Venezuela           |`ve_rif`    |Venezuelan RIF Number                                                                                  |
             * |Vietnam             |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
             */
            @JsonProperty("tax_id") fun taxId(taxId: TaxId) = apply { this.taxId = taxId }

            /**
             * A timezone identifier from the IANA timezone database, such as
             * `"America/Los_Angeles"`. This defaults to your account's timezone if not set. This
             * cannot be changed after customer creation.
             */
            @JsonProperty("timezone")
            fun timezone(timezone: String) = apply { this.timezone = timezone }

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

            fun build(): CustomerCreateBody =
                CustomerCreateBody(
                    checkNotNull(email) { "`email` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    accountingSyncConfiguration,
                    additionalEmails?.toImmutable(),
                    autoCollection,
                    billingAddress,
                    currency,
                    emailDelivery,
                    externalCustomerId,
                    metadata,
                    paymentProvider,
                    paymentProviderId,
                    reportingConfiguration,
                    shippingAddress,
                    taxConfiguration,
                    taxId,
                    timezone,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCreateBody && email == other.email && name == other.name && accountingSyncConfiguration == other.accountingSyncConfiguration && additionalEmails == other.additionalEmails && autoCollection == other.autoCollection && billingAddress == other.billingAddress && currency == other.currency && emailDelivery == other.emailDelivery && externalCustomerId == other.externalCustomerId && metadata == other.metadata && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && reportingConfiguration == other.reportingConfiguration && shippingAddress == other.shippingAddress && taxConfiguration == other.taxConfiguration && taxId == other.taxId && timezone == other.timezone && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(email, name, accountingSyncConfiguration, additionalEmails, autoCollection, billingAddress, currency, emailDelivery, externalCustomerId, metadata, paymentProvider, paymentProviderId, reportingConfiguration, shippingAddress, taxConfiguration, taxId, timezone, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerCreateBody{email=$email, name=$name, accountingSyncConfiguration=$accountingSyncConfiguration, additionalEmails=$additionalEmails, autoCollection=$autoCollection, billingAddress=$billingAddress, currency=$currency, emailDelivery=$emailDelivery, externalCustomerId=$externalCustomerId, metadata=$metadata, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, reportingConfiguration=$reportingConfiguration, shippingAddress=$shippingAddress, taxConfiguration=$taxConfiguration, taxId=$taxId, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var email: String? = null
        private var name: String? = null
        private var accountingSyncConfiguration: AccountingSyncConfiguration? = null
        private var additionalEmails: MutableList<String> = mutableListOf()
        private var autoCollection: Boolean? = null
        private var billingAddress: BillingAddress? = null
        private var currency: String? = null
        private var emailDelivery: Boolean? = null
        private var externalCustomerId: String? = null
        private var metadata: Metadata? = null
        private var paymentProvider: PaymentProvider? = null
        private var paymentProviderId: String? = null
        private var reportingConfiguration: ReportingConfiguration? = null
        private var shippingAddress: ShippingAddress? = null
        private var taxConfiguration: TaxConfiguration? = null
        private var taxId: TaxId? = null
        private var timezone: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerCreateParams: CustomerCreateParams) = apply {
            email = customerCreateParams.email
            name = customerCreateParams.name
            accountingSyncConfiguration = customerCreateParams.accountingSyncConfiguration
            additionalEmails =
                customerCreateParams.additionalEmails?.toMutableList() ?: mutableListOf()
            autoCollection = customerCreateParams.autoCollection
            billingAddress = customerCreateParams.billingAddress
            currency = customerCreateParams.currency
            emailDelivery = customerCreateParams.emailDelivery
            externalCustomerId = customerCreateParams.externalCustomerId
            metadata = customerCreateParams.metadata
            paymentProvider = customerCreateParams.paymentProvider
            paymentProviderId = customerCreateParams.paymentProviderId
            reportingConfiguration = customerCreateParams.reportingConfiguration
            shippingAddress = customerCreateParams.shippingAddress
            taxConfiguration = customerCreateParams.taxConfiguration
            taxId = customerCreateParams.taxId
            timezone = customerCreateParams.timezone
            additionalHeaders = customerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = customerCreateParams.additionalBodyProperties.toMutableMap()
        }

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        fun email(email: String) = apply { this.email = email }

        /** The full name of the customer */
        fun name(name: String) = apply { this.name = name }

        fun accountingSyncConfiguration(accountingSyncConfiguration: AccountingSyncConfiguration) =
            apply {
                this.accountingSyncConfiguration = accountingSyncConfiguration
            }

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        fun additionalEmails(additionalEmails: List<String>) = apply {
            this.additionalEmails.clear()
            this.additionalEmails.addAll(additionalEmails)
        }

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        fun addAdditionalEmail(additionalEmail: String) = apply {
            this.additionalEmails.add(additionalEmail)
        }

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         */
        fun autoCollection(autoCollection: Boolean) = apply { this.autoCollection = autoCollection }

        fun billingAddress(billingAddress: BillingAddress) = apply {
            this.billingAddress = billingAddress
        }

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         */
        fun currency(currency: String) = apply { this.currency = currency }

        fun emailDelivery(emailDelivery: Boolean) = apply { this.emailDelivery = emailDelivery }

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        fun externalCustomerId(externalCustomerId: String) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        fun paymentProvider(paymentProvider: PaymentProvider) = apply {
            this.paymentProvider = paymentProvider
        }

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(paymentProviderId: String) = apply {
            this.paymentProviderId = paymentProviderId
        }

        fun reportingConfiguration(reportingConfiguration: ReportingConfiguration) = apply {
            this.reportingConfiguration = reportingConfiguration
        }

        fun shippingAddress(shippingAddress: ShippingAddress) = apply {
            this.shippingAddress = shippingAddress
        }

        fun taxConfiguration(taxConfiguration: TaxConfiguration) = apply {
            this.taxConfiguration = taxConfiguration
        }

        fun taxConfiguration(
            newAvalaraTaxConfiguration: TaxConfiguration.NewAvalaraTaxConfiguration
        ) = apply {
            this.taxConfiguration =
                TaxConfiguration.ofNewAvalaraTaxConfiguration(newAvalaraTaxConfiguration)
        }

        fun taxConfiguration(newTaxJarConfiguration: TaxConfiguration.NewTaxJarConfiguration) =
            apply {
                this.taxConfiguration =
                    TaxConfiguration.ofNewTaxJarConfiguration(newTaxJarConfiguration)
            }

        /**
         * Tax IDs are commonly required to be displayed on customer invoices, which are added to
         * the headers of invoices.
         *
         * ### Supported Tax ID Countries and Types
         * |Country             |Type        |Description                                                                                            |
         * |--------------------|------------|-------------------------------------------------------------------------------------------------------|
         * |Andorra             |`ad_nrt`    |Andorran NRT Number                                                                                    |
         * |Argentina           |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
         * |Australia           |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
         * |Australia           |`au_arn`    |Australian Taxation Office Reference Number                                                            |
         * |Austria             |`eu_vat`    |European VAT Number                                                                                    |
         * |Bahrain             |`bh_vat`    |Bahraini VAT Number                                                                                    |
         * |Belgium             |`eu_vat`    |European VAT Number                                                                                    |
         * |Bolivia             |`bo_tin`    |Bolivian Tax ID                                                                                        |
         * |Brazil              |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
         * |Brazil              |`br_cpf`    |Brazilian CPF Number                                                                                   |
         * |Bulgaria            |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
         * |Bulgaria            |`eu_vat`    |European VAT Number                                                                                    |
         * |Canada              |`ca_bn`     |Canadian BN                                                                                            |
         * |Canada              |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
         * |Canada              |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
         * |Canada              |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
         * |Canada              |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
         * |Canada              |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
         * |Chile               |`cl_tin`    |Chilean TIN                                                                                            |
         * |China               |`cn_tin`    |Chinese Tax ID                                                                                         |
         * |Colombia            |`co_nit`    |Colombian NIT Number                                                                                   |
         * |Costa Rica          |`cr_tin`    |Costa Rican Tax ID                                                                                     |
         * |Croatia             |`eu_vat`    |European VAT Number                                                                                    |
         * |Cyprus              |`eu_vat`    |European VAT Number                                                                                    |
         * |Czech Republic      |`eu_vat`    |European VAT Number                                                                                    |
         * |Denmark             |`eu_vat`    |European VAT Number                                                                                    |
         * |Dominican Republic  |`do_rcn`    |Dominican RCN Number                                                                                   |
         * |Ecuador             |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
         * |Egypt               |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
         * |El Salvador         |`sv_nit`    |El Salvadorian NIT Number                                                                              |
         * |Estonia             |`eu_vat`    |European VAT Number                                                                                    |
         * |EU                  |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
         * |Finland             |`eu_vat`    |European VAT Number                                                                                    |
         * |France              |`eu_vat`    |European VAT Number                                                                                    |
         * |Georgia             |`ge_vat`    |Georgian VAT                                                                                           |
         * |Germany             |`eu_vat`    |European VAT Number                                                                                    |
         * |Greece              |`eu_vat`    |European VAT Number                                                                                    |
         * |Hong Kong           |`hk_br`     |Hong Kong BR Number                                                                                    |
         * |Hungary             |`eu_vat`    |European VAT Number                                                                                    |
         * |Hungary             |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
         * |Iceland             |`is_vat`    |Icelandic VAT                                                                                          |
         * |India               |`in_gst`    |Indian GST Number                                                                                      |
         * |Indonesia           |`id_npwp`   |Indonesian NPWP Number                                                                                 |
         * |Ireland             |`eu_vat`    |European VAT Number                                                                                    |
         * |Israel              |`il_vat`    |Israel VAT                                                                                             |
         * |Italy               |`eu_vat`    |European VAT Number                                                                                    |
         * |Japan               |`jp_cn`     |Japanese Corporate Number (_Hōjin Bangō_)                                                              |
         * |Japan               |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_)|
         * |Japan               |`jp_trn`    |Japanese Tax Registration Number (_Tōroku Bangō_)                                                      |
         * |Kazakhstan          |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
         * |Kenya               |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
         * |Latvia              |`eu_vat`    |European VAT Number                                                                                    |
         * |Liechtenstein       |`li_uid`    |Liechtensteinian UID Number                                                                            |
         * |Lithuania           |`eu_vat`    |European VAT Number                                                                                    |
         * |Luxembourg          |`eu_vat`    |European VAT Number                                                                                    |
         * |Malaysia            |`my_frp`    |Malaysian FRP Number                                                                                   |
         * |Malaysia            |`my_itn`    |Malaysian ITN                                                                                          |
         * |Malaysia            |`my_sst`    |Malaysian SST Number                                                                                   |
         * |Malta               |`eu_vat `   |European VAT Number                                                                                    |
         * |Mexico              |`mx_rfc`    |Mexican RFC Number                                                                                     |
         * |Netherlands         |`eu_vat`    |European VAT Number                                                                                    |
         * |New Zealand         |`nz_gst`    |New Zealand GST Number                                                                                 |
         * |Nigeria             |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
         * |Norway              |`no_vat`    |Norwegian VAT Number                                                                                   |
         * |Norway              |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
         * |Oman                |`om_vat`    |Omani VAT Number                                                                                       |
         * |Peru                |`pe_ruc`    |Peruvian RUC Number                                                                                    |
         * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
         * |Poland              |`eu_vat`    |European VAT Number                                                                                    |
         * |Portugal            |`eu_vat`    |European VAT Number                                                                                    |
         * |Romania             |`eu_vat`    |European VAT Number                                                                                    |
         * |Romania             |`ro_tin`    |Romanian Tax ID Number                                                                                 |
         * |Russia              |`ru_inn`    |Russian INN                                                                                            |
         * |Russia              |`ru_kpp`    |Russian KPP                                                                                            |
         * |Saudi Arabia        |`sa_vat`    |Saudi Arabia VAT                                                                                       |
         * |Serbia              |`rs_pib`    |Serbian PIB Number                                                                                     |
         * |Singapore           |`sg_gst`    |Singaporean GST                                                                                        |
         * |Singapore           |`sg_uen`    |Singaporean UEN                                                                                        |
         * |Slovakia            |`eu_vat`    |European VAT Number                                                                                    |
         * |Slovenia            |`eu_vat`    |European VAT Number                                                                                    |
         * |Slovenia            |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
         * |South Africa        |`za_vat`    |South African VAT Number                                                                               |
         * |South Korea         |`kr_brn`    |Korean BRN                                                                                             |
         * |Spain               |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
         * |Spain               |`eu_vat`    |European VAT Number                                                                                    |
         * |Sweden              |`eu_vat`    |European VAT Number                                                                                    |
         * |Switzerland         |`ch_vat`    |Switzerland VAT Number                                                                                 |
         * |Taiwan              |`tw_vat`    |Taiwanese VAT                                                                                          |
         * |Thailand            |`th_vat`    |Thai VAT                                                                                               |
         * |Turkey              |`tr_tin`    |Turkish Tax Identification Number                                                                      |
         * |Ukraine             |`ua_vat`    |Ukrainian VAT                                                                                          |
         * |United Arab Emirates|`ae_trn`    |United Arab Emirates TRN                                                                               |
         * |United Kingdom      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
         * |United Kingdom      |`gb_vat`    |United Kingdom VAT Number                                                                              |
         * |United States       |`us_ein`    |United States EIN                                                                                      |
         * |Uruguay             |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
         * |Venezuela           |`ve_rif`    |Venezuelan RIF Number                                                                                  |
         * |Vietnam             |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
         */
        fun taxId(taxId: TaxId) = apply { this.taxId = taxId }

        /**
         * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`.
         * This defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        fun timezone(timezone: String) = apply { this.timezone = timezone }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): CustomerCreateParams =
            CustomerCreateParams(
                checkNotNull(email) { "`email` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                accountingSyncConfiguration,
                additionalEmails.toImmutable().ifEmpty { null },
                autoCollection,
                billingAddress,
                currency,
                emailDelivery,
                externalCustomerId,
                metadata,
                paymentProvider,
                paymentProviderId,
                reportingConfiguration,
                shippingAddress,
                taxConfiguration,
                taxId,
                timezone,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AccountingSyncConfiguration.Builder::class)
    @NoAutoDetect
    class AccountingSyncConfiguration
    private constructor(
        private val excluded: Boolean?,
        private val accountingProviders: List<AccountingProvider>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("excluded") fun excluded(): Boolean? = excluded

        @JsonProperty("accounting_providers")
        fun accountingProviders(): List<AccountingProvider>? = accountingProviders

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var excluded: Boolean? = null
            private var accountingProviders: List<AccountingProvider>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountingSyncConfiguration: AccountingSyncConfiguration) = apply {
                this.excluded = accountingSyncConfiguration.excluded
                this.accountingProviders = accountingSyncConfiguration.accountingProviders
                additionalProperties(accountingSyncConfiguration.additionalProperties)
            }

            @JsonProperty("excluded")
            fun excluded(excluded: Boolean) = apply { this.excluded = excluded }

            @JsonProperty("accounting_providers")
            fun accountingProviders(accountingProviders: List<AccountingProvider>) = apply {
                this.accountingProviders = accountingProviders
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

            fun build(): AccountingSyncConfiguration =
                AccountingSyncConfiguration(
                    excluded,
                    accountingProviders?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = AccountingProvider.Builder::class)
        @NoAutoDetect
        class AccountingProvider
        private constructor(
            private val providerType: String?,
            private val externalProviderId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("provider_type") fun providerType(): String? = providerType

            @JsonProperty("external_provider_id")
            fun externalProviderId(): String? = externalProviderId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var providerType: String? = null
                private var externalProviderId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountingProvider: AccountingProvider) = apply {
                    this.providerType = accountingProvider.providerType
                    this.externalProviderId = accountingProvider.externalProviderId
                    additionalProperties(accountingProvider.additionalProperties)
                }

                @JsonProperty("provider_type")
                fun providerType(providerType: String) = apply { this.providerType = providerType }

                @JsonProperty("external_provider_id")
                fun externalProviderId(externalProviderId: String) = apply {
                    this.externalProviderId = externalProviderId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AccountingProvider =
                    AccountingProvider(
                        checkNotNull(providerType) { "`providerType` is required but was not set" },
                        checkNotNull(externalProviderId) {
                            "`externalProviderId` is required but was not set"
                        },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountingProvider && providerType == other.providerType && externalProviderId == other.externalProviderId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(providerType, externalProviderId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountingProvider{providerType=$providerType, externalProviderId=$externalProviderId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountingSyncConfiguration && excluded == other.excluded && accountingProviders == other.accountingProviders && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(excluded, accountingProviders, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountingSyncConfiguration{excluded=$excluded, accountingProviders=$accountingProviders, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = BillingAddress.Builder::class)
    @NoAutoDetect
    class BillingAddress
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val city: String?,
        private val state: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("line1") fun line1(): String? = line1

        @JsonProperty("line2") fun line2(): String? = line2

        @JsonProperty("city") fun city(): String? = city

        @JsonProperty("state") fun state(): String? = state

        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        @JsonProperty("country") fun country(): String? = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var city: String? = null
            private var state: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billingAddress: BillingAddress) = apply {
                this.line1 = billingAddress.line1
                this.line2 = billingAddress.line2
                this.city = billingAddress.city
                this.state = billingAddress.state
                this.postalCode = billingAddress.postalCode
                this.country = billingAddress.country
                additionalProperties(billingAddress.additionalProperties)
            }

            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            @JsonProperty("state") fun state(state: String) = apply { this.state = state }

            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            fun build(): BillingAddress =
                BillingAddress(
                    line1,
                    line2,
                    city,
                    state,
                    postalCode,
                    country,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingAddress && line1 == other.line1 && line2 == other.line2 && city == other.city && state == other.state && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, city, state, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingAddress{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties(metadata.additionalProperties)
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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class PaymentProvider
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val QUICKBOOKS = of("quickbooks")

            val BILL_COM = of("bill.com")

            val STRIPE_CHARGE = of("stripe_charge")

            val STRIPE_INVOICE = of("stripe_invoice")

            val NETSUITE = of("netsuite")

            fun of(value: String) = PaymentProvider(JsonField.of(value))
        }

        enum class Known {
            QUICKBOOKS,
            BILL_COM,
            STRIPE_CHARGE,
            STRIPE_INVOICE,
            NETSUITE,
        }

        enum class Value {
            QUICKBOOKS,
            BILL_COM,
            STRIPE_CHARGE,
            STRIPE_INVOICE,
            NETSUITE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                QUICKBOOKS -> Value.QUICKBOOKS
                BILL_COM -> Value.BILL_COM
                STRIPE_CHARGE -> Value.STRIPE_CHARGE
                STRIPE_INVOICE -> Value.STRIPE_INVOICE
                NETSUITE -> Value.NETSUITE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                QUICKBOOKS -> Known.QUICKBOOKS
                BILL_COM -> Known.BILL_COM
                STRIPE_CHARGE -> Known.STRIPE_CHARGE
                STRIPE_INVOICE -> Known.STRIPE_INVOICE
                NETSUITE -> Known.NETSUITE
                else -> throw OrbInvalidDataException("Unknown PaymentProvider: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentProvider && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(builder = ReportingConfiguration.Builder::class)
    @NoAutoDetect
    class ReportingConfiguration
    private constructor(
        private val exempt: Boolean?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("exempt") fun exempt(): Boolean? = exempt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var exempt: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(reportingConfiguration: ReportingConfiguration) = apply {
                this.exempt = reportingConfiguration.exempt
                additionalProperties(reportingConfiguration.additionalProperties)
            }

            @JsonProperty("exempt") fun exempt(exempt: Boolean) = apply { this.exempt = exempt }

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

            fun build(): ReportingConfiguration =
                ReportingConfiguration(
                    checkNotNull(exempt) { "`exempt` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ReportingConfiguration && exempt == other.exempt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(exempt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ReportingConfiguration{exempt=$exempt, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ShippingAddress.Builder::class)
    @NoAutoDetect
    class ShippingAddress
    private constructor(
        private val line1: String?,
        private val line2: String?,
        private val city: String?,
        private val state: String?,
        private val postalCode: String?,
        private val country: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("line1") fun line1(): String? = line1

        @JsonProperty("line2") fun line2(): String? = line2

        @JsonProperty("city") fun city(): String? = city

        @JsonProperty("state") fun state(): String? = state

        @JsonProperty("postal_code") fun postalCode(): String? = postalCode

        @JsonProperty("country") fun country(): String? = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: String? = null
            private var line2: String? = null
            private var city: String? = null
            private var state: String? = null
            private var postalCode: String? = null
            private var country: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shippingAddress: ShippingAddress) = apply {
                this.line1 = shippingAddress.line1
                this.line2 = shippingAddress.line2
                this.city = shippingAddress.city
                this.state = shippingAddress.state
                this.postalCode = shippingAddress.postalCode
                this.country = shippingAddress.country
                additionalProperties(shippingAddress.additionalProperties)
            }

            @JsonProperty("line1") fun line1(line1: String) = apply { this.line1 = line1 }

            @JsonProperty("line2") fun line2(line2: String) = apply { this.line2 = line2 }

            @JsonProperty("city") fun city(city: String) = apply { this.city = city }

            @JsonProperty("state") fun state(state: String) = apply { this.state = state }

            @JsonProperty("postal_code")
            fun postalCode(postalCode: String) = apply { this.postalCode = postalCode }

            @JsonProperty("country") fun country(country: String) = apply { this.country = country }

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

            fun build(): ShippingAddress =
                ShippingAddress(
                    line1,
                    line2,
                    city,
                    state,
                    postalCode,
                    country,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ShippingAddress && line1 == other.line1 && line2 == other.line2 && city == other.city && state == other.state && postalCode == other.postalCode && country == other.country && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(line1, line2, city, state, postalCode, country, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ShippingAddress{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, country=$country, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(using = TaxConfiguration.Deserializer::class)
    @JsonSerialize(using = TaxConfiguration.Serializer::class)
    class TaxConfiguration
    private constructor(
        private val newAvalaraTaxConfiguration: NewAvalaraTaxConfiguration? = null,
        private val newTaxJarConfiguration: NewTaxJarConfiguration? = null,
        private val _json: JsonValue? = null,
    ) {

        private var validated: Boolean = false

        fun newAvalaraTaxConfiguration(): NewAvalaraTaxConfiguration? = newAvalaraTaxConfiguration

        fun newTaxJarConfiguration(): NewTaxJarConfiguration? = newTaxJarConfiguration

        fun isNewAvalaraTaxConfiguration(): Boolean = newAvalaraTaxConfiguration != null

        fun isNewTaxJarConfiguration(): Boolean = newTaxJarConfiguration != null

        fun asNewAvalaraTaxConfiguration(): NewAvalaraTaxConfiguration =
            newAvalaraTaxConfiguration.getOrThrow("newAvalaraTaxConfiguration")

        fun asNewTaxJarConfiguration(): NewTaxJarConfiguration =
            newTaxJarConfiguration.getOrThrow("newTaxJarConfiguration")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                newAvalaraTaxConfiguration != null ->
                    visitor.visitNewAvalaraTaxConfiguration(newAvalaraTaxConfiguration)
                newTaxJarConfiguration != null ->
                    visitor.visitNewTaxJarConfiguration(newTaxJarConfiguration)
                else -> visitor.unknown(_json)
            }
        }

        fun validate(): TaxConfiguration = apply {
            if (!validated) {
                if (newAvalaraTaxConfiguration == null && newTaxJarConfiguration == null) {
                    throw OrbInvalidDataException("Unknown TaxConfiguration: $_json")
                }
                newAvalaraTaxConfiguration?.validate()
                newTaxJarConfiguration?.validate()
                validated = true
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxConfiguration && newAvalaraTaxConfiguration == other.newAvalaraTaxConfiguration && newTaxJarConfiguration == other.newTaxJarConfiguration /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(newAvalaraTaxConfiguration, newTaxJarConfiguration) /* spotless:on */

        override fun toString(): String =
            when {
                newAvalaraTaxConfiguration != null ->
                    "TaxConfiguration{newAvalaraTaxConfiguration=$newAvalaraTaxConfiguration}"
                newTaxJarConfiguration != null ->
                    "TaxConfiguration{newTaxJarConfiguration=$newTaxJarConfiguration}"
                _json != null -> "TaxConfiguration{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid TaxConfiguration")
            }

        companion object {

            fun ofNewAvalaraTaxConfiguration(
                newAvalaraTaxConfiguration: NewAvalaraTaxConfiguration
            ) = TaxConfiguration(newAvalaraTaxConfiguration = newAvalaraTaxConfiguration)

            fun ofNewTaxJarConfiguration(newTaxJarConfiguration: NewTaxJarConfiguration) =
                TaxConfiguration(newTaxJarConfiguration = newTaxJarConfiguration)
        }

        interface Visitor<out T> {

            fun visitNewAvalaraTaxConfiguration(
                newAvalaraTaxConfiguration: NewAvalaraTaxConfiguration
            ): T

            fun visitNewTaxJarConfiguration(newTaxJarConfiguration: NewTaxJarConfiguration): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown TaxConfiguration: $json")
            }
        }

        class Deserializer : BaseDeserializer<TaxConfiguration>(TaxConfiguration::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): TaxConfiguration {
                val json = JsonValue.fromJsonNode(node)
                val taxProvider = json.asObject()?.get("tax_provider")?.asString()

                when (taxProvider) {
                    "avalara" -> {
                        tryDeserialize(node, jacksonTypeRef<NewAvalaraTaxConfiguration>()) {
                                it.validate()
                            }
                            ?.let {
                                return TaxConfiguration(
                                    newAvalaraTaxConfiguration = it,
                                    _json = json
                                )
                            }
                    }
                    "taxjar" -> {
                        tryDeserialize(node, jacksonTypeRef<NewTaxJarConfiguration>()) {
                                it.validate()
                            }
                            ?.let {
                                return TaxConfiguration(newTaxJarConfiguration = it, _json = json)
                            }
                    }
                }

                return TaxConfiguration(_json = json)
            }
        }

        class Serializer : BaseSerializer<TaxConfiguration>(TaxConfiguration::class) {

            override fun serialize(
                value: TaxConfiguration,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.newAvalaraTaxConfiguration != null ->
                        generator.writeObject(value.newAvalaraTaxConfiguration)
                    value.newTaxJarConfiguration != null ->
                        generator.writeObject(value.newTaxJarConfiguration)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid TaxConfiguration")
                }
            }
        }

        @JsonDeserialize(builder = NewAvalaraTaxConfiguration.Builder::class)
        @NoAutoDetect
        class NewAvalaraTaxConfiguration
        private constructor(
            private val taxExempt: JsonField<Boolean>,
            private val taxProvider: JsonField<TaxProvider>,
            private val taxExemptionCode: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun taxExempt(): Boolean = taxExempt.getRequired("tax_exempt")

            fun taxProvider(): TaxProvider = taxProvider.getRequired("tax_provider")

            fun taxExemptionCode(): String? = taxExemptionCode.getNullable("tax_exemption_code")

            @JsonProperty("tax_exempt") @ExcludeMissing fun _taxExempt() = taxExempt

            @JsonProperty("tax_provider") @ExcludeMissing fun _taxProvider() = taxProvider

            @JsonProperty("tax_exemption_code")
            @ExcludeMissing
            fun _taxExemptionCode() = taxExemptionCode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NewAvalaraTaxConfiguration = apply {
                if (!validated) {
                    taxExempt()
                    taxProvider()
                    taxExemptionCode()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var taxExempt: JsonField<Boolean> = JsonMissing.of()
                private var taxProvider: JsonField<TaxProvider> = JsonMissing.of()
                private var taxExemptionCode: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newAvalaraTaxConfiguration: NewAvalaraTaxConfiguration) = apply {
                    this.taxExempt = newAvalaraTaxConfiguration.taxExempt
                    this.taxProvider = newAvalaraTaxConfiguration.taxProvider
                    this.taxExemptionCode = newAvalaraTaxConfiguration.taxExemptionCode
                    additionalProperties(newAvalaraTaxConfiguration.additionalProperties)
                }

                fun taxExempt(taxExempt: Boolean) = taxExempt(JsonField.of(taxExempt))

                @JsonProperty("tax_exempt")
                @ExcludeMissing
                fun taxExempt(taxExempt: JsonField<Boolean>) = apply { this.taxExempt = taxExempt }

                fun taxProvider(taxProvider: TaxProvider) = taxProvider(JsonField.of(taxProvider))

                @JsonProperty("tax_provider")
                @ExcludeMissing
                fun taxProvider(taxProvider: JsonField<TaxProvider>) = apply {
                    this.taxProvider = taxProvider
                }

                fun taxExemptionCode(taxExemptionCode: String) =
                    taxExemptionCode(JsonField.of(taxExemptionCode))

                @JsonProperty("tax_exemption_code")
                @ExcludeMissing
                fun taxExemptionCode(taxExemptionCode: JsonField<String>) = apply {
                    this.taxExemptionCode = taxExemptionCode
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): NewAvalaraTaxConfiguration =
                    NewAvalaraTaxConfiguration(
                        taxExempt,
                        taxProvider,
                        taxExemptionCode,
                        additionalProperties.toImmutable(),
                    )
            }

            class TaxProvider
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AVALARA = of("avalara")

                    fun of(value: String) = TaxProvider(JsonField.of(value))
                }

                enum class Known {
                    AVALARA,
                }

                enum class Value {
                    AVALARA,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AVALARA -> Value.AVALARA
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AVALARA -> Known.AVALARA
                        else -> throw OrbInvalidDataException("Unknown TaxProvider: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TaxProvider && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewAvalaraTaxConfiguration && taxExempt == other.taxExempt && taxProvider == other.taxProvider && taxExemptionCode == other.taxExemptionCode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(taxExempt, taxProvider, taxExemptionCode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewAvalaraTaxConfiguration{taxExempt=$taxExempt, taxProvider=$taxProvider, taxExemptionCode=$taxExemptionCode, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = NewTaxJarConfiguration.Builder::class)
        @NoAutoDetect
        class NewTaxJarConfiguration
        private constructor(
            private val taxExempt: JsonField<Boolean>,
            private val taxProvider: JsonField<TaxProvider>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun taxExempt(): Boolean = taxExempt.getRequired("tax_exempt")

            fun taxProvider(): TaxProvider = taxProvider.getRequired("tax_provider")

            @JsonProperty("tax_exempt") @ExcludeMissing fun _taxExempt() = taxExempt

            @JsonProperty("tax_provider") @ExcludeMissing fun _taxProvider() = taxProvider

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): NewTaxJarConfiguration = apply {
                if (!validated) {
                    taxExempt()
                    taxProvider()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var taxExempt: JsonField<Boolean> = JsonMissing.of()
                private var taxProvider: JsonField<TaxProvider> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(newTaxJarConfiguration: NewTaxJarConfiguration) = apply {
                    this.taxExempt = newTaxJarConfiguration.taxExempt
                    this.taxProvider = newTaxJarConfiguration.taxProvider
                    additionalProperties(newTaxJarConfiguration.additionalProperties)
                }

                fun taxExempt(taxExempt: Boolean) = taxExempt(JsonField.of(taxExempt))

                @JsonProperty("tax_exempt")
                @ExcludeMissing
                fun taxExempt(taxExempt: JsonField<Boolean>) = apply { this.taxExempt = taxExempt }

                fun taxProvider(taxProvider: TaxProvider) = taxProvider(JsonField.of(taxProvider))

                @JsonProperty("tax_provider")
                @ExcludeMissing
                fun taxProvider(taxProvider: JsonField<TaxProvider>) = apply {
                    this.taxProvider = taxProvider
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): NewTaxJarConfiguration =
                    NewTaxJarConfiguration(
                        taxExempt,
                        taxProvider,
                        additionalProperties.toImmutable(),
                    )
            }

            class TaxProvider
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val TAXJAR = of("taxjar")

                    fun of(value: String) = TaxProvider(JsonField.of(value))
                }

                enum class Known {
                    TAXJAR,
                }

                enum class Value {
                    TAXJAR,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        TAXJAR -> Value.TAXJAR
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        TAXJAR -> Known.TAXJAR
                        else -> throw OrbInvalidDataException("Unknown TaxProvider: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TaxProvider && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NewTaxJarConfiguration && taxExempt == other.taxExempt && taxProvider == other.taxProvider && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(taxExempt, taxProvider, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NewTaxJarConfiguration{taxExempt=$taxExempt, taxProvider=$taxProvider, additionalProperties=$additionalProperties}"
        }
    }

    /**
     * Tax IDs are commonly required to be displayed on customer invoices, which are added to the
     * headers of invoices.
     *
     * ### Supported Tax ID Countries and Types
     * |Country             |Type        |Description                                                                                            |
     * |--------------------|------------|-------------------------------------------------------------------------------------------------------|
     * |Andorra             |`ad_nrt`    |Andorran NRT Number                                                                                    |
     * |Argentina           |`ar_cuit`   |Argentinian Tax ID Number                                                                              |
     * |Australia           |`au_abn`    |Australian Business Number (AU ABN)                                                                    |
     * |Australia           |`au_arn`    |Australian Taxation Office Reference Number                                                            |
     * |Austria             |`eu_vat`    |European VAT Number                                                                                    |
     * |Bahrain             |`bh_vat`    |Bahraini VAT Number                                                                                    |
     * |Belgium             |`eu_vat`    |European VAT Number                                                                                    |
     * |Bolivia             |`bo_tin`    |Bolivian Tax ID                                                                                        |
     * |Brazil              |`br_cnpj`   |Brazilian CNPJ Number                                                                                  |
     * |Brazil              |`br_cpf`    |Brazilian CPF Number                                                                                   |
     * |Bulgaria            |`bg_uic`    |Bulgaria Unified Identification Code                                                                   |
     * |Bulgaria            |`eu_vat`    |European VAT Number                                                                                    |
     * |Canada              |`ca_bn`     |Canadian BN                                                                                            |
     * |Canada              |`ca_gst_hst`|Canadian GST/HST Number                                                                                |
     * |Canada              |`ca_pst_bc` |Canadian PST Number (British Columbia)                                                                 |
     * |Canada              |`ca_pst_mb` |Canadian PST Number (Manitoba)                                                                         |
     * |Canada              |`ca_pst_sk` |Canadian PST Number (Saskatchewan)                                                                     |
     * |Canada              |`ca_qst`    |Canadian QST Number (Québec)                                                                           |
     * |Chile               |`cl_tin`    |Chilean TIN                                                                                            |
     * |China               |`cn_tin`    |Chinese Tax ID                                                                                         |
     * |Colombia            |`co_nit`    |Colombian NIT Number                                                                                   |
     * |Costa Rica          |`cr_tin`    |Costa Rican Tax ID                                                                                     |
     * |Croatia             |`eu_vat`    |European VAT Number                                                                                    |
     * |Cyprus              |`eu_vat`    |European VAT Number                                                                                    |
     * |Czech Republic      |`eu_vat`    |European VAT Number                                                                                    |
     * |Denmark             |`eu_vat`    |European VAT Number                                                                                    |
     * |Dominican Republic  |`do_rcn`    |Dominican RCN Number                                                                                   |
     * |Ecuador             |`ec_ruc`    |Ecuadorian RUC Number                                                                                  |
     * |Egypt               |`eg_tin`    |Egyptian Tax Identification Number                                                                     |
     * |El Salvador         |`sv_nit`    |El Salvadorian NIT Number                                                                              |
     * |Estonia             |`eu_vat`    |European VAT Number                                                                                    |
     * |EU                  |`eu_oss_vat`|European One Stop Shop VAT Number for non-Union scheme                                                 |
     * |Finland             |`eu_vat`    |European VAT Number                                                                                    |
     * |France              |`eu_vat`    |European VAT Number                                                                                    |
     * |Georgia             |`ge_vat`    |Georgian VAT                                                                                           |
     * |Germany             |`eu_vat`    |European VAT Number                                                                                    |
     * |Greece              |`eu_vat`    |European VAT Number                                                                                    |
     * |Hong Kong           |`hk_br`     |Hong Kong BR Number                                                                                    |
     * |Hungary             |`eu_vat`    |European VAT Number                                                                                    |
     * |Hungary             |`hu_tin`    |Hungary Tax Number (adószám)                                                                           |
     * |Iceland             |`is_vat`    |Icelandic VAT                                                                                          |
     * |India               |`in_gst`    |Indian GST Number                                                                                      |
     * |Indonesia           |`id_npwp`   |Indonesian NPWP Number                                                                                 |
     * |Ireland             |`eu_vat`    |European VAT Number                                                                                    |
     * |Israel              |`il_vat`    |Israel VAT                                                                                             |
     * |Italy               |`eu_vat`    |European VAT Number                                                                                    |
     * |Japan               |`jp_cn`     |Japanese Corporate Number (_Hōjin Bangō_)                                                              |
     * |Japan               |`jp_rn`     |Japanese Registered Foreign Businesses' Registration Number (_Tōroku Kokugai Jigyōsha no Tōroku Bangō_)|
     * |Japan               |`jp_trn`    |Japanese Tax Registration Number (_Tōroku Bangō_)                                                      |
     * |Kazakhstan          |`kz_bin`    |Kazakhstani Business Identification Number                                                             |
     * |Kenya               |`ke_pin`    |Kenya Revenue Authority Personal Identification Number                                                 |
     * |Latvia              |`eu_vat`    |European VAT Number                                                                                    |
     * |Liechtenstein       |`li_uid`    |Liechtensteinian UID Number                                                                            |
     * |Lithuania           |`eu_vat`    |European VAT Number                                                                                    |
     * |Luxembourg          |`eu_vat`    |European VAT Number                                                                                    |
     * |Malaysia            |`my_frp`    |Malaysian FRP Number                                                                                   |
     * |Malaysia            |`my_itn`    |Malaysian ITN                                                                                          |
     * |Malaysia            |`my_sst`    |Malaysian SST Number                                                                                   |
     * |Malta               |`eu_vat `   |European VAT Number                                                                                    |
     * |Mexico              |`mx_rfc`    |Mexican RFC Number                                                                                     |
     * |Netherlands         |`eu_vat`    |European VAT Number                                                                                    |
     * |New Zealand         |`nz_gst`    |New Zealand GST Number                                                                                 |
     * |Nigeria             |`ng_tin`    |Nigerian Tax Identification Number                                                                     |
     * |Norway              |`no_vat`    |Norwegian VAT Number                                                                                   |
     * |Norway              |`no_voec`   |Norwegian VAT on e-commerce Number                                                                     |
     * |Oman                |`om_vat`    |Omani VAT Number                                                                                       |
     * |Peru                |`pe_ruc`    |Peruvian RUC Number                                                                                    |
     * |Philippines         |`ph_tin `   |Philippines Tax Identification Number                                                                  |
     * |Poland              |`eu_vat`    |European VAT Number                                                                                    |
     * |Portugal            |`eu_vat`    |European VAT Number                                                                                    |
     * |Romania             |`eu_vat`    |European VAT Number                                                                                    |
     * |Romania             |`ro_tin`    |Romanian Tax ID Number                                                                                 |
     * |Russia              |`ru_inn`    |Russian INN                                                                                            |
     * |Russia              |`ru_kpp`    |Russian KPP                                                                                            |
     * |Saudi Arabia        |`sa_vat`    |Saudi Arabia VAT                                                                                       |
     * |Serbia              |`rs_pib`    |Serbian PIB Number                                                                                     |
     * |Singapore           |`sg_gst`    |Singaporean GST                                                                                        |
     * |Singapore           |`sg_uen`    |Singaporean UEN                                                                                        |
     * |Slovakia            |`eu_vat`    |European VAT Number                                                                                    |
     * |Slovenia            |`eu_vat`    |European VAT Number                                                                                    |
     * |Slovenia            |`si_tin`    |Slovenia Tax Number (davčna številka)                                                                  |
     * |South Africa        |`za_vat`    |South African VAT Number                                                                               |
     * |South Korea         |`kr_brn`    |Korean BRN                                                                                             |
     * |Spain               |`es_cif`    |Spanish NIF Number (previously Spanish CIF Number)                                                     |
     * |Spain               |`eu_vat`    |European VAT Number                                                                                    |
     * |Sweden              |`eu_vat`    |European VAT Number                                                                                    |
     * |Switzerland         |`ch_vat`    |Switzerland VAT Number                                                                                 |
     * |Taiwan              |`tw_vat`    |Taiwanese VAT                                                                                          |
     * |Thailand            |`th_vat`    |Thai VAT                                                                                               |
     * |Turkey              |`tr_tin`    |Turkish Tax Identification Number                                                                      |
     * |Ukraine             |`ua_vat`    |Ukrainian VAT                                                                                          |
     * |United Arab Emirates|`ae_trn`    |United Arab Emirates TRN                                                                               |
     * |United Kingdom      |`eu_vat`    |Northern Ireland VAT Number                                                                            |
     * |United Kingdom      |`gb_vat`    |United Kingdom VAT Number                                                                              |
     * |United States       |`us_ein`    |United States EIN                                                                                      |
     * |Uruguay             |`uy_ruc`    |Uruguayan RUC Number                                                                                   |
     * |Venezuela           |`ve_rif`    |Venezuelan RIF Number                                                                                  |
     * |Vietnam             |`vn_tin`    |Vietnamese Tax ID Number                                                                               |
     */
    @JsonDeserialize(builder = TaxId.Builder::class)
    @NoAutoDetect
    class TaxId
    private constructor(
        private val country: Country?,
        private val type: Type?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("country") fun country(): Country? = country

        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("value") fun value(): String? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var country: Country? = null
            private var type: Type? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(taxId: TaxId) = apply {
                this.country = taxId.country
                this.type = taxId.type
                this.value = taxId.value
                additionalProperties(taxId.additionalProperties)
            }

            @JsonProperty("country")
            fun country(country: Country) = apply { this.country = country }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("value") fun value(value: String) = apply { this.value = value }

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

            fun build(): TaxId =
                TaxId(
                    checkNotNull(country) { "`country` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Country
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AD = of("AD")

                val AE = of("AE")

                val AR = of("AR")

                val AT = of("AT")

                val AU = of("AU")

                val BE = of("BE")

                val BG = of("BG")

                val BH = of("BH")

                val BO = of("BO")

                val BR = of("BR")

                val CA = of("CA")

                val CH = of("CH")

                val CL = of("CL")

                val CN = of("CN")

                val CO = of("CO")

                val CR = of("CR")

                val CY = of("CY")

                val CZ = of("CZ")

                val DE = of("DE")

                val DK = of("DK")

                val EE = of("EE")

                val DO = of("DO")

                val EC = of("EC")

                val EG = of("EG")

                val ES = of("ES")

                val EU = of("EU")

                val FI = of("FI")

                val FR = of("FR")

                val GB = of("GB")

                val GE = of("GE")

                val GR = of("GR")

                val HK = of("HK")

                val HR = of("HR")

                val HU = of("HU")

                val ID = of("ID")

                val IE = of("IE")

                val IL = of("IL")

                val IN = of("IN")

                val IS = of("IS")

                val IT = of("IT")

                val JP = of("JP")

                val KE = of("KE")

                val KR = of("KR")

                val KZ = of("KZ")

                val LI = of("LI")

                val LT = of("LT")

                val LU = of("LU")

                val LV = of("LV")

                val MT = of("MT")

                val MX = of("MX")

                val MY = of("MY")

                val NG = of("NG")

                val NL = of("NL")

                val NO = of("NO")

                val NZ = of("NZ")

                val OM = of("OM")

                val PE = of("PE")

                val PH = of("PH")

                val PL = of("PL")

                val PT = of("PT")

                val RO = of("RO")

                val RS = of("RS")

                val RU = of("RU")

                val SA = of("SA")

                val SE = of("SE")

                val SG = of("SG")

                val SI = of("SI")

                val SK = of("SK")

                val SV = of("SV")

                val TH = of("TH")

                val TR = of("TR")

                val TW = of("TW")

                val UA = of("UA")

                val US = of("US")

                val UY = of("UY")

                val VE = of("VE")

                val VN = of("VN")

                val ZA = of("ZA")

                fun of(value: String) = Country(JsonField.of(value))
            }

            enum class Known {
                AD,
                AE,
                AR,
                AT,
                AU,
                BE,
                BG,
                BH,
                BO,
                BR,
                CA,
                CH,
                CL,
                CN,
                CO,
                CR,
                CY,
                CZ,
                DE,
                DK,
                EE,
                DO,
                EC,
                EG,
                ES,
                EU,
                FI,
                FR,
                GB,
                GE,
                GR,
                HK,
                HR,
                HU,
                ID,
                IE,
                IL,
                IN,
                IS,
                IT,
                JP,
                KE,
                KR,
                KZ,
                LI,
                LT,
                LU,
                LV,
                MT,
                MX,
                MY,
                NG,
                NL,
                NO,
                NZ,
                OM,
                PE,
                PH,
                PL,
                PT,
                RO,
                RS,
                RU,
                SA,
                SE,
                SG,
                SI,
                SK,
                SV,
                TH,
                TR,
                TW,
                UA,
                US,
                UY,
                VE,
                VN,
                ZA,
            }

            enum class Value {
                AD,
                AE,
                AR,
                AT,
                AU,
                BE,
                BG,
                BH,
                BO,
                BR,
                CA,
                CH,
                CL,
                CN,
                CO,
                CR,
                CY,
                CZ,
                DE,
                DK,
                EE,
                DO,
                EC,
                EG,
                ES,
                EU,
                FI,
                FR,
                GB,
                GE,
                GR,
                HK,
                HR,
                HU,
                ID,
                IE,
                IL,
                IN,
                IS,
                IT,
                JP,
                KE,
                KR,
                KZ,
                LI,
                LT,
                LU,
                LV,
                MT,
                MX,
                MY,
                NG,
                NL,
                NO,
                NZ,
                OM,
                PE,
                PH,
                PL,
                PT,
                RO,
                RS,
                RU,
                SA,
                SE,
                SG,
                SI,
                SK,
                SV,
                TH,
                TR,
                TW,
                UA,
                US,
                UY,
                VE,
                VN,
                ZA,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AD -> Value.AD
                    AE -> Value.AE
                    AR -> Value.AR
                    AT -> Value.AT
                    AU -> Value.AU
                    BE -> Value.BE
                    BG -> Value.BG
                    BH -> Value.BH
                    BO -> Value.BO
                    BR -> Value.BR
                    CA -> Value.CA
                    CH -> Value.CH
                    CL -> Value.CL
                    CN -> Value.CN
                    CO -> Value.CO
                    CR -> Value.CR
                    CY -> Value.CY
                    CZ -> Value.CZ
                    DE -> Value.DE
                    DK -> Value.DK
                    EE -> Value.EE
                    DO -> Value.DO
                    EC -> Value.EC
                    EG -> Value.EG
                    ES -> Value.ES
                    EU -> Value.EU
                    FI -> Value.FI
                    FR -> Value.FR
                    GB -> Value.GB
                    GE -> Value.GE
                    GR -> Value.GR
                    HK -> Value.HK
                    HR -> Value.HR
                    HU -> Value.HU
                    ID -> Value.ID
                    IE -> Value.IE
                    IL -> Value.IL
                    IN -> Value.IN
                    IS -> Value.IS
                    IT -> Value.IT
                    JP -> Value.JP
                    KE -> Value.KE
                    KR -> Value.KR
                    KZ -> Value.KZ
                    LI -> Value.LI
                    LT -> Value.LT
                    LU -> Value.LU
                    LV -> Value.LV
                    MT -> Value.MT
                    MX -> Value.MX
                    MY -> Value.MY
                    NG -> Value.NG
                    NL -> Value.NL
                    NO -> Value.NO
                    NZ -> Value.NZ
                    OM -> Value.OM
                    PE -> Value.PE
                    PH -> Value.PH
                    PL -> Value.PL
                    PT -> Value.PT
                    RO -> Value.RO
                    RS -> Value.RS
                    RU -> Value.RU
                    SA -> Value.SA
                    SE -> Value.SE
                    SG -> Value.SG
                    SI -> Value.SI
                    SK -> Value.SK
                    SV -> Value.SV
                    TH -> Value.TH
                    TR -> Value.TR
                    TW -> Value.TW
                    UA -> Value.UA
                    US -> Value.US
                    UY -> Value.UY
                    VE -> Value.VE
                    VN -> Value.VN
                    ZA -> Value.ZA
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AD -> Known.AD
                    AE -> Known.AE
                    AR -> Known.AR
                    AT -> Known.AT
                    AU -> Known.AU
                    BE -> Known.BE
                    BG -> Known.BG
                    BH -> Known.BH
                    BO -> Known.BO
                    BR -> Known.BR
                    CA -> Known.CA
                    CH -> Known.CH
                    CL -> Known.CL
                    CN -> Known.CN
                    CO -> Known.CO
                    CR -> Known.CR
                    CY -> Known.CY
                    CZ -> Known.CZ
                    DE -> Known.DE
                    DK -> Known.DK
                    EE -> Known.EE
                    DO -> Known.DO
                    EC -> Known.EC
                    EG -> Known.EG
                    ES -> Known.ES
                    EU -> Known.EU
                    FI -> Known.FI
                    FR -> Known.FR
                    GB -> Known.GB
                    GE -> Known.GE
                    GR -> Known.GR
                    HK -> Known.HK
                    HR -> Known.HR
                    HU -> Known.HU
                    ID -> Known.ID
                    IE -> Known.IE
                    IL -> Known.IL
                    IN -> Known.IN
                    IS -> Known.IS
                    IT -> Known.IT
                    JP -> Known.JP
                    KE -> Known.KE
                    KR -> Known.KR
                    KZ -> Known.KZ
                    LI -> Known.LI
                    LT -> Known.LT
                    LU -> Known.LU
                    LV -> Known.LV
                    MT -> Known.MT
                    MX -> Known.MX
                    MY -> Known.MY
                    NG -> Known.NG
                    NL -> Known.NL
                    NO -> Known.NO
                    NZ -> Known.NZ
                    OM -> Known.OM
                    PE -> Known.PE
                    PH -> Known.PH
                    PL -> Known.PL
                    PT -> Known.PT
                    RO -> Known.RO
                    RS -> Known.RS
                    RU -> Known.RU
                    SA -> Known.SA
                    SE -> Known.SE
                    SG -> Known.SG
                    SI -> Known.SI
                    SK -> Known.SK
                    SV -> Known.SV
                    TH -> Known.TH
                    TR -> Known.TR
                    TW -> Known.TW
                    UA -> Known.UA
                    US -> Known.US
                    UY -> Known.UY
                    VE -> Known.VE
                    VN -> Known.VN
                    ZA -> Known.ZA
                    else -> throw OrbInvalidDataException("Unknown Country: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Country && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val AD_NRT = of("ad_nrt")

                val AE_TRN = of("ae_trn")

                val AR_CUIT = of("ar_cuit")

                val EU_VAT = of("eu_vat")

                val AU_ABN = of("au_abn")

                val AU_ARN = of("au_arn")

                val BG_UIC = of("bg_uic")

                val BH_VAT = of("bh_vat")

                val BO_TIN = of("bo_tin")

                val BR_CNPJ = of("br_cnpj")

                val BR_CPF = of("br_cpf")

                val CA_BN = of("ca_bn")

                val CA_GST_HST = of("ca_gst_hst")

                val CA_PST_BC = of("ca_pst_bc")

                val CA_PST_MB = of("ca_pst_mb")

                val CA_PST_SK = of("ca_pst_sk")

                val CA_QST = of("ca_qst")

                val CH_VAT = of("ch_vat")

                val CL_TIN = of("cl_tin")

                val CN_TIN = of("cn_tin")

                val CO_NIT = of("co_nit")

                val CR_TIN = of("cr_tin")

                val DO_RCN = of("do_rcn")

                val EC_RUC = of("ec_ruc")

                val EG_TIN = of("eg_tin")

                val ES_CIF = of("es_cif")

                val EU_OSS_VAT = of("eu_oss_vat")

                val GB_VAT = of("gb_vat")

                val GE_VAT = of("ge_vat")

                val HK_BR = of("hk_br")

                val HU_TIN = of("hu_tin")

                val ID_NPWP = of("id_npwp")

                val IL_VAT = of("il_vat")

                val IN_GST = of("in_gst")

                val IS_VAT = of("is_vat")

                val JP_CN = of("jp_cn")

                val JP_RN = of("jp_rn")

                val JP_TRN = of("jp_trn")

                val KE_PIN = of("ke_pin")

                val KR_BRN = of("kr_brn")

                val KZ_BIN = of("kz_bin")

                val LI_UID = of("li_uid")

                val MX_RFC = of("mx_rfc")

                val MY_FRP = of("my_frp")

                val MY_ITN = of("my_itn")

                val MY_SST = of("my_sst")

                val NG_TIN = of("ng_tin")

                val NO_VAT = of("no_vat")

                val NO_VOEC = of("no_voec")

                val NZ_GST = of("nz_gst")

                val OM_VAT = of("om_vat")

                val PE_RUC = of("pe_ruc")

                val PH_TIN = of("ph_tin")

                val RO_TIN = of("ro_tin")

                val RS_PIB = of("rs_pib")

                val RU_INN = of("ru_inn")

                val RU_KPP = of("ru_kpp")

                val SA_VAT = of("sa_vat")

                val SG_GST = of("sg_gst")

                val SG_UEN = of("sg_uen")

                val SI_TIN = of("si_tin")

                val SV_NIT = of("sv_nit")

                val TH_VAT = of("th_vat")

                val TR_TIN = of("tr_tin")

                val TW_VAT = of("tw_vat")

                val UA_VAT = of("ua_vat")

                val US_EIN = of("us_ein")

                val UY_RUC = of("uy_ruc")

                val VE_RIF = of("ve_rif")

                val VN_TIN = of("vn_tin")

                val ZA_VAT = of("za_vat")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                AD_NRT,
                AE_TRN,
                AR_CUIT,
                EU_VAT,
                AU_ABN,
                AU_ARN,
                BG_UIC,
                BH_VAT,
                BO_TIN,
                BR_CNPJ,
                BR_CPF,
                CA_BN,
                CA_GST_HST,
                CA_PST_BC,
                CA_PST_MB,
                CA_PST_SK,
                CA_QST,
                CH_VAT,
                CL_TIN,
                CN_TIN,
                CO_NIT,
                CR_TIN,
                DO_RCN,
                EC_RUC,
                EG_TIN,
                ES_CIF,
                EU_OSS_VAT,
                GB_VAT,
                GE_VAT,
                HK_BR,
                HU_TIN,
                ID_NPWP,
                IL_VAT,
                IN_GST,
                IS_VAT,
                JP_CN,
                JP_RN,
                JP_TRN,
                KE_PIN,
                KR_BRN,
                KZ_BIN,
                LI_UID,
                MX_RFC,
                MY_FRP,
                MY_ITN,
                MY_SST,
                NG_TIN,
                NO_VAT,
                NO_VOEC,
                NZ_GST,
                OM_VAT,
                PE_RUC,
                PH_TIN,
                RO_TIN,
                RS_PIB,
                RU_INN,
                RU_KPP,
                SA_VAT,
                SG_GST,
                SG_UEN,
                SI_TIN,
                SV_NIT,
                TH_VAT,
                TR_TIN,
                TW_VAT,
                UA_VAT,
                US_EIN,
                UY_RUC,
                VE_RIF,
                VN_TIN,
                ZA_VAT,
            }

            enum class Value {
                AD_NRT,
                AE_TRN,
                AR_CUIT,
                EU_VAT,
                AU_ABN,
                AU_ARN,
                BG_UIC,
                BH_VAT,
                BO_TIN,
                BR_CNPJ,
                BR_CPF,
                CA_BN,
                CA_GST_HST,
                CA_PST_BC,
                CA_PST_MB,
                CA_PST_SK,
                CA_QST,
                CH_VAT,
                CL_TIN,
                CN_TIN,
                CO_NIT,
                CR_TIN,
                DO_RCN,
                EC_RUC,
                EG_TIN,
                ES_CIF,
                EU_OSS_VAT,
                GB_VAT,
                GE_VAT,
                HK_BR,
                HU_TIN,
                ID_NPWP,
                IL_VAT,
                IN_GST,
                IS_VAT,
                JP_CN,
                JP_RN,
                JP_TRN,
                KE_PIN,
                KR_BRN,
                KZ_BIN,
                LI_UID,
                MX_RFC,
                MY_FRP,
                MY_ITN,
                MY_SST,
                NG_TIN,
                NO_VAT,
                NO_VOEC,
                NZ_GST,
                OM_VAT,
                PE_RUC,
                PH_TIN,
                RO_TIN,
                RS_PIB,
                RU_INN,
                RU_KPP,
                SA_VAT,
                SG_GST,
                SG_UEN,
                SI_TIN,
                SV_NIT,
                TH_VAT,
                TR_TIN,
                TW_VAT,
                UA_VAT,
                US_EIN,
                UY_RUC,
                VE_RIF,
                VN_TIN,
                ZA_VAT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AD_NRT -> Value.AD_NRT
                    AE_TRN -> Value.AE_TRN
                    AR_CUIT -> Value.AR_CUIT
                    EU_VAT -> Value.EU_VAT
                    AU_ABN -> Value.AU_ABN
                    AU_ARN -> Value.AU_ARN
                    BG_UIC -> Value.BG_UIC
                    BH_VAT -> Value.BH_VAT
                    BO_TIN -> Value.BO_TIN
                    BR_CNPJ -> Value.BR_CNPJ
                    BR_CPF -> Value.BR_CPF
                    CA_BN -> Value.CA_BN
                    CA_GST_HST -> Value.CA_GST_HST
                    CA_PST_BC -> Value.CA_PST_BC
                    CA_PST_MB -> Value.CA_PST_MB
                    CA_PST_SK -> Value.CA_PST_SK
                    CA_QST -> Value.CA_QST
                    CH_VAT -> Value.CH_VAT
                    CL_TIN -> Value.CL_TIN
                    CN_TIN -> Value.CN_TIN
                    CO_NIT -> Value.CO_NIT
                    CR_TIN -> Value.CR_TIN
                    DO_RCN -> Value.DO_RCN
                    EC_RUC -> Value.EC_RUC
                    EG_TIN -> Value.EG_TIN
                    ES_CIF -> Value.ES_CIF
                    EU_OSS_VAT -> Value.EU_OSS_VAT
                    GB_VAT -> Value.GB_VAT
                    GE_VAT -> Value.GE_VAT
                    HK_BR -> Value.HK_BR
                    HU_TIN -> Value.HU_TIN
                    ID_NPWP -> Value.ID_NPWP
                    IL_VAT -> Value.IL_VAT
                    IN_GST -> Value.IN_GST
                    IS_VAT -> Value.IS_VAT
                    JP_CN -> Value.JP_CN
                    JP_RN -> Value.JP_RN
                    JP_TRN -> Value.JP_TRN
                    KE_PIN -> Value.KE_PIN
                    KR_BRN -> Value.KR_BRN
                    KZ_BIN -> Value.KZ_BIN
                    LI_UID -> Value.LI_UID
                    MX_RFC -> Value.MX_RFC
                    MY_FRP -> Value.MY_FRP
                    MY_ITN -> Value.MY_ITN
                    MY_SST -> Value.MY_SST
                    NG_TIN -> Value.NG_TIN
                    NO_VAT -> Value.NO_VAT
                    NO_VOEC -> Value.NO_VOEC
                    NZ_GST -> Value.NZ_GST
                    OM_VAT -> Value.OM_VAT
                    PE_RUC -> Value.PE_RUC
                    PH_TIN -> Value.PH_TIN
                    RO_TIN -> Value.RO_TIN
                    RS_PIB -> Value.RS_PIB
                    RU_INN -> Value.RU_INN
                    RU_KPP -> Value.RU_KPP
                    SA_VAT -> Value.SA_VAT
                    SG_GST -> Value.SG_GST
                    SG_UEN -> Value.SG_UEN
                    SI_TIN -> Value.SI_TIN
                    SV_NIT -> Value.SV_NIT
                    TH_VAT -> Value.TH_VAT
                    TR_TIN -> Value.TR_TIN
                    TW_VAT -> Value.TW_VAT
                    UA_VAT -> Value.UA_VAT
                    US_EIN -> Value.US_EIN
                    UY_RUC -> Value.UY_RUC
                    VE_RIF -> Value.VE_RIF
                    VN_TIN -> Value.VN_TIN
                    ZA_VAT -> Value.ZA_VAT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AD_NRT -> Known.AD_NRT
                    AE_TRN -> Known.AE_TRN
                    AR_CUIT -> Known.AR_CUIT
                    EU_VAT -> Known.EU_VAT
                    AU_ABN -> Known.AU_ABN
                    AU_ARN -> Known.AU_ARN
                    BG_UIC -> Known.BG_UIC
                    BH_VAT -> Known.BH_VAT
                    BO_TIN -> Known.BO_TIN
                    BR_CNPJ -> Known.BR_CNPJ
                    BR_CPF -> Known.BR_CPF
                    CA_BN -> Known.CA_BN
                    CA_GST_HST -> Known.CA_GST_HST
                    CA_PST_BC -> Known.CA_PST_BC
                    CA_PST_MB -> Known.CA_PST_MB
                    CA_PST_SK -> Known.CA_PST_SK
                    CA_QST -> Known.CA_QST
                    CH_VAT -> Known.CH_VAT
                    CL_TIN -> Known.CL_TIN
                    CN_TIN -> Known.CN_TIN
                    CO_NIT -> Known.CO_NIT
                    CR_TIN -> Known.CR_TIN
                    DO_RCN -> Known.DO_RCN
                    EC_RUC -> Known.EC_RUC
                    EG_TIN -> Known.EG_TIN
                    ES_CIF -> Known.ES_CIF
                    EU_OSS_VAT -> Known.EU_OSS_VAT
                    GB_VAT -> Known.GB_VAT
                    GE_VAT -> Known.GE_VAT
                    HK_BR -> Known.HK_BR
                    HU_TIN -> Known.HU_TIN
                    ID_NPWP -> Known.ID_NPWP
                    IL_VAT -> Known.IL_VAT
                    IN_GST -> Known.IN_GST
                    IS_VAT -> Known.IS_VAT
                    JP_CN -> Known.JP_CN
                    JP_RN -> Known.JP_RN
                    JP_TRN -> Known.JP_TRN
                    KE_PIN -> Known.KE_PIN
                    KR_BRN -> Known.KR_BRN
                    KZ_BIN -> Known.KZ_BIN
                    LI_UID -> Known.LI_UID
                    MX_RFC -> Known.MX_RFC
                    MY_FRP -> Known.MY_FRP
                    MY_ITN -> Known.MY_ITN
                    MY_SST -> Known.MY_SST
                    NG_TIN -> Known.NG_TIN
                    NO_VAT -> Known.NO_VAT
                    NO_VOEC -> Known.NO_VOEC
                    NZ_GST -> Known.NZ_GST
                    OM_VAT -> Known.OM_VAT
                    PE_RUC -> Known.PE_RUC
                    PH_TIN -> Known.PH_TIN
                    RO_TIN -> Known.RO_TIN
                    RS_PIB -> Known.RS_PIB
                    RU_INN -> Known.RU_INN
                    RU_KPP -> Known.RU_KPP
                    SA_VAT -> Known.SA_VAT
                    SG_GST -> Known.SG_GST
                    SG_UEN -> Known.SG_UEN
                    SI_TIN -> Known.SI_TIN
                    SV_NIT -> Known.SV_NIT
                    TH_VAT -> Known.TH_VAT
                    TR_TIN -> Known.TR_TIN
                    TW_VAT -> Known.TW_VAT
                    UA_VAT -> Known.UA_VAT
                    US_EIN -> Known.US_EIN
                    UY_RUC -> Known.UY_RUC
                    VE_RIF -> Known.VE_RIF
                    VN_TIN -> Known.VN_TIN
                    ZA_VAT -> Known.ZA_VAT
                    else -> throw OrbInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TaxId && country == other.country && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, type, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TaxId{country=$country, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreateParams && email == other.email && name == other.name && accountingSyncConfiguration == other.accountingSyncConfiguration && additionalEmails == other.additionalEmails && autoCollection == other.autoCollection && billingAddress == other.billingAddress && currency == other.currency && emailDelivery == other.emailDelivery && externalCustomerId == other.externalCustomerId && metadata == other.metadata && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && reportingConfiguration == other.reportingConfiguration && shippingAddress == other.shippingAddress && taxConfiguration == other.taxConfiguration && taxId == other.taxId && timezone == other.timezone && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(email, name, accountingSyncConfiguration, additionalEmails, autoCollection, billingAddress, currency, emailDelivery, externalCustomerId, metadata, paymentProvider, paymentProviderId, reportingConfiguration, shippingAddress, taxConfiguration, taxId, timezone, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "CustomerCreateParams{email=$email, name=$name, accountingSyncConfiguration=$accountingSyncConfiguration, additionalEmails=$additionalEmails, autoCollection=$autoCollection, billingAddress=$billingAddress, currency=$currency, emailDelivery=$emailDelivery, externalCustomerId=$externalCustomerId, metadata=$metadata, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, reportingConfiguration=$reportingConfiguration, shippingAddress=$shippingAddress, taxConfiguration=$taxConfiguration, taxId=$taxId, timezone=$timezone, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
