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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * A customer is a buyer of your products, and the other party to the billing relationship.
 *
 * In Orb, customers are assigned system generated identifiers automatically, but it's often
 * desirable to have these match existing identifiers in your system. To avoid having to denormalize
 * Orb ID information, you can pass in an `external_customer_id` with your own identifier. See
 * [Customer ID Aliases](/events-and-metrics/customer-aliases) for further information about how
 * these aliases work in Orb.
 *
 * In addition to having an identifier in your system, a customer may exist in a payment provider
 * solution like Stripe. Use the `payment_provider_id` and the `payment_provider` enum field to
 * express this mapping.
 *
 * A customer also has a timezone (from the standard
 * [IANA timezone database](https://www.iana.org/time-zones)), which defaults to your account's
 * timezone. See [Timezone localization](/essentials/timezones) for information on what this
 * timezone parameter influences within Orb.
 */
@NoAutoDetect
class Customer
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("additional_emails")
    @ExcludeMissing
    private val additionalEmails: JsonField<List<String>> = JsonMissing.of(),
    @JsonProperty("auto_collection")
    @ExcludeMissing
    private val autoCollection: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("balance")
    @ExcludeMissing
    private val balance: JsonField<String> = JsonMissing.of(),
    @JsonProperty("billing_address")
    @ExcludeMissing
    private val billingAddress: JsonField<AddressModel> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("email") @ExcludeMissing private val email: JsonField<String> = JsonMissing.of(),
    @JsonProperty("email_delivery")
    @ExcludeMissing
    private val emailDelivery: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("exempt_from_automated_tax")
    @ExcludeMissing
    private val exemptFromAutomatedTax: JsonField<Boolean> = JsonMissing.of(),
    @JsonProperty("external_customer_id")
    @ExcludeMissing
    private val externalCustomerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("hierarchy")
    @ExcludeMissing
    private val hierarchy: JsonField<Hierarchy> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_provider")
    @ExcludeMissing
    private val paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
    @JsonProperty("payment_provider_id")
    @ExcludeMissing
    private val paymentProviderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("portal_url")
    @ExcludeMissing
    private val portalUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("shipping_address")
    @ExcludeMissing
    private val shippingAddress: JsonField<AddressModel> = JsonMissing.of(),
    @JsonProperty("tax_id")
    @ExcludeMissing
    private val taxId: JsonField<CustomerTaxIdModel> = JsonMissing.of(),
    @JsonProperty("timezone")
    @ExcludeMissing
    private val timezone: JsonField<String> = JsonMissing.of(),
    @JsonProperty("accounting_sync_configuration")
    @ExcludeMissing
    private val accountingSyncConfiguration: JsonField<AccountingSyncConfiguration> =
        JsonMissing.of(),
    @JsonProperty("reporting_configuration")
    @ExcludeMissing
    private val reportingConfiguration: JsonField<ReportingConfiguration> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun additionalEmails(): List<String> = additionalEmails.getRequired("additional_emails")

    fun autoCollection(): Boolean = autoCollection.getRequired("auto_collection")

    /** The customer's current balance in their currency. */
    fun balance(): String = balance.getRequired("balance")

    fun billingAddress(): AddressModel? = billingAddress.getNullable("billing_address")

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun currency(): String? = currency.getNullable("currency")

    /**
     * A valid customer email, to be used for notifications. When Orb triggers payment through a
     * payment gateway, this email will be used for any automatically issued receipts.
     */
    fun email(): String = email.getRequired("email")

    fun emailDelivery(): Boolean = emailDelivery.getRequired("email_delivery")

    fun exemptFromAutomatedTax(): Boolean? =
        exemptFromAutomatedTax.getNullable("exempt_from_automated_tax")

    /**
     * An optional user-defined ID for this customer resource, used throughout the system as an
     * alias for this Customer. Use this field to identify a customer by an existing identifier in
     * your system.
     */
    fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

    /** The hierarchical relationships for this customer. */
    fun hierarchy(): Hierarchy = hierarchy.getRequired("hierarchy")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /** The full name of the customer */
    fun name(): String = name.getRequired("name")

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode, the connection must first be configured in the Orb webapp.
     */
    fun paymentProvider(): PaymentProvider? = paymentProvider.getNullable("payment_provider")

    /**
     * The ID of this customer in an external payments solution, such as Stripe. This is used for
     * creating charges or invoices in the external system via Orb.
     */
    fun paymentProviderId(): String? = paymentProviderId.getNullable("payment_provider_id")

    fun portalUrl(): String? = portalUrl.getNullable("portal_url")

    fun shippingAddress(): AddressModel? = shippingAddress.getNullable("shipping_address")

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
    fun taxId(): CustomerTaxIdModel? = taxId.getNullable("tax_id")

    /**
     * A timezone identifier from the IANA timezone database, such as "America/Los_Angeles". This
     * "defaults to your account's timezone if not set. This cannot be changed after customer
     * creation.
     */
    fun timezone(): String = timezone.getRequired("timezone")

    fun accountingSyncConfiguration(): AccountingSyncConfiguration? =
        accountingSyncConfiguration.getNullable("accounting_sync_configuration")

    fun reportingConfiguration(): ReportingConfiguration? =
        reportingConfiguration.getNullable("reporting_configuration")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("additional_emails")
    @ExcludeMissing
    fun _additionalEmails(): JsonField<List<String>> = additionalEmails

    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<Boolean> = autoCollection

    /** The customer's current balance in their currency. */
    @JsonProperty("balance") @ExcludeMissing fun _balance(): JsonField<String> = balance

    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<AddressModel> = billingAddress

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * A valid customer email, to be used for notifications. When Orb triggers payment through a
     * payment gateway, this email will be used for any automatically issued receipts.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    @JsonProperty("email_delivery")
    @ExcludeMissing
    fun _emailDelivery(): JsonField<Boolean> = emailDelivery

    @JsonProperty("exempt_from_automated_tax")
    @ExcludeMissing
    fun _exemptFromAutomatedTax(): JsonField<Boolean> = exemptFromAutomatedTax

    /**
     * An optional user-defined ID for this customer resource, used throughout the system as an
     * alias for this Customer. Use this field to identify a customer by an existing identifier in
     * your system.
     */
    @JsonProperty("external_customer_id")
    @ExcludeMissing
    fun _externalCustomerId(): JsonField<String> = externalCustomerId

    /** The hierarchical relationships for this customer. */
    @JsonProperty("hierarchy") @ExcludeMissing fun _hierarchy(): JsonField<Hierarchy> = hierarchy

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /** The full name of the customer */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * This is used for creating charges or invoices in an external system via Orb. When not in test
     * mode, the connection must first be configured in the Orb webapp.
     */
    @JsonProperty("payment_provider")
    @ExcludeMissing
    fun _paymentProvider(): JsonField<PaymentProvider> = paymentProvider

    /**
     * The ID of this customer in an external payments solution, such as Stripe. This is used for
     * creating charges or invoices in the external system via Orb.
     */
    @JsonProperty("payment_provider_id")
    @ExcludeMissing
    fun _paymentProviderId(): JsonField<String> = paymentProviderId

    @JsonProperty("portal_url") @ExcludeMissing fun _portalUrl(): JsonField<String> = portalUrl

    @JsonProperty("shipping_address")
    @ExcludeMissing
    fun _shippingAddress(): JsonField<AddressModel> = shippingAddress

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
    @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<CustomerTaxIdModel> = taxId

    /**
     * A timezone identifier from the IANA timezone database, such as "America/Los_Angeles". This
     * "defaults to your account's timezone if not set. This cannot be changed after customer
     * creation.
     */
    @JsonProperty("timezone") @ExcludeMissing fun _timezone(): JsonField<String> = timezone

    @JsonProperty("accounting_sync_configuration")
    @ExcludeMissing
    fun _accountingSyncConfiguration(): JsonField<AccountingSyncConfiguration> =
        accountingSyncConfiguration

    @JsonProperty("reporting_configuration")
    @ExcludeMissing
    fun _reportingConfiguration(): JsonField<ReportingConfiguration> = reportingConfiguration

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Customer = apply {
        if (validated) {
            return@apply
        }

        id()
        additionalEmails()
        autoCollection()
        balance()
        billingAddress()?.validate()
        createdAt()
        currency()
        email()
        emailDelivery()
        exemptFromAutomatedTax()
        externalCustomerId()
        hierarchy().validate()
        metadata().validate()
        name()
        paymentProvider()
        paymentProviderId()
        portalUrl()
        shippingAddress()?.validate()
        taxId()?.validate()
        timezone()
        accountingSyncConfiguration()?.validate()
        reportingConfiguration()?.validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Customer].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .additionalEmails()
         * .autoCollection()
         * .balance()
         * .billingAddress()
         * .createdAt()
         * .currency()
         * .email()
         * .emailDelivery()
         * .exemptFromAutomatedTax()
         * .externalCustomerId()
         * .hierarchy()
         * .metadata()
         * .name()
         * .paymentProvider()
         * .paymentProviderId()
         * .portalUrl()
         * .shippingAddress()
         * .taxId()
         * .timezone()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Customer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var additionalEmails: JsonField<MutableList<String>>? = null
        private var autoCollection: JsonField<Boolean>? = null
        private var balance: JsonField<String>? = null
        private var billingAddress: JsonField<AddressModel>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<String>? = null
        private var email: JsonField<String>? = null
        private var emailDelivery: JsonField<Boolean>? = null
        private var exemptFromAutomatedTax: JsonField<Boolean>? = null
        private var externalCustomerId: JsonField<String>? = null
        private var hierarchy: JsonField<Hierarchy>? = null
        private var metadata: JsonField<Metadata>? = null
        private var name: JsonField<String>? = null
        private var paymentProvider: JsonField<PaymentProvider>? = null
        private var paymentProviderId: JsonField<String>? = null
        private var portalUrl: JsonField<String>? = null
        private var shippingAddress: JsonField<AddressModel>? = null
        private var taxId: JsonField<CustomerTaxIdModel>? = null
        private var timezone: JsonField<String>? = null
        private var accountingSyncConfiguration: JsonField<AccountingSyncConfiguration> =
            JsonMissing.of()
        private var reportingConfiguration: JsonField<ReportingConfiguration> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customer: Customer) = apply {
            id = customer.id
            additionalEmails = customer.additionalEmails.map { it.toMutableList() }
            autoCollection = customer.autoCollection
            balance = customer.balance
            billingAddress = customer.billingAddress
            createdAt = customer.createdAt
            currency = customer.currency
            email = customer.email
            emailDelivery = customer.emailDelivery
            exemptFromAutomatedTax = customer.exemptFromAutomatedTax
            externalCustomerId = customer.externalCustomerId
            hierarchy = customer.hierarchy
            metadata = customer.metadata
            name = customer.name
            paymentProvider = customer.paymentProvider
            paymentProviderId = customer.paymentProviderId
            portalUrl = customer.portalUrl
            shippingAddress = customer.shippingAddress
            taxId = customer.taxId
            timezone = customer.timezone
            accountingSyncConfiguration = customer.accountingSyncConfiguration
            reportingConfiguration = customer.reportingConfiguration
            additionalProperties = customer.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun additionalEmails(additionalEmails: List<String>) =
            additionalEmails(JsonField.of(additionalEmails))

        fun additionalEmails(additionalEmails: JsonField<List<String>>) = apply {
            this.additionalEmails = additionalEmails.map { it.toMutableList() }
        }

        fun addAdditionalEmail(additionalEmail: String) = apply {
            additionalEmails =
                (additionalEmails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("additionalEmails", it).add(additionalEmail)
                }
        }

        fun autoCollection(autoCollection: Boolean) = autoCollection(JsonField.of(autoCollection))

        fun autoCollection(autoCollection: JsonField<Boolean>) = apply {
            this.autoCollection = autoCollection
        }

        /** The customer's current balance in their currency. */
        fun balance(balance: String) = balance(JsonField.of(balance))

        /** The customer's current balance in their currency. */
        fun balance(balance: JsonField<String>) = apply { this.balance = balance }

        fun billingAddress(billingAddress: AddressModel?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        fun billingAddress(billingAddress: JsonField<AddressModel>) = apply {
            this.billingAddress = billingAddress
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun currency(currency: String?) = currency(JsonField.ofNullable(currency))

        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        fun email(email: String) = email(JsonField.of(email))

        /**
         * A valid customer email, to be used for notifications. When Orb triggers payment through a
         * payment gateway, this email will be used for any automatically issued receipts.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun emailDelivery(emailDelivery: Boolean) = emailDelivery(JsonField.of(emailDelivery))

        fun emailDelivery(emailDelivery: JsonField<Boolean>) = apply {
            this.emailDelivery = emailDelivery
        }

        fun exemptFromAutomatedTax(exemptFromAutomatedTax: Boolean?) =
            exemptFromAutomatedTax(JsonField.ofNullable(exemptFromAutomatedTax))

        fun exemptFromAutomatedTax(exemptFromAutomatedTax: Boolean) =
            exemptFromAutomatedTax(exemptFromAutomatedTax as Boolean?)

        fun exemptFromAutomatedTax(exemptFromAutomatedTax: JsonField<Boolean>) = apply {
            this.exemptFromAutomatedTax = exemptFromAutomatedTax
        }

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        fun externalCustomerId(externalCustomerId: String?) =
            externalCustomerId(JsonField.ofNullable(externalCustomerId))

        /**
         * An optional user-defined ID for this customer resource, used throughout the system as an
         * alias for this Customer. Use this field to identify a customer by an existing identifier
         * in your system.
         */
        fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** The hierarchical relationships for this customer. */
        fun hierarchy(hierarchy: Hierarchy) = hierarchy(JsonField.of(hierarchy))

        /** The hierarchical relationships for this customer. */
        fun hierarchy(hierarchy: JsonField<Hierarchy>) = apply { this.hierarchy = hierarchy }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The full name of the customer */
        fun name(name: String) = name(JsonField.of(name))

        /** The full name of the customer */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        fun paymentProvider(paymentProvider: PaymentProvider?) =
            paymentProvider(JsonField.ofNullable(paymentProvider))

        /**
         * This is used for creating charges or invoices in an external system via Orb. When not in
         * test mode, the connection must first be configured in the Orb webapp.
         */
        fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
            this.paymentProvider = paymentProvider
        }

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(paymentProviderId: String?) =
            paymentProviderId(JsonField.ofNullable(paymentProviderId))

        /**
         * The ID of this customer in an external payments solution, such as Stripe. This is used
         * for creating charges or invoices in the external system via Orb.
         */
        fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
            this.paymentProviderId = paymentProviderId
        }

        fun portalUrl(portalUrl: String?) = portalUrl(JsonField.ofNullable(portalUrl))

        fun portalUrl(portalUrl: JsonField<String>) = apply { this.portalUrl = portalUrl }

        fun shippingAddress(shippingAddress: AddressModel?) =
            shippingAddress(JsonField.ofNullable(shippingAddress))

        fun shippingAddress(shippingAddress: JsonField<AddressModel>) = apply {
            this.shippingAddress = shippingAddress
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
        fun taxId(taxId: CustomerTaxIdModel?) = taxId(JsonField.ofNullable(taxId))

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
        fun taxId(taxId: JsonField<CustomerTaxIdModel>) = apply { this.taxId = taxId }

        /**
         * A timezone identifier from the IANA timezone database, such as "America/Los_Angeles".
         * This "defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        fun timezone(timezone: String) = timezone(JsonField.of(timezone))

        /**
         * A timezone identifier from the IANA timezone database, such as "America/Los_Angeles".
         * This "defaults to your account's timezone if not set. This cannot be changed after
         * customer creation.
         */
        fun timezone(timezone: JsonField<String>) = apply { this.timezone = timezone }

        fun accountingSyncConfiguration(accountingSyncConfiguration: AccountingSyncConfiguration?) =
            accountingSyncConfiguration(JsonField.ofNullable(accountingSyncConfiguration))

        fun accountingSyncConfiguration(
            accountingSyncConfiguration: JsonField<AccountingSyncConfiguration>
        ) = apply { this.accountingSyncConfiguration = accountingSyncConfiguration }

        fun reportingConfiguration(reportingConfiguration: ReportingConfiguration?) =
            reportingConfiguration(JsonField.ofNullable(reportingConfiguration))

        fun reportingConfiguration(reportingConfiguration: JsonField<ReportingConfiguration>) =
            apply {
                this.reportingConfiguration = reportingConfiguration
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

        fun build(): Customer =
            Customer(
                checkRequired("id", id),
                checkRequired("additionalEmails", additionalEmails).map { it.toImmutable() },
                checkRequired("autoCollection", autoCollection),
                checkRequired("balance", balance),
                checkRequired("billingAddress", billingAddress),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("email", email),
                checkRequired("emailDelivery", emailDelivery),
                checkRequired("exemptFromAutomatedTax", exemptFromAutomatedTax),
                checkRequired("externalCustomerId", externalCustomerId),
                checkRequired("hierarchy", hierarchy),
                checkRequired("metadata", metadata),
                checkRequired("name", name),
                checkRequired("paymentProvider", paymentProvider),
                checkRequired("paymentProviderId", paymentProviderId),
                checkRequired("portalUrl", portalUrl),
                checkRequired("shippingAddress", shippingAddress),
                checkRequired("taxId", taxId),
                checkRequired("timezone", timezone),
                accountingSyncConfiguration,
                reportingConfiguration,
                additionalProperties.toImmutable(),
            )
    }

    /** The hierarchical relationships for this customer. */
    @NoAutoDetect
    class Hierarchy
    @JsonCreator
    private constructor(
        @JsonProperty("children")
        @ExcludeMissing
        private val children: JsonField<List<CustomerMinifiedModel>> = JsonMissing.of(),
        @JsonProperty("parent")
        @ExcludeMissing
        private val parent: JsonField<CustomerMinifiedModel> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun children(): List<CustomerMinifiedModel> = children.getRequired("children")

        fun parent(): CustomerMinifiedModel? = parent.getNullable("parent")

        @JsonProperty("children")
        @ExcludeMissing
        fun _children(): JsonField<List<CustomerMinifiedModel>> = children

        @JsonProperty("parent")
        @ExcludeMissing
        fun _parent(): JsonField<CustomerMinifiedModel> = parent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Hierarchy = apply {
            if (validated) {
                return@apply
            }

            children().forEach { it.validate() }
            parent()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Hierarchy].
             *
             * The following fields are required:
             * ```kotlin
             * .children()
             * .parent()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Hierarchy]. */
        class Builder internal constructor() {

            private var children: JsonField<MutableList<CustomerMinifiedModel>>? = null
            private var parent: JsonField<CustomerMinifiedModel>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(hierarchy: Hierarchy) = apply {
                children = hierarchy.children.map { it.toMutableList() }
                parent = hierarchy.parent
                additionalProperties = hierarchy.additionalProperties.toMutableMap()
            }

            fun children(children: List<CustomerMinifiedModel>) = children(JsonField.of(children))

            fun children(children: JsonField<List<CustomerMinifiedModel>>) = apply {
                this.children = children.map { it.toMutableList() }
            }

            fun addChild(child: CustomerMinifiedModel) = apply {
                children =
                    (children ?: JsonField.of(mutableListOf())).also {
                        checkKnown("children", it).add(child)
                    }
            }

            fun parent(parent: CustomerMinifiedModel?) = parent(JsonField.ofNullable(parent))

            fun parent(parent: JsonField<CustomerMinifiedModel>) = apply { this.parent = parent }

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

            fun build(): Hierarchy =
                Hierarchy(
                    checkRequired("children", children).map { it.toImmutable() },
                    checkRequired("parent", parent),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Hierarchy && children == other.children && parent == other.parent && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(children, parent, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Hierarchy{children=$children, parent=$parent, additionalProperties=$additionalProperties}"
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
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

    @NoAutoDetect
    class AccountingSyncConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("accounting_providers")
        @ExcludeMissing
        private val accountingProviders: JsonField<List<AccountingProvider>> = JsonMissing.of(),
        @JsonProperty("excluded")
        @ExcludeMissing
        private val excluded: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun accountingProviders(): List<AccountingProvider> =
            accountingProviders.getRequired("accounting_providers")

        fun excluded(): Boolean = excluded.getRequired("excluded")

        @JsonProperty("accounting_providers")
        @ExcludeMissing
        fun _accountingProviders(): JsonField<List<AccountingProvider>> = accountingProviders

        @JsonProperty("excluded") @ExcludeMissing fun _excluded(): JsonField<Boolean> = excluded

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccountingSyncConfiguration = apply {
            if (validated) {
                return@apply
            }

            accountingProviders().forEach { it.validate() }
            excluded()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [AccountingSyncConfiguration].
             *
             * The following fields are required:
             * ```kotlin
             * .accountingProviders()
             * .excluded()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountingSyncConfiguration]. */
        class Builder internal constructor() {

            private var accountingProviders: JsonField<MutableList<AccountingProvider>>? = null
            private var excluded: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountingSyncConfiguration: AccountingSyncConfiguration) = apply {
                accountingProviders =
                    accountingSyncConfiguration.accountingProviders.map { it.toMutableList() }
                excluded = accountingSyncConfiguration.excluded
                additionalProperties =
                    accountingSyncConfiguration.additionalProperties.toMutableMap()
            }

            fun accountingProviders(accountingProviders: List<AccountingProvider>) =
                accountingProviders(JsonField.of(accountingProviders))

            fun accountingProviders(accountingProviders: JsonField<List<AccountingProvider>>) =
                apply {
                    this.accountingProviders = accountingProviders.map { it.toMutableList() }
                }

            fun addAccountingProvider(accountingProvider: AccountingProvider) = apply {
                accountingProviders =
                    (accountingProviders ?: JsonField.of(mutableListOf())).also {
                        checkKnown("accountingProviders", it).add(accountingProvider)
                    }
            }

            fun excluded(excluded: Boolean) = excluded(JsonField.of(excluded))

            fun excluded(excluded: JsonField<Boolean>) = apply { this.excluded = excluded }

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

            fun build(): AccountingSyncConfiguration =
                AccountingSyncConfiguration(
                    checkRequired("accountingProviders", accountingProviders).map {
                        it.toImmutable()
                    },
                    checkRequired("excluded", excluded),
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AccountingProvider
        @JsonCreator
        private constructor(
            @JsonProperty("external_provider_id")
            @ExcludeMissing
            private val externalProviderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider_type")
            @ExcludeMissing
            private val providerType: JsonField<ProviderType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun externalProviderId(): String? =
                externalProviderId.getNullable("external_provider_id")

            fun providerType(): ProviderType = providerType.getRequired("provider_type")

            @JsonProperty("external_provider_id")
            @ExcludeMissing
            fun _externalProviderId(): JsonField<String> = externalProviderId

            @JsonProperty("provider_type")
            @ExcludeMissing
            fun _providerType(): JsonField<ProviderType> = providerType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AccountingProvider = apply {
                if (validated) {
                    return@apply
                }

                externalProviderId()
                providerType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AccountingProvider].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .externalProviderId()
                 * .providerType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [AccountingProvider]. */
            class Builder internal constructor() {

                private var externalProviderId: JsonField<String>? = null
                private var providerType: JsonField<ProviderType>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountingProvider: AccountingProvider) = apply {
                    externalProviderId = accountingProvider.externalProviderId
                    providerType = accountingProvider.providerType
                    additionalProperties = accountingProvider.additionalProperties.toMutableMap()
                }

                fun externalProviderId(externalProviderId: String?) =
                    externalProviderId(JsonField.ofNullable(externalProviderId))

                fun externalProviderId(externalProviderId: JsonField<String>) = apply {
                    this.externalProviderId = externalProviderId
                }

                fun providerType(providerType: ProviderType) =
                    providerType(JsonField.of(providerType))

                fun providerType(providerType: JsonField<ProviderType>) = apply {
                    this.providerType = providerType
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

                fun build(): AccountingProvider =
                    AccountingProvider(
                        checkRequired("externalProviderId", externalProviderId),
                        checkRequired("providerType", providerType),
                        additionalProperties.toImmutable(),
                    )
            }

            class ProviderType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val QUICKBOOKS = of("quickbooks")

                    val NETSUITE = of("netsuite")

                    fun of(value: String) = ProviderType(JsonField.of(value))
                }

                /** An enum containing [ProviderType]'s known values. */
                enum class Known {
                    QUICKBOOKS,
                    NETSUITE,
                }

                /**
                 * An enum containing [ProviderType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ProviderType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    QUICKBOOKS,
                    NETSUITE,
                    /**
                     * An enum member indicating that [ProviderType] was instantiated with an
                     * unknown value.
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
                        QUICKBOOKS -> Value.QUICKBOOKS
                        NETSUITE -> Value.NETSUITE
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
                        QUICKBOOKS -> Known.QUICKBOOKS
                        NETSUITE -> Known.NETSUITE
                        else -> throw OrbInvalidDataException("Unknown ProviderType: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ProviderType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountingProvider && externalProviderId == other.externalProviderId && providerType == other.providerType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(externalProviderId, providerType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountingProvider{externalProviderId=$externalProviderId, providerType=$providerType, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccountingSyncConfiguration && accountingProviders == other.accountingProviders && excluded == other.excluded && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountingProviders, excluded, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountingSyncConfiguration{accountingProviders=$accountingProviders, excluded=$excluded, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ReportingConfiguration
    @JsonCreator
    private constructor(
        @JsonProperty("exempt")
        @ExcludeMissing
        private val exempt: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun exempt(): Boolean = exempt.getRequired("exempt")

        @JsonProperty("exempt") @ExcludeMissing fun _exempt(): JsonField<Boolean> = exempt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ReportingConfiguration = apply {
            if (validated) {
                return@apply
            }

            exempt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ReportingConfiguration].
             *
             * The following fields are required:
             * ```kotlin
             * .exempt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ReportingConfiguration]. */
        class Builder internal constructor() {

            private var exempt: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(reportingConfiguration: ReportingConfiguration) = apply {
                exempt = reportingConfiguration.exempt
                additionalProperties = reportingConfiguration.additionalProperties.toMutableMap()
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

            fun build(): ReportingConfiguration =
                ReportingConfiguration(
                    checkRequired("exempt", exempt),
                    additionalProperties.toImmutable(),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Customer && id == other.id && additionalEmails == other.additionalEmails && autoCollection == other.autoCollection && balance == other.balance && billingAddress == other.billingAddress && createdAt == other.createdAt && currency == other.currency && email == other.email && emailDelivery == other.emailDelivery && exemptFromAutomatedTax == other.exemptFromAutomatedTax && externalCustomerId == other.externalCustomerId && hierarchy == other.hierarchy && metadata == other.metadata && name == other.name && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && portalUrl == other.portalUrl && shippingAddress == other.shippingAddress && taxId == other.taxId && timezone == other.timezone && accountingSyncConfiguration == other.accountingSyncConfiguration && reportingConfiguration == other.reportingConfiguration && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, additionalEmails, autoCollection, balance, billingAddress, createdAt, currency, email, emailDelivery, exemptFromAutomatedTax, externalCustomerId, hierarchy, metadata, name, paymentProvider, paymentProviderId, portalUrl, shippingAddress, taxId, timezone, accountingSyncConfiguration, reportingConfiguration, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Customer{id=$id, additionalEmails=$additionalEmails, autoCollection=$autoCollection, balance=$balance, billingAddress=$billingAddress, createdAt=$createdAt, currency=$currency, email=$email, emailDelivery=$emailDelivery, exemptFromAutomatedTax=$exemptFromAutomatedTax, externalCustomerId=$externalCustomerId, hierarchy=$hierarchy, metadata=$metadata, name=$name, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, portalUrl=$portalUrl, shippingAddress=$shippingAddress, taxId=$taxId, timezone=$timezone, accountingSyncConfiguration=$accountingSyncConfiguration, reportingConfiguration=$reportingConfiguration, additionalProperties=$additionalProperties}"
}
