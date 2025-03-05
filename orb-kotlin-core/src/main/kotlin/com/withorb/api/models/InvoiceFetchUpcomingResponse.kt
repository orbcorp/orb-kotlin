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

@NoAutoDetect
class InvoiceFetchUpcomingResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount_due")
    @ExcludeMissing
    private val amountDue: JsonField<String> = JsonMissing.of(),
    @JsonProperty("auto_collection")
    @ExcludeMissing
    private val autoCollection: JsonField<AutoCollectionModel> = JsonMissing.of(),
    @JsonProperty("billing_address")
    @ExcludeMissing
    private val billingAddress: JsonField<AddressModel> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("credit_notes")
    @ExcludeMissing
    private val creditNotes: JsonField<List<CreditNoteSummaryModel>> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<CustomerMinifiedModel> = JsonMissing.of(),
    @JsonProperty("customer_balance_transactions")
    @ExcludeMissing
    private val customerBalanceTransactions: JsonField<List<CustomerBalanceTransactionModel>> =
        JsonMissing.of(),
    @JsonProperty("customer_tax_id")
    @ExcludeMissing
    private val customerTaxId: JsonField<CustomerTaxIdModel> = JsonMissing.of(),
    @JsonProperty("discount") @ExcludeMissing private val discount: JsonValue = JsonMissing.of(),
    @JsonProperty("discounts")
    @ExcludeMissing
    private val discounts: JsonField<List<InvoiceLevelDiscount>> = JsonMissing.of(),
    @JsonProperty("due_date")
    @ExcludeMissing
    private val dueDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("eligible_to_issue_at")
    @ExcludeMissing
    private val eligibleToIssueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("hosted_invoice_url")
    @ExcludeMissing
    private val hostedInvoiceUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_number")
    @ExcludeMissing
    private val invoiceNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_pdf")
    @ExcludeMissing
    private val invoicePdf: JsonField<String> = JsonMissing.of(),
    @JsonProperty("invoice_source")
    @ExcludeMissing
    private val invoiceSource: JsonField<InvoiceSource> = JsonMissing.of(),
    @JsonProperty("issue_failed_at")
    @ExcludeMissing
    private val issueFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("issued_at")
    @ExcludeMissing
    private val issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("line_items")
    @ExcludeMissing
    private val lineItems: JsonField<List<InvoiceLineItemModel>> = JsonMissing.of(),
    @JsonProperty("maximum")
    @ExcludeMissing
    private val maximum: JsonField<MaximumModel> = JsonMissing.of(),
    @JsonProperty("maximum_amount")
    @ExcludeMissing
    private val maximumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("memo") @ExcludeMissing private val memo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("minimum")
    @ExcludeMissing
    private val minimum: JsonField<MinimumModel> = JsonMissing.of(),
    @JsonProperty("minimum_amount")
    @ExcludeMissing
    private val minimumAmount: JsonField<String> = JsonMissing.of(),
    @JsonProperty("paid_at")
    @ExcludeMissing
    private val paidAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("payment_attempts")
    @ExcludeMissing
    private val paymentAttempts: JsonField<List<PaymentAttemptModel>> = JsonMissing.of(),
    @JsonProperty("payment_failed_at")
    @ExcludeMissing
    private val paymentFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("payment_started_at")
    @ExcludeMissing
    private val paymentStartedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("scheduled_issue_at")
    @ExcludeMissing
    private val scheduledIssueAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("shipping_address")
    @ExcludeMissing
    private val shippingAddress: JsonField<AddressModel> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("subscription")
    @ExcludeMissing
    private val subscription: JsonField<SubscriptionMinifiedModel> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<String> = JsonMissing.of(),
    @JsonProperty("sync_failed_at")
    @ExcludeMissing
    private val syncFailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("target_date")
    @ExcludeMissing
    private val targetDate: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("total") @ExcludeMissing private val total: JsonField<String> = JsonMissing.of(),
    @JsonProperty("voided_at")
    @ExcludeMissing
    private val voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("will_auto_issue")
    @ExcludeMissing
    private val willAutoIssue: JsonField<Boolean> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /**
     * This is the final amount required to be charged to the customer and reflects the application
     * of the customer balance to the `total` of the invoice.
     */
    fun amountDue(): String = amountDue.getRequired("amount_due")

    fun autoCollection(): AutoCollectionModel = autoCollection.getRequired("auto_collection")

    fun billingAddress(): AddressModel? = billingAddress.getNullable("billing_address")

    /** The creation time of the resource in Orb. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** A list of credit notes associated with the invoice */
    fun creditNotes(): List<CreditNoteSummaryModel> = creditNotes.getRequired("credit_notes")

    /** An ISO 4217 currency string or `credits` */
    fun currency(): String = currency.getRequired("currency")

    fun customer(): CustomerMinifiedModel = customer.getRequired("customer")

    fun customerBalanceTransactions(): List<CustomerBalanceTransactionModel> =
        customerBalanceTransactions.getRequired("customer_balance_transactions")

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
    fun customerTaxId(): CustomerTaxIdModel? = customerTaxId.getNullable("customer_tax_id")

    /**
     * This field is deprecated in favor of `discounts`. If a `discounts` list is provided, the
     * first discount in the list will be returned. If the list is empty, `None` will be returned.
     */
    @Deprecated("deprecated")
    @JsonProperty("discount")
    @ExcludeMissing
    fun _discount(): JsonValue = discount

    fun discounts(): List<InvoiceLevelDiscount> = discounts.getRequired("discounts")

    /**
     * When the invoice payment is due. The due date is null if the invoice is not yet finalized.
     */
    fun dueDate(): OffsetDateTime? = dueDate.getNullable("due_date")

    /**
     * If the invoice has a status of `draft`, this will be the time that the invoice will be
     * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice will
     * automatically begin issuing at this time.
     */
    fun eligibleToIssueAt(): OffsetDateTime? = eligibleToIssueAt.getNullable("eligible_to_issue_at")

    /**
     * A URL for the customer-facing invoice portal. This URL expires 30 days after the invoice's
     * due date, or 60 days after being re-generated through the UI.
     */
    fun hostedInvoiceUrl(): String? = hostedInvoiceUrl.getNullable("hosted_invoice_url")

    /**
     * Automatically generated invoice number to help track and reconcile invoices. Invoice numbers
     * have a prefix such as `RFOBWG`. These can be sequential per account or customer.
     */
    fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

    /** The link to download the PDF representation of the `Invoice`. */
    fun invoicePdf(): String? = invoicePdf.getNullable("invoice_pdf")

    fun invoiceSource(): InvoiceSource = invoiceSource.getRequired("invoice_source")

    /**
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is
     * now in a different state.)
     */
    fun issueFailedAt(): OffsetDateTime? = issueFailedAt.getNullable("issue_failed_at")

    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it
     * is now in a different state.)
     */
    fun issuedAt(): OffsetDateTime? = issuedAt.getNullable("issued_at")

    /** The breakdown of prices in this invoice. */
    fun lineItems(): List<InvoiceLineItemModel> = lineItems.getRequired("line_items")

    fun maximum(): MaximumModel? = maximum.getNullable("maximum")

    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
    fun memo(): String? = memo.getNullable("memo")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun minimum(): MinimumModel? = minimum.getNullable("minimum")

    fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

    /** If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid. */
    fun paidAt(): OffsetDateTime? = paidAt.getNullable("paid_at")

    /** A list of payment attempts associated with the invoice */
    fun paymentAttempts(): List<PaymentAttemptModel> =
        paymentAttempts.getRequired("payment_attempts")

    /**
     * If payment was attempted on this invoice but failed, this will be the time of the most recent
     * attempt.
     */
    fun paymentFailedAt(): OffsetDateTime? = paymentFailedAt.getNullable("payment_failed_at")

    /**
     * If payment was attempted on this invoice, this will be the start time of the most recent
     * attempt. This field is especially useful for delayed-notification payment mechanisms (like
     * bank transfers), where payment can take 3 days or more.
     */
    fun paymentStartedAt(): OffsetDateTime? = paymentStartedAt.getNullable("payment_started_at")

    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be
     * issued.
     */
    fun scheduledIssueAt(): OffsetDateTime? = scheduledIssueAt.getNullable("scheduled_issue_at")

    fun shippingAddress(): AddressModel? = shippingAddress.getNullable("shipping_address")

    fun status(): Status = status.getRequired("status")

    fun subscription(): SubscriptionMinifiedModel? = subscription.getNullable("subscription")

    /** The total before any discounts and minimums are applied. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /**
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync
     * was attempted. This field will always be `null` for invoices using Orb Invoicing.
     */
    fun syncFailedAt(): OffsetDateTime? = syncFailedAt.getNullable("sync_failed_at")

    /** The scheduled date of the invoice */
    fun targetDate(): OffsetDateTime = targetDate.getRequired("target_date")

    /** The total after any minimums and discounts have been applied. */
    fun total(): String = total.getRequired("total")

    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     */
    fun voidedAt(): OffsetDateTime? = voidedAt.getNullable("voided_at")

    /**
     * This is true if the invoice will be automatically issued in the future, and false otherwise.
     */
    fun willAutoIssue(): Boolean = willAutoIssue.getRequired("will_auto_issue")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * This is the final amount required to be charged to the customer and reflects the application
     * of the customer balance to the `total` of the invoice.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue(): JsonField<String> = amountDue

    @JsonProperty("auto_collection")
    @ExcludeMissing
    fun _autoCollection(): JsonField<AutoCollectionModel> = autoCollection

    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<AddressModel> = billingAddress

    /** The creation time of the resource in Orb. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** A list of credit notes associated with the invoice */
    @JsonProperty("credit_notes")
    @ExcludeMissing
    fun _creditNotes(): JsonField<List<CreditNoteSummaryModel>> = creditNotes

    /** An ISO 4217 currency string or `credits` */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerMinifiedModel> = customer

    @JsonProperty("customer_balance_transactions")
    @ExcludeMissing
    fun _customerBalanceTransactions(): JsonField<List<CustomerBalanceTransactionModel>> =
        customerBalanceTransactions

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
    @JsonProperty("customer_tax_id")
    @ExcludeMissing
    fun _customerTaxId(): JsonField<CustomerTaxIdModel> = customerTaxId

    @JsonProperty("discounts")
    @ExcludeMissing
    fun _discounts(): JsonField<List<InvoiceLevelDiscount>> = discounts

    /**
     * When the invoice payment is due. The due date is null if the invoice is not yet finalized.
     */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<OffsetDateTime> = dueDate

    /**
     * If the invoice has a status of `draft`, this will be the time that the invoice will be
     * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice will
     * automatically begin issuing at this time.
     */
    @JsonProperty("eligible_to_issue_at")
    @ExcludeMissing
    fun _eligibleToIssueAt(): JsonField<OffsetDateTime> = eligibleToIssueAt

    /**
     * A URL for the customer-facing invoice portal. This URL expires 30 days after the invoice's
     * due date, or 60 days after being re-generated through the UI.
     */
    @JsonProperty("hosted_invoice_url")
    @ExcludeMissing
    fun _hostedInvoiceUrl(): JsonField<String> = hostedInvoiceUrl

    /**
     * Automatically generated invoice number to help track and reconcile invoices. Invoice numbers
     * have a prefix such as `RFOBWG`. These can be sequential per account or customer.
     */
    @JsonProperty("invoice_number")
    @ExcludeMissing
    fun _invoiceNumber(): JsonField<String> = invoiceNumber

    /** The link to download the PDF representation of the `Invoice`. */
    @JsonProperty("invoice_pdf") @ExcludeMissing fun _invoicePdf(): JsonField<String> = invoicePdf

    @JsonProperty("invoice_source")
    @ExcludeMissing
    fun _invoiceSource(): JsonField<InvoiceSource> = invoiceSource

    /**
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is
     * now in a different state.)
     */
    @JsonProperty("issue_failed_at")
    @ExcludeMissing
    fun _issueFailedAt(): JsonField<OffsetDateTime> = issueFailedAt

    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it
     * is now in a different state.)
     */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

    /** The breakdown of prices in this invoice. */
    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<InvoiceLineItemModel>> = lineItems

    @JsonProperty("maximum") @ExcludeMissing fun _maximum(): JsonField<MaximumModel> = maximum

    @JsonProperty("maximum_amount")
    @ExcludeMissing
    fun _maximumAmount(): JsonField<String> = maximumAmount

    /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("minimum") @ExcludeMissing fun _minimum(): JsonField<MinimumModel> = minimum

    @JsonProperty("minimum_amount")
    @ExcludeMissing
    fun _minimumAmount(): JsonField<String> = minimumAmount

    /** If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid. */
    @JsonProperty("paid_at") @ExcludeMissing fun _paidAt(): JsonField<OffsetDateTime> = paidAt

    /** A list of payment attempts associated with the invoice */
    @JsonProperty("payment_attempts")
    @ExcludeMissing
    fun _paymentAttempts(): JsonField<List<PaymentAttemptModel>> = paymentAttempts

    /**
     * If payment was attempted on this invoice but failed, this will be the time of the most recent
     * attempt.
     */
    @JsonProperty("payment_failed_at")
    @ExcludeMissing
    fun _paymentFailedAt(): JsonField<OffsetDateTime> = paymentFailedAt

    /**
     * If payment was attempted on this invoice, this will be the start time of the most recent
     * attempt. This field is especially useful for delayed-notification payment mechanisms (like
     * bank transfers), where payment can take 3 days or more.
     */
    @JsonProperty("payment_started_at")
    @ExcludeMissing
    fun _paymentStartedAt(): JsonField<OffsetDateTime> = paymentStartedAt

    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be
     * issued.
     */
    @JsonProperty("scheduled_issue_at")
    @ExcludeMissing
    fun _scheduledIssueAt(): JsonField<OffsetDateTime> = scheduledIssueAt

    @JsonProperty("shipping_address")
    @ExcludeMissing
    fun _shippingAddress(): JsonField<AddressModel> = shippingAddress

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("subscription")
    @ExcludeMissing
    fun _subscription(): JsonField<SubscriptionMinifiedModel> = subscription

    /** The total before any discounts and minimums are applied. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<String> = subtotal

    /**
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync
     * was attempted. This field will always be `null` for invoices using Orb Invoicing.
     */
    @JsonProperty("sync_failed_at")
    @ExcludeMissing
    fun _syncFailedAt(): JsonField<OffsetDateTime> = syncFailedAt

    /** The scheduled date of the invoice */
    @JsonProperty("target_date")
    @ExcludeMissing
    fun _targetDate(): JsonField<OffsetDateTime> = targetDate

    /** The total after any minimums and discounts have been applied. */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

    /**
     * This is true if the invoice will be automatically issued in the future, and false otherwise.
     */
    @JsonProperty("will_auto_issue")
    @ExcludeMissing
    fun _willAutoIssue(): JsonField<Boolean> = willAutoIssue

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InvoiceFetchUpcomingResponse = apply {
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
        discounts().forEach { it.validate() }
        dueDate()
        eligibleToIssueAt()
        hostedInvoiceUrl()
        invoiceNumber()
        invoicePdf()
        invoiceSource()
        issueFailedAt()
        issuedAt()
        lineItems().forEach { it.validate() }
        maximum()?.validate()
        maximumAmount()
        memo()
        metadata().validate()
        minimum()?.validate()
        minimumAmount()
        paidAt()
        paymentAttempts().forEach { it.validate() }
        paymentFailedAt()
        paymentStartedAt()
        scheduledIssueAt()
        shippingAddress()?.validate()
        status()
        subscription()?.validate()
        subtotal()
        syncFailedAt()
        targetDate()
        total()
        voidedAt()
        willAutoIssue()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InvoiceFetchUpcomingResponse].
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
         * .discount()
         * .discounts()
         * .dueDate()
         * .eligibleToIssueAt()
         * .hostedInvoiceUrl()
         * .invoiceNumber()
         * .invoicePdf()
         * .invoiceSource()
         * .issueFailedAt()
         * .issuedAt()
         * .lineItems()
         * .maximum()
         * .maximumAmount()
         * .memo()
         * .metadata()
         * .minimum()
         * .minimumAmount()
         * .paidAt()
         * .paymentAttempts()
         * .paymentFailedAt()
         * .paymentStartedAt()
         * .scheduledIssueAt()
         * .shippingAddress()
         * .status()
         * .subscription()
         * .subtotal()
         * .syncFailedAt()
         * .targetDate()
         * .total()
         * .voidedAt()
         * .willAutoIssue()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceFetchUpcomingResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amountDue: JsonField<String>? = null
        private var autoCollection: JsonField<AutoCollectionModel>? = null
        private var billingAddress: JsonField<AddressModel>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var creditNotes: JsonField<MutableList<CreditNoteSummaryModel>>? = null
        private var currency: JsonField<String>? = null
        private var customer: JsonField<CustomerMinifiedModel>? = null
        private var customerBalanceTransactions:
            JsonField<MutableList<CustomerBalanceTransactionModel>>? =
            null
        private var customerTaxId: JsonField<CustomerTaxIdModel>? = null
        private var discount: JsonValue? = null
        private var discounts: JsonField<MutableList<InvoiceLevelDiscount>>? = null
        private var dueDate: JsonField<OffsetDateTime>? = null
        private var eligibleToIssueAt: JsonField<OffsetDateTime>? = null
        private var hostedInvoiceUrl: JsonField<String>? = null
        private var invoiceNumber: JsonField<String>? = null
        private var invoicePdf: JsonField<String>? = null
        private var invoiceSource: JsonField<InvoiceSource>? = null
        private var issueFailedAt: JsonField<OffsetDateTime>? = null
        private var issuedAt: JsonField<OffsetDateTime>? = null
        private var lineItems: JsonField<MutableList<InvoiceLineItemModel>>? = null
        private var maximum: JsonField<MaximumModel>? = null
        private var maximumAmount: JsonField<String>? = null
        private var memo: JsonField<String>? = null
        private var metadata: JsonField<Metadata>? = null
        private var minimum: JsonField<MinimumModel>? = null
        private var minimumAmount: JsonField<String>? = null
        private var paidAt: JsonField<OffsetDateTime>? = null
        private var paymentAttempts: JsonField<MutableList<PaymentAttemptModel>>? = null
        private var paymentFailedAt: JsonField<OffsetDateTime>? = null
        private var paymentStartedAt: JsonField<OffsetDateTime>? = null
        private var scheduledIssueAt: JsonField<OffsetDateTime>? = null
        private var shippingAddress: JsonField<AddressModel>? = null
        private var status: JsonField<Status>? = null
        private var subscription: JsonField<SubscriptionMinifiedModel>? = null
        private var subtotal: JsonField<String>? = null
        private var syncFailedAt: JsonField<OffsetDateTime>? = null
        private var targetDate: JsonField<OffsetDateTime>? = null
        private var total: JsonField<String>? = null
        private var voidedAt: JsonField<OffsetDateTime>? = null
        private var willAutoIssue: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceFetchUpcomingResponse: InvoiceFetchUpcomingResponse) = apply {
            id = invoiceFetchUpcomingResponse.id
            amountDue = invoiceFetchUpcomingResponse.amountDue
            autoCollection = invoiceFetchUpcomingResponse.autoCollection
            billingAddress = invoiceFetchUpcomingResponse.billingAddress
            createdAt = invoiceFetchUpcomingResponse.createdAt
            creditNotes = invoiceFetchUpcomingResponse.creditNotes.map { it.toMutableList() }
            currency = invoiceFetchUpcomingResponse.currency
            customer = invoiceFetchUpcomingResponse.customer
            customerBalanceTransactions =
                invoiceFetchUpcomingResponse.customerBalanceTransactions.map { it.toMutableList() }
            customerTaxId = invoiceFetchUpcomingResponse.customerTaxId
            discount = invoiceFetchUpcomingResponse.discount
            discounts = invoiceFetchUpcomingResponse.discounts.map { it.toMutableList() }
            dueDate = invoiceFetchUpcomingResponse.dueDate
            eligibleToIssueAt = invoiceFetchUpcomingResponse.eligibleToIssueAt
            hostedInvoiceUrl = invoiceFetchUpcomingResponse.hostedInvoiceUrl
            invoiceNumber = invoiceFetchUpcomingResponse.invoiceNumber
            invoicePdf = invoiceFetchUpcomingResponse.invoicePdf
            invoiceSource = invoiceFetchUpcomingResponse.invoiceSource
            issueFailedAt = invoiceFetchUpcomingResponse.issueFailedAt
            issuedAt = invoiceFetchUpcomingResponse.issuedAt
            lineItems = invoiceFetchUpcomingResponse.lineItems.map { it.toMutableList() }
            maximum = invoiceFetchUpcomingResponse.maximum
            maximumAmount = invoiceFetchUpcomingResponse.maximumAmount
            memo = invoiceFetchUpcomingResponse.memo
            metadata = invoiceFetchUpcomingResponse.metadata
            minimum = invoiceFetchUpcomingResponse.minimum
            minimumAmount = invoiceFetchUpcomingResponse.minimumAmount
            paidAt = invoiceFetchUpcomingResponse.paidAt
            paymentAttempts =
                invoiceFetchUpcomingResponse.paymentAttempts.map { it.toMutableList() }
            paymentFailedAt = invoiceFetchUpcomingResponse.paymentFailedAt
            paymentStartedAt = invoiceFetchUpcomingResponse.paymentStartedAt
            scheduledIssueAt = invoiceFetchUpcomingResponse.scheduledIssueAt
            shippingAddress = invoiceFetchUpcomingResponse.shippingAddress
            status = invoiceFetchUpcomingResponse.status
            subscription = invoiceFetchUpcomingResponse.subscription
            subtotal = invoiceFetchUpcomingResponse.subtotal
            syncFailedAt = invoiceFetchUpcomingResponse.syncFailedAt
            targetDate = invoiceFetchUpcomingResponse.targetDate
            total = invoiceFetchUpcomingResponse.total
            voidedAt = invoiceFetchUpcomingResponse.voidedAt
            willAutoIssue = invoiceFetchUpcomingResponse.willAutoIssue
            additionalProperties = invoiceFetchUpcomingResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * This is the final amount required to be charged to the customer and reflects the
         * application of the customer balance to the `total` of the invoice.
         */
        fun amountDue(amountDue: String) = amountDue(JsonField.of(amountDue))

        /**
         * This is the final amount required to be charged to the customer and reflects the
         * application of the customer balance to the `total` of the invoice.
         */
        fun amountDue(amountDue: JsonField<String>) = apply { this.amountDue = amountDue }

        fun autoCollection(autoCollection: AutoCollectionModel) =
            autoCollection(JsonField.of(autoCollection))

        fun autoCollection(autoCollection: JsonField<AutoCollectionModel>) = apply {
            this.autoCollection = autoCollection
        }

        fun billingAddress(billingAddress: AddressModel?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        fun billingAddress(billingAddress: JsonField<AddressModel>) = apply {
            this.billingAddress = billingAddress
        }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** A list of credit notes associated with the invoice */
        fun creditNotes(creditNotes: List<CreditNoteSummaryModel>) =
            creditNotes(JsonField.of(creditNotes))

        /** A list of credit notes associated with the invoice */
        fun creditNotes(creditNotes: JsonField<List<CreditNoteSummaryModel>>) = apply {
            this.creditNotes = creditNotes.map { it.toMutableList() }
        }

        /** A list of credit notes associated with the invoice */
        fun addCreditNote(creditNote: CreditNoteSummaryModel) = apply {
            creditNotes =
                (creditNotes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("creditNotes", it).add(creditNote)
                }
        }

        /** An ISO 4217 currency string or `credits` */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** An ISO 4217 currency string or `credits` */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun customer(customer: CustomerMinifiedModel) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<CustomerMinifiedModel>) = apply {
            this.customer = customer
        }

        fun customerBalanceTransactions(
            customerBalanceTransactions: List<CustomerBalanceTransactionModel>
        ) = customerBalanceTransactions(JsonField.of(customerBalanceTransactions))

        fun customerBalanceTransactions(
            customerBalanceTransactions: JsonField<List<CustomerBalanceTransactionModel>>
        ) = apply {
            this.customerBalanceTransactions =
                customerBalanceTransactions.map { it.toMutableList() }
        }

        fun addCustomerBalanceTransaction(
            customerBalanceTransaction: CustomerBalanceTransactionModel
        ) = apply {
            customerBalanceTransactions =
                (customerBalanceTransactions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("customerBalanceTransactions", it).add(customerBalanceTransaction)
                }
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
        fun customerTaxId(customerTaxId: CustomerTaxIdModel?) =
            customerTaxId(JsonField.ofNullable(customerTaxId))

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
        fun customerTaxId(customerTaxId: JsonField<CustomerTaxIdModel>) = apply {
            this.customerTaxId = customerTaxId
        }

        /**
         * This field is deprecated in favor of `discounts`. If a `discounts` list is provided, the
         * first discount in the list will be returned. If the list is empty, `None` will be
         * returned.
         */
        @Deprecated("deprecated")
        fun discount(discount: JsonValue) = apply { this.discount = discount }

        fun discounts(discounts: List<InvoiceLevelDiscount>) = discounts(JsonField.of(discounts))

        fun discounts(discounts: JsonField<List<InvoiceLevelDiscount>>) = apply {
            this.discounts = discounts.map { it.toMutableList() }
        }

        fun addDiscount(discount: InvoiceLevelDiscount) = apply {
            discounts =
                (discounts ?: JsonField.of(mutableListOf())).also {
                    checkKnown("discounts", it).add(discount)
                }
        }

        fun addDiscount(percentage: PercentageDiscount) =
            addDiscount(InvoiceLevelDiscount.ofPercentage(percentage))

        fun addDiscount(amount: AmountDiscount) = addDiscount(InvoiceLevelDiscount.ofAmount(amount))

        fun addDiscount(trial: TrialDiscount) = addDiscount(InvoiceLevelDiscount.ofTrial(trial))

        fun addTrialDiscount(appliesToPriceIds: List<String>) =
            addDiscount(
                TrialDiscount.builder()
                    .discountType(TrialDiscount.DiscountType.TRIAL)
                    .appliesToPriceIds(appliesToPriceIds)
                    .build()
            )

        /**
         * When the invoice payment is due. The due date is null if the invoice is not yet
         * finalized.
         */
        fun dueDate(dueDate: OffsetDateTime?) = dueDate(JsonField.ofNullable(dueDate))

        /**
         * When the invoice payment is due. The due date is null if the invoice is not yet
         * finalized.
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
         * If the invoice has a status of `draft`, this will be the time that the invoice will be
         * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice
         * will automatically begin issuing at this time.
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
         * A URL for the customer-facing invoice portal. This URL expires 30 days after the
         * invoice's due date, or 60 days after being re-generated through the UI.
         */
        fun hostedInvoiceUrl(hostedInvoiceUrl: JsonField<String>) = apply {
            this.hostedInvoiceUrl = hostedInvoiceUrl
        }

        /**
         * Automatically generated invoice number to help track and reconcile invoices. Invoice
         * numbers have a prefix such as `RFOBWG`. These can be sequential per account or customer.
         */
        fun invoiceNumber(invoiceNumber: String) = invoiceNumber(JsonField.of(invoiceNumber))

        /**
         * Automatically generated invoice number to help track and reconcile invoices. Invoice
         * numbers have a prefix such as `RFOBWG`. These can be sequential per account or customer.
         */
        fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
            this.invoiceNumber = invoiceNumber
        }

        /** The link to download the PDF representation of the `Invoice`. */
        fun invoicePdf(invoicePdf: String?) = invoicePdf(JsonField.ofNullable(invoicePdf))

        /** The link to download the PDF representation of the `Invoice`. */
        fun invoicePdf(invoicePdf: JsonField<String>) = apply { this.invoicePdf = invoicePdf }

        fun invoiceSource(invoiceSource: InvoiceSource) = invoiceSource(JsonField.of(invoiceSource))

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
         * If the invoice failed to issue, this will be the last time it failed to issue (even if it
         * is now in a different state.)
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
         * If the invoice has been issued, this will be the time it transitioned to `issued` (even
         * if it is now in a different state.)
         */
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

        /** The breakdown of prices in this invoice. */
        fun lineItems(lineItems: List<InvoiceLineItemModel>) = lineItems(JsonField.of(lineItems))

        /** The breakdown of prices in this invoice. */
        fun lineItems(lineItems: JsonField<List<InvoiceLineItemModel>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /** The breakdown of prices in this invoice. */
        fun addLineItem(lineItem: InvoiceLineItemModel) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItems", it).add(lineItem)
                }
        }

        fun maximum(maximum: MaximumModel?) = maximum(JsonField.ofNullable(maximum))

        fun maximum(maximum: JsonField<MaximumModel>) = apply { this.maximum = maximum }

        fun maximumAmount(maximumAmount: String?) =
            maximumAmount(JsonField.ofNullable(maximumAmount))

        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

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

        fun minimum(minimum: MinimumModel?) = minimum(JsonField.ofNullable(minimum))

        fun minimum(minimum: JsonField<MinimumModel>) = apply { this.minimum = minimum }

        fun minimumAmount(minimumAmount: String?) =
            minimumAmount(JsonField.ofNullable(minimumAmount))

        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        fun paidAt(paidAt: OffsetDateTime?) = paidAt(JsonField.ofNullable(paidAt))

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        fun paidAt(paidAt: JsonField<OffsetDateTime>) = apply { this.paidAt = paidAt }

        /** A list of payment attempts associated with the invoice */
        fun paymentAttempts(paymentAttempts: List<PaymentAttemptModel>) =
            paymentAttempts(JsonField.of(paymentAttempts))

        /** A list of payment attempts associated with the invoice */
        fun paymentAttempts(paymentAttempts: JsonField<List<PaymentAttemptModel>>) = apply {
            this.paymentAttempts = paymentAttempts.map { it.toMutableList() }
        }

        /** A list of payment attempts associated with the invoice */
        fun addPaymentAttempt(paymentAttempt: PaymentAttemptModel) = apply {
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
         * If payment was attempted on this invoice but failed, this will be the time of the most
         * recent attempt.
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
         * If payment was attempted on this invoice, this will be the start time of the most recent
         * attempt. This field is especially useful for delayed-notification payment mechanisms
         * (like bank transfers), where payment can take 3 days or more.
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
         * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to
         * be issued.
         */
        fun scheduledIssueAt(scheduledIssueAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledIssueAt = scheduledIssueAt
        }

        fun shippingAddress(shippingAddress: AddressModel?) =
            shippingAddress(JsonField.ofNullable(shippingAddress))

        fun shippingAddress(shippingAddress: JsonField<AddressModel>) = apply {
            this.shippingAddress = shippingAddress
        }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subscription(subscription: SubscriptionMinifiedModel?) =
            subscription(JsonField.ofNullable(subscription))

        fun subscription(subscription: JsonField<SubscriptionMinifiedModel>) = apply {
            this.subscription = subscription
        }

        /** The total before any discounts and minimums are applied. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** The total before any discounts and minimums are applied. */
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        fun syncFailedAt(syncFailedAt: OffsetDateTime?) =
            syncFailedAt(JsonField.ofNullable(syncFailedAt))

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        fun syncFailedAt(syncFailedAt: JsonField<OffsetDateTime>) = apply {
            this.syncFailedAt = syncFailedAt
        }

        /** The scheduled date of the invoice */
        fun targetDate(targetDate: OffsetDateTime) = targetDate(JsonField.of(targetDate))

        /** The scheduled date of the invoice */
        fun targetDate(targetDate: JsonField<OffsetDateTime>) = apply {
            this.targetDate = targetDate
        }

        /** The total after any minimums and discounts have been applied. */
        fun total(total: String) = total(JsonField.of(total))

        /** The total after any minimums and discounts have been applied. */
        fun total(total: JsonField<String>) = apply { this.total = total }

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

        /**
         * This is true if the invoice will be automatically issued in the future, and false
         * otherwise.
         */
        fun willAutoIssue(willAutoIssue: Boolean) = willAutoIssue(JsonField.of(willAutoIssue))

        /**
         * This is true if the invoice will be automatically issued in the future, and false
         * otherwise.
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

        fun build(): InvoiceFetchUpcomingResponse =
            InvoiceFetchUpcomingResponse(
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
                checkRequired("discount", discount),
                checkRequired("discounts", discounts).map { it.toImmutable() },
                checkRequired("dueDate", dueDate),
                checkRequired("eligibleToIssueAt", eligibleToIssueAt),
                checkRequired("hostedInvoiceUrl", hostedInvoiceUrl),
                checkRequired("invoiceNumber", invoiceNumber),
                checkRequired("invoicePdf", invoicePdf),
                checkRequired("invoiceSource", invoiceSource),
                checkRequired("issueFailedAt", issueFailedAt),
                checkRequired("issuedAt", issuedAt),
                checkRequired("lineItems", lineItems).map { it.toImmutable() },
                checkRequired("maximum", maximum),
                checkRequired("maximumAmount", maximumAmount),
                checkRequired("memo", memo),
                checkRequired("metadata", metadata),
                checkRequired("minimum", minimum),
                checkRequired("minimumAmount", minimumAmount),
                checkRequired("paidAt", paidAt),
                checkRequired("paymentAttempts", paymentAttempts).map { it.toImmutable() },
                checkRequired("paymentFailedAt", paymentFailedAt),
                checkRequired("paymentStartedAt", paymentStartedAt),
                checkRequired("scheduledIssueAt", scheduledIssueAt),
                checkRequired("shippingAddress", shippingAddress),
                checkRequired("status", status),
                checkRequired("subscription", subscription),
                checkRequired("subtotal", subtotal),
                checkRequired("syncFailedAt", syncFailedAt),
                checkRequired("targetDate", targetDate),
                checkRequired("total", total),
                checkRequired("voidedAt", voidedAt),
                checkRequired("willAutoIssue", willAutoIssue),
                additionalProperties.toImmutable(),
            )
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceFetchUpcomingResponse && id == other.id && amountDue == other.amountDue && autoCollection == other.autoCollection && billingAddress == other.billingAddress && createdAt == other.createdAt && creditNotes == other.creditNotes && currency == other.currency && customer == other.customer && customerBalanceTransactions == other.customerBalanceTransactions && customerTaxId == other.customerTaxId && discount == other.discount && discounts == other.discounts && dueDate == other.dueDate && eligibleToIssueAt == other.eligibleToIssueAt && hostedInvoiceUrl == other.hostedInvoiceUrl && invoiceNumber == other.invoiceNumber && invoicePdf == other.invoicePdf && invoiceSource == other.invoiceSource && issueFailedAt == other.issueFailedAt && issuedAt == other.issuedAt && lineItems == other.lineItems && maximum == other.maximum && maximumAmount == other.maximumAmount && memo == other.memo && metadata == other.metadata && minimum == other.minimum && minimumAmount == other.minimumAmount && paidAt == other.paidAt && paymentAttempts == other.paymentAttempts && paymentFailedAt == other.paymentFailedAt && paymentStartedAt == other.paymentStartedAt && scheduledIssueAt == other.scheduledIssueAt && shippingAddress == other.shippingAddress && status == other.status && subscription == other.subscription && subtotal == other.subtotal && syncFailedAt == other.syncFailedAt && targetDate == other.targetDate && total == other.total && voidedAt == other.voidedAt && willAutoIssue == other.willAutoIssue && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, amountDue, autoCollection, billingAddress, createdAt, creditNotes, currency, customer, customerBalanceTransactions, customerTaxId, discount, discounts, dueDate, eligibleToIssueAt, hostedInvoiceUrl, invoiceNumber, invoicePdf, invoiceSource, issueFailedAt, issuedAt, lineItems, maximum, maximumAmount, memo, metadata, minimum, minimumAmount, paidAt, paymentAttempts, paymentFailedAt, paymentStartedAt, scheduledIssueAt, shippingAddress, status, subscription, subtotal, syncFailedAt, targetDate, total, voidedAt, willAutoIssue, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceFetchUpcomingResponse{id=$id, amountDue=$amountDue, autoCollection=$autoCollection, billingAddress=$billingAddress, createdAt=$createdAt, creditNotes=$creditNotes, currency=$currency, customer=$customer, customerBalanceTransactions=$customerBalanceTransactions, customerTaxId=$customerTaxId, discount=$discount, discounts=$discounts, dueDate=$dueDate, eligibleToIssueAt=$eligibleToIssueAt, hostedInvoiceUrl=$hostedInvoiceUrl, invoiceNumber=$invoiceNumber, invoicePdf=$invoicePdf, invoiceSource=$invoiceSource, issueFailedAt=$issueFailedAt, issuedAt=$issuedAt, lineItems=$lineItems, maximum=$maximum, maximumAmount=$maximumAmount, memo=$memo, metadata=$metadata, minimum=$minimum, minimumAmount=$minimumAmount, paidAt=$paidAt, paymentAttempts=$paymentAttempts, paymentFailedAt=$paymentFailedAt, paymentStartedAt=$paymentStartedAt, scheduledIssueAt=$scheduledIssueAt, shippingAddress=$shippingAddress, status=$status, subscription=$subscription, subtotal=$subtotal, syncFailedAt=$syncFailedAt, targetDate=$targetDate, total=$total, voidedAt=$voidedAt, willAutoIssue=$willAutoIssue, additionalProperties=$additionalProperties}"
}
