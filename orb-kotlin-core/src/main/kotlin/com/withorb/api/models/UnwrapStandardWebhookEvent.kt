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
@JsonDeserialize(using = UnwrapStandardWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnwrapStandardWebhookEvent.Serializer::class)
class UnwrapStandardWebhookEvent
private constructor(
    private val backfillReflected: BackfillReflectedStandardWebhookEvent? = null,
    private val backfillReverted: BackfillRevertedStandardWebhookEvent? = null,
    private val billableMetricEdited: BillableMetricEditedStandardWebhookEvent? = null,
    private val creditBlockAccountingSyncFailed:
        CreditBlockAccountingSyncFailedStandardWebhookEvent? =
        null,
    private val creditBlockAccountingSyncSucceeded:
        CreditBlockAccountingSyncSucceededStandardWebhookEvent? =
        null,
    private val creditNoteAccountingSyncFailed:
        CreditNoteAccountingSyncFailedStandardWebhookEvent? =
        null,
    private val creditNoteAccountingSyncSucceeded:
        CreditNoteAccountingSyncSucceededStandardWebhookEvent? =
        null,
    private val creditNoteIssued: CreditNoteIssuedStandardWebhookEvent? = null,
    private val creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidStandardWebhookEvent? = null,
    private val customerAccountingSyncFailed: CustomerAccountingSyncFailedStandardWebhookEvent? =
        null,
    private val customerAccountingSyncSucceeded:
        CustomerAccountingSyncSucceededStandardWebhookEvent? =
        null,
    private val customerBalanceTransactionCreated:
        CustomerBalanceTransactionCreatedStandardWebhookEvent? =
        null,
    private val customerCreated: CustomerCreatedStandardWebhookEvent? = null,
    private val customerCreditBalanceDepleted: CustomerCreditBalanceDepletedStandardWebhookEvent? =
        null,
    private val customerCreditBalanceDropped: CustomerCreditBalanceDroppedStandardWebhookEvent? =
        null,
    private val customerCreditBalanceRecovered:
        CustomerCreditBalanceRecoveredStandardWebhookEvent? =
        null,
    private val customerCreditLedgerIncremented:
        CustomerCreditLedgerIncrementedStandardWebhookEvent? =
        null,
    private val customerEdited: CustomerEditedStandardWebhookEvent? = null,
    private val dataExportsTransferError: DataExportsTransferErrorStandardWebhookEvent? = null,
    private val dataExportsTransferSuccess: DataExportsTransferSuccessStandardWebhookEvent? = null,
    private val eventUnmatchedEvent: EventUnmatchedEventStandardWebhookEvent? = null,
    private val ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsStandardWebhookEvent? =
        null,
    private val invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedStandardWebhookEvent? =
        null,
    private val invoiceAccountingSyncSucceeded:
        InvoiceAccountingSyncSucceededStandardWebhookEvent? =
        null,
    private val invoiceAutomationScheduleStepExecuted:
        InvoiceAutomationScheduleStepExecutedStandardWebhookEvent? =
        null,
    private val invoiceCostDataExported: InvoiceCostDataExportedStandardWebhookEvent? = null,
    private val invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedStandardWebhookEvent? =
        null,
    private val invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedStandardWebhookEvent? =
        null,
    private val invoiceDunningScheduleReset: InvoiceDunningScheduleResetStandardWebhookEvent? =
        null,
    private val invoiceDunningScheduleStepExecuted:
        InvoiceDunningScheduleStepExecutedStandardWebhookEvent? =
        null,
    private val invoiceEdited: InvoiceEditedStandardWebhookEvent? = null,
    private val invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedStandardWebhookEvent? = null,
    private val invoiceIssueFailed: InvoiceIssueFailedStandardWebhookEvent? = null,
    private val invoiceIssued: InvoiceIssuedStandardWebhookEvent? = null,
    private val invoiceIssuedSummary: InvoiceIssuedSummaryStandardWebhookEvent? = null,
    private val invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidStandardWebhookEvent? =
        null,
    private val invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidStandardWebhookEvent? =
        null,
    private val invoicePaymentFailed: InvoicePaymentFailedStandardWebhookEvent? = null,
    private val invoicePaymentProcessing: InvoicePaymentProcessingStandardWebhookEvent? = null,
    private val invoicePaymentSucceeded: InvoicePaymentSucceededStandardWebhookEvent? = null,
    private val invoiceSyncFailed: InvoiceSyncFailedStandardWebhookEvent? = null,
    private val invoiceSyncSucceeded: InvoiceSyncSucceededStandardWebhookEvent? = null,
    private val invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidStandardWebhookEvent? = null,
    private val invoiceDueDateRecalculationCanceled:
        InvoiceDueDateRecalculationCanceledStandardWebhookEvent? =
        null,
    private val invoiceDueDateRecalculationCompleted:
        InvoiceDueDateRecalculationCompletedStandardWebhookEvent? =
        null,
    private val invoiceDueDateRecalculationStarted:
        InvoiceDueDateRecalculationStartedStandardWebhookEvent? =
        null,
    private val metricEventsDroppedByWatermark:
        MetricEventsDroppedByWatermarkStandardWebhookEvent? =
        null,
    private val paymentMethodCreated: PaymentMethodCreatedStandardWebhookEvent? = null,
    private val paymentMethodDeleted: PaymentMethodDeletedStandardWebhookEvent? = null,
    private val planCreated: PlanCreatedStandardWebhookEvent? = null,
    private val planDefaultVersionSet: PlanDefaultVersionSetStandardWebhookEvent? = null,
    private val planEdited: PlanEditedStandardWebhookEvent? = null,
    private val planVersionCreated: PlanVersionCreatedStandardWebhookEvent? = null,
    private val priceEdited: PriceEditedStandardWebhookEvent? = null,
    private val resourceEventTest: ResourceEventTestStandardWebhookEvent? = null,
    private val salesOrderAccountingSyncFailed:
        SalesOrderAccountingSyncFailedStandardWebhookEvent? =
        null,
    private val salesOrderAccountingSyncSucceeded:
        SalesOrderAccountingSyncSucceededStandardWebhookEvent? =
        null,
    private val subscriptionAccountingSyncFailed:
        SubscriptionAccountingSyncFailedStandardWebhookEvent? =
        null,
    private val subscriptionAccountingSyncSucceeded:
        SubscriptionAccountingSyncSucceededStandardWebhookEvent? =
        null,
    private val subscriptionAlertDisabled: SubscriptionAlertDisabledStandardWebhookEvent? = null,
    private val subscriptionCancellationScheduled:
        SubscriptionCancellationScheduledStandardWebhookEvent? =
        null,
    private val subscriptionCancellationUnscheduled:
        SubscriptionCancellationUnscheduledStandardWebhookEvent? =
        null,
    private val subscriptionCostExceeded: SubscriptionCostExceededStandardWebhookEvent? = null,
    private val subscriptionCreated: SubscriptionCreatedStandardWebhookEvent? = null,
    private val subscriptionEdited: SubscriptionEditedStandardWebhookEvent? = null,
    private val subscriptionEnded: SubscriptionEndedStandardWebhookEvent? = null,
    private val subscriptionFixedFeeQuantityUpdated:
        SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent? =
        null,
    private val subscriptionGroupedCostExceeded:
        SubscriptionGroupedCostExceededStandardWebhookEvent? =
        null,
    private val subscriptionInvoicingThresholdExceeded:
        SubscriptionInvoicingThresholdExceededStandardWebhookEvent? =
        null,
    private val subscriptionLicenseAllocationReset:
        SubscriptionLicenseAllocationResetStandardWebhookEvent? =
        null,
    private val subscriptionLicenseBalanceThresholdReached:
        SubscriptionLicenseBalanceThresholdReachedStandardWebhookEvent? =
        null,
    private val subscriptionPlanChangeScheduled:
        SubscriptionPlanChangeScheduledStandardWebhookEvent? =
        null,
    private val subscriptionPlanChanged: SubscriptionPlanChangedStandardWebhookEvent? = null,
    private val subscriptionPlanVersionChangeScheduled:
        SubscriptionPlanVersionChangeScheduledStandardWebhookEvent? =
        null,
    private val subscriptionPlanVersionChanged:
        SubscriptionPlanVersionChangedStandardWebhookEvent? =
        null,
    private val subscriptionSpendExceeded: SubscriptionSpendExceededStandardWebhookEvent? = null,
    private val subscriptionStarted: SubscriptionStartedStandardWebhookEvent? = null,
    private val subscriptionTrialEnded: SubscriptionTrialEndedStandardWebhookEvent? = null,
    private val subscriptionUsageExceeded: SubscriptionUsageExceededStandardWebhookEvent? = null,
    private val transactionAccountingSyncFailed:
        TransactionAccountingSyncFailedStandardWebhookEvent? =
        null,
    private val transactionAccountingSyncSucceeded:
        TransactionAccountingSyncSucceededStandardWebhookEvent? =
        null,
    private val _json: JsonValue? = null,
) {

    /** Issued when a backfill is closed and its events are reflected into usage. */
    fun backfillReflected(): BackfillReflectedStandardWebhookEvent? = backfillReflected

    /** Issued when a backfill is reverted, removing its events from usage. */
    fun backfillReverted(): BackfillRevertedStandardWebhookEvent? = backfillReverted

    /** Issued when a billable metric is edited. */
    fun billableMetricEdited(): BillableMetricEditedStandardWebhookEvent? = billableMetricEdited

    /** Issued when a credit block accounting sync fails. */
    fun creditBlockAccountingSyncFailed(): CreditBlockAccountingSyncFailedStandardWebhookEvent? =
        creditBlockAccountingSyncFailed

    /** Issued when a credit block accounting sync succeeds. */
    fun creditBlockAccountingSyncSucceeded():
        CreditBlockAccountingSyncSucceededStandardWebhookEvent? = creditBlockAccountingSyncSucceeded

    /** Issued when a credit note accounting sync fails. */
    fun creditNoteAccountingSyncFailed(): CreditNoteAccountingSyncFailedStandardWebhookEvent? =
        creditNoteAccountingSyncFailed

    /** Issued when a credit note accounting sync succeeds. */
    fun creditNoteAccountingSyncSucceeded():
        CreditNoteAccountingSyncSucceededStandardWebhookEvent? = creditNoteAccountingSyncSucceeded

    /** Issued when a credit note is created. */
    fun creditNoteIssued(): CreditNoteIssuedStandardWebhookEvent? = creditNoteIssued

    /** Issued when a credit note is marked as void. */
    fun creditNoteMarkedAsVoid(): CreditNoteMarkedAsVoidStandardWebhookEvent? =
        creditNoteMarkedAsVoid

    /** Issued when a customer accounting sync fails. */
    fun customerAccountingSyncFailed(): CustomerAccountingSyncFailedStandardWebhookEvent? =
        customerAccountingSyncFailed

    /** Issued when a customer accounting sync succeeds. */
    fun customerAccountingSyncSucceeded(): CustomerAccountingSyncSucceededStandardWebhookEvent? =
        customerAccountingSyncSucceeded

    /** Issued when a customer balance transaction is created. */
    fun customerBalanceTransactionCreated():
        CustomerBalanceTransactionCreatedStandardWebhookEvent? = customerBalanceTransactionCreated

    /** Issued when a customer resource is created. */
    fun customerCreated(): CustomerCreatedStandardWebhookEvent? = customerCreated

    /** Issued when a customer's prepaid credits balance is depleted. */
    fun customerCreditBalanceDepleted(): CustomerCreditBalanceDepletedStandardWebhookEvent? =
        customerCreditBalanceDepleted

    /** Issued when a customer's prepaid credits balance is depleted to a configured threshold. */
    fun customerCreditBalanceDropped(): CustomerCreditBalanceDroppedStandardWebhookEvent? =
        customerCreditBalanceDropped

    /** Issued when a customer's credit balance recovers from depleted. */
    fun customerCreditBalanceRecovered(): CustomerCreditBalanceRecoveredStandardWebhookEvent? =
        customerCreditBalanceRecovered

    /** Issued when a customer's credit ledger is incremented. */
    fun customerCreditLedgerIncremented(): CustomerCreditLedgerIncrementedStandardWebhookEvent? =
        customerCreditLedgerIncremented

    /** Issued when a customer is updated. */
    fun customerEdited(): CustomerEditedStandardWebhookEvent? = customerEdited

    /** Issued when a data export transfer fails. */
    fun dataExportsTransferError(): DataExportsTransferErrorStandardWebhookEvent? =
        dataExportsTransferError

    /** Issued when a data export transfer succeeds. */
    fun dataExportsTransferSuccess(): DataExportsTransferSuccessStandardWebhookEvent? =
        dataExportsTransferSuccess

    /** Issued when an event does not match any customer. */
    fun eventUnmatchedEvent(): EventUnmatchedEventStandardWebhookEvent? = eventUnmatchedEvent

    /** Issued when ingestion events reference unmatched customer IDs. */
    fun ingestionUnmatchedCustomerIds(): IngestionUnmatchedCustomerIdsStandardWebhookEvent? =
        ingestionUnmatchedCustomerIds

    /** Issued when an invoice accounting sync fails. */
    fun invoiceAccountingSyncFailed(): InvoiceAccountingSyncFailedStandardWebhookEvent? =
        invoiceAccountingSyncFailed

    /** Issued when an invoice accounting sync succeeds. */
    fun invoiceAccountingSyncSucceeded(): InvoiceAccountingSyncSucceededStandardWebhookEvent? =
        invoiceAccountingSyncSucceeded

    /** Issued when a collections-automation schedule step is executed for an invoice. */
    fun invoiceAutomationScheduleStepExecuted():
        InvoiceAutomationScheduleStepExecutedStandardWebhookEvent? =
        invoiceAutomationScheduleStepExecuted

    /** Issued when invoice cost data is exported. */
    fun invoiceCostDataExported(): InvoiceCostDataExportedStandardWebhookEvent? =
        invoiceCostDataExported

    /** Issued when a dunning schedule is created for an invoice. */
    fun invoiceDunningScheduleCreated(): InvoiceDunningScheduleCreatedStandardWebhookEvent? =
        invoiceDunningScheduleCreated

    /** Issued when a dunning schedule ends. */
    fun invoiceDunningScheduleEnded(): InvoiceDunningScheduleEndedStandardWebhookEvent? =
        invoiceDunningScheduleEnded

    /** Issued when a dunning schedule is reset. */
    fun invoiceDunningScheduleReset(): InvoiceDunningScheduleResetStandardWebhookEvent? =
        invoiceDunningScheduleReset

    /** Issued when a dunning schedule step is executed. */
    fun invoiceDunningScheduleStepExecuted():
        InvoiceDunningScheduleStepExecutedStandardWebhookEvent? = invoiceDunningScheduleStepExecuted

    /** Issued when a draft invoice has been edited. */
    fun invoiceEdited(): InvoiceEditedStandardWebhookEvent? = invoiceEdited

    /** Issued when an invoice's invoice date has elapsed. */
    fun invoiceInvoiceDateElapsed(): InvoiceInvoiceDateElapsedStandardWebhookEvent? =
        invoiceInvoiceDateElapsed

    /** Issued when an invoice issue attempt fails. */
    fun invoiceIssueFailed(): InvoiceIssueFailedStandardWebhookEvent? = invoiceIssueFailed

    /** Issued when an invoice transitions to the "issued" state. */
    fun invoiceIssued(): InvoiceIssuedStandardWebhookEvent? = invoiceIssued

    /**
     * A lightweight variant of invoice.issued for accounts configured to receive a summarized
     * invoice payload.
     */
    fun invoiceIssuedSummary(): InvoiceIssuedSummaryStandardWebhookEvent? = invoiceIssuedSummary

    /** Issued when an invoice is manually marked as paid. */
    fun invoiceManuallyMarkedAsPaid(): InvoiceManuallyMarkedAsPaidStandardWebhookEvent? =
        invoiceManuallyMarkedAsPaid

    /** Issued when an invoice is marked as void. */
    fun invoiceManuallyMarkedAsVoid(): InvoiceManuallyMarkedAsVoidStandardWebhookEvent? =
        invoiceManuallyMarkedAsVoid

    /**
     * Issued when automated payment collection for an invoice fails for a configured payment
     * gateway.
     */
    fun invoicePaymentFailed(): InvoicePaymentFailedStandardWebhookEvent? = invoicePaymentFailed

    /** Issued when an invoice payment is being processed. */
    fun invoicePaymentProcessing(): InvoicePaymentProcessingStandardWebhookEvent? =
        invoicePaymentProcessing

    /**
     * Issued when automated payment collection for an invoice succeeds for a configured payment
     * gateway.
     */
    fun invoicePaymentSucceeded(): InvoicePaymentSucceededStandardWebhookEvent? =
        invoicePaymentSucceeded

    /** Issued when an invoice sync fails. */
    fun invoiceSyncFailed(): InvoiceSyncFailedStandardWebhookEvent? = invoiceSyncFailed

    /** Issued when an invoice sync succeeds. */
    fun invoiceSyncSucceeded(): InvoiceSyncSucceededStandardWebhookEvent? = invoiceSyncSucceeded

    /** Issued when an invoice is undone from marked as paid. */
    fun invoiceUndoMarkAsPaid(): InvoiceUndoMarkAsPaidStandardWebhookEvent? = invoiceUndoMarkAsPaid

    /** Issued when an invoice due date recalculation is canceled. */
    fun invoiceDueDateRecalculationCanceled():
        InvoiceDueDateRecalculationCanceledStandardWebhookEvent? =
        invoiceDueDateRecalculationCanceled

    /** Issued when an invoice due date recalculation is completed. */
    fun invoiceDueDateRecalculationCompleted():
        InvoiceDueDateRecalculationCompletedStandardWebhookEvent? =
        invoiceDueDateRecalculationCompleted

    /** Issued when an invoice due date recalculation is started. */
    fun invoiceDueDateRecalculationStarted():
        InvoiceDueDateRecalculationStartedStandardWebhookEvent? = invoiceDueDateRecalculationStarted

    /** Issued when metric events are dropped by watermark threshold. */
    fun metricEventsDroppedByWatermark(): MetricEventsDroppedByWatermarkStandardWebhookEvent? =
        metricEventsDroppedByWatermark

    /** Issued when a payment method is created. */
    fun paymentMethodCreated(): PaymentMethodCreatedStandardWebhookEvent? = paymentMethodCreated

    /** Issued when a payment method is deleted. */
    fun paymentMethodDeleted(): PaymentMethodDeletedStandardWebhookEvent? = paymentMethodDeleted

    /** Issued when a plan is created, or when a draft plan is published. */
    fun planCreated(): PlanCreatedStandardWebhookEvent? = planCreated

    /** Issued when a plan's default version is set. */
    fun planDefaultVersionSet(): PlanDefaultVersionSetStandardWebhookEvent? = planDefaultVersionSet

    /** Issued when a plan's name, description, external plan ID, metadata or status is edited. */
    fun planEdited(): PlanEditedStandardWebhookEvent? = planEdited

    /** Issued when a new plan version is created. */
    fun planVersionCreated(): PlanVersionCreatedStandardWebhookEvent? = planVersionCreated

    /** Issued when a price is edited. */
    fun priceEdited(): PriceEditedStandardWebhookEvent? = priceEdited

    /** Issued when a test webhook is sent. */
    fun resourceEventTest(): ResourceEventTestStandardWebhookEvent? = resourceEventTest

    /** Issued when a sales order accounting sync fails. */
    fun salesOrderAccountingSyncFailed(): SalesOrderAccountingSyncFailedStandardWebhookEvent? =
        salesOrderAccountingSyncFailed

    /** Issued when a sales order accounting sync succeeds. */
    fun salesOrderAccountingSyncSucceeded():
        SalesOrderAccountingSyncSucceededStandardWebhookEvent? = salesOrderAccountingSyncSucceeded

    /** Issued when a subscription accounting sync fails. */
    fun subscriptionAccountingSyncFailed(): SubscriptionAccountingSyncFailedStandardWebhookEvent? =
        subscriptionAccountingSyncFailed

    /** Issued when a subscription accounting sync succeeds. */
    fun subscriptionAccountingSyncSucceeded():
        SubscriptionAccountingSyncSucceededStandardWebhookEvent? =
        subscriptionAccountingSyncSucceeded

    /** Issued when an alert is automatically disabled by the system. */
    fun subscriptionAlertDisabled(): SubscriptionAlertDisabledStandardWebhookEvent? =
        subscriptionAlertDisabled

    /** Issued when a subscription cancellation is scheduled. */
    fun subscriptionCancellationScheduled():
        SubscriptionCancellationScheduledStandardWebhookEvent? = subscriptionCancellationScheduled

    /** Issued when a scheduled subscription cancellation is unscheduled. */
    fun subscriptionCancellationUnscheduled():
        SubscriptionCancellationUnscheduledStandardWebhookEvent? =
        subscriptionCancellationUnscheduled

    /** Issued when a subscription's cost exceeds a pre-configured amount threshold. */
    fun subscriptionCostExceeded(): SubscriptionCostExceededStandardWebhookEvent? =
        subscriptionCostExceeded

    /** Issued when a subscription resource is created. */
    fun subscriptionCreated(): SubscriptionCreatedStandardWebhookEvent? = subscriptionCreated

    /** Issued when a subscription is updated. */
    fun subscriptionEdited(): SubscriptionEditedStandardWebhookEvent? = subscriptionEdited

    /** Issued whenever a customer's subscription ends/lapses. */
    fun subscriptionEnded(): SubscriptionEndedStandardWebhookEvent? = subscriptionEnded

    /** Issued when a subscription's fixed fee quantity is updated. */
    fun subscriptionFixedFeeQuantityUpdated():
        SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent? =
        subscriptionFixedFeeQuantityUpdated

    /** Issued when grouped subscription costs exceed a pre-configured amount threshold. */
    fun subscriptionGroupedCostExceeded(): SubscriptionGroupedCostExceededStandardWebhookEvent? =
        subscriptionGroupedCostExceeded

    /**
     * Issued when a subscription's invoicing threshold is exceeded and an evaluation is performed.
     */
    fun subscriptionInvoicingThresholdExceeded():
        SubscriptionInvoicingThresholdExceededStandardWebhookEvent? =
        subscriptionInvoicingThresholdExceeded

    /** Issued when a license allocation is reset. */
    fun subscriptionLicenseAllocationReset():
        SubscriptionLicenseAllocationResetStandardWebhookEvent? = subscriptionLicenseAllocationReset

    /** Issued when a license balance threshold is reached. */
    fun subscriptionLicenseBalanceThresholdReached():
        SubscriptionLicenseBalanceThresholdReachedStandardWebhookEvent? =
        subscriptionLicenseBalanceThresholdReached

    /** Issued when a subscription plan change is scheduled. */
    fun subscriptionPlanChangeScheduled(): SubscriptionPlanChangeScheduledStandardWebhookEvent? =
        subscriptionPlanChangeScheduled

    /** Issued when a subscription transitions from one plan to a different plan. */
    fun subscriptionPlanChanged(): SubscriptionPlanChangedStandardWebhookEvent? =
        subscriptionPlanChanged

    /** Issued when a subscription plan version change is scheduled. */
    fun subscriptionPlanVersionChangeScheduled():
        SubscriptionPlanVersionChangeScheduledStandardWebhookEvent? =
        subscriptionPlanVersionChangeScheduled

    /** Issued when a subscription plan version has changed. */
    fun subscriptionPlanVersionChanged(): SubscriptionPlanVersionChangedStandardWebhookEvent? =
        subscriptionPlanVersionChanged

    /**
     * Issued when a subscription's rated spend, before credits and adjustments, exceeds a
     * pre-configured amount threshold.
     */
    fun subscriptionSpendExceeded(): SubscriptionSpendExceededStandardWebhookEvent? =
        subscriptionSpendExceeded

    /** Issued when a subscription begins. */
    fun subscriptionStarted(): SubscriptionStartedStandardWebhookEvent? = subscriptionStarted

    /** Issued when a subscription trial ends. */
    fun subscriptionTrialEnded(): SubscriptionTrialEndedStandardWebhookEvent? =
        subscriptionTrialEnded

    /**
     * Issued when a billable metric in a subscription exceeds a pre-configured quantity threshold.
     */
    fun subscriptionUsageExceeded(): SubscriptionUsageExceededStandardWebhookEvent? =
        subscriptionUsageExceeded

    /** Issued when a transaction accounting sync fails. */
    fun transactionAccountingSyncFailed(): TransactionAccountingSyncFailedStandardWebhookEvent? =
        transactionAccountingSyncFailed

    /** Issued when a transaction accounting sync succeeds. */
    fun transactionAccountingSyncSucceeded():
        TransactionAccountingSyncSucceededStandardWebhookEvent? = transactionAccountingSyncSucceeded

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

    fun isPlanCreated(): Boolean = planCreated != null

    fun isPlanDefaultVersionSet(): Boolean = planDefaultVersionSet != null

    fun isPlanEdited(): Boolean = planEdited != null

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
    fun asBackfillReflected(): BackfillReflectedStandardWebhookEvent =
        backfillReflected.getOrThrow("backfillReflected")

    /** Issued when a backfill is reverted, removing its events from usage. */
    fun asBackfillReverted(): BackfillRevertedStandardWebhookEvent =
        backfillReverted.getOrThrow("backfillReverted")

    /** Issued when a billable metric is edited. */
    fun asBillableMetricEdited(): BillableMetricEditedStandardWebhookEvent =
        billableMetricEdited.getOrThrow("billableMetricEdited")

    /** Issued when a credit block accounting sync fails. */
    fun asCreditBlockAccountingSyncFailed(): CreditBlockAccountingSyncFailedStandardWebhookEvent =
        creditBlockAccountingSyncFailed.getOrThrow("creditBlockAccountingSyncFailed")

    /** Issued when a credit block accounting sync succeeds. */
    fun asCreditBlockAccountingSyncSucceeded():
        CreditBlockAccountingSyncSucceededStandardWebhookEvent =
        creditBlockAccountingSyncSucceeded.getOrThrow("creditBlockAccountingSyncSucceeded")

    /** Issued when a credit note accounting sync fails. */
    fun asCreditNoteAccountingSyncFailed(): CreditNoteAccountingSyncFailedStandardWebhookEvent =
        creditNoteAccountingSyncFailed.getOrThrow("creditNoteAccountingSyncFailed")

    /** Issued when a credit note accounting sync succeeds. */
    fun asCreditNoteAccountingSyncSucceeded():
        CreditNoteAccountingSyncSucceededStandardWebhookEvent =
        creditNoteAccountingSyncSucceeded.getOrThrow("creditNoteAccountingSyncSucceeded")

    /** Issued when a credit note is created. */
    fun asCreditNoteIssued(): CreditNoteIssuedStandardWebhookEvent =
        creditNoteIssued.getOrThrow("creditNoteIssued")

    /** Issued when a credit note is marked as void. */
    fun asCreditNoteMarkedAsVoid(): CreditNoteMarkedAsVoidStandardWebhookEvent =
        creditNoteMarkedAsVoid.getOrThrow("creditNoteMarkedAsVoid")

    /** Issued when a customer accounting sync fails. */
    fun asCustomerAccountingSyncFailed(): CustomerAccountingSyncFailedStandardWebhookEvent =
        customerAccountingSyncFailed.getOrThrow("customerAccountingSyncFailed")

    /** Issued when a customer accounting sync succeeds. */
    fun asCustomerAccountingSyncSucceeded(): CustomerAccountingSyncSucceededStandardWebhookEvent =
        customerAccountingSyncSucceeded.getOrThrow("customerAccountingSyncSucceeded")

    /** Issued when a customer balance transaction is created. */
    fun asCustomerBalanceTransactionCreated():
        CustomerBalanceTransactionCreatedStandardWebhookEvent =
        customerBalanceTransactionCreated.getOrThrow("customerBalanceTransactionCreated")

    /** Issued when a customer resource is created. */
    fun asCustomerCreated(): CustomerCreatedStandardWebhookEvent =
        customerCreated.getOrThrow("customerCreated")

    /** Issued when a customer's prepaid credits balance is depleted. */
    fun asCustomerCreditBalanceDepleted(): CustomerCreditBalanceDepletedStandardWebhookEvent =
        customerCreditBalanceDepleted.getOrThrow("customerCreditBalanceDepleted")

    /** Issued when a customer's prepaid credits balance is depleted to a configured threshold. */
    fun asCustomerCreditBalanceDropped(): CustomerCreditBalanceDroppedStandardWebhookEvent =
        customerCreditBalanceDropped.getOrThrow("customerCreditBalanceDropped")

    /** Issued when a customer's credit balance recovers from depleted. */
    fun asCustomerCreditBalanceRecovered(): CustomerCreditBalanceRecoveredStandardWebhookEvent =
        customerCreditBalanceRecovered.getOrThrow("customerCreditBalanceRecovered")

    /** Issued when a customer's credit ledger is incremented. */
    fun asCustomerCreditLedgerIncremented(): CustomerCreditLedgerIncrementedStandardWebhookEvent =
        customerCreditLedgerIncremented.getOrThrow("customerCreditLedgerIncremented")

    /** Issued when a customer is updated. */
    fun asCustomerEdited(): CustomerEditedStandardWebhookEvent =
        customerEdited.getOrThrow("customerEdited")

    /** Issued when a data export transfer fails. */
    fun asDataExportsTransferError(): DataExportsTransferErrorStandardWebhookEvent =
        dataExportsTransferError.getOrThrow("dataExportsTransferError")

    /** Issued when a data export transfer succeeds. */
    fun asDataExportsTransferSuccess(): DataExportsTransferSuccessStandardWebhookEvent =
        dataExportsTransferSuccess.getOrThrow("dataExportsTransferSuccess")

    /** Issued when an event does not match any customer. */
    fun asEventUnmatchedEvent(): EventUnmatchedEventStandardWebhookEvent =
        eventUnmatchedEvent.getOrThrow("eventUnmatchedEvent")

    /** Issued when ingestion events reference unmatched customer IDs. */
    fun asIngestionUnmatchedCustomerIds(): IngestionUnmatchedCustomerIdsStandardWebhookEvent =
        ingestionUnmatchedCustomerIds.getOrThrow("ingestionUnmatchedCustomerIds")

    /** Issued when an invoice accounting sync fails. */
    fun asInvoiceAccountingSyncFailed(): InvoiceAccountingSyncFailedStandardWebhookEvent =
        invoiceAccountingSyncFailed.getOrThrow("invoiceAccountingSyncFailed")

    /** Issued when an invoice accounting sync succeeds. */
    fun asInvoiceAccountingSyncSucceeded(): InvoiceAccountingSyncSucceededStandardWebhookEvent =
        invoiceAccountingSyncSucceeded.getOrThrow("invoiceAccountingSyncSucceeded")

    /** Issued when a collections-automation schedule step is executed for an invoice. */
    fun asInvoiceAutomationScheduleStepExecuted():
        InvoiceAutomationScheduleStepExecutedStandardWebhookEvent =
        invoiceAutomationScheduleStepExecuted.getOrThrow("invoiceAutomationScheduleStepExecuted")

    /** Issued when invoice cost data is exported. */
    fun asInvoiceCostDataExported(): InvoiceCostDataExportedStandardWebhookEvent =
        invoiceCostDataExported.getOrThrow("invoiceCostDataExported")

    /** Issued when a dunning schedule is created for an invoice. */
    fun asInvoiceDunningScheduleCreated(): InvoiceDunningScheduleCreatedStandardWebhookEvent =
        invoiceDunningScheduleCreated.getOrThrow("invoiceDunningScheduleCreated")

    /** Issued when a dunning schedule ends. */
    fun asInvoiceDunningScheduleEnded(): InvoiceDunningScheduleEndedStandardWebhookEvent =
        invoiceDunningScheduleEnded.getOrThrow("invoiceDunningScheduleEnded")

    /** Issued when a dunning schedule is reset. */
    fun asInvoiceDunningScheduleReset(): InvoiceDunningScheduleResetStandardWebhookEvent =
        invoiceDunningScheduleReset.getOrThrow("invoiceDunningScheduleReset")

    /** Issued when a dunning schedule step is executed. */
    fun asInvoiceDunningScheduleStepExecuted():
        InvoiceDunningScheduleStepExecutedStandardWebhookEvent =
        invoiceDunningScheduleStepExecuted.getOrThrow("invoiceDunningScheduleStepExecuted")

    /** Issued when a draft invoice has been edited. */
    fun asInvoiceEdited(): InvoiceEditedStandardWebhookEvent =
        invoiceEdited.getOrThrow("invoiceEdited")

    /** Issued when an invoice's invoice date has elapsed. */
    fun asInvoiceInvoiceDateElapsed(): InvoiceInvoiceDateElapsedStandardWebhookEvent =
        invoiceInvoiceDateElapsed.getOrThrow("invoiceInvoiceDateElapsed")

    /** Issued when an invoice issue attempt fails. */
    fun asInvoiceIssueFailed(): InvoiceIssueFailedStandardWebhookEvent =
        invoiceIssueFailed.getOrThrow("invoiceIssueFailed")

    /** Issued when an invoice transitions to the "issued" state. */
    fun asInvoiceIssued(): InvoiceIssuedStandardWebhookEvent =
        invoiceIssued.getOrThrow("invoiceIssued")

    /**
     * A lightweight variant of invoice.issued for accounts configured to receive a summarized
     * invoice payload.
     */
    fun asInvoiceIssuedSummary(): InvoiceIssuedSummaryStandardWebhookEvent =
        invoiceIssuedSummary.getOrThrow("invoiceIssuedSummary")

    /** Issued when an invoice is manually marked as paid. */
    fun asInvoiceManuallyMarkedAsPaid(): InvoiceManuallyMarkedAsPaidStandardWebhookEvent =
        invoiceManuallyMarkedAsPaid.getOrThrow("invoiceManuallyMarkedAsPaid")

    /** Issued when an invoice is marked as void. */
    fun asInvoiceManuallyMarkedAsVoid(): InvoiceManuallyMarkedAsVoidStandardWebhookEvent =
        invoiceManuallyMarkedAsVoid.getOrThrow("invoiceManuallyMarkedAsVoid")

    /**
     * Issued when automated payment collection for an invoice fails for a configured payment
     * gateway.
     */
    fun asInvoicePaymentFailed(): InvoicePaymentFailedStandardWebhookEvent =
        invoicePaymentFailed.getOrThrow("invoicePaymentFailed")

    /** Issued when an invoice payment is being processed. */
    fun asInvoicePaymentProcessing(): InvoicePaymentProcessingStandardWebhookEvent =
        invoicePaymentProcessing.getOrThrow("invoicePaymentProcessing")

    /**
     * Issued when automated payment collection for an invoice succeeds for a configured payment
     * gateway.
     */
    fun asInvoicePaymentSucceeded(): InvoicePaymentSucceededStandardWebhookEvent =
        invoicePaymentSucceeded.getOrThrow("invoicePaymentSucceeded")

    /** Issued when an invoice sync fails. */
    fun asInvoiceSyncFailed(): InvoiceSyncFailedStandardWebhookEvent =
        invoiceSyncFailed.getOrThrow("invoiceSyncFailed")

    /** Issued when an invoice sync succeeds. */
    fun asInvoiceSyncSucceeded(): InvoiceSyncSucceededStandardWebhookEvent =
        invoiceSyncSucceeded.getOrThrow("invoiceSyncSucceeded")

    /** Issued when an invoice is undone from marked as paid. */
    fun asInvoiceUndoMarkAsPaid(): InvoiceUndoMarkAsPaidStandardWebhookEvent =
        invoiceUndoMarkAsPaid.getOrThrow("invoiceUndoMarkAsPaid")

    /** Issued when an invoice due date recalculation is canceled. */
    fun asInvoiceDueDateRecalculationCanceled():
        InvoiceDueDateRecalculationCanceledStandardWebhookEvent =
        invoiceDueDateRecalculationCanceled.getOrThrow("invoiceDueDateRecalculationCanceled")

    /** Issued when an invoice due date recalculation is completed. */
    fun asInvoiceDueDateRecalculationCompleted():
        InvoiceDueDateRecalculationCompletedStandardWebhookEvent =
        invoiceDueDateRecalculationCompleted.getOrThrow("invoiceDueDateRecalculationCompleted")

    /** Issued when an invoice due date recalculation is started. */
    fun asInvoiceDueDateRecalculationStarted():
        InvoiceDueDateRecalculationStartedStandardWebhookEvent =
        invoiceDueDateRecalculationStarted.getOrThrow("invoiceDueDateRecalculationStarted")

    /** Issued when metric events are dropped by watermark threshold. */
    fun asMetricEventsDroppedByWatermark(): MetricEventsDroppedByWatermarkStandardWebhookEvent =
        metricEventsDroppedByWatermark.getOrThrow("metricEventsDroppedByWatermark")

    /** Issued when a payment method is created. */
    fun asPaymentMethodCreated(): PaymentMethodCreatedStandardWebhookEvent =
        paymentMethodCreated.getOrThrow("paymentMethodCreated")

    /** Issued when a payment method is deleted. */
    fun asPaymentMethodDeleted(): PaymentMethodDeletedStandardWebhookEvent =
        paymentMethodDeleted.getOrThrow("paymentMethodDeleted")

    /** Issued when a plan is created, or when a draft plan is published. */
    fun asPlanCreated(): PlanCreatedStandardWebhookEvent = planCreated.getOrThrow("planCreated")

    /** Issued when a plan's default version is set. */
    fun asPlanDefaultVersionSet(): PlanDefaultVersionSetStandardWebhookEvent =
        planDefaultVersionSet.getOrThrow("planDefaultVersionSet")

    /** Issued when a plan's name, description, external plan ID, metadata or status is edited. */
    fun asPlanEdited(): PlanEditedStandardWebhookEvent = planEdited.getOrThrow("planEdited")

    /** Issued when a new plan version is created. */
    fun asPlanVersionCreated(): PlanVersionCreatedStandardWebhookEvent =
        planVersionCreated.getOrThrow("planVersionCreated")

    /** Issued when a price is edited. */
    fun asPriceEdited(): PriceEditedStandardWebhookEvent = priceEdited.getOrThrow("priceEdited")

    /** Issued when a test webhook is sent. */
    fun asResourceEventTest(): ResourceEventTestStandardWebhookEvent =
        resourceEventTest.getOrThrow("resourceEventTest")

    /** Issued when a sales order accounting sync fails. */
    fun asSalesOrderAccountingSyncFailed(): SalesOrderAccountingSyncFailedStandardWebhookEvent =
        salesOrderAccountingSyncFailed.getOrThrow("salesOrderAccountingSyncFailed")

    /** Issued when a sales order accounting sync succeeds. */
    fun asSalesOrderAccountingSyncSucceeded():
        SalesOrderAccountingSyncSucceededStandardWebhookEvent =
        salesOrderAccountingSyncSucceeded.getOrThrow("salesOrderAccountingSyncSucceeded")

    /** Issued when a subscription accounting sync fails. */
    fun asSubscriptionAccountingSyncFailed(): SubscriptionAccountingSyncFailedStandardWebhookEvent =
        subscriptionAccountingSyncFailed.getOrThrow("subscriptionAccountingSyncFailed")

    /** Issued when a subscription accounting sync succeeds. */
    fun asSubscriptionAccountingSyncSucceeded():
        SubscriptionAccountingSyncSucceededStandardWebhookEvent =
        subscriptionAccountingSyncSucceeded.getOrThrow("subscriptionAccountingSyncSucceeded")

    /** Issued when an alert is automatically disabled by the system. */
    fun asSubscriptionAlertDisabled(): SubscriptionAlertDisabledStandardWebhookEvent =
        subscriptionAlertDisabled.getOrThrow("subscriptionAlertDisabled")

    /** Issued when a subscription cancellation is scheduled. */
    fun asSubscriptionCancellationScheduled():
        SubscriptionCancellationScheduledStandardWebhookEvent =
        subscriptionCancellationScheduled.getOrThrow("subscriptionCancellationScheduled")

    /** Issued when a scheduled subscription cancellation is unscheduled. */
    fun asSubscriptionCancellationUnscheduled():
        SubscriptionCancellationUnscheduledStandardWebhookEvent =
        subscriptionCancellationUnscheduled.getOrThrow("subscriptionCancellationUnscheduled")

    /** Issued when a subscription's cost exceeds a pre-configured amount threshold. */
    fun asSubscriptionCostExceeded(): SubscriptionCostExceededStandardWebhookEvent =
        subscriptionCostExceeded.getOrThrow("subscriptionCostExceeded")

    /** Issued when a subscription resource is created. */
    fun asSubscriptionCreated(): SubscriptionCreatedStandardWebhookEvent =
        subscriptionCreated.getOrThrow("subscriptionCreated")

    /** Issued when a subscription is updated. */
    fun asSubscriptionEdited(): SubscriptionEditedStandardWebhookEvent =
        subscriptionEdited.getOrThrow("subscriptionEdited")

    /** Issued whenever a customer's subscription ends/lapses. */
    fun asSubscriptionEnded(): SubscriptionEndedStandardWebhookEvent =
        subscriptionEnded.getOrThrow("subscriptionEnded")

    /** Issued when a subscription's fixed fee quantity is updated. */
    fun asSubscriptionFixedFeeQuantityUpdated():
        SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent =
        subscriptionFixedFeeQuantityUpdated.getOrThrow("subscriptionFixedFeeQuantityUpdated")

    /** Issued when grouped subscription costs exceed a pre-configured amount threshold. */
    fun asSubscriptionGroupedCostExceeded(): SubscriptionGroupedCostExceededStandardWebhookEvent =
        subscriptionGroupedCostExceeded.getOrThrow("subscriptionGroupedCostExceeded")

    /**
     * Issued when a subscription's invoicing threshold is exceeded and an evaluation is performed.
     */
    fun asSubscriptionInvoicingThresholdExceeded():
        SubscriptionInvoicingThresholdExceededStandardWebhookEvent =
        subscriptionInvoicingThresholdExceeded.getOrThrow("subscriptionInvoicingThresholdExceeded")

    /** Issued when a license allocation is reset. */
    fun asSubscriptionLicenseAllocationReset():
        SubscriptionLicenseAllocationResetStandardWebhookEvent =
        subscriptionLicenseAllocationReset.getOrThrow("subscriptionLicenseAllocationReset")

    /** Issued when a license balance threshold is reached. */
    fun asSubscriptionLicenseBalanceThresholdReached():
        SubscriptionLicenseBalanceThresholdReachedStandardWebhookEvent =
        subscriptionLicenseBalanceThresholdReached.getOrThrow(
            "subscriptionLicenseBalanceThresholdReached"
        )

    /** Issued when a subscription plan change is scheduled. */
    fun asSubscriptionPlanChangeScheduled(): SubscriptionPlanChangeScheduledStandardWebhookEvent =
        subscriptionPlanChangeScheduled.getOrThrow("subscriptionPlanChangeScheduled")

    /** Issued when a subscription transitions from one plan to a different plan. */
    fun asSubscriptionPlanChanged(): SubscriptionPlanChangedStandardWebhookEvent =
        subscriptionPlanChanged.getOrThrow("subscriptionPlanChanged")

    /** Issued when a subscription plan version change is scheduled. */
    fun asSubscriptionPlanVersionChangeScheduled():
        SubscriptionPlanVersionChangeScheduledStandardWebhookEvent =
        subscriptionPlanVersionChangeScheduled.getOrThrow("subscriptionPlanVersionChangeScheduled")

    /** Issued when a subscription plan version has changed. */
    fun asSubscriptionPlanVersionChanged(): SubscriptionPlanVersionChangedStandardWebhookEvent =
        subscriptionPlanVersionChanged.getOrThrow("subscriptionPlanVersionChanged")

    /**
     * Issued when a subscription's rated spend, before credits and adjustments, exceeds a
     * pre-configured amount threshold.
     */
    fun asSubscriptionSpendExceeded(): SubscriptionSpendExceededStandardWebhookEvent =
        subscriptionSpendExceeded.getOrThrow("subscriptionSpendExceeded")

    /** Issued when a subscription begins. */
    fun asSubscriptionStarted(): SubscriptionStartedStandardWebhookEvent =
        subscriptionStarted.getOrThrow("subscriptionStarted")

    /** Issued when a subscription trial ends. */
    fun asSubscriptionTrialEnded(): SubscriptionTrialEndedStandardWebhookEvent =
        subscriptionTrialEnded.getOrThrow("subscriptionTrialEnded")

    /**
     * Issued when a billable metric in a subscription exceeds a pre-configured quantity threshold.
     */
    fun asSubscriptionUsageExceeded(): SubscriptionUsageExceededStandardWebhookEvent =
        subscriptionUsageExceeded.getOrThrow("subscriptionUsageExceeded")

    /** Issued when a transaction accounting sync fails. */
    fun asTransactionAccountingSyncFailed(): TransactionAccountingSyncFailedStandardWebhookEvent =
        transactionAccountingSyncFailed.getOrThrow("transactionAccountingSyncFailed")

    /** Issued when a transaction accounting sync succeeds. */
    fun asTransactionAccountingSyncSucceeded():
        TransactionAccountingSyncSucceededStandardWebhookEvent =
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
     * val result: String? = unwrapStandardWebhookEvent.accept(object : UnwrapStandardWebhookEvent.Visitor<String?> {
     *     override fun visitBackfillReflected(backfillReflected: BackfillReflectedStandardWebhookEvent): String? = backfillReflected.toString()
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
            planCreated != null -> visitor.visitPlanCreated(planCreated)
            planDefaultVersionSet != null ->
                visitor.visitPlanDefaultVersionSet(planDefaultVersionSet)
            planEdited != null -> visitor.visitPlanEdited(planEdited)
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
    fun validate(): UnwrapStandardWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitBackfillReflected(
                    backfillReflected: BackfillReflectedStandardWebhookEvent
                ) {
                    backfillReflected.validate()
                }

                override fun visitBackfillReverted(
                    backfillReverted: BackfillRevertedStandardWebhookEvent
                ) {
                    backfillReverted.validate()
                }

                override fun visitBillableMetricEdited(
                    billableMetricEdited: BillableMetricEditedStandardWebhookEvent
                ) {
                    billableMetricEdited.validate()
                }

                override fun visitCreditBlockAccountingSyncFailed(
                    creditBlockAccountingSyncFailed:
                        CreditBlockAccountingSyncFailedStandardWebhookEvent
                ) {
                    creditBlockAccountingSyncFailed.validate()
                }

                override fun visitCreditBlockAccountingSyncSucceeded(
                    creditBlockAccountingSyncSucceeded:
                        CreditBlockAccountingSyncSucceededStandardWebhookEvent
                ) {
                    creditBlockAccountingSyncSucceeded.validate()
                }

                override fun visitCreditNoteAccountingSyncFailed(
                    creditNoteAccountingSyncFailed:
                        CreditNoteAccountingSyncFailedStandardWebhookEvent
                ) {
                    creditNoteAccountingSyncFailed.validate()
                }

                override fun visitCreditNoteAccountingSyncSucceeded(
                    creditNoteAccountingSyncSucceeded:
                        CreditNoteAccountingSyncSucceededStandardWebhookEvent
                ) {
                    creditNoteAccountingSyncSucceeded.validate()
                }

                override fun visitCreditNoteIssued(
                    creditNoteIssued: CreditNoteIssuedStandardWebhookEvent
                ) {
                    creditNoteIssued.validate()
                }

                override fun visitCreditNoteMarkedAsVoid(
                    creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidStandardWebhookEvent
                ) {
                    creditNoteMarkedAsVoid.validate()
                }

                override fun visitCustomerAccountingSyncFailed(
                    customerAccountingSyncFailed: CustomerAccountingSyncFailedStandardWebhookEvent
                ) {
                    customerAccountingSyncFailed.validate()
                }

                override fun visitCustomerAccountingSyncSucceeded(
                    customerAccountingSyncSucceeded:
                        CustomerAccountingSyncSucceededStandardWebhookEvent
                ) {
                    customerAccountingSyncSucceeded.validate()
                }

                override fun visitCustomerBalanceTransactionCreated(
                    customerBalanceTransactionCreated:
                        CustomerBalanceTransactionCreatedStandardWebhookEvent
                ) {
                    customerBalanceTransactionCreated.validate()
                }

                override fun visitCustomerCreated(
                    customerCreated: CustomerCreatedStandardWebhookEvent
                ) {
                    customerCreated.validate()
                }

                override fun visitCustomerCreditBalanceDepleted(
                    customerCreditBalanceDepleted: CustomerCreditBalanceDepletedStandardWebhookEvent
                ) {
                    customerCreditBalanceDepleted.validate()
                }

                override fun visitCustomerCreditBalanceDropped(
                    customerCreditBalanceDropped: CustomerCreditBalanceDroppedStandardWebhookEvent
                ) {
                    customerCreditBalanceDropped.validate()
                }

                override fun visitCustomerCreditBalanceRecovered(
                    customerCreditBalanceRecovered:
                        CustomerCreditBalanceRecoveredStandardWebhookEvent
                ) {
                    customerCreditBalanceRecovered.validate()
                }

                override fun visitCustomerCreditLedgerIncremented(
                    customerCreditLedgerIncremented:
                        CustomerCreditLedgerIncrementedStandardWebhookEvent
                ) {
                    customerCreditLedgerIncremented.validate()
                }

                override fun visitCustomerEdited(
                    customerEdited: CustomerEditedStandardWebhookEvent
                ) {
                    customerEdited.validate()
                }

                override fun visitDataExportsTransferError(
                    dataExportsTransferError: DataExportsTransferErrorStandardWebhookEvent
                ) {
                    dataExportsTransferError.validate()
                }

                override fun visitDataExportsTransferSuccess(
                    dataExportsTransferSuccess: DataExportsTransferSuccessStandardWebhookEvent
                ) {
                    dataExportsTransferSuccess.validate()
                }

                override fun visitEventUnmatchedEvent(
                    eventUnmatchedEvent: EventUnmatchedEventStandardWebhookEvent
                ) {
                    eventUnmatchedEvent.validate()
                }

                override fun visitIngestionUnmatchedCustomerIds(
                    ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsStandardWebhookEvent
                ) {
                    ingestionUnmatchedCustomerIds.validate()
                }

                override fun visitInvoiceAccountingSyncFailed(
                    invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedStandardWebhookEvent
                ) {
                    invoiceAccountingSyncFailed.validate()
                }

                override fun visitInvoiceAccountingSyncSucceeded(
                    invoiceAccountingSyncSucceeded:
                        InvoiceAccountingSyncSucceededStandardWebhookEvent
                ) {
                    invoiceAccountingSyncSucceeded.validate()
                }

                override fun visitInvoiceAutomationScheduleStepExecuted(
                    invoiceAutomationScheduleStepExecuted:
                        InvoiceAutomationScheduleStepExecutedStandardWebhookEvent
                ) {
                    invoiceAutomationScheduleStepExecuted.validate()
                }

                override fun visitInvoiceCostDataExported(
                    invoiceCostDataExported: InvoiceCostDataExportedStandardWebhookEvent
                ) {
                    invoiceCostDataExported.validate()
                }

                override fun visitInvoiceDunningScheduleCreated(
                    invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedStandardWebhookEvent
                ) {
                    invoiceDunningScheduleCreated.validate()
                }

                override fun visitInvoiceDunningScheduleEnded(
                    invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedStandardWebhookEvent
                ) {
                    invoiceDunningScheduleEnded.validate()
                }

                override fun visitInvoiceDunningScheduleReset(
                    invoiceDunningScheduleReset: InvoiceDunningScheduleResetStandardWebhookEvent
                ) {
                    invoiceDunningScheduleReset.validate()
                }

                override fun visitInvoiceDunningScheduleStepExecuted(
                    invoiceDunningScheduleStepExecuted:
                        InvoiceDunningScheduleStepExecutedStandardWebhookEvent
                ) {
                    invoiceDunningScheduleStepExecuted.validate()
                }

                override fun visitInvoiceEdited(invoiceEdited: InvoiceEditedStandardWebhookEvent) {
                    invoiceEdited.validate()
                }

                override fun visitInvoiceInvoiceDateElapsed(
                    invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedStandardWebhookEvent
                ) {
                    invoiceInvoiceDateElapsed.validate()
                }

                override fun visitInvoiceIssueFailed(
                    invoiceIssueFailed: InvoiceIssueFailedStandardWebhookEvent
                ) {
                    invoiceIssueFailed.validate()
                }

                override fun visitInvoiceIssued(invoiceIssued: InvoiceIssuedStandardWebhookEvent) {
                    invoiceIssued.validate()
                }

                override fun visitInvoiceIssuedSummary(
                    invoiceIssuedSummary: InvoiceIssuedSummaryStandardWebhookEvent
                ) {
                    invoiceIssuedSummary.validate()
                }

                override fun visitInvoiceManuallyMarkedAsPaid(
                    invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidStandardWebhookEvent
                ) {
                    invoiceManuallyMarkedAsPaid.validate()
                }

                override fun visitInvoiceManuallyMarkedAsVoid(
                    invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidStandardWebhookEvent
                ) {
                    invoiceManuallyMarkedAsVoid.validate()
                }

                override fun visitInvoicePaymentFailed(
                    invoicePaymentFailed: InvoicePaymentFailedStandardWebhookEvent
                ) {
                    invoicePaymentFailed.validate()
                }

                override fun visitInvoicePaymentProcessing(
                    invoicePaymentProcessing: InvoicePaymentProcessingStandardWebhookEvent
                ) {
                    invoicePaymentProcessing.validate()
                }

                override fun visitInvoicePaymentSucceeded(
                    invoicePaymentSucceeded: InvoicePaymentSucceededStandardWebhookEvent
                ) {
                    invoicePaymentSucceeded.validate()
                }

                override fun visitInvoiceSyncFailed(
                    invoiceSyncFailed: InvoiceSyncFailedStandardWebhookEvent
                ) {
                    invoiceSyncFailed.validate()
                }

                override fun visitInvoiceSyncSucceeded(
                    invoiceSyncSucceeded: InvoiceSyncSucceededStandardWebhookEvent
                ) {
                    invoiceSyncSucceeded.validate()
                }

                override fun visitInvoiceUndoMarkAsPaid(
                    invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidStandardWebhookEvent
                ) {
                    invoiceUndoMarkAsPaid.validate()
                }

                override fun visitInvoiceDueDateRecalculationCanceled(
                    invoiceDueDateRecalculationCanceled:
                        InvoiceDueDateRecalculationCanceledStandardWebhookEvent
                ) {
                    invoiceDueDateRecalculationCanceled.validate()
                }

                override fun visitInvoiceDueDateRecalculationCompleted(
                    invoiceDueDateRecalculationCompleted:
                        InvoiceDueDateRecalculationCompletedStandardWebhookEvent
                ) {
                    invoiceDueDateRecalculationCompleted.validate()
                }

                override fun visitInvoiceDueDateRecalculationStarted(
                    invoiceDueDateRecalculationStarted:
                        InvoiceDueDateRecalculationStartedStandardWebhookEvent
                ) {
                    invoiceDueDateRecalculationStarted.validate()
                }

                override fun visitMetricEventsDroppedByWatermark(
                    metricEventsDroppedByWatermark:
                        MetricEventsDroppedByWatermarkStandardWebhookEvent
                ) {
                    metricEventsDroppedByWatermark.validate()
                }

                override fun visitPaymentMethodCreated(
                    paymentMethodCreated: PaymentMethodCreatedStandardWebhookEvent
                ) {
                    paymentMethodCreated.validate()
                }

                override fun visitPaymentMethodDeleted(
                    paymentMethodDeleted: PaymentMethodDeletedStandardWebhookEvent
                ) {
                    paymentMethodDeleted.validate()
                }

                override fun visitPlanCreated(planCreated: PlanCreatedStandardWebhookEvent) {
                    planCreated.validate()
                }

                override fun visitPlanDefaultVersionSet(
                    planDefaultVersionSet: PlanDefaultVersionSetStandardWebhookEvent
                ) {
                    planDefaultVersionSet.validate()
                }

                override fun visitPlanEdited(planEdited: PlanEditedStandardWebhookEvent) {
                    planEdited.validate()
                }

                override fun visitPlanVersionCreated(
                    planVersionCreated: PlanVersionCreatedStandardWebhookEvent
                ) {
                    planVersionCreated.validate()
                }

                override fun visitPriceEdited(priceEdited: PriceEditedStandardWebhookEvent) {
                    priceEdited.validate()
                }

                override fun visitResourceEventTest(
                    resourceEventTest: ResourceEventTestStandardWebhookEvent
                ) {
                    resourceEventTest.validate()
                }

                override fun visitSalesOrderAccountingSyncFailed(
                    salesOrderAccountingSyncFailed:
                        SalesOrderAccountingSyncFailedStandardWebhookEvent
                ) {
                    salesOrderAccountingSyncFailed.validate()
                }

                override fun visitSalesOrderAccountingSyncSucceeded(
                    salesOrderAccountingSyncSucceeded:
                        SalesOrderAccountingSyncSucceededStandardWebhookEvent
                ) {
                    salesOrderAccountingSyncSucceeded.validate()
                }

                override fun visitSubscriptionAccountingSyncFailed(
                    subscriptionAccountingSyncFailed:
                        SubscriptionAccountingSyncFailedStandardWebhookEvent
                ) {
                    subscriptionAccountingSyncFailed.validate()
                }

                override fun visitSubscriptionAccountingSyncSucceeded(
                    subscriptionAccountingSyncSucceeded:
                        SubscriptionAccountingSyncSucceededStandardWebhookEvent
                ) {
                    subscriptionAccountingSyncSucceeded.validate()
                }

                override fun visitSubscriptionAlertDisabled(
                    subscriptionAlertDisabled: SubscriptionAlertDisabledStandardWebhookEvent
                ) {
                    subscriptionAlertDisabled.validate()
                }

                override fun visitSubscriptionCancellationScheduled(
                    subscriptionCancellationScheduled:
                        SubscriptionCancellationScheduledStandardWebhookEvent
                ) {
                    subscriptionCancellationScheduled.validate()
                }

                override fun visitSubscriptionCancellationUnscheduled(
                    subscriptionCancellationUnscheduled:
                        SubscriptionCancellationUnscheduledStandardWebhookEvent
                ) {
                    subscriptionCancellationUnscheduled.validate()
                }

                override fun visitSubscriptionCostExceeded(
                    subscriptionCostExceeded: SubscriptionCostExceededStandardWebhookEvent
                ) {
                    subscriptionCostExceeded.validate()
                }

                override fun visitSubscriptionCreated(
                    subscriptionCreated: SubscriptionCreatedStandardWebhookEvent
                ) {
                    subscriptionCreated.validate()
                }

                override fun visitSubscriptionEdited(
                    subscriptionEdited: SubscriptionEditedStandardWebhookEvent
                ) {
                    subscriptionEdited.validate()
                }

                override fun visitSubscriptionEnded(
                    subscriptionEnded: SubscriptionEndedStandardWebhookEvent
                ) {
                    subscriptionEnded.validate()
                }

                override fun visitSubscriptionFixedFeeQuantityUpdated(
                    subscriptionFixedFeeQuantityUpdated:
                        SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent
                ) {
                    subscriptionFixedFeeQuantityUpdated.validate()
                }

                override fun visitSubscriptionGroupedCostExceeded(
                    subscriptionGroupedCostExceeded:
                        SubscriptionGroupedCostExceededStandardWebhookEvent
                ) {
                    subscriptionGroupedCostExceeded.validate()
                }

                override fun visitSubscriptionInvoicingThresholdExceeded(
                    subscriptionInvoicingThresholdExceeded:
                        SubscriptionInvoicingThresholdExceededStandardWebhookEvent
                ) {
                    subscriptionInvoicingThresholdExceeded.validate()
                }

                override fun visitSubscriptionLicenseAllocationReset(
                    subscriptionLicenseAllocationReset:
                        SubscriptionLicenseAllocationResetStandardWebhookEvent
                ) {
                    subscriptionLicenseAllocationReset.validate()
                }

                override fun visitSubscriptionLicenseBalanceThresholdReached(
                    subscriptionLicenseBalanceThresholdReached:
                        SubscriptionLicenseBalanceThresholdReachedStandardWebhookEvent
                ) {
                    subscriptionLicenseBalanceThresholdReached.validate()
                }

                override fun visitSubscriptionPlanChangeScheduled(
                    subscriptionPlanChangeScheduled:
                        SubscriptionPlanChangeScheduledStandardWebhookEvent
                ) {
                    subscriptionPlanChangeScheduled.validate()
                }

                override fun visitSubscriptionPlanChanged(
                    subscriptionPlanChanged: SubscriptionPlanChangedStandardWebhookEvent
                ) {
                    subscriptionPlanChanged.validate()
                }

                override fun visitSubscriptionPlanVersionChangeScheduled(
                    subscriptionPlanVersionChangeScheduled:
                        SubscriptionPlanVersionChangeScheduledStandardWebhookEvent
                ) {
                    subscriptionPlanVersionChangeScheduled.validate()
                }

                override fun visitSubscriptionPlanVersionChanged(
                    subscriptionPlanVersionChanged:
                        SubscriptionPlanVersionChangedStandardWebhookEvent
                ) {
                    subscriptionPlanVersionChanged.validate()
                }

                override fun visitSubscriptionSpendExceeded(
                    subscriptionSpendExceeded: SubscriptionSpendExceededStandardWebhookEvent
                ) {
                    subscriptionSpendExceeded.validate()
                }

                override fun visitSubscriptionStarted(
                    subscriptionStarted: SubscriptionStartedStandardWebhookEvent
                ) {
                    subscriptionStarted.validate()
                }

                override fun visitSubscriptionTrialEnded(
                    subscriptionTrialEnded: SubscriptionTrialEndedStandardWebhookEvent
                ) {
                    subscriptionTrialEnded.validate()
                }

                override fun visitSubscriptionUsageExceeded(
                    subscriptionUsageExceeded: SubscriptionUsageExceededStandardWebhookEvent
                ) {
                    subscriptionUsageExceeded.validate()
                }

                override fun visitTransactionAccountingSyncFailed(
                    transactionAccountingSyncFailed:
                        TransactionAccountingSyncFailedStandardWebhookEvent
                ) {
                    transactionAccountingSyncFailed.validate()
                }

                override fun visitTransactionAccountingSyncSucceeded(
                    transactionAccountingSyncSucceeded:
                        TransactionAccountingSyncSucceededStandardWebhookEvent
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
                    backfillReflected: BackfillReflectedStandardWebhookEvent
                ) = backfillReflected.validity()

                override fun visitBackfillReverted(
                    backfillReverted: BackfillRevertedStandardWebhookEvent
                ) = backfillReverted.validity()

                override fun visitBillableMetricEdited(
                    billableMetricEdited: BillableMetricEditedStandardWebhookEvent
                ) = billableMetricEdited.validity()

                override fun visitCreditBlockAccountingSyncFailed(
                    creditBlockAccountingSyncFailed:
                        CreditBlockAccountingSyncFailedStandardWebhookEvent
                ) = creditBlockAccountingSyncFailed.validity()

                override fun visitCreditBlockAccountingSyncSucceeded(
                    creditBlockAccountingSyncSucceeded:
                        CreditBlockAccountingSyncSucceededStandardWebhookEvent
                ) = creditBlockAccountingSyncSucceeded.validity()

                override fun visitCreditNoteAccountingSyncFailed(
                    creditNoteAccountingSyncFailed:
                        CreditNoteAccountingSyncFailedStandardWebhookEvent
                ) = creditNoteAccountingSyncFailed.validity()

                override fun visitCreditNoteAccountingSyncSucceeded(
                    creditNoteAccountingSyncSucceeded:
                        CreditNoteAccountingSyncSucceededStandardWebhookEvent
                ) = creditNoteAccountingSyncSucceeded.validity()

                override fun visitCreditNoteIssued(
                    creditNoteIssued: CreditNoteIssuedStandardWebhookEvent
                ) = creditNoteIssued.validity()

                override fun visitCreditNoteMarkedAsVoid(
                    creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidStandardWebhookEvent
                ) = creditNoteMarkedAsVoid.validity()

                override fun visitCustomerAccountingSyncFailed(
                    customerAccountingSyncFailed: CustomerAccountingSyncFailedStandardWebhookEvent
                ) = customerAccountingSyncFailed.validity()

                override fun visitCustomerAccountingSyncSucceeded(
                    customerAccountingSyncSucceeded:
                        CustomerAccountingSyncSucceededStandardWebhookEvent
                ) = customerAccountingSyncSucceeded.validity()

                override fun visitCustomerBalanceTransactionCreated(
                    customerBalanceTransactionCreated:
                        CustomerBalanceTransactionCreatedStandardWebhookEvent
                ) = customerBalanceTransactionCreated.validity()

                override fun visitCustomerCreated(
                    customerCreated: CustomerCreatedStandardWebhookEvent
                ) = customerCreated.validity()

                override fun visitCustomerCreditBalanceDepleted(
                    customerCreditBalanceDepleted: CustomerCreditBalanceDepletedStandardWebhookEvent
                ) = customerCreditBalanceDepleted.validity()

                override fun visitCustomerCreditBalanceDropped(
                    customerCreditBalanceDropped: CustomerCreditBalanceDroppedStandardWebhookEvent
                ) = customerCreditBalanceDropped.validity()

                override fun visitCustomerCreditBalanceRecovered(
                    customerCreditBalanceRecovered:
                        CustomerCreditBalanceRecoveredStandardWebhookEvent
                ) = customerCreditBalanceRecovered.validity()

                override fun visitCustomerCreditLedgerIncremented(
                    customerCreditLedgerIncremented:
                        CustomerCreditLedgerIncrementedStandardWebhookEvent
                ) = customerCreditLedgerIncremented.validity()

                override fun visitCustomerEdited(
                    customerEdited: CustomerEditedStandardWebhookEvent
                ) = customerEdited.validity()

                override fun visitDataExportsTransferError(
                    dataExportsTransferError: DataExportsTransferErrorStandardWebhookEvent
                ) = dataExportsTransferError.validity()

                override fun visitDataExportsTransferSuccess(
                    dataExportsTransferSuccess: DataExportsTransferSuccessStandardWebhookEvent
                ) = dataExportsTransferSuccess.validity()

                override fun visitEventUnmatchedEvent(
                    eventUnmatchedEvent: EventUnmatchedEventStandardWebhookEvent
                ) = eventUnmatchedEvent.validity()

                override fun visitIngestionUnmatchedCustomerIds(
                    ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsStandardWebhookEvent
                ) = ingestionUnmatchedCustomerIds.validity()

                override fun visitInvoiceAccountingSyncFailed(
                    invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedStandardWebhookEvent
                ) = invoiceAccountingSyncFailed.validity()

                override fun visitInvoiceAccountingSyncSucceeded(
                    invoiceAccountingSyncSucceeded:
                        InvoiceAccountingSyncSucceededStandardWebhookEvent
                ) = invoiceAccountingSyncSucceeded.validity()

                override fun visitInvoiceAutomationScheduleStepExecuted(
                    invoiceAutomationScheduleStepExecuted:
                        InvoiceAutomationScheduleStepExecutedStandardWebhookEvent
                ) = invoiceAutomationScheduleStepExecuted.validity()

                override fun visitInvoiceCostDataExported(
                    invoiceCostDataExported: InvoiceCostDataExportedStandardWebhookEvent
                ) = invoiceCostDataExported.validity()

                override fun visitInvoiceDunningScheduleCreated(
                    invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedStandardWebhookEvent
                ) = invoiceDunningScheduleCreated.validity()

                override fun visitInvoiceDunningScheduleEnded(
                    invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedStandardWebhookEvent
                ) = invoiceDunningScheduleEnded.validity()

                override fun visitInvoiceDunningScheduleReset(
                    invoiceDunningScheduleReset: InvoiceDunningScheduleResetStandardWebhookEvent
                ) = invoiceDunningScheduleReset.validity()

                override fun visitInvoiceDunningScheduleStepExecuted(
                    invoiceDunningScheduleStepExecuted:
                        InvoiceDunningScheduleStepExecutedStandardWebhookEvent
                ) = invoiceDunningScheduleStepExecuted.validity()

                override fun visitInvoiceEdited(invoiceEdited: InvoiceEditedStandardWebhookEvent) =
                    invoiceEdited.validity()

                override fun visitInvoiceInvoiceDateElapsed(
                    invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedStandardWebhookEvent
                ) = invoiceInvoiceDateElapsed.validity()

                override fun visitInvoiceIssueFailed(
                    invoiceIssueFailed: InvoiceIssueFailedStandardWebhookEvent
                ) = invoiceIssueFailed.validity()

                override fun visitInvoiceIssued(invoiceIssued: InvoiceIssuedStandardWebhookEvent) =
                    invoiceIssued.validity()

                override fun visitInvoiceIssuedSummary(
                    invoiceIssuedSummary: InvoiceIssuedSummaryStandardWebhookEvent
                ) = invoiceIssuedSummary.validity()

                override fun visitInvoiceManuallyMarkedAsPaid(
                    invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidStandardWebhookEvent
                ) = invoiceManuallyMarkedAsPaid.validity()

                override fun visitInvoiceManuallyMarkedAsVoid(
                    invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidStandardWebhookEvent
                ) = invoiceManuallyMarkedAsVoid.validity()

                override fun visitInvoicePaymentFailed(
                    invoicePaymentFailed: InvoicePaymentFailedStandardWebhookEvent
                ) = invoicePaymentFailed.validity()

                override fun visitInvoicePaymentProcessing(
                    invoicePaymentProcessing: InvoicePaymentProcessingStandardWebhookEvent
                ) = invoicePaymentProcessing.validity()

                override fun visitInvoicePaymentSucceeded(
                    invoicePaymentSucceeded: InvoicePaymentSucceededStandardWebhookEvent
                ) = invoicePaymentSucceeded.validity()

                override fun visitInvoiceSyncFailed(
                    invoiceSyncFailed: InvoiceSyncFailedStandardWebhookEvent
                ) = invoiceSyncFailed.validity()

                override fun visitInvoiceSyncSucceeded(
                    invoiceSyncSucceeded: InvoiceSyncSucceededStandardWebhookEvent
                ) = invoiceSyncSucceeded.validity()

                override fun visitInvoiceUndoMarkAsPaid(
                    invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidStandardWebhookEvent
                ) = invoiceUndoMarkAsPaid.validity()

                override fun visitInvoiceDueDateRecalculationCanceled(
                    invoiceDueDateRecalculationCanceled:
                        InvoiceDueDateRecalculationCanceledStandardWebhookEvent
                ) = invoiceDueDateRecalculationCanceled.validity()

                override fun visitInvoiceDueDateRecalculationCompleted(
                    invoiceDueDateRecalculationCompleted:
                        InvoiceDueDateRecalculationCompletedStandardWebhookEvent
                ) = invoiceDueDateRecalculationCompleted.validity()

                override fun visitInvoiceDueDateRecalculationStarted(
                    invoiceDueDateRecalculationStarted:
                        InvoiceDueDateRecalculationStartedStandardWebhookEvent
                ) = invoiceDueDateRecalculationStarted.validity()

                override fun visitMetricEventsDroppedByWatermark(
                    metricEventsDroppedByWatermark:
                        MetricEventsDroppedByWatermarkStandardWebhookEvent
                ) = metricEventsDroppedByWatermark.validity()

                override fun visitPaymentMethodCreated(
                    paymentMethodCreated: PaymentMethodCreatedStandardWebhookEvent
                ) = paymentMethodCreated.validity()

                override fun visitPaymentMethodDeleted(
                    paymentMethodDeleted: PaymentMethodDeletedStandardWebhookEvent
                ) = paymentMethodDeleted.validity()

                override fun visitPlanCreated(planCreated: PlanCreatedStandardWebhookEvent) =
                    planCreated.validity()

                override fun visitPlanDefaultVersionSet(
                    planDefaultVersionSet: PlanDefaultVersionSetStandardWebhookEvent
                ) = planDefaultVersionSet.validity()

                override fun visitPlanEdited(planEdited: PlanEditedStandardWebhookEvent) =
                    planEdited.validity()

                override fun visitPlanVersionCreated(
                    planVersionCreated: PlanVersionCreatedStandardWebhookEvent
                ) = planVersionCreated.validity()

                override fun visitPriceEdited(priceEdited: PriceEditedStandardWebhookEvent) =
                    priceEdited.validity()

                override fun visitResourceEventTest(
                    resourceEventTest: ResourceEventTestStandardWebhookEvent
                ) = resourceEventTest.validity()

                override fun visitSalesOrderAccountingSyncFailed(
                    salesOrderAccountingSyncFailed:
                        SalesOrderAccountingSyncFailedStandardWebhookEvent
                ) = salesOrderAccountingSyncFailed.validity()

                override fun visitSalesOrderAccountingSyncSucceeded(
                    salesOrderAccountingSyncSucceeded:
                        SalesOrderAccountingSyncSucceededStandardWebhookEvent
                ) = salesOrderAccountingSyncSucceeded.validity()

                override fun visitSubscriptionAccountingSyncFailed(
                    subscriptionAccountingSyncFailed:
                        SubscriptionAccountingSyncFailedStandardWebhookEvent
                ) = subscriptionAccountingSyncFailed.validity()

                override fun visitSubscriptionAccountingSyncSucceeded(
                    subscriptionAccountingSyncSucceeded:
                        SubscriptionAccountingSyncSucceededStandardWebhookEvent
                ) = subscriptionAccountingSyncSucceeded.validity()

                override fun visitSubscriptionAlertDisabled(
                    subscriptionAlertDisabled: SubscriptionAlertDisabledStandardWebhookEvent
                ) = subscriptionAlertDisabled.validity()

                override fun visitSubscriptionCancellationScheduled(
                    subscriptionCancellationScheduled:
                        SubscriptionCancellationScheduledStandardWebhookEvent
                ) = subscriptionCancellationScheduled.validity()

                override fun visitSubscriptionCancellationUnscheduled(
                    subscriptionCancellationUnscheduled:
                        SubscriptionCancellationUnscheduledStandardWebhookEvent
                ) = subscriptionCancellationUnscheduled.validity()

                override fun visitSubscriptionCostExceeded(
                    subscriptionCostExceeded: SubscriptionCostExceededStandardWebhookEvent
                ) = subscriptionCostExceeded.validity()

                override fun visitSubscriptionCreated(
                    subscriptionCreated: SubscriptionCreatedStandardWebhookEvent
                ) = subscriptionCreated.validity()

                override fun visitSubscriptionEdited(
                    subscriptionEdited: SubscriptionEditedStandardWebhookEvent
                ) = subscriptionEdited.validity()

                override fun visitSubscriptionEnded(
                    subscriptionEnded: SubscriptionEndedStandardWebhookEvent
                ) = subscriptionEnded.validity()

                override fun visitSubscriptionFixedFeeQuantityUpdated(
                    subscriptionFixedFeeQuantityUpdated:
                        SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent
                ) = subscriptionFixedFeeQuantityUpdated.validity()

                override fun visitSubscriptionGroupedCostExceeded(
                    subscriptionGroupedCostExceeded:
                        SubscriptionGroupedCostExceededStandardWebhookEvent
                ) = subscriptionGroupedCostExceeded.validity()

                override fun visitSubscriptionInvoicingThresholdExceeded(
                    subscriptionInvoicingThresholdExceeded:
                        SubscriptionInvoicingThresholdExceededStandardWebhookEvent
                ) = subscriptionInvoicingThresholdExceeded.validity()

                override fun visitSubscriptionLicenseAllocationReset(
                    subscriptionLicenseAllocationReset:
                        SubscriptionLicenseAllocationResetStandardWebhookEvent
                ) = subscriptionLicenseAllocationReset.validity()

                override fun visitSubscriptionLicenseBalanceThresholdReached(
                    subscriptionLicenseBalanceThresholdReached:
                        SubscriptionLicenseBalanceThresholdReachedStandardWebhookEvent
                ) = subscriptionLicenseBalanceThresholdReached.validity()

                override fun visitSubscriptionPlanChangeScheduled(
                    subscriptionPlanChangeScheduled:
                        SubscriptionPlanChangeScheduledStandardWebhookEvent
                ) = subscriptionPlanChangeScheduled.validity()

                override fun visitSubscriptionPlanChanged(
                    subscriptionPlanChanged: SubscriptionPlanChangedStandardWebhookEvent
                ) = subscriptionPlanChanged.validity()

                override fun visitSubscriptionPlanVersionChangeScheduled(
                    subscriptionPlanVersionChangeScheduled:
                        SubscriptionPlanVersionChangeScheduledStandardWebhookEvent
                ) = subscriptionPlanVersionChangeScheduled.validity()

                override fun visitSubscriptionPlanVersionChanged(
                    subscriptionPlanVersionChanged:
                        SubscriptionPlanVersionChangedStandardWebhookEvent
                ) = subscriptionPlanVersionChanged.validity()

                override fun visitSubscriptionSpendExceeded(
                    subscriptionSpendExceeded: SubscriptionSpendExceededStandardWebhookEvent
                ) = subscriptionSpendExceeded.validity()

                override fun visitSubscriptionStarted(
                    subscriptionStarted: SubscriptionStartedStandardWebhookEvent
                ) = subscriptionStarted.validity()

                override fun visitSubscriptionTrialEnded(
                    subscriptionTrialEnded: SubscriptionTrialEndedStandardWebhookEvent
                ) = subscriptionTrialEnded.validity()

                override fun visitSubscriptionUsageExceeded(
                    subscriptionUsageExceeded: SubscriptionUsageExceededStandardWebhookEvent
                ) = subscriptionUsageExceeded.validity()

                override fun visitTransactionAccountingSyncFailed(
                    transactionAccountingSyncFailed:
                        TransactionAccountingSyncFailedStandardWebhookEvent
                ) = transactionAccountingSyncFailed.validity()

                override fun visitTransactionAccountingSyncSucceeded(
                    transactionAccountingSyncSucceeded:
                        TransactionAccountingSyncSucceededStandardWebhookEvent
                ) = transactionAccountingSyncSucceeded.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnwrapStandardWebhookEvent &&
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
            planCreated == other.planCreated &&
            planDefaultVersionSet == other.planDefaultVersionSet &&
            planEdited == other.planEdited &&
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
            planCreated,
            planDefaultVersionSet,
            planEdited,
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
            backfillReflected != null ->
                "UnwrapStandardWebhookEvent{backfillReflected=$backfillReflected}"
            backfillReverted != null ->
                "UnwrapStandardWebhookEvent{backfillReverted=$backfillReverted}"
            billableMetricEdited != null ->
                "UnwrapStandardWebhookEvent{billableMetricEdited=$billableMetricEdited}"
            creditBlockAccountingSyncFailed != null ->
                "UnwrapStandardWebhookEvent{creditBlockAccountingSyncFailed=$creditBlockAccountingSyncFailed}"
            creditBlockAccountingSyncSucceeded != null ->
                "UnwrapStandardWebhookEvent{creditBlockAccountingSyncSucceeded=$creditBlockAccountingSyncSucceeded}"
            creditNoteAccountingSyncFailed != null ->
                "UnwrapStandardWebhookEvent{creditNoteAccountingSyncFailed=$creditNoteAccountingSyncFailed}"
            creditNoteAccountingSyncSucceeded != null ->
                "UnwrapStandardWebhookEvent{creditNoteAccountingSyncSucceeded=$creditNoteAccountingSyncSucceeded}"
            creditNoteIssued != null ->
                "UnwrapStandardWebhookEvent{creditNoteIssued=$creditNoteIssued}"
            creditNoteMarkedAsVoid != null ->
                "UnwrapStandardWebhookEvent{creditNoteMarkedAsVoid=$creditNoteMarkedAsVoid}"
            customerAccountingSyncFailed != null ->
                "UnwrapStandardWebhookEvent{customerAccountingSyncFailed=$customerAccountingSyncFailed}"
            customerAccountingSyncSucceeded != null ->
                "UnwrapStandardWebhookEvent{customerAccountingSyncSucceeded=$customerAccountingSyncSucceeded}"
            customerBalanceTransactionCreated != null ->
                "UnwrapStandardWebhookEvent{customerBalanceTransactionCreated=$customerBalanceTransactionCreated}"
            customerCreated != null ->
                "UnwrapStandardWebhookEvent{customerCreated=$customerCreated}"
            customerCreditBalanceDepleted != null ->
                "UnwrapStandardWebhookEvent{customerCreditBalanceDepleted=$customerCreditBalanceDepleted}"
            customerCreditBalanceDropped != null ->
                "UnwrapStandardWebhookEvent{customerCreditBalanceDropped=$customerCreditBalanceDropped}"
            customerCreditBalanceRecovered != null ->
                "UnwrapStandardWebhookEvent{customerCreditBalanceRecovered=$customerCreditBalanceRecovered}"
            customerCreditLedgerIncremented != null ->
                "UnwrapStandardWebhookEvent{customerCreditLedgerIncremented=$customerCreditLedgerIncremented}"
            customerEdited != null -> "UnwrapStandardWebhookEvent{customerEdited=$customerEdited}"
            dataExportsTransferError != null ->
                "UnwrapStandardWebhookEvent{dataExportsTransferError=$dataExportsTransferError}"
            dataExportsTransferSuccess != null ->
                "UnwrapStandardWebhookEvent{dataExportsTransferSuccess=$dataExportsTransferSuccess}"
            eventUnmatchedEvent != null ->
                "UnwrapStandardWebhookEvent{eventUnmatchedEvent=$eventUnmatchedEvent}"
            ingestionUnmatchedCustomerIds != null ->
                "UnwrapStandardWebhookEvent{ingestionUnmatchedCustomerIds=$ingestionUnmatchedCustomerIds}"
            invoiceAccountingSyncFailed != null ->
                "UnwrapStandardWebhookEvent{invoiceAccountingSyncFailed=$invoiceAccountingSyncFailed}"
            invoiceAccountingSyncSucceeded != null ->
                "UnwrapStandardWebhookEvent{invoiceAccountingSyncSucceeded=$invoiceAccountingSyncSucceeded}"
            invoiceAutomationScheduleStepExecuted != null ->
                "UnwrapStandardWebhookEvent{invoiceAutomationScheduleStepExecuted=$invoiceAutomationScheduleStepExecuted}"
            invoiceCostDataExported != null ->
                "UnwrapStandardWebhookEvent{invoiceCostDataExported=$invoiceCostDataExported}"
            invoiceDunningScheduleCreated != null ->
                "UnwrapStandardWebhookEvent{invoiceDunningScheduleCreated=$invoiceDunningScheduleCreated}"
            invoiceDunningScheduleEnded != null ->
                "UnwrapStandardWebhookEvent{invoiceDunningScheduleEnded=$invoiceDunningScheduleEnded}"
            invoiceDunningScheduleReset != null ->
                "UnwrapStandardWebhookEvent{invoiceDunningScheduleReset=$invoiceDunningScheduleReset}"
            invoiceDunningScheduleStepExecuted != null ->
                "UnwrapStandardWebhookEvent{invoiceDunningScheduleStepExecuted=$invoiceDunningScheduleStepExecuted}"
            invoiceEdited != null -> "UnwrapStandardWebhookEvent{invoiceEdited=$invoiceEdited}"
            invoiceInvoiceDateElapsed != null ->
                "UnwrapStandardWebhookEvent{invoiceInvoiceDateElapsed=$invoiceInvoiceDateElapsed}"
            invoiceIssueFailed != null ->
                "UnwrapStandardWebhookEvent{invoiceIssueFailed=$invoiceIssueFailed}"
            invoiceIssued != null -> "UnwrapStandardWebhookEvent{invoiceIssued=$invoiceIssued}"
            invoiceIssuedSummary != null ->
                "UnwrapStandardWebhookEvent{invoiceIssuedSummary=$invoiceIssuedSummary}"
            invoiceManuallyMarkedAsPaid != null ->
                "UnwrapStandardWebhookEvent{invoiceManuallyMarkedAsPaid=$invoiceManuallyMarkedAsPaid}"
            invoiceManuallyMarkedAsVoid != null ->
                "UnwrapStandardWebhookEvent{invoiceManuallyMarkedAsVoid=$invoiceManuallyMarkedAsVoid}"
            invoicePaymentFailed != null ->
                "UnwrapStandardWebhookEvent{invoicePaymentFailed=$invoicePaymentFailed}"
            invoicePaymentProcessing != null ->
                "UnwrapStandardWebhookEvent{invoicePaymentProcessing=$invoicePaymentProcessing}"
            invoicePaymentSucceeded != null ->
                "UnwrapStandardWebhookEvent{invoicePaymentSucceeded=$invoicePaymentSucceeded}"
            invoiceSyncFailed != null ->
                "UnwrapStandardWebhookEvent{invoiceSyncFailed=$invoiceSyncFailed}"
            invoiceSyncSucceeded != null ->
                "UnwrapStandardWebhookEvent{invoiceSyncSucceeded=$invoiceSyncSucceeded}"
            invoiceUndoMarkAsPaid != null ->
                "UnwrapStandardWebhookEvent{invoiceUndoMarkAsPaid=$invoiceUndoMarkAsPaid}"
            invoiceDueDateRecalculationCanceled != null ->
                "UnwrapStandardWebhookEvent{invoiceDueDateRecalculationCanceled=$invoiceDueDateRecalculationCanceled}"
            invoiceDueDateRecalculationCompleted != null ->
                "UnwrapStandardWebhookEvent{invoiceDueDateRecalculationCompleted=$invoiceDueDateRecalculationCompleted}"
            invoiceDueDateRecalculationStarted != null ->
                "UnwrapStandardWebhookEvent{invoiceDueDateRecalculationStarted=$invoiceDueDateRecalculationStarted}"
            metricEventsDroppedByWatermark != null ->
                "UnwrapStandardWebhookEvent{metricEventsDroppedByWatermark=$metricEventsDroppedByWatermark}"
            paymentMethodCreated != null ->
                "UnwrapStandardWebhookEvent{paymentMethodCreated=$paymentMethodCreated}"
            paymentMethodDeleted != null ->
                "UnwrapStandardWebhookEvent{paymentMethodDeleted=$paymentMethodDeleted}"
            planCreated != null -> "UnwrapStandardWebhookEvent{planCreated=$planCreated}"
            planDefaultVersionSet != null ->
                "UnwrapStandardWebhookEvent{planDefaultVersionSet=$planDefaultVersionSet}"
            planEdited != null -> "UnwrapStandardWebhookEvent{planEdited=$planEdited}"
            planVersionCreated != null ->
                "UnwrapStandardWebhookEvent{planVersionCreated=$planVersionCreated}"
            priceEdited != null -> "UnwrapStandardWebhookEvent{priceEdited=$priceEdited}"
            resourceEventTest != null ->
                "UnwrapStandardWebhookEvent{resourceEventTest=$resourceEventTest}"
            salesOrderAccountingSyncFailed != null ->
                "UnwrapStandardWebhookEvent{salesOrderAccountingSyncFailed=$salesOrderAccountingSyncFailed}"
            salesOrderAccountingSyncSucceeded != null ->
                "UnwrapStandardWebhookEvent{salesOrderAccountingSyncSucceeded=$salesOrderAccountingSyncSucceeded}"
            subscriptionAccountingSyncFailed != null ->
                "UnwrapStandardWebhookEvent{subscriptionAccountingSyncFailed=$subscriptionAccountingSyncFailed}"
            subscriptionAccountingSyncSucceeded != null ->
                "UnwrapStandardWebhookEvent{subscriptionAccountingSyncSucceeded=$subscriptionAccountingSyncSucceeded}"
            subscriptionAlertDisabled != null ->
                "UnwrapStandardWebhookEvent{subscriptionAlertDisabled=$subscriptionAlertDisabled}"
            subscriptionCancellationScheduled != null ->
                "UnwrapStandardWebhookEvent{subscriptionCancellationScheduled=$subscriptionCancellationScheduled}"
            subscriptionCancellationUnscheduled != null ->
                "UnwrapStandardWebhookEvent{subscriptionCancellationUnscheduled=$subscriptionCancellationUnscheduled}"
            subscriptionCostExceeded != null ->
                "UnwrapStandardWebhookEvent{subscriptionCostExceeded=$subscriptionCostExceeded}"
            subscriptionCreated != null ->
                "UnwrapStandardWebhookEvent{subscriptionCreated=$subscriptionCreated}"
            subscriptionEdited != null ->
                "UnwrapStandardWebhookEvent{subscriptionEdited=$subscriptionEdited}"
            subscriptionEnded != null ->
                "UnwrapStandardWebhookEvent{subscriptionEnded=$subscriptionEnded}"
            subscriptionFixedFeeQuantityUpdated != null ->
                "UnwrapStandardWebhookEvent{subscriptionFixedFeeQuantityUpdated=$subscriptionFixedFeeQuantityUpdated}"
            subscriptionGroupedCostExceeded != null ->
                "UnwrapStandardWebhookEvent{subscriptionGroupedCostExceeded=$subscriptionGroupedCostExceeded}"
            subscriptionInvoicingThresholdExceeded != null ->
                "UnwrapStandardWebhookEvent{subscriptionInvoicingThresholdExceeded=$subscriptionInvoicingThresholdExceeded}"
            subscriptionLicenseAllocationReset != null ->
                "UnwrapStandardWebhookEvent{subscriptionLicenseAllocationReset=$subscriptionLicenseAllocationReset}"
            subscriptionLicenseBalanceThresholdReached != null ->
                "UnwrapStandardWebhookEvent{subscriptionLicenseBalanceThresholdReached=$subscriptionLicenseBalanceThresholdReached}"
            subscriptionPlanChangeScheduled != null ->
                "UnwrapStandardWebhookEvent{subscriptionPlanChangeScheduled=$subscriptionPlanChangeScheduled}"
            subscriptionPlanChanged != null ->
                "UnwrapStandardWebhookEvent{subscriptionPlanChanged=$subscriptionPlanChanged}"
            subscriptionPlanVersionChangeScheduled != null ->
                "UnwrapStandardWebhookEvent{subscriptionPlanVersionChangeScheduled=$subscriptionPlanVersionChangeScheduled}"
            subscriptionPlanVersionChanged != null ->
                "UnwrapStandardWebhookEvent{subscriptionPlanVersionChanged=$subscriptionPlanVersionChanged}"
            subscriptionSpendExceeded != null ->
                "UnwrapStandardWebhookEvent{subscriptionSpendExceeded=$subscriptionSpendExceeded}"
            subscriptionStarted != null ->
                "UnwrapStandardWebhookEvent{subscriptionStarted=$subscriptionStarted}"
            subscriptionTrialEnded != null ->
                "UnwrapStandardWebhookEvent{subscriptionTrialEnded=$subscriptionTrialEnded}"
            subscriptionUsageExceeded != null ->
                "UnwrapStandardWebhookEvent{subscriptionUsageExceeded=$subscriptionUsageExceeded}"
            transactionAccountingSyncFailed != null ->
                "UnwrapStandardWebhookEvent{transactionAccountingSyncFailed=$transactionAccountingSyncFailed}"
            transactionAccountingSyncSucceeded != null ->
                "UnwrapStandardWebhookEvent{transactionAccountingSyncSucceeded=$transactionAccountingSyncSucceeded}"
            _json != null -> "UnwrapStandardWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnwrapStandardWebhookEvent")
        }

    companion object {

        /** Issued when a backfill is closed and its events are reflected into usage. */
        fun ofBackfillReflected(backfillReflected: BackfillReflectedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(backfillReflected = backfillReflected)

        /** Issued when a backfill is reverted, removing its events from usage. */
        fun ofBackfillReverted(backfillReverted: BackfillRevertedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(backfillReverted = backfillReverted)

        /** Issued when a billable metric is edited. */
        fun ofBillableMetricEdited(billableMetricEdited: BillableMetricEditedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(billableMetricEdited = billableMetricEdited)

        /** Issued when a credit block accounting sync fails. */
        fun ofCreditBlockAccountingSyncFailed(
            creditBlockAccountingSyncFailed: CreditBlockAccountingSyncFailedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                creditBlockAccountingSyncFailed = creditBlockAccountingSyncFailed
            )

        /** Issued when a credit block accounting sync succeeds. */
        fun ofCreditBlockAccountingSyncSucceeded(
            creditBlockAccountingSyncSucceeded:
                CreditBlockAccountingSyncSucceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                creditBlockAccountingSyncSucceeded = creditBlockAccountingSyncSucceeded
            )

        /** Issued when a credit note accounting sync fails. */
        fun ofCreditNoteAccountingSyncFailed(
            creditNoteAccountingSyncFailed: CreditNoteAccountingSyncFailedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                creditNoteAccountingSyncFailed = creditNoteAccountingSyncFailed
            )

        /** Issued when a credit note accounting sync succeeds. */
        fun ofCreditNoteAccountingSyncSucceeded(
            creditNoteAccountingSyncSucceeded: CreditNoteAccountingSyncSucceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                creditNoteAccountingSyncSucceeded = creditNoteAccountingSyncSucceeded
            )

        /** Issued when a credit note is created. */
        fun ofCreditNoteIssued(creditNoteIssued: CreditNoteIssuedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(creditNoteIssued = creditNoteIssued)

        /** Issued when a credit note is marked as void. */
        fun ofCreditNoteMarkedAsVoid(
            creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(creditNoteMarkedAsVoid = creditNoteMarkedAsVoid)

        /** Issued when a customer accounting sync fails. */
        fun ofCustomerAccountingSyncFailed(
            customerAccountingSyncFailed: CustomerAccountingSyncFailedStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(customerAccountingSyncFailed = customerAccountingSyncFailed)

        /** Issued when a customer accounting sync succeeds. */
        fun ofCustomerAccountingSyncSucceeded(
            customerAccountingSyncSucceeded: CustomerAccountingSyncSucceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                customerAccountingSyncSucceeded = customerAccountingSyncSucceeded
            )

        /** Issued when a customer balance transaction is created. */
        fun ofCustomerBalanceTransactionCreated(
            customerBalanceTransactionCreated: CustomerBalanceTransactionCreatedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                customerBalanceTransactionCreated = customerBalanceTransactionCreated
            )

        /** Issued when a customer resource is created. */
        fun ofCustomerCreated(customerCreated: CustomerCreatedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(customerCreated = customerCreated)

        /** Issued when a customer's prepaid credits balance is depleted. */
        fun ofCustomerCreditBalanceDepleted(
            customerCreditBalanceDepleted: CustomerCreditBalanceDepletedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                customerCreditBalanceDepleted = customerCreditBalanceDepleted
            )

        /**
         * Issued when a customer's prepaid credits balance is depleted to a configured threshold.
         */
        fun ofCustomerCreditBalanceDropped(
            customerCreditBalanceDropped: CustomerCreditBalanceDroppedStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(customerCreditBalanceDropped = customerCreditBalanceDropped)

        /** Issued when a customer's credit balance recovers from depleted. */
        fun ofCustomerCreditBalanceRecovered(
            customerCreditBalanceRecovered: CustomerCreditBalanceRecoveredStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                customerCreditBalanceRecovered = customerCreditBalanceRecovered
            )

        /** Issued when a customer's credit ledger is incremented. */
        fun ofCustomerCreditLedgerIncremented(
            customerCreditLedgerIncremented: CustomerCreditLedgerIncrementedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                customerCreditLedgerIncremented = customerCreditLedgerIncremented
            )

        /** Issued when a customer is updated. */
        fun ofCustomerEdited(customerEdited: CustomerEditedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(customerEdited = customerEdited)

        /** Issued when a data export transfer fails. */
        fun ofDataExportsTransferError(
            dataExportsTransferError: DataExportsTransferErrorStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(dataExportsTransferError = dataExportsTransferError)

        /** Issued when a data export transfer succeeds. */
        fun ofDataExportsTransferSuccess(
            dataExportsTransferSuccess: DataExportsTransferSuccessStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(dataExportsTransferSuccess = dataExportsTransferSuccess)

        /** Issued when an event does not match any customer. */
        fun ofEventUnmatchedEvent(eventUnmatchedEvent: EventUnmatchedEventStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(eventUnmatchedEvent = eventUnmatchedEvent)

        /** Issued when ingestion events reference unmatched customer IDs. */
        fun ofIngestionUnmatchedCustomerIds(
            ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                ingestionUnmatchedCustomerIds = ingestionUnmatchedCustomerIds
            )

        /** Issued when an invoice accounting sync fails. */
        fun ofInvoiceAccountingSyncFailed(
            invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoiceAccountingSyncFailed = invoiceAccountingSyncFailed)

        /** Issued when an invoice accounting sync succeeds. */
        fun ofInvoiceAccountingSyncSucceeded(
            invoiceAccountingSyncSucceeded: InvoiceAccountingSyncSucceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                invoiceAccountingSyncSucceeded = invoiceAccountingSyncSucceeded
            )

        /** Issued when a collections-automation schedule step is executed for an invoice. */
        fun ofInvoiceAutomationScheduleStepExecuted(
            invoiceAutomationScheduleStepExecuted:
                InvoiceAutomationScheduleStepExecutedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                invoiceAutomationScheduleStepExecuted = invoiceAutomationScheduleStepExecuted
            )

        /** Issued when invoice cost data is exported. */
        fun ofInvoiceCostDataExported(
            invoiceCostDataExported: InvoiceCostDataExportedStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoiceCostDataExported = invoiceCostDataExported)

        /** Issued when a dunning schedule is created for an invoice. */
        fun ofInvoiceDunningScheduleCreated(
            invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                invoiceDunningScheduleCreated = invoiceDunningScheduleCreated
            )

        /** Issued when a dunning schedule ends. */
        fun ofInvoiceDunningScheduleEnded(
            invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoiceDunningScheduleEnded = invoiceDunningScheduleEnded)

        /** Issued when a dunning schedule is reset. */
        fun ofInvoiceDunningScheduleReset(
            invoiceDunningScheduleReset: InvoiceDunningScheduleResetStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoiceDunningScheduleReset = invoiceDunningScheduleReset)

        /** Issued when a dunning schedule step is executed. */
        fun ofInvoiceDunningScheduleStepExecuted(
            invoiceDunningScheduleStepExecuted:
                InvoiceDunningScheduleStepExecutedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                invoiceDunningScheduleStepExecuted = invoiceDunningScheduleStepExecuted
            )

        /** Issued when a draft invoice has been edited. */
        fun ofInvoiceEdited(invoiceEdited: InvoiceEditedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(invoiceEdited = invoiceEdited)

        /** Issued when an invoice's invoice date has elapsed. */
        fun ofInvoiceInvoiceDateElapsed(
            invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoiceInvoiceDateElapsed = invoiceInvoiceDateElapsed)

        /** Issued when an invoice issue attempt fails. */
        fun ofInvoiceIssueFailed(invoiceIssueFailed: InvoiceIssueFailedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(invoiceIssueFailed = invoiceIssueFailed)

        /** Issued when an invoice transitions to the "issued" state. */
        fun ofInvoiceIssued(invoiceIssued: InvoiceIssuedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(invoiceIssued = invoiceIssued)

        /**
         * A lightweight variant of invoice.issued for accounts configured to receive a summarized
         * invoice payload.
         */
        fun ofInvoiceIssuedSummary(invoiceIssuedSummary: InvoiceIssuedSummaryStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(invoiceIssuedSummary = invoiceIssuedSummary)

        /** Issued when an invoice is manually marked as paid. */
        fun ofInvoiceManuallyMarkedAsPaid(
            invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoiceManuallyMarkedAsPaid = invoiceManuallyMarkedAsPaid)

        /** Issued when an invoice is marked as void. */
        fun ofInvoiceManuallyMarkedAsVoid(
            invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoiceManuallyMarkedAsVoid = invoiceManuallyMarkedAsVoid)

        /**
         * Issued when automated payment collection for an invoice fails for a configured payment
         * gateway.
         */
        fun ofInvoicePaymentFailed(invoicePaymentFailed: InvoicePaymentFailedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(invoicePaymentFailed = invoicePaymentFailed)

        /** Issued when an invoice payment is being processed. */
        fun ofInvoicePaymentProcessing(
            invoicePaymentProcessing: InvoicePaymentProcessingStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoicePaymentProcessing = invoicePaymentProcessing)

        /**
         * Issued when automated payment collection for an invoice succeeds for a configured payment
         * gateway.
         */
        fun ofInvoicePaymentSucceeded(
            invoicePaymentSucceeded: InvoicePaymentSucceededStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoicePaymentSucceeded = invoicePaymentSucceeded)

        /** Issued when an invoice sync fails. */
        fun ofInvoiceSyncFailed(invoiceSyncFailed: InvoiceSyncFailedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(invoiceSyncFailed = invoiceSyncFailed)

        /** Issued when an invoice sync succeeds. */
        fun ofInvoiceSyncSucceeded(invoiceSyncSucceeded: InvoiceSyncSucceededStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(invoiceSyncSucceeded = invoiceSyncSucceeded)

        /** Issued when an invoice is undone from marked as paid. */
        fun ofInvoiceUndoMarkAsPaid(
            invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(invoiceUndoMarkAsPaid = invoiceUndoMarkAsPaid)

        /** Issued when an invoice due date recalculation is canceled. */
        fun ofInvoiceDueDateRecalculationCanceled(
            invoiceDueDateRecalculationCanceled:
                InvoiceDueDateRecalculationCanceledStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                invoiceDueDateRecalculationCanceled = invoiceDueDateRecalculationCanceled
            )

        /** Issued when an invoice due date recalculation is completed. */
        fun ofInvoiceDueDateRecalculationCompleted(
            invoiceDueDateRecalculationCompleted:
                InvoiceDueDateRecalculationCompletedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                invoiceDueDateRecalculationCompleted = invoiceDueDateRecalculationCompleted
            )

        /** Issued when an invoice due date recalculation is started. */
        fun ofInvoiceDueDateRecalculationStarted(
            invoiceDueDateRecalculationStarted:
                InvoiceDueDateRecalculationStartedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                invoiceDueDateRecalculationStarted = invoiceDueDateRecalculationStarted
            )

        /** Issued when metric events are dropped by watermark threshold. */
        fun ofMetricEventsDroppedByWatermark(
            metricEventsDroppedByWatermark: MetricEventsDroppedByWatermarkStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                metricEventsDroppedByWatermark = metricEventsDroppedByWatermark
            )

        /** Issued when a payment method is created. */
        fun ofPaymentMethodCreated(paymentMethodCreated: PaymentMethodCreatedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(paymentMethodCreated = paymentMethodCreated)

        /** Issued when a payment method is deleted. */
        fun ofPaymentMethodDeleted(paymentMethodDeleted: PaymentMethodDeletedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(paymentMethodDeleted = paymentMethodDeleted)

        /** Issued when a plan is created, or when a draft plan is published. */
        fun ofPlanCreated(planCreated: PlanCreatedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(planCreated = planCreated)

        /** Issued when a plan's default version is set. */
        fun ofPlanDefaultVersionSet(
            planDefaultVersionSet: PlanDefaultVersionSetStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(planDefaultVersionSet = planDefaultVersionSet)

        /**
         * Issued when a plan's name, description, external plan ID, metadata or status is edited.
         */
        fun ofPlanEdited(planEdited: PlanEditedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(planEdited = planEdited)

        /** Issued when a new plan version is created. */
        fun ofPlanVersionCreated(planVersionCreated: PlanVersionCreatedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(planVersionCreated = planVersionCreated)

        /** Issued when a price is edited. */
        fun ofPriceEdited(priceEdited: PriceEditedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(priceEdited = priceEdited)

        /** Issued when a test webhook is sent. */
        fun ofResourceEventTest(resourceEventTest: ResourceEventTestStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(resourceEventTest = resourceEventTest)

        /** Issued when a sales order accounting sync fails. */
        fun ofSalesOrderAccountingSyncFailed(
            salesOrderAccountingSyncFailed: SalesOrderAccountingSyncFailedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                salesOrderAccountingSyncFailed = salesOrderAccountingSyncFailed
            )

        /** Issued when a sales order accounting sync succeeds. */
        fun ofSalesOrderAccountingSyncSucceeded(
            salesOrderAccountingSyncSucceeded: SalesOrderAccountingSyncSucceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                salesOrderAccountingSyncSucceeded = salesOrderAccountingSyncSucceeded
            )

        /** Issued when a subscription accounting sync fails. */
        fun ofSubscriptionAccountingSyncFailed(
            subscriptionAccountingSyncFailed: SubscriptionAccountingSyncFailedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionAccountingSyncFailed = subscriptionAccountingSyncFailed
            )

        /** Issued when a subscription accounting sync succeeds. */
        fun ofSubscriptionAccountingSyncSucceeded(
            subscriptionAccountingSyncSucceeded:
                SubscriptionAccountingSyncSucceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionAccountingSyncSucceeded = subscriptionAccountingSyncSucceeded
            )

        /** Issued when an alert is automatically disabled by the system. */
        fun ofSubscriptionAlertDisabled(
            subscriptionAlertDisabled: SubscriptionAlertDisabledStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(subscriptionAlertDisabled = subscriptionAlertDisabled)

        /** Issued when a subscription cancellation is scheduled. */
        fun ofSubscriptionCancellationScheduled(
            subscriptionCancellationScheduled: SubscriptionCancellationScheduledStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionCancellationScheduled = subscriptionCancellationScheduled
            )

        /** Issued when a scheduled subscription cancellation is unscheduled. */
        fun ofSubscriptionCancellationUnscheduled(
            subscriptionCancellationUnscheduled:
                SubscriptionCancellationUnscheduledStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionCancellationUnscheduled = subscriptionCancellationUnscheduled
            )

        /** Issued when a subscription's cost exceeds a pre-configured amount threshold. */
        fun ofSubscriptionCostExceeded(
            subscriptionCostExceeded: SubscriptionCostExceededStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(subscriptionCostExceeded = subscriptionCostExceeded)

        /** Issued when a subscription resource is created. */
        fun ofSubscriptionCreated(subscriptionCreated: SubscriptionCreatedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(subscriptionCreated = subscriptionCreated)

        /** Issued when a subscription is updated. */
        fun ofSubscriptionEdited(subscriptionEdited: SubscriptionEditedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(subscriptionEdited = subscriptionEdited)

        /** Issued whenever a customer's subscription ends/lapses. */
        fun ofSubscriptionEnded(subscriptionEnded: SubscriptionEndedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(subscriptionEnded = subscriptionEnded)

        /** Issued when a subscription's fixed fee quantity is updated. */
        fun ofSubscriptionFixedFeeQuantityUpdated(
            subscriptionFixedFeeQuantityUpdated:
                SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionFixedFeeQuantityUpdated = subscriptionFixedFeeQuantityUpdated
            )

        /** Issued when grouped subscription costs exceed a pre-configured amount threshold. */
        fun ofSubscriptionGroupedCostExceeded(
            subscriptionGroupedCostExceeded: SubscriptionGroupedCostExceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionGroupedCostExceeded = subscriptionGroupedCostExceeded
            )

        /**
         * Issued when a subscription's invoicing threshold is exceeded and an evaluation is
         * performed.
         */
        fun ofSubscriptionInvoicingThresholdExceeded(
            subscriptionInvoicingThresholdExceeded:
                SubscriptionInvoicingThresholdExceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionInvoicingThresholdExceeded = subscriptionInvoicingThresholdExceeded
            )

        /** Issued when a license allocation is reset. */
        fun ofSubscriptionLicenseAllocationReset(
            subscriptionLicenseAllocationReset:
                SubscriptionLicenseAllocationResetStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionLicenseAllocationReset = subscriptionLicenseAllocationReset
            )

        /** Issued when a license balance threshold is reached. */
        fun ofSubscriptionLicenseBalanceThresholdReached(
            subscriptionLicenseBalanceThresholdReached:
                SubscriptionLicenseBalanceThresholdReachedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionLicenseBalanceThresholdReached =
                    subscriptionLicenseBalanceThresholdReached
            )

        /** Issued when a subscription plan change is scheduled. */
        fun ofSubscriptionPlanChangeScheduled(
            subscriptionPlanChangeScheduled: SubscriptionPlanChangeScheduledStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionPlanChangeScheduled = subscriptionPlanChangeScheduled
            )

        /** Issued when a subscription transitions from one plan to a different plan. */
        fun ofSubscriptionPlanChanged(
            subscriptionPlanChanged: SubscriptionPlanChangedStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(subscriptionPlanChanged = subscriptionPlanChanged)

        /** Issued when a subscription plan version change is scheduled. */
        fun ofSubscriptionPlanVersionChangeScheduled(
            subscriptionPlanVersionChangeScheduled:
                SubscriptionPlanVersionChangeScheduledStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionPlanVersionChangeScheduled = subscriptionPlanVersionChangeScheduled
            )

        /** Issued when a subscription plan version has changed. */
        fun ofSubscriptionPlanVersionChanged(
            subscriptionPlanVersionChanged: SubscriptionPlanVersionChangedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                subscriptionPlanVersionChanged = subscriptionPlanVersionChanged
            )

        /**
         * Issued when a subscription's rated spend, before credits and adjustments, exceeds a
         * pre-configured amount threshold.
         */
        fun ofSubscriptionSpendExceeded(
            subscriptionSpendExceeded: SubscriptionSpendExceededStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(subscriptionSpendExceeded = subscriptionSpendExceeded)

        /** Issued when a subscription begins. */
        fun ofSubscriptionStarted(subscriptionStarted: SubscriptionStartedStandardWebhookEvent) =
            UnwrapStandardWebhookEvent(subscriptionStarted = subscriptionStarted)

        /** Issued when a subscription trial ends. */
        fun ofSubscriptionTrialEnded(
            subscriptionTrialEnded: SubscriptionTrialEndedStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(subscriptionTrialEnded = subscriptionTrialEnded)

        /**
         * Issued when a billable metric in a subscription exceeds a pre-configured quantity
         * threshold.
         */
        fun ofSubscriptionUsageExceeded(
            subscriptionUsageExceeded: SubscriptionUsageExceededStandardWebhookEvent
        ) = UnwrapStandardWebhookEvent(subscriptionUsageExceeded = subscriptionUsageExceeded)

        /** Issued when a transaction accounting sync fails. */
        fun ofTransactionAccountingSyncFailed(
            transactionAccountingSyncFailed: TransactionAccountingSyncFailedStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                transactionAccountingSyncFailed = transactionAccountingSyncFailed
            )

        /** Issued when a transaction accounting sync succeeds. */
        fun ofTransactionAccountingSyncSucceeded(
            transactionAccountingSyncSucceeded:
                TransactionAccountingSyncSucceededStandardWebhookEvent
        ) =
            UnwrapStandardWebhookEvent(
                transactionAccountingSyncSucceeded = transactionAccountingSyncSucceeded
            )
    }

    /**
     * An interface that defines how to map each variant of [UnwrapStandardWebhookEvent] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /** Issued when a backfill is closed and its events are reflected into usage. */
        fun visitBackfillReflected(backfillReflected: BackfillReflectedStandardWebhookEvent): T

        /** Issued when a backfill is reverted, removing its events from usage. */
        fun visitBackfillReverted(backfillReverted: BackfillRevertedStandardWebhookEvent): T

        /** Issued when a billable metric is edited. */
        fun visitBillableMetricEdited(
            billableMetricEdited: BillableMetricEditedStandardWebhookEvent
        ): T

        /** Issued when a credit block accounting sync fails. */
        fun visitCreditBlockAccountingSyncFailed(
            creditBlockAccountingSyncFailed: CreditBlockAccountingSyncFailedStandardWebhookEvent
        ): T

        /** Issued when a credit block accounting sync succeeds. */
        fun visitCreditBlockAccountingSyncSucceeded(
            creditBlockAccountingSyncSucceeded:
                CreditBlockAccountingSyncSucceededStandardWebhookEvent
        ): T

        /** Issued when a credit note accounting sync fails. */
        fun visitCreditNoteAccountingSyncFailed(
            creditNoteAccountingSyncFailed: CreditNoteAccountingSyncFailedStandardWebhookEvent
        ): T

        /** Issued when a credit note accounting sync succeeds. */
        fun visitCreditNoteAccountingSyncSucceeded(
            creditNoteAccountingSyncSucceeded: CreditNoteAccountingSyncSucceededStandardWebhookEvent
        ): T

        /** Issued when a credit note is created. */
        fun visitCreditNoteIssued(creditNoteIssued: CreditNoteIssuedStandardWebhookEvent): T

        /** Issued when a credit note is marked as void. */
        fun visitCreditNoteMarkedAsVoid(
            creditNoteMarkedAsVoid: CreditNoteMarkedAsVoidStandardWebhookEvent
        ): T

        /** Issued when a customer accounting sync fails. */
        fun visitCustomerAccountingSyncFailed(
            customerAccountingSyncFailed: CustomerAccountingSyncFailedStandardWebhookEvent
        ): T

        /** Issued when a customer accounting sync succeeds. */
        fun visitCustomerAccountingSyncSucceeded(
            customerAccountingSyncSucceeded: CustomerAccountingSyncSucceededStandardWebhookEvent
        ): T

        /** Issued when a customer balance transaction is created. */
        fun visitCustomerBalanceTransactionCreated(
            customerBalanceTransactionCreated: CustomerBalanceTransactionCreatedStandardWebhookEvent
        ): T

        /** Issued when a customer resource is created. */
        fun visitCustomerCreated(customerCreated: CustomerCreatedStandardWebhookEvent): T

        /** Issued when a customer's prepaid credits balance is depleted. */
        fun visitCustomerCreditBalanceDepleted(
            customerCreditBalanceDepleted: CustomerCreditBalanceDepletedStandardWebhookEvent
        ): T

        /**
         * Issued when a customer's prepaid credits balance is depleted to a configured threshold.
         */
        fun visitCustomerCreditBalanceDropped(
            customerCreditBalanceDropped: CustomerCreditBalanceDroppedStandardWebhookEvent
        ): T

        /** Issued when a customer's credit balance recovers from depleted. */
        fun visitCustomerCreditBalanceRecovered(
            customerCreditBalanceRecovered: CustomerCreditBalanceRecoveredStandardWebhookEvent
        ): T

        /** Issued when a customer's credit ledger is incremented. */
        fun visitCustomerCreditLedgerIncremented(
            customerCreditLedgerIncremented: CustomerCreditLedgerIncrementedStandardWebhookEvent
        ): T

        /** Issued when a customer is updated. */
        fun visitCustomerEdited(customerEdited: CustomerEditedStandardWebhookEvent): T

        /** Issued when a data export transfer fails. */
        fun visitDataExportsTransferError(
            dataExportsTransferError: DataExportsTransferErrorStandardWebhookEvent
        ): T

        /** Issued when a data export transfer succeeds. */
        fun visitDataExportsTransferSuccess(
            dataExportsTransferSuccess: DataExportsTransferSuccessStandardWebhookEvent
        ): T

        /** Issued when an event does not match any customer. */
        fun visitEventUnmatchedEvent(
            eventUnmatchedEvent: EventUnmatchedEventStandardWebhookEvent
        ): T

        /** Issued when ingestion events reference unmatched customer IDs. */
        fun visitIngestionUnmatchedCustomerIds(
            ingestionUnmatchedCustomerIds: IngestionUnmatchedCustomerIdsStandardWebhookEvent
        ): T

        /** Issued when an invoice accounting sync fails. */
        fun visitInvoiceAccountingSyncFailed(
            invoiceAccountingSyncFailed: InvoiceAccountingSyncFailedStandardWebhookEvent
        ): T

        /** Issued when an invoice accounting sync succeeds. */
        fun visitInvoiceAccountingSyncSucceeded(
            invoiceAccountingSyncSucceeded: InvoiceAccountingSyncSucceededStandardWebhookEvent
        ): T

        /** Issued when a collections-automation schedule step is executed for an invoice. */
        fun visitInvoiceAutomationScheduleStepExecuted(
            invoiceAutomationScheduleStepExecuted:
                InvoiceAutomationScheduleStepExecutedStandardWebhookEvent
        ): T

        /** Issued when invoice cost data is exported. */
        fun visitInvoiceCostDataExported(
            invoiceCostDataExported: InvoiceCostDataExportedStandardWebhookEvent
        ): T

        /** Issued when a dunning schedule is created for an invoice. */
        fun visitInvoiceDunningScheduleCreated(
            invoiceDunningScheduleCreated: InvoiceDunningScheduleCreatedStandardWebhookEvent
        ): T

        /** Issued when a dunning schedule ends. */
        fun visitInvoiceDunningScheduleEnded(
            invoiceDunningScheduleEnded: InvoiceDunningScheduleEndedStandardWebhookEvent
        ): T

        /** Issued when a dunning schedule is reset. */
        fun visitInvoiceDunningScheduleReset(
            invoiceDunningScheduleReset: InvoiceDunningScheduleResetStandardWebhookEvent
        ): T

        /** Issued when a dunning schedule step is executed. */
        fun visitInvoiceDunningScheduleStepExecuted(
            invoiceDunningScheduleStepExecuted:
                InvoiceDunningScheduleStepExecutedStandardWebhookEvent
        ): T

        /** Issued when a draft invoice has been edited. */
        fun visitInvoiceEdited(invoiceEdited: InvoiceEditedStandardWebhookEvent): T

        /** Issued when an invoice's invoice date has elapsed. */
        fun visitInvoiceInvoiceDateElapsed(
            invoiceInvoiceDateElapsed: InvoiceInvoiceDateElapsedStandardWebhookEvent
        ): T

        /** Issued when an invoice issue attempt fails. */
        fun visitInvoiceIssueFailed(invoiceIssueFailed: InvoiceIssueFailedStandardWebhookEvent): T

        /** Issued when an invoice transitions to the "issued" state. */
        fun visitInvoiceIssued(invoiceIssued: InvoiceIssuedStandardWebhookEvent): T

        /**
         * A lightweight variant of invoice.issued for accounts configured to receive a summarized
         * invoice payload.
         */
        fun visitInvoiceIssuedSummary(
            invoiceIssuedSummary: InvoiceIssuedSummaryStandardWebhookEvent
        ): T

        /** Issued when an invoice is manually marked as paid. */
        fun visitInvoiceManuallyMarkedAsPaid(
            invoiceManuallyMarkedAsPaid: InvoiceManuallyMarkedAsPaidStandardWebhookEvent
        ): T

        /** Issued when an invoice is marked as void. */
        fun visitInvoiceManuallyMarkedAsVoid(
            invoiceManuallyMarkedAsVoid: InvoiceManuallyMarkedAsVoidStandardWebhookEvent
        ): T

        /**
         * Issued when automated payment collection for an invoice fails for a configured payment
         * gateway.
         */
        fun visitInvoicePaymentFailed(
            invoicePaymentFailed: InvoicePaymentFailedStandardWebhookEvent
        ): T

        /** Issued when an invoice payment is being processed. */
        fun visitInvoicePaymentProcessing(
            invoicePaymentProcessing: InvoicePaymentProcessingStandardWebhookEvent
        ): T

        /**
         * Issued when automated payment collection for an invoice succeeds for a configured payment
         * gateway.
         */
        fun visitInvoicePaymentSucceeded(
            invoicePaymentSucceeded: InvoicePaymentSucceededStandardWebhookEvent
        ): T

        /** Issued when an invoice sync fails. */
        fun visitInvoiceSyncFailed(invoiceSyncFailed: InvoiceSyncFailedStandardWebhookEvent): T

        /** Issued when an invoice sync succeeds. */
        fun visitInvoiceSyncSucceeded(
            invoiceSyncSucceeded: InvoiceSyncSucceededStandardWebhookEvent
        ): T

        /** Issued when an invoice is undone from marked as paid. */
        fun visitInvoiceUndoMarkAsPaid(
            invoiceUndoMarkAsPaid: InvoiceUndoMarkAsPaidStandardWebhookEvent
        ): T

        /** Issued when an invoice due date recalculation is canceled. */
        fun visitInvoiceDueDateRecalculationCanceled(
            invoiceDueDateRecalculationCanceled:
                InvoiceDueDateRecalculationCanceledStandardWebhookEvent
        ): T

        /** Issued when an invoice due date recalculation is completed. */
        fun visitInvoiceDueDateRecalculationCompleted(
            invoiceDueDateRecalculationCompleted:
                InvoiceDueDateRecalculationCompletedStandardWebhookEvent
        ): T

        /** Issued when an invoice due date recalculation is started. */
        fun visitInvoiceDueDateRecalculationStarted(
            invoiceDueDateRecalculationStarted:
                InvoiceDueDateRecalculationStartedStandardWebhookEvent
        ): T

        /** Issued when metric events are dropped by watermark threshold. */
        fun visitMetricEventsDroppedByWatermark(
            metricEventsDroppedByWatermark: MetricEventsDroppedByWatermarkStandardWebhookEvent
        ): T

        /** Issued when a payment method is created. */
        fun visitPaymentMethodCreated(
            paymentMethodCreated: PaymentMethodCreatedStandardWebhookEvent
        ): T

        /** Issued when a payment method is deleted. */
        fun visitPaymentMethodDeleted(
            paymentMethodDeleted: PaymentMethodDeletedStandardWebhookEvent
        ): T

        /** Issued when a plan is created, or when a draft plan is published. */
        fun visitPlanCreated(planCreated: PlanCreatedStandardWebhookEvent): T

        /** Issued when a plan's default version is set. */
        fun visitPlanDefaultVersionSet(
            planDefaultVersionSet: PlanDefaultVersionSetStandardWebhookEvent
        ): T

        /**
         * Issued when a plan's name, description, external plan ID, metadata or status is edited.
         */
        fun visitPlanEdited(planEdited: PlanEditedStandardWebhookEvent): T

        /** Issued when a new plan version is created. */
        fun visitPlanVersionCreated(planVersionCreated: PlanVersionCreatedStandardWebhookEvent): T

        /** Issued when a price is edited. */
        fun visitPriceEdited(priceEdited: PriceEditedStandardWebhookEvent): T

        /** Issued when a test webhook is sent. */
        fun visitResourceEventTest(resourceEventTest: ResourceEventTestStandardWebhookEvent): T

        /** Issued when a sales order accounting sync fails. */
        fun visitSalesOrderAccountingSyncFailed(
            salesOrderAccountingSyncFailed: SalesOrderAccountingSyncFailedStandardWebhookEvent
        ): T

        /** Issued when a sales order accounting sync succeeds. */
        fun visitSalesOrderAccountingSyncSucceeded(
            salesOrderAccountingSyncSucceeded: SalesOrderAccountingSyncSucceededStandardWebhookEvent
        ): T

        /** Issued when a subscription accounting sync fails. */
        fun visitSubscriptionAccountingSyncFailed(
            subscriptionAccountingSyncFailed: SubscriptionAccountingSyncFailedStandardWebhookEvent
        ): T

        /** Issued when a subscription accounting sync succeeds. */
        fun visitSubscriptionAccountingSyncSucceeded(
            subscriptionAccountingSyncSucceeded:
                SubscriptionAccountingSyncSucceededStandardWebhookEvent
        ): T

        /** Issued when an alert is automatically disabled by the system. */
        fun visitSubscriptionAlertDisabled(
            subscriptionAlertDisabled: SubscriptionAlertDisabledStandardWebhookEvent
        ): T

        /** Issued when a subscription cancellation is scheduled. */
        fun visitSubscriptionCancellationScheduled(
            subscriptionCancellationScheduled: SubscriptionCancellationScheduledStandardWebhookEvent
        ): T

        /** Issued when a scheduled subscription cancellation is unscheduled. */
        fun visitSubscriptionCancellationUnscheduled(
            subscriptionCancellationUnscheduled:
                SubscriptionCancellationUnscheduledStandardWebhookEvent
        ): T

        /** Issued when a subscription's cost exceeds a pre-configured amount threshold. */
        fun visitSubscriptionCostExceeded(
            subscriptionCostExceeded: SubscriptionCostExceededStandardWebhookEvent
        ): T

        /** Issued when a subscription resource is created. */
        fun visitSubscriptionCreated(
            subscriptionCreated: SubscriptionCreatedStandardWebhookEvent
        ): T

        /** Issued when a subscription is updated. */
        fun visitSubscriptionEdited(subscriptionEdited: SubscriptionEditedStandardWebhookEvent): T

        /** Issued whenever a customer's subscription ends/lapses. */
        fun visitSubscriptionEnded(subscriptionEnded: SubscriptionEndedStandardWebhookEvent): T

        /** Issued when a subscription's fixed fee quantity is updated. */
        fun visitSubscriptionFixedFeeQuantityUpdated(
            subscriptionFixedFeeQuantityUpdated:
                SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent
        ): T

        /** Issued when grouped subscription costs exceed a pre-configured amount threshold. */
        fun visitSubscriptionGroupedCostExceeded(
            subscriptionGroupedCostExceeded: SubscriptionGroupedCostExceededStandardWebhookEvent
        ): T

        /**
         * Issued when a subscription's invoicing threshold is exceeded and an evaluation is
         * performed.
         */
        fun visitSubscriptionInvoicingThresholdExceeded(
            subscriptionInvoicingThresholdExceeded:
                SubscriptionInvoicingThresholdExceededStandardWebhookEvent
        ): T

        /** Issued when a license allocation is reset. */
        fun visitSubscriptionLicenseAllocationReset(
            subscriptionLicenseAllocationReset:
                SubscriptionLicenseAllocationResetStandardWebhookEvent
        ): T

        /** Issued when a license balance threshold is reached. */
        fun visitSubscriptionLicenseBalanceThresholdReached(
            subscriptionLicenseBalanceThresholdReached:
                SubscriptionLicenseBalanceThresholdReachedStandardWebhookEvent
        ): T

        /** Issued when a subscription plan change is scheduled. */
        fun visitSubscriptionPlanChangeScheduled(
            subscriptionPlanChangeScheduled: SubscriptionPlanChangeScheduledStandardWebhookEvent
        ): T

        /** Issued when a subscription transitions from one plan to a different plan. */
        fun visitSubscriptionPlanChanged(
            subscriptionPlanChanged: SubscriptionPlanChangedStandardWebhookEvent
        ): T

        /** Issued when a subscription plan version change is scheduled. */
        fun visitSubscriptionPlanVersionChangeScheduled(
            subscriptionPlanVersionChangeScheduled:
                SubscriptionPlanVersionChangeScheduledStandardWebhookEvent
        ): T

        /** Issued when a subscription plan version has changed. */
        fun visitSubscriptionPlanVersionChanged(
            subscriptionPlanVersionChanged: SubscriptionPlanVersionChangedStandardWebhookEvent
        ): T

        /**
         * Issued when a subscription's rated spend, before credits and adjustments, exceeds a
         * pre-configured amount threshold.
         */
        fun visitSubscriptionSpendExceeded(
            subscriptionSpendExceeded: SubscriptionSpendExceededStandardWebhookEvent
        ): T

        /** Issued when a subscription begins. */
        fun visitSubscriptionStarted(
            subscriptionStarted: SubscriptionStartedStandardWebhookEvent
        ): T

        /** Issued when a subscription trial ends. */
        fun visitSubscriptionTrialEnded(
            subscriptionTrialEnded: SubscriptionTrialEndedStandardWebhookEvent
        ): T

        /**
         * Issued when a billable metric in a subscription exceeds a pre-configured quantity
         * threshold.
         */
        fun visitSubscriptionUsageExceeded(
            subscriptionUsageExceeded: SubscriptionUsageExceededStandardWebhookEvent
        ): T

        /** Issued when a transaction accounting sync fails. */
        fun visitTransactionAccountingSyncFailed(
            transactionAccountingSyncFailed: TransactionAccountingSyncFailedStandardWebhookEvent
        ): T

        /** Issued when a transaction accounting sync succeeds. */
        fun visitTransactionAccountingSyncSucceeded(
            transactionAccountingSyncSucceeded:
                TransactionAccountingSyncSucceededStandardWebhookEvent
        ): T

        /**
         * Maps an unknown variant of [UnwrapStandardWebhookEvent] to a value of type [T].
         *
         * An instance of [UnwrapStandardWebhookEvent] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown UnwrapStandardWebhookEvent: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<UnwrapStandardWebhookEvent>(UnwrapStandardWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnwrapStandardWebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(
                                node,
                                jacksonTypeRef<BackfillReflectedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(backfillReflected = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<BackfillRevertedStandardWebhookEvent>())
                            ?.let {
                                UnwrapStandardWebhookEvent(backfillReverted = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<BillableMetricEditedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(billableMetricEdited = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    CreditBlockAccountingSyncFailedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    creditBlockAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    CreditBlockAccountingSyncSucceededStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    creditBlockAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CreditNoteAccountingSyncFailedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    creditNoteAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    CreditNoteAccountingSyncSucceededStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    creditNoteAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CreditNoteIssuedStandardWebhookEvent>())
                            ?.let {
                                UnwrapStandardWebhookEvent(creditNoteIssued = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CreditNoteMarkedAsVoidStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    creditNoteMarkedAsVoid = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerAccountingSyncFailedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    customerAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    CustomerAccountingSyncSucceededStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    customerAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    CustomerBalanceTransactionCreatedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    customerBalanceTransactionCreated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CustomerCreatedStandardWebhookEvent>())
                            ?.let {
                                UnwrapStandardWebhookEvent(customerCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerCreditBalanceDepletedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    customerCreditBalanceDepleted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerCreditBalanceDroppedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    customerCreditBalanceDropped = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<CustomerCreditBalanceRecoveredStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    customerCreditBalanceRecovered = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    CustomerCreditLedgerIncrementedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    customerCreditLedgerIncremented = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<CustomerEditedStandardWebhookEvent>())
                            ?.let { UnwrapStandardWebhookEvent(customerEdited = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<DataExportsTransferErrorStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    dataExportsTransferError = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<DataExportsTransferSuccessStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    dataExportsTransferSuccess = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<EventUnmatchedEventStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(eventUnmatchedEvent = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<IngestionUnmatchedCustomerIdsStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    ingestionUnmatchedCustomerIds = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceAccountingSyncFailedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceAccountingSyncSucceededStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    InvoiceAutomationScheduleStepExecutedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceAutomationScheduleStepExecuted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceCostDataExportedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceCostDataExported = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDunningScheduleCreatedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceDunningScheduleCreated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDunningScheduleEndedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceDunningScheduleEnded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceDunningScheduleResetStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceDunningScheduleReset = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    InvoiceDunningScheduleStepExecutedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceDunningScheduleStepExecuted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<InvoiceEditedStandardWebhookEvent>())
                            ?.let { UnwrapStandardWebhookEvent(invoiceEdited = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceInvoiceDateElapsedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceInvoiceDateElapsed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceIssueFailedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(invoiceIssueFailed = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<InvoiceIssuedStandardWebhookEvent>())
                            ?.let { UnwrapStandardWebhookEvent(invoiceIssued = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceIssuedSummaryStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(invoiceIssuedSummary = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceManuallyMarkedAsPaidStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceManuallyMarkedAsPaid = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceManuallyMarkedAsVoidStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceManuallyMarkedAsVoid = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoicePaymentFailedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(invoicePaymentFailed = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoicePaymentProcessingStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoicePaymentProcessing = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoicePaymentSucceededStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoicePaymentSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceSyncFailedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(invoiceSyncFailed = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceSyncSucceededStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(invoiceSyncSucceeded = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<InvoiceUndoMarkAsPaidStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(invoiceUndoMarkAsPaid = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    InvoiceDueDateRecalculationCanceledStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceDueDateRecalculationCanceled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    InvoiceDueDateRecalculationCompletedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceDueDateRecalculationCompleted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    InvoiceDueDateRecalculationStartedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    invoiceDueDateRecalculationStarted = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<MetricEventsDroppedByWatermarkStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    metricEventsDroppedByWatermark = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<PaymentMethodCreatedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(paymentMethodCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<PaymentMethodDeletedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(paymentMethodDeleted = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<PlanCreatedStandardWebhookEvent>())
                            ?.let { UnwrapStandardWebhookEvent(planCreated = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<PlanDefaultVersionSetStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(planDefaultVersionSet = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<PlanEditedStandardWebhookEvent>())
                            ?.let { UnwrapStandardWebhookEvent(planEdited = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<PlanVersionCreatedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(planVersionCreated = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<PriceEditedStandardWebhookEvent>())
                            ?.let { UnwrapStandardWebhookEvent(priceEdited = it, _json = json) },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<ResourceEventTestStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(resourceEventTest = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SalesOrderAccountingSyncFailedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    salesOrderAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SalesOrderAccountingSyncSucceededStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    salesOrderAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionAccountingSyncFailedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionAccountingSyncSucceededStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionAccountingSyncSucceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionAlertDisabledStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionAlertDisabled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionCancellationScheduledStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionCancellationScheduled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionCancellationUnscheduledStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionCancellationUnscheduled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionCostExceededStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionCostExceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionCreatedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(subscriptionCreated = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionEditedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(subscriptionEdited = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionEndedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(subscriptionEnded = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionFixedFeeQuantityUpdatedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionFixedFeeQuantityUpdated = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionGroupedCostExceededStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionGroupedCostExceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionInvoicingThresholdExceededStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionInvoicingThresholdExceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionLicenseAllocationResetStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionLicenseAllocationReset = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionLicenseBalanceThresholdReachedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionLicenseBalanceThresholdReached = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionPlanChangeScheduledStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionPlanChangeScheduled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionPlanChangedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionPlanChanged = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    SubscriptionPlanVersionChangeScheduledStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionPlanVersionChangeScheduled = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionPlanVersionChangedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionPlanVersionChanged = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionSpendExceededStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionSpendExceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionStartedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(subscriptionStarted = it, _json = json)
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionTrialEndedStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionTrialEnded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<SubscriptionUsageExceededStandardWebhookEvent>(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    subscriptionUsageExceeded = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    TransactionAccountingSyncFailedStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
                                    transactionAccountingSyncFailed = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(
                                node,
                                jacksonTypeRef<
                                    TransactionAccountingSyncSucceededStandardWebhookEvent
                                >(),
                            )
                            ?.let {
                                UnwrapStandardWebhookEvent(
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
                0 -> UnwrapStandardWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<UnwrapStandardWebhookEvent>(UnwrapStandardWebhookEvent::class) {

        override fun serialize(
            value: UnwrapStandardWebhookEvent,
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
                value.planCreated != null -> generator.writeObject(value.planCreated)
                value.planDefaultVersionSet != null ->
                    generator.writeObject(value.planDefaultVersionSet)
                value.planEdited != null -> generator.writeObject(value.planEdited)
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
                else -> throw IllegalStateException("Invalid UnwrapStandardWebhookEvent")
            }
        }
    }
}
