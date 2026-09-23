// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.withorb.api.core.BaseDeserializer
import com.withorb.api.core.BaseSerializer
import com.withorb.api.core.JsonValue
import com.withorb.api.core.allMaxBy
import com.withorb.api.core.getOrThrow
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

/** Issued when a backfill is closed and its events are reflected into usage. */
@JsonDeserialize(using = UnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnwrapWebhookEvent.Serializer::class)
class UnwrapWebhookEvent
private constructor(
    private val backfillReflected: BackfillReflectedWebhookEvent? = null,
    private val backfillReverted: BackfillRevertedWebhookEvent? = null,
    private val billableMetricEdited: BillableMetricEditedWebhookEvent? = null,
    private val creditBlockAccountingSyncFailed: CreditBlockAccountingSyncFailedWebhookEvent? =
        null,
    private val creditBlockAccountingSyncSucceeded:
        CreditBlockAccountingSyncSucceededWebhookEvent? =
        null,
    private val creditNoteAccountingSyncFailed: CreditNoteAccountingSyncFailedWebhookEvent? = null,
    private val creditNoteAccountingSyncSucceeded: CreditNoteAccountingSyncSucceededWebhookEvent? =
        null,
    private val creditNoteIssued: CreditNoteIssuedWebhookEvent? = null,
    private val creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidWebhookEvent? = null,
    private val customerAccountingSyncFailed: CustomerAccountingSyncFailedWebhookEvent? = null,
    private val customerAccountingSyncSucceeded: CustomerAccountingSyncSucceededWebhookEvent? =
        null,
    private val customerBalanceTransactionCreated: CustomerBalanceTransactionCreatedWebhookEvent? =
        null,
    private val customerCreated: CustomerCreatedWebhookEvent? = null,
    private val customerCreditBalanceDepleted: CustomerCreditBalanceDepletedWebhookEvent? = null,
    private val customerCreditBalanceDropped: CustomerCreditBalanceDroppedWebhookEvent? = null,
    private val customerCreditBalanceRecovered: CustomerCreditBalanceRecoveredWebhookEvent? = null,
    private val customerCreditLedgerIncremented: CustomerCreditLedgerIncrementedWebhookEvent? =
        null,
    private val customerEdited: CustomerEditedWebhookEvent? = null,
    private val dataExportsTransferError: DataExportsTransferErrorWebhookEvent? = null,
    private val dataExportsTransferSuccess: DataExportsTransferSuccessWebhookEvent? = null,
    private val eventUnmatchedEvent: EventUnmatchedEventWebhookEvent? = null,
    private val ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsWebhookEvent? = null,
    private val invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedWebhookEvent? = null,
    private val invoiceAccountingSyncSucceeded: InvoiceAccountingSyncSucceededWebhookEvent? = null,
    private val invoiceAutomationScheduleStepExecuted:
        InvoiceAutomationScheduleStepExecutedWebhookEvent? =
        null,
    private val invoiceCostDataExported: InvoiceCostDataExportedWebhookEvent? = null,
    private val invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedWebhookEvent? = null,
    private val invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedWebhookEvent? = null,
    private val invoiceDunningScheduleReset: InvoiceDunningScheduleResetWebhookEvent? = null,
    private val invoiceDunningScheduleStepExecuted:
        InvoiceDunningScheduleStepExecutedWebhookEvent? =
        null,
    private val invoiceEdited: InvoiceEditedWebhookEvent? = null,
    private val invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedWebhookEvent? = null,
    private val invoiceIssueFailed: InvoiceIssueFailedWebhookEvent? = null,
    private val invoiceIssued: InvoiceIssuedWebhookEvent? = null,
    private val invoiceIssuedSummary: InvoiceIssuedSummaryWebhookEvent? = null,
    private val invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidWebhookEvent? = null,
    private val invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidWebhookEvent? = null,
    private val invoicePaymentFailed: InvoicePaymentFailedWebhookEvent? = null,
    private val invoicePaymentProcessing: InvoicePaymentProcessingWebhookEvent? = null,
    private val invoicePaymentSucceeded: InvoicePaymentSucceededWebhookEvent? = null,
    private val invoiceSyncFailed: InvoiceSyncFailedWebhookEvent? = null,
    private val invoiceSyncSucceeded: InvoiceSyncSucceededWebhookEvent? = null,
    private val invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidWebhookEvent? = null,
    private val invoiceDueDateRecalculationCanceled:
        InvoiceDueDateRecalculationCanceledWebhookEvent? =
        null,
    private val invoiceDueDateRecalculationCompleted:
        InvoiceDueDateRecalculationCompletedWebhookEvent? =
        null,
    private val invoiceDueDateRecalculationStarted:
        InvoiceDueDateRecalculationStartedWebhookEvent? =
        null,
    private val metricEventsDroppedByWatermark: MetricEventsDroppedByWatermarkWebhookEvent? = null,
    private val paymentMethodCreated: PaymentMethodCreatedWebhookEvent? = null,
    private val paymentMethodDeleted: PaymentMethodDeletedWebhookEvent? = null,
    private val planDefaultVersionSet: PlanDefaultVersionSetWebhookEvent? = null,
    private val planVersionCreated: PlanVersionCreatedWebhookEvent? = null,
    private val priceEdited: PriceEditedWebhookEvent? = null,
    private val resourceEventTest: ResourceEventTestWebhookEvent? = null,
    private val salesOrderAccountingSyncFailed: SalesOrderAccountingSyncFailedWebhookEvent? = null,
    private val salesOrderAccountingSyncSucceeded: SalesOrderAccountingSyncSucceededWebhookEvent? =
        null,
    private val subscriptionAccountingSyncFailed: SubscriptionAccountingSyncFailedWebhookEvent? =
        null,
    private val subscriptionAccountingSyncSucceeded:
        SubscriptionAccountingSyncSucceededWebhookEvent? =
        null,
    private val subscriptionAlertDisabled: SubscriptionAlertDisabledWebhookEvent? = null,
    private val subscriptionCancellationScheduled: SubscriptionCancellationScheduledWebhookEvent? =
        null,
    private val subscriptionCancellationUnscheduled:
        SubscriptionCancellationUnscheduledWebhookEvent? =
        null,
    private val subscriptionCostExceeded: SubscriptionCostExceededWebhookEvent? = null,
    private val subscriptionCreated: SubscriptionCreatedWebhookEvent? = null,
    private val subscriptionEdited: SubscriptionEditedWebhookEvent? = null,
    private val subscriptionEnded: SubscriptionEndedWebhookEvent? = null,
    private val subscriptionFixedFeeQuantityUpdated:
        SubscriptionFixedFeeQuantityUpdatedWebhookEvent? =
        null,
    private val subscriptionGroupedCostExceeded: SubscriptionGroupedCostExceededWebhookEvent? =
        null,
    private val subscriptionInvoicingThresholdExceeded:
        SubscriptionInvoicingThresholdExceededWebhookEvent? =
        null,
    private val subscriptionLicenseAllocationReset:
        SubscriptionLicenseAllocationResetWebhookEvent? =
        null,
    private val subscriptionLicenseBalanceThresholdReached:
        SubscriptionLicenseBalanceThresholdReachedWebhookEvent? =
        null,
    private val subscriptionPlanChangeScheduled: SubscriptionPlanChangeScheduledWebhookEvent? =
        null,
    private val subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent? = null,
    private val subscriptionPlanVersionChangeScheduled:
        SubscriptionPlanVersionChangeScheduledWebhookEvent? =
        null,
    private val subscriptionPlanVersionChanged: SubscriptionPlanVersionChangedWebhookEvent? = null,
    private val subscriptionSpendExceeded: SubscriptionSpendExceededWebhookEvent? = null,
    private val subscriptionStarted: SubscriptionStartedWebhookEvent? = null,
    private val subscriptionTrialEnded: SubscriptionTrialEndedWebhookEvent? = null,
    private val subscriptionUsageExceeded: SubscriptionUsageExceededWebhookEvent? = null,
    private val transactionAccountingSyncFailed: TransactionAccountingSyncFailedWebhookEvent? =
        null,
    private val transactionAccountingSyncSucceeded:
        TransactionAccountingSyncSucceededWebhookEvent? =
        null,
    private val _json: JsonValue? = null,
) {

    /** Issued when a backfill is closed and its events are reflected into usage. */
    fun backfillReflected(): BackfillReflectedWebhookEvent? = backfillReflected

    /** Issued when a backfill is reverted, removing its events from usage. */
    fun backfillReverted(): BackfillRevertedWebhookEvent? = backfillReverted

    /** Issued when a billable metric is edited. */
    fun billableMetricEdited(): BillableMetricEditedWebhookEvent? = billableMetricEdited

    /** Issued when a credit block accounting sync fails. */
    fun creditBlockAccountingSyncFailed(): CreditBlockAccountingSyncFailedWebhookEvent? =
        creditBlockAccountingSyncFailed

    /** Issued when a credit block accounting sync succeeds. */
    fun creditBlockAccountingSyncSucceeded(): CreditBlockAccountingSyncSucceededWebhookEvent? =
        creditBlockAccountingSyncSucceeded

    /** Issued when a credit note accounting sync fails. */
    fun creditNoteAccountingSyncFailed(): CreditNoteAccountingSyncFailedWebhookEvent? =
        creditNoteAccountingSyncFailed

    /** Issued when a credit note accounting sync succeeds. */
    fun creditNoteAccountingSyncSucceeded(): CreditNoteAccountingSyncSucceededWebhookEvent? =
        creditNoteAccountingSyncSucceeded

    /** Issued when a credit note is created. */
    fun creditNoteIssued(): CreditNoteIssuedWebhookEvent? = creditNoteIssued

    /** Issued when a credit note is marked as void. */
    fun creditNoteMarkedAsVoid(): CreditNoteMarkedAsVoidWebhookEvent? = creditNoteMarkedAsVoid

    /** Issued when a customer accounting sync fails. */
    fun customerAccountingSyncFailed(): CustomerAccountingSyncFailedWebhookEvent? =
        customerAccountingSyncFailed

    /** Issued when a customer accounting sync succeeds. */
    fun customerAccountingSyncSucceeded(): CustomerAccountingSyncSucceededWebhookEvent? =
        customerAccountingSyncSucceeded

    /** Issued when a customer balance transaction is created. */
    fun customerBalanceTransactionCreated(): CustomerBalanceTransactionCreatedWebhookEvent? =
        customerBalanceTransactionCreated

    /** Issued when a customer resource is created. */
    fun customerCreated(): CustomerCreatedWebhookEvent? = customerCreated

    /** Issued when a customer's prepaid credits balance is depleted. */
    fun customerCreditBalanceDepleted(): CustomerCreditBalanceDepletedWebhookEvent? =
        customerCreditBalanceDepleted

    /** Issued when a customer's prepaid credits balance is depleted to a configured threshold. */
    fun customerCreditBalanceDropped(): CustomerCreditBalanceDroppedWebhookEvent? =
        customerCreditBalanceDropped

    /** Issued when a customer's credit balance recovers from depleted. */
    fun customerCreditBalanceRecovered(): CustomerCreditBalanceRecoveredWebhookEvent? =
        customerCreditBalanceRecovered

    /** Issued when a customer's credit ledger is incremented. */
    fun customerCreditLedgerIncremented(): CustomerCreditLedgerIncrementedWebhookEvent? =
        customerCreditLedgerIncremented

    /** Issued when a customer is updated. */
    fun customerEdited(): CustomerEditedWebhookEvent? = customerEdited

    /** Issued when a data export transfer fails. */
    fun dataExportsTransferError(): DataExportsTransferErrorWebhookEvent? = dataExportsTransferError

    /** Issued when a data export transfer succeeds. */
    fun dataExportsTransferSuccess(): DataExportsTransferSuccessWebhookEvent? =
        dataExportsTransferSuccess

    /** Issued when an event does not match any customer. */
    fun eventUnmatchedEvent(): EventUnmatchedEventWebhookEvent? = eventUnmatchedEvent

    /** Issued when ingestion events reference unmatched customer IDs. */
    fun ingestionUnmatchedCustomerIds(): IngestionUnmatchedCustomerIdsWebhookEvent? =
        ingestionUnmatchedCustomerIds

    /** Issued when an invoice accounting sync fails. */
    fun invoiceAccountingSyncFailed(): InvoiceAccountingSyncFailedWebhookEvent? =
        invoiceAccountingSyncFailed

    /** Issued when an invoice accounting sync succeeds. */
    fun invoiceAccountingSyncSucceeded(): InvoiceAccountingSyncSucceededWebhookEvent? =
        invoiceAccountingSyncSucceeded

    /** Issued when a collections-automation schedule step is executed for an invoice. */
    fun invoiceAutomationScheduleStepExecuted():
        InvoiceAutomationScheduleStepExecutedWebhookEvent? = invoiceAutomationScheduleStepExecuted

    /** Issued when invoice cost data is exported. */
    fun invoiceCostDataExported(): InvoiceCostDataExportedWebhookEvent? = invoiceCostDataExported

    /** Issued when a dunning schedule is created for an invoice. */
    fun invoiceDunningScheduleCreated(): InvoiceDunningScheduleCreatedWebhookEvent? =
        invoiceDunningScheduleCreated

    /** Issued when a dunning schedule ends. */
    fun invoiceDunningScheduleEnded(): InvoiceDunningScheduleEndedWebhookEvent? =
        invoiceDunningScheduleEnded

    /** Issued when a dunning schedule is reset. */
    fun invoiceDunningScheduleReset(): InvoiceDunningScheduleResetWebhookEvent? =
        invoiceDunningScheduleReset

    /** Issued when a dunning schedule step is executed. */
    fun invoiceDunningScheduleStepExecuted(): InvoiceDunningScheduleStepExecutedWebhookEvent? =
        invoiceDunningScheduleStepExecuted

    /** Issued when a draft invoice has been edited. */
    fun invoiceEdited(): InvoiceEditedWebhookEvent? = invoiceEdited

    /** Issued when an invoice's invoice date has elapsed. */
    fun invoiceInvoiceDateElapsed(): InvoiceInvoiceDateElapsedWebhookEvent? =
        invoiceInvoiceDateElapsed

    /** Issued when an invoice issue attempt fails. */
    fun invoiceIssueFailed(): InvoiceIssueFailedWebhookEvent? = invoiceIssueFailed

    /** Issued when an invoice transitions to the "issued" state. */
    fun invoiceIssued(): InvoiceIssuedWebhookEvent? = invoiceIssued

    /**
     * A lightweight variant of invoice.issued for accounts configured to receive a summarized
     * invoice payload.
     */
    fun invoiceIssuedSummary(): InvoiceIssuedSummaryWebhookEvent? = invoiceIssuedSummary

    /** Issued when an invoice is manually marked as paid. */
    fun invoiceManuallyMarkedAsPaid(): InvoiceManuallyMarkedAsPaidWebhookEvent? =
        invoiceManuallyMarkedAsPaid

    /** Issued when an invoice is marked as void. */
    fun invoiceManuallyMarkedAsVoid(): InvoiceManuallyMarkedAsVoidWebhookEvent? =
        invoiceManuallyMarkedAsVoid

    /**
     * Issued when automated payment collection for an invoice fails for a configured payment
     * gateway.
     */
    fun invoicePaymentFailed(): InvoicePaymentFailedWebhookEvent? = invoicePaymentFailed

    /** Issued when an invoice payment is being processed. */
    fun invoicePaymentProcessing(): InvoicePaymentProcessingWebhookEvent? = invoicePaymentProcessing

    /**
     * Issued when automated payment collection for an invoice succeeds for a configured payment
     * gateway.
     */
    fun invoicePaymentSucceeded(): InvoicePaymentSucceededWebhookEvent? = invoicePaymentSucceeded

    /** Issued when an invoice sync fails. */
    fun invoiceSyncFailed(): InvoiceSyncFailedWebhookEvent? = invoiceSyncFailed

    /** Issued when an invoice sync succeeds. */
    fun invoiceSyncSucceeded(): InvoiceSyncSucceededWebhookEvent? = invoiceSyncSucceeded

    /** Issued when an invoice is undone from marked as paid. */
    fun invoiceUndoMarkAsPaid(): InvoiceUndoMarkAsPaidWebhookEvent? = invoiceUndoMarkAsPaid

    /** Issued when an invoice due date recalculation is canceled. */
    fun invoiceDueDateRecalculationCanceled(): InvoiceDueDateRecalculationCanceledWebhookEvent? =
        invoiceDueDateRecalculationCanceled

    /** Issued when an invoice due date recalculation is completed. */
    fun invoiceDueDateRecalculationCompleted(): InvoiceDueDateRecalculationCompletedWebhookEvent? =
        invoiceDueDateRecalculationCompleted

    /** Issued when an invoice due date recalculation is started. */
    fun invoiceDueDateRecalculationStarted(): InvoiceDueDateRecalculationStartedWebhookEvent? =
        invoiceDueDateRecalculationStarted

    /** Issued when metric events are dropped by watermark threshold. */
    fun metricEventsDroppedByWatermark(): MetricEventsDroppedByWatermarkWebhookEvent? =
        metricEventsDroppedByWatermark

    /** Issued when a payment method is created. */
    fun paymentMethodCreated(): PaymentMethodCreatedWebhookEvent? = paymentMethodCreated

    /** Issued when a payment method is deleted. */
    fun paymentMethodDeleted(): PaymentMethodDeletedWebhookEvent? = paymentMethodDeleted

    /** Issued when a plan's default version is set. */
    fun planDefaultVersionSet(): PlanDefaultVersionSetWebhookEvent? = planDefaultVersionSet

    /** Issued when a new plan version is created. */
    fun planVersionCreated(): PlanVersionCreatedWebhookEvent? = planVersionCreated

    /** Issued when a price is edited. */
    fun priceEdited(): PriceEditedWebhookEvent? = priceEdited

    /** Issued when a test webhook is sent. */
    fun resourceEventTest(): ResourceEventTestWebhookEvent? = resourceEventTest

    /** Issued when a sales order accounting sync fails. */
    fun salesOrderAccountingSyncFailed(): SalesOrderAccountingSyncFailedWebhookEvent? =
        salesOrderAccountingSyncFailed

    /** Issued when a sales order accounting sync succeeds. */
    fun salesOrderAccountingSyncSucceeded(): SalesOrderAccountingSyncSucceededWebhookEvent? =
        salesOrderAccountingSyncSucceeded

    /** Issued when a subscription accounting sync fails. */
    fun subscriptionAccountingSyncFailed(): SubscriptionAccountingSyncFailedWebhookEvent? =
        subscriptionAccountingSyncFailed

    /** Issued when a subscription accounting sync succeeds. */
    fun subscriptionAccountingSyncSucceeded(): SubscriptionAccountingSyncSucceededWebhookEvent? =
        subscriptionAccountingSyncSucceeded

    /** Issued when an alert is automatically disabled by the system. */
    fun subscriptionAlertDisabled(): SubscriptionAlertDisabledWebhookEvent? =
        subscriptionAlertDisabled

    /** Issued when a subscription cancellation is scheduled. */
    fun subscriptionCancellationScheduled(): SubscriptionCancellationScheduledWebhookEvent? =
        subscriptionCancellationScheduled

    /** Issued when a scheduled subscription cancellation is unscheduled. */
    fun subscriptionCancellationUnscheduled(): SubscriptionCancellationUnscheduledWebhookEvent? =
        subscriptionCancellationUnscheduled

    /** Issued when a subscription's cost exceeds a pre-configured amount threshold. */
    fun subscriptionCostExceeded(): SubscriptionCostExceededWebhookEvent? = subscriptionCostExceeded

    /** Issued when a subscription resource is created. */
    fun subscriptionCreated(): SubscriptionCreatedWebhookEvent? = subscriptionCreated

    /** Issued when a subscription is updated. */
    fun subscriptionEdited(): SubscriptionEditedWebhookEvent? = subscriptionEdited

    /** Issued whenever a customer's subscription ends/lapses. */
    fun subscriptionEnded(): SubscriptionEndedWebhookEvent? = subscriptionEnded

    /** Issued when a subscription's fixed fee quantity is updated. */
    fun subscriptionFixedFeeQuantityUpdated(): SubscriptionFixedFeeQuantityUpdatedWebhookEvent? =
        subscriptionFixedFeeQuantityUpdated

    /** Issued when grouped subscription costs exceed a pre-configured amount threshold. */
    fun subscriptionGroupedCostExceeded(): SubscriptionGroupedCostExceededWebhookEvent? =
        subscriptionGroupedCostExceeded

    /**
     * Issued when a subscription's invoicing threshold is exceeded and an evaluation is performed.
     */
    fun subscriptionInvoicingThresholdExceeded():
        SubscriptionInvoicingThresholdExceededWebhookEvent? = subscriptionInvoicingThresholdExceeded

    /** Issued when a license allocation is reset. */
    fun subscriptionLicenseAllocationReset(): SubscriptionLicenseAllocationResetWebhookEvent? =
        subscriptionLicenseAllocationReset

    /** Issued when a license balance threshold is reached. */
    fun subscriptionLicenseBalanceThresholdReached():
        SubscriptionLicenseBalanceThresholdReachedWebhookEvent? =
        subscriptionLicenseBalanceThresholdReached

    /** Issued when a subscription plan change is scheduled. */
    fun subscriptionPlanChangeScheduled(): SubscriptionPlanChangeScheduledWebhookEvent? =
        subscriptionPlanChangeScheduled

    /** Issued when a subscription transitions from one plan to a different plan. */
    fun subscriptionPlanChanged(): SubscriptionPlanChangedWebhookEvent? = subscriptionPlanChanged

    /** Issued when a subscription plan version change is scheduled. */
    fun subscriptionPlanVersionChangeScheduled():
        SubscriptionPlanVersionChangeScheduledWebhookEvent? = subscriptionPlanVersionChangeScheduled

    /** Issued when a subscription plan version has changed. */
    fun subscriptionPlanVersionChanged(): SubscriptionPlanVersionChangedWebhookEvent? =
        subscriptionPlanVersionChanged

    /**
     * Issued when a subscription's rated spend, before credits and adjustments, exceeds a
     * pre-configured amount threshold.
     */
    fun subscriptionSpendExceeded(): SubscriptionSpendExceededWebhookEvent? =
        subscriptionSpendExceeded

    /** Issued when a subscription begins. */
    fun subscriptionStarted(): SubscriptionStartedWebhookEvent? = subscriptionStarted

    /** Issued when a subscription trial ends. */
    fun subscriptionTrialEnded(): SubscriptionTrialEndedWebhookEvent? = subscriptionTrialEnded

    /**
     * Issued when a billable metric in a subscription exceeds a pre-configured quantity threshold.
     */
    fun subscriptionUsageExceeded(): SubscriptionUsageExceededWebhookEvent? =
        subscriptionUsageExceeded

    /** Issued when a transaction accounting sync fails. */
    fun transactionAccountingSyncFailed(): TransactionAccountingSyncFailedWebhookEvent? =
        transactionAccountingSyncFailed

    /** Issued when a transaction accounting sync succeeds. */
    fun transactionAccountingSyncSucceeded(): TransactionAccountingSyncSucceededWebhookEvent? =
        transactionAccountingSyncSucceeded

    fun isBackfillReflected(): Boolean = backfillReflected != null

    fun isBackfillReverted(): Boolean = backfillReverted != null

    fun isBillableMetricEdited(): Boolean = billableMetricEdited != null

    fun isCreditBlockAccountingSyncFailed(): Boolean = creditBlockAccountingSyncFailed != null

    fun isCreditBlockAccountingSyncSucceeded(): Boolean = creditBlockAccountingSyncSucceeded != null

    fun isCreditNoteAccountingSyncFailed(): Boolean = creditNoteAccountingSyncFailed != null

    fun isCreditNoteAccountingSyncSucceeded(): Boolean = creditNoteAccountingSyncSucceeded != null

    fun isCreditNoteIssued(): Boolean = creditNoteIssued != null

    fun isCreditNoteMarkedAsVoid(): Boolean = creditNoteMarkedAsVoid != null

    fun isCustomerAccountingSyncFailed(): Boolean = customerAccountingSyncFailed != null

    fun isCustomerAccountingSyncSucceeded(): Boolean = customerAccountingSyncSucceeded != null

    fun isCustomerBalanceTransactionCreated(): Boolean = customerBalanceTransactionCreated != null

    fun isCustomerCreated(): Boolean = customerCreated != null

    fun isCustomerCreditBalanceDepleted(): Boolean = customerCreditBalanceDepleted != null

    fun isCustomerCreditBalanceDropped(): Boolean = customerCreditBalanceDropped != null

    fun isCustomerCreditBalanceRecovered(): Boolean = customerCreditBalanceRecovered != null

    fun isCustomerCreditLedgerIncremented(): Boolean = customerCreditLedgerIncremented != null

    fun isCustomerEdited(): Boolean = customerEdited != null

    fun isDataExportsTransferError(): Boolean = dataExportsTransferError != null

    fun isDataExportsTransferSuccess(): Boolean = dataExportsTransferSuccess != null

    fun isEventUnmatchedEvent(): Boolean = eventUnmatchedEvent != null

    fun isIngestionUnmatchedCustomerIds(): Boolean = ingestionUnmatchedCustomerIds != null

    fun isInvoiceAccountingSyncFailed(): Boolean = invoiceAccountingSyncFailed != null

    fun isInvoiceAccountingSyncSucceeded(): Boolean = invoiceAccountingSyncSucceeded != null

    fun isInvoiceAutomationScheduleStepExecuted(): Boolean =
        invoiceAutomationScheduleStepExecuted != null

    fun isInvoiceCostDataExported(): Boolean = invoiceCostDataExported != null

    fun isInvoiceDunningScheduleCreated(): Boolean = invoiceDunningScheduleCreated != null

    fun isInvoiceDunningScheduleEnded(): Boolean = invoiceDunningScheduleEnded != null

    fun isInvoiceDunningScheduleReset(): Boolean = invoiceDunningScheduleReset != null

    fun isInvoiceDunningScheduleStepExecuted(): Boolean = invoiceDunningScheduleStepExecuted != null

    fun isInvoiceEdited(): Boolean = invoiceEdited != null

    fun isInvoiceInvoiceDateElapsed(): Boolean = invoiceInvoiceDateElapsed != null

    fun isInvoiceIssueFailed(): Boolean = invoiceIssueFailed != null

    fun isInvoiceIssued(): Boolean = invoiceIssued != null

    fun isInvoiceIssuedSummary(): Boolean = invoiceIssuedSummary != null

    fun isInvoiceManuallyMarkedAsPaid(): Boolean = invoiceManuallyMarkedAsPaid != null

    fun isInvoiceManuallyMarkedAsVoid(): Boolean = invoiceManuallyMarkedAsVoid != null

    fun isInvoicePaymentFailed(): Boolean = invoicePaymentFailed != null

    fun isInvoicePaymentProcessing(): Boolean = invoicePaymentProcessing != null

    fun isInvoicePaymentSucceeded(): Boolean = invoicePaymentSucceeded != null

    fun isInvoiceSyncFailed(): Boolean = invoiceSyncFailed != null

    fun isInvoiceSyncSucceeded(): Boolean = invoiceSyncSucceeded != null

    fun isInvoiceUndoMarkAsPaid(): Boolean = invoiceUndoMarkAsPaid != null

    fun isInvoiceDueDateRecalculationCanceled(): Boolean =
        invoiceDueDateRecalculationCanceled != null

    fun isInvoiceDueDateRecalculationCompleted(): Boolean =
        invoiceDueDateRecalculationCompleted != null

    fun isInvoiceDueDateRecalculationStarted(): Boolean = invoiceDueDateRecalculationStarted != null

    fun isMetricEventsDroppedByWatermark(): Boolean = metricEventsDroppedByWatermark != null

    fun isPaymentMethodCreated(): Boolean = paymentMethodCreated != null

    fun isPaymentMethodDeleted(): Boolean = paymentMethodDeleted != null

    fun isPlanDefaultVersionSet(): Boolean = planDefaultVersionSet != null

    fun isPlanVersionCreated(): Boolean = planVersionCreated != null

    fun isPriceEdited(): Boolean = priceEdited != null

    fun isResourceEventTest(): Boolean = resourceEventTest != null

    fun isSalesOrderAccountingSyncFailed(): Boolean = salesOrderAccountingSyncFailed != null

    fun isSalesOrderAccountingSyncSucceeded(): Boolean = salesOrderAccountingSyncSucceeded != null

    fun isSubscriptionAccountingSyncFailed(): Boolean = subscriptionAccountingSyncFailed != null

    fun isSubscriptionAccountingSyncSucceeded(): Boolean =
        subscriptionAccountingSyncSucceeded != null

    fun isSubscriptionAlertDisabled(): Boolean = subscriptionAlertDisabled != null

    fun isSubscriptionCancellationScheduled(): Boolean = subscriptionCancellationScheduled != null

    fun isSubscriptionCancellationUnscheduled(): Boolean =
        subscriptionCancellationUnscheduled != null

    fun isSubscriptionCostExceeded(): Boolean = subscriptionCostExceeded != null

    fun isSubscriptionCreated(): Boolean = subscriptionCreated != null

    fun isSubscriptionEdited(): Boolean = subscriptionEdited != null

    fun isSubscriptionEnded(): Boolean = subscriptionEnded != null

    fun isSubscriptionFixedFeeQuantityUpdated(): Boolean =
        subscriptionFixedFeeQuantityUpdated != null

    fun isSubscriptionGroupedCostExceeded(): Boolean = subscriptionGroupedCostExceeded != null

    fun isSubscriptionInvoicingThresholdExceeded(): Boolean =
        subscriptionInvoicingThresholdExceeded != null

    fun isSubscriptionLicenseAllocationReset(): Boolean = subscriptionLicenseAllocationReset != null

    fun isSubscriptionLicenseBalanceThresholdReached(): Boolean =
        subscriptionLicenseBalanceThresholdReached != null

    fun isSubscriptionPlanChangeScheduled(): Boolean = subscriptionPlanChangeScheduled != null

    fun isSubscriptionPlanChanged(): Boolean = subscriptionPlanChanged != null

    fun isSubscriptionPlanVersionChangeScheduled(): Boolean =
        subscriptionPlanVersionChangeScheduled != null

    fun isSubscriptionPlanVersionChanged(): Boolean = subscriptionPlanVersionChanged != null

    fun isSubscriptionSpendExceeded(): Boolean = subscriptionSpendExceeded != null

    fun isSubscriptionStarted(): Boolean = subscriptionStarted != null

    fun isSubscriptionTrialEnded(): Boolean = subscriptionTrialEnded != null

    fun isSubscriptionUsageExceeded(): Boolean = subscriptionUsageExceeded != null

    fun isTransactionAccountingSyncFailed(): Boolean = transactionAccountingSyncFailed != null

    fun isTransactionAccountingSyncSucceeded(): Boolean = transactionAccountingSyncSucceeded != null

    /** Issued when a backfill is closed and its events are reflected into usage. */
    fun asBackfillReflected(): BackfillReflectedWebhookEvent =
        backfillReflected.getOrThrow("backfillReflected")

    /** Issued when a backfill is reverted, removing its events from usage. */
    fun asBackfillReverted(): BackfillRevertedWebhookEvent =
        backfillReverted.getOrThrow("backfillReverted")

    /** Issued when a billable metric is edited. */
    fun asBillableMetricEdited(): BillableMetricEditedWebhookEvent =
        billableMetricEdited.getOrThrow("billableMetricEdited")

    /** Issued when a credit block accounting sync fails. */
    fun asCreditBlockAccountingSyncFailed(): CreditBlockAccountingSyncFailedWebhookEvent =
        creditBlockAccountingSyncFailed.getOrThrow("creditBlockAccountingSyncFailed")

    /** Issued when a credit block accounting sync succeeds. */
    fun asCreditBlockAccountingSyncSucceeded(): CreditBlockAccountingSyncSucceededWebhookEvent =
        creditBlockAccountingSyncSucceeded.getOrThrow("creditBlockAccountingSyncSucceeded")

    /** Issued when a credit note accounting sync fails. */
    fun asCreditNoteAccountingSyncFailed(): CreditNoteAccountingSyncFailedWebhookEvent =
        creditNoteAccountingSyncFailed.getOrThrow("creditNoteAccountingSyncFailed")

    /** Issued when a credit note accounting sync succeeds. */
    fun asCreditNoteAccountingSyncSucceeded(): CreditNoteAccountingSyncSucceededWebhookEvent =
        creditNoteAccountingSyncSucceeded.getOrThrow("creditNoteAccountingSyncSucceeded")

    /** Issued when a credit note is created. */
    fun asCreditNoteIssued(): CreditNoteIssuedWebhookEvent =
        creditNoteIssued.getOrThrow("creditNoteIssued")

    /** Issued when a credit note is marked as void. */
    fun asCreditNoteMarkedAsVoid(): CreditNoteMarkedAsVoidWebhookEvent =
        creditNoteMarkedAsVoid.getOrThrow("creditNoteMarkedAsVoid")

    /** Issued when a customer accounting sync fails. */
    fun asCustomerAccountingSyncFailed(): CustomerAccountingSyncFailedWebhookEvent =
        customerAccountingSyncFailed.getOrThrow("customerAccountingSyncFailed")

    /** Issued when a customer accounting sync succeeds. */
    fun asCustomerAccountingSyncSucceeded(): CustomerAccountingSyncSucceededWebhookEvent =
        customerAccountingSyncSucceeded.getOrThrow("customerAccountingSyncSucceeded")

    /** Issued when a customer balance transaction is created. */
    fun asCustomerBalanceTransactionCreated(): CustomerBalanceTransactionCreatedWebhookEvent =
        customerBalanceTransactionCreated.getOrThrow("customerBalanceTransactionCreated")

    /** Issued when a customer resource is created. */
    fun asCustomerCreated(): CustomerCreatedWebhookEvent =
        customerCreated.getOrThrow("customerCreated")

    /** Issued when a customer's prepaid credits balance is depleted. */
    fun asCustomerCreditBalanceDepleted(): CustomerCreditBalanceDepletedWebhookEvent =
        customerCreditBalanceDepleted.getOrThrow("customerCreditBalanceDepleted")

    /** Issued when a customer's prepaid credits balance is depleted to a configured threshold. */
    fun asCustomerCreditBalanceDropped(): CustomerCreditBalanceDroppedWebhookEvent =
        customerCreditBalanceDropped.getOrThrow("customerCreditBalanceDropped")

    /** Issued when a customer's credit balance recovers from depleted. */
    fun asCustomerCreditBalanceRecovered(): CustomerCreditBalanceRecoveredWebhookEvent =
        customerCreditBalanceRecovered.getOrThrow("customerCreditBalanceRecovered")

    /** Issued when a customer's credit ledger is incremented. */
    fun asCustomerCreditLedgerIncremented(): CustomerCreditLedgerIncrementedWebhookEvent =
        customerCreditLedgerIncremented.getOrThrow("customerCreditLedgerIncremented")

    /** Issued when a customer is updated. */
    fun asCustomerEdited(): CustomerEditedWebhookEvent = customerEdited.getOrThrow("customerEdited")

    /** Issued when a data export transfer fails. */
    fun asDataExportsTransferError(): DataExportsTransferErrorWebhookEvent =
        dataExportsTransferError.getOrThrow("dataExportsTransferError")

    /** Issued when a data export transfer succeeds. */
    fun asDataExportsTransferSuccess(): DataExportsTransferSuccessWebhookEvent =
        dataExportsTransferSuccess.getOrThrow("dataExportsTransferSuccess")

    /** Issued when an event does not match any customer. */
    fun asEventUnmatchedEvent(): EventUnmatchedEventWebhookEvent =
        eventUnmatchedEvent.getOrThrow("eventUnmatchedEvent")

    /** Issued when ingestion events reference unmatched customer IDs. */
    fun asIngestionUnmatchedCustomerIds(): IngestionUnmatchedCustomerIdsWebhookEvent =
        ingestionUnmatchedCustomerIds.getOrThrow("ingestionUnmatchedCustomerIds")

    /** Issued when an invoice accounting sync fails. */
    fun asInvoiceAccountingSyncFailed(): InvoiceAccountingSyncFailedWebhookEvent =
        invoiceAccountingSyncFailed.getOrThrow("invoiceAccountingSyncFailed")

    /** Issued when an invoice accounting sync succeeds. */
    fun asInvoiceAccountingSyncSucceeded(): InvoiceAccountingSyncSucceededWebhookEvent =
        invoiceAccountingSyncSucceeded.getOrThrow("invoiceAccountingSyncSucceeded")

    /** Issued when a collections-automation schedule step is executed for an invoice. */
    fun asInvoiceAutomationScheduleStepExecuted():
        InvoiceAutomationScheduleStepExecutedWebhookEvent =
        invoiceAutomationScheduleStepExecuted.getOrThrow("invoiceAutomationScheduleStepExecuted")

    /** Issued when invoice cost data is exported. */
    fun asInvoiceCostDataExported(): InvoiceCostDataExportedWebhookEvent =
        invoiceCostDataExported.getOrThrow("invoiceCostDataExported")

    /** Issued when a dunning schedule is created for an invoice. */
    fun asInvoiceDunningScheduleCreated(): InvoiceDunningScheduleCreatedWebhookEvent =
        invoiceDunningScheduleCreated.getOrThrow("invoiceDunningScheduleCreated")

    /** Issued when a dunning schedule ends. */
    fun asInvoiceDunningScheduleEnded(): InvoiceDunningScheduleEndedWebhookEvent =
        invoiceDunningScheduleEnded.getOrThrow("invoiceDunningScheduleEnded")

    /** Issued when a dunning schedule is reset. */
    fun asInvoiceDunningScheduleReset(): InvoiceDunningScheduleResetWebhookEvent =
        invoiceDunningScheduleReset.getOrThrow("invoiceDunningScheduleReset")

    /** Issued when a dunning schedule step is executed. */
    fun asInvoiceDunningScheduleStepExecuted(): InvoiceDunningScheduleStepExecutedWebhookEvent =
        invoiceDunningScheduleStepExecuted.getOrThrow("invoiceDunningScheduleStepExecuted")

    /** Issued when a draft invoice has been edited. */
    fun asInvoiceEdited(): InvoiceEditedWebhookEvent = invoiceEdited.getOrThrow("invoiceEdited")

    /** Issued when an invoice's invoice date has elapsed. */
    fun asInvoiceInvoiceDateElapsed(): InvoiceInvoiceDateElapsedWebhookEvent =
        invoiceInvoiceDateElapsed.getOrThrow("invoiceInvoiceDateElapsed")

    /** Issued when an invoice issue attempt fails. */
    fun asInvoiceIssueFailed(): InvoiceIssueFailedWebhookEvent =
        invoiceIssueFailed.getOrThrow("invoiceIssueFailed")

    /** Issued when an invoice transitions to the "issued" state. */
    fun asInvoiceIssued(): InvoiceIssuedWebhookEvent = invoiceIssued.getOrThrow("invoiceIssued")

    /**
     * A lightweight variant of invoice.issued for accounts configured to receive a summarized
     * invoice payload.
     */
    fun asInvoiceIssuedSummary(): InvoiceIssuedSummaryWebhookEvent =
        invoiceIssuedSummary.getOrThrow("invoiceIssuedSummary")

    /** Issued when an invoice is manually marked as paid. */
    fun asInvoiceManuallyMarkedAsPaid(): InvoiceManuallyMarkedAsPaidWebhookEvent =
        invoiceManuallyMarkedAsPaid.getOrThrow("invoiceManuallyMarkedAsPaid")

    /** Issued when an invoice is marked as void. */
    fun asInvoiceManuallyMarkedAsVoid(): InvoiceManuallyMarkedAsVoidWebhookEvent =
        invoiceManuallyMarkedAsVoid.getOrThrow("invoiceManuallyMarkedAsVoid")

    /**
     * Issued when automated payment collection for an invoice fails for a configured payment
     * gateway.
     */
    fun asInvoicePaymentFailed(): InvoicePaymentFailedWebhookEvent =
        invoicePaymentFailed.getOrThrow("invoicePaymentFailed")

    /** Issued when an invoice payment is being processed. */
    fun asInvoicePaymentProcessing(): InvoicePaymentProcessingWebhookEvent =
        invoicePaymentProcessing.getOrThrow("invoicePaymentProcessing")

    /**
     * Issued when automated payment collection for an invoice succeeds for a configured payment
     * gateway.
     */
    fun asInvoicePaymentSucceeded(): InvoicePaymentSucceededWebhookEvent =
        invoicePaymentSucceeded.getOrThrow("invoicePaymentSucceeded")

    /** Issued when an invoice sync fails. */
    fun asInvoiceSyncFailed(): InvoiceSyncFailedWebhookEvent =
        invoiceSyncFailed.getOrThrow("invoiceSyncFailed")

    /** Issued when an invoice sync succeeds. */
    fun asInvoiceSyncSucceeded(): InvoiceSyncSucceededWebhookEvent =
        invoiceSyncSucceeded.getOrThrow("invoiceSyncSucceeded")

    /** Issued when an invoice is undone from marked as paid. */
    fun asInvoiceUndoMarkAsPaid(): InvoiceUndoMarkAsPaidWebhookEvent =
        invoiceUndoMarkAsPaid.getOrThrow("invoiceUndoMarkAsPaid")

    /** Issued when an invoice due date recalculation is canceled. */
    fun asInvoiceDueDateRecalculationCanceled(): InvoiceDueDateRecalculationCanceledWebhookEvent =
        invoiceDueDateRecalculationCanceled.getOrThrow("invoiceDueDateRecalculationCanceled")

    /** Issued when an invoice due date recalculation is completed. */
    fun asInvoiceDueDateRecalculationCompleted(): InvoiceDueDateRecalculationCompletedWebhookEvent =
        invoiceDueDateRecalculationCompleted.getOrThrow("invoiceDueDateRecalculationCompleted")

    /** Issued when an invoice due date recalculation is started. */
    fun asInvoiceDueDateRecalculationStarted(): InvoiceDueDateRecalculationStartedWebhookEvent =
        invoiceDueDateRecalculationStarted.getOrThrow("invoiceDueDateRecalculationStarted")

    /** Issued when metric events are dropped by watermark threshold. */
    fun asMetricEventsDroppedByWatermark(): MetricEventsDroppedByWatermarkWebhookEvent =
        metricEventsDroppedByWatermark.getOrThrow("metricEventsDroppedByWatermark")

    /** Issued when a payment method is created. */
    fun asPaymentMethodCreated(): PaymentMethodCreatedWebhookEvent =
        paymentMethodCreated.getOrThrow("paymentMethodCreated")

    /** Issued when a payment method is deleted. */
    fun asPaymentMethodDeleted(): PaymentMethodDeletedWebhookEvent =
        paymentMethodDeleted.getOrThrow("paymentMethodDeleted")

    /** Issued when a plan's default version is set. */
    fun asPlanDefaultVersionSet(): PlanDefaultVersionSetWebhookEvent =
        planDefaultVersionSet.getOrThrow("planDefaultVersionSet")

    /** Issued when a new plan version is created. */
    fun asPlanVersionCreated(): PlanVersionCreatedWebhookEvent =
        planVersionCreated.getOrThrow("planVersionCreated")

    /** Issued when a price is edited. */
    fun asPriceEdited(): PriceEditedWebhookEvent = priceEdited.getOrThrow("priceEdited")

    /** Issued when a test webhook is sent. */
    fun asResourceEventTest(): ResourceEventTestWebhookEvent =
        resourceEventTest.getOrThrow("resourceEventTest")

    /** Issued when a sales order accounting sync fails. */
    fun asSalesOrderAccountingSyncFailed(): SalesOrderAccountingSyncFailedWebhookEvent =
        salesOrderAccountingSyncFailed.getOrThrow("salesOrderAccountingSyncFailed")

    /** Issued when a sales order accounting sync succeeds. */
    fun asSalesOrderAccountingSyncSucceeded(): SalesOrderAccountingSyncSucceededWebhookEvent =
        salesOrderAccountingSyncSucceeded.getOrThrow("salesOrderAccountingSyncSucceeded")

    /** Issued when a subscription accounting sync fails. */
    fun asSubscriptionAccountingSyncFailed(): SubscriptionAccountingSyncFailedWebhookEvent =
        subscriptionAccountingSyncFailed.getOrThrow("subscriptionAccountingSyncFailed")

    /** Issued when a subscription accounting sync succeeds. */
    fun asSubscriptionAccountingSyncSucceeded(): SubscriptionAccountingSyncSucceededWebhookEvent =
        subscriptionAccountingSyncSucceeded.getOrThrow("subscriptionAccountingSyncSucceeded")

    /** Issued when an alert is automatically disabled by the system. */
    fun asSubscriptionAlertDisabled(): SubscriptionAlertDisabledWebhookEvent =
        subscriptionAlertDisabled.getOrThrow("subscriptionAlertDisabled")

    /** Issued when a subscription cancellation is scheduled. */
    fun asSubscriptionCancellationScheduled(): SubscriptionCancellationScheduledWebhookEvent =
        subscriptionCancellationScheduled.getOrThrow("subscriptionCancellationScheduled")

    /** Issued when a scheduled subscription cancellation is unscheduled. */
    fun asSubscriptionCancellationUnscheduled(): SubscriptionCancellationUnscheduledWebhookEvent =
        subscriptionCancellationUnscheduled.getOrThrow("subscriptionCancellationUnscheduled")

    /** Issued when a subscription's cost exceeds a pre-configured amount threshold. */
    fun asSubscriptionCostExceeded(): SubscriptionCostExceededWebhookEvent =
        subscriptionCostExceeded.getOrThrow("subscriptionCostExceeded")

    /** Issued when a subscription resource is created. */
    fun asSubscriptionCreated(): SubscriptionCreatedWebhookEvent =
        subscriptionCreated.getOrThrow("subscriptionCreated")

    /** Issued when a subscription is updated. */
    fun asSubscriptionEdited(): SubscriptionEditedWebhookEvent =
        subscriptionEdited.getOrThrow("subscriptionEdited")

    /** Issued whenever a customer's subscription ends/lapses. */
    fun asSubscriptionEnded(): SubscriptionEndedWebhookEvent =
        subscriptionEnded.getOrThrow("subscriptionEnded")

    /** Issued when a subscription's fixed fee quantity is updated. */
    fun asSubscriptionFixedFeeQuantityUpdated(): SubscriptionFixedFeeQuantityUpdatedWebhookEvent =
        subscriptionFixedFeeQuantityUpdated.getOrThrow("subscriptionFixedFeeQuantityUpdated")

    /** Issued when grouped subscription costs exceed a pre-configured amount threshold. */
    fun asSubscriptionGroupedCostExceeded(): SubscriptionGroupedCostExceededWebhookEvent =
        subscriptionGroupedCostExceeded.getOrThrow("subscriptionGroupedCostExceeded")

    /**
     * Issued when a subscription's invoicing threshold is exceeded and an evaluation is performed.
     */
    fun asSubscriptionInvoicingThresholdExceeded():
        SubscriptionInvoicingThresholdExceededWebhookEvent =
        subscriptionInvoicingThresholdExceeded.getOrThrow("subscriptionInvoicingThresholdExceeded")

    /** Issued when a license allocation is reset. */
    fun asSubscriptionLicenseAllocationReset(): SubscriptionLicenseAllocationResetWebhookEvent =
        subscriptionLicenseAllocationReset.getOrThrow("subscriptionLicenseAllocationReset")

    /** Issued when a license balance threshold is reached. */
    fun asSubscriptionLicenseBalanceThresholdReached():
        SubscriptionLicenseBalanceThresholdReachedWebhookEvent =
        subscriptionLicenseBalanceThresholdReached.getOrThrow(
            "subscriptionLicenseBalanceThresholdReached"
        )

    /** Issued when a subscription plan change is scheduled. */
    fun asSubscriptionPlanChangeScheduled(): SubscriptionPlanChangeScheduledWebhookEvent =
        subscriptionPlanChangeScheduled.getOrThrow("subscriptionPlanChangeScheduled")

    /** Issued when a subscription transitions from one plan to a different plan. */
    fun asSubscriptionPlanChanged(): SubscriptionPlanChangedWebhookEvent =
        subscriptionPlanChanged.getOrThrow("subscriptionPlanChanged")

    /** Issued when a subscription plan version change is scheduled. */
    fun asSubscriptionPlanVersionChangeScheduled():
        SubscriptionPlanVersionChangeScheduledWebhookEvent =
        subscriptionPlanVersionChangeScheduled.getOrThrow("subscriptionPlanVersionChangeScheduled")

    /** Issued when a subscription plan version has changed. */
    fun asSubscriptionPlanVersionChanged(): SubscriptionPlanVersionChangedWebhookEvent =
        subscriptionPlanVersionChanged.getOrThrow("subscriptionPlanVersionChanged")

    /**
     * Issued when a subscription's rated spend, before credits and adjustments, exceeds a
     * pre-configured amount threshold.
     */
    fun asSubscriptionSpendExceeded(): SubscriptionSpendExceededWebhookEvent =
        subscriptionSpendExceeded.getOrThrow("subscriptionSpendExceeded")

    /** Issued when a subscription begins. */
    fun asSubscriptionStarted(): SubscriptionStartedWebhookEvent =
        subscriptionStarted.getOrThrow("subscriptionStarted")

    /** Issued when a subscription trial ends. */
    fun asSubscriptionTrialEnded(): SubscriptionTrialEndedWebhookEvent =
        subscriptionTrialEnded.getOrThrow("subscriptionTrialEnded")

    /**
     * Issued when a billable metric in a subscription exceeds a pre-configured quantity threshold.
     */
    fun asSubscriptionUsageExceeded(): SubscriptionUsageExceededWebhookEvent =
        subscriptionUsageExceeded.getOrThrow("subscriptionUsageExceeded")

    /** Issued when a transaction accounting sync fails. */
    fun asTransactionAccountingSyncFailed(): TransactionAccountingSyncFailedWebhookEvent =
        transactionAccountingSyncFailed.getOrThrow("transactionAccountingSyncFailed")

    /** Issued when a transaction accounting sync succeeds. */
    fun asTransactionAccountingSyncSucceeded(): TransactionAccountingSyncSucceededWebhookEvent =
        transactionAccountingSyncSucceeded.getOrThrow("transactionAccountingSyncSucceeded")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.withorb.api.core.JsonValue
     *
     * val result: String? = unwrapWebhookEvent.accept(object : UnwrapWebhookEvent.Visitor<String?> {
     *     override fun visitBackfillReflected(backfillReflected: BackfillReflectedWebhookEvent): String? = backfillReflected.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws OrbInvalidDataException if [Visitor.unknown] is not overridden in [visitor] and the
     *   current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            backfillReflected != null -> visitor.visitBackfillReflected(backfillReflected)
            backfillReverted != null -> visitor.visitBackfillReverted(backfillReverted)
            billableMetricEdited != null -> visitor.visitBillableMetricEdited(billableMetricEdited)
            creditBlockAccountingSyncFailed != null ->
                visitor.visitCreditBlockAccountingSyncFailed(creditBlockAccountingSyncFailed)
            creditBlockAccountingSyncSucceeded != null ->
                visitor.visitCreditBlockAccountingSyncSucceeded(creditBlockAccountingSyncSucceeded)
            creditNoteAccountingSyncFailed != null ->
                visitor.visitCreditNoteAccountingSyncFailed(creditNoteAccountingSyncFailed)
            creditNoteAccountingSyncSucceeded != null ->
                visitor.visitCreditNoteAccountingSyncSucceeded(creditNoteAccountingSyncSucceeded)
            creditNoteIssued != null -> visitor.visitCreditNoteIssued(creditNoteIssued)
            creditNoteMarkedAsVoid != null ->
                visitor.visitCreditNoteMarkedAsVoid(creditNoteMarkedAsVoid)
            customerAccountingSyncFailed != null ->
                visitor.visitCustomerAccountingSyncFailed(customerAccountingSyncFailed)
            customerAccountingSyncSucceeded != null ->
                visitor.visitCustomerAccountingSyncSucceeded(customerAccountingSyncSucceeded)
            customerBalanceTransactionCreated != null ->
                visitor.visitCustomerBalanceTransactionCreated(customerBalanceTransactionCreated)
            customerCreated != null -> visitor.visitCustomerCreated(customerCreated)
            customerCreditBalanceDepleted != null ->
                visitor.visitCustomerCreditBalanceDepleted(customerCreditBalanceDepleted)
            customerCreditBalanceDropped != null ->
                visitor.visitCustomerCreditBalanceDropped(customerCreditBalanceDropped)
            customerCreditBalanceRecovered != null ->
                visitor.visitCustomerCreditBalanceRecovered(customerCreditBalanceRecovered)
            customerCreditLedgerIncremented != null ->
                visitor.visitCustomerCreditLedgerIncremented(customerCreditLedgerIncremented)
            customerEdited != null -> visitor.visitCustomerEdited(customerEdited)
            dataExportsTransferError != null ->
                visitor.visitDataExportsTransferError(dataExportsTransferError)
            dataExportsTransferSuccess != null ->
                visitor.visitDataExportsTransferSuccess(dataExportsTransferSuccess)
            eventUnmatchedEvent != null -> visitor.visitEventUnmatchedEvent(eventUnmatchedEvent)
            ingestionUnmatchedCustomerIds != null ->
                visitor.visitIngestionUnmatchedCustomerIds(ingestionUnmatchedCustomerIds)
            invoiceAccountingSyncFailed != null ->
                visitor.visitInvoiceAccountingSyncFailed(invoiceAccountingSyncFailed)
            invoiceAccountingSyncSucceeded != null ->
                visitor.visitInvoiceAccountingSyncSucceeded(invoiceAccountingSyncSucceeded)
            invoiceAutomationScheduleStepExecuted != null ->
                visitor.visitInvoiceAutomationScheduleStepExecuted(
                    invoiceAutomationScheduleStepExecuted
                )
            invoiceCostDataExported != null ->
                visitor.visitInvoiceCostDataExported(invoiceCostDataExported)
            invoiceDunningScheduleCreated != null ->
                visitor.visitInvoiceDunningScheduleCreated(invoiceDunningScheduleCreated)
            invoiceDunningScheduleEnded != null ->
                visitor.visitInvoiceDunningScheduleEnded(invoiceDunningScheduleEnded)
            invoiceDunningScheduleReset != null ->
                visitor.visitInvoiceDunningScheduleReset(invoiceDunningScheduleReset)
            invoiceDunningScheduleStepExecuted != null ->
                visitor.visitInvoiceDunningScheduleStepExecuted(invoiceDunningScheduleStepExecuted)
            invoiceEdited != null -> visitor.visitInvoiceEdited(invoiceEdited)
            invoiceInvoiceDateElapsed != null ->
                visitor.visitInvoiceInvoiceDateElapsed(invoiceInvoiceDateElapsed)
            invoiceIssueFailed != null -> visitor.visitInvoiceIssueFailed(invoiceIssueFailed)
            invoiceIssued != null -> visitor.visitInvoiceIssued(invoiceIssued)
            invoiceIssuedSummary != null -> visitor.visitInvoiceIssuedSummary(invoiceIssuedSummary)
            invoiceManuallyMarkedAsPaid != null ->
                visitor.visitInvoiceManuallyMarkedAsPaid(invoiceManuallyMarkedAsPaid)
            invoiceManuallyMarkedAsVoid != null ->
                visitor.visitInvoiceManuallyMarkedAsVoid(invoiceManuallyMarkedAsVoid)
            invoicePaymentFailed != null -> visitor.visitInvoicePaymentFailed(invoicePaymentFailed)
            invoicePaymentProcessing != null ->
                visitor.visitInvoicePaymentProcessing(invoicePaymentProcessing)
            invoicePaymentSucceeded != null ->
                visitor.visitInvoicePaymentSucceeded(invoicePaymentSucceeded)
            invoiceSyncFailed != null -> visitor.visitInvoiceSyncFailed(invoiceSyncFailed)
            invoiceSyncSucceeded != null -> visitor.visitInvoiceSyncSucceeded(invoiceSyncSucceeded)
            invoiceUndoMarkAsPaid != null ->
                visitor.visitInvoiceUndoMarkAsPaid(invoiceUndoMarkAsPaid)
            invoiceDueDateRecalculationCanceled != null ->
                visitor.visitInvoiceDueDateRecalculationCanceled(
                    invoiceDueDateRecalculationCanceled
                )
            invoiceDueDateRecalculationCompleted != null ->
                visitor.visitInvoiceDueDateRecalculationCompleted(
                    invoiceDueDateRecalculationCompleted
                )
            invoiceDueDateRecalculationStarted != null ->
                visitor.visitInvoiceDueDateRecalculationStarted(invoiceDueDateRecalculationStarted)
            metricEventsDroppedByWatermark != null ->
                visitor.visitMetricEventsDroppedByWatermark(metricEventsDroppedByWatermark)
            paymentMethodCreated != null -> visitor.visitPaymentMethodCreated(paymentMethodCreated)
            paymentMethodDeleted != null -> visitor.visitPaymentMethodDeleted(paymentMethodDeleted)
            planDefaultVersionSet != null ->
                visitor.visitPlanDefaultVersionSet(planDefaultVersionSet)
            planVersionCreated != null -> visitor.visitPlanVersionCreated(planVersionCreated)
            priceEdited != null -> visitor.visitPriceEdited(priceEdited)
            resourceEventTest != null -> visitor.visitResourceEventTest(resourceEventTest)
            salesOrderAccountingSyncFailed != null ->
                visitor.visitSalesOrderAccountingSyncFailed(salesOrderAccountingSyncFailed)
            salesOrderAccountingSyncSucceeded != null ->
                visitor.visitSalesOrderAccountingSyncSucceeded(salesOrderAccountingSyncSucceeded)
            subscriptionAccountingSyncFailed != null ->
                visitor.visitSubscriptionAccountingSyncFailed(subscriptionAccountingSyncFailed)
            subscriptionAccountingSyncSucceeded != null ->
                visitor.visitSubscriptionAccountingSyncSucceeded(
                    subscriptionAccountingSyncSucceeded
                )
            subscriptionAlertDisabled != null ->
                visitor.visitSubscriptionAlertDisabled(subscriptionAlertDisabled)
            subscriptionCancellationScheduled != null ->
                visitor.visitSubscriptionCancellationScheduled(subscriptionCancellationScheduled)
            subscriptionCancellationUnscheduled != null ->
                visitor.visitSubscriptionCancellationUnscheduled(
                    subscriptionCancellationUnscheduled
                )
            subscriptionCostExceeded != null ->
                visitor.visitSubscriptionCostExceeded(subscriptionCostExceeded)
            subscriptionCreated != null -> visitor.visitSubscriptionCreated(subscriptionCreated)
            subscriptionEdited != null -> visitor.visitSubscriptionEdited(subscriptionEdited)
            subscriptionEnded != null -> visitor.visitSubscriptionEnded(subscriptionEnded)
            subscriptionFixedFeeQuantityUpdated != null ->
                visitor.visitSubscriptionFixedFeeQuantityUpdated(
                    subscriptionFixedFeeQuantityUpdated
                )
            subscriptionGroupedCostExceeded != null ->
                visitor.visitSubscriptionGroupedCostExceeded(subscriptionGroupedCostExceeded)
            subscriptionInvoicingThresholdExceeded != null ->
                visitor.visitSubscriptionInvoicingThresholdExceeded(
                    subscriptionInvoicingThresholdExceeded
                )
            subscriptionLicenseAllocationReset != null ->
                visitor.visitSubscriptionLicenseAllocationReset(subscriptionLicenseAllocationReset)
            subscriptionLicenseBalanceThresholdReached != null ->
                visitor.visitSubscriptionLicenseBalanceThresholdReached(
                    subscriptionLicenseBalanceThresholdReached
                )
            subscriptionPlanChangeScheduled != null ->
                visitor.visitSubscriptionPlanChangeScheduled(subscriptionPlanChangeScheduled)
            subscriptionPlanChanged != null ->
                visitor.visitSubscriptionPlanChanged(subscriptionPlanChanged)
            subscriptionPlanVersionChangeScheduled != null ->
                visitor.visitSubscriptionPlanVersionChangeScheduled(
                    subscriptionPlanVersionChangeScheduled
                )
            subscriptionPlanVersionChanged != null ->
                visitor.visitSubscriptionPlanVersionChanged(subscriptionPlanVersionChanged)
            subscriptionSpendExceeded != null ->
                visitor.visitSubscriptionSpendExceeded(subscriptionSpendExceeded)
            subscriptionStarted != null -> visitor.visitSubscriptionStarted(subscriptionStarted)
            subscriptionTrialEnded != null ->
                visitor.visitSubscriptionTrialEnded(subscriptionTrialEnded)
            subscriptionUsageExceeded != null ->
                visitor.visitSubscriptionUsageExceeded(subscriptionUsageExceeded)
            transactionAccountingSyncFailed != null ->
                visitor.visitTransactionAccountingSyncFailed(transactionAccountingSyncFailed)
            transactionAccountingSyncSucceeded != null ->
                visitor.visitTransactionAccountingSyncSucceeded(transactionAccountingSyncSucceeded)
            else -> visitor.unknown(_json)
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
    fun validate(): UnwrapWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitBackfillReflected(
                    backfillReflected: BackfillReflectedWebhookEvent
                ) {
                    backfillReflected.validate()
                }

                override fun visitBackfillReverted(backfillReverted: BackfillRevertedWebhookEvent) {
                    backfillReverted.validate()
                }

                override fun visitBillableMetricEdited(
                    billableMetricEdited: BillableMetricEditedWebhookEvent
                ) {
                    billableMetricEdited.validate()
                }

                override fun visitCreditBlockAccountingSyncFailed(
                    creditBlockAccountingSyncFailed: CreditBlockAccountingSyncFailedWebhookEvent
                ) {
                    creditBlockAccountingSyncFailed.validate()
                }

                override fun visitCreditBlockAccountingSyncSucceeded(
                    creditBlockAccountingSyncSucceeded:
                        CreditBlockAccountingSyncSucceededWebhookEvent
                ) {
                    creditBlockAccountingSyncSucceeded.validate()
                }

                override fun visitCreditNoteAccountingSyncFailed(
                    creditNoteAccountingSyncFailed: CreditNoteAccountingSyncFailedWebhookEvent
                ) {
                    creditNoteAccountingSyncFailed.validate()
                }

                override fun visitCreditNoteAccountingSyncSucceeded(
                    creditNoteAccountingSyncSucceeded: CreditNoteAccountingSyncSucceededWebhookEvent
                ) {
                    creditNoteAccountingSyncSucceeded.validate()
                }

                override fun visitCreditNoteIssued(creditNoteIssued: CreditNoteIssuedWebhookEvent) {
                    creditNoteIssued.validate()
                }

                override fun visitCreditNoteMarkedAsVoid(
                    creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidWebhookEvent
                ) {
                    creditNoteMarkedAsVoid.validate()
                }

                override fun visitCustomerAccountingSyncFailed(
                    customerAccountingSyncFailed: CustomerAccountingSyncFailedWebhookEvent
                ) {
                    customerAccountingSyncFailed.validate()
                }

                override fun visitCustomerAccountingSyncSucceeded(
                    customerAccountingSyncSucceeded: CustomerAccountingSyncSucceededWebhookEvent
                ) {
                    customerAccountingSyncSucceeded.validate()
                }

                override fun visitCustomerBalanceTransactionCreated(
                    customerBalanceTransactionCreated: CustomerBalanceTransactionCreatedWebhookEvent
                ) {
                    customerBalanceTransactionCreated.validate()
                }

                override fun visitCustomerCreated(customerCreated: CustomerCreatedWebhookEvent) {
                    customerCreated.validate()
                }

                override fun visitCustomerCreditBalanceDepleted(
                    customerCreditBalanceDepleted: CustomerCreditBalanceDepletedWebhookEvent
                ) {
                    customerCreditBalanceDepleted.validate()
                }

                override fun visitCustomerCreditBalanceDropped(
                    customerCreditBalanceDropped: CustomerCreditBalanceDroppedWebhookEvent
                ) {
                    customerCreditBalanceDropped.validate()
                }

                override fun visitCustomerCreditBalanceRecovered(
                    customerCreditBalanceRecovered: CustomerCreditBalanceRecoveredWebhookEvent
                ) {
                    customerCreditBalanceRecovered.validate()
                }

                override fun visitCustomerCreditLedgerIncremented(
                    customerCreditLedgerIncremented: CustomerCreditLedgerIncrementedWebhookEvent
                ) {
                    customerCreditLedgerIncremented.validate()
                }

                override fun visitCustomerEdited(customerEdited: CustomerEditedWebhookEvent) {
                    customerEdited.validate()
                }

                override fun visitDataExportsTransferError(
                    dataExportsTransferError: DataExportsTransferErrorWebhookEvent
                ) {
                    dataExportsTransferError.validate()
                }

                override fun visitDataExportsTransferSuccess(
                    dataExportsTransferSuccess: DataExportsTransferSuccessWebhookEvent
                ) {
                    dataExportsTransferSuccess.validate()
                }

                override fun visitEventUnmatchedEvent(
                    eventUnmatchedEvent: EventUnmatchedEventWebhookEvent
                ) {
                    eventUnmatchedEvent.validate()
                }

                override fun visitIngestionUnmatchedCustomerIds(
                    ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsWebhookEvent
                ) {
                    ingestionUnmatchedCustomerIds.validate()
                }

                override fun visitInvoiceAccountingSyncFailed(
                    invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedWebhookEvent
                ) {
                    invoiceAccountingSyncFailed.validate()
                }

                override fun visitInvoiceAccountingSyncSucceeded(
                    invoiceAccountingSyncSucceeded: InvoiceAccountingSyncSucceededWebhookEvent
                ) {
                    invoiceAccountingSyncSucceeded.validate()
                }

                override fun visitInvoiceAutomationScheduleStepExecuted(
                    invoiceAutomationScheduleStepExecuted:
                        InvoiceAutomationScheduleStepExecutedWebhookEvent
                ) {
                    invoiceAutomationScheduleStepExecuted.validate()
                }

                override fun visitInvoiceCostDataExported(
                    invoiceCostDataExported: InvoiceCostDataExportedWebhookEvent
                ) {
                    invoiceCostDataExported.validate()
                }

                override fun visitInvoiceDunningScheduleCreated(
                    invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedWebhookEvent
                ) {
                    invoiceDunningScheduleCreated.validate()
                }

                override fun visitInvoiceDunningScheduleEnded(
                    invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedWebhookEvent
                ) {
                    invoiceDunningScheduleEnded.validate()
                }

                override fun visitInvoiceDunningScheduleReset(
                    invoiceDunningScheduleReset: InvoiceDunningScheduleResetWebhookEvent
                ) {
                    invoiceDunningScheduleReset.validate()
                }

                override fun visitInvoiceDunningScheduleStepExecuted(
                    invoiceDunningScheduleStepExecuted:
                        InvoiceDunningScheduleStepExecutedWebhookEvent
                ) {
                    invoiceDunningScheduleStepExecuted.validate()
                }

                override fun visitInvoiceEdited(invoiceEdited: InvoiceEditedWebhookEvent) {
                    invoiceEdited.validate()
                }

                override fun visitInvoiceInvoiceDateElapsed(
                    invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedWebhookEvent
                ) {
                    invoiceInvoiceDateElapsed.validate()
                }

                override fun visitInvoiceIssueFailed(
                    invoiceIssueFailed: InvoiceIssueFailedWebhookEvent
                ) {
                    invoiceIssueFailed.validate()
                }

                override fun visitInvoiceIssued(invoiceIssued: InvoiceIssuedWebhookEvent) {
                    invoiceIssued.validate()
                }

                override fun visitInvoiceIssuedSummary(
                    invoiceIssuedSummary: InvoiceIssuedSummaryWebhookEvent
                ) {
                    invoiceIssuedSummary.validate()
                }

                override fun visitInvoiceManuallyMarkedAsPaid(
                    invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidWebhookEvent
                ) {
                    invoiceManuallyMarkedAsPaid.validate()
                }

                override fun visitInvoiceManuallyMarkedAsVoid(
                    invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidWebhookEvent
                ) {
                    invoiceManuallyMarkedAsVoid.validate()
                }

                override fun visitInvoicePaymentFailed(
                    invoicePaymentFailed: InvoicePaymentFailedWebhookEvent
                ) {
                    invoicePaymentFailed.validate()
                }

                override fun visitInvoicePaymentProcessing(
                    invoicePaymentProcessing: InvoicePaymentProcessingWebhookEvent
                ) {
                    invoicePaymentProcessing.validate()
                }

                override fun visitInvoicePaymentSucceeded(
                    invoicePaymentSucceeded: InvoicePaymentSucceededWebhookEvent
                ) {
                    invoicePaymentSucceeded.validate()
                }

                override fun visitInvoiceSyncFailed(
                    invoiceSyncFailed: InvoiceSyncFailedWebhookEvent
                ) {
                    invoiceSyncFailed.validate()
                }

                override fun visitInvoiceSyncSucceeded(
                    invoiceSyncSucceeded: InvoiceSyncSucceededWebhookEvent
                ) {
                    invoiceSyncSucceeded.validate()
                }

                override fun visitInvoiceUndoMarkAsPaid(
                    invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidWebhookEvent
                ) {
                    invoiceUndoMarkAsPaid.validate()
                }

                override fun visitInvoiceDueDateRecalculationCanceled(
                    invoiceDueDateRecalculationCanceled:
                        InvoiceDueDateRecalculationCanceledWebhookEvent
                ) {
                    invoiceDueDateRecalculationCanceled.validate()
                }

                override fun visitInvoiceDueDateRecalculationCompleted(
                    invoiceDueDateRecalculationCompleted:
                        InvoiceDueDateRecalculationCompletedWebhookEvent
                ) {
                    invoiceDueDateRecalculationCompleted.validate()
                }

                override fun visitInvoiceDueDateRecalculationStarted(
                    invoiceDueDateRecalculationStarted:
                        InvoiceDueDateRecalculationStartedWebhookEvent
                ) {
                    invoiceDueDateRecalculationStarted.validate()
                }

                override fun visitMetricEventsDroppedByWatermark(
                    metricEventsDroppedByWatermark: MetricEventsDroppedByWatermarkWebhookEvent
                ) {
                    metricEventsDroppedByWatermark.validate()
                }

                override fun visitPaymentMethodCreated(
                    paymentMethodCreated: PaymentMethodCreatedWebhookEvent
                ) {
                    paymentMethodCreated.validate()
                }

                override fun visitPaymentMethodDeleted(
                    paymentMethodDeleted: PaymentMethodDeletedWebhookEvent
                ) {
                    paymentMethodDeleted.validate()
                }

                override fun visitPlanDefaultVersionSet(
                    planDefaultVersionSet: PlanDefaultVersionSetWebhookEvent
                ) {
                    planDefaultVersionSet.validate()
                }

                override fun visitPlanVersionCreated(
                    planVersionCreated: PlanVersionCreatedWebhookEvent
                ) {
                    planVersionCreated.validate()
                }

                override fun visitPriceEdited(priceEdited: PriceEditedWebhookEvent) {
                    priceEdited.validate()
                }

                override fun visitResourceEventTest(
                    resourceEventTest: ResourceEventTestWebhookEvent
                ) {
                    resourceEventTest.validate()
                }

                override fun visitSalesOrderAccountingSyncFailed(
                    salesOrderAccountingSyncFailed: SalesOrderAccountingSyncFailedWebhookEvent
                ) {
                    salesOrderAccountingSyncFailed.validate()
                }

                override fun visitSalesOrderAccountingSyncSucceeded(
                    salesOrderAccountingSyncSucceeded: SalesOrderAccountingSyncSucceededWebhookEvent
                ) {
                    salesOrderAccountingSyncSucceeded.validate()
                }

                override fun visitSubscriptionAccountingSyncFailed(
                    subscriptionAccountingSyncFailed: SubscriptionAccountingSyncFailedWebhookEvent
                ) {
                    subscriptionAccountingSyncFailed.validate()
                }

                override fun visitSubscriptionAccountingSyncSucceeded(
                    subscriptionAccountingSyncSucceeded:
                        SubscriptionAccountingSyncSucceededWebhookEvent
                ) {
                    subscriptionAccountingSyncSucceeded.validate()
                }

                override fun visitSubscriptionAlertDisabled(
                    subscriptionAlertDisabled: SubscriptionAlertDisabledWebhookEvent
                ) {
                    subscriptionAlertDisabled.validate()
                }

                override fun visitSubscriptionCancellationScheduled(
                    subscriptionCancellationScheduled: SubscriptionCancellationScheduledWebhookEvent
                ) {
                    subscriptionCancellationScheduled.validate()
                }

                override fun visitSubscriptionCancellationUnscheduled(
                    subscriptionCancellationUnscheduled:
                        SubscriptionCancellationUnscheduledWebhookEvent
                ) {
                    subscriptionCancellationUnscheduled.validate()
                }

                override fun visitSubscriptionCostExceeded(
                    subscriptionCostExceeded: SubscriptionCostExceededWebhookEvent
                ) {
                    subscriptionCostExceeded.validate()
                }

                override fun visitSubscriptionCreated(
                    subscriptionCreated: SubscriptionCreatedWebhookEvent
                ) {
                    subscriptionCreated.validate()
                }

                override fun visitSubscriptionEdited(
                    subscriptionEdited: SubscriptionEditedWebhookEvent
                ) {
                    subscriptionEdited.validate()
                }

                override fun visitSubscriptionEnded(
                    subscriptionEnded: SubscriptionEndedWebhookEvent
                ) {
                    subscriptionEnded.validate()
                }

                override fun visitSubscriptionFixedFeeQuantityUpdated(
                    subscriptionFixedFeeQuantityUpdated:
                        SubscriptionFixedFeeQuantityUpdatedWebhookEvent
                ) {
                    subscriptionFixedFeeQuantityUpdated.validate()
                }

                override fun visitSubscriptionGroupedCostExceeded(
                    subscriptionGroupedCostExceeded: SubscriptionGroupedCostExceededWebhookEvent
                ) {
                    subscriptionGroupedCostExceeded.validate()
                }

                override fun visitSubscriptionInvoicingThresholdExceeded(
                    subscriptionInvoicingThresholdExceeded:
                        SubscriptionInvoicingThresholdExceededWebhookEvent
                ) {
                    subscriptionInvoicingThresholdExceeded.validate()
                }

                override fun visitSubscriptionLicenseAllocationReset(
                    subscriptionLicenseAllocationReset:
                        SubscriptionLicenseAllocationResetWebhookEvent
                ) {
                    subscriptionLicenseAllocationReset.validate()
                }

                override fun visitSubscriptionLicenseBalanceThresholdReached(
                    subscriptionLicenseBalanceThresholdReached:
                        SubscriptionLicenseBalanceThresholdReachedWebhookEvent
                ) {
                    subscriptionLicenseBalanceThresholdReached.validate()
                }

                override fun visitSubscriptionPlanChangeScheduled(
                    subscriptionPlanChangeScheduled: SubscriptionPlanChangeScheduledWebhookEvent
                ) {
                    subscriptionPlanChangeScheduled.validate()
                }

                override fun visitSubscriptionPlanChanged(
                    subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
                ) {
                    subscriptionPlanChanged.validate()
                }

                override fun visitSubscriptionPlanVersionChangeScheduled(
                    subscriptionPlanVersionChangeScheduled:
                        SubscriptionPlanVersionChangeScheduledWebhookEvent
                ) {
                    subscriptionPlanVersionChangeScheduled.validate()
                }

                override fun visitSubscriptionPlanVersionChanged(
                    subscriptionPlanVersionChanged: SubscriptionPlanVersionChangedWebhookEvent
                ) {
                    subscriptionPlanVersionChanged.validate()
                }

                override fun visitSubscriptionSpendExceeded(
                    subscriptionSpendExceeded: SubscriptionSpendExceededWebhookEvent
                ) {
                    subscriptionSpendExceeded.validate()
                }

                override fun visitSubscriptionStarted(
                    subscriptionStarted: SubscriptionStartedWebhookEvent
                ) {
                    subscriptionStarted.validate()
                }

                override fun visitSubscriptionTrialEnded(
                    subscriptionTrialEnded: SubscriptionTrialEndedWebhookEvent
                ) {
                    subscriptionTrialEnded.validate()
                }

                override fun visitSubscriptionUsageExceeded(
                    subscriptionUsageExceeded: SubscriptionUsageExceededWebhookEvent
                ) {
                    subscriptionUsageExceeded.validate()
                }

                override fun visitTransactionAccountingSyncFailed(
                    transactionAccountingSyncFailed: TransactionAccountingSyncFailedWebhookEvent
                ) {
                    transactionAccountingSyncFailed.validate()
                }

                override fun visitTransactionAccountingSyncSucceeded(
                    transactionAccountingSyncSucceeded:
                        TransactionAccountingSyncSucceededWebhookEvent
                ) {
                    transactionAccountingSyncSucceeded.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitBackfillReflected(
                    backfillReflected: BackfillReflectedWebhookEvent
                ) = backfillReflected.validity()

                override fun visitBackfillReverted(backfillReverted: BackfillRevertedWebhookEvent) =
                    backfillReverted.validity()

                override fun visitBillableMetricEdited(
                    billableMetricEdited: BillableMetricEditedWebhookEvent
                ) = billableMetricEdited.validity()

                override fun visitCreditBlockAccountingSyncFailed(
                    creditBlockAccountingSyncFailed: CreditBlockAccountingSyncFailedWebhookEvent
                ) = creditBlockAccountingSyncFailed.validity()

                override fun visitCreditBlockAccountingSyncSucceeded(
                    creditBlockAccountingSyncSucceeded:
                        CreditBlockAccountingSyncSucceededWebhookEvent
                ) = creditBlockAccountingSyncSucceeded.validity()

                override fun visitCreditNoteAccountingSyncFailed(
                    creditNoteAccountingSyncFailed: CreditNoteAccountingSyncFailedWebhookEvent
                ) = creditNoteAccountingSyncFailed.validity()

                override fun visitCreditNoteAccountingSyncSucceeded(
                    creditNoteAccountingSyncSucceeded: CreditNoteAccountingSyncSucceededWebhookEvent
                ) = creditNoteAccountingSyncSucceeded.validity()

                override fun visitCreditNoteIssued(creditNoteIssued: CreditNoteIssuedWebhookEvent) =
                    creditNoteIssued.validity()

                override fun visitCreditNoteMarkedAsVoid(
                    creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidWebhookEvent
                ) = creditNoteMarkedAsVoid.validity()

                override fun visitCustomerAccountingSyncFailed(
                    customerAccountingSyncFailed: CustomerAccountingSyncFailedWebhookEvent
                ) = customerAccountingSyncFailed.validity()

                override fun visitCustomerAccountingSyncSucceeded(
                    customerAccountingSyncSucceeded: CustomerAccountingSyncSucceededWebhookEvent
                ) = customerAccountingSyncSucceeded.validity()

                override fun visitCustomerBalanceTransactionCreated(
                    customerBalanceTransactionCreated: CustomerBalanceTransactionCreatedWebhookEvent
                ) = customerBalanceTransactionCreated.validity()

                override fun visitCustomerCreated(customerCreated: CustomerCreatedWebhookEvent) =
                    customerCreated.validity()

                override fun visitCustomerCreditBalanceDepleted(
                    customerCreditBalanceDepleted: CustomerCreditBalanceDepletedWebhookEvent
                ) = customerCreditBalanceDepleted.validity()

                override fun visitCustomerCreditBalanceDropped(
                    customerCreditBalanceDropped: CustomerCreditBalanceDroppedWebhookEvent
                ) = customerCreditBalanceDropped.validity()

                override fun visitCustomerCreditBalanceRecovered(
                    customerCreditBalanceRecovered: CustomerCreditBalanceRecoveredWebhookEvent
                ) = customerCreditBalanceRecovered.validity()

                override fun visitCustomerCreditLedgerIncremented(
                    customerCreditLedgerIncremented: CustomerCreditLedgerIncrementedWebhookEvent
                ) = customerCreditLedgerIncremented.validity()

                override fun visitCustomerEdited(customerEdited: CustomerEditedWebhookEvent) =
                    customerEdited.validity()

                override fun visitDataExportsTransferError(
                    dataExportsTransferError: DataExportsTransferErrorWebhookEvent
                ) = dataExportsTransferError.validity()

                override fun visitDataExportsTransferSuccess(
                    dataExportsTransferSuccess: DataExportsTransferSuccessWebhookEvent
                ) = dataExportsTransferSuccess.validity()

                override fun visitEventUnmatchedEvent(
                    eventUnmatchedEvent: EventUnmatchedEventWebhookEvent
                ) = eventUnmatchedEvent.validity()

                override fun visitIngestionUnmatchedCustomerIds(
                    ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsWebhookEvent
                ) = ingestionUnmatchedCustomerIds.validity()

                override fun visitInvoiceAccountingSyncFailed(
                    invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedWebhookEvent
                ) = invoiceAccountingSyncFailed.validity()

                override fun visitInvoiceAccountingSyncSucceeded(
                    invoiceAccountingSyncSucceeded: InvoiceAccountingSyncSucceededWebhookEvent
                ) = invoiceAccountingSyncSucceeded.validity()

                override fun visitInvoiceAutomationScheduleStepExecuted(
                    invoiceAutomationScheduleStepExecuted:
                        InvoiceAutomationScheduleStepExecutedWebhookEvent
                ) = invoiceAutomationScheduleStepExecuted.validity()

                override fun visitInvoiceCostDataExported(
                    invoiceCostDataExported: InvoiceCostDataExportedWebhookEvent
                ) = invoiceCostDataExported.validity()

                override fun visitInvoiceDunningScheduleCreated(
                    invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedWebhookEvent
                ) = invoiceDunningScheduleCreated.validity()

                override fun visitInvoiceDunningScheduleEnded(
                    invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedWebhookEvent
                ) = invoiceDunningScheduleEnded.validity()

                override fun visitInvoiceDunningScheduleReset(
                    invoiceDunningScheduleReset: InvoiceDunningScheduleResetWebhookEvent
                ) = invoiceDunningScheduleReset.validity()

                override fun visitInvoiceDunningScheduleStepExecuted(
                    invoiceDunningScheduleStepExecuted:
                        InvoiceDunningScheduleStepExecutedWebhookEvent
                ) = invoiceDunningScheduleStepExecuted.validity()

                override fun visitInvoiceEdited(invoiceEdited: InvoiceEditedWebhookEvent) =
                    invoiceEdited.validity()

                override fun visitInvoiceInvoiceDateElapsed(
                    invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedWebhookEvent
                ) = invoiceInvoiceDateElapsed.validity()

                override fun visitInvoiceIssueFailed(
                    invoiceIssueFailed: InvoiceIssueFailedWebhookEvent
                ) = invoiceIssueFailed.validity()

                override fun visitInvoiceIssued(invoiceIssued: InvoiceIssuedWebhookEvent) =
                    invoiceIssued.validity()

                override fun visitInvoiceIssuedSummary(
                    invoiceIssuedSummary: InvoiceIssuedSummaryWebhookEvent
                ) = invoiceIssuedSummary.validity()

                override fun visitInvoiceManuallyMarkedAsPaid(
                    invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidWebhookEvent
                ) = invoiceManuallyMarkedAsPaid.validity()

                override fun visitInvoiceManuallyMarkedAsVoid(
                    invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidWebhookEvent
                ) = invoiceManuallyMarkedAsVoid.validity()

                override fun visitInvoicePaymentFailed(
                    invoicePaymentFailed: InvoicePaymentFailedWebhookEvent
                ) = invoicePaymentFailed.validity()

                override fun visitInvoicePaymentProcessing(
                    invoicePaymentProcessing: InvoicePaymentProcessingWebhookEvent
                ) = invoicePaymentProcessing.validity()

                override fun visitInvoicePaymentSucceeded(
                    invoicePaymentSucceeded: InvoicePaymentSucceededWebhookEvent
                ) = invoicePaymentSucceeded.validity()

                override fun visitInvoiceSyncFailed(
                    invoiceSyncFailed: InvoiceSyncFailedWebhookEvent
                ) = invoiceSyncFailed.validity()

                override fun visitInvoiceSyncSucceeded(
                    invoiceSyncSucceeded: InvoiceSyncSucceededWebhookEvent
                ) = invoiceSyncSucceeded.validity()

                override fun visitInvoiceUndoMarkAsPaid(
                    invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidWebhookEvent
                ) = invoiceUndoMarkAsPaid.validity()

                override fun visitInvoiceDueDateRecalculationCanceled(
                    invoiceDueDateRecalculationCanceled:
                        InvoiceDueDateRecalculationCanceledWebhookEvent
                ) = invoiceDueDateRecalculationCanceled.validity()

                override fun visitInvoiceDueDateRecalculationCompleted(
                    invoiceDueDateRecalculationCompleted:
                        InvoiceDueDateRecalculationCompletedWebhookEvent
                ) = invoiceDueDateRecalculationCompleted.validity()

                override fun visitInvoiceDueDateRecalculationStarted(
                    invoiceDueDateRecalculationStarted:
                        InvoiceDueDateRecalculationStartedWebhookEvent
                ) = invoiceDueDateRecalculationStarted.validity()

                override fun visitMetricEventsDroppedByWatermark(
                    metricEventsDroppedByWatermark: MetricEventsDroppedByWatermarkWebhookEvent
                ) = metricEventsDroppedByWatermark.validity()

                override fun visitPaymentMethodCreated(
                    paymentMethodCreated: PaymentMethodCreatedWebhookEvent
                ) = paymentMethodCreated.validity()

                override fun visitPaymentMethodDeleted(
                    paymentMethodDeleted: PaymentMethodDeletedWebhookEvent
                ) = paymentMethodDeleted.validity()

                override fun visitPlanDefaultVersionSet(
                    planDefaultVersionSet: PlanDefaultVersionSetWebhookEvent
                ) = planDefaultVersionSet.validity()

                override fun visitPlanVersionCreated(
                    planVersionCreated: PlanVersionCreatedWebhookEvent
                ) = planVersionCreated.validity()

                override fun visitPriceEdited(priceEdited: PriceEditedWebhookEvent) =
                    priceEdited.validity()

                override fun visitResourceEventTest(
                    resourceEventTest: ResourceEventTestWebhookEvent
                ) = resourceEventTest.validity()

                override fun visitSalesOrderAccountingSyncFailed(
                    salesOrderAccountingSyncFailed: SalesOrderAccountingSyncFailedWebhookEvent
                ) = salesOrderAccountingSyncFailed.validity()

                override fun visitSalesOrderAccountingSyncSucceeded(
                    salesOrderAccountingSyncSucceeded: SalesOrderAccountingSyncSucceededWebhookEvent
                ) = salesOrderAccountingSyncSucceeded.validity()

                override fun visitSubscriptionAccountingSyncFailed(
                    subscriptionAccountingSyncFailed: SubscriptionAccountingSyncFailedWebhookEvent
                ) = subscriptionAccountingSyncFailed.validity()

                override fun visitSubscriptionAccountingSyncSucceeded(
                    subscriptionAccountingSyncSucceeded:
                        SubscriptionAccountingSyncSucceededWebhookEvent
                ) = subscriptionAccountingSyncSucceeded.validity()

                override fun visitSubscriptionAlertDisabled(
                    subscriptionAlertDisabled: SubscriptionAlertDisabledWebhookEvent
                ) = subscriptionAlertDisabled.validity()

                override fun visitSubscriptionCancellationScheduled(
                    subscriptionCancellationScheduled: SubscriptionCancellationScheduledWebhookEvent
                ) = subscriptionCancellationScheduled.validity()

                override fun visitSubscriptionCancellationUnscheduled(
                    subscriptionCancellationUnscheduled:
                        SubscriptionCancellationUnscheduledWebhookEvent
                ) = subscriptionCancellationUnscheduled.validity()

                override fun visitSubscriptionCostExceeded(
                    subscriptionCostExceeded: SubscriptionCostExceededWebhookEvent
                ) = subscriptionCostExceeded.validity()

                override fun visitSubscriptionCreated(
                    subscriptionCreated: SubscriptionCreatedWebhookEvent
                ) = subscriptionCreated.validity()

                override fun visitSubscriptionEdited(
                    subscriptionEdited: SubscriptionEditedWebhookEvent
                ) = subscriptionEdited.validity()

                override fun visitSubscriptionEnded(
                    subscriptionEnded: SubscriptionEndedWebhookEvent
                ) = subscriptionEnded.validity()

                override fun visitSubscriptionFixedFeeQuantityUpdated(
                    subscriptionFixedFeeQuantityUpdated:
                        SubscriptionFixedFeeQuantityUpdatedWebhookEvent
                ) = subscriptionFixedFeeQuantityUpdated.validity()

                override fun visitSubscriptionGroupedCostExceeded(
                    subscriptionGroupedCostExceeded: SubscriptionGroupedCostExceededWebhookEvent
                ) = subscriptionGroupedCostExceeded.validity()

                override fun visitSubscriptionInvoicingThresholdExceeded(
                    subscriptionInvoicingThresholdExceeded:
                        SubscriptionInvoicingThresholdExceededWebhookEvent
                ) = subscriptionInvoicingThresholdExceeded.validity()

                override fun visitSubscriptionLicenseAllocationReset(
                    subscriptionLicenseAllocationReset:
                        SubscriptionLicenseAllocationResetWebhookEvent
                ) = subscriptionLicenseAllocationReset.validity()

                override fun visitSubscriptionLicenseBalanceThresholdReached(
                    subscriptionLicenseBalanceThresholdReached:
                        SubscriptionLicenseBalanceThresholdReachedWebhookEvent
                ) = subscriptionLicenseBalanceThresholdReached.validity()

                override fun visitSubscriptionPlanChangeScheduled(
                    subscriptionPlanChangeScheduled: SubscriptionPlanChangeScheduledWebhookEvent
                ) = subscriptionPlanChangeScheduled.validity()

                override fun visitSubscriptionPlanChanged(
                    subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
                ) = subscriptionPlanChanged.validity()

                override fun visitSubscriptionPlanVersionChangeScheduled(
                    subscriptionPlanVersionChangeScheduled:
                        SubscriptionPlanVersionChangeScheduledWebhookEvent
                ) = subscriptionPlanVersionChangeScheduled.validity()

                override fun visitSubscriptionPlanVersionChanged(
                    subscriptionPlanVersionChanged: SubscriptionPlanVersionChangedWebhookEvent
                ) = subscriptionPlanVersionChanged.validity()

                override fun visitSubscriptionSpendExceeded(
                    subscriptionSpendExceeded: SubscriptionSpendExceededWebhookEvent
                ) = subscriptionSpendExceeded.validity()

                override fun visitSubscriptionStarted(
                    subscriptionStarted: SubscriptionStartedWebhookEvent
                ) = subscriptionStarted.validity()

                override fun visitSubscriptionTrialEnded(
                    subscriptionTrialEnded: SubscriptionTrialEndedWebhookEvent
                ) = subscriptionTrialEnded.validity()

                override fun visitSubscriptionUsageExceeded(
                    subscriptionUsageExceeded: SubscriptionUsageExceededWebhookEvent
                ) = subscriptionUsageExceeded.validity()

                override fun visitTransactionAccountingSyncFailed(
                    transactionAccountingSyncFailed: TransactionAccountingSyncFailedWebhookEvent
                ) = transactionAccountingSyncFailed.validity()

                override fun visitTransactionAccountingSyncSucceeded(
                    transactionAccountingSyncSucceeded:
                        TransactionAccountingSyncSucceededWebhookEvent
                ) = transactionAccountingSyncSucceeded.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnwrapWebhookEvent &&
            backfillReflected == other.backfillReflected &&
            backfillReverted == other.backfillReverted &&
            billableMetricEdited == other.billableMetricEdited &&
            creditBlockAccountingSyncFailed == other.creditBlockAccountingSyncFailed &&
            creditBlockAccountingSyncSucceeded == other.creditBlockAccountingSyncSucceeded &&
            creditNoteAccountingSyncFailed == other.creditNoteAccountingSyncFailed &&
            creditNoteAccountingSyncSucceeded == other.creditNoteAccountingSyncSucceeded &&
            creditNoteIssued == other.creditNoteIssued &&
            creditNoteMarkedAsVoid == other.creditNoteMarkedAsVoid &&
            customerAccountingSyncFailed == other.customerAccountingSyncFailed &&
            customerAccountingSyncSucceeded == other.customerAccountingSyncSucceeded &&
            customerBalanceTransactionCreated == other.customerBalanceTransactionCreated &&
            customerCreated == other.customerCreated &&
            customerCreditBalanceDepleted == other.customerCreditBalanceDepleted &&
            customerCreditBalanceDropped == other.customerCreditBalanceDropped &&
            customerCreditBalanceRecovered == other.customerCreditBalanceRecovered &&
            customerCreditLedgerIncremented == other.customerCreditLedgerIncremented &&
            customerEdited == other.customerEdited &&
            dataExportsTransferError == other.dataExportsTransferError &&
            dataExportsTransferSuccess == other.dataExportsTransferSuccess &&
            eventUnmatchedEvent == other.eventUnmatchedEvent &&
            ingestionUnmatchedCustomerIds == other.ingestionUnmatchedCustomerIds &&
            invoiceAccountingSyncFailed == other.invoiceAccountingSyncFailed &&
            invoiceAccountingSyncSucceeded == other.invoiceAccountingSyncSucceeded &&
            invoiceAutomationScheduleStepExecuted == other.invoiceAutomationScheduleStepExecuted &&
            invoiceCostDataExported == other.invoiceCostDataExported &&
            invoiceDunningScheduleCreated == other.invoiceDunningScheduleCreated &&
            invoiceDunningScheduleEnded == other.invoiceDunningScheduleEnded &&
            invoiceDunningScheduleReset == other.invoiceDunningScheduleReset &&
            invoiceDunningScheduleStepExecuted == other.invoiceDunningScheduleStepExecuted &&
            invoiceEdited == other.invoiceEdited &&
            invoiceInvoiceDateElapsed == other.invoiceInvoiceDateElapsed &&
            invoiceIssueFailed == other.invoiceIssueFailed &&
            invoiceIssued == other.invoiceIssued &&
            invoiceIssuedSummary == other.invoiceIssuedSummary &&
            invoiceManuallyMarkedAsPaid == other.invoiceManuallyMarkedAsPaid &&
            invoiceManuallyMarkedAsVoid == other.invoiceManuallyMarkedAsVoid &&
            invoicePaymentFailed == other.invoicePaymentFailed &&
            invoicePaymentProcessing == other.invoicePaymentProcessing &&
            invoicePaymentSucceeded == other.invoicePaymentSucceeded &&
            invoiceSyncFailed == other.invoiceSyncFailed &&
            invoiceSyncSucceeded == other.invoiceSyncSucceeded &&
            invoiceUndoMarkAsPaid == other.invoiceUndoMarkAsPaid &&
            invoiceDueDateRecalculationCanceled == other.invoiceDueDateRecalculationCanceled &&
            invoiceDueDateRecalculationCompleted == other.invoiceDueDateRecalculationCompleted &&
            invoiceDueDateRecalculationStarted == other.invoiceDueDateRecalculationStarted &&
            metricEventsDroppedByWatermark == other.metricEventsDroppedByWatermark &&
            paymentMethodCreated == other.paymentMethodCreated &&
            paymentMethodDeleted == other.paymentMethodDeleted &&
            planDefaultVersionSet == other.planDefaultVersionSet &&
            planVersionCreated == other.planVersionCreated &&
            priceEdited == other.priceEdited &&
            resourceEventTest == other.resourceEventTest &&
            salesOrderAccountingSyncFailed == other.salesOrderAccountingSyncFailed &&
            salesOrderAccountingSyncSucceeded == other.salesOrderAccountingSyncSucceeded &&
            subscriptionAccountingSyncFailed == other.subscriptionAccountingSyncFailed &&
            subscriptionAccountingSyncSucceeded == other.subscriptionAccountingSyncSucceeded &&
            subscriptionAlertDisabled == other.subscriptionAlertDisabled &&
            subscriptionCancellationScheduled == other.subscriptionCancellationScheduled &&
            subscriptionCancellationUnscheduled == other.subscriptionCancellationUnscheduled &&
            subscriptionCostExceeded == other.subscriptionCostExceeded &&
            subscriptionCreated == other.subscriptionCreated &&
            subscriptionEdited == other.subscriptionEdited &&
            subscriptionEnded == other.subscriptionEnded &&
            subscriptionFixedFeeQuantityUpdated == other.subscriptionFixedFeeQuantityUpdated &&
            subscriptionGroupedCostExceeded == other.subscriptionGroupedCostExceeded &&
            subscriptionInvoicingThresholdExceeded ==
                other.subscriptionInvoicingThresholdExceeded &&
            subscriptionLicenseAllocationReset == other.subscriptionLicenseAllocationReset &&
            subscriptionLicenseBalanceThresholdReached ==
                other.subscriptionLicenseBalanceThresholdReached &&
            subscriptionPlanChangeScheduled == other.subscriptionPlanChangeScheduled &&
            subscriptionPlanChanged == other.subscriptionPlanChanged &&
            subscriptionPlanVersionChangeScheduled ==
                other.subscriptionPlanVersionChangeScheduled &&
            subscriptionPlanVersionChanged == other.subscriptionPlanVersionChanged &&
            subscriptionSpendExceeded == other.subscriptionSpendExceeded &&
            subscriptionStarted == other.subscriptionStarted &&
            subscriptionTrialEnded == other.subscriptionTrialEnded &&
            subscriptionUsageExceeded == other.subscriptionUsageExceeded &&
            transactionAccountingSyncFailed == other.transactionAccountingSyncFailed &&
            transactionAccountingSyncSucceeded == other.transactionAccountingSyncSucceeded
    }

    override fun hashCode(): Int =
        Objects.hash(
            backfillReflected,
            backfillReverted,
            billableMetricEdited,
            creditBlockAccountingSyncFailed,
            creditBlockAccountingSyncSucceeded,
            creditNoteAccountingSyncFailed,
            creditNoteAccountingSyncSucceeded,
            creditNoteIssued,
            creditNoteMarkedAsVoid,
            customerAccountingSyncFailed,
            customerAccountingSyncSucceeded,
            customerBalanceTransactionCreated,
            customerCreated,
            customerCreditBalanceDepleted,
            customerCreditBalanceDropped,
            customerCreditBalanceRecovered,
            customerCreditLedgerIncremented,
            customerEdited,
            dataExportsTransferError,
            dataExportsTransferSuccess,
            eventUnmatchedEvent,
            ingestionUnmatchedCustomerIds,
            invoiceAccountingSyncFailed,
            invoiceAccountingSyncSucceeded,
            invoiceAutomationScheduleStepExecuted,
            invoiceCostDataExported,
            invoiceDunningScheduleCreated,
            invoiceDunningScheduleEnded,
            invoiceDunningScheduleReset,
            invoiceDunningScheduleStepExecuted,
            invoiceEdited,
            invoiceInvoiceDateElapsed,
            invoiceIssueFailed,
            invoiceIssued,
            invoiceIssuedSummary,
            invoiceManuallyMarkedAsPaid,
            invoiceManuallyMarkedAsVoid,
            invoicePaymentFailed,
            invoicePaymentProcessing,
            invoicePaymentSucceeded,
            invoiceSyncFailed,
            invoiceSyncSucceeded,
            invoiceUndoMarkAsPaid,
            invoiceDueDateRecalculationCanceled,
            invoiceDueDateRecalculationCompleted,
            invoiceDueDateRecalculationStarted,
            metricEventsDroppedByWatermark,
            paymentMethodCreated,
            paymentMethodDeleted,
            planDefaultVersionSet,
            planVersionCreated,
            priceEdited,
            resourceEventTest,
            salesOrderAccountingSyncFailed,
            salesOrderAccountingSyncSucceeded,
            subscriptionAccountingSyncFailed,
            subscriptionAccountingSyncSucceeded,
            subscriptionAlertDisabled,
            subscriptionCancellationScheduled,
            subscriptionCancellationUnscheduled,
            subscriptionCostExceeded,
            subscriptionCreated,
            subscriptionEdited,
            subscriptionEnded,
            subscriptionFixedFeeQuantityUpdated,
            subscriptionGroupedCostExceeded,
            subscriptionInvoicingThresholdExceeded,
            subscriptionLicenseAllocationReset,
            subscriptionLicenseBalanceThresholdReached,
            subscriptionPlanChangeScheduled,
            subscriptionPlanChanged,
            subscriptionPlanVersionChangeScheduled,
            subscriptionPlanVersionChanged,
            subscriptionSpendExceeded,
            subscriptionStarted,
            subscriptionTrialEnded,
            subscriptionUsageExceeded,
            transactionAccountingSyncFailed,
            transactionAccountingSyncSucceeded,
        )

    override fun toString(): String =
        when {
            backfillReflected != null -> "UnwrapWebhookEvent{backfillReflected=$backfillReflected}"
            backfillReverted != null -> "UnwrapWebhookEvent{backfillReverted=$backfillReverted}"
            billableMetricEdited != null ->
                "UnwrapWebhookEvent{billableMetricEdited=$billableMetricEdited}"
            creditBlockAccountingSyncFailed != null ->
                "UnwrapWebhookEvent{creditBlockAccountingSyncFailed=$creditBlockAccountingSyncFailed}"
            creditBlockAccountingSyncSucceeded != null ->
                "UnwrapWebhookEvent{creditBlockAccountingSyncSucceeded=$creditBlockAccountingSyncSucceeded}"
            creditNoteAccountingSyncFailed != null ->
                "UnwrapWebhookEvent{creditNoteAccountingSyncFailed=$creditNoteAccountingSyncFailed}"
            creditNoteAccountingSyncSucceeded != null ->
                "UnwrapWebhookEvent{creditNoteAccountingSyncSucceeded=$creditNoteAccountingSyncSucceeded}"
            creditNoteIssued != null -> "UnwrapWebhookEvent{creditNoteIssued=$creditNoteIssued}"
            creditNoteMarkedAsVoid != null ->
                "UnwrapWebhookEvent{creditNoteMarkedAsVoid=$creditNoteMarkedAsVoid}"
            customerAccountingSyncFailed != null ->
                "UnwrapWebhookEvent{customerAccountingSyncFailed=$customerAccountingSyncFailed}"
            customerAccountingSyncSucceeded != null ->
                "UnwrapWebhookEvent{customerAccountingSyncSucceeded=$customerAccountingSyncSucceeded}"
            customerBalanceTransactionCreated != null ->
                "UnwrapWebhookEvent{customerBalanceTransactionCreated=$customerBalanceTransactionCreated}"
            customerCreated != null -> "UnwrapWebhookEvent{customerCreated=$customerCreated}"
            customerCreditBalanceDepleted != null ->
                "UnwrapWebhookEvent{customerCreditBalanceDepleted=$customerCreditBalanceDepleted}"
            customerCreditBalanceDropped != null ->
                "UnwrapWebhookEvent{customerCreditBalanceDropped=$customerCreditBalanceDropped}"
            customerCreditBalanceRecovered != null ->
                "UnwrapWebhookEvent{customerCreditBalanceRecovered=$customerCreditBalanceRecovered}"
            customerCreditLedgerIncremented != null ->
                "UnwrapWebhookEvent{customerCreditLedgerIncremented=$customerCreditLedgerIncremented}"
            customerEdited != null -> "UnwrapWebhookEvent{customerEdited=$customerEdited}"
            dataExportsTransferError != null ->
                "UnwrapWebhookEvent{dataExportsTransferError=$dataExportsTransferError}"
            dataExportsTransferSuccess != null ->
                "UnwrapWebhookEvent{dataExportsTransferSuccess=$dataExportsTransferSuccess}"
            eventUnmatchedEvent != null ->
                "UnwrapWebhookEvent{eventUnmatchedEvent=$eventUnmatchedEvent}"
            ingestionUnmatchedCustomerIds != null ->
                "UnwrapWebhookEvent{ingestionUnmatchedCustomerIds=$ingestionUnmatchedCustomerIds}"
            invoiceAccountingSyncFailed != null ->
                "UnwrapWebhookEvent{invoiceAccountingSyncFailed=$invoiceAccountingSyncFailed}"
            invoiceAccountingSyncSucceeded != null ->
                "UnwrapWebhookEvent{invoiceAccountingSyncSucceeded=$invoiceAccountingSyncSucceeded}"
            invoiceAutomationScheduleStepExecuted != null ->
                "UnwrapWebhookEvent{invoiceAutomationScheduleStepExecuted=$invoiceAutomationScheduleStepExecuted}"
            invoiceCostDataExported != null ->
                "UnwrapWebhookEvent{invoiceCostDataExported=$invoiceCostDataExported}"
            invoiceDunningScheduleCreated != null ->
                "UnwrapWebhookEvent{invoiceDunningScheduleCreated=$invoiceDunningScheduleCreated}"
            invoiceDunningScheduleEnded != null ->
                "UnwrapWebhookEvent{invoiceDunningScheduleEnded=$invoiceDunningScheduleEnded}"
            invoiceDunningScheduleReset != null ->
                "UnwrapWebhookEvent{invoiceDunningScheduleReset=$invoiceDunningScheduleReset}"
            invoiceDunningScheduleStepExecuted != null ->
                "UnwrapWebhookEvent{invoiceDunningScheduleStepExecuted=$invoiceDunningScheduleStepExecuted}"
            invoiceEdited != null -> "UnwrapWebhookEvent{invoiceEdited=$invoiceEdited}"
            invoiceInvoiceDateElapsed != null ->
                "UnwrapWebhookEvent{invoiceInvoiceDateElapsed=$invoiceInvoiceDateElapsed}"
            invoiceIssueFailed != null ->
                "UnwrapWebhookEvent{invoiceIssueFailed=$invoiceIssueFailed}"
            invoiceIssued != null -> "UnwrapWebhookEvent{invoiceIssued=$invoiceIssued}"
            invoiceIssuedSummary != null ->
                "UnwrapWebhookEvent{invoiceIssuedSummary=$invoiceIssuedSummary}"
            invoiceManuallyMarkedAsPaid != null ->
                "UnwrapWebhookEvent{invoiceManuallyMarkedAsPaid=$invoiceManuallyMarkedAsPaid}"
            invoiceManuallyMarkedAsVoid != null ->
                "UnwrapWebhookEvent{invoiceManuallyMarkedAsVoid=$invoiceManuallyMarkedAsVoid}"
            invoicePaymentFailed != null ->
                "UnwrapWebhookEvent{invoicePaymentFailed=$invoicePaymentFailed}"
            invoicePaymentProcessing != null ->
                "UnwrapWebhookEvent{invoicePaymentProcessing=$invoicePaymentProcessing}"
            invoicePaymentSucceeded != null ->
                "UnwrapWebhookEvent{invoicePaymentSucceeded=$invoicePaymentSucceeded}"
            invoiceSyncFailed != null -> "UnwrapWebhookEvent{invoiceSyncFailed=$invoiceSyncFailed}"
            invoiceSyncSucceeded != null ->
                "UnwrapWebhookEvent{invoiceSyncSucceeded=$invoiceSyncSucceeded}"
            invoiceUndoMarkAsPaid != null ->
                "UnwrapWebhookEvent{invoiceUndoMarkAsPaid=$invoiceUndoMarkAsPaid}"
            invoiceDueDateRecalculationCanceled != null ->
                "UnwrapWebhookEvent{invoiceDueDateRecalculationCanceled=$invoiceDueDateRecalculationCanceled}"
            invoiceDueDateRecalculationCompleted != null ->
                "UnwrapWebhookEvent{invoiceDueDateRecalculationCompleted=$invoiceDueDateRecalculationCompleted}"
            invoiceDueDateRecalculationStarted != null ->
                "UnwrapWebhookEvent{invoiceDueDateRecalculationStarted=$invoiceDueDateRecalculationStarted}"
            metricEventsDroppedByWatermark != null ->
                "UnwrapWebhookEvent{metricEventsDroppedByWatermark=$metricEventsDroppedByWatermark}"
            paymentMethodCreated != null ->
                "UnwrapWebhookEvent{paymentMethodCreated=$paymentMethodCreated}"
            paymentMethodDeleted != null ->
                "UnwrapWebhookEvent{paymentMethodDeleted=$paymentMethodDeleted}"
            planDefaultVersionSet != null ->
                "UnwrapWebhookEvent{planDefaultVersionSet=$planDefaultVersionSet}"
            planVersionCreated != null ->
                "UnwrapWebhookEvent{planVersionCreated=$planVersionCreated}"
            priceEdited != null -> "UnwrapWebhookEvent{priceEdited=$priceEdited}"
            resourceEventTest != null -> "UnwrapWebhookEvent{resourceEventTest=$resourceEventTest}"
            salesOrderAccountingSyncFailed != null ->
                "UnwrapWebhookEvent{salesOrderAccountingSyncFailed=$salesOrderAccountingSyncFailed}"
            salesOrderAccountingSyncSucceeded != null ->
                "UnwrapWebhookEvent{salesOrderAccountingSyncSucceeded=$salesOrderAccountingSyncSucceeded}"
            subscriptionAccountingSyncFailed != null ->
                "UnwrapWebhookEvent{subscriptionAccountingSyncFailed=$subscriptionAccountingSyncFailed}"
            subscriptionAccountingSyncSucceeded != null ->
                "UnwrapWebhookEvent{subscriptionAccountingSyncSucceeded=$subscriptionAccountingSyncSucceeded}"
            subscriptionAlertDisabled != null ->
                "UnwrapWebhookEvent{subscriptionAlertDisabled=$subscriptionAlertDisabled}"
            subscriptionCancellationScheduled != null ->
                "UnwrapWebhookEvent{subscriptionCancellationScheduled=$subscriptionCancellationScheduled}"
            subscriptionCancellationUnscheduled != null ->
                "UnwrapWebhookEvent{subscriptionCancellationUnscheduled=$subscriptionCancellationUnscheduled}"
            subscriptionCostExceeded != null ->
                "UnwrapWebhookEvent{subscriptionCostExceeded=$subscriptionCostExceeded}"
            subscriptionCreated != null ->
                "UnwrapWebhookEvent{subscriptionCreated=$subscriptionCreated}"
            subscriptionEdited != null ->
                "UnwrapWebhookEvent{subscriptionEdited=$subscriptionEdited}"
            subscriptionEnded != null -> "UnwrapWebhookEvent{subscriptionEnded=$subscriptionEnded}"
            subscriptionFixedFeeQuantityUpdated != null ->
                "UnwrapWebhookEvent{subscriptionFixedFeeQuantityUpdated=$subscriptionFixedFeeQuantityUpdated}"
            subscriptionGroupedCostExceeded != null ->
                "UnwrapWebhookEvent{subscriptionGroupedCostExceeded=$subscriptionGroupedCostExceeded}"
            subscriptionInvoicingThresholdExceeded != null ->
                "UnwrapWebhookEvent{subscriptionInvoicingThresholdExceeded=$subscriptionInvoicingThresholdExceeded}"
            subscriptionLicenseAllocationReset != null ->
                "UnwrapWebhookEvent{subscriptionLicenseAllocationReset=$subscriptionLicenseAllocationReset}"
            subscriptionLicenseBalanceThresholdReached != null ->
                "UnwrapWebhookEvent{subscriptionLicenseBalanceThresholdReached=$subscriptionLicenseBalanceThresholdReached}"
            subscriptionPlanChangeScheduled != null ->
                "UnwrapWebhookEvent{subscriptionPlanChangeScheduled=$subscriptionPlanChangeScheduled}"
            subscriptionPlanChanged != null ->
                "UnwrapWebhookEvent{subscriptionPlanChanged=$subscriptionPlanChanged}"
            subscriptionPlanVersionChangeScheduled != null ->
                "UnwrapWebhookEvent{subscriptionPlanVersionChangeScheduled=$subscriptionPlanVersionChangeScheduled}"
            subscriptionPlanVersionChanged != null ->
                "UnwrapWebhookEvent{subscriptionPlanVersionChanged=$subscriptionPlanVersionChanged}"
            subscriptionSpendExceeded != null ->
                "UnwrapWebhookEvent{subscriptionSpendExceeded=$subscriptionSpendExceeded}"
            subscriptionStarted != null ->
                "UnwrapWebhookEvent{subscriptionStarted=$subscriptionStarted}"
            subscriptionTrialEnded != null ->
                "UnwrapWebhookEvent{subscriptionTrialEnded=$subscriptionTrialEnded}"
            subscriptionUsageExceeded != null ->
                "UnwrapWebhookEvent{subscriptionUsageExceeded=$subscriptionUsageExceeded}"
            transactionAccountingSyncFailed != null ->
                "UnwrapWebhookEvent{transactionAccountingSyncFailed=$transactionAccountingSyncFailed}"
            transactionAccountingSyncSucceeded != null ->
                "UnwrapWebhookEvent{transactionAccountingSyncSucceeded=$transactionAccountingSyncSucceeded}"
            _json != null -> "UnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
        }

    companion object {

        /** Issued when a backfill is closed and its events are reflected into usage. */
        fun ofBackfillReflected(backfillReflected: BackfillReflectedWebhookEvent) =
            UnwrapWebhookEvent(backfillReflected = backfillReflected)

        /** Issued when a backfill is reverted, removing its events from usage. */
        fun ofBackfillReverted(backfillReverted: BackfillRevertedWebhookEvent) =
            UnwrapWebhookEvent(backfillReverted = backfillReverted)

        /** Issued when a billable metric is edited. */
        fun ofBillableMetricEdited(billableMetricEdited: BillableMetricEditedWebhookEvent) =
            UnwrapWebhookEvent(billableMetricEdited = billableMetricEdited)

        /** Issued when a credit block accounting sync fails. */
        fun ofCreditBlockAccountingSyncFailed(
            creditBlockAccountingSyncFailed: CreditBlockAccountingSyncFailedWebhookEvent
        ) = UnwrapWebhookEvent(creditBlockAccountingSyncFailed = creditBlockAccountingSyncFailed)

        /** Issued when a credit block accounting sync succeeds. */
        fun ofCreditBlockAccountingSyncSucceeded(
            creditBlockAccountingSyncSucceeded: CreditBlockAccountingSyncSucceededWebhookEvent
        ) =
            UnwrapWebhookEvent(
                creditBlockAccountingSyncSucceeded = creditBlockAccountingSyncSucceeded
            )

        /** Issued when a credit note accounting sync fails. */
        fun ofCreditNoteAccountingSyncFailed(
            creditNoteAccountingSyncFailed: CreditNoteAccountingSyncFailedWebhookEvent
        ) = UnwrapWebhookEvent(creditNoteAccountingSyncFailed = creditNoteAccountingSyncFailed)

        /** Issued when a credit note accounting sync succeeds. */
        fun ofCreditNoteAccountingSyncSucceeded(
            creditNoteAccountingSyncSucceeded: CreditNoteAccountingSyncSucceededWebhookEvent
        ) =
            UnwrapWebhookEvent(
                creditNoteAccountingSyncSucceeded = creditNoteAccountingSyncSucceeded
            )

        /** Issued when a credit note is created. */
        fun ofCreditNoteIssued(creditNoteIssued: CreditNoteIssuedWebhookEvent) =
            UnwrapWebhookEvent(creditNoteIssued = creditNoteIssued)

        /** Issued when a credit note is marked as void. */
        fun ofCreditNoteMarkedAsVoid(creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidWebhookEvent) =
            UnwrapWebhookEvent(creditNoteMarkedAsVoid = creditNoteMarkedAsVoid)

        /** Issued when a customer accounting sync fails. */
        fun ofCustomerAccountingSyncFailed(
            customerAccountingSyncFailed: CustomerAccountingSyncFailedWebhookEvent
        ) = UnwrapWebhookEvent(customerAccountingSyncFailed = customerAccountingSyncFailed)

        /** Issued when a customer accounting sync succeeds. */
        fun ofCustomerAccountingSyncSucceeded(
            customerAccountingSyncSucceeded: CustomerAccountingSyncSucceededWebhookEvent
        ) = UnwrapWebhookEvent(customerAccountingSyncSucceeded = customerAccountingSyncSucceeded)

        /** Issued when a customer balance transaction is created. */
        fun ofCustomerBalanceTransactionCreated(
            customerBalanceTransactionCreated: CustomerBalanceTransactionCreatedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                customerBalanceTransactionCreated = customerBalanceTransactionCreated
            )

        /** Issued when a customer resource is created. */
        fun ofCustomerCreated(customerCreated: CustomerCreatedWebhookEvent) =
            UnwrapWebhookEvent(customerCreated = customerCreated)

        /** Issued when a customer's prepaid credits balance is depleted. */
        fun ofCustomerCreditBalanceDepleted(
            customerCreditBalanceDepleted: CustomerCreditBalanceDepletedWebhookEvent
        ) = UnwrapWebhookEvent(customerCreditBalanceDepleted = customerCreditBalanceDepleted)

        /**
         * Issued when a customer's prepaid credits balance is depleted to a configured threshold.
         */
        fun ofCustomerCreditBalanceDropped(
            customerCreditBalanceDropped: CustomerCreditBalanceDroppedWebhookEvent
        ) = UnwrapWebhookEvent(customerCreditBalanceDropped = customerCreditBalanceDropped)

        /** Issued when a customer's credit balance recovers from depleted. */
        fun ofCustomerCreditBalanceRecovered(
            customerCreditBalanceRecovered: CustomerCreditBalanceRecoveredWebhookEvent
        ) = UnwrapWebhookEvent(customerCreditBalanceRecovered = customerCreditBalanceRecovered)

        /** Issued when a customer's credit ledger is incremented. */
        fun ofCustomerCreditLedgerIncremented(
            customerCreditLedgerIncremented: CustomerCreditLedgerIncrementedWebhookEvent
        ) = UnwrapWebhookEvent(customerCreditLedgerIncremented = customerCreditLedgerIncremented)

        /** Issued when a customer is updated. */
        fun ofCustomerEdited(customerEdited: CustomerEditedWebhookEvent) =
            UnwrapWebhookEvent(customerEdited = customerEdited)

        /** Issued when a data export transfer fails. */
        fun ofDataExportsTransferError(
            dataExportsTransferError: DataExportsTransferErrorWebhookEvent
        ) = UnwrapWebhookEvent(dataExportsTransferError = dataExportsTransferError)

        /** Issued when a data export transfer succeeds. */
        fun ofDataExportsTransferSuccess(
            dataExportsTransferSuccess: DataExportsTransferSuccessWebhookEvent
        ) = UnwrapWebhookEvent(dataExportsTransferSuccess = dataExportsTransferSuccess)

        /** Issued when an event does not match any customer. */
        fun ofEventUnmatchedEvent(eventUnmatchedEvent: EventUnmatchedEventWebhookEvent) =
            UnwrapWebhookEvent(eventUnmatchedEvent = eventUnmatchedEvent)

        /** Issued when ingestion events reference unmatched customer IDs. */
        fun ofIngestionUnmatchedCustomerIds(
            ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsWebhookEvent
        ) = UnwrapWebhookEvent(ingestionUnmatchedCustomerIds = ingestionUnmatchedCustomerIds)

        /** Issued when an invoice accounting sync fails. */
        fun ofInvoiceAccountingSyncFailed(
            invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedWebhookEvent
        ) = UnwrapWebhookEvent(invoiceAccountingSyncFailed = invoiceAccountingSyncFailed)

        /** Issued when an invoice accounting sync succeeds. */
        fun ofInvoiceAccountingSyncSucceeded(
            invoiceAccountingSyncSucceeded: InvoiceAccountingSyncSucceededWebhookEvent
        ) = UnwrapWebhookEvent(invoiceAccountingSyncSucceeded = invoiceAccountingSyncSucceeded)

        /** Issued when a collections-automation schedule step is executed for an invoice. */
        fun ofInvoiceAutomationScheduleStepExecuted(
            invoiceAutomationScheduleStepExecuted: InvoiceAutomationScheduleStepExecutedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                invoiceAutomationScheduleStepExecuted = invoiceAutomationScheduleStepExecuted
            )

        /** Issued when invoice cost data is exported. */
        fun ofInvoiceCostDataExported(
            invoiceCostDataExported: InvoiceCostDataExportedWebhookEvent
        ) = UnwrapWebhookEvent(invoiceCostDataExported = invoiceCostDataExported)

        /** Issued when a dunning schedule is created for an invoice. */
        fun ofInvoiceDunningScheduleCreated(
            invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedWebhookEvent
        ) = UnwrapWebhookEvent(invoiceDunningScheduleCreated = invoiceDunningScheduleCreated)

        /** Issued when a dunning schedule ends. */
        fun ofInvoiceDunningScheduleEnded(
            invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedWebhookEvent
        ) = UnwrapWebhookEvent(invoiceDunningScheduleEnded = invoiceDunningScheduleEnded)

        /** Issued when a dunning schedule is reset. */
        fun ofInvoiceDunningScheduleReset(
            invoiceDunningScheduleReset: InvoiceDunningScheduleResetWebhookEvent
        ) = UnwrapWebhookEvent(invoiceDunningScheduleReset = invoiceDunningScheduleReset)

        /** Issued when a dunning schedule step is executed. */
        fun ofInvoiceDunningScheduleStepExecuted(
            invoiceDunningScheduleStepExecuted: InvoiceDunningScheduleStepExecutedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                invoiceDunningScheduleStepExecuted = invoiceDunningScheduleStepExecuted
            )

        /** Issued when a draft invoice has been edited. */
        fun ofInvoiceEdited(invoiceEdited: InvoiceEditedWebhookEvent) =
            UnwrapWebhookEvent(invoiceEdited = invoiceEdited)

        /** Issued when an invoice's invoice date has elapsed. */
        fun ofInvoiceInvoiceDateElapsed(
            invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedWebhookEvent
        ) = UnwrapWebhookEvent(invoiceInvoiceDateElapsed = invoiceInvoiceDateElapsed)

        /** Issued when an invoice issue attempt fails. */
        fun ofInvoiceIssueFailed(invoiceIssueFailed: InvoiceIssueFailedWebhookEvent) =
            UnwrapWebhookEvent(invoiceIssueFailed = invoiceIssueFailed)

        /** Issued when an invoice transitions to the "issued" state. */
        fun ofInvoiceIssued(invoiceIssued: InvoiceIssuedWebhookEvent) =
            UnwrapWebhookEvent(invoiceIssued = invoiceIssued)

        /**
         * A lightweight variant of invoice.issued for accounts configured to receive a summarized
         * invoice payload.
         */
        fun ofInvoiceIssuedSummary(invoiceIssuedSummary: InvoiceIssuedSummaryWebhookEvent) =
            UnwrapWebhookEvent(invoiceIssuedSummary = invoiceIssuedSummary)

        /** Issued when an invoice is manually marked as paid. */
        fun ofInvoiceManuallyMarkedAsPaid(
            invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidWebhookEvent
        ) = UnwrapWebhookEvent(invoiceManuallyMarkedAsPaid = invoiceManuallyMarkedAsPaid)

        /** Issued when an invoice is marked as void. */
        fun ofInvoiceManuallyMarkedAsVoid(
            invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidWebhookEvent
        ) = UnwrapWebhookEvent(invoiceManuallyMarkedAsVoid = invoiceManuallyMarkedAsVoid)

        /**
         * Issued when automated payment collection for an invoice fails for a configured payment
         * gateway.
         */
        fun ofInvoicePaymentFailed(invoicePaymentFailed: InvoicePaymentFailedWebhookEvent) =
            UnwrapWebhookEvent(invoicePaymentFailed = invoicePaymentFailed)

        /** Issued when an invoice payment is being processed. */
        fun ofInvoicePaymentProcessing(
            invoicePaymentProcessing: InvoicePaymentProcessingWebhookEvent
        ) = UnwrapWebhookEvent(invoicePaymentProcessing = invoicePaymentProcessing)

        /**
         * Issued when automated payment collection for an invoice succeeds for a configured payment
         * gateway.
         */
        fun ofInvoicePaymentSucceeded(
            invoicePaymentSucceeded: InvoicePaymentSucceededWebhookEvent
        ) = UnwrapWebhookEvent(invoicePaymentSucceeded = invoicePaymentSucceeded)

        /** Issued when an invoice sync fails. */
        fun ofInvoiceSyncFailed(invoiceSyncFailed: InvoiceSyncFailedWebhookEvent) =
            UnwrapWebhookEvent(invoiceSyncFailed = invoiceSyncFailed)

        /** Issued when an invoice sync succeeds. */
        fun ofInvoiceSyncSucceeded(invoiceSyncSucceeded: InvoiceSyncSucceededWebhookEvent) =
            UnwrapWebhookEvent(invoiceSyncSucceeded = invoiceSyncSucceeded)

        /** Issued when an invoice is undone from marked as paid. */
        fun ofInvoiceUndoMarkAsPaid(invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidWebhookEvent) =
            UnwrapWebhookEvent(invoiceUndoMarkAsPaid = invoiceUndoMarkAsPaid)

        /** Issued when an invoice due date recalculation is canceled. */
        fun ofInvoiceDueDateRecalculationCanceled(
            invoiceDueDateRecalculationCanceled: InvoiceDueDateRecalculationCanceledWebhookEvent
        ) =
            UnwrapWebhookEvent(
                invoiceDueDateRecalculationCanceled = invoiceDueDateRecalculationCanceled
            )

        /** Issued when an invoice due date recalculation is completed. */
        fun ofInvoiceDueDateRecalculationCompleted(
            invoiceDueDateRecalculationCompleted: InvoiceDueDateRecalculationCompletedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                invoiceDueDateRecalculationCompleted = invoiceDueDateRecalculationCompleted
            )

        /** Issued when an invoice due date recalculation is started. */
        fun ofInvoiceDueDateRecalculationStarted(
            invoiceDueDateRecalculationStarted: InvoiceDueDateRecalculationStartedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                invoiceDueDateRecalculationStarted = invoiceDueDateRecalculationStarted
            )

        /** Issued when metric events are dropped by watermark threshold. */
        fun ofMetricEventsDroppedByWatermark(
            metricEventsDroppedByWatermark: MetricEventsDroppedByWatermarkWebhookEvent
        ) = UnwrapWebhookEvent(metricEventsDroppedByWatermark = metricEventsDroppedByWatermark)

        /** Issued when a payment method is created. */
        fun ofPaymentMethodCreated(paymentMethodCreated: PaymentMethodCreatedWebhookEvent) =
            UnwrapWebhookEvent(paymentMethodCreated = paymentMethodCreated)

        /** Issued when a payment method is deleted. */
        fun ofPaymentMethodDeleted(paymentMethodDeleted: PaymentMethodDeletedWebhookEvent) =
            UnwrapWebhookEvent(paymentMethodDeleted = paymentMethodDeleted)

        /** Issued when a plan's default version is set. */
        fun ofPlanDefaultVersionSet(planDefaultVersionSet: PlanDefaultVersionSetWebhookEvent) =
            UnwrapWebhookEvent(planDefaultVersionSet = planDefaultVersionSet)

        /** Issued when a new plan version is created. */
        fun ofPlanVersionCreated(planVersionCreated: PlanVersionCreatedWebhookEvent) =
            UnwrapWebhookEvent(planVersionCreated = planVersionCreated)

        /** Issued when a price is edited. */
        fun ofPriceEdited(priceEdited: PriceEditedWebhookEvent) =
            UnwrapWebhookEvent(priceEdited = priceEdited)

        /** Issued when a test webhook is sent. */
        fun ofResourceEventTest(resourceEventTest: ResourceEventTestWebhookEvent) =
            UnwrapWebhookEvent(resourceEventTest = resourceEventTest)

        /** Issued when a sales order accounting sync fails. */
        fun ofSalesOrderAccountingSyncFailed(
            salesOrderAccountingSyncFailed: SalesOrderAccountingSyncFailedWebhookEvent
        ) = UnwrapWebhookEvent(salesOrderAccountingSyncFailed = salesOrderAccountingSyncFailed)

        /** Issued when a sales order accounting sync succeeds. */
        fun ofSalesOrderAccountingSyncSucceeded(
            salesOrderAccountingSyncSucceeded: SalesOrderAccountingSyncSucceededWebhookEvent
        ) =
            UnwrapWebhookEvent(
                salesOrderAccountingSyncSucceeded = salesOrderAccountingSyncSucceeded
            )

        /** Issued when a subscription accounting sync fails. */
        fun ofSubscriptionAccountingSyncFailed(
            subscriptionAccountingSyncFailed: SubscriptionAccountingSyncFailedWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionAccountingSyncFailed = subscriptionAccountingSyncFailed)

        /** Issued when a subscription accounting sync succeeds. */
        fun ofSubscriptionAccountingSyncSucceeded(
            subscriptionAccountingSyncSucceeded: SubscriptionAccountingSyncSucceededWebhookEvent
        ) =
            UnwrapWebhookEvent(
                subscriptionAccountingSyncSucceeded = subscriptionAccountingSyncSucceeded
            )

        /** Issued when an alert is automatically disabled by the system. */
        fun ofSubscriptionAlertDisabled(
            subscriptionAlertDisabled: SubscriptionAlertDisabledWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionAlertDisabled = subscriptionAlertDisabled)

        /** Issued when a subscription cancellation is scheduled. */
        fun ofSubscriptionCancellationScheduled(
            subscriptionCancellationScheduled: SubscriptionCancellationScheduledWebhookEvent
        ) =
            UnwrapWebhookEvent(
                subscriptionCancellationScheduled = subscriptionCancellationScheduled
            )

        /** Issued when a scheduled subscription cancellation is unscheduled. */
        fun ofSubscriptionCancellationUnscheduled(
            subscriptionCancellationUnscheduled: SubscriptionCancellationUnscheduledWebhookEvent
        ) =
            UnwrapWebhookEvent(
                subscriptionCancellationUnscheduled = subscriptionCancellationUnscheduled
            )

        /** Issued when a subscription's cost exceeds a pre-configured amount threshold. */
        fun ofSubscriptionCostExceeded(
            subscriptionCostExceeded: SubscriptionCostExceededWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionCostExceeded = subscriptionCostExceeded)

        /** Issued when a subscription resource is created. */
        fun ofSubscriptionCreated(subscriptionCreated: SubscriptionCreatedWebhookEvent) =
            UnwrapWebhookEvent(subscriptionCreated = subscriptionCreated)

        /** Issued when a subscription is updated. */
        fun ofSubscriptionEdited(subscriptionEdited: SubscriptionEditedWebhookEvent) =
            UnwrapWebhookEvent(subscriptionEdited = subscriptionEdited)

        /** Issued whenever a customer's subscription ends/lapses. */
        fun ofSubscriptionEnded(subscriptionEnded: SubscriptionEndedWebhookEvent) =
            UnwrapWebhookEvent(subscriptionEnded = subscriptionEnded)

        /** Issued when a subscription's fixed fee quantity is updated. */
        fun ofSubscriptionFixedFeeQuantityUpdated(
            subscriptionFixedFeeQuantityUpdated: SubscriptionFixedFeeQuantityUpdatedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                subscriptionFixedFeeQuantityUpdated = subscriptionFixedFeeQuantityUpdated
            )

        /** Issued when grouped subscription costs exceed a pre-configured amount threshold. */
        fun ofSubscriptionGroupedCostExceeded(
            subscriptionGroupedCostExceeded: SubscriptionGroupedCostExceededWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionGroupedCostExceeded = subscriptionGroupedCostExceeded)

        /**
         * Issued when a subscription's invoicing threshold is exceeded and an evaluation is
         * performed.
         */
        fun ofSubscriptionInvoicingThresholdExceeded(
            subscriptionInvoicingThresholdExceeded:
                SubscriptionInvoicingThresholdExceededWebhookEvent
        ) =
            UnwrapWebhookEvent(
                subscriptionInvoicingThresholdExceeded = subscriptionInvoicingThresholdExceeded
            )

        /** Issued when a license allocation is reset. */
        fun ofSubscriptionLicenseAllocationReset(
            subscriptionLicenseAllocationReset: SubscriptionLicenseAllocationResetWebhookEvent
        ) =
            UnwrapWebhookEvent(
                subscriptionLicenseAllocationReset = subscriptionLicenseAllocationReset
            )

        /** Issued when a license balance threshold is reached. */
        fun ofSubscriptionLicenseBalanceThresholdReached(
            subscriptionLicenseBalanceThresholdReached:
                SubscriptionLicenseBalanceThresholdReachedWebhookEvent
        ) =
            UnwrapWebhookEvent(
                subscriptionLicenseBalanceThresholdReached =
                    subscriptionLicenseBalanceThresholdReached
            )

        /** Issued when a subscription plan change is scheduled. */
        fun ofSubscriptionPlanChangeScheduled(
            subscriptionPlanChangeScheduled: SubscriptionPlanChangeScheduledWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionPlanChangeScheduled = subscriptionPlanChangeScheduled)

        /** Issued when a subscription transitions from one plan to a different plan. */
        fun ofSubscriptionPlanChanged(
            subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionPlanChanged = subscriptionPlanChanged)

        /** Issued when a subscription plan version change is scheduled. */
        fun ofSubscriptionPlanVersionChangeScheduled(
            subscriptionPlanVersionChangeScheduled:
                SubscriptionPlanVersionChangeScheduledWebhookEvent
        ) =
            UnwrapWebhookEvent(
                subscriptionPlanVersionChangeScheduled = subscriptionPlanVersionChangeScheduled
            )

        /** Issued when a subscription plan version has changed. */
        fun ofSubscriptionPlanVersionChanged(
            subscriptionPlanVersionChanged: SubscriptionPlanVersionChangedWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionPlanVersionChanged = subscriptionPlanVersionChanged)

        /**
         * Issued when a subscription's rated spend, before credits and adjustments, exceeds a
         * pre-configured amount threshold.
         */
        fun ofSubscriptionSpendExceeded(
            subscriptionSpendExceeded: SubscriptionSpendExceededWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionSpendExceeded = subscriptionSpendExceeded)

        /** Issued when a subscription begins. */
        fun ofSubscriptionStarted(subscriptionStarted: SubscriptionStartedWebhookEvent) =
            UnwrapWebhookEvent(subscriptionStarted = subscriptionStarted)

        /** Issued when a subscription trial ends. */
        fun ofSubscriptionTrialEnded(subscriptionTrialEnded: SubscriptionTrialEndedWebhookEvent) =
            UnwrapWebhookEvent(subscriptionTrialEnded = subscriptionTrialEnded)

        /**
         * Issued when a billable metric in a subscription exceeds a pre-configured quantity
         * threshold.
         */
        fun ofSubscriptionUsageExceeded(
            subscriptionUsageExceeded: SubscriptionUsageExceededWebhookEvent
        ) = UnwrapWebhookEvent(subscriptionUsageExceeded = subscriptionUsageExceeded)

        /** Issued when a transaction accounting sync fails. */
        fun ofTransactionAccountingSyncFailed(
            transactionAccountingSyncFailed: TransactionAccountingSyncFailedWebhookEvent
        ) = UnwrapWebhookEvent(transactionAccountingSyncFailed = transactionAccountingSyncFailed)

        /** Issued when a transaction accounting sync succeeds. */
        fun ofTransactionAccountingSyncSucceeded(
            transactionAccountingSyncSucceeded: TransactionAccountingSyncSucceededWebhookEvent
        ) =
            UnwrapWebhookEvent(
                transactionAccountingSyncSucceeded = transactionAccountingSyncSucceeded
            )
    }

    /**
     * An interface that defines how to map each variant of [UnwrapWebhookEvent] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Issued when a backfill is closed and its events are reflected into usage. */
        fun visitBackfillReflected(backfillReflected: BackfillReflectedWebhookEvent): T

        /** Issued when a backfill is reverted, removing its events from usage. */
        fun visitBackfillReverted(backfillReverted: BackfillRevertedWebhookEvent): T

        /** Issued when a billable metric is edited. */
        fun visitBillableMetricEdited(billableMetricEdited: BillableMetricEditedWebhookEvent): T

        /** Issued when a credit block accounting sync fails. */
        fun visitCreditBlockAccountingSyncFailed(
            creditBlockAccountingSyncFailed: CreditBlockAccountingSyncFailedWebhookEvent
        ): T

        /** Issued when a credit block accounting sync succeeds. */
        fun visitCreditBlockAccountingSyncSucceeded(
            creditBlockAccountingSyncSucceeded: CreditBlockAccountingSyncSucceededWebhookEvent
        ): T

        /** Issued when a credit note accounting sync fails. */
        fun visitCreditNoteAccountingSyncFailed(
            creditNoteAccountingSyncFailed: CreditNoteAccountingSyncFailedWebhookEvent
        ): T

        /** Issued when a credit note accounting sync succeeds. */
        fun visitCreditNoteAccountingSyncSucceeded(
            creditNoteAccountingSyncSucceeded: CreditNoteAccountingSyncSucceededWebhookEvent
        ): T

        /** Issued when a credit note is created. */
        fun visitCreditNoteIssued(creditNoteIssued: CreditNoteIssuedWebhookEvent): T

        /** Issued when a credit note is marked as void. */
        fun visitCreditNoteMarkedAsVoid(
            creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidWebhookEvent
        ): T

        /** Issued when a customer accounting sync fails. */
        fun visitCustomerAccountingSyncFailed(
            customerAccountingSyncFailed: CustomerAccountingSyncFailedWebhookEvent
        ): T

        /** Issued when a customer accounting sync succeeds. */
        fun visitCustomerAccountingSyncSucceeded(
            customerAccountingSyncSucceeded: CustomerAccountingSyncSucceededWebhookEvent
        ): T

        /** Issued when a customer balance transaction is created. */
        fun visitCustomerBalanceTransactionCreated(
            customerBalanceTransactionCreated: CustomerBalanceTransactionCreatedWebhookEvent
        ): T

        /** Issued when a customer resource is created. */
        fun visitCustomerCreated(customerCreated: CustomerCreatedWebhookEvent): T

        /** Issued when a customer's prepaid credits balance is depleted. */
        fun visitCustomerCreditBalanceDepleted(
            customerCreditBalanceDepleted: CustomerCreditBalanceDepletedWebhookEvent
        ): T

        /**
         * Issued when a customer's prepaid credits balance is depleted to a configured threshold.
         */
        fun visitCustomerCreditBalanceDropped(
            customerCreditBalanceDropped: CustomerCreditBalanceDroppedWebhookEvent
        ): T

        /** Issued when a customer's credit balance recovers from depleted. */
        fun visitCustomerCreditBalanceRecovered(
            customerCreditBalanceRecovered: CustomerCreditBalanceRecoveredWebhookEvent
        ): T

        /** Issued when a customer's credit ledger is incremented. */
        fun visitCustomerCreditLedgerIncremented(
            customerCreditLedgerIncremented: CustomerCreditLedgerIncrementedWebhookEvent
        ): T

        /** Issued when a customer is updated. */
        fun visitCustomerEdited(customerEdited: CustomerEditedWebhookEvent): T

        /** Issued when a data export transfer fails. */
        fun visitDataExportsTransferError(
            dataExportsTransferError: DataExportsTransferErrorWebhookEvent
        ): T

        /** Issued when a data export transfer succeeds. */
        fun visitDataExportsTransferSuccess(
            dataExportsTransferSuccess: DataExportsTransferSuccessWebhookEvent
        ): T

        /** Issued when an event does not match any customer. */
        fun visitEventUnmatchedEvent(eventUnmatchedEvent: EventUnmatchedEventWebhookEvent): T

        /** Issued when ingestion events reference unmatched customer IDs. */
        fun visitIngestionUnmatchedCustomerIds(
            ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsWebhookEvent
        ): T

        /** Issued when an invoice accounting sync fails. */
        fun visitInvoiceAccountingSyncFailed(
            invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedWebhookEvent
        ): T

        /** Issued when an invoice accounting sync succeeds. */
        fun visitInvoiceAccountingSyncSucceeded(
            invoiceAccountingSyncSucceeded: InvoiceAccountingSyncSucceededWebhookEvent
        ): T

        /** Issued when a collections-automation schedule step is executed for an invoice. */
        fun visitInvoiceAutomationScheduleStepExecuted(
            invoiceAutomationScheduleStepExecuted: InvoiceAutomationScheduleStepExecutedWebhookEvent
        ): T

        /** Issued when invoice cost data is exported. */
        fun visitInvoiceCostDataExported(
            invoiceCostDataExported: InvoiceCostDataExportedWebhookEvent
        ): T

        /** Issued when a dunning schedule is created for an invoice. */
        fun visitInvoiceDunningScheduleCreated(
            invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedWebhookEvent
        ): T

        /** Issued when a dunning schedule ends. */
        fun visitInvoiceDunningScheduleEnded(
            invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedWebhookEvent
        ): T

        /** Issued when a dunning schedule is reset. */
        fun visitInvoiceDunningScheduleReset(
            invoiceDunningScheduleReset: InvoiceDunningScheduleResetWebhookEvent
        ): T

        /** Issued when a dunning schedule step is executed. */
        fun visitInvoiceDunningScheduleStepExecuted(
            invoiceDunningScheduleStepExecuted: InvoiceDunningScheduleStepExecutedWebhookEvent
        ): T

        /** Issued when a draft invoice has been edited. */
        fun visitInvoiceEdited(invoiceEdited: InvoiceEditedWebhookEvent): T

        /** Issued when an invoice's invoice date has elapsed. */
        fun visitInvoiceInvoiceDateElapsed(
            invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedWebhookEvent
        ): T

        /** Issued when an invoice issue attempt fails. */
        fun visitInvoiceIssueFailed(invoiceIssueFailed: InvoiceIssueFailedWebhookEvent): T

        /** Issued when an invoice transitions to the "issued" state. */
        fun visitInvoiceIssued(invoiceIssued: InvoiceIssuedWebhookEvent): T

        /**
         * A lightweight variant of invoice.issued for accounts configured to receive a summarized
         * invoice payload.
         */
        fun visitInvoiceIssuedSummary(invoiceIssuedSummary: InvoiceIssuedSummaryWebhookEvent): T

        /** Issued when an invoice is manually marked as paid. */
        fun visitInvoiceManuallyMarkedAsPaid(
            invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidWebhookEvent
        ): T

        /** Issued when an invoice is marked as void. */
        fun visitInvoiceManuallyMarkedAsVoid(
            invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidWebhookEvent
        ): T

        /**
         * Issued when automated payment collection for an invoice fails for a configured payment
         * gateway.
         */
        fun visitInvoicePaymentFailed(invoicePaymentFailed: InvoicePaymentFailedWebhookEvent): T

        /** Issued when an invoice payment is being processed. */
        fun visitInvoicePaymentProcessing(
            invoicePaymentProcessing: InvoicePaymentProcessingWebhookEvent
        ): T

        /**
         * Issued when automated payment collection for an invoice succeeds for a configured payment
         * gateway.
         */
        fun visitInvoicePaymentSucceeded(
            invoicePaymentSucceeded: InvoicePaymentSucceededWebhookEvent
        ): T

        /** Issued when an invoice sync fails. */
        fun visitInvoiceSyncFailed(invoiceSyncFailed: InvoiceSyncFailedWebhookEvent): T

        /** Issued when an invoice sync succeeds. */
        fun visitInvoiceSyncSucceeded(invoiceSyncSucceeded: InvoiceSyncSucceededWebhookEvent): T

        /** Issued when an invoice is undone from marked as paid. */
        fun visitInvoiceUndoMarkAsPaid(invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidWebhookEvent): T

        /** Issued when an invoice due date recalculation is canceled. */
        fun visitInvoiceDueDateRecalculationCanceled(
            invoiceDueDateRecalculationCanceled: InvoiceDueDateRecalculationCanceledWebhookEvent
        ): T

        /** Issued when an invoice due date recalculation is completed. */
        fun visitInvoiceDueDateRecalculationCompleted(
            invoiceDueDateRecalculationCompleted: InvoiceDueDateRecalculationCompletedWebhookEvent
        ): T

        /** Issued when an invoice due date recalculation is started. */
        fun visitInvoiceDueDateRecalculationStarted(
            invoiceDueDateRecalculationStarted: InvoiceDueDateRecalculationStartedWebhookEvent
        ): T

        /** Issued when metric events are dropped by watermark threshold. */
        fun visitMetricEventsDroppedByWatermark(
            metricEventsDroppedByWatermark: MetricEventsDroppedByWatermarkWebhookEvent
        ): T

        /** Issued when a payment method is created. */
        fun visitPaymentMethodCreated(paymentMethodCreated: PaymentMethodCreatedWebhookEvent): T

        /** Issued when a payment method is deleted. */
        fun visitPaymentMethodDeleted(paymentMethodDeleted: PaymentMethodDeletedWebhookEvent): T

        /** Issued when a plan's default version is set. */
        fun visitPlanDefaultVersionSet(planDefaultVersionSet: PlanDefaultVersionSetWebhookEvent): T

        /** Issued when a new plan version is created. */
        fun visitPlanVersionCreated(planVersionCreated: PlanVersionCreatedWebhookEvent): T

        /** Issued when a price is edited. */
        fun visitPriceEdited(priceEdited: PriceEditedWebhookEvent): T

        /** Issued when a test webhook is sent. */
        fun visitResourceEventTest(resourceEventTest: ResourceEventTestWebhookEvent): T

        /** Issued when a sales order accounting sync fails. */
        fun visitSalesOrderAccountingSyncFailed(
            salesOrderAccountingSyncFailed: SalesOrderAccountingSyncFailedWebhookEvent
        ): T

        /** Issued when a sales order accounting sync succeeds. */
        fun visitSalesOrderAccountingSyncSucceeded(
            salesOrderAccountingSyncSucceeded: SalesOrderAccountingSyncSucceededWebhookEvent
        ): T

        /** Issued when a subscription accounting sync fails. */
        fun visitSubscriptionAccountingSyncFailed(
            subscriptionAccountingSyncFailed: SubscriptionAccountingSyncFailedWebhookEvent
        ): T

        /** Issued when a subscription accounting sync succeeds. */
        fun visitSubscriptionAccountingSyncSucceeded(
            subscriptionAccountingSyncSucceeded: SubscriptionAccountingSyncSucceededWebhookEvent
        ): T

        /** Issued when an alert is automatically disabled by the system. */
        fun visitSubscriptionAlertDisabled(
            subscriptionAlertDisabled: SubscriptionAlertDisabledWebhookEvent
        ): T

        /** Issued when a subscription cancellation is scheduled. */
        fun visitSubscriptionCancellationScheduled(
            subscriptionCancellationScheduled: SubscriptionCancellationScheduledWebhookEvent
        ): T

        /** Issued when a scheduled subscription cancellation is unscheduled. */
        fun visitSubscriptionCancellationUnscheduled(
            subscriptionCancellationUnscheduled: SubscriptionCancellationUnscheduledWebhookEvent
        ): T

        /** Issued when a subscription's cost exceeds a pre-configured amount threshold. */
        fun visitSubscriptionCostExceeded(
            subscriptionCostExceeded: SubscriptionCostExceededWebhookEvent
        ): T

        /** Issued when a subscription resource is created. */
        fun visitSubscriptionCreated(subscriptionCreated: SubscriptionCreatedWebhookEvent): T

        /** Issued when a subscription is updated. */
        fun visitSubscriptionEdited(subscriptionEdited: SubscriptionEditedWebhookEvent): T

        /** Issued whenever a customer's subscription ends/lapses. */
        fun visitSubscriptionEnded(subscriptionEnded: SubscriptionEndedWebhookEvent): T

        /** Issued when a subscription's fixed fee quantity is updated. */
        fun visitSubscriptionFixedFeeQuantityUpdated(
            subscriptionFixedFeeQuantityUpdated: SubscriptionFixedFeeQuantityUpdatedWebhookEvent
        ): T

        /** Issued when grouped subscription costs exceed a pre-configured amount threshold. */
        fun visitSubscriptionGroupedCostExceeded(
            subscriptionGroupedCostExceeded: SubscriptionGroupedCostExceededWebhookEvent
        ): T

        /**
         * Issued when a subscription's invoicing threshold is exceeded and an evaluation is
         * performed.
         */
        fun visitSubscriptionInvoicingThresholdExceeded(
            subscriptionInvoicingThresholdExceeded:
                SubscriptionInvoicingThresholdExceededWebhookEvent
        ): T

        /** Issued when a license allocation is reset. */
        fun visitSubscriptionLicenseAllocationReset(
            subscriptionLicenseAllocationReset: SubscriptionLicenseAllocationResetWebhookEvent
        ): T

        /** Issued when a license balance threshold is reached. */
        fun visitSubscriptionLicenseBalanceThresholdReached(
            subscriptionLicenseBalanceThresholdReached:
                SubscriptionLicenseBalanceThresholdReachedWebhookEvent
        ): T

        /** Issued when a subscription plan change is scheduled. */
        fun visitSubscriptionPlanChangeScheduled(
            subscriptionPlanChangeScheduled: SubscriptionPlanChangeScheduledWebhookEvent
        ): T

        /** Issued when a subscription transitions from one plan to a different plan. */
        fun visitSubscriptionPlanChanged(
            subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
        ): T

        /** Issued when a subscription plan version change is scheduled. */
        fun visitSubscriptionPlanVersionChangeScheduled(
            subscriptionPlanVersionChangeScheduled:
                SubscriptionPlanVersionChangeScheduledWebhookEvent
        ): T

        /** Issued when a subscription plan version has changed. */
        fun visitSubscriptionPlanVersionChanged(
            subscriptionPlanVersionChanged: SubscriptionPlanVersionChangedWebhookEvent
        ): T

        /**
         * Issued when a subscription's rated spend, before credits and adjustments, exceeds a
         * pre-configured amount threshold.
         */
        fun visitSubscriptionSpendExceeded(
            subscriptionSpendExceeded: SubscriptionSpendExceededWebhookEvent
        ): T

        /** Issued when a subscription begins. */
        fun visitSubscriptionStarted(subscriptionStarted: SubscriptionStartedWebhookEvent): T

        /** Issued when a subscription trial ends. */
        fun visitSubscriptionTrialEnded(
            subscriptionTrialEnded: SubscriptionTrialEndedWebhookEvent
        ): T

        /**
         * Issued when a billable metric in a subscription exceeds a pre-configured quantity
         * threshold.
         */
        fun visitSubscriptionUsageExceeded(
            subscriptionUsageExceeded: SubscriptionUsageExceededWebhookEvent
        ): T

        /** Issued when a transaction accounting sync fails. */
        fun visitTransactionAccountingSyncFailed(
            transactionAccountingSyncFailed: TransactionAccountingSyncFailedWebhookEvent
        ): T

        /** Issued when a transaction accounting sync succeeds. */
        fun visitTransactionAccountingSyncSucceeded(
            transactionAccountingSyncSucceeded: TransactionAccountingSyncSucceededWebhookEvent
        ): T

        /**
         * Maps an unknown variant of [UnwrapWebhookEvent] to a value of type [T].
         *
         * An instance of [UnwrapWebhookEvent] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown UnwrapWebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnwrapWebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<BackfillReflectedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(backfillReflected = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BackfillRevertedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(backfillReverted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BillableMetricEditedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(billableMetricEdited = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CreditBlockAccountingSyncFailedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    creditBlockAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CreditBlockAccountingSyncSucceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    creditBlockAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CreditNoteAccountingSyncFailedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    creditNoteAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CreditNoteAccountingSyncSucceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    creditNoteAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CreditNoteIssuedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(creditNoteIssued = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreditNoteMarkedAsVoidWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(creditNoteMarkedAsVoid = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerAccountingSyncFailedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(customerAccountingSyncFailed = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerAccountingSyncSucceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    customerAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerBalanceTransactionCreatedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    customerBalanceTransactionCreated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CustomerCreatedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(customerCreated = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerCreditBalanceDepletedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(customerCreditBalanceDepleted = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerCreditBalanceDroppedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(customerCreditBalanceDropped = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerCreditBalanceRecoveredWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    customerCreditBalanceRecovered = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerCreditLedgerIncrementedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    customerCreditLedgerIncremented = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CustomerEditedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(customerEdited = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DataExportsTransferErrorWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(dataExportsTransferError = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<DataExportsTransferSuccessWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(dataExportsTransferSuccess = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<EventUnmatchedEventWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(eventUnmatchedEvent = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<IngestionUnmatchedCustomerIdsWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(ingestionUnmatchedCustomerIds = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceAccountingSyncFailedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(invoiceAccountingSyncFailed = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceAccountingSyncSucceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    invoiceAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceAutomationScheduleStepExecutedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    invoiceAutomationScheduleStepExecuted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<InvoiceCostDataExportedWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(invoiceCostDataExported = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDunningScheduleCreatedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(invoiceDunningScheduleCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDunningScheduleEndedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(invoiceDunningScheduleEnded = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDunningScheduleResetWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(invoiceDunningScheduleReset = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDunningScheduleStepExecutedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    invoiceDunningScheduleStepExecuted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<InvoiceEditedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(invoiceEdited = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceInvoiceDateElapsedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(invoiceInvoiceDateElapsed = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<InvoiceIssueFailedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(invoiceIssueFailed = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<InvoiceIssuedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(invoiceIssued = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<InvoiceIssuedSummaryWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(invoiceIssuedSummary = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceManuallyMarkedAsPaidWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(invoiceManuallyMarkedAsPaid = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceManuallyMarkedAsVoidWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(invoiceManuallyMarkedAsVoid = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<InvoicePaymentFailedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(invoicePaymentFailed = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<InvoicePaymentProcessingWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(invoicePaymentProcessing = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<InvoicePaymentSucceededWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(invoicePaymentSucceeded = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<InvoiceSyncFailedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(invoiceSyncFailed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<InvoiceSyncSucceededWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(invoiceSyncSucceeded = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<InvoiceUndoMarkAsPaidWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(invoiceUndoMarkAsPaid = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDueDateRecalculationCanceledWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    invoiceDueDateRecalculationCanceled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDueDateRecalculationCompletedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    invoiceDueDateRecalculationCompleted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDueDateRecalculationStartedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    invoiceDueDateRecalculationStarted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<MetricEventsDroppedByWatermarkWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    metricEventsDroppedByWatermark = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<PaymentMethodCreatedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(paymentMethodCreated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<PaymentMethodDeletedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(paymentMethodDeleted = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<PlanDefaultVersionSetWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(planDefaultVersionSet = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<PlanVersionCreatedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(planVersionCreated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<PriceEditedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(priceEdited = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ResourceEventTestWebhookEvent>())?.let {
                            UnwrapWebhookEvent(resourceEventTest = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SalesOrderAccountingSyncFailedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    salesOrderAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SalesOrderAccountingSyncSucceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    salesOrderAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionAccountingSyncFailedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionAccountingSyncSucceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionAlertDisabledWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(subscriptionAlertDisabled = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionCancellationScheduledWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionCancellationScheduled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionCancellationUnscheduledWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionCancellationUnscheduled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionCostExceededWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(subscriptionCostExceeded = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionCreatedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionCreated = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionEditedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionEdited = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionEndedWebhookEvent>())?.let {
                            UnwrapWebhookEvent(subscriptionEnded = it, _json = json)
                        },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionFixedFeeQuantityUpdatedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionFixedFeeQuantityUpdated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionGroupedCostExceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionGroupedCostExceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionInvoicingThresholdExceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionInvoicingThresholdExceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionLicenseAllocationResetWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionLicenseAllocationReset = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionLicenseBalanceThresholdReachedWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionLicenseBalanceThresholdReached = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionPlanChangeScheduledWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionPlanChangeScheduled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionPlanChangedWebhookEvent>())
                            ?.let {
                                UnwrapWebhookEvent(subscriptionPlanChanged = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionPlanVersionChangeScheduledWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionPlanVersionChangeScheduled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionPlanVersionChangedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    subscriptionPlanVersionChanged = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionSpendExceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(subscriptionSpendExceeded = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionStartedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionStarted = it, _json = json) },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionTrialEndedWebhookEvent>())
                            ?.let { UnwrapWebhookEvent(subscriptionTrialEnded = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionUsageExceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(subscriptionUsageExceeded = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<TransactionAccountingSyncFailedWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    transactionAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<TransactionAccountingSyncSucceededWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapWebhookEvent(
                                    transactionAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UnwrapWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun serialize(
            value: UnwrapWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.backfillReflected != null -> generator.writeObject(value.backfillReflected)
                value.backfillReverted != null -> generator.writeObject(value.backfillReverted)
                value.billableMetricEdited != null ->
                    generator.writeObject(value.billableMetricEdited)
                value.creditBlockAccountingSyncFailed != null ->
                    generator.writeObject(value.creditBlockAccountingSyncFailed)
                value.creditBlockAccountingSyncSucceeded != null ->
                    generator.writeObject(value.creditBlockAccountingSyncSucceeded)
                value.creditNoteAccountingSyncFailed != null ->
                    generator.writeObject(value.creditNoteAccountingSyncFailed)
                value.creditNoteAccountingSyncSucceeded != null ->
                    generator.writeObject(value.creditNoteAccountingSyncSucceeded)
                value.creditNoteIssued != null -> generator.writeObject(value.creditNoteIssued)
                value.creditNoteMarkedAsVoid != null ->
                    generator.writeObject(value.creditNoteMarkedAsVoid)
                value.customerAccountingSyncFailed != null ->
                    generator.writeObject(value.customerAccountingSyncFailed)
                value.customerAccountingSyncSucceeded != null ->
                    generator.writeObject(value.customerAccountingSyncSucceeded)
                value.customerBalanceTransactionCreated != null ->
                    generator.writeObject(value.customerBalanceTransactionCreated)
                value.customerCreated != null -> generator.writeObject(value.customerCreated)
                value.customerCreditBalanceDepleted != null ->
                    generator.writeObject(value.customerCreditBalanceDepleted)
                value.customerCreditBalanceDropped != null ->
                    generator.writeObject(value.customerCreditBalanceDropped)
                value.customerCreditBalanceRecovered != null ->
                    generator.writeObject(value.customerCreditBalanceRecovered)
                value.customerCreditLedgerIncremented != null ->
                    generator.writeObject(value.customerCreditLedgerIncremented)
                value.customerEdited != null -> generator.writeObject(value.customerEdited)
                value.dataExportsTransferError != null ->
                    generator.writeObject(value.dataExportsTransferError)
                value.dataExportsTransferSuccess != null ->
                    generator.writeObject(value.dataExportsTransferSuccess)
                value.eventUnmatchedEvent != null ->
                    generator.writeObject(value.eventUnmatchedEvent)
                value.ingestionUnmatchedCustomerIds != null ->
                    generator.writeObject(value.ingestionUnmatchedCustomerIds)
                value.invoiceAccountingSyncFailed != null ->
                    generator.writeObject(value.invoiceAccountingSyncFailed)
                value.invoiceAccountingSyncSucceeded != null ->
                    generator.writeObject(value.invoiceAccountingSyncSucceeded)
                value.invoiceAutomationScheduleStepExecuted != null ->
                    generator.writeObject(value.invoiceAutomationScheduleStepExecuted)
                value.invoiceCostDataExported != null ->
                    generator.writeObject(value.invoiceCostDataExported)
                value.invoiceDunningScheduleCreated != null ->
                    generator.writeObject(value.invoiceDunningScheduleCreated)
                value.invoiceDunningScheduleEnded != null ->
                    generator.writeObject(value.invoiceDunningScheduleEnded)
                value.invoiceDunningScheduleReset != null ->
                    generator.writeObject(value.invoiceDunningScheduleReset)
                value.invoiceDunningScheduleStepExecuted != null ->
                    generator.writeObject(value.invoiceDunningScheduleStepExecuted)
                value.invoiceEdited != null -> generator.writeObject(value.invoiceEdited)
                value.invoiceInvoiceDateElapsed != null ->
                    generator.writeObject(value.invoiceInvoiceDateElapsed)
                value.invoiceIssueFailed != null -> generator.writeObject(value.invoiceIssueFailed)
                value.invoiceIssued != null -> generator.writeObject(value.invoiceIssued)
                value.invoiceIssuedSummary != null ->
                    generator.writeObject(value.invoiceIssuedSummary)
                value.invoiceManuallyMarkedAsPaid != null ->
                    generator.writeObject(value.invoiceManuallyMarkedAsPaid)
                value.invoiceManuallyMarkedAsVoid != null ->
                    generator.writeObject(value.invoiceManuallyMarkedAsVoid)
                value.invoicePaymentFailed != null ->
                    generator.writeObject(value.invoicePaymentFailed)
                value.invoicePaymentProcessing != null ->
                    generator.writeObject(value.invoicePaymentProcessing)
                value.invoicePaymentSucceeded != null ->
                    generator.writeObject(value.invoicePaymentSucceeded)
                value.invoiceSyncFailed != null -> generator.writeObject(value.invoiceSyncFailed)
                value.invoiceSyncSucceeded != null ->
                    generator.writeObject(value.invoiceSyncSucceeded)
                value.invoiceUndoMarkAsPaid != null ->
                    generator.writeObject(value.invoiceUndoMarkAsPaid)
                value.invoiceDueDateRecalculationCanceled != null ->
                    generator.writeObject(value.invoiceDueDateRecalculationCanceled)
                value.invoiceDueDateRecalculationCompleted != null ->
                    generator.writeObject(value.invoiceDueDateRecalculationCompleted)
                value.invoiceDueDateRecalculationStarted != null ->
                    generator.writeObject(value.invoiceDueDateRecalculationStarted)
                value.metricEventsDroppedByWatermark != null ->
                    generator.writeObject(value.metricEventsDroppedByWatermark)
                value.paymentMethodCreated != null ->
                    generator.writeObject(value.paymentMethodCreated)
                value.paymentMethodDeleted != null ->
                    generator.writeObject(value.paymentMethodDeleted)
                value.planDefaultVersionSet != null ->
                    generator.writeObject(value.planDefaultVersionSet)
                value.planVersionCreated != null -> generator.writeObject(value.planVersionCreated)
                value.priceEdited != null -> generator.writeObject(value.priceEdited)
                value.resourceEventTest != null -> generator.writeObject(value.resourceEventTest)
                value.salesOrderAccountingSyncFailed != null ->
                    generator.writeObject(value.salesOrderAccountingSyncFailed)
                value.salesOrderAccountingSyncSucceeded != null ->
                    generator.writeObject(value.salesOrderAccountingSyncSucceeded)
                value.subscriptionAccountingSyncFailed != null ->
                    generator.writeObject(value.subscriptionAccountingSyncFailed)
                value.subscriptionAccountingSyncSucceeded != null ->
                    generator.writeObject(value.subscriptionAccountingSyncSucceeded)
                value.subscriptionAlertDisabled != null ->
                    generator.writeObject(value.subscriptionAlertDisabled)
                value.subscriptionCancellationScheduled != null ->
                    generator.writeObject(value.subscriptionCancellationScheduled)
                value.subscriptionCancellationUnscheduled != null ->
                    generator.writeObject(value.subscriptionCancellationUnscheduled)
                value.subscriptionCostExceeded != null ->
                    generator.writeObject(value.subscriptionCostExceeded)
                value.subscriptionCreated != null ->
                    generator.writeObject(value.subscriptionCreated)
                value.subscriptionEdited != null -> generator.writeObject(value.subscriptionEdited)
                value.subscriptionEnded != null -> generator.writeObject(value.subscriptionEnded)
                value.subscriptionFixedFeeQuantityUpdated != null ->
                    generator.writeObject(value.subscriptionFixedFeeQuantityUpdated)
                value.subscriptionGroupedCostExceeded != null ->
                    generator.writeObject(value.subscriptionGroupedCostExceeded)
                value.subscriptionInvoicingThresholdExceeded != null ->
                    generator.writeObject(value.subscriptionInvoicingThresholdExceeded)
                value.subscriptionLicenseAllocationReset != null ->
                    generator.writeObject(value.subscriptionLicenseAllocationReset)
                value.subscriptionLicenseBalanceThresholdReached != null ->
                    generator.writeObject(value.subscriptionLicenseBalanceThresholdReached)
                value.subscriptionPlanChangeScheduled != null ->
                    generator.writeObject(value.subscriptionPlanChangeScheduled)
                value.subscriptionPlanChanged != null ->
                    generator.writeObject(value.subscriptionPlanChanged)
                value.subscriptionPlanVersionChangeScheduled != null ->
                    generator.writeObject(value.subscriptionPlanVersionChangeScheduled)
                value.subscriptionPlanVersionChanged != null ->
                    generator.writeObject(value.subscriptionPlanVersionChanged)
                value.subscriptionSpendExceeded != null ->
                    generator.writeObject(value.subscriptionSpendExceeded)
                value.subscriptionStarted != null ->
                    generator.writeObject(value.subscriptionStarted)
                value.subscriptionTrialEnded != null ->
                    generator.writeObject(value.subscriptionTrialEnded)
                value.subscriptionUsageExceeded != null ->
                    generator.writeObject(value.subscriptionUsageExceeded)
                value.transactionAccountingSyncFailed != null ->
                    generator.writeObject(value.transactionAccountingSyncFailed)
                value.transactionAccountingSyncSucceeded != null ->
                    generator.writeObject(value.transactionAccountingSyncSucceeded)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
            }
        }
    }
}
