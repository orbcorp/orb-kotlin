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
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(builder = InvoiceFetchUpcomingResponse.Builder::class)
@NoAutoDetect
class InvoiceFetchUpcomingResponse
private constructor(
    private val metadata: JsonField<Metadata>,
    private val voidedAt: JsonField<OffsetDateTime>,
    private val paidAt: JsonField<OffsetDateTime>,
    private val issuedAt: JsonField<OffsetDateTime>,
    private val scheduledIssueAt: JsonField<OffsetDateTime>,
    private val autoCollection: JsonField<AutoCollection>,
    private val issueFailedAt: JsonField<OffsetDateTime>,
    private val syncFailedAt: JsonField<OffsetDateTime>,
    private val paymentFailedAt: JsonField<OffsetDateTime>,
    private val paymentStartedAt: JsonField<OffsetDateTime>,
    private val amountDue: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val customer: JsonField<Customer>,
    private val discount: JsonValue,
    private val discounts: JsonField<List<InvoiceLevelDiscount>>,
    private val dueDate: JsonField<OffsetDateTime>,
    private val id: JsonField<String>,
    private val invoicePdf: JsonField<String>,
    private val invoiceNumber: JsonField<String>,
    private val minimum: JsonField<Minimum>,
    private val minimumAmount: JsonField<String>,
    private val maximum: JsonField<Maximum>,
    private val maximumAmount: JsonField<String>,
    private val lineItems: JsonField<List<LineItem>>,
    private val subscription: JsonField<Subscription>,
    private val subtotal: JsonField<String>,
    private val total: JsonField<String>,
    private val customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>>,
    private val status: JsonField<Status>,
    private val invoiceSource: JsonField<InvoiceSource>,
    private val shippingAddress: JsonField<ShippingAddress>,
    private val billingAddress: JsonField<BillingAddress>,
    private val hostedInvoiceUrl: JsonField<String>,
    private val willAutoIssue: JsonField<Boolean>,
    private val eligibleToIssueAt: JsonField<OffsetDateTime>,
    private val customerTaxId: JsonField<CustomerTaxId>,
    private val memo: JsonField<String>,
    private val creditNotes: JsonField<List<CreditNote>>,
    private val paymentAttempts: JsonField<List<PaymentAttempt>>,
    private val targetDate: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     */
    fun voidedAt(): OffsetDateTime? = voidedAt.getNullable("voided_at")

    /** If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid. */
    fun paidAt(): OffsetDateTime? = paidAt.getNullable("paid_at")

    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it
     * is now in a different state.)
     */
    fun issuedAt(): OffsetDateTime? = issuedAt.getNullable("issued_at")

    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be
     * issued.
     */
    fun scheduledIssueAt(): OffsetDateTime? = scheduledIssueAt.getNullable("scheduled_issue_at")

    fun autoCollection(): AutoCollection = autoCollection.getRequired("auto_collection")

    /**
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is
     * now in a different state.)
     */
    fun issueFailedAt(): OffsetDateTime? = issueFailedAt.getNullable("issue_failed_at")

    /**
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync
     * was attempted. This field will always be `null` for invoices using Orb Invoicing.
     */
    fun syncFailedAt(): OffsetDateTime? = syncFailedAt.getNullable("sync_failed_at")

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
     * This is the final amount required to be charged to the customer and reflects the application
     * of the customer balance to the `total` of the invoice.
     */
    fun amountDue(): String = amountDue.getRequired("amount_due")

    /** The creation time of the resource in Orb. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** An ISO 4217 currency string or `credits` */
    fun currency(): String = currency.getRequired("currency")

    fun customer(): Customer = customer.getRequired("customer")

    fun discounts(): List<InvoiceLevelDiscount> = discounts.getRequired("discounts")

    /** When the invoice payment is due. */
    fun dueDate(): OffsetDateTime = dueDate.getRequired("due_date")

    fun id(): String = id.getRequired("id")

    /** The link to download the PDF representation of the `Invoice`. */
    fun invoicePdf(): String? = invoicePdf.getNullable("invoice_pdf")

    /**
     * Automatically generated invoice number to help track and reconcile invoices. Invoice numbers
     * have a prefix such as `RFOBWG`. These can be sequential per account or customer.
     */
    fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

    fun minimum(): Minimum? = minimum.getNullable("minimum")

    fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

    fun maximum(): Maximum? = maximum.getNullable("maximum")

    fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

    /** The breakdown of prices in this invoice. */
    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

    fun subscription(): Subscription? = subscription.getNullable("subscription")

    /** The total before any discounts and minimums are applied. */
    fun subtotal(): String = subtotal.getRequired("subtotal")

    /** The total after any minimums and discounts have been applied. */
    fun total(): String = total.getRequired("total")

    fun customerBalanceTransactions(): List<CustomerBalanceTransaction> =
        customerBalanceTransactions.getRequired("customer_balance_transactions")

    fun status(): Status = status.getRequired("status")

    fun invoiceSource(): InvoiceSource = invoiceSource.getRequired("invoice_source")

    fun shippingAddress(): ShippingAddress? = shippingAddress.getNullable("shipping_address")

    fun billingAddress(): BillingAddress? = billingAddress.getNullable("billing_address")

    /**
     * A URL for the customer-facing invoice portal. This URL expires 30 days after the invoice's
     * due date, or 60 days after being re-generated through the UI.
     */
    fun hostedInvoiceUrl(): String? = hostedInvoiceUrl.getNullable("hosted_invoice_url")

    /**
     * This is true if the invoice will be automatically issued in the future, and false otherwise.
     */
    fun willAutoIssue(): Boolean = willAutoIssue.getRequired("will_auto_issue")

    /**
     * If the invoice has a status of `draft`, this will be the time that the invoice will be
     * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice will
     * automatically begin issuing at this time.
     */
    fun eligibleToIssueAt(): OffsetDateTime? = eligibleToIssueAt.getNullable("eligible_to_issue_at")

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
    fun customerTaxId(): CustomerTaxId? = customerTaxId.getNullable("customer_tax_id")

    /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
    fun memo(): String? = memo.getNullable("memo")

    /** A list of credit notes associated with the invoice */
    fun creditNotes(): List<CreditNote> = creditNotes.getRequired("credit_notes")

    /** A list of payment attempts associated with the invoice */
    fun paymentAttempts(): List<PaymentAttempt> = paymentAttempts.getRequired("payment_attempts")

    /** The scheduled date of the invoice */
    fun targetDate(): OffsetDateTime = targetDate.getRequired("target_date")

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    /**
     * If the invoice has a status of `void`, this gives a timestamp when the invoice was voided.
     */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt() = voidedAt

    /** If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid. */
    @JsonProperty("paid_at") @ExcludeMissing fun _paidAt() = paidAt

    /**
     * If the invoice has been issued, this will be the time it transitioned to `issued` (even if it
     * is now in a different state.)
     */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt() = issuedAt

    /**
     * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to be
     * issued.
     */
    @JsonProperty("scheduled_issue_at") @ExcludeMissing fun _scheduledIssueAt() = scheduledIssueAt

    @JsonProperty("auto_collection") @ExcludeMissing fun _autoCollection() = autoCollection

    /**
     * If the invoice failed to issue, this will be the last time it failed to issue (even if it is
     * now in a different state.)
     */
    @JsonProperty("issue_failed_at") @ExcludeMissing fun _issueFailedAt() = issueFailedAt

    /**
     * If the invoice failed to sync, this will be the last time an external invoicing provider sync
     * was attempted. This field will always be `null` for invoices using Orb Invoicing.
     */
    @JsonProperty("sync_failed_at") @ExcludeMissing fun _syncFailedAt() = syncFailedAt

    /**
     * If payment was attempted on this invoice but failed, this will be the time of the most recent
     * attempt.
     */
    @JsonProperty("payment_failed_at") @ExcludeMissing fun _paymentFailedAt() = paymentFailedAt

    /**
     * If payment was attempted on this invoice, this will be the start time of the most recent
     * attempt. This field is especially useful for delayed-notification payment mechanisms (like
     * bank transfers), where payment can take 3 days or more.
     */
    @JsonProperty("payment_started_at") @ExcludeMissing fun _paymentStartedAt() = paymentStartedAt

    /**
     * This is the final amount required to be charged to the customer and reflects the application
     * of the customer balance to the `total` of the invoice.
     */
    @JsonProperty("amount_due") @ExcludeMissing fun _amountDue() = amountDue

    /** The creation time of the resource in Orb. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** An ISO 4217 currency string or `credits` */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    @JsonProperty("customer") @ExcludeMissing fun _customer() = customer

    /**
     * This field is deprecated in favor of `discounts`. If a `discounts` list is provided, the
     * first discount in the list will be returned. If the list is empty, `None` will be returned.
     */
    @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

    @JsonProperty("discounts") @ExcludeMissing fun _discounts() = discounts

    /** When the invoice payment is due. */
    @JsonProperty("due_date") @ExcludeMissing fun _dueDate() = dueDate

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The link to download the PDF representation of the `Invoice`. */
    @JsonProperty("invoice_pdf") @ExcludeMissing fun _invoicePdf() = invoicePdf

    /**
     * Automatically generated invoice number to help track and reconcile invoices. Invoice numbers
     * have a prefix such as `RFOBWG`. These can be sequential per account or customer.
     */
    @JsonProperty("invoice_number") @ExcludeMissing fun _invoiceNumber() = invoiceNumber

    @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

    @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

    @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

    @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

    /** The breakdown of prices in this invoice. */
    @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

    @JsonProperty("subscription") @ExcludeMissing fun _subscription() = subscription

    /** The total before any discounts and minimums are applied. */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

    /** The total after any minimums and discounts have been applied. */
    @JsonProperty("total") @ExcludeMissing fun _total() = total

    @JsonProperty("customer_balance_transactions")
    @ExcludeMissing
    fun _customerBalanceTransactions() = customerBalanceTransactions

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("invoice_source") @ExcludeMissing fun _invoiceSource() = invoiceSource

    @JsonProperty("shipping_address") @ExcludeMissing fun _shippingAddress() = shippingAddress

    @JsonProperty("billing_address") @ExcludeMissing fun _billingAddress() = billingAddress

    /**
     * A URL for the customer-facing invoice portal. This URL expires 30 days after the invoice's
     * due date, or 60 days after being re-generated through the UI.
     */
    @JsonProperty("hosted_invoice_url") @ExcludeMissing fun _hostedInvoiceUrl() = hostedInvoiceUrl

    /**
     * This is true if the invoice will be automatically issued in the future, and false otherwise.
     */
    @JsonProperty("will_auto_issue") @ExcludeMissing fun _willAutoIssue() = willAutoIssue

    /**
     * If the invoice has a status of `draft`, this will be the time that the invoice will be
     * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice will
     * automatically begin issuing at this time.
     */
    @JsonProperty("eligible_to_issue_at")
    @ExcludeMissing
    fun _eligibleToIssueAt() = eligibleToIssueAt

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
    @JsonProperty("customer_tax_id") @ExcludeMissing fun _customerTaxId() = customerTaxId

    /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
    @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

    /** A list of credit notes associated with the invoice */
    @JsonProperty("credit_notes") @ExcludeMissing fun _creditNotes() = creditNotes

    /** A list of payment attempts associated with the invoice */
    @JsonProperty("payment_attempts") @ExcludeMissing fun _paymentAttempts() = paymentAttempts

    /** The scheduled date of the invoice */
    @JsonProperty("target_date") @ExcludeMissing fun _targetDate() = targetDate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): InvoiceFetchUpcomingResponse = apply {
        if (!validated) {
            metadata().validate()
            voidedAt()
            paidAt()
            issuedAt()
            scheduledIssueAt()
            autoCollection().validate()
            issueFailedAt()
            syncFailedAt()
            paymentFailedAt()
            paymentStartedAt()
            amountDue()
            createdAt()
            currency()
            customer().validate()
            discounts()
            dueDate()
            id()
            invoicePdf()
            invoiceNumber()
            minimum()?.validate()
            minimumAmount()
            maximum()?.validate()
            maximumAmount()
            lineItems().forEach { it.validate() }
            subscription()?.validate()
            subtotal()
            total()
            customerBalanceTransactions().forEach { it.validate() }
            status()
            invoiceSource()
            shippingAddress()?.validate()
            billingAddress()?.validate()
            hostedInvoiceUrl()
            willAutoIssue()
            eligibleToIssueAt()
            customerTaxId()?.validate()
            memo()
            creditNotes().forEach { it.validate() }
            paymentAttempts().forEach { it.validate() }
            targetDate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var voidedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var paidAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var issuedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var scheduledIssueAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var autoCollection: JsonField<AutoCollection> = JsonMissing.of()
        private var issueFailedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var syncFailedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var paymentFailedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var paymentStartedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var amountDue: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var customer: JsonField<Customer> = JsonMissing.of()
        private var discount: JsonValue = JsonMissing.of()
        private var discounts: JsonField<List<InvoiceLevelDiscount>> = JsonMissing.of()
        private var dueDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var invoicePdf: JsonField<String> = JsonMissing.of()
        private var invoiceNumber: JsonField<String> = JsonMissing.of()
        private var minimum: JsonField<Minimum> = JsonMissing.of()
        private var minimumAmount: JsonField<String> = JsonMissing.of()
        private var maximum: JsonField<Maximum> = JsonMissing.of()
        private var maximumAmount: JsonField<String> = JsonMissing.of()
        private var lineItems: JsonField<List<LineItem>> = JsonMissing.of()
        private var subscription: JsonField<Subscription> = JsonMissing.of()
        private var subtotal: JsonField<String> = JsonMissing.of()
        private var total: JsonField<String> = JsonMissing.of()
        private var customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>> =
            JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var invoiceSource: JsonField<InvoiceSource> = JsonMissing.of()
        private var shippingAddress: JsonField<ShippingAddress> = JsonMissing.of()
        private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
        private var hostedInvoiceUrl: JsonField<String> = JsonMissing.of()
        private var willAutoIssue: JsonField<Boolean> = JsonMissing.of()
        private var eligibleToIssueAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customerTaxId: JsonField<CustomerTaxId> = JsonMissing.of()
        private var memo: JsonField<String> = JsonMissing.of()
        private var creditNotes: JsonField<List<CreditNote>> = JsonMissing.of()
        private var paymentAttempts: JsonField<List<PaymentAttempt>> = JsonMissing.of()
        private var targetDate: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invoiceFetchUpcomingResponse: InvoiceFetchUpcomingResponse) = apply {
            metadata = invoiceFetchUpcomingResponse.metadata
            voidedAt = invoiceFetchUpcomingResponse.voidedAt
            paidAt = invoiceFetchUpcomingResponse.paidAt
            issuedAt = invoiceFetchUpcomingResponse.issuedAt
            scheduledIssueAt = invoiceFetchUpcomingResponse.scheduledIssueAt
            autoCollection = invoiceFetchUpcomingResponse.autoCollection
            issueFailedAt = invoiceFetchUpcomingResponse.issueFailedAt
            syncFailedAt = invoiceFetchUpcomingResponse.syncFailedAt
            paymentFailedAt = invoiceFetchUpcomingResponse.paymentFailedAt
            paymentStartedAt = invoiceFetchUpcomingResponse.paymentStartedAt
            amountDue = invoiceFetchUpcomingResponse.amountDue
            createdAt = invoiceFetchUpcomingResponse.createdAt
            currency = invoiceFetchUpcomingResponse.currency
            customer = invoiceFetchUpcomingResponse.customer
            discount = invoiceFetchUpcomingResponse.discount
            discounts = invoiceFetchUpcomingResponse.discounts
            dueDate = invoiceFetchUpcomingResponse.dueDate
            id = invoiceFetchUpcomingResponse.id
            invoicePdf = invoiceFetchUpcomingResponse.invoicePdf
            invoiceNumber = invoiceFetchUpcomingResponse.invoiceNumber
            minimum = invoiceFetchUpcomingResponse.minimum
            minimumAmount = invoiceFetchUpcomingResponse.minimumAmount
            maximum = invoiceFetchUpcomingResponse.maximum
            maximumAmount = invoiceFetchUpcomingResponse.maximumAmount
            lineItems = invoiceFetchUpcomingResponse.lineItems
            subscription = invoiceFetchUpcomingResponse.subscription
            subtotal = invoiceFetchUpcomingResponse.subtotal
            total = invoiceFetchUpcomingResponse.total
            customerBalanceTransactions = invoiceFetchUpcomingResponse.customerBalanceTransactions
            status = invoiceFetchUpcomingResponse.status
            invoiceSource = invoiceFetchUpcomingResponse.invoiceSource
            shippingAddress = invoiceFetchUpcomingResponse.shippingAddress
            billingAddress = invoiceFetchUpcomingResponse.billingAddress
            hostedInvoiceUrl = invoiceFetchUpcomingResponse.hostedInvoiceUrl
            willAutoIssue = invoiceFetchUpcomingResponse.willAutoIssue
            eligibleToIssueAt = invoiceFetchUpcomingResponse.eligibleToIssueAt
            customerTaxId = invoiceFetchUpcomingResponse.customerTaxId
            memo = invoiceFetchUpcomingResponse.memo
            creditNotes = invoiceFetchUpcomingResponse.creditNotes
            paymentAttempts = invoiceFetchUpcomingResponse.paymentAttempts
            targetDate = invoiceFetchUpcomingResponse.targetDate
            additionalProperties = invoiceFetchUpcomingResponse.additionalProperties.toMutableMap()
        }

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
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        fun voidedAt(voidedAt: OffsetDateTime) = voidedAt(JsonField.of(voidedAt))

        /**
         * If the invoice has a status of `void`, this gives a timestamp when the invoice was
         * voided.
         */
        @JsonProperty("voided_at")
        @ExcludeMissing
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        fun paidAt(paidAt: OffsetDateTime) = paidAt(JsonField.of(paidAt))

        /**
         * If the invoice has a status of `paid`, this gives a timestamp when the invoice was paid.
         */
        @JsonProperty("paid_at")
        @ExcludeMissing
        fun paidAt(paidAt: JsonField<OffsetDateTime>) = apply { this.paidAt = paidAt }

        /**
         * If the invoice has been issued, this will be the time it transitioned to `issued` (even
         * if it is now in a different state.)
         */
        fun issuedAt(issuedAt: OffsetDateTime) = issuedAt(JsonField.of(issuedAt))

        /**
         * If the invoice has been issued, this will be the time it transitioned to `issued` (even
         * if it is now in a different state.)
         */
        @JsonProperty("issued_at")
        @ExcludeMissing
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

        /**
         * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to
         * be issued.
         */
        fun scheduledIssueAt(scheduledIssueAt: OffsetDateTime) =
            scheduledIssueAt(JsonField.of(scheduledIssueAt))

        /**
         * If the invoice is in draft, this timestamp will reflect when the invoice is scheduled to
         * be issued.
         */
        @JsonProperty("scheduled_issue_at")
        @ExcludeMissing
        fun scheduledIssueAt(scheduledIssueAt: JsonField<OffsetDateTime>) = apply {
            this.scheduledIssueAt = scheduledIssueAt
        }

        fun autoCollection(autoCollection: AutoCollection) =
            autoCollection(JsonField.of(autoCollection))

        @JsonProperty("auto_collection")
        @ExcludeMissing
        fun autoCollection(autoCollection: JsonField<AutoCollection>) = apply {
            this.autoCollection = autoCollection
        }

        /**
         * If the invoice failed to issue, this will be the last time it failed to issue (even if it
         * is now in a different state.)
         */
        fun issueFailedAt(issueFailedAt: OffsetDateTime) =
            issueFailedAt(JsonField.of(issueFailedAt))

        /**
         * If the invoice failed to issue, this will be the last time it failed to issue (even if it
         * is now in a different state.)
         */
        @JsonProperty("issue_failed_at")
        @ExcludeMissing
        fun issueFailedAt(issueFailedAt: JsonField<OffsetDateTime>) = apply {
            this.issueFailedAt = issueFailedAt
        }

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        fun syncFailedAt(syncFailedAt: OffsetDateTime) = syncFailedAt(JsonField.of(syncFailedAt))

        /**
         * If the invoice failed to sync, this will be the last time an external invoicing provider
         * sync was attempted. This field will always be `null` for invoices using Orb Invoicing.
         */
        @JsonProperty("sync_failed_at")
        @ExcludeMissing
        fun syncFailedAt(syncFailedAt: JsonField<OffsetDateTime>) = apply {
            this.syncFailedAt = syncFailedAt
        }

        /**
         * If payment was attempted on this invoice but failed, this will be the time of the most
         * recent attempt.
         */
        fun paymentFailedAt(paymentFailedAt: OffsetDateTime) =
            paymentFailedAt(JsonField.of(paymentFailedAt))

        /**
         * If payment was attempted on this invoice but failed, this will be the time of the most
         * recent attempt.
         */
        @JsonProperty("payment_failed_at")
        @ExcludeMissing
        fun paymentFailedAt(paymentFailedAt: JsonField<OffsetDateTime>) = apply {
            this.paymentFailedAt = paymentFailedAt
        }

        /**
         * If payment was attempted on this invoice, this will be the start time of the most recent
         * attempt. This field is especially useful for delayed-notification payment mechanisms
         * (like bank transfers), where payment can take 3 days or more.
         */
        fun paymentStartedAt(paymentStartedAt: OffsetDateTime) =
            paymentStartedAt(JsonField.of(paymentStartedAt))

        /**
         * If payment was attempted on this invoice, this will be the start time of the most recent
         * attempt. This field is especially useful for delayed-notification payment mechanisms
         * (like bank transfers), where payment can take 3 days or more.
         */
        @JsonProperty("payment_started_at")
        @ExcludeMissing
        fun paymentStartedAt(paymentStartedAt: JsonField<OffsetDateTime>) = apply {
            this.paymentStartedAt = paymentStartedAt
        }

        /**
         * This is the final amount required to be charged to the customer and reflects the
         * application of the customer balance to the `total` of the invoice.
         */
        fun amountDue(amountDue: String) = amountDue(JsonField.of(amountDue))

        /**
         * This is the final amount required to be charged to the customer and reflects the
         * application of the customer balance to the `total` of the invoice.
         */
        @JsonProperty("amount_due")
        @ExcludeMissing
        fun amountDue(amountDue: JsonField<String>) = apply { this.amountDue = amountDue }

        /** The creation time of the resource in Orb. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The creation time of the resource in Orb. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** An ISO 4217 currency string or `credits` */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** An ISO 4217 currency string or `credits` */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        @JsonProperty("customer")
        @ExcludeMissing
        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        /**
         * This field is deprecated in favor of `discounts`. If a `discounts` list is provided, the
         * first discount in the list will be returned. If the list is empty, `None` will be
         * returned.
         */
        @JsonProperty("discount")
        @ExcludeMissing
        fun discount(discount: JsonValue) = apply { this.discount = discount }

        fun discounts(discounts: List<InvoiceLevelDiscount>) = discounts(JsonField.of(discounts))

        @JsonProperty("discounts")
        @ExcludeMissing
        fun discounts(discounts: JsonField<List<InvoiceLevelDiscount>>) = apply {
            this.discounts = discounts
        }

        /** When the invoice payment is due. */
        fun dueDate(dueDate: OffsetDateTime) = dueDate(JsonField.of(dueDate))

        /** When the invoice payment is due. */
        @JsonProperty("due_date")
        @ExcludeMissing
        fun dueDate(dueDate: JsonField<OffsetDateTime>) = apply { this.dueDate = dueDate }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The link to download the PDF representation of the `Invoice`. */
        fun invoicePdf(invoicePdf: String) = invoicePdf(JsonField.of(invoicePdf))

        /** The link to download the PDF representation of the `Invoice`. */
        @JsonProperty("invoice_pdf")
        @ExcludeMissing
        fun invoicePdf(invoicePdf: JsonField<String>) = apply { this.invoicePdf = invoicePdf }

        /**
         * Automatically generated invoice number to help track and reconcile invoices. Invoice
         * numbers have a prefix such as `RFOBWG`. These can be sequential per account or customer.
         */
        fun invoiceNumber(invoiceNumber: String) = invoiceNumber(JsonField.of(invoiceNumber))

        /**
         * Automatically generated invoice number to help track and reconcile invoices. Invoice
         * numbers have a prefix such as `RFOBWG`. These can be sequential per account or customer.
         */
        @JsonProperty("invoice_number")
        @ExcludeMissing
        fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
            this.invoiceNumber = invoiceNumber
        }

        fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

        @JsonProperty("minimum")
        @ExcludeMissing
        fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

        fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun minimumAmount(minimumAmount: JsonField<String>) = apply {
            this.minimumAmount = minimumAmount
        }

        fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

        @JsonProperty("maximum")
        @ExcludeMissing
        fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

        fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun maximumAmount(maximumAmount: JsonField<String>) = apply {
            this.maximumAmount = maximumAmount
        }

        /** The breakdown of prices in this invoice. */
        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /** The breakdown of prices in this invoice. */
        @JsonProperty("line_items")
        @ExcludeMissing
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { this.lineItems = lineItems }

        fun subscription(subscription: Subscription) = subscription(JsonField.of(subscription))

        @JsonProperty("subscription")
        @ExcludeMissing
        fun subscription(subscription: JsonField<Subscription>) = apply {
            this.subscription = subscription
        }

        /** The total before any discounts and minimums are applied. */
        fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

        /** The total before any discounts and minimums are applied. */
        @JsonProperty("subtotal")
        @ExcludeMissing
        fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

        /** The total after any minimums and discounts have been applied. */
        fun total(total: String) = total(JsonField.of(total))

        /** The total after any minimums and discounts have been applied. */
        @JsonProperty("total")
        @ExcludeMissing
        fun total(total: JsonField<String>) = apply { this.total = total }

        fun customerBalanceTransactions(
            customerBalanceTransactions: List<CustomerBalanceTransaction>
        ) = customerBalanceTransactions(JsonField.of(customerBalanceTransactions))

        @JsonProperty("customer_balance_transactions")
        @ExcludeMissing
        fun customerBalanceTransactions(
            customerBalanceTransactions: JsonField<List<CustomerBalanceTransaction>>
        ) = apply { this.customerBalanceTransactions = customerBalanceTransactions }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun invoiceSource(invoiceSource: InvoiceSource) = invoiceSource(JsonField.of(invoiceSource))

        @JsonProperty("invoice_source")
        @ExcludeMissing
        fun invoiceSource(invoiceSource: JsonField<InvoiceSource>) = apply {
            this.invoiceSource = invoiceSource
        }

        fun shippingAddress(shippingAddress: ShippingAddress) =
            shippingAddress(JsonField.of(shippingAddress))

        @JsonProperty("shipping_address")
        @ExcludeMissing
        fun shippingAddress(shippingAddress: JsonField<ShippingAddress>) = apply {
            this.shippingAddress = shippingAddress
        }

        fun billingAddress(billingAddress: BillingAddress) =
            billingAddress(JsonField.of(billingAddress))

        @JsonProperty("billing_address")
        @ExcludeMissing
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        /**
         * A URL for the customer-facing invoice portal. This URL expires 30 days after the
         * invoice's due date, or 60 days after being re-generated through the UI.
         */
        fun hostedInvoiceUrl(hostedInvoiceUrl: String) =
            hostedInvoiceUrl(JsonField.of(hostedInvoiceUrl))

        /**
         * A URL for the customer-facing invoice portal. This URL expires 30 days after the
         * invoice's due date, or 60 days after being re-generated through the UI.
         */
        @JsonProperty("hosted_invoice_url")
        @ExcludeMissing
        fun hostedInvoiceUrl(hostedInvoiceUrl: JsonField<String>) = apply {
            this.hostedInvoiceUrl = hostedInvoiceUrl
        }

        /**
         * This is true if the invoice will be automatically issued in the future, and false
         * otherwise.
         */
        fun willAutoIssue(willAutoIssue: Boolean) = willAutoIssue(JsonField.of(willAutoIssue))

        /**
         * This is true if the invoice will be automatically issued in the future, and false
         * otherwise.
         */
        @JsonProperty("will_auto_issue")
        @ExcludeMissing
        fun willAutoIssue(willAutoIssue: JsonField<Boolean>) = apply {
            this.willAutoIssue = willAutoIssue
        }

        /**
         * If the invoice has a status of `draft`, this will be the time that the invoice will be
         * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice
         * will automatically begin issuing at this time.
         */
        fun eligibleToIssueAt(eligibleToIssueAt: OffsetDateTime) =
            eligibleToIssueAt(JsonField.of(eligibleToIssueAt))

        /**
         * If the invoice has a status of `draft`, this will be the time that the invoice will be
         * eligible to be issued, otherwise it will be `null`. If `auto-issue` is true, the invoice
         * will automatically begin issuing at this time.
         */
        @JsonProperty("eligible_to_issue_at")
        @ExcludeMissing
        fun eligibleToIssueAt(eligibleToIssueAt: JsonField<OffsetDateTime>) = apply {
            this.eligibleToIssueAt = eligibleToIssueAt
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
        fun customerTaxId(customerTaxId: CustomerTaxId) = customerTaxId(JsonField.of(customerTaxId))

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
        @JsonProperty("customer_tax_id")
        @ExcludeMissing
        fun customerTaxId(customerTaxId: JsonField<CustomerTaxId>) = apply {
            this.customerTaxId = customerTaxId
        }

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        fun memo(memo: String) = memo(JsonField.of(memo))

        /** Free-form text which is available on the invoice PDF and the Orb invoice portal. */
        @JsonProperty("memo")
        @ExcludeMissing
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        /** A list of credit notes associated with the invoice */
        fun creditNotes(creditNotes: List<CreditNote>) = creditNotes(JsonField.of(creditNotes))

        /** A list of credit notes associated with the invoice */
        @JsonProperty("credit_notes")
        @ExcludeMissing
        fun creditNotes(creditNotes: JsonField<List<CreditNote>>) = apply {
            this.creditNotes = creditNotes
        }

        /** A list of payment attempts associated with the invoice */
        fun paymentAttempts(paymentAttempts: List<PaymentAttempt>) =
            paymentAttempts(JsonField.of(paymentAttempts))

        /** A list of payment attempts associated with the invoice */
        @JsonProperty("payment_attempts")
        @ExcludeMissing
        fun paymentAttempts(paymentAttempts: JsonField<List<PaymentAttempt>>) = apply {
            this.paymentAttempts = paymentAttempts
        }

        /** The scheduled date of the invoice */
        fun targetDate(targetDate: OffsetDateTime) = targetDate(JsonField.of(targetDate))

        /** The scheduled date of the invoice */
        @JsonProperty("target_date")
        @ExcludeMissing
        fun targetDate(targetDate: JsonField<OffsetDateTime>) = apply {
            this.targetDate = targetDate
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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
                metadata,
                voidedAt,
                paidAt,
                issuedAt,
                scheduledIssueAt,
                autoCollection,
                issueFailedAt,
                syncFailedAt,
                paymentFailedAt,
                paymentStartedAt,
                amountDue,
                createdAt,
                currency,
                customer,
                discount,
                discounts.map { it.toImmutable() },
                dueDate,
                id,
                invoicePdf,
                invoiceNumber,
                minimum,
                minimumAmount,
                maximum,
                maximumAmount,
                lineItems.map { it.toImmutable() },
                subscription,
                subtotal,
                total,
                customerBalanceTransactions.map { it.toImmutable() },
                status,
                invoiceSource,
                shippingAddress,
                billingAddress,
                hostedInvoiceUrl,
                willAutoIssue,
                eligibleToIssueAt,
                customerTaxId,
                memo,
                creditNotes.map { it.toImmutable() },
                paymentAttempts.map { it.toImmutable() },
                targetDate,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = AutoCollection.Builder::class)
    @NoAutoDetect
    class AutoCollection
    private constructor(
        private val nextAttemptAt: JsonField<OffsetDateTime>,
        private val previouslyAttemptedAt: JsonField<OffsetDateTime>,
        private val enabled: JsonField<Boolean>,
        private val numAttempts: JsonField<Long>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * If the invoice is scheduled for auto-collection, this field will reflect when the next
         * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for
         * this invoice, this field will be `null`.
         */
        fun nextAttemptAt(): OffsetDateTime? = nextAttemptAt.getNullable("next_attempt_at")

        /**
         * If Orb has ever attempted payment auto-collection for this invoice, this field will
         * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be
         * used to tell whether the invoice is currently in dunning (that is,
         * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
         * dunning has been exhausted (`previously_attempted_at` is non-null, but
         * `next_attempt_time` is null).
         */
        fun previouslyAttemptedAt(): OffsetDateTime? =
            previouslyAttemptedAt.getNullable("previously_attempted_at")

        /** True only if auto-collection is enabled for this invoice. */
        fun enabled(): Boolean? = enabled.getNullable("enabled")

        /** Number of auto-collection payment attempts. */
        fun numAttempts(): Long? = numAttempts.getNullable("num_attempts")

        /**
         * If the invoice is scheduled for auto-collection, this field will reflect when the next
         * attempt will occur. If dunning has been exhausted, or auto-collection is not enabled for
         * this invoice, this field will be `null`.
         */
        @JsonProperty("next_attempt_at") @ExcludeMissing fun _nextAttemptAt() = nextAttemptAt

        /**
         * If Orb has ever attempted payment auto-collection for this invoice, this field will
         * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can be
         * used to tell whether the invoice is currently in dunning (that is,
         * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
         * dunning has been exhausted (`previously_attempted_at` is non-null, but
         * `next_attempt_time` is null).
         */
        @JsonProperty("previously_attempted_at")
        @ExcludeMissing
        fun _previouslyAttemptedAt() = previouslyAttemptedAt

        /** True only if auto-collection is enabled for this invoice. */
        @JsonProperty("enabled") @ExcludeMissing fun _enabled() = enabled

        /** Number of auto-collection payment attempts. */
        @JsonProperty("num_attempts") @ExcludeMissing fun _numAttempts() = numAttempts

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AutoCollection = apply {
            if (!validated) {
                nextAttemptAt()
                previouslyAttemptedAt()
                enabled()
                numAttempts()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var nextAttemptAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var previouslyAttemptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var enabled: JsonField<Boolean> = JsonMissing.of()
            private var numAttempts: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(autoCollection: AutoCollection) = apply {
                nextAttemptAt = autoCollection.nextAttemptAt
                previouslyAttemptedAt = autoCollection.previouslyAttemptedAt
                enabled = autoCollection.enabled
                numAttempts = autoCollection.numAttempts
                additionalProperties = autoCollection.additionalProperties.toMutableMap()
            }

            /**
             * If the invoice is scheduled for auto-collection, this field will reflect when the
             * next attempt will occur. If dunning has been exhausted, or auto-collection is not
             * enabled for this invoice, this field will be `null`.
             */
            fun nextAttemptAt(nextAttemptAt: OffsetDateTime) =
                nextAttemptAt(JsonField.of(nextAttemptAt))

            /**
             * If the invoice is scheduled for auto-collection, this field will reflect when the
             * next attempt will occur. If dunning has been exhausted, or auto-collection is not
             * enabled for this invoice, this field will be `null`.
             */
            @JsonProperty("next_attempt_at")
            @ExcludeMissing
            fun nextAttemptAt(nextAttemptAt: JsonField<OffsetDateTime>) = apply {
                this.nextAttemptAt = nextAttemptAt
            }

            /**
             * If Orb has ever attempted payment auto-collection for this invoice, this field will
             * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can
             * be used to tell whether the invoice is currently in dunning (that is,
             * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
             * dunning has been exhausted (`previously_attempted_at` is non-null, but
             * `next_attempt_time` is null).
             */
            fun previouslyAttemptedAt(previouslyAttemptedAt: OffsetDateTime) =
                previouslyAttemptedAt(JsonField.of(previouslyAttemptedAt))

            /**
             * If Orb has ever attempted payment auto-collection for this invoice, this field will
             * reflect when that attempt occurred. In conjunction with `next_attempt_at`, this can
             * be used to tell whether the invoice is currently in dunning (that is,
             * `previously_attempted_at` is non-null, and `next_attempt_time` is non-null), or if
             * dunning has been exhausted (`previously_attempted_at` is non-null, but
             * `next_attempt_time` is null).
             */
            @JsonProperty("previously_attempted_at")
            @ExcludeMissing
            fun previouslyAttemptedAt(previouslyAttemptedAt: JsonField<OffsetDateTime>) = apply {
                this.previouslyAttemptedAt = previouslyAttemptedAt
            }

            /** True only if auto-collection is enabled for this invoice. */
            fun enabled(enabled: Boolean) = enabled(JsonField.of(enabled))

            /** True only if auto-collection is enabled for this invoice. */
            @JsonProperty("enabled")
            @ExcludeMissing
            fun enabled(enabled: JsonField<Boolean>) = apply { this.enabled = enabled }

            /** Number of auto-collection payment attempts. */
            fun numAttempts(numAttempts: Long) = numAttempts(JsonField.of(numAttempts))

            /** Number of auto-collection payment attempts. */
            @JsonProperty("num_attempts")
            @ExcludeMissing
            fun numAttempts(numAttempts: JsonField<Long>) = apply { this.numAttempts = numAttempts }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): AutoCollection =
                AutoCollection(
                    nextAttemptAt,
                    previouslyAttemptedAt,
                    enabled,
                    numAttempts,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AutoCollection && nextAttemptAt == other.nextAttemptAt && previouslyAttemptedAt == other.previouslyAttemptedAt && enabled == other.enabled && numAttempts == other.numAttempts && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(nextAttemptAt, previouslyAttemptedAt, enabled, numAttempts, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AutoCollection{nextAttemptAt=$nextAttemptAt, previouslyAttemptedAt=$previouslyAttemptedAt, enabled=$enabled, numAttempts=$numAttempts, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = BillingAddress.Builder::class)
    @NoAutoDetect
    class BillingAddress
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        fun city(): String? = city.getNullable("city")

        fun state(): String? = state.getNullable("state")

        fun postalCode(): String? = postalCode.getNullable("postal_code")

        fun country(): String? = country.getNullable("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        @JsonProperty("city") @ExcludeMissing fun _city() = city

        @JsonProperty("state") @ExcludeMissing fun _state() = state

        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BillingAddress = apply {
            if (!validated) {
                line1()
                line2()
                city()
                state()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billingAddress: BillingAddress) = apply {
                line1 = billingAddress.line1
                line2 = billingAddress.line2
                city = billingAddress.city
                state = billingAddress.state
                postalCode = billingAddress.postalCode
                country = billingAddress.country
                additionalProperties = billingAddress.additionalProperties.toMutableMap()
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            fun city(city: String) = city(JsonField.of(city))

            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun state(state: String) = state(JsonField.of(state))

            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun country(country: String) = country(JsonField.of(country))

            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

    @JsonDeserialize(builder = CreditNote.Builder::class)
    @NoAutoDetect
    class CreditNote
    private constructor(
        private val id: JsonField<String>,
        private val creditNoteNumber: JsonField<String>,
        private val reason: JsonField<String>,
        private val total: JsonField<String>,
        private val voidedAt: JsonField<OffsetDateTime>,
        private val type: JsonField<String>,
        private val memo: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun id(): String = id.getRequired("id")

        fun creditNoteNumber(): String = creditNoteNumber.getRequired("credit_note_number")

        fun reason(): String = reason.getRequired("reason")

        fun total(): String = total.getRequired("total")

        /**
         * If the credit note has a status of `void`, this gives a timestamp when the credit note
         * was voided.
         */
        fun voidedAt(): OffsetDateTime? = voidedAt.getNullable("voided_at")

        fun type(): String = type.getRequired("type")

        /** An optional memo supplied on the credit note. */
        fun memo(): String? = memo.getNullable("memo")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("credit_note_number")
        @ExcludeMissing
        fun _creditNoteNumber() = creditNoteNumber

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("total") @ExcludeMissing fun _total() = total

        /**
         * If the credit note has a status of `void`, this gives a timestamp when the credit note
         * was voided.
         */
        @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt() = voidedAt

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        /** An optional memo supplied on the credit note. */
        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditNote = apply {
            if (!validated) {
                id()
                creditNoteNumber()
                reason()
                total()
                voidedAt()
                type()
                memo()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var creditNoteNumber: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var total: JsonField<String> = JsonMissing.of()
            private var voidedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var type: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(creditNote: CreditNote) = apply {
                id = creditNote.id
                creditNoteNumber = creditNote.creditNoteNumber
                reason = creditNote.reason
                total = creditNote.total
                voidedAt = creditNote.voidedAt
                type = creditNote.type
                memo = creditNote.memo
                additionalProperties = creditNote.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun creditNoteNumber(creditNoteNumber: String) =
                creditNoteNumber(JsonField.of(creditNoteNumber))

            @JsonProperty("credit_note_number")
            @ExcludeMissing
            fun creditNoteNumber(creditNoteNumber: JsonField<String>) = apply {
                this.creditNoteNumber = creditNoteNumber
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun total(total: String) = total(JsonField.of(total))

            @JsonProperty("total")
            @ExcludeMissing
            fun total(total: JsonField<String>) = apply { this.total = total }

            /**
             * If the credit note has a status of `void`, this gives a timestamp when the credit
             * note was voided.
             */
            fun voidedAt(voidedAt: OffsetDateTime) = voidedAt(JsonField.of(voidedAt))

            /**
             * If the credit note has a status of `void`, this gives a timestamp when the credit
             * note was voided.
             */
            @JsonProperty("voided_at")
            @ExcludeMissing
            fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

            fun type(type: String) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<String>) = apply { this.type = type }

            /** An optional memo supplied on the credit note. */
            fun memo(memo: String) = memo(JsonField.of(memo))

            /** An optional memo supplied on the credit note. */
            @JsonProperty("memo")
            @ExcludeMissing
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): CreditNote =
                CreditNote(
                    id,
                    creditNoteNumber,
                    reason,
                    total,
                    voidedAt,
                    type,
                    memo,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditNote && id == other.id && creditNoteNumber == other.creditNoteNumber && reason == other.reason && total == other.total && voidedAt == other.voidedAt && type == other.type && memo == other.memo && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, creditNoteNumber, reason, total, voidedAt, type, memo, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditNote{id=$id, creditNoteNumber=$creditNoteNumber, reason=$reason, total=$total, voidedAt=$voidedAt, type=$type, memo=$memo, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Customer.Builder::class)
    @NoAutoDetect
    class Customer
    private constructor(
        private val id: JsonField<String>,
        private val externalCustomerId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun id(): String = id.getRequired("id")

        fun externalCustomerId(): String? = externalCustomerId.getNullable("external_customer_id")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("external_customer_id")
        @ExcludeMissing
        fun _externalCustomerId() = externalCustomerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (!validated) {
                id()
                externalCustomerId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var externalCustomerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customer: Customer) = apply {
                id = customer.id
                externalCustomerId = customer.externalCustomerId
                additionalProperties = customer.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun externalCustomerId(externalCustomerId: String) =
                externalCustomerId(JsonField.of(externalCustomerId))

            @JsonProperty("external_customer_id")
            @ExcludeMissing
            fun externalCustomerId(externalCustomerId: JsonField<String>) = apply {
                this.externalCustomerId = externalCustomerId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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
                    id,
                    externalCustomerId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Customer && id == other.id && externalCustomerId == other.externalCustomerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, externalCustomerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customer{id=$id, externalCustomerId=$externalCustomerId, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CustomerBalanceTransaction.Builder::class)
    @NoAutoDetect
    class CustomerBalanceTransaction
    private constructor(
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val startingBalance: JsonField<String>,
        private val endingBalance: JsonField<String>,
        private val amount: JsonField<String>,
        private val action: JsonField<Action>,
        private val description: JsonField<String>,
        private val invoice: JsonField<Invoice>,
        private val type: JsonField<Type>,
        private val creditNote: JsonField<CreditNote>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** A unique id for this transaction. */
        fun id(): String = id.getRequired("id")

        /** The creation time of this transaction. */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun startingBalance(): String = startingBalance.getRequired("starting_balance")

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        fun endingBalance(): String = endingBalance.getRequired("ending_balance")

        /** The value of the amount changed in the transaction. */
        fun amount(): String = amount.getRequired("amount")

        fun action(): Action = action.getRequired("action")

        /** An optional description provided for manual customer balance adjustments. */
        fun description(): String? = description.getNullable("description")

        fun invoice(): Invoice? = invoice.getNullable("invoice")

        fun type(): Type = type.getRequired("type")

        fun creditNote(): CreditNote? = creditNote.getNullable("credit_note")

        /** A unique id for this transaction. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The creation time of this transaction. */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /**
         * The original value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        @JsonProperty("starting_balance") @ExcludeMissing fun _startingBalance() = startingBalance

        /**
         * The new value of the customer's balance prior to the transaction, in the customer's
         * currency.
         */
        @JsonProperty("ending_balance") @ExcludeMissing fun _endingBalance() = endingBalance

        /** The value of the amount changed in the transaction. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("action") @ExcludeMissing fun _action() = action

        /** An optional description provided for manual customer balance adjustments. */
        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("invoice") @ExcludeMissing fun _invoice() = invoice

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("credit_note") @ExcludeMissing fun _creditNote() = creditNote

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerBalanceTransaction = apply {
            if (!validated) {
                id()
                createdAt()
                startingBalance()
                endingBalance()
                amount()
                action()
                description()
                invoice()?.validate()
                type()
                creditNote()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var startingBalance: JsonField<String> = JsonMissing.of()
            private var endingBalance: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<String> = JsonMissing.of()
            private var action: JsonField<Action> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var invoice: JsonField<Invoice> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var creditNote: JsonField<CreditNote> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customerBalanceTransaction: CustomerBalanceTransaction) = apply {
                id = customerBalanceTransaction.id
                createdAt = customerBalanceTransaction.createdAt
                startingBalance = customerBalanceTransaction.startingBalance
                endingBalance = customerBalanceTransaction.endingBalance
                amount = customerBalanceTransaction.amount
                action = customerBalanceTransaction.action
                description = customerBalanceTransaction.description
                invoice = customerBalanceTransaction.invoice
                type = customerBalanceTransaction.type
                creditNote = customerBalanceTransaction.creditNote
                additionalProperties =
                    customerBalanceTransaction.additionalProperties.toMutableMap()
            }

            /** A unique id for this transaction. */
            fun id(id: String) = id(JsonField.of(id))

            /** A unique id for this transaction. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The creation time of this transaction. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /** The creation time of this transaction. */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * The original value of the customer's balance prior to the transaction, in the
             * customer's currency.
             */
            fun startingBalance(startingBalance: String) =
                startingBalance(JsonField.of(startingBalance))

            /**
             * The original value of the customer's balance prior to the transaction, in the
             * customer's currency.
             */
            @JsonProperty("starting_balance")
            @ExcludeMissing
            fun startingBalance(startingBalance: JsonField<String>) = apply {
                this.startingBalance = startingBalance
            }

            /**
             * The new value of the customer's balance prior to the transaction, in the customer's
             * currency.
             */
            fun endingBalance(endingBalance: String) = endingBalance(JsonField.of(endingBalance))

            /**
             * The new value of the customer's balance prior to the transaction, in the customer's
             * currency.
             */
            @JsonProperty("ending_balance")
            @ExcludeMissing
            fun endingBalance(endingBalance: JsonField<String>) = apply {
                this.endingBalance = endingBalance
            }

            /** The value of the amount changed in the transaction. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The value of the amount changed in the transaction. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun action(action: Action) = action(JsonField.of(action))

            @JsonProperty("action")
            @ExcludeMissing
            fun action(action: JsonField<Action>) = apply { this.action = action }

            /** An optional description provided for manual customer balance adjustments. */
            fun description(description: String) = description(JsonField.of(description))

            /** An optional description provided for manual customer balance adjustments. */
            @JsonProperty("description")
            @ExcludeMissing
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun invoice(invoice: Invoice) = invoice(JsonField.of(invoice))

            @JsonProperty("invoice")
            @ExcludeMissing
            fun invoice(invoice: JsonField<Invoice>) = apply { this.invoice = invoice }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun creditNote(creditNote: CreditNote) = creditNote(JsonField.of(creditNote))

            @JsonProperty("credit_note")
            @ExcludeMissing
            fun creditNote(creditNote: JsonField<CreditNote>) = apply {
                this.creditNote = creditNote
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): CustomerBalanceTransaction =
                CustomerBalanceTransaction(
                    id,
                    createdAt,
                    startingBalance,
                    endingBalance,
                    amount,
                    action,
                    description,
                    invoice,
                    type,
                    creditNote,
                    additionalProperties.toImmutable(),
                )
        }

        class Action
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                fun of(value: String) = Action(JsonField.of(value))
            }

            enum class Known {
                APPLIED_TO_INVOICE,
                MANUAL_ADJUSTMENT,
                PRORATED_REFUND,
                REVERT_PRORATED_REFUND,
                RETURN_FROM_VOIDING,
                CREDIT_NOTE_APPLIED,
                CREDIT_NOTE_VOIDED,
                OVERPAYMENT_REFUND,
            }

            enum class Value {
                APPLIED_TO_INVOICE,
                MANUAL_ADJUSTMENT,
                PRORATED_REFUND,
                REVERT_PRORATED_REFUND,
                RETURN_FROM_VOIDING,
                CREDIT_NOTE_APPLIED,
                CREDIT_NOTE_VOIDED,
                OVERPAYMENT_REFUND,
                _UNKNOWN,
            }

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
                    else -> Value._UNKNOWN
                }

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
                    else -> throw OrbInvalidDataException("Unknown Action: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Action && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @JsonDeserialize(builder = CreditNote.Builder::class)
        @NoAutoDetect
        class CreditNote
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The id of the Credit note */
            fun id(): String = id.getRequired("id")

            /** The id of the Credit note */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditNote = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(creditNote: CreditNote) = apply {
                    id = creditNote.id
                    additionalProperties = creditNote.additionalProperties.toMutableMap()
                }

                /** The id of the Credit note */
                fun id(id: String) = id(JsonField.of(id))

                /** The id of the Credit note */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): CreditNote = CreditNote(id, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditNote && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditNote{id=$id, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Invoice.Builder::class)
        @NoAutoDetect
        class Invoice
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The Invoice id */
            fun id(): String = id.getRequired("id")

            /** The Invoice id */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Invoice = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoice: Invoice) = apply {
                    id = invoice.id
                    additionalProperties = invoice.additionalProperties.toMutableMap()
                }

                /** The Invoice id */
                fun id(id: String) = id(JsonField.of(id))

                /** The Invoice id */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Invoice = Invoice(id, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Invoice && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Invoice{id=$id, additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INCREMENT = of("increment")

                val DECREMENT = of("decrement")

                fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                INCREMENT,
                DECREMENT,
            }

            enum class Value {
                INCREMENT,
                DECREMENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    INCREMENT -> Value.INCREMENT
                    DECREMENT -> Value.DECREMENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    INCREMENT -> Known.INCREMENT
                    DECREMENT -> Known.DECREMENT
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

            return /* spotless:off */ other is CustomerBalanceTransaction && id == other.id && createdAt == other.createdAt && startingBalance == other.startingBalance && endingBalance == other.endingBalance && amount == other.amount && action == other.action && description == other.description && invoice == other.invoice && type == other.type && creditNote == other.creditNote && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, startingBalance, endingBalance, amount, action, description, invoice, type, creditNote, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerBalanceTransaction{id=$id, createdAt=$createdAt, startingBalance=$startingBalance, endingBalance=$endingBalance, amount=$amount, action=$action, description=$description, invoice=$invoice, type=$type, creditNote=$creditNote, additionalProperties=$additionalProperties}"
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
    @JsonDeserialize(builder = CustomerTaxId.Builder::class)
    @NoAutoDetect
    class CustomerTaxId
    private constructor(
        private val country: JsonField<Country>,
        private val type: JsonField<Type>,
        private val value: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun country(): Country = country.getRequired("country")

        fun type(): Type = type.getRequired("type")

        fun value(): String = value.getRequired("value")

        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerTaxId = apply {
            if (!validated) {
                country()
                type()
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var country: JsonField<Country> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(customerTaxId: CustomerTaxId) = apply {
                country = customerTaxId.country
                type = customerTaxId.type
                value = customerTaxId.value
                additionalProperties = customerTaxId.additionalProperties.toMutableMap()
            }

            fun country(country: Country) = country(JsonField.of(country))

            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<Country>) = apply { this.country = country }

            fun type(type: Type) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun value(value: String) = value(JsonField.of(value))

            @JsonProperty("value")
            @ExcludeMissing
            fun value(value: JsonField<String>) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): CustomerTaxId =
                CustomerTaxId(
                    country,
                    type,
                    value,
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

            return /* spotless:off */ other is CustomerTaxId && country == other.country && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(country, type, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerTaxId{country=$country, type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    class InvoiceSource
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SUBSCRIPTION = of("subscription")

            val PARTIAL = of("partial")

            val ONE_OFF = of("one_off")

            fun of(value: String) = InvoiceSource(JsonField.of(value))
        }

        enum class Known {
            SUBSCRIPTION,
            PARTIAL,
            ONE_OFF,
        }

        enum class Value {
            SUBSCRIPTION,
            PARTIAL,
            ONE_OFF,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SUBSCRIPTION -> Value.SUBSCRIPTION
                PARTIAL -> Value.PARTIAL
                ONE_OFF -> Value.ONE_OFF
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SUBSCRIPTION -> Known.SUBSCRIPTION
                PARTIAL -> Known.PARTIAL
                ONE_OFF -> Known.ONE_OFF
                else -> throw OrbInvalidDataException("Unknown InvoiceSource: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceSource && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(builder = LineItem.Builder::class)
    @NoAutoDetect
    class LineItem
    private constructor(
        private val amount: JsonField<String>,
        private val discount: JsonField<Discount>,
        private val endDate: JsonField<OffsetDateTime>,
        private val grouping: JsonField<String>,
        private val minimum: JsonField<Minimum>,
        private val minimumAmount: JsonField<String>,
        private val maximum: JsonField<Maximum>,
        private val maximumAmount: JsonField<String>,
        private val name: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val startDate: JsonField<OffsetDateTime>,
        private val subtotal: JsonField<String>,
        private val subLineItems: JsonField<List<SubLineItem>>,
        private val taxAmounts: JsonField<List<TaxAmount>>,
        private val id: JsonField<String>,
        private val price: JsonField<Price>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The final amount after any discounts or minimums. */
        fun amount(): String = amount.getRequired("amount")

        fun discount(): Discount? = discount.getNullable("discount")

        /** The end date of the range of time applied for this line item's price. */
        fun endDate(): OffsetDateTime = endDate.getRequired("end_date")

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        fun grouping(): String? = grouping.getNullable("grouping")

        fun minimum(): Minimum? = minimum.getNullable("minimum")

        fun minimumAmount(): String? = minimumAmount.getNullable("minimum_amount")

        fun maximum(): Maximum? = maximum.getNullable("maximum")

        fun maximumAmount(): String? = maximumAmount.getNullable("maximum_amount")

        /** The name of the price associated with this line item. */
        fun name(): String = name.getRequired("name")

        fun quantity(): Double = quantity.getRequired("quantity")

        /** The start date of the range of time applied for this line item's price. */
        fun startDate(): OffsetDateTime = startDate.getRequired("start_date")

        /** The line amount before any line item-specific discounts or minimums. */
        fun subtotal(): String = subtotal.getRequired("subtotal")

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        fun subLineItems(): List<SubLineItem> = subLineItems.getRequired("sub_line_items")

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        fun taxAmounts(): List<TaxAmount> = taxAmounts.getRequired("tax_amounts")

        /** A unique ID for this line item. */
        fun id(): String = id.getRequired("id")

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * ## Unit pricing
         *
         * With unit pricing, each unit costs a fixed amount.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "unit",
         *     "unit_config": {
         *         "unit_amount": "0.50"
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered pricing
         *
         * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
         * where each tier range is defined by an upper and lower bound. For example, the first ten
         * units may cost $0.50 each and all units thereafter may cost $0.10 each.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "tiered",
         *     "tiered_config": {
         *         "tiers": [
         *             {
         *                 "first_unit": 1,
         *                 "last_unit": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "first_unit": 11,
         *                 "last_unit": null,
         *                 "unit_amount": "0.10"
         *             }
         *         ]
         *     }
         *     ...
         * ```
         *
         * ## Bulk pricing
         *
         * Bulk pricing applies when the number of units determine the cost of all units. For
         * example, if you've bought less than 10 units, they may each be $0.50 for a total of
         * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40 (i.e.
         * 101 units total would be $40.40).
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bulk",
         *     "bulk_config": {
         *         "tiers": [
         *             {
         *                 "maximum_units": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "maximum_units": 1000,
         *                 "unit_amount": "0.40"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Package pricing
         *
         * Package pricing defines the size or granularity of a unit for billing purposes. For
         * example, if the package size is set to 5, then 4 units will be billed as 5 and 6 units
         * will be billed at 10.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "package",
         *     "package_config": {
         *         "package_amount": "0.80",
         *         "package_size": 10
         *     }
         *     ...
         * }
         * ```
         *
         * ## BPS pricing
         *
         * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent
         * (the number of basis points to charge), as well as a cap per event to assess. For
         * example, this would allow you to assess a fee of 0.25% on every payment you process, with
         * a maximum charge of $25 per payment.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bps",
         *     "bps_config": {
         *        "bps": 125,
         *        "per_unit_maximum": "11.00"
         *     }
         *     ...
         *  }
         * ```
         *
         * ## Bulk BPS pricing
         *
         * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
         * quantity across all events. Similar to bulk pricing, the BPS parameters of a given event
         * depends on the tier range that the billing period falls into. Each tier range is defined
         * by an upper bound. For example, after $1.5M of payment volume is reached, each individual
         * payment may have a lower cap or a smaller take-rate.
         *
         * ```json
         *     ...
         *     "model_type": "bulk_bps",
         *     "bulk_bps_config": {
         *         "tiers": [
         *            {
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered BPS pricing
         *
         * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
         * applicable parameter is a function of its marginal addition to the period total. Similar
         * to tiered pricing, the BPS parameters of a given event depends on the tier range that it
         * falls into, where each tier range is defined by an upper and lower bound. For example,
         * the first few payments may have a 0.8 BPS take-rate and all payments after a specific
         * volume may incur a take-rate of 0.5 BPS each.
         *
         * ```json
         *     ...
         *     "model_type": "tiered_bps",
         *     "tiered_bps_config": {
         *         "tiers": [
         *            {
         *                 "minimum_amount": "0",
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "minimum_amount": "1000000.00",
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Matrix pricing
         *
         * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
         * `dimensions` defines the two event property values evaluated in this pricing model. In a
         * one-dimensional matrix, the second value is `null`. Every configuration has a list of
         * `matrix_values` which give the unit prices for specified property values. In a
         * one-dimensional matrix, the matrix values will have `dimension_values` where the second
         * value of the pair is null. If an event does not match any of the dimension values in the
         * matrix, it will resort to the `default_unit_amount`.
         *
         * ```json
         * {
         *     "model_type": "matrix"
         *     "matrix_config": {
         *         "default_unit_amount": "3.00",
         *         "dimensions": [
         *             "cluster_name",
         *             "region"
         *         ],
         *         "matrix_values": [
         *             {
         *                 "dimension_values": [
         *                     "alpha",
         *                     "west"
         *                 ],
         *                 "unit_amount": "2.00"
         *             },
         *             ...
         *         ]
         *     }
         * }
         * ```
         *
         * ## Fixed fees
         *
         * Fixed fees are prices that are applied independent of usage quantities, and follow unit
         * pricing. They also have an additional parameter `fixed_price_quantity`. If the Price
         * represents a fixed cost, this represents the quantity of units applied.
         *
         * ```json
         * {
         *     ...
         *     "id": "price_id",
         *     "model_type": "unit",
         *     "unit_config": {
         *        "unit_amount": "2.00"
         *     },
         *     "fixed_price_quantity": 3.0
         *     ...
         * }
         * ```
         */
        fun price(): Price? = price.getNullable("price")

        /** The final amount after any discounts or minimums. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("discount") @ExcludeMissing fun _discount() = discount

        /** The end date of the range of time applied for this line item's price. */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

        /**
         * [DEPRECATED] For configured prices that are split by a grouping key, this will be
         * populated with the key and a value. The `amount` and `subtotal` will be the values for
         * this particular grouping.
         */
        @JsonProperty("grouping") @ExcludeMissing fun _grouping() = grouping

        @JsonProperty("minimum") @ExcludeMissing fun _minimum() = minimum

        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        @JsonProperty("maximum") @ExcludeMissing fun _maximum() = maximum

        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        /** The name of the price associated with this line item. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        /** The start date of the range of time applied for this line item's price. */
        @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

        /** The line amount before any line item-specific discounts or minimums. */
        @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

        /**
         * For complex pricing structures, the line item can be broken down further in
         * `sub_line_items`.
         */
        @JsonProperty("sub_line_items") @ExcludeMissing fun _subLineItems() = subLineItems

        /**
         * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
         * configured.
         */
        @JsonProperty("tax_amounts") @ExcludeMissing fun _taxAmounts() = taxAmounts

        /** A unique ID for this line item. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * The Price resource represents a price that can be billed on a subscription, resulting in
         * a charge on an invoice in the form of an invoice line item. Prices take a quantity and
         * determine an amount to bill.
         *
         * Orb supports a few different pricing models out of the box. Each of these models is
         * serialized differently in a given Price object. The model_type field determines the key
         * for the configuration object that is present.
         *
         * ## Unit pricing
         *
         * With unit pricing, each unit costs a fixed amount.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "unit",
         *     "unit_config": {
         *         "unit_amount": "0.50"
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered pricing
         *
         * In tiered pricing, the cost of a given unit depends on the tier range that it falls into,
         * where each tier range is defined by an upper and lower bound. For example, the first ten
         * units may cost $0.50 each and all units thereafter may cost $0.10 each.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "tiered",
         *     "tiered_config": {
         *         "tiers": [
         *             {
         *                 "first_unit": 1,
         *                 "last_unit": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "first_unit": 11,
         *                 "last_unit": null,
         *                 "unit_amount": "0.10"
         *             }
         *         ]
         *     }
         *     ...
         * ```
         *
         * ## Bulk pricing
         *
         * Bulk pricing applies when the number of units determine the cost of all units. For
         * example, if you've bought less than 10 units, they may each be $0.50 for a total of
         * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40 (i.e.
         * 101 units total would be $40.40).
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bulk",
         *     "bulk_config": {
         *         "tiers": [
         *             {
         *                 "maximum_units": 10,
         *                 "unit_amount": "0.50"
         *             },
         *             {
         *                 "maximum_units": 1000,
         *                 "unit_amount": "0.40"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Package pricing
         *
         * Package pricing defines the size or granularity of a unit for billing purposes. For
         * example, if the package size is set to 5, then 4 units will be billed as 5 and 6 units
         * will be billed at 10.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "package",
         *     "package_config": {
         *         "package_amount": "0.80",
         *         "package_size": 10
         *     }
         *     ...
         * }
         * ```
         *
         * ## BPS pricing
         *
         * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a percent
         * (the number of basis points to charge), as well as a cap per event to assess. For
         * example, this would allow you to assess a fee of 0.25% on every payment you process, with
         * a maximum charge of $25 per payment.
         *
         * ```json
         * {
         *     ...
         *     "model_type": "bps",
         *     "bps_config": {
         *        "bps": 125,
         *        "per_unit_maximum": "11.00"
         *     }
         *     ...
         *  }
         * ```
         *
         * ## Bulk BPS pricing
         *
         * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
         * quantity across all events. Similar to bulk pricing, the BPS parameters of a given event
         * depends on the tier range that the billing period falls into. Each tier range is defined
         * by an upper bound. For example, after $1.5M of payment volume is reached, each individual
         * payment may have a lower cap or a smaller take-rate.
         *
         * ```json
         *     ...
         *     "model_type": "bulk_bps",
         *     "bulk_bps_config": {
         *         "tiers": [
         *            {
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Tiered BPS pricing
         *
         * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
         * applicable parameter is a function of its marginal addition to the period total. Similar
         * to tiered pricing, the BPS parameters of a given event depends on the tier range that it
         * falls into, where each tier range is defined by an upper and lower bound. For example,
         * the first few payments may have a 0.8 BPS take-rate and all payments after a specific
         * volume may incur a take-rate of 0.5 BPS each.
         *
         * ```json
         *     ...
         *     "model_type": "tiered_bps",
         *     "tiered_bps_config": {
         *         "tiers": [
         *            {
         *                 "minimum_amount": "0",
         *                 "maximum_amount": "1000000.00",
         *                 "bps": 125,
         *                 "per_unit_maximum": "19.00"
         *            },
         *           {
         *                 "minimum_amount": "1000000.00",
         *                 "maximum_amount": null,
         *                 "bps": 115,
         *                 "per_unit_maximum": "4.00"
         *             }
         *         ]
         *     }
         *     ...
         * }
         * ```
         *
         * ## Matrix pricing
         *
         * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
         * `dimensions` defines the two event property values evaluated in this pricing model. In a
         * one-dimensional matrix, the second value is `null`. Every configuration has a list of
         * `matrix_values` which give the unit prices for specified property values. In a
         * one-dimensional matrix, the matrix values will have `dimension_values` where the second
         * value of the pair is null. If an event does not match any of the dimension values in the
         * matrix, it will resort to the `default_unit_amount`.
         *
         * ```json
         * {
         *     "model_type": "matrix"
         *     "matrix_config": {
         *         "default_unit_amount": "3.00",
         *         "dimensions": [
         *             "cluster_name",
         *             "region"
         *         ],
         *         "matrix_values": [
         *             {
         *                 "dimension_values": [
         *                     "alpha",
         *                     "west"
         *                 ],
         *                 "unit_amount": "2.00"
         *             },
         *             ...
         *         ]
         *     }
         * }
         * ```
         *
         * ## Fixed fees
         *
         * Fixed fees are prices that are applied independent of usage quantities, and follow unit
         * pricing. They also have an additional parameter `fixed_price_quantity`. If the Price
         * represents a fixed cost, this represents the quantity of units applied.
         *
         * ```json
         * {
         *     ...
         *     "id": "price_id",
         *     "model_type": "unit",
         *     "unit_config": {
         *        "unit_amount": "2.00"
         *     },
         *     "fixed_price_quantity": 3.0
         *     ...
         * }
         * ```
         */
        @JsonProperty("price") @ExcludeMissing fun _price() = price

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (!validated) {
                amount()
                discount()
                endDate()
                grouping()
                minimum()?.validate()
                minimumAmount()
                maximum()?.validate()
                maximumAmount()
                name()
                quantity()
                startDate()
                subtotal()
                subLineItems()
                taxAmounts().forEach { it.validate() }
                id()
                price()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<String> = JsonMissing.of()
            private var discount: JsonField<Discount> = JsonMissing.of()
            private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var grouping: JsonField<String> = JsonMissing.of()
            private var minimum: JsonField<Minimum> = JsonMissing.of()
            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var maximum: JsonField<Maximum> = JsonMissing.of()
            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var subtotal: JsonField<String> = JsonMissing.of()
            private var subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of()
            private var taxAmounts: JsonField<List<TaxAmount>> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(lineItem: LineItem) = apply {
                amount = lineItem.amount
                discount = lineItem.discount
                endDate = lineItem.endDate
                grouping = lineItem.grouping
                minimum = lineItem.minimum
                minimumAmount = lineItem.minimumAmount
                maximum = lineItem.maximum
                maximumAmount = lineItem.maximumAmount
                name = lineItem.name
                quantity = lineItem.quantity
                startDate = lineItem.startDate
                subtotal = lineItem.subtotal
                subLineItems = lineItem.subLineItems
                taxAmounts = lineItem.taxAmounts
                id = lineItem.id
                price = lineItem.price
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            /** The final amount after any discounts or minimums. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The final amount after any discounts or minimums. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            fun discount(discount: Discount) = discount(JsonField.of(discount))

            @JsonProperty("discount")
            @ExcludeMissing
            fun discount(discount: JsonField<Discount>) = apply { this.discount = discount }

            /** The end date of the range of time applied for this line item's price. */
            fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

            /** The end date of the range of time applied for this line item's price. */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

            /**
             * [DEPRECATED] For configured prices that are split by a grouping key, this will be
             * populated with the key and a value. The `amount` and `subtotal` will be the values
             * for this particular grouping.
             */
            fun grouping(grouping: String) = grouping(JsonField.of(grouping))

            /**
             * [DEPRECATED] For configured prices that are split by a grouping key, this will be
             * populated with the key and a value. The `amount` and `subtotal` will be the values
             * for this particular grouping.
             */
            @JsonProperty("grouping")
            @ExcludeMissing
            fun grouping(grouping: JsonField<String>) = apply { this.grouping = grouping }

            fun minimum(minimum: Minimum) = minimum(JsonField.of(minimum))

            @JsonProperty("minimum")
            @ExcludeMissing
            fun minimum(minimum: JsonField<Minimum>) = apply { this.minimum = minimum }

            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            fun maximum(maximum: Maximum) = maximum(JsonField.of(maximum))

            @JsonProperty("maximum")
            @ExcludeMissing
            fun maximum(maximum: JsonField<Maximum>) = apply { this.maximum = maximum }

            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /** The name of the price associated with this line item. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the price associated with this line item. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /** The start date of the range of time applied for this line item's price. */
            fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

            /** The start date of the range of time applied for this line item's price. */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                this.startDate = startDate
            }

            /** The line amount before any line item-specific discounts or minimums. */
            fun subtotal(subtotal: String) = subtotal(JsonField.of(subtotal))

            /** The line amount before any line item-specific discounts or minimums. */
            @JsonProperty("subtotal")
            @ExcludeMissing
            fun subtotal(subtotal: JsonField<String>) = apply { this.subtotal = subtotal }

            /**
             * For complex pricing structures, the line item can be broken down further in
             * `sub_line_items`.
             */
            fun subLineItems(subLineItems: List<SubLineItem>) =
                subLineItems(JsonField.of(subLineItems))

            /**
             * For complex pricing structures, the line item can be broken down further in
             * `sub_line_items`.
             */
            @JsonProperty("sub_line_items")
            @ExcludeMissing
            fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
                this.subLineItems = subLineItems
            }

            /**
             * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
             * configured.
             */
            fun taxAmounts(taxAmounts: List<TaxAmount>) = taxAmounts(JsonField.of(taxAmounts))

            /**
             * An array of tax rates and their incurred tax amounts. Empty if no tax integration is
             * configured.
             */
            @JsonProperty("tax_amounts")
            @ExcludeMissing
            fun taxAmounts(taxAmounts: JsonField<List<TaxAmount>>) = apply {
                this.taxAmounts = taxAmounts
            }

            /** A unique ID for this line item. */
            fun id(id: String) = id(JsonField.of(id))

            /** A unique ID for this line item. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * ## Unit pricing
             *
             * With unit pricing, each unit costs a fixed amount.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "unit",
             *     "unit_config": {
             *         "unit_amount": "0.50"
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered pricing
             *
             * In tiered pricing, the cost of a given unit depends on the tier range that it falls
             * into, where each tier range is defined by an upper and lower bound. For example, the
             * first ten units may cost $0.50 each and all units thereafter may cost $0.10 each.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "tiered",
             *     "tiered_config": {
             *         "tiers": [
             *             {
             *                 "first_unit": 1,
             *                 "last_unit": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "first_unit": 11,
             *                 "last_unit": null,
             *                 "unit_amount": "0.10"
             *             }
             *         ]
             *     }
             *     ...
             * ```
             *
             * ## Bulk pricing
             *
             * Bulk pricing applies when the number of units determine the cost of all units. For
             * example, if you've bought less than 10 units, they may each be $0.50 for a total of
             * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40
             * (i.e. 101 units total would be $40.40).
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bulk",
             *     "bulk_config": {
             *         "tiers": [
             *             {
             *                 "maximum_units": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "maximum_units": 1000,
             *                 "unit_amount": "0.40"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Package pricing
             *
             * Package pricing defines the size or granularity of a unit for billing purposes. For
             * example, if the package size is set to 5, then 4 units will be billed as 5 and 6
             * units will be billed at 10.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "package",
             *     "package_config": {
             *         "package_amount": "0.80",
             *         "package_size": 10
             *     }
             *     ...
             * }
             * ```
             *
             * ## BPS pricing
             *
             * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
             * percent (the number of basis points to charge), as well as a cap per event to assess.
             * For example, this would allow you to assess a fee of 0.25% on every payment you
             * process, with a maximum charge of $25 per payment.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bps",
             *     "bps_config": {
             *        "bps": 125,
             *        "per_unit_maximum": "11.00"
             *     }
             *     ...
             *  }
             * ```
             *
             * ## Bulk BPS pricing
             *
             * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
             * quantity across all events. Similar to bulk pricing, the BPS parameters of a given
             * event depends on the tier range that the billing period falls into. Each tier range
             * is defined by an upper bound. For example, after $1.5M of payment volume is reached,
             * each individual payment may have a lower cap or a smaller take-rate.
             *
             * ```json
             *     ...
             *     "model_type": "bulk_bps",
             *     "bulk_bps_config": {
             *         "tiers": [
             *            {
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered BPS pricing
             *
             * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
             * applicable parameter is a function of its marginal addition to the period total.
             * Similar to tiered pricing, the BPS parameters of a given event depends on the tier
             * range that it falls into, where each tier range is defined by an upper and lower
             * bound. For example, the first few payments may have a 0.8 BPS take-rate and all
             * payments after a specific volume may incur a take-rate of 0.5 BPS each.
             *
             * ```json
             *     ...
             *     "model_type": "tiered_bps",
             *     "tiered_bps_config": {
             *         "tiers": [
             *            {
             *                 "minimum_amount": "0",
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "minimum_amount": "1000000.00",
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Matrix pricing
             *
             * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
             * `dimensions` defines the two event property values evaluated in this pricing model.
             * In a one-dimensional matrix, the second value is `null`. Every configuration has a
             * list of `matrix_values` which give the unit prices for specified property values. In
             * a one-dimensional matrix, the matrix values will have `dimension_values` where the
             * second value of the pair is null. If an event does not match any of the dimension
             * values in the matrix, it will resort to the `default_unit_amount`.
             *
             * ```json
             * {
             *     "model_type": "matrix"
             *     "matrix_config": {
             *         "default_unit_amount": "3.00",
             *         "dimensions": [
             *             "cluster_name",
             *             "region"
             *         ],
             *         "matrix_values": [
             *             {
             *                 "dimension_values": [
             *                     "alpha",
             *                     "west"
             *                 ],
             *                 "unit_amount": "2.00"
             *             },
             *             ...
             *         ]
             *     }
             * }
             * ```
             *
             * ## Fixed fees
             *
             * Fixed fees are prices that are applied independent of usage quantities, and follow
             * unit pricing. They also have an additional parameter `fixed_price_quantity`. If the
             * Price represents a fixed cost, this represents the quantity of units applied.
             *
             * ```json
             * {
             *     ...
             *     "id": "price_id",
             *     "model_type": "unit",
             *     "unit_config": {
             *        "unit_amount": "2.00"
             *     },
             *     "fixed_price_quantity": 3.0
             *     ...
             * }
             * ```
             */
            fun price(price: Price) = price(JsonField.of(price))

            /**
             * The Price resource represents a price that can be billed on a subscription, resulting
             * in a charge on an invoice in the form of an invoice line item. Prices take a quantity
             * and determine an amount to bill.
             *
             * Orb supports a few different pricing models out of the box. Each of these models is
             * serialized differently in a given Price object. The model_type field determines the
             * key for the configuration object that is present.
             *
             * ## Unit pricing
             *
             * With unit pricing, each unit costs a fixed amount.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "unit",
             *     "unit_config": {
             *         "unit_amount": "0.50"
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered pricing
             *
             * In tiered pricing, the cost of a given unit depends on the tier range that it falls
             * into, where each tier range is defined by an upper and lower bound. For example, the
             * first ten units may cost $0.50 each and all units thereafter may cost $0.10 each.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "tiered",
             *     "tiered_config": {
             *         "tiers": [
             *             {
             *                 "first_unit": 1,
             *                 "last_unit": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "first_unit": 11,
             *                 "last_unit": null,
             *                 "unit_amount": "0.10"
             *             }
             *         ]
             *     }
             *     ...
             * ```
             *
             * ## Bulk pricing
             *
             * Bulk pricing applies when the number of units determine the cost of all units. For
             * example, if you've bought less than 10 units, they may each be $0.50 for a total of
             * $5.00. Once you've bought more than 10 units, all units may now be priced at $0.40
             * (i.e. 101 units total would be $40.40).
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bulk",
             *     "bulk_config": {
             *         "tiers": [
             *             {
             *                 "maximum_units": 10,
             *                 "unit_amount": "0.50"
             *             },
             *             {
             *                 "maximum_units": 1000,
             *                 "unit_amount": "0.40"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Package pricing
             *
             * Package pricing defines the size or granularity of a unit for billing purposes. For
             * example, if the package size is set to 5, then 4 units will be billed as 5 and 6
             * units will be billed at 10.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "package",
             *     "package_config": {
             *         "package_amount": "0.80",
             *         "package_size": 10
             *     }
             *     ...
             * }
             * ```
             *
             * ## BPS pricing
             *
             * BPS pricing specifies a per-event (e.g. per-payment) rate in one hundredth of a
             * percent (the number of basis points to charge), as well as a cap per event to assess.
             * For example, this would allow you to assess a fee of 0.25% on every payment you
             * process, with a maximum charge of $25 per payment.
             *
             * ```json
             * {
             *     ...
             *     "model_type": "bps",
             *     "bps_config": {
             *        "bps": 125,
             *        "per_unit_maximum": "11.00"
             *     }
             *     ...
             *  }
             * ```
             *
             * ## Bulk BPS pricing
             *
             * Bulk BPS pricing specifies BPS parameters in a tiered manner, dependent on the total
             * quantity across all events. Similar to bulk pricing, the BPS parameters of a given
             * event depends on the tier range that the billing period falls into. Each tier range
             * is defined by an upper bound. For example, after $1.5M of payment volume is reached,
             * each individual payment may have a lower cap or a smaller take-rate.
             *
             * ```json
             *     ...
             *     "model_type": "bulk_bps",
             *     "bulk_bps_config": {
             *         "tiers": [
             *            {
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Tiered BPS pricing
             *
             * Tiered BPS pricing specifies BPS parameters in a graduated manner, where an event's
             * applicable parameter is a function of its marginal addition to the period total.
             * Similar to tiered pricing, the BPS parameters of a given event depends on the tier
             * range that it falls into, where each tier range is defined by an upper and lower
             * bound. For example, the first few payments may have a 0.8 BPS take-rate and all
             * payments after a specific volume may incur a take-rate of 0.5 BPS each.
             *
             * ```json
             *     ...
             *     "model_type": "tiered_bps",
             *     "tiered_bps_config": {
             *         "tiers": [
             *            {
             *                 "minimum_amount": "0",
             *                 "maximum_amount": "1000000.00",
             *                 "bps": 125,
             *                 "per_unit_maximum": "19.00"
             *            },
             *           {
             *                 "minimum_amount": "1000000.00",
             *                 "maximum_amount": null,
             *                 "bps": 115,
             *                 "per_unit_maximum": "4.00"
             *             }
             *         ]
             *     }
             *     ...
             * }
             * ```
             *
             * ## Matrix pricing
             *
             * Matrix pricing defines a set of unit prices in a one or two-dimensional matrix.
             * `dimensions` defines the two event property values evaluated in this pricing model.
             * In a one-dimensional matrix, the second value is `null`. Every configuration has a
             * list of `matrix_values` which give the unit prices for specified property values. In
             * a one-dimensional matrix, the matrix values will have `dimension_values` where the
             * second value of the pair is null. If an event does not match any of the dimension
             * values in the matrix, it will resort to the `default_unit_amount`.
             *
             * ```json
             * {
             *     "model_type": "matrix"
             *     "matrix_config": {
             *         "default_unit_amount": "3.00",
             *         "dimensions": [
             *             "cluster_name",
             *             "region"
             *         ],
             *         "matrix_values": [
             *             {
             *                 "dimension_values": [
             *                     "alpha",
             *                     "west"
             *                 ],
             *                 "unit_amount": "2.00"
             *             },
             *             ...
             *         ]
             *     }
             * }
             * ```
             *
             * ## Fixed fees
             *
             * Fixed fees are prices that are applied independent of usage quantities, and follow
             * unit pricing. They also have an additional parameter `fixed_price_quantity`. If the
             * Price represents a fixed cost, this represents the quantity of units applied.
             *
             * ```json
             * {
             *     ...
             *     "id": "price_id",
             *     "model_type": "unit",
             *     "unit_config": {
             *        "unit_amount": "2.00"
             *     },
             *     "fixed_price_quantity": 3.0
             *     ...
             * }
             * ```
             */
            @JsonProperty("price")
            @ExcludeMissing
            fun price(price: JsonField<Price>) = apply { this.price = price }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): LineItem =
                LineItem(
                    amount,
                    discount,
                    endDate,
                    grouping,
                    minimum,
                    minimumAmount,
                    maximum,
                    maximumAmount,
                    name,
                    quantity,
                    startDate,
                    subtotal,
                    subLineItems.map { it.toImmutable() },
                    taxAmounts.map { it.toImmutable() },
                    id,
                    price,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Maximum.Builder::class)
        @NoAutoDetect
        class Maximum
        private constructor(
            private val maximumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Maximum amount applied */
            fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Maximum amount applied */
            @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Maximum = apply {
                if (!validated) {
                    maximumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var maximumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(maximum: Maximum) = apply {
                    maximumAmount = maximum.maximumAmount
                    appliesToPriceIds = maximum.appliesToPriceIds
                    additionalProperties = maximum.additionalProperties.toMutableMap()
                }

                /** Maximum amount applied */
                fun maximumAmount(maximumAmount: String) =
                    maximumAmount(JsonField.of(maximumAmount))

                /** Maximum amount applied */
                @JsonProperty("maximum_amount")
                @ExcludeMissing
                fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                    this.maximumAmount = maximumAmount
                }

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this maximum amount applies to. For plan/plan phase
                 * maximums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Maximum =
                    Maximum(
                        maximumAmount,
                        appliesToPriceIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Maximum && maximumAmount == other.maximumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(maximumAmount, appliesToPriceIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Minimum.Builder::class)
        @NoAutoDetect
        class Minimum
        private constructor(
            private val minimumAmount: JsonField<String>,
            private val appliesToPriceIds: JsonField<List<String>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Minimum amount applied */
            fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(): List<String> =
                appliesToPriceIds.getRequired("applies_to_price_ids")

            /** Minimum amount applied */
            @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun _appliesToPriceIds() = appliesToPriceIds

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Minimum = apply {
                if (!validated) {
                    minimumAmount()
                    appliesToPriceIds()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var minimumAmount: JsonField<String> = JsonMissing.of()
                private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(minimum: Minimum) = apply {
                    minimumAmount = minimum.minimumAmount
                    appliesToPriceIds = minimum.appliesToPriceIds
                    additionalProperties = minimum.additionalProperties.toMutableMap()
                }

                /** Minimum amount applied */
                fun minimumAmount(minimumAmount: String) =
                    minimumAmount(JsonField.of(minimumAmount))

                /** Minimum amount applied */
                @JsonProperty("minimum_amount")
                @ExcludeMissing
                fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                    this.minimumAmount = minimumAmount
                }

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                    appliesToPriceIds(JsonField.of(appliesToPriceIds))

                /**
                 * List of price_ids that this minimum amount applies to. For plan/plan phase
                 * minimums, this can be a subset of prices.
                 */
                @JsonProperty("applies_to_price_ids")
                @ExcludeMissing
                fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                    this.appliesToPriceIds = appliesToPriceIds
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): Minimum =
                    Minimum(
                        minimumAmount,
                        appliesToPriceIds.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Minimum && minimumAmount == other.minimumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(minimumAmount, appliesToPriceIds, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(using = SubLineItem.Deserializer::class)
        @JsonSerialize(using = SubLineItem.Serializer::class)
        class SubLineItem
        private constructor(
            private val matrixSubLineItem: MatrixSubLineItem? = null,
            private val tierSubLineItem: TierSubLineItem? = null,
            private val otherSubLineItem: OtherSubLineItem? = null,
            private val _json: JsonValue? = null,
        ) {

            private var validated: Boolean = false

            fun matrixSubLineItem(): MatrixSubLineItem? = matrixSubLineItem

            fun tierSubLineItem(): TierSubLineItem? = tierSubLineItem

            fun otherSubLineItem(): OtherSubLineItem? = otherSubLineItem

            fun isMatrixSubLineItem(): Boolean = matrixSubLineItem != null

            fun isTierSubLineItem(): Boolean = tierSubLineItem != null

            fun isOtherSubLineItem(): Boolean = otherSubLineItem != null

            fun asMatrixSubLineItem(): MatrixSubLineItem =
                matrixSubLineItem.getOrThrow("matrixSubLineItem")

            fun asTierSubLineItem(): TierSubLineItem = tierSubLineItem.getOrThrow("tierSubLineItem")

            fun asOtherSubLineItem(): OtherSubLineItem =
                otherSubLineItem.getOrThrow("otherSubLineItem")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    matrixSubLineItem != null -> visitor.visitMatrixSubLineItem(matrixSubLineItem)
                    tierSubLineItem != null -> visitor.visitTierSubLineItem(tierSubLineItem)
                    otherSubLineItem != null -> visitor.visitOtherSubLineItem(otherSubLineItem)
                    else -> visitor.unknown(_json)
                }
            }

            fun validate(): SubLineItem = apply {
                if (!validated) {
                    if (
                        matrixSubLineItem == null &&
                            tierSubLineItem == null &&
                            otherSubLineItem == null
                    ) {
                        throw OrbInvalidDataException("Unknown SubLineItem: $_json")
                    }
                    matrixSubLineItem?.validate()
                    tierSubLineItem?.validate()
                    otherSubLineItem?.validate()
                    validated = true
                }
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubLineItem && matrixSubLineItem == other.matrixSubLineItem && tierSubLineItem == other.tierSubLineItem && otherSubLineItem == other.otherSubLineItem /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(matrixSubLineItem, tierSubLineItem, otherSubLineItem) /* spotless:on */

            override fun toString(): String =
                when {
                    matrixSubLineItem != null -> "SubLineItem{matrixSubLineItem=$matrixSubLineItem}"
                    tierSubLineItem != null -> "SubLineItem{tierSubLineItem=$tierSubLineItem}"
                    otherSubLineItem != null -> "SubLineItem{otherSubLineItem=$otherSubLineItem}"
                    _json != null -> "SubLineItem{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid SubLineItem")
                }

            companion object {

                fun ofMatrixSubLineItem(matrixSubLineItem: MatrixSubLineItem) =
                    SubLineItem(matrixSubLineItem = matrixSubLineItem)

                fun ofTierSubLineItem(tierSubLineItem: TierSubLineItem) =
                    SubLineItem(tierSubLineItem = tierSubLineItem)

                fun ofOtherSubLineItem(otherSubLineItem: OtherSubLineItem) =
                    SubLineItem(otherSubLineItem = otherSubLineItem)
            }

            interface Visitor<out T> {

                fun visitMatrixSubLineItem(matrixSubLineItem: MatrixSubLineItem): T

                fun visitTierSubLineItem(tierSubLineItem: TierSubLineItem): T

                fun visitOtherSubLineItem(otherSubLineItem: OtherSubLineItem): T

                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown SubLineItem: $json")
                }
            }

            class Deserializer : BaseDeserializer<SubLineItem>(SubLineItem::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): SubLineItem {
                    val json = JsonValue.fromJsonNode(node)
                    val type = json.asObject()?.get("type")?.asString()

                    when (type) {
                        "matrix" -> {
                            tryDeserialize(node, jacksonTypeRef<MatrixSubLineItem>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return SubLineItem(matrixSubLineItem = it, _json = json)
                                }
                        }
                        "tier" -> {
                            tryDeserialize(node, jacksonTypeRef<TierSubLineItem>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return SubLineItem(tierSubLineItem = it, _json = json)
                                }
                        }
                        "'null'" -> {
                            tryDeserialize(node, jacksonTypeRef<OtherSubLineItem>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return SubLineItem(otherSubLineItem = it, _json = json)
                                }
                        }
                    }

                    return SubLineItem(_json = json)
                }
            }

            class Serializer : BaseSerializer<SubLineItem>(SubLineItem::class) {

                override fun serialize(
                    value: SubLineItem,
                    generator: JsonGenerator,
                    provider: SerializerProvider
                ) {
                    when {
                        value.matrixSubLineItem != null ->
                            generator.writeObject(value.matrixSubLineItem)
                        value.tierSubLineItem != null ->
                            generator.writeObject(value.tierSubLineItem)
                        value.otherSubLineItem != null ->
                            generator.writeObject(value.otherSubLineItem)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid SubLineItem")
                    }
                }
            }

            @JsonDeserialize(builder = MatrixSubLineItem.Builder::class)
            @NoAutoDetect
            class MatrixSubLineItem
            private constructor(
                private val amount: JsonField<String>,
                private val name: JsonField<String>,
                private val quantity: JsonField<Double>,
                private val grouping: JsonField<Grouping>,
                private val type: JsonField<Type>,
                private val matrixConfig: JsonField<MatrixConfig>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The total amount for this sub line item. */
                fun amount(): String = amount.getRequired("amount")

                fun name(): String = name.getRequired("name")

                fun quantity(): Double = quantity.getRequired("quantity")

                fun grouping(): Grouping? = grouping.getNullable("grouping")

                fun type(): Type = type.getRequired("type")

                fun matrixConfig(): MatrixConfig = matrixConfig.getRequired("matrix_config")

                /** The total amount for this sub line item. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

                @JsonProperty("grouping") @ExcludeMissing fun _grouping() = grouping

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("matrix_config") @ExcludeMissing fun _matrixConfig() = matrixConfig

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MatrixSubLineItem = apply {
                    if (!validated) {
                        amount()
                        name()
                        quantity()
                        grouping()?.validate()
                        type()
                        matrixConfig().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var grouping: JsonField<Grouping> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var matrixConfig: JsonField<MatrixConfig> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixSubLineItem: MatrixSubLineItem) = apply {
                        amount = matrixSubLineItem.amount
                        name = matrixSubLineItem.name
                        quantity = matrixSubLineItem.quantity
                        grouping = matrixSubLineItem.grouping
                        type = matrixSubLineItem.type
                        matrixConfig = matrixSubLineItem.matrixConfig
                        additionalProperties = matrixSubLineItem.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /** The total amount for this sub line item. */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun grouping(grouping: Grouping) = grouping(JsonField.of(grouping))

                    @JsonProperty("grouping")
                    @ExcludeMissing
                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun matrixConfig(matrixConfig: MatrixConfig) =
                        matrixConfig(JsonField.of(matrixConfig))

                    @JsonProperty("matrix_config")
                    @ExcludeMissing
                    fun matrixConfig(matrixConfig: JsonField<MatrixConfig>) = apply {
                        this.matrixConfig = matrixConfig
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): MatrixSubLineItem =
                        MatrixSubLineItem(
                            amount,
                            name,
                            quantity,
                            grouping,
                            type,
                            matrixConfig,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Grouping.Builder::class)
                @NoAutoDetect
                class Grouping
                private constructor(
                    private val key: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    fun key(): String = key.getRequired("key")

                    /** No value indicates the default group */
                    fun value(): String? = value.getNullable("value")

                    @JsonProperty("key") @ExcludeMissing fun _key() = key

                    /** No value indicates the default group */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (!validated) {
                            key()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var key: JsonField<String> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(grouping: Grouping) = apply {
                            key = grouping.key
                            value = grouping.value
                            additionalProperties = grouping.additionalProperties.toMutableMap()
                        }

                        fun key(key: String) = key(JsonField.of(key))

                        @JsonProperty("key")
                        @ExcludeMissing
                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String) = value(JsonField.of(value))

                        /** No value indicates the default group */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Grouping =
                            Grouping(
                                key,
                                value,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = MatrixConfig.Builder::class)
                @NoAutoDetect
                class MatrixConfig
                private constructor(
                    private val dimensionValues: JsonField<List<String?>>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    /** The ordered dimension values for this line item. */
                    fun dimensionValues(): List<String?> =
                        dimensionValues.getRequired("dimension_values")

                    /** The ordered dimension values for this line item. */
                    @JsonProperty("dimension_values")
                    @ExcludeMissing
                    fun _dimensionValues() = dimensionValues

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): MatrixConfig = apply {
                        if (!validated) {
                            dimensionValues()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var dimensionValues: JsonField<List<String?>> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(matrixConfig: MatrixConfig) = apply {
                            dimensionValues = matrixConfig.dimensionValues
                            additionalProperties = matrixConfig.additionalProperties.toMutableMap()
                        }

                        /** The ordered dimension values for this line item. */
                        fun dimensionValues(dimensionValues: List<String?>) =
                            dimensionValues(JsonField.of(dimensionValues))

                        /** The ordered dimension values for this line item. */
                        @JsonProperty("dimension_values")
                        @ExcludeMissing
                        fun dimensionValues(dimensionValues: JsonField<List<String?>>) = apply {
                            this.dimensionValues = dimensionValues
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): MatrixConfig =
                            MatrixConfig(
                                dimensionValues.map { it.toImmutable() },
                                additionalProperties.toImmutable()
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is MatrixConfig && dimensionValues == other.dimensionValues && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(dimensionValues, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "MatrixConfig{dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val MATRIX = of("matrix")

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        MATRIX,
                    }

                    enum class Value {
                        MATRIX,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MATRIX -> Value.MATRIX
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MATRIX -> Known.MATRIX
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

                    return /* spotless:off */ other is MatrixSubLineItem && amount == other.amount && name == other.name && quantity == other.quantity && grouping == other.grouping && type == other.type && matrixConfig == other.matrixConfig && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, name, quantity, grouping, type, matrixConfig, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixSubLineItem{amount=$amount, name=$name, quantity=$quantity, grouping=$grouping, type=$type, matrixConfig=$matrixConfig, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = TierSubLineItem.Builder::class)
            @NoAutoDetect
            class TierSubLineItem
            private constructor(
                private val amount: JsonField<String>,
                private val name: JsonField<String>,
                private val quantity: JsonField<Double>,
                private val grouping: JsonField<Grouping>,
                private val type: JsonField<Type>,
                private val tierConfig: JsonField<TierConfig>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The total amount for this sub line item. */
                fun amount(): String = amount.getRequired("amount")

                fun name(): String = name.getRequired("name")

                fun quantity(): Double = quantity.getRequired("quantity")

                fun grouping(): Grouping? = grouping.getNullable("grouping")

                fun type(): Type = type.getRequired("type")

                fun tierConfig(): TierConfig = tierConfig.getRequired("tier_config")

                /** The total amount for this sub line item. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

                @JsonProperty("grouping") @ExcludeMissing fun _grouping() = grouping

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonProperty("tier_config") @ExcludeMissing fun _tierConfig() = tierConfig

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TierSubLineItem = apply {
                    if (!validated) {
                        amount()
                        name()
                        quantity()
                        grouping()?.validate()
                        type()
                        tierConfig().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var grouping: JsonField<Grouping> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var tierConfig: JsonField<TierConfig> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tierSubLineItem: TierSubLineItem) = apply {
                        amount = tierSubLineItem.amount
                        name = tierSubLineItem.name
                        quantity = tierSubLineItem.quantity
                        grouping = tierSubLineItem.grouping
                        type = tierSubLineItem.type
                        tierConfig = tierSubLineItem.tierConfig
                        additionalProperties = tierSubLineItem.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /** The total amount for this sub line item. */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun grouping(grouping: Grouping) = grouping(JsonField.of(grouping))

                    @JsonProperty("grouping")
                    @ExcludeMissing
                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun tierConfig(tierConfig: TierConfig) = tierConfig(JsonField.of(tierConfig))

                    @JsonProperty("tier_config")
                    @ExcludeMissing
                    fun tierConfig(tierConfig: JsonField<TierConfig>) = apply {
                        this.tierConfig = tierConfig
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): TierSubLineItem =
                        TierSubLineItem(
                            amount,
                            name,
                            quantity,
                            grouping,
                            type,
                            tierConfig,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Grouping.Builder::class)
                @NoAutoDetect
                class Grouping
                private constructor(
                    private val key: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    fun key(): String = key.getRequired("key")

                    /** No value indicates the default group */
                    fun value(): String? = value.getNullable("value")

                    @JsonProperty("key") @ExcludeMissing fun _key() = key

                    /** No value indicates the default group */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (!validated) {
                            key()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var key: JsonField<String> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(grouping: Grouping) = apply {
                            key = grouping.key
                            value = grouping.value
                            additionalProperties = grouping.additionalProperties.toMutableMap()
                        }

                        fun key(key: String) = key(JsonField.of(key))

                        @JsonProperty("key")
                        @ExcludeMissing
                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String) = value(JsonField.of(value))

                        /** No value indicates the default group */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Grouping =
                            Grouping(
                                key,
                                value,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
                }

                @JsonDeserialize(builder = TierConfig.Builder::class)
                @NoAutoDetect
                class TierConfig
                private constructor(
                    private val firstUnit: JsonField<Double>,
                    private val lastUnit: JsonField<Double>,
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    fun firstUnit(): Double = firstUnit.getRequired("first_unit")

                    fun lastUnit(): Double? = lastUnit.getNullable("last_unit")

                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    @JsonProperty("first_unit") @ExcludeMissing fun _firstUnit() = firstUnit

                    @JsonProperty("last_unit") @ExcludeMissing fun _lastUnit() = lastUnit

                    @JsonProperty("unit_amount") @ExcludeMissing fun _unitAmount() = unitAmount

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): TierConfig = apply {
                        if (!validated) {
                            firstUnit()
                            lastUnit()
                            unitAmount()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var firstUnit: JsonField<Double> = JsonMissing.of()
                        private var lastUnit: JsonField<Double> = JsonMissing.of()
                        private var unitAmount: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(tierConfig: TierConfig) = apply {
                            firstUnit = tierConfig.firstUnit
                            lastUnit = tierConfig.lastUnit
                            unitAmount = tierConfig.unitAmount
                            additionalProperties = tierConfig.additionalProperties.toMutableMap()
                        }

                        fun firstUnit(firstUnit: Double) = firstUnit(JsonField.of(firstUnit))

                        @JsonProperty("first_unit")
                        @ExcludeMissing
                        fun firstUnit(firstUnit: JsonField<Double>) = apply {
                            this.firstUnit = firstUnit
                        }

                        fun lastUnit(lastUnit: Double) = lastUnit(JsonField.of(lastUnit))

                        @JsonProperty("last_unit")
                        @ExcludeMissing
                        fun lastUnit(lastUnit: JsonField<Double>) = apply {
                            this.lastUnit = lastUnit
                        }

                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): TierConfig =
                            TierConfig(
                                firstUnit,
                                lastUnit,
                                unitAmount,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is TierConfig && firstUnit == other.firstUnit && lastUnit == other.lastUnit && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(firstUnit, lastUnit, unitAmount, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "TierConfig{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val TIER = of("tier")

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        TIER,
                    }

                    enum class Value {
                        TIER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            TIER -> Value.TIER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            TIER -> Known.TIER
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

                    return /* spotless:off */ other is TierSubLineItem && amount == other.amount && name == other.name && quantity == other.quantity && grouping == other.grouping && type == other.type && tierConfig == other.tierConfig && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, name, quantity, grouping, type, tierConfig, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TierSubLineItem{amount=$amount, name=$name, quantity=$quantity, grouping=$grouping, type=$type, tierConfig=$tierConfig, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = OtherSubLineItem.Builder::class)
            @NoAutoDetect
            class OtherSubLineItem
            private constructor(
                private val amount: JsonField<String>,
                private val name: JsonField<String>,
                private val quantity: JsonField<Double>,
                private val grouping: JsonField<Grouping>,
                private val type: JsonField<Type>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** The total amount for this sub line item. */
                fun amount(): String = amount.getRequired("amount")

                fun name(): String = name.getRequired("name")

                fun quantity(): Double = quantity.getRequired("quantity")

                fun grouping(): Grouping? = grouping.getNullable("grouping")

                fun type(): Type = type.getRequired("type")

                /** The total amount for this sub line item. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

                @JsonProperty("grouping") @ExcludeMissing fun _grouping() = grouping

                @JsonProperty("type") @ExcludeMissing fun _type() = type

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): OtherSubLineItem = apply {
                    if (!validated) {
                        amount()
                        name()
                        quantity()
                        grouping()?.validate()
                        type()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var grouping: JsonField<Grouping> = JsonMissing.of()
                    private var type: JsonField<Type> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(otherSubLineItem: OtherSubLineItem) = apply {
                        amount = otherSubLineItem.amount
                        name = otherSubLineItem.name
                        quantity = otherSubLineItem.quantity
                        grouping = otherSubLineItem.grouping
                        type = otherSubLineItem.type
                        additionalProperties = otherSubLineItem.additionalProperties.toMutableMap()
                    }

                    /** The total amount for this sub line item. */
                    fun amount(amount: String) = amount(JsonField.of(amount))

                    /** The total amount for this sub line item. */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun grouping(grouping: Grouping) = grouping(JsonField.of(grouping))

                    @JsonProperty("grouping")
                    @ExcludeMissing
                    fun grouping(grouping: JsonField<Grouping>) = apply { this.grouping = grouping }

                    fun type(type: Type) = type(JsonField.of(type))

                    @JsonProperty("type")
                    @ExcludeMissing
                    fun type(type: JsonField<Type>) = apply { this.type = type }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    @JsonAnySetter
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

                    fun build(): OtherSubLineItem =
                        OtherSubLineItem(
                            amount,
                            name,
                            quantity,
                            grouping,
                            type,
                            additionalProperties.toImmutable(),
                        )
                }

                @JsonDeserialize(builder = Grouping.Builder::class)
                @NoAutoDetect
                class Grouping
                private constructor(
                    private val key: JsonField<String>,
                    private val value: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    fun key(): String = key.getRequired("key")

                    /** No value indicates the default group */
                    fun value(): String? = value.getNullable("value")

                    @JsonProperty("key") @ExcludeMissing fun _key() = key

                    /** No value indicates the default group */
                    @JsonProperty("value") @ExcludeMissing fun _value() = value

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Grouping = apply {
                        if (!validated) {
                            key()
                            value()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var key: JsonField<String> = JsonMissing.of()
                        private var value: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(grouping: Grouping) = apply {
                            key = grouping.key
                            value = grouping.value
                            additionalProperties = grouping.additionalProperties.toMutableMap()
                        }

                        fun key(key: String) = key(JsonField.of(key))

                        @JsonProperty("key")
                        @ExcludeMissing
                        fun key(key: JsonField<String>) = apply { this.key = key }

                        /** No value indicates the default group */
                        fun value(value: String) = value(JsonField.of(value))

                        /** No value indicates the default group */
                        @JsonProperty("value")
                        @ExcludeMissing
                        fun value(value: JsonField<String>) = apply { this.value = value }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Grouping =
                            Grouping(
                                key,
                                value,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Grouping && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Grouping{key=$key, value=$value, additionalProperties=$additionalProperties}"
                }

                class Type
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val NULL = of("'null'")

                        fun of(value: String) = Type(JsonField.of(value))
                    }

                    enum class Known {
                        NULL,
                    }

                    enum class Value {
                        NULL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            NULL -> Value.NULL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            NULL -> Known.NULL
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

                    return /* spotless:off */ other is OtherSubLineItem && amount == other.amount && name == other.name && quantity == other.quantity && grouping == other.grouping && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, name, quantity, grouping, type, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OtherSubLineItem{amount=$amount, name=$name, quantity=$quantity, grouping=$grouping, type=$type, additionalProperties=$additionalProperties}"
            }
        }

        @JsonDeserialize(builder = TaxAmount.Builder::class)
        @NoAutoDetect
        class TaxAmount
        private constructor(
            private val taxRateDescription: JsonField<String>,
            private val taxRatePercentage: JsonField<String>,
            private val amount: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The human-readable description of the applied tax rate. */
            fun taxRateDescription(): String =
                taxRateDescription.getRequired("tax_rate_description")

            /** The tax rate percentage, out of 100. */
            fun taxRatePercentage(): String? = taxRatePercentage.getNullable("tax_rate_percentage")

            /** The amount of additional tax incurred by this tax rate. */
            fun amount(): String = amount.getRequired("amount")

            /** The human-readable description of the applied tax rate. */
            @JsonProperty("tax_rate_description")
            @ExcludeMissing
            fun _taxRateDescription() = taxRateDescription

            /** The tax rate percentage, out of 100. */
            @JsonProperty("tax_rate_percentage")
            @ExcludeMissing
            fun _taxRatePercentage() = taxRatePercentage

            /** The amount of additional tax incurred by this tax rate. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): TaxAmount = apply {
                if (!validated) {
                    taxRateDescription()
                    taxRatePercentage()
                    amount()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var taxRateDescription: JsonField<String> = JsonMissing.of()
                private var taxRatePercentage: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(taxAmount: TaxAmount) = apply {
                    taxRateDescription = taxAmount.taxRateDescription
                    taxRatePercentage = taxAmount.taxRatePercentage
                    amount = taxAmount.amount
                    additionalProperties = taxAmount.additionalProperties.toMutableMap()
                }

                /** The human-readable description of the applied tax rate. */
                fun taxRateDescription(taxRateDescription: String) =
                    taxRateDescription(JsonField.of(taxRateDescription))

                /** The human-readable description of the applied tax rate. */
                @JsonProperty("tax_rate_description")
                @ExcludeMissing
                fun taxRateDescription(taxRateDescription: JsonField<String>) = apply {
                    this.taxRateDescription = taxRateDescription
                }

                /** The tax rate percentage, out of 100. */
                fun taxRatePercentage(taxRatePercentage: String) =
                    taxRatePercentage(JsonField.of(taxRatePercentage))

                /** The tax rate percentage, out of 100. */
                @JsonProperty("tax_rate_percentage")
                @ExcludeMissing
                fun taxRatePercentage(taxRatePercentage: JsonField<String>) = apply {
                    this.taxRatePercentage = taxRatePercentage
                }

                /** The amount of additional tax incurred by this tax rate. */
                fun amount(amount: String) = amount(JsonField.of(amount))

                /** The amount of additional tax incurred by this tax rate. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<String>) = apply { this.amount = amount }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): TaxAmount =
                    TaxAmount(
                        taxRateDescription,
                        taxRatePercentage,
                        amount,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TaxAmount && taxRateDescription == other.taxRateDescription && taxRatePercentage == other.taxRatePercentage && amount == other.amount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(taxRateDescription, taxRatePercentage, amount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TaxAmount{taxRateDescription=$taxRateDescription, taxRatePercentage=$taxRatePercentage, amount=$amount, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && amount == other.amount && discount == other.discount && endDate == other.endDate && grouping == other.grouping && minimum == other.minimum && minimumAmount == other.minimumAmount && maximum == other.maximum && maximumAmount == other.maximumAmount && name == other.name && quantity == other.quantity && startDate == other.startDate && subtotal == other.subtotal && subLineItems == other.subLineItems && taxAmounts == other.taxAmounts && id == other.id && price == other.price && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, discount, endDate, grouping, minimum, minimumAmount, maximum, maximumAmount, name, quantity, startDate, subtotal, subLineItems, taxAmounts, id, price, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{amount=$amount, discount=$discount, endDate=$endDate, grouping=$grouping, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, name=$name, quantity=$quantity, startDate=$startDate, subtotal=$subtotal, subLineItems=$subLineItems, taxAmounts=$taxAmounts, id=$id, price=$price, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Maximum.Builder::class)
    @NoAutoDetect
    class Maximum
    private constructor(
        private val maximumAmount: JsonField<String>,
        private val appliesToPriceIds: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Maximum amount applied */
        fun maximumAmount(): String = maximumAmount.getRequired("maximum_amount")

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Maximum amount applied */
        @JsonProperty("maximum_amount") @ExcludeMissing fun _maximumAmount() = maximumAmount

        /**
         * List of price_ids that this maximum amount applies to. For plan/plan phase maximums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Maximum = apply {
            if (!validated) {
                maximumAmount()
                appliesToPriceIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var maximumAmount: JsonField<String> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(maximum: Maximum) = apply {
                maximumAmount = maximum.maximumAmount
                appliesToPriceIds = maximum.appliesToPriceIds
                additionalProperties = maximum.additionalProperties.toMutableMap()
            }

            /** Maximum amount applied */
            fun maximumAmount(maximumAmount: String) = maximumAmount(JsonField.of(maximumAmount))

            /** Maximum amount applied */
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            fun maximumAmount(maximumAmount: JsonField<String>) = apply {
                this.maximumAmount = maximumAmount
            }

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this maximum amount applies to. For plan/plan phase maximums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Maximum =
                Maximum(
                    maximumAmount,
                    appliesToPriceIds.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Maximum && maximumAmount == other.maximumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(maximumAmount, appliesToPriceIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Maximum{maximumAmount=$maximumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
    }

    /**
     * User specified key-value pairs for the resource. If not present, this defaults to an empty
     * dictionary. Individual keys can be removed by setting the value to `null`, and the entire
     * metadata mapping can be cleared by setting `metadata` to `null`.
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

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

    @JsonDeserialize(builder = Minimum.Builder::class)
    @NoAutoDetect
    class Minimum
    private constructor(
        private val minimumAmount: JsonField<String>,
        private val appliesToPriceIds: JsonField<List<String>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Minimum amount applied */
        fun minimumAmount(): String = minimumAmount.getRequired("minimum_amount")

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        fun appliesToPriceIds(): List<String> =
            appliesToPriceIds.getRequired("applies_to_price_ids")

        /** Minimum amount applied */
        @JsonProperty("minimum_amount") @ExcludeMissing fun _minimumAmount() = minimumAmount

        /**
         * List of price_ids that this minimum amount applies to. For plan/plan phase minimums, this
         * can be a subset of prices.
         */
        @JsonProperty("applies_to_price_ids")
        @ExcludeMissing
        fun _appliesToPriceIds() = appliesToPriceIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (!validated) {
                minimumAmount()
                appliesToPriceIds()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var minimumAmount: JsonField<String> = JsonMissing.of()
            private var appliesToPriceIds: JsonField<List<String>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(minimum: Minimum) = apply {
                minimumAmount = minimum.minimumAmount
                appliesToPriceIds = minimum.appliesToPriceIds
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            /** Minimum amount applied */
            fun minimumAmount(minimumAmount: String) = minimumAmount(JsonField.of(minimumAmount))

            /** Minimum amount applied */
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            fun minimumAmount(minimumAmount: JsonField<String>) = apply {
                this.minimumAmount = minimumAmount
            }

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            fun appliesToPriceIds(appliesToPriceIds: List<String>) =
                appliesToPriceIds(JsonField.of(appliesToPriceIds))

            /**
             * List of price_ids that this minimum amount applies to. For plan/plan phase minimums,
             * this can be a subset of prices.
             */
            @JsonProperty("applies_to_price_ids")
            @ExcludeMissing
            fun appliesToPriceIds(appliesToPriceIds: JsonField<List<String>>) = apply {
                this.appliesToPriceIds = appliesToPriceIds
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Minimum =
                Minimum(
                    minimumAmount,
                    appliesToPriceIds.map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && minimumAmount == other.minimumAmount && appliesToPriceIds == other.appliesToPriceIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(minimumAmount, appliesToPriceIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{minimumAmount=$minimumAmount, appliesToPriceIds=$appliesToPriceIds, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = PaymentAttempt.Builder::class)
    @NoAutoDetect
    class PaymentAttempt
    private constructor(
        private val id: JsonField<String>,
        private val paymentProvider: JsonField<PaymentProvider>,
        private val paymentProviderId: JsonField<String>,
        private val amount: JsonField<String>,
        private val succeeded: JsonField<Boolean>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The ID of the payment attempt. */
        fun id(): String = id.getRequired("id")

        /** The payment provider that attempted to collect the payment. */
        fun paymentProvider(): PaymentProvider? = paymentProvider.getNullable("payment_provider")

        /** The ID of the payment attempt in the payment provider. */
        fun paymentProviderId(): String? = paymentProviderId.getNullable("payment_provider_id")

        /** The amount of the payment attempt. */
        fun amount(): String = amount.getRequired("amount")

        /** Whether the payment attempt succeeded. */
        fun succeeded(): Boolean = succeeded.getRequired("succeeded")

        /** The time at which the payment attempt was created. */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The ID of the payment attempt. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The payment provider that attempted to collect the payment. */
        @JsonProperty("payment_provider") @ExcludeMissing fun _paymentProvider() = paymentProvider

        /** The ID of the payment attempt in the payment provider. */
        @JsonProperty("payment_provider_id")
        @ExcludeMissing
        fun _paymentProviderId() = paymentProviderId

        /** The amount of the payment attempt. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** Whether the payment attempt succeeded. */
        @JsonProperty("succeeded") @ExcludeMissing fun _succeeded() = succeeded

        /** The time at which the payment attempt was created. */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentAttempt = apply {
            if (!validated) {
                id()
                paymentProvider()
                paymentProviderId()
                amount()
                succeeded()
                createdAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var paymentProvider: JsonField<PaymentProvider> = JsonMissing.of()
            private var paymentProviderId: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<String> = JsonMissing.of()
            private var succeeded: JsonField<Boolean> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(paymentAttempt: PaymentAttempt) = apply {
                id = paymentAttempt.id
                paymentProvider = paymentAttempt.paymentProvider
                paymentProviderId = paymentAttempt.paymentProviderId
                amount = paymentAttempt.amount
                succeeded = paymentAttempt.succeeded
                createdAt = paymentAttempt.createdAt
                additionalProperties = paymentAttempt.additionalProperties.toMutableMap()
            }

            /** The ID of the payment attempt. */
            fun id(id: String) = id(JsonField.of(id))

            /** The ID of the payment attempt. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The payment provider that attempted to collect the payment. */
            fun paymentProvider(paymentProvider: PaymentProvider) =
                paymentProvider(JsonField.of(paymentProvider))

            /** The payment provider that attempted to collect the payment. */
            @JsonProperty("payment_provider")
            @ExcludeMissing
            fun paymentProvider(paymentProvider: JsonField<PaymentProvider>) = apply {
                this.paymentProvider = paymentProvider
            }

            /** The ID of the payment attempt in the payment provider. */
            fun paymentProviderId(paymentProviderId: String) =
                paymentProviderId(JsonField.of(paymentProviderId))

            /** The ID of the payment attempt in the payment provider. */
            @JsonProperty("payment_provider_id")
            @ExcludeMissing
            fun paymentProviderId(paymentProviderId: JsonField<String>) = apply {
                this.paymentProviderId = paymentProviderId
            }

            /** The amount of the payment attempt. */
            fun amount(amount: String) = amount(JsonField.of(amount))

            /** The amount of the payment attempt. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<String>) = apply { this.amount = amount }

            /** Whether the payment attempt succeeded. */
            fun succeeded(succeeded: Boolean) = succeeded(JsonField.of(succeeded))

            /** Whether the payment attempt succeeded. */
            @JsonProperty("succeeded")
            @ExcludeMissing
            fun succeeded(succeeded: JsonField<Boolean>) = apply { this.succeeded = succeeded }

            /** The time at which the payment attempt was created. */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /** The time at which the payment attempt was created. */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): PaymentAttempt =
                PaymentAttempt(
                    id,
                    paymentProvider,
                    paymentProviderId,
                    amount,
                    succeeded,
                    createdAt,
                    additionalProperties.toImmutable(),
                )
        }

        class PaymentProvider
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val STRIPE = of("stripe")

                fun of(value: String) = PaymentProvider(JsonField.of(value))
            }

            enum class Known {
                STRIPE,
            }

            enum class Value {
                STRIPE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    STRIPE -> Value.STRIPE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    STRIPE -> Known.STRIPE
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentAttempt && id == other.id && paymentProvider == other.paymentProvider && paymentProviderId == other.paymentProviderId && amount == other.amount && succeeded == other.succeeded && createdAt == other.createdAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, paymentProvider, paymentProviderId, amount, succeeded, createdAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentAttempt{id=$id, paymentProvider=$paymentProvider, paymentProviderId=$paymentProviderId, amount=$amount, succeeded=$succeeded, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ShippingAddress.Builder::class)
    @NoAutoDetect
    class ShippingAddress
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val country: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun line1(): String? = line1.getNullable("line1")

        fun line2(): String? = line2.getNullable("line2")

        fun city(): String? = city.getNullable("city")

        fun state(): String? = state.getNullable("state")

        fun postalCode(): String? = postalCode.getNullable("postal_code")

        fun country(): String? = country.getNullable("country")

        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        @JsonProperty("city") @ExcludeMissing fun _city() = city

        @JsonProperty("state") @ExcludeMissing fun _state() = state

        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        @JsonProperty("country") @ExcludeMissing fun _country() = country

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ShippingAddress = apply {
            if (!validated) {
                line1()
                line2()
                city()
                state()
                postalCode()
                country()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(shippingAddress: ShippingAddress) = apply {
                line1 = shippingAddress.line1
                line2 = shippingAddress.line2
                city = shippingAddress.city
                state = shippingAddress.state
                postalCode = shippingAddress.postalCode
                country = shippingAddress.country
                additionalProperties = shippingAddress.additionalProperties.toMutableMap()
            }

            fun line1(line1: String) = line1(JsonField.of(line1))

            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            fun line2(line2: String) = line2(JsonField.of(line2))

            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            fun city(city: String) = city(JsonField.of(city))

            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun state(state: String) = state(JsonField.of(state))

            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

            fun country(country: String) = country(JsonField.of(country))

            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ISSUED = of("issued")

            val PAID = of("paid")

            val SYNCED = of("synced")

            val VOID = of("void")

            val DRAFT = of("draft")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ISSUED,
            PAID,
            SYNCED,
            VOID,
            DRAFT,
        }

        enum class Value {
            ISSUED,
            PAID,
            SYNCED,
            VOID,
            DRAFT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ISSUED -> Value.ISSUED
                PAID -> Value.PAID
                SYNCED -> Value.SYNCED
                VOID -> Value.VOID
                DRAFT -> Value.DRAFT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ISSUED -> Known.ISSUED
                PAID -> Known.PAID
                SYNCED -> Known.SYNCED
                VOID -> Known.VOID
                DRAFT -> Known.DRAFT
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(builder = Subscription.Builder::class)
    @NoAutoDetect
    class Subscription
    private constructor(
        private val id: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        fun id(): String = id.getRequired("id")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Subscription = apply {
            if (!validated) {
                id()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(subscription: Subscription) = apply {
                id = subscription.id
                additionalProperties = subscription.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Subscription = Subscription(id, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Subscription && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Subscription{id=$id, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InvoiceFetchUpcomingResponse && metadata == other.metadata && voidedAt == other.voidedAt && paidAt == other.paidAt && issuedAt == other.issuedAt && scheduledIssueAt == other.scheduledIssueAt && autoCollection == other.autoCollection && issueFailedAt == other.issueFailedAt && syncFailedAt == other.syncFailedAt && paymentFailedAt == other.paymentFailedAt && paymentStartedAt == other.paymentStartedAt && amountDue == other.amountDue && createdAt == other.createdAt && currency == other.currency && customer == other.customer && discount == other.discount && discounts == other.discounts && dueDate == other.dueDate && id == other.id && invoicePdf == other.invoicePdf && invoiceNumber == other.invoiceNumber && minimum == other.minimum && minimumAmount == other.minimumAmount && maximum == other.maximum && maximumAmount == other.maximumAmount && lineItems == other.lineItems && subscription == other.subscription && subtotal == other.subtotal && total == other.total && customerBalanceTransactions == other.customerBalanceTransactions && status == other.status && invoiceSource == other.invoiceSource && shippingAddress == other.shippingAddress && billingAddress == other.billingAddress && hostedInvoiceUrl == other.hostedInvoiceUrl && willAutoIssue == other.willAutoIssue && eligibleToIssueAt == other.eligibleToIssueAt && customerTaxId == other.customerTaxId && memo == other.memo && creditNotes == other.creditNotes && paymentAttempts == other.paymentAttempts && targetDate == other.targetDate && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(metadata, voidedAt, paidAt, issuedAt, scheduledIssueAt, autoCollection, issueFailedAt, syncFailedAt, paymentFailedAt, paymentStartedAt, amountDue, createdAt, currency, customer, discount, discounts, dueDate, id, invoicePdf, invoiceNumber, minimum, minimumAmount, maximum, maximumAmount, lineItems, subscription, subtotal, total, customerBalanceTransactions, status, invoiceSource, shippingAddress, billingAddress, hostedInvoiceUrl, willAutoIssue, eligibleToIssueAt, customerTaxId, memo, creditNotes, paymentAttempts, targetDate, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceFetchUpcomingResponse{metadata=$metadata, voidedAt=$voidedAt, paidAt=$paidAt, issuedAt=$issuedAt, scheduledIssueAt=$scheduledIssueAt, autoCollection=$autoCollection, issueFailedAt=$issueFailedAt, syncFailedAt=$syncFailedAt, paymentFailedAt=$paymentFailedAt, paymentStartedAt=$paymentStartedAt, amountDue=$amountDue, createdAt=$createdAt, currency=$currency, customer=$customer, discount=$discount, discounts=$discounts, dueDate=$dueDate, id=$id, invoicePdf=$invoicePdf, invoiceNumber=$invoiceNumber, minimum=$minimum, minimumAmount=$minimumAmount, maximum=$maximum, maximumAmount=$maximumAmount, lineItems=$lineItems, subscription=$subscription, subtotal=$subtotal, total=$total, customerBalanceTransactions=$customerBalanceTransactions, status=$status, invoiceSource=$invoiceSource, shippingAddress=$shippingAddress, billingAddress=$billingAddress, hostedInvoiceUrl=$hostedInvoiceUrl, willAutoIssue=$willAutoIssue, eligibleToIssueAt=$eligibleToIssueAt, customerTaxId=$customerTaxId, memo=$memo, creditNotes=$creditNotes, paymentAttempts=$paymentAttempts, targetDate=$targetDate, additionalProperties=$additionalProperties}"
}
