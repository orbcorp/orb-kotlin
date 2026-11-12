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
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * This endpoint creates a migration of a plan's subscriptions to one of its versions. With
 * `included_subscription_ids` it migrates exactly those subscriptions; otherwise it migrates the
 * plan's subscriptions that match the filters. Each subscription is migrated asynchronously; fetch
 * the migration to follow its status.
 */
class MigrationCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * When the migration takes effect: 'immediately', 'requested_date' on `effective_date`,
     * 'start_of_term' or 'end_of_term' for the start or end of each subscription's current billing
     * period, or 'start_of_invoice' or 'end_of_invoice' for the start of its current or next
     * invoice.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveTime(): EffectiveTime = body.effectiveTime()

    /**
     * The plan version to migrate subscriptions to. It can't be a draft version.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun targetPlanVersionNumber(): Long = body.targetPlanVersionNumber()

    /**
     * When false, a subscription whose migration would void an issued invoice or create a credit
     * note fails instead.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun allowInvoiceCreditOrVoid(): Boolean? = body.allowInvoiceCreditOrVoid()

    /**
     * When true, an in-arrears price the migration ends mid-cycle bills its final line item on the
     * next scheduled invoice instead of on its end date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun canDeferBilling(): Boolean? = body.canDeferBilling()

    /**
     * The date the migration takes effect, at midnight in each customer's timezone. Required when
     * `effective_time` is `requested_date`, and not allowed otherwise.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun effectiveDate(): LocalDate? = body.effectiveDate()

    /**
     * Leave these subscriptions out. Can't be combined with `included_subscription_ids`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun excludedSubscriptionIds(): List<String>? = body.excludedSubscriptionIds()

    /**
     * The external ID of the plan whose subscriptions to migrate.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun externalPlanId(): String? = body.externalPlanId()

    /**
     * `true` migrates only subscriptions in a trial, `false` only subscriptions not in a trial.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun inTrial(): Boolean? = body.inTrial()

    /**
     * Migrate only these subscriptions. When set, the filters below are ignored.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun includedSubscriptionIds(): List<String>? = body.includedSubscriptionIds()

    /**
     * The plan whose subscriptions to migrate. Exactly one of `plan_id` and `external_plan_id` is
     * required.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planId(): String? = body.planId()

    /**
     * Migrate only subscriptions currently on these plan versions.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun planVersionNumbers(): List<Long>? = body.planVersionNumbers()

    /**
     * Why the migration was created.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun reason(): String? = body.reason()

    /**
     * Migrate subscriptions with these statuses. Defaults to active subscriptions.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun statuses(): List<Status>? = body.statuses()

    /**
     * Returns the raw JSON value of [effectiveTime].
     *
     * Unlike [effectiveTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveTime(): JsonField<EffectiveTime> = body._effectiveTime()

    /**
     * Returns the raw JSON value of [targetPlanVersionNumber].
     *
     * Unlike [targetPlanVersionNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _targetPlanVersionNumber(): JsonField<Long> = body._targetPlanVersionNumber()

    /**
     * Returns the raw JSON value of [allowInvoiceCreditOrVoid].
     *
     * Unlike [allowInvoiceCreditOrVoid], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = body._allowInvoiceCreditOrVoid()

    /**
     * Returns the raw JSON value of [canDeferBilling].
     *
     * Unlike [canDeferBilling], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _canDeferBilling(): JsonField<Boolean> = body._canDeferBilling()

    /**
     * Returns the raw JSON value of [effectiveDate].
     *
     * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _effectiveDate(): JsonField<LocalDate> = body._effectiveDate()

    /**
     * Returns the raw JSON value of [excludedSubscriptionIds].
     *
     * Unlike [excludedSubscriptionIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _excludedSubscriptionIds(): JsonField<List<String>> = body._excludedSubscriptionIds()

    /**
     * Returns the raw JSON value of [externalPlanId].
     *
     * Unlike [externalPlanId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalPlanId(): JsonField<String> = body._externalPlanId()

    /**
     * Returns the raw JSON value of [inTrial].
     *
     * Unlike [inTrial], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _inTrial(): JsonField<Boolean> = body._inTrial()

    /**
     * Returns the raw JSON value of [includedSubscriptionIds].
     *
     * Unlike [includedSubscriptionIds], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _includedSubscriptionIds(): JsonField<List<String>> = body._includedSubscriptionIds()

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Returns the raw JSON value of [planVersionNumbers].
     *
     * Unlike [planVersionNumbers], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _planVersionNumbers(): JsonField<List<Long>> = body._planVersionNumbers()

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _reason(): JsonField<String> = body._reason()

    /**
     * Returns the raw JSON value of [statuses].
     *
     * Unlike [statuses], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _statuses(): JsonField<List<Status>> = body._statuses()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MigrationCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .effectiveTime()
         * .targetPlanVersionNumber()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [MigrationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(migrationCreateParams: MigrationCreateParams) = apply {
            body = migrationCreateParams.body.toBuilder()
            additionalHeaders = migrationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = migrationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [effectiveTime]
         * - [targetPlanVersionNumber]
         * - [allowInvoiceCreditOrVoid]
         * - [canDeferBilling]
         * - [effectiveDate]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * When the migration takes effect: 'immediately', 'requested_date' on `effective_date`,
         * 'start_of_term' or 'end_of_term' for the start or end of each subscription's current
         * billing period, or 'start_of_invoice' or 'end_of_invoice' for the start of its current or
         * next invoice.
         */
        fun effectiveTime(effectiveTime: EffectiveTime) = apply {
            body.effectiveTime(effectiveTime)
        }

        /**
         * Sets [Builder.effectiveTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveTime] with a well-typed [EffectiveTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveTime(effectiveTime: JsonField<EffectiveTime>) = apply {
            body.effectiveTime(effectiveTime)
        }

        /** The plan version to migrate subscriptions to. It can't be a draft version. */
        fun targetPlanVersionNumber(targetPlanVersionNumber: Long) = apply {
            body.targetPlanVersionNumber(targetPlanVersionNumber)
        }

        /**
         * Sets [Builder.targetPlanVersionNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.targetPlanVersionNumber] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun targetPlanVersionNumber(targetPlanVersionNumber: JsonField<Long>) = apply {
            body.targetPlanVersionNumber(targetPlanVersionNumber)
        }

        /**
         * When false, a subscription whose migration would void an issued invoice or create a
         * credit note fails instead.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * Sets [Builder.allowInvoiceCreditOrVoid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowInvoiceCreditOrVoid] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * When true, an in-arrears price the migration ends mid-cycle bills its final line item on
         * the next scheduled invoice instead of on its end date.
         */
        fun canDeferBilling(canDeferBilling: Boolean) = apply {
            body.canDeferBilling(canDeferBilling)
        }

        /**
         * Sets [Builder.canDeferBilling] to an arbitrary JSON value.
         *
         * You should usually call [Builder.canDeferBilling] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun canDeferBilling(canDeferBilling: JsonField<Boolean>) = apply {
            body.canDeferBilling(canDeferBilling)
        }

        /**
         * The date the migration takes effect, at midnight in each customer's timezone. Required
         * when `effective_time` is `requested_date`, and not allowed otherwise.
         */
        fun effectiveDate(effectiveDate: LocalDate?) = apply { body.effectiveDate(effectiveDate) }

        /**
         * Sets [Builder.effectiveDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
            body.effectiveDate(effectiveDate)
        }

        /** Leave these subscriptions out. Can't be combined with `included_subscription_ids`. */
        fun excludedSubscriptionIds(excludedSubscriptionIds: List<String>?) = apply {
            body.excludedSubscriptionIds(excludedSubscriptionIds)
        }

        /**
         * Sets [Builder.excludedSubscriptionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludedSubscriptionIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun excludedSubscriptionIds(excludedSubscriptionIds: JsonField<List<String>>) = apply {
            body.excludedSubscriptionIds(excludedSubscriptionIds)
        }

        /**
         * Adds a single [String] to [excludedSubscriptionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExcludedSubscriptionId(excludedSubscriptionId: String) = apply {
            body.addExcludedSubscriptionId(excludedSubscriptionId)
        }

        /** The external ID of the plan whose subscriptions to migrate. */
        fun externalPlanId(externalPlanId: String?) = apply { body.externalPlanId(externalPlanId) }

        /**
         * Sets [Builder.externalPlanId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalPlanId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun externalPlanId(externalPlanId: JsonField<String>) = apply {
            body.externalPlanId(externalPlanId)
        }

        /**
         * `true` migrates only subscriptions in a trial, `false` only subscriptions not in a trial.
         */
        fun inTrial(inTrial: Boolean?) = apply { body.inTrial(inTrial) }

        /**
         * Alias for [Builder.inTrial].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun inTrial(inTrial: Boolean) = inTrial(inTrial as Boolean?)

        /**
         * Sets [Builder.inTrial] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inTrial] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun inTrial(inTrial: JsonField<Boolean>) = apply { body.inTrial(inTrial) }

        /** Migrate only these subscriptions. When set, the filters below are ignored. */
        fun includedSubscriptionIds(includedSubscriptionIds: List<String>?) = apply {
            body.includedSubscriptionIds(includedSubscriptionIds)
        }

        /**
         * Sets [Builder.includedSubscriptionIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includedSubscriptionIds] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun includedSubscriptionIds(includedSubscriptionIds: JsonField<List<String>>) = apply {
            body.includedSubscriptionIds(includedSubscriptionIds)
        }

        /**
         * Adds a single [String] to [includedSubscriptionIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIncludedSubscriptionId(includedSubscriptionId: String) = apply {
            body.addIncludedSubscriptionId(includedSubscriptionId)
        }

        /**
         * The plan whose subscriptions to migrate. Exactly one of `plan_id` and `external_plan_id`
         * is required.
         */
        fun planId(planId: String?) = apply { body.planId(planId) }

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /** Migrate only subscriptions currently on these plan versions. */
        fun planVersionNumbers(planVersionNumbers: List<Long>?) = apply {
            body.planVersionNumbers(planVersionNumbers)
        }

        /**
         * Sets [Builder.planVersionNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planVersionNumbers] with a well-typed `List<Long>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun planVersionNumbers(planVersionNumbers: JsonField<List<Long>>) = apply {
            body.planVersionNumbers(planVersionNumbers)
        }

        /**
         * Adds a single [Long] to [planVersionNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPlanVersionNumber(planVersionNumber: Long) = apply {
            body.addPlanVersionNumber(planVersionNumber)
        }

        /** Why the migration was created. */
        fun reason(reason: String?) = apply { body.reason(reason) }

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { body.reason(reason) }

        /** Migrate subscriptions with these statuses. Defaults to active subscriptions. */
        fun statuses(statuses: List<Status>) = apply { body.statuses(statuses) }

        /**
         * Sets [Builder.statuses] to an arbitrary JSON value.
         *
         * You should usually call [Builder.statuses] with a well-typed `List<Status>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun statuses(statuses: JsonField<List<Status>>) = apply { body.statuses(statuses) }

        /**
         * Adds a single [Status] to [statuses].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addStatus(status: Status) = apply { body.addStatus(status) }

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

        /**
         * Returns an immutable instance of [MigrationCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .effectiveTime()
         * .targetPlanVersionNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MigrationCreateParams =
            MigrationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val effectiveTime: JsonField<EffectiveTime>,
        private val targetPlanVersionNumber: JsonField<Long>,
        private val allowInvoiceCreditOrVoid: JsonField<Boolean>,
        private val canDeferBilling: JsonField<Boolean>,
        private val effectiveDate: JsonField<LocalDate>,
        private val excludedSubscriptionIds: JsonField<List<String>>,
        private val externalPlanId: JsonField<String>,
        private val inTrial: JsonField<Boolean>,
        private val includedSubscriptionIds: JsonField<List<String>>,
        private val planId: JsonField<String>,
        private val planVersionNumbers: JsonField<List<Long>>,
        private val reason: JsonField<String>,
        private val statuses: JsonField<List<Status>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("effective_time")
            @ExcludeMissing
            effectiveTime: JsonField<EffectiveTime> = JsonMissing.of(),
            @JsonProperty("target_plan_version_number")
            @ExcludeMissing
            targetPlanVersionNumber: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("allow_invoice_credit_or_void")
            @ExcludeMissing
            allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("can_defer_billing")
            @ExcludeMissing
            canDeferBilling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("effective_date")
            @ExcludeMissing
            effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("excluded_subscription_ids")
            @ExcludeMissing
            excludedSubscriptionIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("external_plan_id")
            @ExcludeMissing
            externalPlanId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("in_trial")
            @ExcludeMissing
            inTrial: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("included_subscription_ids")
            @ExcludeMissing
            includedSubscriptionIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("plan_version_numbers")
            @ExcludeMissing
            planVersionNumbers: JsonField<List<Long>> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("statuses")
            @ExcludeMissing
            statuses: JsonField<List<Status>> = JsonMissing.of(),
        ) : this(
            effectiveTime,
            targetPlanVersionNumber,
            allowInvoiceCreditOrVoid,
            canDeferBilling,
            effectiveDate,
            excludedSubscriptionIds,
            externalPlanId,
            inTrial,
            includedSubscriptionIds,
            planId,
            planVersionNumbers,
            reason,
            statuses,
            mutableMapOf(),
        )

        /**
         * When the migration takes effect: 'immediately', 'requested_date' on `effective_date`,
         * 'start_of_term' or 'end_of_term' for the start or end of each subscription's current
         * billing period, or 'start_of_invoice' or 'end_of_invoice' for the start of its current or
         * next invoice.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectiveTime(): EffectiveTime = effectiveTime.getRequired("effective_time")

        /**
         * The plan version to migrate subscriptions to. It can't be a draft version.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun targetPlanVersionNumber(): Long =
            targetPlanVersionNumber.getRequired("target_plan_version_number")

        /**
         * When false, a subscription whose migration would void an issued invoice or create a
         * credit note fails instead.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowInvoiceCreditOrVoid(): Boolean? =
            allowInvoiceCreditOrVoid.getNullable("allow_invoice_credit_or_void")

        /**
         * When true, an in-arrears price the migration ends mid-cycle bills its final line item on
         * the next scheduled invoice instead of on its end date.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun canDeferBilling(): Boolean? = canDeferBilling.getNullable("can_defer_billing")

        /**
         * The date the migration takes effect, at midnight in each customer's timezone. Required
         * when `effective_time` is `requested_date`, and not allowed otherwise.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun effectiveDate(): LocalDate? = effectiveDate.getNullable("effective_date")

        /**
         * Leave these subscriptions out. Can't be combined with `included_subscription_ids`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun excludedSubscriptionIds(): List<String>? =
            excludedSubscriptionIds.getNullable("excluded_subscription_ids")

        /**
         * The external ID of the plan whose subscriptions to migrate.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPlanId(): String? = externalPlanId.getNullable("external_plan_id")

        /**
         * `true` migrates only subscriptions in a trial, `false` only subscriptions not in a trial.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun inTrial(): Boolean? = inTrial.getNullable("in_trial")

        /**
         * Migrate only these subscriptions. When set, the filters below are ignored.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun includedSubscriptionIds(): List<String>? =
            includedSubscriptionIds.getNullable("included_subscription_ids")

        /**
         * The plan whose subscriptions to migrate. Exactly one of `plan_id` and `external_plan_id`
         * is required.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planId(): String? = planId.getNullable("plan_id")

        /**
         * Migrate only subscriptions currently on these plan versions.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun planVersionNumbers(): List<Long>? =
            planVersionNumbers.getNullable("plan_version_numbers")

        /**
         * Why the migration was created.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun reason(): String? = reason.getNullable("reason")

        /**
         * Migrate subscriptions with these statuses. Defaults to active subscriptions.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun statuses(): List<Status>? = statuses.getNullable("statuses")

        /**
         * Returns the raw JSON value of [effectiveTime].
         *
         * Unlike [effectiveTime], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_time")
        @ExcludeMissing
        fun _effectiveTime(): JsonField<EffectiveTime> = effectiveTime

        /**
         * Returns the raw JSON value of [targetPlanVersionNumber].
         *
         * Unlike [targetPlanVersionNumber], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("target_plan_version_number")
        @ExcludeMissing
        fun _targetPlanVersionNumber(): JsonField<Long> = targetPlanVersionNumber

        /**
         * Returns the raw JSON value of [allowInvoiceCreditOrVoid].
         *
         * Unlike [allowInvoiceCreditOrVoid], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_invoice_credit_or_void")
        @ExcludeMissing
        fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = allowInvoiceCreditOrVoid

        /**
         * Returns the raw JSON value of [canDeferBilling].
         *
         * Unlike [canDeferBilling], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("can_defer_billing")
        @ExcludeMissing
        fun _canDeferBilling(): JsonField<Boolean> = canDeferBilling

        /**
         * Returns the raw JSON value of [effectiveDate].
         *
         * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /**
         * Returns the raw JSON value of [excludedSubscriptionIds].
         *
         * Unlike [excludedSubscriptionIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("excluded_subscription_ids")
        @ExcludeMissing
        fun _excludedSubscriptionIds(): JsonField<List<String>> = excludedSubscriptionIds

        /**
         * Returns the raw JSON value of [externalPlanId].
         *
         * Unlike [externalPlanId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_plan_id")
        @ExcludeMissing
        fun _externalPlanId(): JsonField<String> = externalPlanId

        /**
         * Returns the raw JSON value of [inTrial].
         *
         * Unlike [inTrial], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("in_trial") @ExcludeMissing fun _inTrial(): JsonField<Boolean> = inTrial

        /**
         * Returns the raw JSON value of [includedSubscriptionIds].
         *
         * Unlike [includedSubscriptionIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("included_subscription_ids")
        @ExcludeMissing
        fun _includedSubscriptionIds(): JsonField<List<String>> = includedSubscriptionIds

        /**
         * Returns the raw JSON value of [planId].
         *
         * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

        /**
         * Returns the raw JSON value of [planVersionNumbers].
         *
         * Unlike [planVersionNumbers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("plan_version_numbers")
        @ExcludeMissing
        fun _planVersionNumbers(): JsonField<List<Long>> = planVersionNumbers

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [statuses].
         *
         * Unlike [statuses], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("statuses")
        @ExcludeMissing
        fun _statuses(): JsonField<List<Status>> = statuses

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .effectiveTime()
             * .targetPlanVersionNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var effectiveTime: JsonField<EffectiveTime>? = null
            private var targetPlanVersionNumber: JsonField<Long>? = null
            private var allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of()
            private var canDeferBilling: JsonField<Boolean> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var excludedSubscriptionIds: JsonField<MutableList<String>>? = null
            private var externalPlanId: JsonField<String> = JsonMissing.of()
            private var inTrial: JsonField<Boolean> = JsonMissing.of()
            private var includedSubscriptionIds: JsonField<MutableList<String>>? = null
            private var planId: JsonField<String> = JsonMissing.of()
            private var planVersionNumbers: JsonField<MutableList<Long>>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var statuses: JsonField<MutableList<Status>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                effectiveTime = body.effectiveTime
                targetPlanVersionNumber = body.targetPlanVersionNumber
                allowInvoiceCreditOrVoid = body.allowInvoiceCreditOrVoid
                canDeferBilling = body.canDeferBilling
                effectiveDate = body.effectiveDate
                excludedSubscriptionIds = body.excludedSubscriptionIds.map { it.toMutableList() }
                externalPlanId = body.externalPlanId
                inTrial = body.inTrial
                includedSubscriptionIds = body.includedSubscriptionIds.map { it.toMutableList() }
                planId = body.planId
                planVersionNumbers = body.planVersionNumbers.map { it.toMutableList() }
                reason = body.reason
                statuses = body.statuses.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * When the migration takes effect: 'immediately', 'requested_date' on `effective_date`,
             * 'start_of_term' or 'end_of_term' for the start or end of each subscription's current
             * billing period, or 'start_of_invoice' or 'end_of_invoice' for the start of its
             * current or next invoice.
             */
            fun effectiveTime(effectiveTime: EffectiveTime) =
                effectiveTime(JsonField.of(effectiveTime))

            /**
             * Sets [Builder.effectiveTime] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveTime] with a well-typed [EffectiveTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveTime(effectiveTime: JsonField<EffectiveTime>) = apply {
                this.effectiveTime = effectiveTime
            }

            /** The plan version to migrate subscriptions to. It can't be a draft version. */
            fun targetPlanVersionNumber(targetPlanVersionNumber: Long) =
                targetPlanVersionNumber(JsonField.of(targetPlanVersionNumber))

            /**
             * Sets [Builder.targetPlanVersionNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.targetPlanVersionNumber] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun targetPlanVersionNumber(targetPlanVersionNumber: JsonField<Long>) = apply {
                this.targetPlanVersionNumber = targetPlanVersionNumber
            }

            /**
             * When false, a subscription whose migration would void an issued invoice or create a
             * credit note fails instead.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
                allowInvoiceCreditOrVoid(JsonField.of(allowInvoiceCreditOrVoid))

            /**
             * Sets [Builder.allowInvoiceCreditOrVoid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowInvoiceCreditOrVoid] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
                this.allowInvoiceCreditOrVoid = allowInvoiceCreditOrVoid
            }

            /**
             * When true, an in-arrears price the migration ends mid-cycle bills its final line item
             * on the next scheduled invoice instead of on its end date.
             */
            fun canDeferBilling(canDeferBilling: Boolean) =
                canDeferBilling(JsonField.of(canDeferBilling))

            /**
             * Sets [Builder.canDeferBilling] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canDeferBilling] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canDeferBilling(canDeferBilling: JsonField<Boolean>) = apply {
                this.canDeferBilling = canDeferBilling
            }

            /**
             * The date the migration takes effect, at midnight in each customer's timezone.
             * Required when `effective_time` is `requested_date`, and not allowed otherwise.
             */
            fun effectiveDate(effectiveDate: LocalDate?) =
                effectiveDate(JsonField.ofNullable(effectiveDate))

            /**
             * Sets [Builder.effectiveDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * Leave these subscriptions out. Can't be combined with `included_subscription_ids`.
             */
            fun excludedSubscriptionIds(excludedSubscriptionIds: List<String>?) =
                excludedSubscriptionIds(JsonField.ofNullable(excludedSubscriptionIds))

            /**
             * Sets [Builder.excludedSubscriptionIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludedSubscriptionIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun excludedSubscriptionIds(excludedSubscriptionIds: JsonField<List<String>>) = apply {
                this.excludedSubscriptionIds = excludedSubscriptionIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [excludedSubscriptionIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addExcludedSubscriptionId(excludedSubscriptionId: String) = apply {
                excludedSubscriptionIds =
                    (excludedSubscriptionIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("excludedSubscriptionIds", it).add(excludedSubscriptionId)
                    }
            }

            /** The external ID of the plan whose subscriptions to migrate. */
            fun externalPlanId(externalPlanId: String?) =
                externalPlanId(JsonField.ofNullable(externalPlanId))

            /**
             * Sets [Builder.externalPlanId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPlanId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPlanId(externalPlanId: JsonField<String>) = apply {
                this.externalPlanId = externalPlanId
            }

            /**
             * `true` migrates only subscriptions in a trial, `false` only subscriptions not in a
             * trial.
             */
            fun inTrial(inTrial: Boolean?) = inTrial(JsonField.ofNullable(inTrial))

            /**
             * Alias for [Builder.inTrial].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun inTrial(inTrial: Boolean) = inTrial(inTrial as Boolean?)

            /**
             * Sets [Builder.inTrial] to an arbitrary JSON value.
             *
             * You should usually call [Builder.inTrial] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun inTrial(inTrial: JsonField<Boolean>) = apply { this.inTrial = inTrial }

            /** Migrate only these subscriptions. When set, the filters below are ignored. */
            fun includedSubscriptionIds(includedSubscriptionIds: List<String>?) =
                includedSubscriptionIds(JsonField.ofNullable(includedSubscriptionIds))

            /**
             * Sets [Builder.includedSubscriptionIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includedSubscriptionIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun includedSubscriptionIds(includedSubscriptionIds: JsonField<List<String>>) = apply {
                this.includedSubscriptionIds = includedSubscriptionIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [includedSubscriptionIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIncludedSubscriptionId(includedSubscriptionId: String) = apply {
                includedSubscriptionIds =
                    (includedSubscriptionIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("includedSubscriptionIds", it).add(includedSubscriptionId)
                    }
            }

            /**
             * The plan whose subscriptions to migrate. Exactly one of `plan_id` and
             * `external_plan_id` is required.
             */
            fun planId(planId: String?) = planId(JsonField.ofNullable(planId))

            /**
             * Sets [Builder.planId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

            /** Migrate only subscriptions currently on these plan versions. */
            fun planVersionNumbers(planVersionNumbers: List<Long>?) =
                planVersionNumbers(JsonField.ofNullable(planVersionNumbers))

            /**
             * Sets [Builder.planVersionNumbers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.planVersionNumbers] with a well-typed `List<Long>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun planVersionNumbers(planVersionNumbers: JsonField<List<Long>>) = apply {
                this.planVersionNumbers = planVersionNumbers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Long] to [planVersionNumbers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPlanVersionNumber(planVersionNumber: Long) = apply {
                planVersionNumbers =
                    (planVersionNumbers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("planVersionNumbers", it).add(planVersionNumber)
                    }
            }

            /** Why the migration was created. */
            fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /** Migrate subscriptions with these statuses. Defaults to active subscriptions. */
            fun statuses(statuses: List<Status>) = statuses(JsonField.of(statuses))

            /**
             * Sets [Builder.statuses] to an arbitrary JSON value.
             *
             * You should usually call [Builder.statuses] with a well-typed `List<Status>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun statuses(statuses: JsonField<List<Status>>) = apply {
                this.statuses = statuses.map { it.toMutableList() }
            }

            /**
             * Adds a single [Status] to [statuses].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addStatus(status: Status) = apply {
                statuses =
                    (statuses ?: JsonField.of(mutableListOf())).also {
                        checkKnown("statuses", it).add(status)
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .effectiveTime()
             * .targetPlanVersionNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("effectiveTime", effectiveTime),
                    checkRequired("targetPlanVersionNumber", targetPlanVersionNumber),
                    allowInvoiceCreditOrVoid,
                    canDeferBilling,
                    effectiveDate,
                    (excludedSubscriptionIds ?: JsonMissing.of()).map { it.toImmutable() },
                    externalPlanId,
                    inTrial,
                    (includedSubscriptionIds ?: JsonMissing.of()).map { it.toImmutable() },
                    planId,
                    (planVersionNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                    reason,
                    (statuses ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            effectiveTime().validate()
            targetPlanVersionNumber()
            allowInvoiceCreditOrVoid()
            canDeferBilling()
            effectiveDate()
            excludedSubscriptionIds()
            externalPlanId()
            inTrial()
            includedSubscriptionIds()
            planId()
            planVersionNumbers()
            reason()
            statuses()?.forEach { it.validate() }
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
            (effectiveTime.asKnown()?.validity() ?: 0) +
                (if (targetPlanVersionNumber.asKnown() == null) 0 else 1) +
                (if (allowInvoiceCreditOrVoid.asKnown() == null) 0 else 1) +
                (if (canDeferBilling.asKnown() == null) 0 else 1) +
                (if (effectiveDate.asKnown() == null) 0 else 1) +
                (excludedSubscriptionIds.asKnown()?.size ?: 0) +
                (if (externalPlanId.asKnown() == null) 0 else 1) +
                (if (inTrial.asKnown() == null) 0 else 1) +
                (includedSubscriptionIds.asKnown()?.size ?: 0) +
                (if (planId.asKnown() == null) 0 else 1) +
                (planVersionNumbers.asKnown()?.size ?: 0) +
                (if (reason.asKnown() == null) 0 else 1) +
                (statuses.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                effectiveTime == other.effectiveTime &&
                targetPlanVersionNumber == other.targetPlanVersionNumber &&
                allowInvoiceCreditOrVoid == other.allowInvoiceCreditOrVoid &&
                canDeferBilling == other.canDeferBilling &&
                effectiveDate == other.effectiveDate &&
                excludedSubscriptionIds == other.excludedSubscriptionIds &&
                externalPlanId == other.externalPlanId &&
                inTrial == other.inTrial &&
                includedSubscriptionIds == other.includedSubscriptionIds &&
                planId == other.planId &&
                planVersionNumbers == other.planVersionNumbers &&
                reason == other.reason &&
                statuses == other.statuses &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                effectiveTime,
                targetPlanVersionNumber,
                allowInvoiceCreditOrVoid,
                canDeferBilling,
                effectiveDate,
                excludedSubscriptionIds,
                externalPlanId,
                inTrial,
                includedSubscriptionIds,
                planId,
                planVersionNumbers,
                reason,
                statuses,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{effectiveTime=$effectiveTime, targetPlanVersionNumber=$targetPlanVersionNumber, allowInvoiceCreditOrVoid=$allowInvoiceCreditOrVoid, canDeferBilling=$canDeferBilling, effectiveDate=$effectiveDate, excludedSubscriptionIds=$excludedSubscriptionIds, externalPlanId=$externalPlanId, inTrial=$inTrial, includedSubscriptionIds=$includedSubscriptionIds, planId=$planId, planVersionNumbers=$planVersionNumbers, reason=$reason, statuses=$statuses, additionalProperties=$additionalProperties}"
    }

    /**
     * When the migration takes effect: 'immediately', 'requested_date' on `effective_date`,
     * 'start_of_term' or 'end_of_term' for the start or end of each subscription's current billing
     * period, or 'start_of_invoice' or 'end_of_invoice' for the start of its current or next
     * invoice.
     */
    class EffectiveTime @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val IMMEDIATELY = of("immediately")

            val REQUESTED_DATE = of("requested_date")

            val START_OF_TERM = of("start_of_term")

            val END_OF_TERM = of("end_of_term")

            val START_OF_INVOICE = of("start_of_invoice")

            val END_OF_INVOICE = of("end_of_invoice")

            fun of(value: String) = EffectiveTime(JsonField.of(value))
        }

        /** An enum containing [EffectiveTime]'s known values. */
        enum class Known {
            IMMEDIATELY,
            REQUESTED_DATE,
            START_OF_TERM,
            END_OF_TERM,
            START_OF_INVOICE,
            END_OF_INVOICE,
        }

        /**
         * An enum containing [EffectiveTime]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EffectiveTime] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            IMMEDIATELY,
            REQUESTED_DATE,
            START_OF_TERM,
            END_OF_TERM,
            START_OF_INVOICE,
            END_OF_INVOICE,
            /**
             * An enum member indicating that [EffectiveTime] was instantiated with an unknown
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
                IMMEDIATELY -> Value.IMMEDIATELY
                REQUESTED_DATE -> Value.REQUESTED_DATE
                START_OF_TERM -> Value.START_OF_TERM
                END_OF_TERM -> Value.END_OF_TERM
                START_OF_INVOICE -> Value.START_OF_INVOICE
                END_OF_INVOICE -> Value.END_OF_INVOICE
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
                IMMEDIATELY -> Known.IMMEDIATELY
                REQUESTED_DATE -> Known.REQUESTED_DATE
                START_OF_TERM -> Known.START_OF_TERM
                END_OF_TERM -> Known.END_OF_TERM
                START_OF_INVOICE -> Known.START_OF_INVOICE
                END_OF_INVOICE -> Known.END_OF_INVOICE
                else -> throw OrbInvalidDataException("Unknown EffectiveTime: $value")
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
        fun validate(): EffectiveTime = apply {
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

            return other is EffectiveTime && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            val UPCOMING = of("upcoming")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            UPCOMING,
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
            UPCOMING,
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
                UPCOMING -> Value.UPCOMING
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
                UPCOMING -> Known.UPCOMING
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MigrationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "MigrationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
