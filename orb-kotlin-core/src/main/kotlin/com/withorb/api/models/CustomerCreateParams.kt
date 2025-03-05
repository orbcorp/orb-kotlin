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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

/**
 * This operation is used to create an Orb customer, who is party to the core billing relationship.
 * See [Customer](/core-concepts##customer) for an overview of the customer resource.
 *
 * This endpoint is critical in the following Orb functionality:
 * - Automated charges can be configured by setting `payment_provider` and `payment_provider_id` to
 *   automatically issue invoices
 * - [Customer ID Aliases](/events-and-metrics/customer-aliases) can be configured by setting
 *   `external_customer_id`
 * - [Timezone localization](/essentials/timezones) can be configured on a per-customer basis by
 *   setting the `timezone` parameter
 */
class CustomerCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * A valid customer email, to be used for notifications. When Orb triggers payment through a
     * payment gateway, this email will be used for any automatically issued receipts.
     */
    fun email(): String = body.email()

    /** The full name of the customer */
    fun name(): String = body.name()

    fun accountingSyncConfiguration(): NewAccountingSyncConfigurationModel? =
        body.accountingSyncConfiguration()

    /**
     * Additional email addresses for this customer. If populated, these email addresses will be
     * CC'd for customer communications.
     */
    fun additionalEmails(): List<String>? = body.additionalEmails()

    /**
     * Used to determine if invoices for this customer will automatically attempt to charge a saved
     * payment method, if available. This parameter defaults to `True` when a payment provider is
     * provided on customer creation.
     */
    fun autoCollection(): Boolean? = body.autoCollection()

    fun billingAddress(): AddressInputModel? = body.billingAddress()

    /**
     * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
     * creation time, will be set at subscription creation time.
     */
    fun currency(): String? = body.currency()

    fun emailDelivery(): Boolean? = body.emailDelivery()

    /**
     * An optional user-defined ID for this customer resource, used throughout the system as an
     * alias for this Customer. Use this field to identify a customer by an existing identifier in
     * your system.
     */
    fun externalCustomerId(): String? = body.externalCustomerId()

    /** The hierarchical relationships for this customer. */
    fun hierarchy(): CustomerHierarchyConfigModel? = body.hierarchy()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode, the connection must first be configured in the Orb webapp.
     */
    fun paymentProvider(): PaymentProvider? = body.paymentProvider()

    /**
     * The ID of this customer in an external payments solution, such as Stripe. This is used for
     * creating charges or invoices in the external system via Orb.
     */
    fun paymentProviderId(): String? = body.paymentProviderId()

    fun reportingConfiguration(): NewReportingConfigurationModel? = body.reportingConfiguration()

    fun shippingAddress(): AddressInputModel? = body.shippingAddress()

    fun taxConfiguration(): NewTaxConfigurationModel? = body.taxConfiguration()

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
    fun taxId(): CustomerTaxIdModel? = body.taxId()

    /**
     * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`. This
     * defaults to your account's timezone if not set. This cannot be changed after customer
     * creation.
     */
    fun timezone(): String? = body.timezone()

    /**
     * A valid customer email, to be used for notifications. When Orb triggers payment through a
     * payment gateway, this email will be used for any automatically issued receipts.
     */
    fun _email(): JsonField<String> = body._email()

    /** The full name of the customer */
    fun _name(): JsonField<String> = body._name()

    fun _accountingSyncConfiguration(): JsonField<NewAccountingSyncConfigurationModel> =
        body._accountingSyncConfiguration()

    /**
     * Additional email addresses for this customer. If populated, these email addresses will be
     * CC'd for customer communications.
     */
    fun _additionalEmails(): JsonField<List<String>> = body._additionalEmails()

    /**
     * Used to determine if invoices for this customer will automatically attempt to charge a saved
     * payment method, if available. This parameter defaults to `True` when a payment provider is
     * provided on customer creation.
     */
    fun _autoCollection(): JsonField<Boolean> = body._autoCollection()

    fun _billingAddress(): JsonField<AddressInputModel> = body._billingAddress()

    /**
     * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
     * creation time, will be set at subscription creation time.
     */
    fun _currency(): JsonField<String> = body._currency()

    fun _emailDelivery(): JsonField<Boolean> = body._emailDelivery()

    /**
     * An optional user-defined ID for this customer resource, used throughout the system as an
     * alias for this Customer. Use this field to identify a customer by an existing identifier in
     * your system.
     */
    fun _externalCustomerId(): JsonField<String> = body._externalCustomerId()

    /** The hierarchical relationships for this customer. */
    fun _hierarchy(): JsonField<CustomerHierarchyConfigModel> = body._hierarchy()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode, the connection must first be configured in the Orb webapp.
     */
    fun _paymentProvider(): JsonField<PaymentProvider> = body._paymentProvider()

    /**
     * The ID of this customer in an external payments solution, such as Stripe. This is used for
     * creating charges or invoices in the external system via Orb.
     */
    fun _paymentProviderId(): JsonField<String> = body._paymentProviderId()

    fun _reportingConfiguration(): JsonField<NewReportingConfigurationModel> =
        body._reportingConfiguration()

    fun _shippingAddress(): JsonField<AddressInputModel> = body._shippingAddress()

    fun _taxConfiguration(): JsonField<NewTaxConfigurationModel> = body._taxConfiguration()

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
    fun _taxId(): JsonField<CustomerTaxIdModel> = body._taxId()

    /**
     * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`. This
     * defaults to your account's timezone if not set. This cannot be changed after customer
     * creation.
     */
    fun _timezone(): JsonField<String> = body._timezone()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accounting_sync_configuration")
        @ExcludeMissing
        private val accountingSyncConfiguration: JsonField<NewAccountingSyncConfigurationModel> =
            JsonMissing.of(),
        @JsonProperty("additional_emails")
        @ExcludeMissing
        private val additionalEmails: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("auto_collection")
        @ExcludeMissing
        private val autoCollection: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        private val billingAddress: JsonField<AddressInputModel> = JsonMissing.of(),
        @JsonProperty("currency")
        @ExcludeMissing
        private val currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email_delivery")
        @ExcludeMissing
        private val emailDelivery: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        private val externalCustomerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hierarchy")
        @ExcludeMissing
        private val hierarchy: JsonField<CustomerHierarchyConfigModel> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("payment_provider")
        @ExcludeMissing
        private val paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
        @JsonProperty("payment_provider_id")
        @ExcludeMissing
        private val paymentProviderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reporting_configuration")
        @ExcludeMissing
        private val reportingConfiguration: JsonField<NewReportingConfigurationModel> =
            JsonMissing.of(),
        @JsonProperty("shipping_address")
        @ExcludeMissing
        private val shippingAddress: JsonField<AddressInputModel> = JsonMissing.of(),
        @JsonProperty("tax_configuration")
        @ExcludeMissing
        private val taxConfiguration: JsonField<NewTaxConfigurationModel> = JsonMissing.of(),
        @JsonProperty("tax_id")
        @ExcludeMissing
        private val taxId: JsonField<CustomerTaxIdModel> = JsonMissing.of(),
        @JsonProperty("timezone")
        @ExcludeMissing
        private val timezone: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        fun email(): String = email.getRequired("email")

        /** The full name of the customer */
        fun name(): String = name.getRequired("name")

        fun accountingSyncConfiguration(): NewAccountingSyncConfigurationModel? =
            accountingSyncConfiguration.getNullable("accounting_sync_configuration")

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        fun additionalEmails(): List<String>? = additionalEmails.getNullable("additional_emails")

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         */
        fun autoCollection(): Boolean? = autoCollection.getNullable("auto_collection")

        fun billingAddress(): AddressInputModel? = billingAddress.getNullable("billing_address")

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         */
        fun currency(): String? = currency.getNullable("currency")

        fun emailDelivery(): Boolean? = emailDelivery.getNullable("email_delivery")

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        /** The hierarchical relationships for this customer. */
        fun hierarchy(): CustomerHierarchyConfigModel? = hierarchy.getNullable("hierarchy")

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        fun paymentProvider(): PaymentProvider? = paymentProvider.getNullable("payment_provider")

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(): String? = paymentProviderId.getNullable("payment_provider_id")

        fun reportingConfiguration(): NewReportingConfigurationModel? =
            reportingConfiguration.getNullable("reporting_configuration")

        fun shippingAddress(): AddressInputModel? = shippingAddress.getNullable("shipping_address")

        fun taxConfiguration(): NewTaxConfigurationModel? =
            taxConfiguration.getNullable("tax_configuration")

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
        fun taxId(): CustomerTaxIdModel? = taxId.getNullable("tax_id")

        /**
         * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`.
         * This defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        fun timezone(): String? = timezone.getNullable("timezone")

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** The full name of the customer */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("accounting_sync_configuration")
        @ExcludeMissing
        fun _accountingSyncConfiguration(): JsonField<NewAccountingSyncConfigurationModel> =
            accountingSyncConfiguration

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        @JsonProperty("additional_emails")
        @ExcludeMissing
        fun _additionalEmails(): JsonField<List<String>> = additionalEmails

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         */
        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun _autoCollection(): JsonField<Boolean> = autoCollection

        @JsonProperty("billing_address")
        @ExcludeMissing
        fun _billingAddress(): JsonField<AddressInputModel> = billingAddress

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        @JsonProperty("email_delivery")
        @ExcludeMissing
        fun _emailDelivery(): JsonField<Boolean> = emailDelivery

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId(): JsonField<String> = externalCustomerId

        /** The hierarchical relationships for this customer. */
        @JsonProperty("hierarchy")
        @ExcludeMissing
        fun _hierarchy(): JsonField<CustomerHierarchyConfigModel> = hierarchy

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        @JsonProperty("payment_provider")
        @ExcludeMissing
        fun _paymentProvider(): JsonField<PaymentProvider> = paymentProvider

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        @JsonProperty("payment_provider_id")
        @ExcludeMissing
        fun _paymentProviderId(): JsonField<String> = paymentProviderId

        @JsonProperty("reporting_configuration")
        @ExcludeMissing
        fun _reportingConfiguration(): JsonField<NewReportingConfigurationModel> =
            reportingConfiguration

        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun _shippingAddress(): JsonField<AddressInputModel> = shippingAddress

        @JsonProperty("tax_configuration")
        @ExcludeMissing
        fun _taxConfiguration(): JsonField<NewTaxConfigurationModel> = taxConfiguration

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
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<CustomerTaxIdModel> = taxId

        /**
         * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`.
         * This defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            email()
            name()
            accountingSyncConfiguration()?.validate()
            additionalEmails()
            autoCollection()
            billingAddress()?.validate()
            currency()
            emailDelivery()
            externalCustomerId()
            hierarchy()?.validate()
            metadata()?.validate()
            paymentProvider()
            paymentProviderId()
            reportingConfiguration()?.validate()
            shippingAddress()?.validate()
            taxConfiguration()?.validate()
            taxId()?.validate()
            timezone()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .email()
             * .name()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var email: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var accountingSyncConfiguration:
                JsonField<NewAccountingSyncConfigurationModel> =
                JsonMissing.of()
            private var additionalEmails: JsonField<MutableList<String>>? = null
            private var autoCollection: JsonField<Boolean> = JsonMissing.of()
            private var billingAddress: JsonField<AddressInputModel> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var emailDelivery: JsonField<Boolean> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var hierarchy: JsonField<CustomerHierarchyConfigModel> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var paymentProvider: JsonField<PaymentProvider> = JsonMissing.of()
            private var paymentProviderId: JsonField<String> = JsonMissing.of()
            private var reportingConfiguration: JsonField<NewReportingConfigurationModel> =
                JsonMissing.of()
            private var shippingAddress: JsonField<AddressInputModel> = JsonMissing.of()
            private var taxConfiguration: JsonField<NewTaxConfigurationModel> = JsonMissing.of()
            private var taxId: JsonField<CustomerTaxIdModel> = JsonMissing.of()
            private var timezone: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                email = body.email
                name = body.name
                accountingSyncConfiguration = body.accountingSyncConfiguration
                additionalEmails = body.additionalEmails.map { it.toMutableList() }
                autoCollection = body.autoCollection
                billingAddress = body.billingAddress
                currency = body.currency
                emailDelivery = body.emailDelivery
                externalCustomerId = body.externalCustomerId
                hierarchy = body.hierarchy
                metadata = body.metadata
                paymentProvider = body.paymentProvider
                paymentProviderId = body.paymentProviderId
                reportingConfiguration = body.reportingConfiguration
                shippingAddress = body.shippingAddress
                taxConfiguration = body.taxConfiguration
                taxId = body.taxId
                timezone = body.timezone
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * A valid customer email, to be used for notifications. When Orb triggers payment
             * through a payment gateway, this email will be used for any automatically issued
             * receipts.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * A valid customer email, to be used for notifications. When Orb triggers payment
             * through a payment gateway, this email will be used for any automatically issued
             * receipts.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** The full name of the customer */
            fun name(name: String) = name(JsonField.of(name))

            /** The full name of the customer */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun accountingSyncConfiguration(
                accountingSyncConfiguration: NewAccountingSyncConfigurationModel?
            ) = accountingSyncConfiguration(JsonField.ofNullable(accountingSyncConfiguration))

            fun accountingSyncConfiguration(
                accountingSyncConfiguration: JsonField<NewAccountingSyncConfigurationModel>
            ) = apply { this.accountingSyncConfiguration = accountingSyncConfiguration }

            /**
             * Additional email addresses for this customer. If populated, these email addresses
             * will be CC'd for customer communications.
             */
            fun additionalEmails(additionalEmails: List<String>?) =
                additionalEmails(JsonField.ofNullable(additionalEmails))

            /**
             * Additional email addresses for this customer. If populated, these email addresses
             * will be CC'd for customer communications.
             */
            fun additionalEmails(additionalEmails: JsonField<List<String>>) = apply {
                this.additionalEmails = additionalEmails.map { it.toMutableList() }
            }

            /**
             * Additional email addresses for this customer. If populated, these email addresses
             * will be CC'd for customer communications.
             */
            fun addAdditionalEmail(additionalEmail: String) = apply {
                additionalEmails =
                    (additionalEmails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("additionalEmails", it).add(additionalEmail)
                    }
            }

            /**
             * Used to determine if invoices for this customer will automatically attempt to charge
             * a saved payment method, if available. This parameter defaults to `True` when a
             * payment provider is provided on customer creation.
             */
            fun autoCollection(autoCollection: Boolean?) =
                autoCollection(JsonField.ofNullable(autoCollection))

            /**
             * Used to determine if invoices for this customer will automatically attempt to charge
             * a saved payment method, if available. This parameter defaults to `True` when a
             * payment provider is provided on customer creation.
             */
            fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

            /**
             * Used to determine if invoices for this customer will automatically attempt to charge
             * a saved payment method, if available. This parameter defaults to `True` when a
             * payment provider is provided on customer creation.
             */
            fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
                this.autoCollection = autoCollection
            }

            fun billingAddress(billingAddress: AddressInputModel?) =
                billingAddress(JsonField.ofNullable(billingAddress))

            fun billingAddress(billingAddress: JsonField<AddressInputModel>) = apply {
                this.billingAddress = billingAddress
            }

            /**
             * An ISO 4217 currency string used for the customer's invoices and balance. If not set
             * at creation time, will be set at subscription creation time.
             */
            fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

            /**
             * An ISO 4217 currency string used for the customer's invoices and balance. If not set
             * at creation time, will be set at subscription creation time.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun emailDelivery(emailDelivery: Boolean?) =
                emailDelivery(JsonField.ofNullable(emailDelivery))

            fun emailDelivery(emailDelivery: Boolean) = emailDelivery(emailDelivery as Boolean?)

            fun emailDelivery(emailDelivery: JsonField<Boolean>) = apply {
                this.emailDelivery = emailDelivery
            }

            /**
             * An optional user-defined ID for this customer resource, used throughout the system as
             * an alias for this Customer. Use this field to identify a customer by an existing
             * identifier in your system.
             */
            fun externalCustomerId(externalCustomerId: String?) =
                externalCustomerId(JsonField.ofNullable(externalCustomerId))

            /**
             * An optional user-defined ID for this customer resource, used throughout the system as
             * an alias for this Customer. Use this field to identify a customer by an existing
             * identifier in your system.
             */
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            /** The hierarchical relationships for this customer. */
            fun hierarchy(hierarchy: CustomerHierarchyConfigModel?) =
                hierarchy(JsonField.ofNullable(hierarchy))

            /** The hierarchical relationships for this customer. */
            fun hierarchy(hierarchy: JsonField<CustomerHierarchyConfigModel>) = apply {
                this.hierarchy = hierarchy
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * This is used for creating charges or invoices in an external system via Orb. When not
             * in test mode, the connection must first be configured in the Orb webapp.
             */
            fun paymentProvider(paymentProvider: PaymentProvider?) =
                paymentProvider(JsonField.ofNullable(paymentProvider))

            /**
             * This is used for creating charges or invoices in an external system via Orb. When not
             * in test mode, the connection must first be configured in the Orb webapp.
             */
            fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
                this.paymentProvider = paymentProvider
            }

            /**
             * The ID of this customer in an external payments solution, such as Stripe. This is
             * used for creating charges or invoices in the external system via Orb.
             */
            fun paymentProviderId(paymentProviderId: String?) =
                paymentProviderId(JsonField.ofNullable(paymentProviderId))

            /**
             * The ID of this customer in an external payments solution, such as Stripe. This is
             * used for creating charges or invoices in the external system via Orb.
             */
            fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
                this.paymentProviderId = paymentProviderId
            }

            fun reportingConfiguration(reportingConfiguration: NewReportingConfigurationModel?) =
                reportingConfiguration(JsonField.ofNullable(reportingConfiguration))

            fun reportingConfiguration(
                reportingConfiguration: JsonField<NewReportingConfigurationModel>
            ) = apply { this.reportingConfiguration = reportingConfiguration }

            fun shippingAddress(shippingAddress: AddressInputModel?) =
                shippingAddress(JsonField.ofNullable(shippingAddress))

            fun shippingAddress(shippingAddress: JsonField<AddressInputModel>) = apply {
                this.shippingAddress = shippingAddress
            }

            fun taxConfiguration(taxConfiguration: NewTaxConfigurationModel?) =
                taxConfiguration(JsonField.ofNullable(taxConfiguration))

            fun taxConfiguration(taxConfiguration: JsonField<NewTaxConfigurationModel>) = apply {
                this.taxConfiguration = taxConfiguration
            }

            fun taxConfiguration(
                avalaraTaxConfiguration: NewTaxConfigurationModel.NewAvalaraTaxConfiguration
            ) =
                taxConfiguration(
                    NewTaxConfigurationModel.ofAvalaraTaxConfiguration(avalaraTaxConfiguration)
                )

            fun avalaraTaxConfigurationTaxConfiguration(taxExempt: Boolean) =
                taxConfiguration(
                    NewTaxConfigurationModel.NewAvalaraTaxConfiguration.builder()
                        .taxProvider(
                            NewTaxConfigurationModel.NewAvalaraTaxConfiguration.TaxProvider.AVALARA
                        )
                        .taxExempt(taxExempt)
                        .build()
                )

            fun taxConfiguration(
                jarConfiguration: NewTaxConfigurationModel.NewTaxJarConfiguration
            ) = taxConfiguration(NewTaxConfigurationModel.ofJarConfiguration(jarConfiguration))

            fun jarConfigurationTaxConfiguration(taxExempt: Boolean) =
                taxConfiguration(
                    NewTaxConfigurationModel.NewTaxJarConfiguration.builder()
                        .taxProvider(
                            NewTaxConfigurationModel.NewTaxJarConfiguration.TaxProvider.TAXJAR
                        )
                        .taxExempt(taxExempt)
                        .build()
                )

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
            fun taxId(taxId: CustomerTaxIdModel?) = taxId(JsonField.ofNullable(taxId))

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
            fun taxId(taxId: JsonField<CustomerTaxIdModel>) = apply { this.taxId = taxId }

            /**
             * A timezone identifier from the IANA timezone database, such as
             * `"America/Los_Angeles"`. This defaults to your account's timezone if not set. This
             * cannot be changed after customer creation.
             */
            fun timezone(timezone: String?) = timezone(JsonField.ofNullable(timezone))

            /**
             * A timezone identifier from the IANA timezone database, such as
             * `"America/Los_Angeles"`. This defaults to your account's timezone if not set. This
             * cannot be changed after customer creation.
             */
            fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

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

            fun build(): Body =
                Body(
                    checkRequired("email", email),
                    checkRequired("name", name),
                    accountingSyncConfiguration,
                    (additionalEmails ?: JsonMissing.of()).map { it.toImmutable() },
                    autoCollection,
                    billingAddress,
                    currency,
                    emailDelivery,
                    externalCustomerId,
                    hierarchy,
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

            return /* spotless:off */ other is Body && email == other.email && name == other.name && accountingSyncConfiguration == other.accountingSyncConfiguration && additionalEmails == other.additionalEmails && autoCollection == other.autoCollection && billingAddress == other.billingAddress && currency == other.currency && emailDelivery == other.emailDelivery && externalCustomerId == other.externalCustomerId && hierarchy == other.hierarchy && metadata == other.metadata && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && reportingConfiguration == other.reportingConfiguration && shippingAddress == other.shippingAddress && taxConfiguration == other.taxConfiguration && taxId == other.taxId && timezone == other.timezone && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(email, name, accountingSyncConfiguration, additionalEmails, autoCollection, billingAddress, currency, emailDelivery, externalCustomerId, hierarchy, metadata, paymentProvider, paymentProviderId, reportingConfiguration, shippingAddress, taxConfiguration, taxId, timezone, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{email=$email, name=$name, accountingSyncConfiguration=$accountingSyncConfiguration, additionalEmails=$additionalEmails, autoCollection=$autoCollection, billingAddress=$billingAddress, currency=$currency, emailDelivery=$emailDelivery, externalCustomerId=$externalCustomerId, hierarchy=$hierarchy, metadata=$metadata, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, reportingConfiguration=$reportingConfiguration, shippingAddress=$shippingAddress, taxConfiguration=$taxConfiguration, taxId=$taxId, timezone=$timezone, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .email()
         * .name()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerCreateParams: CustomerCreateParams) = apply {
            body = customerCreateParams.body.toBuilder()
            additionalHeaders = customerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        fun email(email: String) = apply { body.email(email) }

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        fun email(email: JsonField<String>) = apply { body.email(email) }

        /** The full name of the customer */
        fun name(name: String) = apply { body.name(name) }

        /** The full name of the customer */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun accountingSyncConfiguration(
            accountingSyncConfiguration: NewAccountingSyncConfigurationModel?
        ) = apply { body.accountingSyncConfiguration(accountingSyncConfiguration) }

        fun accountingSyncConfiguration(
            accountingSyncConfiguration: JsonField<NewAccountingSyncConfigurationModel>
        ) = apply { body.accountingSyncConfiguration(accountingSyncConfiguration) }

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        fun additionalEmails(additionalEmails: List<String>?) = apply {
            body.additionalEmails(additionalEmails)
        }

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        fun additionalEmails(additionalEmails: JsonField<List<String>>) = apply {
            body.additionalEmails(additionalEmails)
        }

        /**
         * Additional email addresses for this customer. If populated, these email addresses will be
         * CC'd for customer communications.
         */
        fun addAdditionalEmail(additionalEmail: String) = apply {
            body.addAdditionalEmail(additionalEmail)
        }

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         */
        fun autoCollection(autoCollection: Boolean?) = apply { body.autoCollection(autoCollection) }

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         */
        fun autoCollection(autoCollection: Boolean) = autoCollection(autoCollection as Boolean?)

        /**
         * Used to determine if invoices for this customer will automatically attempt to charge a
         * saved payment method, if available. This parameter defaults to `True` when a payment
         * provider is provided on customer creation.
         */
        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            body.autoCollection(autoCollection)
        }

        fun billingAddress(billingAddress: AddressInputModel?) = apply {
            body.billingAddress(billingAddress)
        }

        fun billingAddress(billingAddress: JsonField<AddressInputModel>) = apply {
            body.billingAddress(billingAddress)
        }

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         */
        fun currency(currency: String?) = apply { body.currency(currency) }

        /**
         * An ISO 4217 currency string used for the customer's invoices and balance. If not set at
         * creation time, will be set at subscription creation time.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        fun emailDelivery(emailDelivery: Boolean?) = apply { body.emailDelivery(emailDelivery) }

        fun emailDelivery(emailDelivery: Boolean) = emailDelivery(emailDelivery as Boolean?)

        fun emailDelivery(emailDelivery: JsonField<Boolean>) = apply {
            body.emailDelivery(emailDelivery)
        }

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        fun externalCustomerId(externalCustomerId: String?) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            body.externalCustomerId(externalCustomerId)
        }

        /** The hierarchical relationships for this customer. */
        fun hierarchy(hierarchy: CustomerHierarchyConfigModel?) = apply {
            body.hierarchy(hierarchy)
        }

        /** The hierarchical relationships for this customer. */
        fun hierarchy(hierarchy: JsonField<CustomerHierarchyConfigModel>) = apply {
            body.hierarchy(hierarchy)
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        fun paymentProvider(paymentProvider: PaymentProvider?) = apply {
            body.paymentProvider(paymentProvider)
        }

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
            body.paymentProvider(paymentProvider)
        }

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(paymentProviderId: String?) = apply {
            body.paymentProviderId(paymentProviderId)
        }

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
            body.paymentProviderId(paymentProviderId)
        }

        fun reportingConfiguration(reportingConfiguration: NewReportingConfigurationModel?) =
            apply {
                body.reportingConfiguration(reportingConfiguration)
            }

        fun reportingConfiguration(
            reportingConfiguration: JsonField<NewReportingConfigurationModel>
        ) = apply { body.reportingConfiguration(reportingConfiguration) }

        fun shippingAddress(shippingAddress: AddressInputModel?) = apply {
            body.shippingAddress(shippingAddress)
        }

        fun shippingAddress(shippingAddress: JsonField<AddressInputModel>) = apply {
            body.shippingAddress(shippingAddress)
        }

        fun taxConfiguration(taxConfiguration: NewTaxConfigurationModel?) = apply {
            body.taxConfiguration(taxConfiguration)
        }

        fun taxConfiguration(taxConfiguration: JsonField<NewTaxConfigurationModel>) = apply {
            body.taxConfiguration(taxConfiguration)
        }

        fun taxConfiguration(
            avalaraTaxConfiguration: NewTaxConfigurationModel.NewAvalaraTaxConfiguration
        ) = apply { body.taxConfiguration(avalaraTaxConfiguration) }

        fun avalaraTaxConfigurationTaxConfiguration(taxExempt: Boolean) = apply {
            body.avalaraTaxConfigurationTaxConfiguration(taxExempt)
        }

        fun taxConfiguration(jarConfiguration: NewTaxConfigurationModel.NewTaxJarConfiguration) =
            apply {
                body.taxConfiguration(jarConfiguration)
            }

        fun jarConfigurationTaxConfiguration(taxExempt: Boolean) = apply {
            body.jarConfigurationTaxConfiguration(taxExempt)
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
        fun taxId(taxId: CustomerTaxIdModel?) = apply { body.taxId(taxId) }

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
        fun taxId(taxId: JsonField<CustomerTaxIdModel>) = apply { body.taxId(taxId) }

        /**
         * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`.
         * This defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        fun timezone(timezone: String?) = apply { body.timezone(timezone) }

        /**
         * A timezone identifier from the IANA timezone database, such as `"America/Los_Angeles"`.
         * This defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        fun timezone(timezone: JsonField<String>) = apply { body.timezone(timezone) }

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

        fun build(): CustomerCreateParams =
            CustomerCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
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

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode, the connection must first be configured in the Orb webapp.
     */
    class PaymentProvider @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val QUICKBOOKS = of("quickbooks")

            val BILL_COM = of("bill.com")

            val STRIPE_CHARGE = of("stripe_charge")

            val STRIPE_INVOICE = of("stripe_invoice")

            val NETSUITE = of("netsuite")

            fun of(value: String) = PaymentProvider(JsonField.of(value))
        }

        /** An enum containing [PaymentProvider]'s known values. */
        enum class Known {
            QUICKBOOKS,
            BILL_COM,
            STRIPE_CHARGE,
            STRIPE_INVOICE,
            NETSUITE,
        }

        /**
         * An enum containing [PaymentProvider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentProvider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            QUICKBOOKS,
            BILL_COM,
            STRIPE_CHARGE,
            STRIPE_INVOICE,
            NETSUITE,
            /**
             * An enum member indicating that [PaymentProvider] was instantiated with an unknown
             * value.
             */
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
                QUICKBOOKS -> Value.QUICKBOOKS
                BILL_COM -> Value.BILL_COM
                STRIPE_CHARGE -> Value.STRIPE_CHARGE
                STRIPE_INVOICE -> Value.STRIPE_INVOICE
                NETSUITE -> Value.NETSUITE
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
                QUICKBOOKS -> Known.QUICKBOOKS
                BILL_COM -> Known.BILL_COM
                STRIPE_CHARGE -> Known.STRIPE_CHARGE
                STRIPE_INVOICE -> Known.STRIPE_INVOICE
                NETSUITE -> Known.NETSUITE
                else -> throw OrbInvalidDataException("Unknown PaymentProvider: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentProvider && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomerCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
