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

/** #InvoiceApiResourceWithoutLineItems */
class InvoiceListSummaryResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amountDue: JsonField<String>,
    private val autoCollection: JsonField<AutoCollection>,
    private val billingAddress: JsonField<Address>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val creditNotes: JsonField<List<CreditNote>>,
    private val currency: JsonField<String>,
    private val customer: JsonField<CustomerMinified>,
    private val customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>>,
    private val customerTaxId: JsonField<CustomerTaxId>,
    private val dueDate: JsonField<OffsetDateTime>,
    private val eligibleToIssueAt: JsonField<OffsetDateTime>,
    private val hostedInvoiceUrl: JsonField<String>,
    private val invoiceDate: JsonField<OffsetDateTime>,
    private val invoiceNumber: JsonField<String>,
    private val invoicePdf: JsonField<String>,
    private val invoiceSource: JsonField<InvoiceSource>,
    private val issueFailedAt: JsonField<OffsetDateTime>,
    private val issuedAt: JsonField<OffsetDateTime>,
    private val memo: JsonField<String>,
    private val metadata: JsonField<Metadata>,
    private val paidAt: JsonField<OffsetDateTime>,
    private val paymentAttempts: JsonField<List<PaymentAttempt>>,
    private val paymentFailedAt: JsonField<OffsetDateTime>,
    private val paymentStartedAt: JsonField<OffsetDateTime>,
    private val scheduledIssueAt: JsonField<OffsetDateTime>,
    private val shippingAddress: JsonField<Address>,
    private val status: JsonField<Status>,
    private val subscription: JsonField<SubscriptionMinified>,
    private val syncFailedAt: JsonField<OffsetDateTime>,
    private val total: JsonField<String>,
    private val voidedAt: JsonField<OffsetDateTime>,
    private val willAutoIssue: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount_due") @ExcludeMissing amountDue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auto_collection")
        @ExcludeMissing
        autoCollection: JsonField<AutoCollection> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        billingAddress: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("credit_notes")
        @ExcludeMissing
        creditNotes: JsonField<List<CreditNote>> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerMinified> = JsonMissing.of(),
        @JsonProperty("customer_balance_transactions")
        @ExcludeMissing
        customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>> = JsonMissing.of(),
        @JsonProperty("customer_tax_id")
        @ExcludeMissing
        customerTaxId: JsonField<CustomerTaxId> = JsonMissing.of(),
        @JsonProperty("due_date")
        @ExcludeMissing
        dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("eligible_to_issue_at")
        @ExcludeMissing
        eligibleToIssueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("hosted_invoice_url")
        @ExcludeMissing
        hostedInvoiceUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_date")
        @ExcludeMissing
        invoiceDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("invoice_number")
        @ExcludeMissing
        invoiceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_pdf")
        @ExcludeMissing
        invoicePdf: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_source")
        @ExcludeMissing
        invoiceSource: JsonField<InvoiceSource> = JsonMissing.of(),
        @JsonProperty("issue_failed_at")
        @ExcludeMissing
        issueFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("issued_at")
        @ExcludeMissing
        issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("paid_at")
        @ExcludeMissing
        paidAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_attempts")
        @ExcludeMissing
        paymentAttempts: JsonField<List<PaymentAttempt>> = JsonMissing.of(),
        @JsonProperty("payment_failed_at")
        @ExcludeMissing
        paymentFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payment_started_at")
        @ExcludeMissing
        paymentStartedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("scheduled_issue_at")
        @ExcludeMissing
        scheduledIssueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("shipping_address")
        @ExcludeMissing
        shippingAddress: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("subscription")
        @ExcludeMissing
        subscription: JsonField<SubscriptionMinified> = JsonMissing.of(),
        @JsonProperty("sync_failed_at")
        @ExcludeMissing
        syncFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
        @JsonProperty("voided_at")
        @ExcludeMissing
        voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("will_auto_issue")
        @ExcludeMissing
        willAutoIssue: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        id,
        amountDue,
        autoCollection,
        billingAddress,
        createdAt,
        creditNotes,
        currency,
        customer,
        customerBalanceTransactions,
        customerTaxId,
        dueDate,
        eligibleToIssueAt,
        hostedInvoiceUrl,
        invoiceDate,
        invoiceNumber,
        invoicePdf,
        invoiceSource,
        issueFailedAt,
        issuedAt,
        memo,
        metadata,
        paidAt,
        paymentAttempts,
        paymentFailedAt,
        paymentStartedAt,
        scheduledIssueAt,
        shippingAddress,
        status,
        subscription,
        syncFailedAt,
        total,
        voidedAt,
        willAutoIssue,
        mutableMapOf(),
    )

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * This is the final amount required to be charged to the customer and reflects the application
     * of the customer balance to the `total` of the invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amountDue(): String = amountDue.getRequired("amount_due")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun autoCollection(): AutoCollection = autoCollection.getRequired("auto_collection")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun billingAddress(): Address? = billingAddress.getNullable("billing_address")

    /**
     * The creation time of the resource in Orb.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * A list of credit notes associated with the invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditNotes(): List<CreditNote> = creditNotes.getRequired("credit_notes")

    /**
     * An ISO 4217 currency string or `credits`
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerMinified = customer.getRequired("customer")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerBalanceTransactions(): List<CustomerBalanceTransaction> =
        customerBalanceTransactions.getRequired("customer_balance_transactions")

    /**
     * Tax IDs are commonly required to be displayed on customer invoices, which are added to the
     * headers of invoices.
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
     * |Finland               |`eu_vat`    |European VAT Number                                                                                    |
     * |France                |`eu_vat`    |European VAT Number                                                                                    |
     * |Georgia               |`ge_vat`    |Georgian VAT                                                                                           |
     * |Germany               |`de_stn`    |German Tax Number (Steuernummer)                                                                       |
     * |Germany               |`eu_vat`    |European VAT Number                                                                                    |
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
     * |Peru                  |`pe_ruc`    |Peruvian RUC Number                                                                                    |
     * |Philippines           |`ph_tin`    |Philippines Tax Identification Number                                                                  |
     * |Poland                |`eu_vat`    |European VAT Number                                                                                    |
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
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun customerTaxId(): CustomerTaxId? = customerTaxId.getNullable("customer_tax_id")

    /**
     * When the invoice payment is due. The due date is null if the invoice is not yet finalized.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun dueDate(): OffsetDateTime? = dueDate.getNullable("due_date")

    /**
     * If the invoice has a status of `draft`, this will be the time that the invoice will be
     * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice will
     * automatically begin issuing at this time.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun eligibleToIssueAt(): OffsetDateTime? = eligibleToIssueAt.getNullable("eligible_to_issue_at")

    /**
     * A URL for the customer-facing invoice portal. This URL expires 30 days after the invoice's
     * due date, or 60 days after being re-generated through the UI.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun hostedInvoiceUrl(): String? = hostedInvoiceUrl.getNullable("hosted_invoice_url")

    /**
     * The scheduled date of the invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceDate(): OffsetDateTime = invoiceDate.getRequired("invoice_date")

    /**
     * Automatically generated invoice number to help track and reconcile invoices. Invoice numbers
     * have a prefix such as `RFOBWG`. These can be sequential per account or customer.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

    /**
     * The link to download the PDF representation of the `Invoice`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoicePdf(): String? = invoicePdf.getNullable("invoice_pdf")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invoiceSource(): InvoiceSource = invoiceSource.getRequired("invoice_source")

    /**
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is
     * now in a different state.)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun issueFailedAt(): OffsetDateTime? = issueFailedAt.getNullable("issue_failed_at")

    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it
     * is now in a different state.)
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun issuedAt(): OffsetDateTime? = issuedAt.getNullable("issued_at")

    /**
     * Free-form text which is available on the invoice PDF and the Orb invoice portal.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun memo(): String? = memo.getNullable("memo")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paidAt(): OffsetDateTime? = paidAt.getNullable("paid_at")

    /**
     * A list of payment attempts associated with the invoice
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentAttempts(): List<PaymentAttempt> = paymentAttempts.getRequired("payment_attempts")

    /**
     * If payment was attempted on this invoice but failed, this will be the time of the most recent
     * attempt.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentFailedAt(): OffsetDateTime? = paymentFailedAt.getNullable("payment_failed_at")

    /**
     * If payment was attempted on this invoice, this will be the start time of the most recent
     * attempt. This field is especially useful for delayed-notification payment mechanisms (like
     * bank transfers), where payment can take 3 days or more.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentStartedAt(): OffsetDateTime? = paymentStartedAt.getNullable("payment_started_at")

    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be
     * issued.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun scheduledIssueAt(): OffsetDateTime? = scheduledIssueAt.getNullable("scheduled_issue_at")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun shippingAddress(): Address? = shippingAddress.getNullable("shipping_address")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun subscription(): SubscriptionMinified? = subscription.getNullable("subscription")

    /**
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync
     * was attempted. This field will always be `null` for invoices using Orb Invoicing.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun syncFailedAt(): OffsetDateTime? = syncFailedAt.getNullable("sync_failed_at")

    /**
     * The total after any minimums and discounts have been applied.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): String = total.getRequired("total")

    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun voidedAt(): OffsetDateTime? = voidedAt.getNullable("voided_at")

    /**
     * This is true if the invoice will be automatically issued in the future, and false otherwise.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun willAutoIssue(): Boolean = willAutoIssue.getRequired("will_auto_issue")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amountDue].
     *
     * Unlike [amountDue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<String> = amountDue

    /**
     * Returns the raw JSON value of [autoCollection].
     *
     * Unlike [autoCollection], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<AutoCollection> = autoCollection

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<Address> = billingAddress

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [creditNotes].
     *
     * Unlike [creditNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_notes")
    @ExcludeMissing
    fun _creditNotes(): JsonField<List<CreditNote>> = creditNotes

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerMinified> = customer

    /**
     * Returns the raw JSON value of [customerBalanceTransactions].
     *
     * Unlike [customerBalanceTransactions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("customer_balance_transactions")
    @ExcludeMissing
    fun _customerBalanceTransactions(): JsonField<List<CustomerBalanceTransaction>> =
        customerBalanceTransactions

    /**
     * Returns the raw JSON value of [customerTaxId].
     *
     * Unlike [customerTaxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_tax_id")
    @ExcludeMissing
    fun _customerTaxId(): JsonField<CustomerTaxId> = customerTaxId

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<OffsetDateTime> = dueDate

    /**
     * Returns the raw JSON value of [eligibleToIssueAt].
     *
     * Unlike [eligibleToIssueAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("eligible_to_issue_at")
    @ExcludeMissing
    fun _eligibleToIssueAt(): JsonField<OffsetDateTime> = eligibleToIssueAt

    /**
     * Returns the raw JSON value of [hostedInvoiceUrl].
     *
     * Unlike [hostedInvoiceUrl], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("hosted_invoice_url")
    @ExcludeMissing
    fun _hostedInvoiceUrl(): JsonField<String> = hostedInvoiceUrl

    /**
     * Returns the raw JSON value of [invoiceDate].
     *
     * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_date")
    @ExcludeMissing
    fun _invoiceDate(): JsonField<OffsetDateTime> = invoiceDate

    /**
     * Returns the raw JSON value of [invoiceNumber].
     *
     * Unlike [invoiceNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_number")
    @ExcludeMissing
    fun _invoiceNumber(): JsonField<String> = invoiceNumber

    /**
     * Returns the raw JSON value of [invoicePdf].
     *
     * Unlike [invoicePdf], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_pdf") @ExcludeMissing fun _invoicePdf(): JsonField<String> = invoicePdf

    /**
     * Returns the raw JSON value of [invoiceSource].
     *
     * Unlike [invoiceSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invoice_source")
    @ExcludeMissing
    fun _invoiceSource(): JsonField<InvoiceSource> = invoiceSource

    /**
     * Returns the raw JSON value of [issueFailedAt].
     *
     * Unlike [issueFailedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issue_failed_at")
    @ExcludeMissing
    fun _issueFailedAt(): JsonField<OffsetDateTime> = issueFailedAt

    /**
     * Returns the raw JSON value of [issuedAt].
     *
     * Unlike [issuedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

    /**
     * Returns the raw JSON value of [memo].
     *
     * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [paidAt].
     *
     * Unlike [paidAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paid_at") @ExcludeMissing fun _paidAt(): JsonField<OffsetDateTime> = paidAt

    /**
     * Returns the raw JSON value of [paymentAttempts].
     *
     * Unlike [paymentAttempts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_attempts")
    @ExcludeMissing
    fun _paymentAttempts(): JsonField<List<PaymentAttempt>> = paymentAttempts

    /**
     * Returns the raw JSON value of [paymentFailedAt].
     *
     * Unlike [paymentFailedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_failed_at")
    @ExcludeMissing
    fun _paymentFailedAt(): JsonField<OffsetDateTime> = paymentFailedAt

    /**
     * Returns the raw JSON value of [paymentStartedAt].
     *
     * Unlike [paymentStartedAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_started_at")
    @ExcludeMissing
    fun _paymentStartedAt(): JsonField<OffsetDateTime> = paymentStartedAt

    /**
     * Returns the raw JSON value of [scheduledIssueAt].
     *
     * Unlike [scheduledIssueAt], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("scheduled_issue_at")
    @ExcludeMissing
    fun _scheduledIssueAt(): JsonField<OffsetDateTime> = scheduledIssueAt

    /**
     * Returns the raw JSON value of [shippingAddress].
     *
     * Unlike [shippingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("shipping_address")
    @ExcludeMissing
    fun _shippingAddress(): JsonField<Address> = shippingAddress

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [subscription].
     *
     * Unlike [subscription], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<SubscriptionMinified> = subscription

    /**
     * Returns the raw JSON value of [syncFailedAt].
     *
     * Unlike [syncFailedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sync_failed_at")
    @ExcludeMissing
    fun _syncFailedAt(): JsonField<OffsetDateTime> = syncFailedAt

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    /**
     * Returns the raw JSON value of [voidedAt].
     *
     * Unlike [voidedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

    /**
     * Returns the raw JSON value of [willAutoIssue].
     *
     * Unlike [willAutoIssue], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("will_auto_issue")
    @ExcludeMissing
    fun _willAutoIssue(): JsonField<Boolean> = willAutoIssue

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
         * Returns a mutable builder for constructing an instance of [InvoiceListSummaryResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amountDue()
         * .autoCollection()
         * .billingAddress()
         * .createdAt()
         * .creditNotes()
         * .currency()
         * .customer()
         * .customerBalanceTransactions()
         * .customerTaxId()
         * .dueDate()
         * .eligibleToIssueAt()
         * .hostedInvoiceUrl()
         * .invoiceDate()
         * .invoiceNumber()
         * .invoicePdf()
         * .invoiceSource()
         * .issueFailedAt()
         * .issuedAt()
         * .memo()
         * .metadata()
         * .paidAt()
         * .paymentAttempts()
         * .paymentFailedAt()
         * .paymentStartedAt()
         * .scheduledIssueAt()
         * .shippingAddress()
         * .status()
         * .subscription()
         * .syncFailedAt()
         * .total()
         * .voidedAt()
         * .willAutoIssue()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceListSummaryResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amountDue: JsonField<String>? = null
        private var autoCollection: JsonField<AutoCollection>? = null
        private var billingAddress: JsonField<Address>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditNotes: JsonField<MutableList<CreditNote>>? = null
        private var currency: JsonField<String>? = null
        private var customer: JsonField<CustomerMinified>? = null
        private var customerBalanceTransactions:
            JsonField<MutableList<CustomerBalanceTransaction>>? =
            null
        private var customerTaxId: JsonField<CustomerTaxId>? = null
        private var dueDate: JsonField<OffsetDateTime>? = null
        private var eligibleToIssueAt: JsonField<OffsetDateTime>? = null
        private var hostedInvoiceUrl: JsonField<String>? = null
        private var invoiceDate: JsonField<OffsetDateTime>? = null
        private var invoiceNumber: JsonField<String>? = null
        private var invoicePdf: JsonField<String>? = null
        private var invoiceSource: JsonField<InvoiceSource>? = null
        private var issueFailedAt: JsonField<OffsetDateTime>? = null
        private var issuedAt: JsonField<OffsetDateTime>? = null
        private var memo: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paidAt: JsonField<OffsetDateTime>? = null
        private var paymentAttempts: JsonField<MutableList<PaymentAttempt>>? = null
        private var paymentFailedAt: JsonField<OffsetDateTime>? = null
        private var paymentStartedAt: JsonField<OffsetDateTime>? = null
        private var scheduledIssueAt: JsonField<OffsetDateTime>? = null
        private var shippingAddress: JsonField<Address>? = null
        private var status: JsonField<Status>? = null
        private var subscription: JsonField<SubscriptionMinified>? = null
        private var syncFailedAt: JsonField<OffsetDateTime>? = null
        private var total: JsonField<String>? = null
        private var voidedAt: JsonField<OffsetDateTime>? = null
        private var willAutoIssue: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceListSummaryResponse: InvoiceListSummaryResponse) = apply {
            id = invoiceListSummaryResponse.id
            amountDue = invoiceListSummaryResponse.amountDue
            autoCollection = invoiceListSummaryResponse.autoCollection
            billingAddress = invoiceListSummaryResponse.billingAddress
            createdAt = invoiceListSummaryResponse.createdAt
            creditNotes = invoiceListSummaryResponse.creditNotes.map { it.toMutableList() }
            currency = invoiceListSummaryResponse.currency
            customer = invoiceListSummaryResponse.customer
            customerBalanceTransactions =
                invoiceListSummaryResponse.customerBalanceTransactions.map { it.toMutableList() }
            customerTaxId = invoiceListSummaryResponse.customerTaxId
            dueDate = invoiceListSummaryResponse.dueDate
            eligibleToIssueAt = invoiceListSummaryResponse.eligibleToIssueAt
            hostedInvoiceUrl = invoiceListSummaryResponse.hostedInvoiceUrl
            invoiceDate = invoiceListSummaryResponse.invoiceDate
            invoiceNumber = invoiceListSummaryResponse.invoiceNumber
            invoicePdf = invoiceListSummaryResponse.invoicePdf
            invoiceSource = invoiceListSummaryResponse.invoiceSource
            issueFailedAt = invoiceListSummaryResponse.issueFailedAt
            issuedAt = invoiceListSummaryResponse.issuedAt
            memo = invoiceListSummaryResponse.memo
            metadata = invoiceListSummaryResponse.metadata
            paidAt = invoiceListSummaryResponse.paidAt
            paymentAttempts = invoiceListSummaryResponse.paymentAttempts.map { it.toMutableList() }
            paymentFailedAt = invoiceListSummaryResponse.paymentFailedAt
            paymentStartedAt = invoiceListSummaryResponse.paymentStartedAt
            scheduledIssueAt = invoiceListSummaryResponse.scheduledIssueAt
            shippingAddress = invoiceListSummaryResponse.shippingAddress
            status = invoiceListSummaryResponse.status
            subscription = invoiceListSummaryResponse.subscription
            syncFailedAt = invoiceListSummaryResponse.syncFailedAt
            total = invoiceListSummaryResponse.total
            voidedAt = invoiceListSummaryResponse.voidedAt
            willAutoIssue = invoiceListSummaryResponse.willAutoIssue
            additionalProperties = invoiceListSummaryResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * This is the final amount required to be charged to the customer and reflects the
         * application of the customer balance to the `total` of the invoice.
         */
        fun amountDue(amountDue: String) = amountDue(JsonField.of(amountDue))

        /**
         * Sets [Builder.amountDue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountDue] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountDue(amountDue: JsonField<String>) = apply { this.amountDue = amountDue }

        fun autoCollection(autoCollection: AutoCollection) =
            autoCollection(JsonField.of(autoCollection))

        /**
         * Sets [Builder.autoCollection] to an arbitrary JSON value.
         *
         * You should usually call [Builder.autoCollection] with a well-typed [AutoCollection] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun autoCollection(autoCollection: JsonField<AutoCollection>) = apply {
            this.autoCollection = autoCollection
        }

        fun billingAddress(billingAddress: Address?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [Address] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<Address>) = apply {
            this.billingAddress = billingAddress
        }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A list of credit notes associated with the invoice */
        fun creditNotes(creditNotes: List<CreditNote>) = creditNotes(JsonField.of(creditNotes))

        /**
         * Sets [Builder.creditNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditNotes] with a well-typed `List<CreditNote>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditNotes(creditNotes: JsonField<List<CreditNote>>) = apply {
            this.creditNotes = creditNotes.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditNote] to [creditNotes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditNote(creditNote: CreditNote) = apply {
            creditNotes =
                (creditNotes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditNotes", it).add(creditNote)
                }
        }

        /** An ISO 4217 currency string or `credits` */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun customer(customer: CustomerMinified) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [CustomerMinified] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customer(customer: JsonField<CustomerMinified>) = apply { this.customer = customer }

        fun customerBalanceTransactions(
            customerBalanceTransactions: List<CustomerBalanceTransaction>
        ) = customerBalanceTransactions(JsonField.of(customerBalanceTransactions))

        /**
         * Sets [Builder.customerBalanceTransactions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerBalanceTransactions] with a well-typed
         * `List<CustomerBalanceTransaction>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun customerBalanceTransactions(
            customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>>
        ) = apply {
            this.customerBalanceTransactions =
                customerBalanceTransactions.map { it.toMutableList() }
        }

        /**
         * Adds a single [CustomerBalanceTransaction] to [customerBalanceTransactions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomerBalanceTransaction(customerBalanceTransaction: CustomerBalanceTransaction) =
            apply {
                customerBalanceTransactions =
                    (customerBalanceTransactions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customerBalanceTransactions", it)
                            .add(customerBalanceTransaction)
                    }
            }

        /**
         * Tax IDs are commonly required to be displayed on customer invoices, which are added to
         * the headers of invoices.
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
         * |Finland               |`eu_vat`    |European VAT Number                                                                                    |
         * |France                |`eu_vat`    |European VAT Number                                                                                    |
         * |Georgia               |`ge_vat`    |Georgian VAT                                                                                           |
         * |Germany               |`de_stn`    |German Tax Number (Steuernummer)                                                                       |
         * |Germany               |`eu_vat`    |European VAT Number                                                                                    |
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
         * |Peru                  |`pe_ruc`    |Peruvian RUC Number                                                                                    |
         * |Philippines           |`ph_tin`    |Philippines Tax Identification Number                                                                  |
         * |Poland                |`eu_vat`    |European VAT Number                                                                                    |
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
        fun customerTaxId(customerTaxId: CustomerTaxId?) =
            customerTaxId(JsonField.ofNullable(customerTaxId))

        /**
         * Sets [Builder.customerTaxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerTaxId] with a well-typed [CustomerTaxId] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerTaxId(customerTaxId: JsonField<CustomerTaxId>) = apply {
            this.customerTaxId = customerTaxId
        }

        /**
         * When the invoice payment is due. The due date is null if the invoice is not yet
         * finalized.
         */
        fun dueDate(dueDate: OffsetDateTime?) = dueDate(JsonField.ofNullable(dueDate))

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

        /**
         * If the invoice has a status of `draft`, this will be the time that the invoice will be
         * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice
         * will automatically begin issuing at this time.
         */
        fun eligibleToIssueAt(eligibleToIssueAt: OffsetDateTime?) =
            eligibleToIssueAt(JsonField.ofNullable(eligibleToIssueAt))

        /**
         * Sets [Builder.eligibleToIssueAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eligibleToIssueAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun eligibleToIssueAt(eligibleToIssueAt: JsonField<OffsetDateTime>) = apply {
            this.eligibleToIssueAt = eligibleToIssueAt
        }

        /**
         * A URL for the customer-facing invoice portal. This URL expires 30 days after the
         * invoice's due date, or 60 days after being re-generated through the UI.
         */
        fun hostedInvoiceUrl(hostedInvoiceUrl: String?) =
            hostedInvoiceUrl(JsonField.ofNullable(hostedInvoiceUrl))

        /**
         * Sets [Builder.hostedInvoiceUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hostedInvoiceUrl] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun hostedInvoiceUrl(hostedInvoiceUrl: JsonField<String>) = apply {
            this.hostedInvoiceUrl = hostedInvoiceUrl
        }

        /** The scheduled date of the invoice */
        fun invoiceDate(invoiceDate: OffsetDateTime) = invoiceDate(JsonField.of(invoiceDate))

        /**
         * Sets [Builder.invoiceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceDate(invoiceDate: JsonField<OffsetDateTime>) = apply {
            this.invoiceDate = invoiceDate
        }

        /**
         * Automatically generated invoice number to help track and reconcile invoices. Invoice
         * numbers have a prefix such as `RFOBWG`. These can be sequential per account or customer.
         */
        fun invoiceNumber(invoiceNumber: String) = invoiceNumber(JsonField.of(invoiceNumber))

        /**
         * Sets [Builder.invoiceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
            this.invoiceNumber = invoiceNumber
        }

        /** The link to download the PDF representation of the `Invoice`. */
        fun invoicePdf(invoicePdf: String?) = invoicePdf(JsonField.ofNullable(invoicePdf))

        /**
         * Sets [Builder.invoicePdf] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoicePdf] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun invoicePdf(invoicePdf: JsonField<String>) = apply { this.invoicePdf = invoicePdf }

        fun invoiceSource(invoiceSource: InvoiceSource) = invoiceSource(JsonField.of(invoiceSource))

        /**
         * Sets [Builder.invoiceSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceSource] with a well-typed [InvoiceSource] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceSource(invoiceSource: JsonField<InvoiceSource>) = apply {
            this.invoiceSource = invoiceSource
        }

        /**
         * If the invoice failed to issue, this will be the last time it failed to issue (even if it
         * is now in a different state.)
         */
        fun issueFailedAt(issueFailedAt: OffsetDateTime?) =
            issueFailedAt(JsonField.ofNullable(issueFailedAt))

        /**
         * Sets [Builder.issueFailedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issueFailedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issueFailedAt(issueFailedAt: JsonField<OffsetDateTime>) = apply {
            this.issueFailedAt = issueFailedAt
        }

        /**
         * If the invoice has been issued, this will be the time it transitioned to `issued` (even
         * if it is now in a different state.)
         */
        fun issuedAt(issuedAt: OffsetDateTime?) = issuedAt(JsonField.ofNullable(issuedAt))

        /**
         * Sets [Builder.issuedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /**
         * Sets [Builder.memo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.memo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /**
         * User specified key-value pairs for the resource. If not present, this defaults to an
         * empty dictionary. Individual keys can be removed by setting the value to `null`, and the
         * entire metadata mapping can be cleared by setting `metadata` to `null`.
         */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        fun paidAt(paidAt: OffsetDateTime?) = paidAt(JsonField.ofNullable(paidAt))

        /**
         * Sets [Builder.paidAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paidAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paidAt(paidAt: JsonField<OffsetDateTime>) = apply { this.paidAt = paidAt }

        /** A list of payment attempts associated with the invoice */
        fun paymentAttempts(paymentAttempts: List<PaymentAttempt>) =
            paymentAttempts(JsonField.of(paymentAttempts))

        /**
         * Sets [Builder.paymentAttempts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentAttempts] with a well-typed
         * `List<PaymentAttempt>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun paymentAttempts(paymentAttempts: JsonField<List<PaymentAttempt>>) = apply {
            this.paymentAttempts = paymentAttempts.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentAttempt] to [paymentAttempts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentAttempt(paymentAttempt: PaymentAttempt) = apply {
            paymentAttempts =
                (paymentAttempts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentAttempts", it).add(paymentAttempt)
                }
        }

        /**
         * If payment was attempted on this invoice but failed, this will be the time of the most
         * recent attempt.
         */
        fun paymentFailedAt(paymentFailedAt: OffsetDateTime?) =
            paymentFailedAt(JsonField.ofNullable(paymentFailedAt))

        /**
         * Sets [Builder.paymentFailedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentFailedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentFailedAt(paymentFailedAt: JsonField<OffsetDateTime>) = apply {
            this.paymentFailedAt = paymentFailedAt
        }

        /**
         * If payment was attempted on this invoice, this will be the start time of the most recent
         * attempt. This field is especially useful for delayed-notification payment mechanisms
         * (like bank transfers), where payment can take 3 days or more.
         */
        fun paymentStartedAt(paymentStartedAt: OffsetDateTime?) =
            paymentStartedAt(JsonField.ofNullable(paymentStartedAt))

        /**
         * Sets [Builder.paymentStartedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentStartedAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentStartedAt(paymentStartedAt: JsonField<OffsetDateTime>) = apply {
            this.paymentStartedAt = paymentStartedAt
        }

        /**
         * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to
         * be issued.
         */
        fun scheduledIssueAt(scheduledIssueAt: OffsetDateTime?) =
            scheduledIssueAt(JsonField.ofNullable(scheduledIssueAt))

        /**
         * Sets [Builder.scheduledIssueAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledIssueAt] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun scheduledIssueAt(scheduledIssueAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledIssueAt = scheduledIssueAt
        }

        fun shippingAddress(shippingAddress: Address?) =
            shippingAddress(JsonField.ofNullable(shippingAddress))

        /**
         * Sets [Builder.shippingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.shippingAddress] with a well-typed [Address] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun shippingAddress(shippingAddress: JsonField<Address>) = apply {
            this.shippingAddress = shippingAddress
        }

        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subscription(subscription: SubscriptionMinified?) =
            subscription(JsonField.ofNullable(subscription))

        /**
         * Sets [Builder.subscription] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscription] with a well-typed [SubscriptionMinified]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subscription(subscription: JsonField<SubscriptionMinified>) = apply {
            this.subscription = subscription
        }

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        fun syncFailedAt(syncFailedAt: OffsetDateTime?) =
            syncFailedAt(JsonField.ofNullable(syncFailedAt))

        /**
         * Sets [Builder.syncFailedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.syncFailedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun syncFailedAt(syncFailedAt: JsonField<OffsetDateTime>) = apply {
            this.syncFailedAt = syncFailedAt
        }

        /** The total after any minimums and discounts have been applied. */
        fun total(total: String) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<String>) = apply { this.total = total }

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

        /**
         * Sets [Builder.voidedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

        /**
         * This is true if the invoice will be automatically issued in the future, and false
         * otherwise.
         */
        fun willAutoIssue(willAutoIssue: Boolean) = willAutoIssue(JsonField.of(willAutoIssue))

        /**
         * Sets [Builder.willAutoIssue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.willAutoIssue] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun willAutoIssue(willAutoIssue: JsonField<Boolean>) = apply {
            this.willAutoIssue = willAutoIssue
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
         * Returns an immutable instance of [InvoiceListSummaryResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amountDue()
         * .autoCollection()
         * .billingAddress()
         * .createdAt()
         * .creditNotes()
         * .currency()
         * .customer()
         * .customerBalanceTransactions()
         * .customerTaxId()
         * .dueDate()
         * .eligibleToIssueAt()
         * .hostedInvoiceUrl()
         * .invoiceDate()
         * .invoiceNumber()
         * .invoicePdf()
         * .invoiceSource()
         * .issueFailedAt()
         * .issuedAt()
         * .memo()
         * .metadata()
         * .paidAt()
         * .paymentAttempts()
         * .paymentFailedAt()
         * .paymentStartedAt()
         * .scheduledIssueAt()
         * .shippingAddress()
         * .status()
         * .subscription()
         * .syncFailedAt()
         * .total()
         * .voidedAt()
         * .willAutoIssue()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceListSummaryResponse =
            InvoiceListSummaryResponse(
                checkRequired("id", id),
                checkRequired("amountDue", amountDue),
                checkRequired("autoCollection", autoCollection),
                checkRequired("billingAddress", billingAddress),
                checkRequired("createdAt", createdAt),
                checkRequired("creditNotes", creditNotes).map { it.toImmutable() },
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("customerBalanceTransactions", customerBalanceTransactions).map {
                    it.toImmutable()
                },
                checkRequired("customerTaxId", customerTaxId),
                checkRequired("dueDate", dueDate),
                checkRequired("eligibleToIssueAt", eligibleToIssueAt),
                checkRequired("hostedInvoiceUrl", hostedInvoiceUrl),
                checkRequired("invoiceDate", invoiceDate),
                checkRequired("invoiceNumber", invoiceNumber),
                checkRequired("invoicePdf", invoicePdf),
                checkRequired("invoiceSource", invoiceSource),
                checkRequired("issueFailedAt", issueFailedAt),
                checkRequired("issuedAt", issuedAt),
                checkRequired("memo", memo),
                checkRequired("metadata", metadata),
                checkRequired("paidAt", paidAt),
                checkRequired("paymentAttempts", paymentAttempts).map { it.toImmutable() },
                checkRequired("paymentFailedAt", paymentFailedAt),
                checkRequired("paymentStartedAt", paymentStartedAt),
                checkRequired("scheduledIssueAt", scheduledIssueAt),
                checkRequired("shippingAddress", shippingAddress),
                checkRequired("status", status),
                checkRequired("subscription", subscription),
                checkRequired("syncFailedAt", syncFailedAt),
                checkRequired("total", total),
                checkRequired("voidedAt", voidedAt),
                checkRequired("willAutoIssue", willAutoIssue),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InvoiceListSummaryResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        amountDue()
        autoCollection().validate()
        billingAddress()?.validate()
        createdAt()
        creditNotes().forEach { it.validate() }
        currency()
        customer().validate()
        customerBalanceTransactions().forEach { it.validate() }
        customerTaxId()?.validate()
        dueDate()
        eligibleToIssueAt()
        hostedInvoiceUrl()
        invoiceDate()
        invoiceNumber()
        invoicePdf()
        invoiceSource().validate()
        issueFailedAt()
        issuedAt()
        memo()
        metadata().validate()
        paidAt()
        paymentAttempts().forEach { it.validate() }
        paymentFailedAt()
        paymentStartedAt()
        scheduledIssueAt()
        shippingAddress()?.validate()
        status().validate()
        subscription()?.validate()
        syncFailedAt()
        total()
        voidedAt()
        willAutoIssue()
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
            (if (amountDue.asKnown() == null) 0 else 1) +
            (autoCollection.asKnown()?.validity() ?: 0) +
            (billingAddress.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (creditNotes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (currency.asKnown() == null) 0 else 1) +
            (customer.asKnown()?.validity() ?: 0) +
            (customerBalanceTransactions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (customerTaxId.asKnown()?.validity() ?: 0) +
            (if (dueDate.asKnown() == null) 0 else 1) +
            (if (eligibleToIssueAt.asKnown() == null) 0 else 1) +
            (if (hostedInvoiceUrl.asKnown() == null) 0 else 1) +
            (if (invoiceDate.asKnown() == null) 0 else 1) +
            (if (invoiceNumber.asKnown() == null) 0 else 1) +
            (if (invoicePdf.asKnown() == null) 0 else 1) +
            (invoiceSource.asKnown()?.validity() ?: 0) +
            (if (issueFailedAt.asKnown() == null) 0 else 1) +
            (if (issuedAt.asKnown() == null) 0 else 1) +
            (if (memo.asKnown() == null) 0 else 1) +
            (metadata.asKnown()?.validity() ?: 0) +
            (if (paidAt.asKnown() == null) 0 else 1) +
            (paymentAttempts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (paymentFailedAt.asKnown() == null) 0 else 1) +
            (if (paymentStartedAt.asKnown() == null) 0 else 1) +
            (if (scheduledIssueAt.asKnown() == null) 0 else 1) +
            (shippingAddress.asKnown()?.validity() ?: 0) +
            (status.asKnown()?.validity() ?: 0) +
            (subscription.asKnown()?.validity() ?: 0) +
            (if (syncFailedAt.asKnown() == null) 0 else 1) +
            (if (total.asKnown() == null) 0 else 1) +
            (if (voidedAt.asKnown() == null) 0 else 1) +
            (if (willAutoIssue.asKnown() == null) 0 else 1)

    class AutoCollection
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val enabled: JsonField<Boolean>,
        private val nextAttemptAt: JsonField<OffsetDateTime>,
        private val numAttempts: JsonField<Long>,
        private val previouslyAttemptedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("enabled") @ExcludeMissing enabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("next_attempt_at")
            @ExcludeMissing
            nextAttemptAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("num_attempts")
            @ExcludeMissing
            numAttempts: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("previously_attempted_at")
            @ExcludeMissing
            previouslyAttemptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(enabled, nextAttemptAt, numAttempts, previouslyAttemptedAt, mutableMapOf())

        /**
         * True only if auto-collection is enabled for this invoice.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun enabled(): Boolean? = enabled.getNullable("enabled")

        /**
         * If the invoice is scheduled for auto-collection, this field will reflect when the next
         * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for
         * this invoice, this field will be `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun nextAttemptAt(): OffsetDateTime? = nextAttemptAt.getNullable("next_attempt_at")

        /**
         * Number of auto-collection payment attempts.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun numAttempts(): Long? = numAttempts.getNullable("num_attempts")

        /**
         * If Orb has ever attempted payment auto-collection for this invoice, this field will
         * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be
         * used to tell whether the invoice is currently in dunning (that is,
         * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
         * dunning has been exhausted (`previously_attempted_at` is non-null, but
         * `next_attempt_time` is null).
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previouslyAttemptedAt(): OffsetDateTime? =
            previouslyAttemptedAt.getNullable("previously_attempted_at")

        /**
         * Returns the raw JSON value of [enabled].
         *
         * Unlike [enabled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled(): JsonField<Boolean> = enabled

        /**
         * Returns the raw JSON value of [nextAttemptAt].
         *
         * Unlike [nextAttemptAt], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("next_attempt_at")
        @ExcludeMissing
        fun _nextAttemptAt(): JsonField<OffsetDateTime> = nextAttemptAt

        /**
         * Returns the raw JSON value of [numAttempts].
         *
         * Unlike [numAttempts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("num_attempts")
        @ExcludeMissing
        fun _numAttempts(): JsonField<Long> = numAttempts

        /**
         * Returns the raw JSON value of [previouslyAttemptedAt].
         *
         * Unlike [previouslyAttemptedAt], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("previously_attempted_at")
        @ExcludeMissing
        fun _previouslyAttemptedAt(): JsonField<OffsetDateTime> = previouslyAttemptedAt

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
             * Returns a mutable builder for constructing an instance of [AutoCollection].
             *
             * The following fields are required:
             * ```kotlin
             * .enabled()
             * .nextAttemptAt()
             * .numAttempts()
             * .previouslyAttemptedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AutoCollection]. */
        class Builder internal constructor() {

            private var enabled: JsonField<Boolean>? = null
            private var nextAttemptAt: JsonField<OffsetDateTime>? = null
            private var numAttempts: JsonField<Long>? = null
            private var previouslyAttemptedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(autoCollection: AutoCollection) = apply {
                enabled = autoCollection.enabled
                nextAttemptAt = autoCollection.nextAttemptAt
                numAttempts = autoCollection.numAttempts
                previouslyAttemptedAt = autoCollection.previouslyAttemptedAt
                additionalProperties = autoCollection.additionalProperties.toMutableMap()
            }

            /** True only if auto-collection is enabled for this invoice. */
            fun enabled(enabled: Boolean?) = enabled(JsonField.ofNullable(enabled))

            /**
             * Alias for [Builder.enabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun enabled(enabled: Boolean) = enabled(enabled as Boolean?)

            /**
             * Sets [Builder.enabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.enabled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /**
             * If the invoice is scheduled for auto-collection, this field will reflect when the
             * next attempt will occur. If dunning has been exhausted, or auto-collection is not
             * enabled for this invoice, this field will be `null`.
             */
            fun nextAttemptAt(nextAttemptAt: OffsetDateTime?) =
                nextAttemptAt(JsonField.ofNullable(nextAttemptAt))

            /**
             * Sets [Builder.nextAttemptAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextAttemptAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextAttemptAt(nextAttemptAt: JsonField<OffsetDateTime>) = apply {
                this.nextAttemptAt = nextAttemptAt
            }

            /** Number of auto-collection payment attempts. */
            fun numAttempts(numAttempts: Long?) = numAttempts(JsonField.ofNullable(numAttempts))

            /**
             * Alias for [Builder.numAttempts].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun numAttempts(numAttempts: Long) = numAttempts(numAttempts as Long?)

            /**
             * Sets [Builder.numAttempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.numAttempts] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun numAttempts(numAttempts: JsonField<Long>) = apply { this.numAttempts = numAttempts }

            /**
             * If Orb has ever attempted payment auto-collection for this invoice, this field will
             * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can
             * be used to tell whether the invoice is currently in dunning (that is,
             * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
             * dunning has been exhausted (`previously_attempted_at` is non-null, but
             * `next_attempt_time` is null).
             */
            fun previouslyAttemptedAt(previouslyAttemptedAt: OffsetDateTime?) =
                previouslyAttemptedAt(JsonField.ofNullable(previouslyAttemptedAt))

            /**
             * Sets [Builder.previouslyAttemptedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previouslyAttemptedAt] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun previouslyAttemptedAt(previouslyAttemptedAt: JsonField<OffsetDateTime>) = apply {
                this.previouslyAttemptedAt = previouslyAttemptedAt
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
             * Returns an immutable instance of [AutoCollection].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .enabled()
             * .nextAttemptAt()
             * .numAttempts()
             * .previouslyAttemptedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AutoCollection =
                AutoCollection(
                    checkRequired("enabled", enabled),
                    checkRequired("nextAttemptAt", nextAttemptAt),
                    checkRequired("numAttempts", numAttempts),
                    checkRequired("previouslyAttemptedAt", previouslyAttemptedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AutoCollection = apply {
            if (validated) {
                return@apply
            }

            enabled()
            nextAttemptAt()
            numAttempts()
            previouslyAttemptedAt()
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
            (if (enabled.asKnown() == null) 0 else 1) +
                (if (nextAttemptAt.asKnown() == null) 0 else 1) +
                (if (numAttempts.asKnown() == null) 0 else 1) +
                (if (previouslyAttemptedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AutoCollection &&
                enabled == other.enabled &&
                nextAttemptAt == other.nextAttemptAt &&
                numAttempts == other.numAttempts &&
                previouslyAttemptedAt == other.previouslyAttemptedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                enabled,
                nextAttemptAt,
                numAttempts,
                previouslyAttemptedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AutoCollection{enabled=$enabled, nextAttemptAt=$nextAttemptAt, numAttempts=$numAttempts, previouslyAttemptedAt=$previouslyAttemptedAt, additionalProperties=$additionalProperties}"
    }

    class CreditNote
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val creditNoteNumber: JsonField<String>,
        private val memo: JsonField<String>,
        private val reason: JsonField<String>,
        private val total: JsonField<String>,
        private val type: JsonField<String>,
        private val voidedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_note_number")
            @ExcludeMissing
            creditNoteNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("voided_at")
            @ExcludeMissing
            voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, creditNoteNumber, memo, reason, total, type, voidedAt, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditNoteNumber(): String = creditNoteNumber.getRequired("credit_note_number")

        /**
         * An optional memo supplied on the credit note.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun memo(): String? = memo.getNullable("memo")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): String = reason.getRequired("reason")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): String = total.getRequired("total")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * If the credit note has a status of `void`, this gives a timestamp when the credit note
         * was voided.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun voidedAt(): OffsetDateTime? = voidedAt.getNullable("voided_at")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [creditNoteNumber].
         *
         * Unlike [creditNoteNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_note_number")
        @ExcludeMissing
        fun _creditNoteNumber(): JsonField<String> = creditNoteNumber

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [voidedAt].
         *
         * Unlike [voidedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("voided_at")
        @ExcludeMissing
        fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

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
             * Returns a mutable builder for constructing an instance of [CreditNote].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .creditNoteNumber()
             * .memo()
             * .reason()
             * .total()
             * .type()
             * .voidedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreditNote]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var creditNoteNumber: JsonField<String>? = null
            private var memo: JsonField<String>? = null
            private var reason: JsonField<String>? = null
            private var total: JsonField<String>? = null
            private var type: JsonField<String>? = null
            private var voidedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditNote: CreditNote) = apply {
                id = creditNote.id
                creditNoteNumber = creditNote.creditNoteNumber
                memo = creditNote.memo
                reason = creditNote.reason
                total = creditNote.total
                type = creditNote.type
                voidedAt = creditNote.voidedAt
                additionalProperties = creditNote.additionalProperties.toMutableMap()
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

            fun creditNoteNumber(creditNoteNumber: String) =
                creditNoteNumber(JsonField.of(creditNoteNumber))

            /**
             * Sets [Builder.creditNoteNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditNoteNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditNoteNumber(creditNoteNumber: JsonField<String>) = apply {
                this.creditNoteNumber = creditNoteNumber
            }

            /** An optional memo supplied on the credit note. */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun total(total: String) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun total(total: JsonField<String>) = apply { this.total = total }

            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /**
             * If the credit note has a status of `void`, this gives a timestamp when the credit
             * note was voided.
             */
            fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

            /**
             * Sets [Builder.voidedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.voidedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

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
             * Returns an immutable instance of [CreditNote].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .creditNoteNumber()
             * .memo()
             * .reason()
             * .total()
             * .type()
             * .voidedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditNote =
                CreditNote(
                    checkRequired("id", id),
                    checkRequired("creditNoteNumber", creditNoteNumber),
                    checkRequired("memo", memo),
                    checkRequired("reason", reason),
                    checkRequired("total", total),
                    checkRequired("type", type),
                    checkRequired("voidedAt", voidedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditNote = apply {
            if (validated) {
                return@apply
            }

            id()
            creditNoteNumber()
            memo()
            reason()
            total()
            type()
            voidedAt()
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
                (if (creditNoteNumber.asKnown() == null) 0 else 1) +
                (if (memo.asKnown() == null) 0 else 1) +
                (if (reason.asKnown() == null) 0 else 1) +
                (if (total.asKnown() == null) 0 else 1) +
                (if (type.asKnown() == null) 0 else 1) +
                (if (voidedAt.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditNote &&
                id == other.id &&
                creditNoteNumber == other.creditNoteNumber &&
                memo == other.memo &&
                reason == other.reason &&
                total == other.total &&
                type == other.type &&
                voidedAt == other.voidedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                creditNoteNumber,
                memo,
                reason,
                total,
                type,
                voidedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditNote{id=$id, creditNoteNumber=$creditNoteNumber, memo=$memo, reason=$reason, total=$total, type=$type, voidedAt=$voidedAt, additionalProperties=$additionalProperties}"
    }

    class CustomerBalanceTransaction
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val action: JsonField<Action>,
        private val amount: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val creditNote: JsonField<CreditNoteTiny>,
        private val description: JsonField<String>,
        private val endingBalance: JsonField<String>,
        private val invoice: JsonField<InvoiceTiny>,
        private val startingBalance: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credit_note")
            @ExcludeMissing
            creditNote: JsonField<CreditNoteTiny> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_balance")
            @ExcludeMissing
            endingBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice")
            @ExcludeMissing
            invoice: JsonField<InvoiceTiny> = JsonMissing.of(),
            @JsonProperty("starting_balance")
            @ExcludeMissing
            startingBalance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            id,
            action,
            amount,
            createdAt,
            creditNote,
            description,
            endingBalance,
            invoice,
            startingBalance,
            type,
            mutableMapOf(),
        )

        /**
         * A unique id for this transaction.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun action(): Action = action.getRequired("action")

        /**
         * The value of the amount changed in the transaction.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * The creation time of this transaction.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun creditNote(): CreditNoteTiny? = creditNote.getNullable("credit_note")

        /**
         * An optional description provided for manual customer balance adjustments.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun endingBalance(): String = endingBalance.getRequired("ending_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoice(): InvoiceTiny? = invoice.getNullable("invoice")

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingBalance(): String = startingBalance.getRequired("starting_balance")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [action].
         *
         * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [creditNote].
         *
         * Unlike [creditNote], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_note")
        @ExcludeMissing
        fun _creditNote(): JsonField<CreditNoteTiny> = creditNote

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [endingBalance].
         *
         * Unlike [endingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_balance")
        @ExcludeMissing
        fun _endingBalance(): JsonField<String> = endingBalance

        /**
         * Returns the raw JSON value of [invoice].
         *
         * Unlike [invoice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice") @ExcludeMissing fun _invoice(): JsonField<InvoiceTiny> = invoice

        /**
         * Returns the raw JSON value of [startingBalance].
         *
         * Unlike [startingBalance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("starting_balance")
        @ExcludeMissing
        fun _startingBalance(): JsonField<String> = startingBalance

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
             * Returns a mutable builder for constructing an instance of
             * [CustomerBalanceTransaction].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .action()
             * .amount()
             * .createdAt()
             * .creditNote()
             * .description()
             * .endingBalance()
             * .invoice()
             * .startingBalance()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CustomerBalanceTransaction]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var action: JsonField<Action>? = null
            private var amount: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var creditNote: JsonField<CreditNoteTiny>? = null
            private var description: JsonField<String>? = null
            private var endingBalance: JsonField<String>? = null
            private var invoice: JsonField<InvoiceTiny>? = null
            private var startingBalance: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customerBalanceTransaction: CustomerBalanceTransaction) = apply {
                id = customerBalanceTransaction.id
                action = customerBalanceTransaction.action
                amount = customerBalanceTransaction.amount
                createdAt = customerBalanceTransaction.createdAt
                creditNote = customerBalanceTransaction.creditNote
                description = customerBalanceTransaction.description
                endingBalance = customerBalanceTransaction.endingBalance
                invoice = customerBalanceTransaction.invoice
                startingBalance = customerBalanceTransaction.startingBalance
                type = customerBalanceTransaction.type
                additionalProperties =
                    customerBalanceTransaction.additionalProperties.toMutableMap()
            }

            /** A unique id for this transaction. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun action(action: Action) = action(JsonField.of(action))

            /**
             * Sets [Builder.action] to an arbitrary JSON value.
             *
             * You should usually call [Builder.action] with a well-typed [Action] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /** The value of the amount changed in the transaction. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The creation time of this transaction. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun creditNote(creditNote: CreditNoteTiny?) =
                creditNote(JsonField.ofNullable(creditNote))

            /**
             * Sets [Builder.creditNote] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditNote] with a well-typed [CreditNoteTiny] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditNote(creditNote: JsonField<CreditNoteTiny>) = apply {
                this.creditNote = creditNote
            }

            /** An optional description provided for manual customer balance adjustments. */
            fun description(description: String?) = description(JsonField.ofNullable(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * The new value of the customer's balance prior to the transaction, in the customer's
             * currency.
             */
            fun endingBalance(endingBalance: String) = endingBalance(JsonField.of(endingBalance))

            /**
             * Sets [Builder.endingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endingBalance(endingBalance: JsonField<String>) = apply {
                this.endingBalance = endingBalance
            }

            fun invoice(invoice: InvoiceTiny?) = invoice(JsonField.ofNullable(invoice))

            /**
             * Sets [Builder.invoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoice] with a well-typed [InvoiceTiny] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoice(invoice: JsonField<InvoiceTiny>) = apply { this.invoice = invoice }

            /**
             * The original value of the customer's balance prior to the transaction, in the
             * customer's currency.
             */
            fun startingBalance(startingBalance: String) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * Sets [Builder.startingBalance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingBalance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingBalance(startingBalance: JsonField<String>) = apply {
                this.startingBalance = startingBalance
            }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
             * Returns an immutable instance of [CustomerBalanceTransaction].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .action()
             * .amount()
             * .createdAt()
             * .creditNote()
             * .description()
             * .endingBalance()
             * .invoice()
             * .startingBalance()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomerBalanceTransaction =
                CustomerBalanceTransaction(
                    checkRequired("id", id),
                    checkRequired("action", action),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("creditNote", creditNote),
                    checkRequired("description", description),
                    checkRequired("endingBalance", endingBalance),
                    checkRequired("invoice", invoice),
                    checkRequired("startingBalance", startingBalance),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CustomerBalanceTransaction = apply {
            if (validated) {
                return@apply
            }

            id()
            action().validate()
            amount()
            createdAt()
            creditNote()?.validate()
            description()
            endingBalance()
            invoice()?.validate()
            startingBalance()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (action.asKnown()?.validity() ?: 0) +
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (creditNote.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (if (endingBalance.asKnown() == null) 0 else 1) +
                (invoice.asKnown()?.validity() ?: 0) +
                (if (startingBalance.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0)

        class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val APPLIED_TO_INVOICE = of("applied_to_invoice")

                val MANUAL_ADJUSTMENT = of("manual_adjustment")

                val PRORATED_REFUND = of("prorated_refund")

                val REVERT_PRORATED_REFUND = of("revert_prorated_refund")

                val RETURN_FROM_VOIDING = of("return_from_voiding")

                val CREDIT_NOTE_APPLIED = of("credit_note_applied")

                val CREDIT_NOTE_VOIDED = of("credit_note_voided")

                val OVERPAYMENT_REFUND = of("overpayment_refund")

                val EXTERNAL_PAYMENT = of("external_payment")

                val SMALL_INVOICE_CARRYOVER = of("small_invoice_carryover")

                fun of(value: String) = Action(JsonField.of(value))
            }

            /** An enum containing [Action]'s known values. */
            enum class Known {
                APPLIED_TO_INVOICE,
                MANUAL_ADJUSTMENT,
                PRORATED_REFUND,
                REVERT_PRORATED_REFUND,
                RETURN_FROM_VOIDING,
                CREDIT_NOTE_APPLIED,
                CREDIT_NOTE_VOIDED,
                OVERPAYMENT_REFUND,
                EXTERNAL_PAYMENT,
                SMALL_INVOICE_CARRYOVER,
            }

            /**
             * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Action] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPLIED_TO_INVOICE,
                MANUAL_ADJUSTMENT,
                PRORATED_REFUND,
                REVERT_PRORATED_REFUND,
                RETURN_FROM_VOIDING,
                CREDIT_NOTE_APPLIED,
                CREDIT_NOTE_VOIDED,
                OVERPAYMENT_REFUND,
                EXTERNAL_PAYMENT,
                SMALL_INVOICE_CARRYOVER,
                /**
                 * An enum member indicating that [Action] was instantiated with an unknown value.
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
                    APPLIED_TO_INVOICE -> Value.APPLIED_TO_INVOICE
                    MANUAL_ADJUSTMENT -> Value.MANUAL_ADJUSTMENT
                    PRORATED_REFUND -> Value.PRORATED_REFUND
                    REVERT_PRORATED_REFUND -> Value.REVERT_PRORATED_REFUND
                    RETURN_FROM_VOIDING -> Value.RETURN_FROM_VOIDING
                    CREDIT_NOTE_APPLIED -> Value.CREDIT_NOTE_APPLIED
                    CREDIT_NOTE_VOIDED -> Value.CREDIT_NOTE_VOIDED
                    OVERPAYMENT_REFUND -> Value.OVERPAYMENT_REFUND
                    EXTERNAL_PAYMENT -> Value.EXTERNAL_PAYMENT
                    SMALL_INVOICE_CARRYOVER -> Value.SMALL_INVOICE_CARRYOVER
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
                    APPLIED_TO_INVOICE -> Known.APPLIED_TO_INVOICE
                    MANUAL_ADJUSTMENT -> Known.MANUAL_ADJUSTMENT
                    PRORATED_REFUND -> Known.PRORATED_REFUND
                    REVERT_PRORATED_REFUND -> Known.REVERT_PRORATED_REFUND
                    RETURN_FROM_VOIDING -> Known.RETURN_FROM_VOIDING
                    CREDIT_NOTE_APPLIED -> Known.CREDIT_NOTE_APPLIED
                    CREDIT_NOTE_VOIDED -> Known.CREDIT_NOTE_VOIDED
                    OVERPAYMENT_REFUND -> Known.OVERPAYMENT_REFUND
                    EXTERNAL_PAYMENT -> Known.EXTERNAL_PAYMENT
                    SMALL_INVOICE_CARRYOVER -> Known.SMALL_INVOICE_CARRYOVER
                    else -> throw OrbInvalidDataException("Unknown Action: $value")
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

            fun validate(): Action = apply {
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

                return other is Action && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val INCREMENT = of("increment")

                val DECREMENT = of("decrement")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                INCREMENT,
                DECREMENT,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                INCREMENT,
                DECREMENT,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    INCREMENT -> Value.INCREMENT
                    DECREMENT -> Value.DECREMENT
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
                    INCREMENT -> Known.INCREMENT
                    DECREMENT -> Known.DECREMENT
                    else -> throw OrbInvalidDataException("Unknown Type: $value")
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

            return other is CustomerBalanceTransaction &&
                id == other.id &&
                action == other.action &&
                amount == other.amount &&
                createdAt == other.createdAt &&
                creditNote == other.creditNote &&
                description == other.description &&
                endingBalance == other.endingBalance &&
                invoice == other.invoice &&
                startingBalance == other.startingBalance &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                action,
                amount,
                createdAt,
                creditNote,
                description,
                endingBalance,
                invoice,
                startingBalance,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerBalanceTransaction{id=$id, action=$action, amount=$amount, createdAt=$createdAt, creditNote=$creditNote, description=$description, endingBalance=$endingBalance, invoice=$invoice, startingBalance=$startingBalance, type=$type, additionalProperties=$additionalProperties}"
    }

    class InvoiceSource @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val SUBSCRIPTION = of("subscription")

            val PARTIAL = of("partial")

            val ONE_OFF = of("one_off")

            fun of(value: String) = InvoiceSource(JsonField.of(value))
        }

        /** An enum containing [InvoiceSource]'s known values. */
        enum class Known {
            SUBSCRIPTION,
            PARTIAL,
            ONE_OFF,
        }

        /**
         * An enum containing [InvoiceSource]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [InvoiceSource] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUBSCRIPTION,
            PARTIAL,
            ONE_OFF,
            /**
             * An enum member indicating that [InvoiceSource] was instantiated with an unknown
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
                SUBSCRIPTION -> Value.SUBSCRIPTION
                PARTIAL -> Value.PARTIAL
                ONE_OFF -> Value.ONE_OFF
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
                SUBSCRIPTION -> Known.SUBSCRIPTION
                PARTIAL -> Known.PARTIAL
                ONE_OFF -> Known.ONE_OFF
                else -> throw OrbInvalidDataException("Unknown InvoiceSource: $value")
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

        fun validate(): InvoiceSource = apply {
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

            return other is InvoiceSource && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

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

    class PaymentAttempt
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val amount: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val paymentProvider: JsonField<PaymentProvider>,
        private val paymentProviderId: JsonField<String>,
        private val receiptPdf: JsonField<String>,
        private val succeeded: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payment_provider")
            @ExcludeMissing
            paymentProvider: JsonField<PaymentProvider> = JsonMissing.of(),
            @JsonProperty("payment_provider_id")
            @ExcludeMissing
            paymentProviderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("receipt_pdf")
            @ExcludeMissing
            receiptPdf: JsonField<String> = JsonMissing.of(),
            @JsonProperty("succeeded")
            @ExcludeMissing
            succeeded: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            id,
            amount,
            createdAt,
            paymentProvider,
            paymentProviderId,
            receiptPdf,
            succeeded,
            mutableMapOf(),
        )

        /**
         * The ID of the payment attempt.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The amount of the payment attempt.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): String = amount.getRequired("amount")

        /**
         * The time at which the payment attempt was created.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The payment provider that attempted to collect the payment.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentProvider(): PaymentProvider? = paymentProvider.getNullable("payment_provider")

        /**
         * The ID of the payment attempt in the payment provider.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentProviderId(): String? = paymentProviderId.getNullable("payment_provider_id")

        /**
         * URL to the downloadable PDF version of the receipt. This field will be `null` for payment
         * attempts that did not succeed.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun receiptPdf(): String? = receiptPdf.getNullable("receipt_pdf")

        /**
         * Whether the payment attempt succeeded.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun succeeded(): Boolean = succeeded.getRequired("succeeded")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<String> = amount

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [paymentProvider].
         *
         * Unlike [paymentProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_provider")
        @ExcludeMissing
        fun _paymentProvider(): JsonField<PaymentProvider> = paymentProvider

        /**
         * Returns the raw JSON value of [paymentProviderId].
         *
         * Unlike [paymentProviderId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_provider_id")
        @ExcludeMissing
        fun _paymentProviderId(): JsonField<String> = paymentProviderId

        /**
         * Returns the raw JSON value of [receiptPdf].
         *
         * Unlike [receiptPdf], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("receipt_pdf")
        @ExcludeMissing
        fun _receiptPdf(): JsonField<String> = receiptPdf

        /**
         * Returns the raw JSON value of [succeeded].
         *
         * Unlike [succeeded], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("succeeded") @ExcludeMissing fun _succeeded(): JsonField<Boolean> = succeeded

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
             * Returns a mutable builder for constructing an instance of [PaymentAttempt].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .paymentProvider()
             * .paymentProviderId()
             * .receiptPdf()
             * .succeeded()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PaymentAttempt]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var amount: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var paymentProvider: JsonField<PaymentProvider>? = null
            private var paymentProviderId: JsonField<String>? = null
            private var receiptPdf: JsonField<String>? = null
            private var succeeded: JsonField<Boolean>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentAttempt: PaymentAttempt) = apply {
                id = paymentAttempt.id
                amount = paymentAttempt.amount
                createdAt = paymentAttempt.createdAt
                paymentProvider = paymentAttempt.paymentProvider
                paymentProviderId = paymentAttempt.paymentProviderId
                receiptPdf = paymentAttempt.receiptPdf
                succeeded = paymentAttempt.succeeded
                additionalProperties = paymentAttempt.additionalProperties.toMutableMap()
            }

            /** The ID of the payment attempt. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The amount of the payment attempt. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** The time at which the payment attempt was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The payment provider that attempted to collect the payment. */
            fun paymentProvider(paymentProvider: PaymentProvider?) =
                paymentProvider(JsonField.ofNullable(paymentProvider))

            /**
             * Sets [Builder.paymentProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentProvider] with a well-typed [PaymentProvider]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
                this.paymentProvider = paymentProvider
            }

            /** The ID of the payment attempt in the payment provider. */
            fun paymentProviderId(paymentProviderId: String?) =
                paymentProviderId(JsonField.ofNullable(paymentProviderId))

            /**
             * Sets [Builder.paymentProviderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentProviderId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
                this.paymentProviderId = paymentProviderId
            }

            /**
             * URL to the downloadable PDF version of the receipt. This field will be `null` for
             * payment attempts that did not succeed.
             */
            fun receiptPdf(receiptPdf: String?) = receiptPdf(JsonField.ofNullable(receiptPdf))

            /**
             * Sets [Builder.receiptPdf] to an arbitrary JSON value.
             *
             * You should usually call [Builder.receiptPdf] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun receiptPdf(receiptPdf: JsonField<String>) = apply { this.receiptPdf = receiptPdf }

            /** Whether the payment attempt succeeded. */
            fun succeeded(succeeded: Boolean) = succeeded(JsonField.of(succeeded))

            /**
             * Sets [Builder.succeeded] to an arbitrary JSON value.
             *
             * You should usually call [Builder.succeeded] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun succeeded(succeeded: JsonField<Boolean>) = apply { this.succeeded = succeeded }

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
             * Returns an immutable instance of [PaymentAttempt].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .amount()
             * .createdAt()
             * .paymentProvider()
             * .paymentProviderId()
             * .receiptPdf()
             * .succeeded()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PaymentAttempt =
                PaymentAttempt(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("createdAt", createdAt),
                    checkRequired("paymentProvider", paymentProvider),
                    checkRequired("paymentProviderId", paymentProviderId),
                    checkRequired("receiptPdf", receiptPdf),
                    checkRequired("succeeded", succeeded),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PaymentAttempt = apply {
            if (validated) {
                return@apply
            }

            id()
            amount()
            createdAt()
            paymentProvider()?.validate()
            paymentProviderId()
            receiptPdf()
            succeeded()
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
                (if (amount.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (paymentProvider.asKnown()?.validity() ?: 0) +
                (if (paymentProviderId.asKnown() == null) 0 else 1) +
                (if (receiptPdf.asKnown() == null) 0 else 1) +
                (if (succeeded.asKnown() == null) 0 else 1)

        /** The payment provider that attempted to collect the payment. */
        class PaymentProvider
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

                fun of(value: String) = PaymentProvider(JsonField.of(value))
            }

            /** An enum containing [PaymentProvider]'s known values. */
            enum class Known {
                STRIPE
            }

            /**
             * An enum containing [PaymentProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                STRIPE,
                /**
                 * An enum member indicating that [PaymentProvider] was instantiated with an unknown
                 * value.
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
                    else -> throw OrbInvalidDataException("Unknown PaymentProvider: $value")
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

            fun validate(): PaymentProvider = apply {
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

                return other is PaymentProvider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentAttempt &&
                id == other.id &&
                amount == other.amount &&
                createdAt == other.createdAt &&
                paymentProvider == other.paymentProvider &&
                paymentProviderId == other.paymentProviderId &&
                receiptPdf == other.receiptPdf &&
                succeeded == other.succeeded &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                amount,
                createdAt,
                paymentProvider,
                paymentProviderId,
                receiptPdf,
                succeeded,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentAttempt{id=$id, amount=$amount, createdAt=$createdAt, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, receiptPdf=$receiptPdf, succeeded=$succeeded, additionalProperties=$additionalProperties}"
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ISSUED,
            PAID,
            SYNCED,
            VOID,
            DRAFT,
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws OrbInvalidDataException if this class instance's value is a not a known member.
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
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws OrbInvalidDataException if this class instance's value does not have the expected
         *   primitive type.
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

        return other is InvoiceListSummaryResponse &&
            id == other.id &&
            amountDue == other.amountDue &&
            autoCollection == other.autoCollection &&
            billingAddress == other.billingAddress &&
            createdAt == other.createdAt &&
            creditNotes == other.creditNotes &&
            currency == other.currency &&
            customer == other.customer &&
            customerBalanceTransactions == other.customerBalanceTransactions &&
            customerTaxId == other.customerTaxId &&
            dueDate == other.dueDate &&
            eligibleToIssueAt == other.eligibleToIssueAt &&
            hostedInvoiceUrl == other.hostedInvoiceUrl &&
            invoiceDate == other.invoiceDate &&
            invoiceNumber == other.invoiceNumber &&
            invoicePdf == other.invoicePdf &&
            invoiceSource == other.invoiceSource &&
            issueFailedAt == other.issueFailedAt &&
            issuedAt == other.issuedAt &&
            memo == other.memo &&
            metadata == other.metadata &&
            paidAt == other.paidAt &&
            paymentAttempts == other.paymentAttempts &&
            paymentFailedAt == other.paymentFailedAt &&
            paymentStartedAt == other.paymentStartedAt &&
            scheduledIssueAt == other.scheduledIssueAt &&
            shippingAddress == other.shippingAddress &&
            status == other.status &&
            subscription == other.subscription &&
            syncFailedAt == other.syncFailedAt &&
            total == other.total &&
            voidedAt == other.voidedAt &&
            willAutoIssue == other.willAutoIssue &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            amountDue,
            autoCollection,
            billingAddress,
            createdAt,
            creditNotes,
            currency,
            customer,
            customerBalanceTransactions,
            customerTaxId,
            dueDate,
            eligibleToIssueAt,
            hostedInvoiceUrl,
            invoiceDate,
            invoiceNumber,
            invoicePdf,
            invoiceSource,
            issueFailedAt,
            issuedAt,
            memo,
            metadata,
            paidAt,
            paymentAttempts,
            paymentFailedAt,
            paymentStartedAt,
            scheduledIssueAt,
            shippingAddress,
            status,
            subscription,
            syncFailedAt,
            total,
            voidedAt,
            willAutoIssue,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceListSummaryResponse{id=$id, amountDue=$amountDue, autoCollection=$autoCollection, billingAddress=$billingAddress, createdAt=$createdAt, creditNotes=$creditNotes, currency=$currency, customer=$customer, customerBalanceTransactions=$customerBalanceTransactions, customerTaxId=$customerTaxId, dueDate=$dueDate, eligibleToIssueAt=$eligibleToIssueAt, hostedInvoiceUrl=$hostedInvoiceUrl, invoiceDate=$invoiceDate, invoiceNumber=$invoiceNumber, invoicePdf=$invoicePdf, invoiceSource=$invoiceSource, issueFailedAt=$issueFailedAt, issuedAt=$issuedAt, memo=$memo, metadata=$metadata, paidAt=$paidAt, paymentAttempts=$paymentAttempts, paymentFailedAt=$paymentFailedAt, paymentStartedAt=$paymentStartedAt, scheduledIssueAt=$scheduledIssueAt, shippingAddress=$shippingAddress, status=$status, subscription=$subscription, syncFailedAt=$syncFailedAt, total=$total, voidedAt=$voidedAt, willAutoIssue=$willAutoIssue, additionalProperties=$additionalProperties}"
}
