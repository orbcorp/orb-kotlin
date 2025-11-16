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
import com.withorb.api.core.Params
import com.withorb.api.core.allMaxBy
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * This endpoint is used to add and edit subscription
 * [price intervals](/api-reference/price-interval/add-or-edit-price-intervals). By making
 * modifications to a subscription’s price intervals, you can
 * [flexibly and atomically control the billing behavior of a subscription](/product-catalog/modifying-subscriptions).
 *
 * ## Adding price intervals
 *
 * Prices can be added as price intervals to a subscription by specifying them in the `add` array. A
 * `price_id` or `external_price_id` from an add-on price or previously removed plan price can be
 * specified to reuse an existing price definition (however, please note that prices from other
 * plans cannot be added to the subscription). Additionally, a new price can be specified using the
 * `price` field — this price will be created automatically.
 *
 * A `start_date` must be specified for the price interval. This is the date when the price will
 * start billing on the subscription, so this will notably result in an immediate charge at this
 * time for any billed in advance fixed fees. The `end_date` will default to null, resulting in a
 * price interval that will bill on a continually recurring basis. Both of these dates can be set in
 * the past or the future and Orb will generate or modify invoices to ensure the subscription’s
 * invoicing behavior is correct.
 *
 * Additionally, a discount, minimum, or maximum can be specified on the price interval. This will
 * only apply to this price interval, not any other price intervals on the subscription.
 *
 * ## Adjustment intervals
 *
 * An adjustment interval represents the time period that a particular adjustment (a discount,
 * minimum, or maximum) applies to the prices on a subscription. Adjustment intervals can be added
 * to a subscription by specifying them in the `add_adjustments` array, or modified via the
 * `edit_adjustments` array. When creating an adjustment interval, you'll need to provide the
 * definition of the new adjustment (the type of adjustment, and which prices it applies to), as
 * well as the start and end dates for the adjustment interval. The start and end dates of an
 * existing adjustment interval can be edited via the `edit_adjustments` field (just like price
 * intervals). (To "change" the amount of a discount, minimum, or maximum, then, you'll need to end
 * the existing interval, and create a new adjustment interval with the new amount and a start date
 * that matches the end date of the previous interval.)
 *
 * ## Editing price intervals
 *
 * Price intervals can be adjusted by specifying edits to make in the `edit` array. A
 * `price_interval_id` to edit must be specified — this can be retrieved from the `price_intervals`
 * field on the subscription.
 *
 * A new `start_date` or `end_date` can be specified to change the range of the price interval,
 * which will modify past or future invoices to ensure correctness. If either of these dates are
 * unspecified, they will default to the existing date on the price interval. To remove a price
 * interval entirely from a subscription, set the `end_date` to be equivalent to the `start_date`.
 *
 * ## Fixed fee quantity transitions
 * The fixed fee quantity transitions for a fixed fee price interval can also be specified when
 * adding or editing by passing an array for `fixed_fee_quantity_transitions`. A fixed fee quantity
 * transition must have a `quantity` and an `effective_date`, which is the date after which the new
 * quantity will be used for billing. If a fixed fee quantity transition is scheduled at a billing
 * period boundary, the full quantity will be billed on an invoice with the other prices on the
 * subscription. If the fixed fee quantity transition is scheduled mid-billing period, the
 * difference between the existing quantity and quantity specified in the transition will be
 * prorated for the rest of the billing period and billed immediately, which will generate a new
 * invoice.
 *
 * Notably, the list of fixed fee quantity transitions passed will overwrite the existing fixed fee
 * quantity transitions on the price interval, so the entire list of transitions must be specified
 * to add additional transitions. The existing list of transitions can be retrieved using the
 * `fixed_fee_quantity_transitions` property on a subscription’s serialized price intervals.
 */
class SubscriptionPriceIntervalsParams
private constructor(
    private val subscriptionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String? = subscriptionId

    /**
     * A list of price intervals to add to the subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun add(): List<Add>? = body.add()

    /**
     * A list of adjustments to add to the subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun addAdjustments(): List<AddAdjustment>? = body.addAdjustments()

    /**
     * If false, this request will fail if it would void an issued invoice or create a credit note.
     * Consider using this as a safety mechanism if you do not expect existing invoices to be
     * changed.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun allowInvoiceCreditOrVoid(): Boolean? = body.allowInvoiceCreditOrVoid()

    /**
     * If true, ending an in-arrears price interval mid-cycle will defer billing the final line
     * itemuntil the next scheduled invoice. If false, it will be billed on its end date. If not
     * provided, behaviorwill follow account default.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun canDeferBilling(): Boolean? = body.canDeferBilling()

    /**
     * A list of price intervals to edit on the subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun edit(): List<Edit>? = body.edit()

    /**
     * A list of adjustments to edit on the subscription.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun editAdjustments(): List<EditAdjustment>? = body.editAdjustments()

    /**
     * Returns the raw JSON value of [add].
     *
     * Unlike [add], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _add(): JsonField<List<Add>> = body._add()

    /**
     * Returns the raw JSON value of [addAdjustments].
     *
     * Unlike [addAdjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addAdjustments(): JsonField<List<AddAdjustment>> = body._addAdjustments()

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
     * Returns the raw JSON value of [edit].
     *
     * Unlike [edit], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _edit(): JsonField<List<Edit>> = body._edit()

    /**
     * Returns the raw JSON value of [editAdjustments].
     *
     * Unlike [editAdjustments], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _editAdjustments(): JsonField<List<EditAdjustment>> = body._editAdjustments()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SubscriptionPriceIntervalsParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionPriceIntervalsParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionPriceIntervalsParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionPriceIntervalsParams: SubscriptionPriceIntervalsParams) =
            apply {
                subscriptionId = subscriptionPriceIntervalsParams.subscriptionId
                body = subscriptionPriceIntervalsParams.body.toBuilder()
                additionalHeaders = subscriptionPriceIntervalsParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    subscriptionPriceIntervalsParams.additionalQueryParams.toBuilder()
            }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [add]
         * - [addAdjustments]
         * - [allowInvoiceCreditOrVoid]
         * - [canDeferBilling]
         * - [edit]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** A list of price intervals to add to the subscription. */
        fun add(add: List<Add>) = apply { body.add(add) }

        /**
         * Sets [Builder.add] to an arbitrary JSON value.
         *
         * You should usually call [Builder.add] with a well-typed `List<Add>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun add(add: JsonField<List<Add>>) = apply { body.add(add) }

        /**
         * Adds a single [Add] to [Builder.add].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAdd(add: Add) = apply { body.addAdd(add) }

        /** A list of adjustments to add to the subscription. */
        fun addAdjustments(addAdjustments: List<AddAdjustment>) = apply {
            body.addAdjustments(addAdjustments)
        }

        /**
         * Sets [Builder.addAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addAdjustments] with a well-typed `List<AddAdjustment>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
            body.addAdjustments(addAdjustments)
        }

        /**
         * Adds a single [AddAdjustment] to [addAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddAdjustment(addAdjustment: AddAdjustment) = apply {
            body.addAddAdjustment(addAdjustment)
        }

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean?) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /**
         * Alias for [Builder.allowInvoiceCreditOrVoid].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
            allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

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
         * If true, ending an in-arrears price interval mid-cycle will defer billing the final line
         * itemuntil the next scheduled invoice. If false, it will be billed on its end date. If not
         * provided, behaviorwill follow account default.
         */
        fun canDeferBilling(canDeferBilling: Boolean?) = apply {
            body.canDeferBilling(canDeferBilling)
        }

        /**
         * Alias for [Builder.canDeferBilling].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun canDeferBilling(canDeferBilling: Boolean) = canDeferBilling(canDeferBilling as Boolean?)

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

        /** A list of price intervals to edit on the subscription. */
        fun edit(edit: List<Edit>) = apply { body.edit(edit) }

        /**
         * Sets [Builder.edit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.edit] with a well-typed `List<Edit>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun edit(edit: JsonField<List<Edit>>) = apply { body.edit(edit) }

        /**
         * Adds a single [Edit] to [Builder.edit].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEdit(edit: Edit) = apply { body.addEdit(edit) }

        /** A list of adjustments to edit on the subscription. */
        fun editAdjustments(editAdjustments: List<EditAdjustment>) = apply {
            body.editAdjustments(editAdjustments)
        }

        /**
         * Sets [Builder.editAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.editAdjustments] with a well-typed
         * `List<EditAdjustment>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun editAdjustments(editAdjustments: JsonField<List<EditAdjustment>>) = apply {
            body.editAdjustments(editAdjustments)
        }

        /**
         * Adds a single [EditAdjustment] to [editAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEditAdjustment(editAdjustment: EditAdjustment) = apply {
            body.addEditAdjustment(editAdjustment)
        }

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
         * Returns an immutable instance of [SubscriptionPriceIntervalsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionPriceIntervalsParams =
            SubscriptionPriceIntervalsParams(
                subscriptionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val add: JsonField<List<Add>>,
        private val addAdjustments: JsonField<List<AddAdjustment>>,
        private val allowInvoiceCreditOrVoid: JsonField<Boolean>,
        private val canDeferBilling: JsonField<Boolean>,
        private val edit: JsonField<List<Edit>>,
        private val editAdjustments: JsonField<List<EditAdjustment>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("add") @ExcludeMissing add: JsonField<List<Add>> = JsonMissing.of(),
            @JsonProperty("add_adjustments")
            @ExcludeMissing
            addAdjustments: JsonField<List<AddAdjustment>> = JsonMissing.of(),
            @JsonProperty("allow_invoice_credit_or_void")
            @ExcludeMissing
            allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("can_defer_billing")
            @ExcludeMissing
            canDeferBilling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("edit") @ExcludeMissing edit: JsonField<List<Edit>> = JsonMissing.of(),
            @JsonProperty("edit_adjustments")
            @ExcludeMissing
            editAdjustments: JsonField<List<EditAdjustment>> = JsonMissing.of(),
        ) : this(
            add,
            addAdjustments,
            allowInvoiceCreditOrVoid,
            canDeferBilling,
            edit,
            editAdjustments,
            mutableMapOf(),
        )

        /**
         * A list of price intervals to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun add(): List<Add>? = add.getNullable("add")

        /**
         * A list of adjustments to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun addAdjustments(): List<AddAdjustment>? = addAdjustments.getNullable("add_adjustments")

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allowInvoiceCreditOrVoid(): Boolean? =
            allowInvoiceCreditOrVoid.getNullable("allow_invoice_credit_or_void")

        /**
         * If true, ending an in-arrears price interval mid-cycle will defer billing the final line
         * itemuntil the next scheduled invoice. If false, it will be billed on its end date. If not
         * provided, behaviorwill follow account default.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun canDeferBilling(): Boolean? = canDeferBilling.getNullable("can_defer_billing")

        /**
         * A list of price intervals to edit on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun edit(): List<Edit>? = edit.getNullable("edit")

        /**
         * A list of adjustments to edit on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun editAdjustments(): List<EditAdjustment>? =
            editAdjustments.getNullable("edit_adjustments")

        /**
         * Returns the raw JSON value of [add].
         *
         * Unlike [add], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("add") @ExcludeMissing fun _add(): JsonField<List<Add>> = add

        /**
         * Returns the raw JSON value of [addAdjustments].
         *
         * Unlike [addAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        fun _addAdjustments(): JsonField<List<AddAdjustment>> = addAdjustments

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
         * Returns the raw JSON value of [edit].
         *
         * Unlike [edit], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("edit") @ExcludeMissing fun _edit(): JsonField<List<Edit>> = edit

        /**
         * Returns the raw JSON value of [editAdjustments].
         *
         * Unlike [editAdjustments], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("edit_adjustments")
        @ExcludeMissing
        fun _editAdjustments(): JsonField<List<EditAdjustment>> = editAdjustments

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var add: JsonField<MutableList<Add>>? = null
            private var addAdjustments: JsonField<MutableList<AddAdjustment>>? = null
            private var allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of()
            private var canDeferBilling: JsonField<Boolean> = JsonMissing.of()
            private var edit: JsonField<MutableList<Edit>>? = null
            private var editAdjustments: JsonField<MutableList<EditAdjustment>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                add = body.add.map { it.toMutableList() }
                addAdjustments = body.addAdjustments.map { it.toMutableList() }
                allowInvoiceCreditOrVoid = body.allowInvoiceCreditOrVoid
                canDeferBilling = body.canDeferBilling
                edit = body.edit.map { it.toMutableList() }
                editAdjustments = body.editAdjustments.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** A list of price intervals to add to the subscription. */
            fun add(add: List<Add>) = add(JsonField.of(add))

            /**
             * Sets [Builder.add] to an arbitrary JSON value.
             *
             * You should usually call [Builder.add] with a well-typed `List<Add>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun add(add: JsonField<List<Add>>) = apply { this.add = add.map { it.toMutableList() } }

            /**
             * Adds a single [Add] to [Builder.add].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAdd(add: Add) = apply {
                this.add =
                    (this.add ?: JsonField.of(mutableListOf())).also {
                        checkKnown("add", it).add(add)
                    }
            }

            /** A list of adjustments to add to the subscription. */
            fun addAdjustments(addAdjustments: List<AddAdjustment>) =
                addAdjustments(JsonField.of(addAdjustments))

            /**
             * Sets [Builder.addAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addAdjustments] with a well-typed
             * `List<AddAdjustment>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
                this.addAdjustments = addAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [AddAdjustment] to [addAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddAdjustment(addAdjustment: AddAdjustment) = apply {
                addAdjustments =
                    (addAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addAdjustments", it).add(addAdjustment)
                    }
            }

            /**
             * If false, this request will fail if it would void an issued invoice or create a
             * credit note. Consider using this as a safety mechanism if you do not expect existing
             * invoices to be changed.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean?) =
                allowInvoiceCreditOrVoid(JsonField.ofNullable(allowInvoiceCreditOrVoid))

            /**
             * Alias for [Builder.allowInvoiceCreditOrVoid].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
                allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

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
             * If true, ending an in-arrears price interval mid-cycle will defer billing the final
             * line itemuntil the next scheduled invoice. If false, it will be billed on its end
             * date. If not provided, behaviorwill follow account default.
             */
            fun canDeferBilling(canDeferBilling: Boolean?) =
                canDeferBilling(JsonField.ofNullable(canDeferBilling))

            /**
             * Alias for [Builder.canDeferBilling].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun canDeferBilling(canDeferBilling: Boolean) =
                canDeferBilling(canDeferBilling as Boolean?)

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

            /** A list of price intervals to edit on the subscription. */
            fun edit(edit: List<Edit>) = edit(JsonField.of(edit))

            /**
             * Sets [Builder.edit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.edit] with a well-typed `List<Edit>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun edit(edit: JsonField<List<Edit>>) = apply {
                this.edit = edit.map { it.toMutableList() }
            }

            /**
             * Adds a single [Edit] to [Builder.edit].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEdit(edit: Edit) = apply {
                this.edit =
                    (this.edit ?: JsonField.of(mutableListOf())).also {
                        checkKnown("edit", it).add(edit)
                    }
            }

            /** A list of adjustments to edit on the subscription. */
            fun editAdjustments(editAdjustments: List<EditAdjustment>) =
                editAdjustments(JsonField.of(editAdjustments))

            /**
             * Sets [Builder.editAdjustments] to an arbitrary JSON value.
             *
             * You should usually call [Builder.editAdjustments] with a well-typed
             * `List<EditAdjustment>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun editAdjustments(editAdjustments: JsonField<List<EditAdjustment>>) = apply {
                this.editAdjustments = editAdjustments.map { it.toMutableList() }
            }

            /**
             * Adds a single [EditAdjustment] to [editAdjustments].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEditAdjustment(editAdjustment: EditAdjustment) = apply {
                editAdjustments =
                    (editAdjustments ?: JsonField.of(mutableListOf())).also {
                        checkKnown("editAdjustments", it).add(editAdjustment)
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
             */
            fun build(): Body =
                Body(
                    (add ?: JsonMissing.of()).map { it.toImmutable() },
                    (addAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    allowInvoiceCreditOrVoid,
                    canDeferBilling,
                    (edit ?: JsonMissing.of()).map { it.toImmutable() },
                    (editAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            add()?.forEach { it.validate() }
            addAdjustments()?.forEach { it.validate() }
            allowInvoiceCreditOrVoid()
            canDeferBilling()
            edit()?.forEach { it.validate() }
            editAdjustments()?.forEach { it.validate() }
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
            (add.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (addAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (allowInvoiceCreditOrVoid.asKnown() == null) 0 else 1) +
                (if (canDeferBilling.asKnown() == null) 0 else 1) +
                (edit.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (editAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                add == other.add &&
                addAdjustments == other.addAdjustments &&
                allowInvoiceCreditOrVoid == other.allowInvoiceCreditOrVoid &&
                canDeferBilling == other.canDeferBilling &&
                edit == other.edit &&
                editAdjustments == other.editAdjustments &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                add,
                addAdjustments,
                allowInvoiceCreditOrVoid,
                canDeferBilling,
                edit,
                editAdjustments,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{add=$add, addAdjustments=$addAdjustments, allowInvoiceCreditOrVoid=$allowInvoiceCreditOrVoid, canDeferBilling=$canDeferBilling, edit=$edit, editAdjustments=$editAdjustments, additionalProperties=$additionalProperties}"
    }

    class Add
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val startDate: JsonField<StartDate>,
        private val allocationPrice: JsonField<NewAllocationPrice>,
        private val discounts: JsonField<List<Discount>>,
        private val endDate: JsonField<EndDate>,
        private val externalPriceId: JsonField<String>,
        private val filter: JsonField<String>,
        private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>,
        private val maximumAmount: JsonField<Double>,
        private val minimumAmount: JsonField<Double>,
        private val price: JsonField<Price>,
        private val priceId: JsonField<String>,
        private val usageCustomerIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<StartDate> = JsonMissing.of(),
            @JsonProperty("allocation_price")
            @ExcludeMissing
            allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            discounts: JsonField<List<Discount>> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<EndDate> = JsonMissing.of(),
            @JsonProperty("external_price_id")
            @ExcludeMissing
            externalPriceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fixed_fee_quantity_transitions")
            @ExcludeMissing
            fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
                JsonMissing.of(),
            @JsonProperty("maximum_amount")
            @ExcludeMissing
            maximumAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("minimum_amount")
            @ExcludeMissing
            minimumAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("price_id") @ExcludeMissing priceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("usage_customer_ids")
            @ExcludeMissing
            usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            startDate,
            allocationPrice,
            discounts,
            endDate,
            externalPriceId,
            filter,
            fixedFeeQuantityTransitions,
            maximumAmount,
            minimumAmount,
            price,
            priceId,
            usageCustomerIds,
            mutableMapOf(),
        )

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): StartDate = startDate.getRequired("start_date")

        /**
         * The definition of a new allocation price to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun allocationPrice(): NewAllocationPrice? = allocationPrice.getNullable("allocation_price")

        /**
         * A list of discounts to initialize on the price interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun discounts(): List<Discount>? = discounts.getNullable("discounts")

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): EndDate? = endDate.getNullable("end_date")

        /**
         * The external price id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filter(): String? = filter.getNullable("filter")

        /**
         * A list of fixed fee quantity transitions to initialize on the price interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fixedFeeQuantityTransitions(): List<FixedFeeQuantityTransition>? =
            fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")

        /**
         * The maximum amount that will be billed for this price interval for a given billing
         * period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun maximumAmount(): Double? = maximumAmount.getNullable("maximum_amount")

        /**
         * The minimum amount that will be billed for this price interval for a given billing
         * period.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun minimumAmount(): Double? = minimumAmount.getNullable("minimum_amount")

        /**
         * New floating price request body params.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun price(): Price? = price.getNullable("price")

        /**
         * The id of the price to add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun priceId(): String? = priceId.getNullable("price_id")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

        /**
         * Returns the raw JSON value of [allocationPrice].
         *
         * Unlike [allocationPrice], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allocation_price")
        @ExcludeMissing
        fun _allocationPrice(): JsonField<NewAllocationPrice> = allocationPrice

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<Discount>> = discounts

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<EndDate> = endDate

        /**
         * Returns the raw JSON value of [externalPriceId].
         *
         * Unlike [externalPriceId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [fixedFeeQuantityTransitions].
         *
         * Unlike [fixedFeeQuantityTransitions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions(): JsonField<List<FixedFeeQuantityTransition>> =
            fixedFeeQuantityTransitions

        /**
         * Returns the raw JSON value of [maximumAmount].
         *
         * Unlike [maximumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<Double> = maximumAmount

        /**
         * Returns the raw JSON value of [minimumAmount].
         *
         * Unlike [minimumAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<Double> = minimumAmount

        /**
         * Returns the raw JSON value of [price].
         *
         * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [priceId].
         *
         * Unlike [priceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        /**
         * Returns the raw JSON value of [usageCustomerIds].
         *
         * Unlike [usageCustomerIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

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
             * Returns a mutable builder for constructing an instance of [Add].
             *
             * The following fields are required:
             * ```kotlin
             * .startDate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Add]. */
        class Builder internal constructor() {

            private var startDate: JsonField<StartDate>? = null
            private var allocationPrice: JsonField<NewAllocationPrice> = JsonMissing.of()
            private var discounts: JsonField<MutableList<Discount>>? = null
            private var endDate: JsonField<EndDate> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var fixedFeeQuantityTransitions:
                JsonField<MutableList<FixedFeeQuantityTransition>>? =
                null
            private var maximumAmount: JsonField<Double> = JsonMissing.of()
            private var minimumAmount: JsonField<Double> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var priceId: JsonField<String> = JsonMissing.of()
            private var usageCustomerIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(add: Add) = apply {
                startDate = add.startDate
                allocationPrice = add.allocationPrice
                discounts = add.discounts.map { it.toMutableList() }
                endDate = add.endDate
                externalPriceId = add.externalPriceId
                filter = add.filter
                fixedFeeQuantityTransitions =
                    add.fixedFeeQuantityTransitions.map { it.toMutableList() }
                maximumAmount = add.maximumAmount
                minimumAmount = add.minimumAmount
                price = add.price
                priceId = add.priceId
                usageCustomerIds = add.usageCustomerIds.map { it.toMutableList() }
                additionalProperties = add.additionalProperties.toMutableMap()
            }

            /**
             * The start date of the price interval. This is the date that the price will start
             * billing on the subscription.
             */
            fun startDate(startDate: StartDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [StartDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<StartDate>) = apply { this.startDate = startDate }

            /** Alias for calling [startDate] with `StartDate.ofDateTime(dateTime)`. */
            fun startDate(dateTime: OffsetDateTime) = startDate(StartDate.ofDateTime(dateTime))

            /**
             * Alias for calling [startDate] with
             * `StartDate.ofBillingCycleRelative(billingCycleRelative)`.
             */
            fun startDate(billingCycleRelative: BillingCycleRelativeDate) =
                startDate(StartDate.ofBillingCycleRelative(billingCycleRelative))

            /** The definition of a new allocation price to create and add to the subscription. */
            fun allocationPrice(allocationPrice: NewAllocationPrice?) =
                allocationPrice(JsonField.ofNullable(allocationPrice))

            /**
             * Sets [Builder.allocationPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allocationPrice] with a well-typed
             * [NewAllocationPrice] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun allocationPrice(allocationPrice: JsonField<NewAllocationPrice>) = apply {
                this.allocationPrice = allocationPrice
            }

            /** A list of discounts to initialize on the price interval. */
            fun discounts(discounts: List<Discount>?) = discounts(JsonField.ofNullable(discounts))

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed `List<Discount>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discounts(discounts: JsonField<List<Discount>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Discount] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiscount(discount: Discount) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /** Alias for calling [addDiscount] with `Discount.ofAmount(amount)`. */
            fun addDiscount(amount: Discount.Amount) = addDiscount(Discount.ofAmount(amount))

            /**
             * Alias for calling [addDiscount] with the following:
             * ```kotlin
             * Discount.Amount.builder()
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun addAmountDiscount(amountDiscount: Double) =
                addDiscount(Discount.Amount.builder().amountDiscount(amountDiscount).build())

            /** Alias for calling [addDiscount] with `Discount.ofPercentage(percentage)`. */
            fun addDiscount(percentage: Discount.Percentage) =
                addDiscount(Discount.ofPercentage(percentage))

            /**
             * Alias for calling [addDiscount] with the following:
             * ```kotlin
             * Discount.Percentage.builder()
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun addPercentageDiscount(percentageDiscount: Double) =
                addDiscount(
                    Discount.Percentage.builder().percentageDiscount(percentageDiscount).build()
                )

            /** Alias for calling [addDiscount] with `Discount.ofUsage(usage)`. */
            fun addDiscount(usage: Discount.Usage) = addDiscount(Discount.ofUsage(usage))

            /**
             * Alias for calling [addDiscount] with the following:
             * ```kotlin
             * Discount.Usage.builder()
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun addUsageDiscount(usageDiscount: Double) =
                addDiscount(Discount.Usage.builder().usageDiscount(usageDiscount).build())

            /**
             * The end date of the price interval. This is the date that the price will stop billing
             * on the subscription.
             */
            fun endDate(endDate: EndDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [EndDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<EndDate>) = apply { this.endDate = endDate }

            /** Alias for calling [endDate] with `EndDate.ofDateTime(dateTime)`. */
            fun endDate(dateTime: OffsetDateTime) = endDate(EndDate.ofDateTime(dateTime))

            /**
             * Alias for calling [endDate] with
             * `EndDate.ofBillingCycleRelative(billingCycleRelative)`.
             */
            fun endDate(billingCycleRelative: BillingCycleRelativeDate) =
                endDate(EndDate.ofBillingCycleRelative(billingCycleRelative))

            /** The external price id of the price to add to the subscription. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /**
             * Sets [Builder.externalPriceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPriceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * An additional filter to apply to usage queries. This filter must be expressed as a
             * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
             * null, usage queries will not include any additional filter.
             */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /** A list of fixed fee quantity transitions to initialize on the price interval. */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?
            ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

            /**
             * Sets [Builder.fixedFeeQuantityTransitions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedFeeQuantityTransitions] with a well-typed
             * `List<FixedFeeQuantityTransition>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
            ) = apply {
                this.fixedFeeQuantityTransitions =
                    fixedFeeQuantityTransitions.map { it.toMutableList() }
            }

            /**
             * Adds a single [FixedFeeQuantityTransition] to [fixedFeeQuantityTransitions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFixedFeeQuantityTransition(
                fixedFeeQuantityTransition: FixedFeeQuantityTransition
            ) = apply {
                fixedFeeQuantityTransitions =
                    (fixedFeeQuantityTransitions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fixedFeeQuantityTransitions", it)
                            .add(fixedFeeQuantityTransition)
                    }
            }

            /**
             * The maximum amount that will be billed for this price interval for a given billing
             * period.
             */
            fun maximumAmount(maximumAmount: Double?) =
                maximumAmount(JsonField.ofNullable(maximumAmount))

            /**
             * Alias for [Builder.maximumAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maximumAmount(maximumAmount: Double) = maximumAmount(maximumAmount as Double?)

            /**
             * Sets [Builder.maximumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maximumAmount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maximumAmount(maximumAmount: JsonField<Double>) = apply {
                this.maximumAmount = maximumAmount
            }

            /**
             * The minimum amount that will be billed for this price interval for a given billing
             * period.
             */
            fun minimumAmount(minimumAmount: Double?) =
                minimumAmount(JsonField.ofNullable(minimumAmount))

            /**
             * Alias for [Builder.minimumAmount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun minimumAmount(minimumAmount: Double) = minimumAmount(minimumAmount as Double?)

            /**
             * Sets [Builder.minimumAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.minimumAmount] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun minimumAmount(minimumAmount: JsonField<Double>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** New floating price request body params. */
            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofUnit(unit)`. */
            fun price(unit: NewFloatingUnitPrice) = price(Price.ofUnit(unit))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewFloatingTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewFloatingBulkPrice) = price(Price.ofBulk(bulk))

            /** Alias for calling [price] with `Price.ofBulkWithFilters(bulkWithFilters)`. */
            fun price(bulkWithFilters: Price.BulkWithFilters) =
                price(Price.ofBulkWithFilters(bulkWithFilters))

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewFloatingPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewFloatingMatrixPrice) = price(Price.ofMatrix(matrix))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewFloatingTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewFloatingGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewFloatingPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewFloatingMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /**
             * Alias for calling [price] with `Price.ofTieredWithProration(tieredWithProration)`.
             */
            fun price(tieredWithProration: NewFloatingTieredWithProrationPrice) =
                price(Price.ofTieredWithProration(tieredWithProration))

            /** Alias for calling [price] with `Price.ofUnitWithProration(unitWithProration)`. */
            fun price(unitWithProration: NewFloatingUnitWithProrationPrice) =
                price(Price.ofUnitWithProration(unitWithProration))

            /** Alias for calling [price] with `Price.ofGroupedAllocation(groupedAllocation)`. */
            fun price(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                price(Price.ofGroupedAllocation(groupedAllocation))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum)`.
             */
            fun price(groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice) =
                price(Price.ofGroupedWithProratedMinimum(groupedWithProratedMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum)`.
             */
            fun price(groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice) =
                price(Price.ofGroupedWithMeteredMinimum(groupedWithMeteredMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)`.
             */
            fun price(groupedWithMinMaxThresholds: Price.GroupedWithMinMaxThresholds) =
                price(Price.ofGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds))

            /**
             * Alias for calling [price] with
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewFloatingGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)`.
             */
            fun price(
                scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
            ) = price(Price.ofScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing)`.
             */
            fun price(
                scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
            ) = price(Price.ofScalableMatrixWithTieredPricing(scalableMatrixWithTieredPricing))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk)`.
             */
            fun price(cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice) =
                price(Price.ofCumulativeGroupedBulk(cumulativeGroupedBulk))

            /**
             * Alias for calling [price] with
             * `Price.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation)`.
             */
            fun price(cumulativeGroupedAllocation: Price.CumulativeGroupedAllocation) =
                price(Price.ofCumulativeGroupedAllocation(cumulativeGroupedAllocation))

            /** Alias for calling [price] with `Price.ofMinimum(minimum)`. */
            fun price(minimum: NewFloatingMinimumCompositePrice) = price(Price.ofMinimum(minimum))

            /** Alias for calling [price] with `Price.ofPercent(percent)`. */
            fun price(percent: Price.Percent) = price(Price.ofPercent(percent))

            /** Alias for calling [price] with `Price.ofEventOutput(eventOutput)`. */
            fun price(eventOutput: Price.EventOutput) = price(Price.ofEventOutput(eventOutput))

            /** The id of the price to add to the subscription. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /**
             * Sets [Builder.priceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceId(priceId: JsonField<String>) = apply { this.priceId = priceId }

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
             */
            fun usageCustomerIds(usageCustomerIds: List<String>?) =
                usageCustomerIds(JsonField.ofNullable(usageCustomerIds))

            /**
             * Sets [Builder.usageCustomerIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageCustomerIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
                this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [usageCustomerIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsageCustomerId(usageCustomerId: String) = apply {
                usageCustomerIds =
                    (usageCustomerIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usageCustomerIds", it).add(usageCustomerId)
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
             * Returns an immutable instance of [Add].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Add =
                Add(
                    checkRequired("startDate", startDate),
                    allocationPrice,
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    endDate,
                    externalPriceId,
                    filter,
                    (fixedFeeQuantityTransitions ?: JsonMissing.of()).map { it.toImmutable() },
                    maximumAmount,
                    minimumAmount,
                    price,
                    priceId,
                    (usageCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Add = apply {
            if (validated) {
                return@apply
            }

            startDate().validate()
            allocationPrice()?.validate()
            discounts()?.forEach { it.validate() }
            endDate()?.validate()
            externalPriceId()
            filter()
            fixedFeeQuantityTransitions()?.forEach { it.validate() }
            maximumAmount()
            minimumAmount()
            price()?.validate()
            priceId()
            usageCustomerIds()
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
            (startDate.asKnown()?.validity() ?: 0) +
                (allocationPrice.asKnown()?.validity() ?: 0) +
                (discounts.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (endDate.asKnown()?.validity() ?: 0) +
                (if (externalPriceId.asKnown() == null) 0 else 1) +
                (if (filter.asKnown() == null) 0 else 1) +
                (fixedFeeQuantityTransitions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (maximumAmount.asKnown() == null) 0 else 1) +
                (if (minimumAmount.asKnown() == null) 0 else 1) +
                (price.asKnown()?.validity() ?: 0) +
                (if (priceId.asKnown() == null) 0 else 1) +
                (usageCustomerIds.asKnown()?.size ?: 0)

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription.
         */
        @JsonDeserialize(using = StartDate.Deserializer::class)
        @JsonSerialize(using = StartDate.Serializer::class)
        class StartDate
        private constructor(
            private val dateTime: OffsetDateTime? = null,
            private val billingCycleRelative: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dateTime(): OffsetDateTime? = dateTime

            fun billingCycleRelative(): BillingCycleRelativeDate? = billingCycleRelative

            fun isDateTime(): Boolean = dateTime != null

            fun isBillingCycleRelative(): Boolean = billingCycleRelative != null

            fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

            fun asBillingCycleRelative(): BillingCycleRelativeDate =
                billingCycleRelative.getOrThrow("billingCycleRelative")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): StartDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDateTime(dateTime: OffsetDateTime) {}

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) {
                            billingCycleRelative.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDateTime(dateTime: OffsetDateTime) = 1

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) = billingCycleRelative.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartDate &&
                    dateTime == other.dateTime &&
                    billingCycleRelative == other.billingCycleRelative
            }

            override fun hashCode(): Int = Objects.hash(dateTime, billingCycleRelative)

            override fun toString(): String =
                when {
                    dateTime != null -> "StartDate{dateTime=$dateTime}"
                    billingCycleRelative != null ->
                        "StartDate{billingCycleRelative=$billingCycleRelative}"
                    _json != null -> "StartDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StartDate")
                }

            companion object {

                fun ofDateTime(dateTime: OffsetDateTime) = StartDate(dateTime = dateTime)

                fun ofBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate) =
                    StartDate(billingCycleRelative = billingCycleRelative)
            }

            /**
             * An interface that defines how to map each variant of [StartDate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDateTime(dateTime: OffsetDateTime): T

                fun visitBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate): T

                /**
                 * Maps an unknown variant of [StartDate] to a value of type [T].
                 *
                 * An instance of [StartDate] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown StartDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<StartDate>(StartDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StartDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())
                                    ?.let { StartDate(billingCycleRelative = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    StartDate(dateTime = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> StartDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<StartDate>(StartDate::class) {

                override fun serialize(
                    value: StartDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dateTime != null -> generator.writeObject(value.dateTime)
                        value.billingCycleRelative != null ->
                            generator.writeObject(value.billingCycleRelative)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StartDate")
                    }
                }
            }
        }

        @JsonDeserialize(using = Discount.Deserializer::class)
        @JsonSerialize(using = Discount.Serializer::class)
        class Discount
        private constructor(
            private val amount: Amount? = null,
            private val percentage: Percentage? = null,
            private val usage: Usage? = null,
            private val _json: JsonValue? = null,
        ) {

            fun amount(): Amount? = amount

            fun percentage(): Percentage? = percentage

            fun usage(): Usage? = usage

            fun isAmount(): Boolean = amount != null

            fun isPercentage(): Boolean = percentage != null

            fun isUsage(): Boolean = usage != null

            fun asAmount(): Amount = amount.getOrThrow("amount")

            fun asPercentage(): Percentage = percentage.getOrThrow("percentage")

            fun asUsage(): Usage = usage.getOrThrow("usage")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    amount != null -> visitor.visitAmount(amount)
                    percentage != null -> visitor.visitPercentage(percentage)
                    usage != null -> visitor.visitUsage(usage)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Discount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitAmount(amount: Amount) {
                            amount.validate()
                        }

                        override fun visitPercentage(percentage: Percentage) {
                            percentage.validate()
                        }

                        override fun visitUsage(usage: Usage) {
                            usage.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitAmount(amount: Amount) = amount.validity()

                        override fun visitPercentage(percentage: Percentage) = percentage.validity()

                        override fun visitUsage(usage: Usage) = usage.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Discount &&
                    amount == other.amount &&
                    percentage == other.percentage &&
                    usage == other.usage
            }

            override fun hashCode(): Int = Objects.hash(amount, percentage, usage)

            override fun toString(): String =
                when {
                    amount != null -> "Discount{amount=$amount}"
                    percentage != null -> "Discount{percentage=$percentage}"
                    usage != null -> "Discount{usage=$usage}"
                    _json != null -> "Discount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Discount")
                }

            companion object {

                fun ofAmount(amount: Amount) = Discount(amount = amount)

                fun ofPercentage(percentage: Percentage) = Discount(percentage = percentage)

                fun ofUsage(usage: Usage) = Discount(usage = usage)
            }

            /**
             * An interface that defines how to map each variant of [Discount] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitAmount(amount: Amount): T

                fun visitPercentage(percentage: Percentage): T

                fun visitUsage(usage: Usage): T

                /**
                 * Maps an unknown variant of [Discount] to a value of type [T].
                 *
                 * An instance of [Discount] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Discount: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Discount>(Discount::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Discount {
                    val json = JsonValue.fromJsonNode(node)
                    val discountType = json.asObject()?.get("discount_type")?.asString()

                    when (discountType) {
                        "amount" -> {
                            return tryDeserialize(node, jacksonTypeRef<Amount>())?.let {
                                Discount(amount = it, _json = json)
                            } ?: Discount(_json = json)
                        }
                        "percentage" -> {
                            return tryDeserialize(node, jacksonTypeRef<Percentage>())?.let {
                                Discount(percentage = it, _json = json)
                            } ?: Discount(_json = json)
                        }
                        "usage" -> {
                            return tryDeserialize(node, jacksonTypeRef<Usage>())?.let {
                                Discount(usage = it, _json = json)
                            } ?: Discount(_json = json)
                        }
                    }

                    return Discount(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Discount>(Discount::class) {

                override fun serialize(
                    value: Discount,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.amount != null -> generator.writeObject(value.amount)
                        value.percentage != null -> generator.writeObject(value.percentage)
                        value.usage != null -> generator.writeObject(value.usage)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Discount")
                    }
                }
            }

            class Amount
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amountDiscount: JsonField<Double>,
                private val discountType: JsonValue,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount_discount")
                    @ExcludeMissing
                    amountDiscount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    discountType: JsonValue = JsonMissing.of(),
                ) : this(amountDiscount, discountType, mutableMapOf())

                /**
                 * Only available if discount_type is `amount`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amountDiscount(): Double = amountDiscount.getRequired("amount_discount")

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("amount")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("discount_type")
                @ExcludeMissing
                fun _discountType(): JsonValue = discountType

                /**
                 * Returns the raw JSON value of [amountDiscount].
                 *
                 * Unlike [amountDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount(): JsonField<Double> = amountDiscount

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
                     * Returns a mutable builder for constructing an instance of [Amount].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amountDiscount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Amount]. */
                class Builder internal constructor() {

                    private var amountDiscount: JsonField<Double>? = null
                    private var discountType: JsonValue = JsonValue.from("amount")
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(amount: Amount) = apply {
                        amountDiscount = amount.amountDiscount
                        discountType = amount.discountType
                        additionalProperties = amount.additionalProperties.toMutableMap()
                    }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: Double) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /**
                     * Sets [Builder.amountDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amountDiscount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun amountDiscount(amountDiscount: JsonField<Double>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("amount")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun discountType(discountType: JsonValue) = apply {
                        this.discountType = discountType
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
                     * Returns an immutable instance of [Amount].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amountDiscount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Amount =
                        Amount(
                            checkRequired("amountDiscount", amountDiscount),
                            discountType,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Amount = apply {
                    if (validated) {
                        return@apply
                    }

                    amountDiscount()
                    _discountType().let {
                        if (it != JsonValue.from("amount")) {
                            throw OrbInvalidDataException("'discountType' is invalid, received $it")
                        }
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
                    (if (amountDiscount.asKnown() == null) 0 else 1) +
                        discountType.let { if (it == JsonValue.from("amount")) 1 else 0 }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Amount &&
                        amountDiscount == other.amountDiscount &&
                        discountType == other.discountType &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amountDiscount, discountType, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Amount{amountDiscount=$amountDiscount, discountType=$discountType, additionalProperties=$additionalProperties}"
            }

            class Percentage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val discountType: JsonValue,
                private val percentageDiscount: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    discountType: JsonValue = JsonMissing.of(),
                    @JsonProperty("percentage_discount")
                    @ExcludeMissing
                    percentageDiscount: JsonField<Double> = JsonMissing.of(),
                ) : this(discountType, percentageDiscount, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("percentage")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("discount_type")
                @ExcludeMissing
                fun _discountType(): JsonValue = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                /**
                 * Returns the raw JSON value of [percentageDiscount].
                 *
                 * Unlike [percentageDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount(): JsonField<Double> = percentageDiscount

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
                     * Returns a mutable builder for constructing an instance of [Percentage].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percentageDiscount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Percentage]. */
                class Builder internal constructor() {

                    private var discountType: JsonValue = JsonValue.from("percentage")
                    private var percentageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(percentage: Percentage) = apply {
                        discountType = percentage.discountType
                        percentageDiscount = percentage.percentageDiscount
                        additionalProperties = percentage.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("percentage")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun discountType(discountType: JsonValue) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Sets [Builder.percentageDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentageDiscount] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun percentageDiscount(percentageDiscount: JsonField<Double>) = apply {
                        this.percentageDiscount = percentageDiscount
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
                     * Returns an immutable instance of [Percentage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .percentageDiscount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Percentage =
                        Percentage(
                            discountType,
                            checkRequired("percentageDiscount", percentageDiscount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Percentage = apply {
                    if (validated) {
                        return@apply
                    }

                    _discountType().let {
                        if (it != JsonValue.from("percentage")) {
                            throw OrbInvalidDataException("'discountType' is invalid, received $it")
                        }
                    }
                    percentageDiscount()
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
                    discountType.let { if (it == JsonValue.from("percentage")) 1 else 0 } +
                        (if (percentageDiscount.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Percentage &&
                        discountType == other.discountType &&
                        percentageDiscount == other.percentageDiscount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(discountType, percentageDiscount, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Percentage{discountType=$discountType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"
            }

            class Usage
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val discountType: JsonValue,
                private val usageDiscount: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("discount_type")
                    @ExcludeMissing
                    discountType: JsonValue = JsonMissing.of(),
                    @JsonProperty("usage_discount")
                    @ExcludeMissing
                    usageDiscount: JsonField<Double> = JsonMissing.of(),
                ) : this(discountType, usageDiscount, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("usage")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("discount_type")
                @ExcludeMissing
                fun _discountType(): JsonValue = discountType

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                /**
                 * Returns the raw JSON value of [usageDiscount].
                 *
                 * Unlike [usageDiscount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("usage_discount")
                @ExcludeMissing
                fun _usageDiscount(): JsonField<Double> = usageDiscount

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
                     * Returns a mutable builder for constructing an instance of [Usage].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .usageDiscount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Usage]. */
                class Builder internal constructor() {

                    private var discountType: JsonValue = JsonValue.from("usage")
                    private var usageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usage: Usage) = apply {
                        discountType = usage.discountType
                        usageDiscount = usage.usageDiscount
                        additionalProperties = usage.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("usage")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun discountType(discountType: JsonValue) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for.
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Sets [Builder.usageDiscount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.usageDiscount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun usageDiscount(usageDiscount: JsonField<Double>) = apply {
                        this.usageDiscount = usageDiscount
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
                     * Returns an immutable instance of [Usage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .usageDiscount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Usage =
                        Usage(
                            discountType,
                            checkRequired("usageDiscount", usageDiscount),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Usage = apply {
                    if (validated) {
                        return@apply
                    }

                    _discountType().let {
                        if (it != JsonValue.from("usage")) {
                            throw OrbInvalidDataException("'discountType' is invalid, received $it")
                        }
                    }
                    usageDiscount()
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
                    discountType.let { if (it == JsonValue.from("usage")) 1 else 0 } +
                        (if (usageDiscount.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Usage &&
                        discountType == other.discountType &&
                        usageDiscount == other.usageDiscount &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(discountType, usageDiscount, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Usage{discountType=$discountType, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
            }
        }

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription.
         */
        @JsonDeserialize(using = EndDate.Deserializer::class)
        @JsonSerialize(using = EndDate.Serializer::class)
        class EndDate
        private constructor(
            private val dateTime: OffsetDateTime? = null,
            private val billingCycleRelative: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dateTime(): OffsetDateTime? = dateTime

            fun billingCycleRelative(): BillingCycleRelativeDate? = billingCycleRelative

            fun isDateTime(): Boolean = dateTime != null

            fun isBillingCycleRelative(): Boolean = billingCycleRelative != null

            fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

            fun asBillingCycleRelative(): BillingCycleRelativeDate =
                billingCycleRelative.getOrThrow("billingCycleRelative")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): EndDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDateTime(dateTime: OffsetDateTime) {}

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) {
                            billingCycleRelative.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDateTime(dateTime: OffsetDateTime) = 1

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) = billingCycleRelative.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EndDate &&
                    dateTime == other.dateTime &&
                    billingCycleRelative == other.billingCycleRelative
            }

            override fun hashCode(): Int = Objects.hash(dateTime, billingCycleRelative)

            override fun toString(): String =
                when {
                    dateTime != null -> "EndDate{dateTime=$dateTime}"
                    billingCycleRelative != null ->
                        "EndDate{billingCycleRelative=$billingCycleRelative}"
                    _json != null -> "EndDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid EndDate")
                }

            companion object {

                fun ofDateTime(dateTime: OffsetDateTime) = EndDate(dateTime = dateTime)

                fun ofBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate) =
                    EndDate(billingCycleRelative = billingCycleRelative)
            }

            /**
             * An interface that defines how to map each variant of [EndDate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDateTime(dateTime: OffsetDateTime): T

                fun visitBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate): T

                /**
                 * Maps an unknown variant of [EndDate] to a value of type [T].
                 *
                 * An instance of [EndDate] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown EndDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<EndDate>(EndDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): EndDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())
                                    ?.let { EndDate(billingCycleRelative = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    EndDate(dateTime = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> EndDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<EndDate>(EndDate::class) {

                override fun serialize(
                    value: EndDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dateTime != null -> generator.writeObject(value.dateTime)
                        value.billingCycleRelative != null ->
                            generator.writeObject(value.billingCycleRelative)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid EndDate")
                    }
                }
            }
        }

        class FixedFeeQuantityTransition
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val effectiveDate: JsonField<OffsetDateTime>,
            private val quantity: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("effective_date")
                @ExcludeMissing
                effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Long> = JsonMissing.of(),
            ) : this(effectiveDate, quantity, mutableMapOf())

            /**
             * The date that the fixed fee quantity transition should take effect.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

            /**
             * The quantity of the fixed fee quantity transition.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Long = quantity.getRequired("quantity")

            /**
             * Returns the raw JSON value of [effectiveDate].
             *
             * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

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
                 * [FixedFeeQuantityTransition].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .effectiveDate()
                 * .quantity()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [FixedFeeQuantityTransition]. */
            class Builder internal constructor() {

                private var effectiveDate: JsonField<OffsetDateTime>? = null
                private var quantity: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                    effectiveDate = fixedFeeQuantityTransition.effectiveDate
                    quantity = fixedFeeQuantityTransition.quantity
                    additionalProperties =
                        fixedFeeQuantityTransition.additionalProperties.toMutableMap()
                }

                /** The date that the fixed fee quantity transition should take effect. */
                fun effectiveDate(effectiveDate: OffsetDateTime) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Sets [Builder.effectiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** The quantity of the fixed fee quantity transition. */
                fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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
                 * Returns an immutable instance of [FixedFeeQuantityTransition].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .effectiveDate()
                 * .quantity()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FixedFeeQuantityTransition =
                    FixedFeeQuantityTransition(
                        checkRequired("effectiveDate", effectiveDate),
                        checkRequired("quantity", quantity),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FixedFeeQuantityTransition = apply {
                if (validated) {
                    return@apply
                }

                effectiveDate()
                quantity()
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
                (if (effectiveDate.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FixedFeeQuantityTransition &&
                    effectiveDate == other.effectiveDate &&
                    quantity == other.quantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(effectiveDate, quantity, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FixedFeeQuantityTransition{effectiveDate=$effectiveDate, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        /** New floating price request body params. */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewFloatingUnitPrice? = null,
            private val tiered: NewFloatingTieredPrice? = null,
            private val bulk: NewFloatingBulkPrice? = null,
            private val bulkWithFilters: BulkWithFilters? = null,
            private val package_: NewFloatingPackagePrice? = null,
            private val matrix: NewFloatingMatrixPrice? = null,
            private val thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewFloatingTieredPackagePrice? = null,
            private val tieredWithMinimum: NewFloatingTieredWithMinimumPrice? = null,
            private val groupedTiered: NewFloatingGroupedTieredPrice? = null,
            private val tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice? = null,
            private val packageWithAllocation: NewFloatingPackageWithAllocationPrice? = null,
            private val unitWithPercent: NewFloatingUnitWithPercentPrice? = null,
            private val matrixWithAllocation: NewFloatingMatrixWithAllocationPrice? = null,
            private val tieredWithProration: NewFloatingTieredWithProrationPrice? = null,
            private val unitWithProration: NewFloatingUnitWithProrationPrice? = null,
            private val groupedAllocation: NewFloatingGroupedAllocationPrice? = null,
            private val bulkWithProration: NewFloatingBulkWithProrationPrice? = null,
            private val groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice? =
                null,
            private val groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice? =
                null,
            private val groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds? = null,
            private val matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice? = null,
            private val groupedTieredPackage: NewFloatingGroupedTieredPackagePrice? = null,
            private val maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice? = null,
            private val scalableMatrixWithUnitPricing:
                NewFloatingScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewFloatingScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice? = null,
            private val cumulativeGroupedAllocation: CumulativeGroupedAllocation? = null,
            private val minimum: NewFloatingMinimumCompositePrice? = null,
            private val percent: Percent? = null,
            private val eventOutput: EventOutput? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewFloatingUnitPrice? = unit

            fun tiered(): NewFloatingTieredPrice? = tiered

            fun bulk(): NewFloatingBulkPrice? = bulk

            fun bulkWithFilters(): BulkWithFilters? = bulkWithFilters

            fun package_(): NewFloatingPackagePrice? = package_

            fun matrix(): NewFloatingMatrixPrice? = matrix

            fun thresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice? = thresholdTotalAmount

            fun tieredPackage(): NewFloatingTieredPackagePrice? = tieredPackage

            fun tieredWithMinimum(): NewFloatingTieredWithMinimumPrice? = tieredWithMinimum

            fun groupedTiered(): NewFloatingGroupedTieredPrice? = groupedTiered

            fun tieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice? =
                tieredPackageWithMinimum

            fun packageWithAllocation(): NewFloatingPackageWithAllocationPrice? =
                packageWithAllocation

            fun unitWithPercent(): NewFloatingUnitWithPercentPrice? = unitWithPercent

            fun matrixWithAllocation(): NewFloatingMatrixWithAllocationPrice? = matrixWithAllocation

            fun tieredWithProration(): NewFloatingTieredWithProrationPrice? = tieredWithProration

            fun unitWithProration(): NewFloatingUnitWithProrationPrice? = unitWithProration

            fun groupedAllocation(): NewFloatingGroupedAllocationPrice? = groupedAllocation

            fun bulkWithProration(): NewFloatingBulkWithProrationPrice? = bulkWithProration

            fun groupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice? =
                groupedWithProratedMinimum

            fun groupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice? =
                groupedWithMeteredMinimum

            fun groupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds? =
                groupedWithMinMaxThresholds

            fun matrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice? =
                matrixWithDisplayName

            fun groupedTieredPackage(): NewFloatingGroupedTieredPackagePrice? = groupedTieredPackage

            fun maxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice? =
                maxGroupTieredPackage

            fun scalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice? =
                scalableMatrixWithUnitPricing

            fun scalableMatrixWithTieredPricing():
                NewFloatingScalableMatrixWithTieredPricingPrice? = scalableMatrixWithTieredPricing

            fun cumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice? =
                cumulativeGroupedBulk

            fun cumulativeGroupedAllocation(): CumulativeGroupedAllocation? =
                cumulativeGroupedAllocation

            fun minimum(): NewFloatingMinimumCompositePrice? = minimum

            fun percent(): Percent? = percent

            fun eventOutput(): EventOutput? = eventOutput

            fun isUnit(): Boolean = unit != null

            fun isTiered(): Boolean = tiered != null

            fun isBulk(): Boolean = bulk != null

            fun isBulkWithFilters(): Boolean = bulkWithFilters != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isGroupedWithMinMaxThresholds(): Boolean = groupedWithMinMaxThresholds != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun isCumulativeGroupedAllocation(): Boolean = cumulativeGroupedAllocation != null

            fun isMinimum(): Boolean = minimum != null

            fun isPercent(): Boolean = percent != null

            fun isEventOutput(): Boolean = eventOutput != null

            fun asUnit(): NewFloatingUnitPrice = unit.getOrThrow("unit")

            fun asTiered(): NewFloatingTieredPrice = tiered.getOrThrow("tiered")

            fun asBulk(): NewFloatingBulkPrice = bulk.getOrThrow("bulk")

            fun asBulkWithFilters(): BulkWithFilters = bulkWithFilters.getOrThrow("bulkWithFilters")

            fun asPackage(): NewFloatingPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewFloatingMatrixPrice = matrix.getOrThrow("matrix")

            fun asThresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewFloatingTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asTieredWithMinimum(): NewFloatingTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asGroupedTiered(): NewFloatingGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun asTieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asPackageWithAllocation(): NewFloatingPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asUnitWithPercent(): NewFloatingUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asMatrixWithAllocation(): NewFloatingMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asTieredWithProration(): NewFloatingTieredWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewFloatingUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewFloatingGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asBulkWithProration(): NewFloatingBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asGroupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asGroupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asGroupedWithMinMaxThresholds(): GroupedWithMinMaxThresholds =
                groupedWithMinMaxThresholds.getOrThrow("groupedWithMinMaxThresholds")

            fun asMatrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asGroupedTieredPackage(): NewFloatingGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asMaxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asScalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing():
                NewFloatingScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun asCumulativeGroupedAllocation(): CumulativeGroupedAllocation =
                cumulativeGroupedAllocation.getOrThrow("cumulativeGroupedAllocation")

            fun asMinimum(): NewFloatingMinimumCompositePrice = minimum.getOrThrow("minimum")

            fun asPercent(): Percent = percent.getOrThrow("percent")

            fun asEventOutput(): EventOutput = eventOutput.getOrThrow("eventOutput")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    tiered != null -> visitor.visitTiered(tiered)
                    bulk != null -> visitor.visitBulk(bulk)
                    bulkWithFilters != null -> visitor.visitBulkWithFilters(bulkWithFilters)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    groupedWithMinMaxThresholds != null ->
                        visitor.visitGroupedWithMinMaxThresholds(groupedWithMinMaxThresholds)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
                    cumulativeGroupedAllocation != null ->
                        visitor.visitCumulativeGroupedAllocation(cumulativeGroupedAllocation)
                    minimum != null -> visitor.visitMinimum(minimum)
                    percent != null -> visitor.visitPercent(percent)
                    eventOutput != null -> visitor.visitEventOutput(eventOutput)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Price = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitUnit(unit: NewFloatingUnitPrice) {
                            unit.validate()
                        }

                        override fun visitTiered(tiered: NewFloatingTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitBulk(bulk: NewFloatingBulkPrice) {
                            bulk.validate()
                        }

                        override fun visitBulkWithFilters(bulkWithFilters: BulkWithFilters) {
                            bulkWithFilters.validate()
                        }

                        override fun visitPackage(package_: NewFloatingPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewFloatingMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                        ) {
                            thresholdTotalAmount.validate()
                        }

                        override fun visitTieredPackage(
                            tieredPackage: NewFloatingTieredPackagePrice
                        ) {
                            tieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitGroupedTiered(
                            groupedTiered: NewFloatingGroupedTieredPrice
                        ) {
                            groupedTiered.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewFloatingPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewFloatingUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitTieredWithProration(
                            tieredWithProration: NewFloatingTieredWithProrationPrice
                        ) {
                            tieredWithProration.validate()
                        }

                        override fun visitUnitWithProration(
                            unitWithProration: NewFloatingUnitWithProrationPrice
                        ) {
                            unitWithProration.validate()
                        }

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewFloatingGroupedAllocationPrice
                        ) {
                            groupedAllocation.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewFloatingBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                        ) {
                            groupedWithProratedMinimum.validate()
                        }

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                        ) {
                            groupedWithMeteredMinimum.validate()
                        }

                        override fun visitGroupedWithMinMaxThresholds(
                            groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                        ) {
                            groupedWithMinMaxThresholds.validate()
                        }

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewFloatingScalableMatrixWithUnitPricingPrice
                        ) {
                            scalableMatrixWithUnitPricing.validate()
                        }

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewFloatingScalableMatrixWithTieredPricingPrice
                        ) {
                            scalableMatrixWithTieredPricing.validate()
                        }

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                        ) {
                            cumulativeGroupedBulk.validate()
                        }

                        override fun visitCumulativeGroupedAllocation(
                            cumulativeGroupedAllocation: CumulativeGroupedAllocation
                        ) {
                            cumulativeGroupedAllocation.validate()
                        }

                        override fun visitMinimum(minimum: NewFloatingMinimumCompositePrice) {
                            minimum.validate()
                        }

                        override fun visitPercent(percent: Percent) {
                            percent.validate()
                        }

                        override fun visitEventOutput(eventOutput: EventOutput) {
                            eventOutput.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitUnit(unit: NewFloatingUnitPrice) = unit.validity()

                        override fun visitTiered(tiered: NewFloatingTieredPrice) = tiered.validity()

                        override fun visitBulk(bulk: NewFloatingBulkPrice) = bulk.validity()

                        override fun visitBulkWithFilters(bulkWithFilters: BulkWithFilters) =
                            bulkWithFilters.validity()

                        override fun visitPackage(package_: NewFloatingPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewFloatingMatrixPrice) = matrix.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(
                            tieredPackage: NewFloatingTieredPackagePrice
                        ) = tieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitGroupedTiered(
                            groupedTiered: NewFloatingGroupedTieredPrice
                        ) = groupedTiered.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewFloatingPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewFloatingUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewFloatingTieredWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewFloatingUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewFloatingGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewFloatingBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitGroupedWithMinMaxThresholds(
                            groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                        ) = groupedWithMinMaxThresholds.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitScalableMatrixWithUnitPricing(
                            scalableMatrixWithUnitPricing:
                                NewFloatingScalableMatrixWithUnitPricingPrice
                        ) = scalableMatrixWithUnitPricing.validity()

                        override fun visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing:
                                NewFloatingScalableMatrixWithTieredPricingPrice
                        ) = scalableMatrixWithTieredPricing.validity()

                        override fun visitCumulativeGroupedBulk(
                            cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                        ) = cumulativeGroupedBulk.validity()

                        override fun visitCumulativeGroupedAllocation(
                            cumulativeGroupedAllocation: CumulativeGroupedAllocation
                        ) = cumulativeGroupedAllocation.validity()

                        override fun visitMinimum(minimum: NewFloatingMinimumCompositePrice) =
                            minimum.validity()

                        override fun visitPercent(percent: Percent) = percent.validity()

                        override fun visitEventOutput(eventOutput: EventOutput) =
                            eventOutput.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Price &&
                    unit == other.unit &&
                    tiered == other.tiered &&
                    bulk == other.bulk &&
                    bulkWithFilters == other.bulkWithFilters &&
                    package_ == other.package_ &&
                    matrix == other.matrix &&
                    thresholdTotalAmount == other.thresholdTotalAmount &&
                    tieredPackage == other.tieredPackage &&
                    tieredWithMinimum == other.tieredWithMinimum &&
                    groupedTiered == other.groupedTiered &&
                    tieredPackageWithMinimum == other.tieredPackageWithMinimum &&
                    packageWithAllocation == other.packageWithAllocation &&
                    unitWithPercent == other.unitWithPercent &&
                    matrixWithAllocation == other.matrixWithAllocation &&
                    tieredWithProration == other.tieredWithProration &&
                    unitWithProration == other.unitWithProration &&
                    groupedAllocation == other.groupedAllocation &&
                    bulkWithProration == other.bulkWithProration &&
                    groupedWithProratedMinimum == other.groupedWithProratedMinimum &&
                    groupedWithMeteredMinimum == other.groupedWithMeteredMinimum &&
                    groupedWithMinMaxThresholds == other.groupedWithMinMaxThresholds &&
                    matrixWithDisplayName == other.matrixWithDisplayName &&
                    groupedTieredPackage == other.groupedTieredPackage &&
                    maxGroupTieredPackage == other.maxGroupTieredPackage &&
                    scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing &&
                    scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing &&
                    cumulativeGroupedBulk == other.cumulativeGroupedBulk &&
                    cumulativeGroupedAllocation == other.cumulativeGroupedAllocation &&
                    minimum == other.minimum &&
                    percent == other.percent &&
                    eventOutput == other.eventOutput
            }

            override fun hashCode(): Int =
                Objects.hash(
                    unit,
                    tiered,
                    bulk,
                    bulkWithFilters,
                    package_,
                    matrix,
                    thresholdTotalAmount,
                    tieredPackage,
                    tieredWithMinimum,
                    groupedTiered,
                    tieredPackageWithMinimum,
                    packageWithAllocation,
                    unitWithPercent,
                    matrixWithAllocation,
                    tieredWithProration,
                    unitWithProration,
                    groupedAllocation,
                    bulkWithProration,
                    groupedWithProratedMinimum,
                    groupedWithMeteredMinimum,
                    groupedWithMinMaxThresholds,
                    matrixWithDisplayName,
                    groupedTieredPackage,
                    maxGroupTieredPackage,
                    scalableMatrixWithUnitPricing,
                    scalableMatrixWithTieredPricing,
                    cumulativeGroupedBulk,
                    cumulativeGroupedAllocation,
                    minimum,
                    percent,
                    eventOutput,
                )

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    tiered != null -> "Price{tiered=$tiered}"
                    bulk != null -> "Price{bulk=$bulk}"
                    bulkWithFilters != null -> "Price{bulkWithFilters=$bulkWithFilters}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    groupedWithMinMaxThresholds != null ->
                        "Price{groupedWithMinMaxThresholds=$groupedWithMinMaxThresholds}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    cumulativeGroupedAllocation != null ->
                        "Price{cumulativeGroupedAllocation=$cumulativeGroupedAllocation}"
                    minimum != null -> "Price{minimum=$minimum}"
                    percent != null -> "Price{percent=$percent}"
                    eventOutput != null -> "Price{eventOutput=$eventOutput}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewFloatingUnitPrice) = Price(unit = unit)

                fun ofTiered(tiered: NewFloatingTieredPrice) = Price(tiered = tiered)

                fun ofBulk(bulk: NewFloatingBulkPrice) = Price(bulk = bulk)

                fun ofBulkWithFilters(bulkWithFilters: BulkWithFilters) =
                    Price(bulkWithFilters = bulkWithFilters)

                fun ofPackage(package_: NewFloatingPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewFloatingMatrixPrice) = Price(matrix = matrix)

                fun ofThresholdTotalAmount(
                    thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                ) = Price(thresholdTotalAmount = thresholdTotalAmount)

                fun ofTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                fun ofTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                fun ofGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)

                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                fun ofPackageWithAllocation(
                    packageWithAllocation: NewFloatingPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                fun ofUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                fun ofMatrixWithAllocation(
                    matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                ) = Price(matrixWithAllocation = matrixWithAllocation)

                fun ofTieredWithProration(
                    tieredWithProration: NewFloatingTieredWithProrationPrice
                ) = Price(tieredWithProration = tieredWithProration)

                fun ofUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                fun ofGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                fun ofBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                fun ofGroupedWithMinMaxThresholds(
                    groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                ) = Price(groupedWithMinMaxThresholds = groupedWithMinMaxThresholds)

                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                fun ofGroupedTieredPackage(
                    groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                ) = Price(groupedTieredPackage = groupedTieredPackage)

                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)

                fun ofCumulativeGroupedAllocation(
                    cumulativeGroupedAllocation: CumulativeGroupedAllocation
                ) = Price(cumulativeGroupedAllocation = cumulativeGroupedAllocation)

                fun ofMinimum(minimum: NewFloatingMinimumCompositePrice) = Price(minimum = minimum)

                fun ofPercent(percent: Percent) = Price(percent = percent)

                fun ofEventOutput(eventOutput: EventOutput) = Price(eventOutput = eventOutput)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewFloatingUnitPrice): T

                fun visitTiered(tiered: NewFloatingTieredPrice): T

                fun visitBulk(bulk: NewFloatingBulkPrice): T

                fun visitBulkWithFilters(bulkWithFilters: BulkWithFilters): T

                fun visitPackage(package_: NewFloatingPackagePrice): T

                fun visitMatrix(matrix: NewFloatingMatrixPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice): T

                fun visitTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice): T

                fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                ): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewFloatingPackageWithAllocationPrice
                ): T

                fun visitUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                ): T

                fun visitTieredWithProration(
                    tieredWithProration: NewFloatingTieredWithProrationPrice
                ): T

                fun visitUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice): T

                fun visitGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice): T

                fun visitBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                ): T

                fun visitGroupedWithMinMaxThresholds(
                    groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                ): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                ): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                ): T

                fun visitScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                ): T

                fun visitScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
                ): T

                fun visitCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                ): T

                fun visitCumulativeGroupedAllocation(
                    cumulativeGroupedAllocation: CumulativeGroupedAllocation
                ): T

                fun visitMinimum(minimum: NewFloatingMinimumCompositePrice): T

                fun visitPercent(percent: Percent): T

                fun visitEventOutput(eventOutput: EventOutput): T

                /**
                 * Maps an unknown variant of [Price] to a value of type [T].
                 *
                 * An instance of [Price] can contain an unknown variant if it was deserialized from
                 * data that doesn't match any known variant. For example, if the SDK is on an older
                 * version than the API, then the API may respond with new variants that the SDK is
                 * unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Price: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Price>(Price::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Price {
                    val json = JsonValue.fromJsonNode(node)
                    val modelType = json.asObject()?.get("model_type")?.asString()

                    when (modelType) {
                        "unit" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingUnitPrice>())
                                ?.let { Price(unit = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPrice>())
                                ?.let { Price(tiered = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkPrice>())
                                ?.let { Price(bulk = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk_with_filters" -> {
                            return tryDeserialize(node, jacksonTypeRef<BulkWithFilters>())?.let {
                                Price(bulkWithFilters = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "package" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingPackagePrice>())
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixPrice>())
                                ?.let { Price(matrix = it, _json = json) } ?: Price(_json = json)
                        }
                        "threshold_total_amount" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingThresholdTotalAmountPrice>(),
                                )
                                ?.let { Price(thresholdTotalAmount = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredPackagePrice>(),
                                )
                                ?.let { Price(tieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedTieredPrice>(),
                                )
                                ?.let { Price(groupedTiered = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "package_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingPackageWithAllocationPrice>(),
                                )
                                ?.let { Price(packageWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_percent" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingUnitWithPercentPrice>(),
                                )
                                ?.let { Price(unitWithPercent = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredWithProrationPrice>(),
                                )
                                ?.let { Price(tieredWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "unit_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingUnitWithProrationPrice>(),
                                )
                                ?.let { Price(unitWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedAllocationPrice>(),
                                )
                                ?.let { Price(groupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "bulk_with_proration" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingBulkWithProrationPrice>(),
                                )
                                ?.let { Price(bulkWithProration = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_prorated_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedWithProratedMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithProratedMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_metered_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedWithMeteredMinimumPrice>(),
                                )
                                ?.let { Price(groupedWithMeteredMinimum = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_with_min_max_thresholds" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<GroupedWithMinMaxThresholds>(),
                                )
                                ?.let { Price(groupedWithMinMaxThresholds = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "max_group_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMaxGroupTieredPackagePrice>(),
                                )
                                ?.let { Price(maxGroupTieredPackage = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_unit_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingScalableMatrixWithUnitPricingPrice>(),
                                )
                                ?.let { Price(scalableMatrixWithUnitPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "scalable_matrix_with_tiered_pricing" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<
                                        NewFloatingScalableMatrixWithTieredPricingPrice
                                    >(),
                                )
                                ?.let { Price(scalableMatrixWithTieredPricing = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_bulk" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingCumulativeGroupedBulkPrice>(),
                                )
                                ?.let { Price(cumulativeGroupedBulk = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "cumulative_grouped_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<CumulativeGroupedAllocation>(),
                                )
                                ?.let { Price(cumulativeGroupedAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMinimumCompositePrice>(),
                                )
                                ?.let { Price(minimum = it, _json = json) } ?: Price(_json = json)
                        }
                        "percent" -> {
                            return tryDeserialize(node, jacksonTypeRef<Percent>())?.let {
                                Price(percent = it, _json = json)
                            } ?: Price(_json = json)
                        }
                        "event_output" -> {
                            return tryDeserialize(node, jacksonTypeRef<EventOutput>())?.let {
                                Price(eventOutput = it, _json = json)
                            } ?: Price(_json = json)
                        }
                    }

                    return Price(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Price>(Price::class) {

                override fun serialize(
                    value: Price,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.unit != null -> generator.writeObject(value.unit)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.bulkWithFilters != null ->
                            generator.writeObject(value.bulkWithFilters)
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.groupedWithMinMaxThresholds != null ->
                            generator.writeObject(value.groupedWithMinMaxThresholds)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value.cumulativeGroupedAllocation != null ->
                            generator.writeObject(value.cumulativeGroupedAllocation)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.percent != null -> generator.writeObject(value.percent)
                        value.eventOutput != null -> generator.writeObject(value.eventOutput)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }

            class BulkWithFilters
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val bulkWithFiltersConfig: JsonField<BulkWithFiltersConfig>,
                private val cadence: JsonField<Cadence>,
                private val currency: JsonField<String>,
                private val itemId: JsonField<String>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("bulk_with_filters_config")
                    @ExcludeMissing
                    bulkWithFiltersConfig: JsonField<BulkWithFiltersConfig> = JsonMissing.of(),
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(
                    bulkWithFiltersConfig,
                    cadence,
                    currency,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    mutableMapOf(),
                )

                /**
                 * Configuration for bulk_with_filters pricing
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun bulkWithFiltersConfig(): BulkWithFiltersConfig =
                    bulkWithFiltersConfig.getRequired("bulk_with_filters_config")

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * An ISO 4217 currency string for which this price is billed in.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The pricing model type
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("bulk_with_filters")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [bulkWithFiltersConfig].
                 *
                 * Unlike [bulkWithFiltersConfig], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("bulk_with_filters_config")
                @ExcludeMissing
                fun _bulkWithFiltersConfig(): JsonField<BulkWithFiltersConfig> =
                    bulkWithFiltersConfig

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * Returns a mutable builder for constructing an instance of [BulkWithFilters].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .bulkWithFiltersConfig()
                     * .cadence()
                     * .currency()
                     * .itemId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [BulkWithFilters]. */
                class Builder internal constructor() {

                    private var bulkWithFiltersConfig: JsonField<BulkWithFiltersConfig>? = null
                    private var cadence: JsonField<Cadence>? = null
                    private var currency: JsonField<String>? = null
                    private var itemId: JsonField<String>? = null
                    private var modelType: JsonValue = JsonValue.from("bulk_with_filters")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(bulkWithFilters: BulkWithFilters) = apply {
                        bulkWithFiltersConfig = bulkWithFilters.bulkWithFiltersConfig
                        cadence = bulkWithFilters.cadence
                        currency = bulkWithFilters.currency
                        itemId = bulkWithFilters.itemId
                        modelType = bulkWithFilters.modelType
                        name = bulkWithFilters.name
                        billableMetricId = bulkWithFilters.billableMetricId
                        billedInAdvance = bulkWithFilters.billedInAdvance
                        billingCycleConfiguration = bulkWithFilters.billingCycleConfiguration
                        conversionRate = bulkWithFilters.conversionRate
                        conversionRateConfig = bulkWithFilters.conversionRateConfig
                        dimensionalPriceConfiguration =
                            bulkWithFilters.dimensionalPriceConfiguration
                        externalPriceId = bulkWithFilters.externalPriceId
                        fixedPriceQuantity = bulkWithFilters.fixedPriceQuantity
                        invoiceGroupingKey = bulkWithFilters.invoiceGroupingKey
                        invoicingCycleConfiguration = bulkWithFilters.invoicingCycleConfiguration
                        metadata = bulkWithFilters.metadata
                        additionalProperties = bulkWithFilters.additionalProperties.toMutableMap()
                    }

                    /** Configuration for bulk_with_filters pricing */
                    fun bulkWithFiltersConfig(bulkWithFiltersConfig: BulkWithFiltersConfig) =
                        bulkWithFiltersConfig(JsonField.of(bulkWithFiltersConfig))

                    /**
                     * Sets [Builder.bulkWithFiltersConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.bulkWithFiltersConfig] with a well-typed
                     * [BulkWithFiltersConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun bulkWithFiltersConfig(
                        bulkWithFiltersConfig: JsonField<BulkWithFiltersConfig>
                    ) = apply { this.bulkWithFiltersConfig = bulkWithFiltersConfig }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("bulk_with_filters")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                     * Returns an immutable instance of [BulkWithFilters].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .bulkWithFiltersConfig()
                     * .cadence()
                     * .currency()
                     * .itemId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BulkWithFilters =
                        BulkWithFilters(
                            checkRequired("bulkWithFiltersConfig", bulkWithFiltersConfig),
                            checkRequired("cadence", cadence),
                            checkRequired("currency", currency),
                            checkRequired("itemId", itemId),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): BulkWithFilters = apply {
                    if (validated) {
                        return@apply
                    }

                    bulkWithFiltersConfig().validate()
                    cadence().validate()
                    currency()
                    itemId()
                    _modelType().let {
                        if (it != JsonValue.from("bulk_with_filters")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
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
                    (bulkWithFiltersConfig.asKnown()?.validity() ?: 0) +
                        (cadence.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (if (itemId.asKnown() == null) 0 else 1) +
                        modelType.let { if (it == JsonValue.from("bulk_with_filters")) 1 else 0 } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0)

                /** Configuration for bulk_with_filters pricing */
                class BulkWithFiltersConfig
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val filters: JsonField<List<Filter>>,
                    private val tiers: JsonField<List<Tier>>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("filters")
                        @ExcludeMissing
                        filters: JsonField<List<Filter>> = JsonMissing.of(),
                        @JsonProperty("tiers")
                        @ExcludeMissing
                        tiers: JsonField<List<Tier>> = JsonMissing.of(),
                    ) : this(filters, tiers, mutableMapOf())

                    /**
                     * Property filters to apply (all must match)
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun filters(): List<Filter> = filters.getRequired("filters")

                    /**
                     * Bulk tiers for rating based on total usage volume
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun tiers(): List<Tier> = tiers.getRequired("tiers")

                    /**
                     * Returns the raw JSON value of [filters].
                     *
                     * Unlike [filters], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("filters")
                    @ExcludeMissing
                    fun _filters(): JsonField<List<Filter>> = filters

                    /**
                     * Returns the raw JSON value of [tiers].
                     *
                     * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected
                     * type.
                     */
                    @JsonProperty("tiers")
                    @ExcludeMissing
                    fun _tiers(): JsonField<List<Tier>> = tiers

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
                         * [BulkWithFiltersConfig].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .filters()
                         * .tiers()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [BulkWithFiltersConfig]. */
                    class Builder internal constructor() {

                        private var filters: JsonField<MutableList<Filter>>? = null
                        private var tiers: JsonField<MutableList<Tier>>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(bulkWithFiltersConfig: BulkWithFiltersConfig) = apply {
                            filters = bulkWithFiltersConfig.filters.map { it.toMutableList() }
                            tiers = bulkWithFiltersConfig.tiers.map { it.toMutableList() }
                            additionalProperties =
                                bulkWithFiltersConfig.additionalProperties.toMutableMap()
                        }

                        /** Property filters to apply (all must match) */
                        fun filters(filters: List<Filter>) = filters(JsonField.of(filters))

                        /**
                         * Sets [Builder.filters] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.filters] with a well-typed
                         * `List<Filter>` value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun filters(filters: JsonField<List<Filter>>) = apply {
                            this.filters = filters.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Filter] to [filters].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addFilter(filter: Filter) = apply {
                            filters =
                                (filters ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("filters", it).add(filter)
                                }
                        }

                        /** Bulk tiers for rating based on total usage volume */
                        fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                        /**
                         * Sets [Builder.tiers] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.tiers] with a well-typed `List<Tier>`
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun tiers(tiers: JsonField<List<Tier>>) = apply {
                            this.tiers = tiers.map { it.toMutableList() }
                        }

                        /**
                         * Adds a single [Tier] to [tiers].
                         *
                         * @throws IllegalStateException if the field was previously set to a
                         *   non-list.
                         */
                        fun addTier(tier: Tier) = apply {
                            tiers =
                                (tiers ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("tiers", it).add(tier)
                                }
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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

                        /**
                         * Returns an immutable instance of [BulkWithFiltersConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .filters()
                         * .tiers()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): BulkWithFiltersConfig =
                            BulkWithFiltersConfig(
                                checkRequired("filters", filters).map { it.toImmutable() },
                                checkRequired("tiers", tiers).map { it.toImmutable() },
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): BulkWithFiltersConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        filters().forEach { it.validate() }
                        tiers().forEach { it.validate() }
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
                        (filters.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                            (tiers.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                    /** Configuration for a single property filter */
                    class Filter
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val propertyKey: JsonField<String>,
                        private val propertyValue: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("property_key")
                            @ExcludeMissing
                            propertyKey: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("property_value")
                            @ExcludeMissing
                            propertyValue: JsonField<String> = JsonMissing.of(),
                        ) : this(propertyKey, propertyValue, mutableMapOf())

                        /**
                         * Event property key to filter on
                         *
                         * @throws OrbInvalidDataException if the JSON field has an unexpected type
                         *   or is unexpectedly missing or null (e.g. if the server responded with
                         *   an unexpected value).
                         */
                        fun propertyKey(): String = propertyKey.getRequired("property_key")

                        /**
                         * Event property value to match
                         *
                         * @throws OrbInvalidDataException if the JSON field has an unexpected type
                         *   or is unexpectedly missing or null (e.g. if the server responded with
                         *   an unexpected value).
                         */
                        fun propertyValue(): String = propertyValue.getRequired("property_value")

                        /**
                         * Returns the raw JSON value of [propertyKey].
                         *
                         * Unlike [propertyKey], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("property_key")
                        @ExcludeMissing
                        fun _propertyKey(): JsonField<String> = propertyKey

                        /**
                         * Returns the raw JSON value of [propertyValue].
                         *
                         * Unlike [propertyValue], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("property_value")
                        @ExcludeMissing
                        fun _propertyValue(): JsonField<String> = propertyValue

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
                             * Returns a mutable builder for constructing an instance of [Filter].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .propertyKey()
                             * .propertyValue()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Filter]. */
                        class Builder internal constructor() {

                            private var propertyKey: JsonField<String>? = null
                            private var propertyValue: JsonField<String>? = null
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(filter: Filter) = apply {
                                propertyKey = filter.propertyKey
                                propertyValue = filter.propertyValue
                                additionalProperties = filter.additionalProperties.toMutableMap()
                            }

                            /** Event property key to filter on */
                            fun propertyKey(propertyKey: String) =
                                propertyKey(JsonField.of(propertyKey))

                            /**
                             * Sets [Builder.propertyKey] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.propertyKey] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun propertyKey(propertyKey: JsonField<String>) = apply {
                                this.propertyKey = propertyKey
                            }

                            /** Event property value to match */
                            fun propertyValue(propertyValue: String) =
                                propertyValue(JsonField.of(propertyValue))

                            /**
                             * Sets [Builder.propertyValue] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.propertyValue] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun propertyValue(propertyValue: JsonField<String>) = apply {
                                this.propertyValue = propertyValue
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

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

                            /**
                             * Returns an immutable instance of [Filter].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .propertyKey()
                             * .propertyValue()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Filter =
                                Filter(
                                    checkRequired("propertyKey", propertyKey),
                                    checkRequired("propertyValue", propertyValue),
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Filter = apply {
                            if (validated) {
                                return@apply
                            }

                            propertyKey()
                            propertyValue()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (propertyKey.asKnown() == null) 0 else 1) +
                                (if (propertyValue.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Filter &&
                                propertyKey == other.propertyKey &&
                                propertyValue == other.propertyValue &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(propertyKey, propertyValue, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Filter{propertyKey=$propertyKey, propertyValue=$propertyValue, additionalProperties=$additionalProperties}"
                    }

                    /** Configuration for a single bulk pricing tier */
                    class Tier
                    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                    private constructor(
                        private val unitAmount: JsonField<String>,
                        private val tierLowerBound: JsonField<String>,
                        private val additionalProperties: MutableMap<String, JsonValue>,
                    ) {

                        @JsonCreator
                        private constructor(
                            @JsonProperty("unit_amount")
                            @ExcludeMissing
                            unitAmount: JsonField<String> = JsonMissing.of(),
                            @JsonProperty("tier_lower_bound")
                            @ExcludeMissing
                            tierLowerBound: JsonField<String> = JsonMissing.of(),
                        ) : this(unitAmount, tierLowerBound, mutableMapOf())

                        /**
                         * Amount per unit
                         *
                         * @throws OrbInvalidDataException if the JSON field has an unexpected type
                         *   or is unexpectedly missing or null (e.g. if the server responded with
                         *   an unexpected value).
                         */
                        fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                        /**
                         * The lower bound for this tier
                         *
                         * @throws OrbInvalidDataException if the JSON field has an unexpected type
                         *   (e.g. if the server responded with an unexpected value).
                         */
                        fun tierLowerBound(): String? =
                            tierLowerBound.getNullable("tier_lower_bound")

                        /**
                         * Returns the raw JSON value of [unitAmount].
                         *
                         * Unlike [unitAmount], this method doesn't throw if the JSON field has an
                         * unexpected type.
                         */
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        fun _unitAmount(): JsonField<String> = unitAmount

                        /**
                         * Returns the raw JSON value of [tierLowerBound].
                         *
                         * Unlike [tierLowerBound], this method doesn't throw if the JSON field has
                         * an unexpected type.
                         */
                        @JsonProperty("tier_lower_bound")
                        @ExcludeMissing
                        fun _tierLowerBound(): JsonField<String> = tierLowerBound

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
                             * Returns a mutable builder for constructing an instance of [Tier].
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .unitAmount()
                             * ```
                             */
                            fun builder() = Builder()
                        }

                        /** A builder for [Tier]. */
                        class Builder internal constructor() {

                            private var unitAmount: JsonField<String>? = null
                            private var tierLowerBound: JsonField<String> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tier: Tier) = apply {
                                unitAmount = tier.unitAmount
                                tierLowerBound = tier.tierLowerBound
                                additionalProperties = tier.additionalProperties.toMutableMap()
                            }

                            /** Amount per unit */
                            fun unitAmount(unitAmount: String) =
                                unitAmount(JsonField.of(unitAmount))

                            /**
                             * Sets [Builder.unitAmount] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.unitAmount] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun unitAmount(unitAmount: JsonField<String>) = apply {
                                this.unitAmount = unitAmount
                            }

                            /** The lower bound for this tier */
                            fun tierLowerBound(tierLowerBound: String?) =
                                tierLowerBound(JsonField.ofNullable(tierLowerBound))

                            /**
                             * Sets [Builder.tierLowerBound] to an arbitrary JSON value.
                             *
                             * You should usually call [Builder.tierLowerBound] with a well-typed
                             * [String] value instead. This method is primarily for setting the
                             * field to an undocumented or not yet supported value.
                             */
                            fun tierLowerBound(tierLowerBound: JsonField<String>) = apply {
                                this.tierLowerBound = tierLowerBound
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    putAllAdditionalProperties(additionalProperties)
                                }

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

                            /**
                             * Returns an immutable instance of [Tier].
                             *
                             * Further updates to this [Builder] will not mutate the returned
                             * instance.
                             *
                             * The following fields are required:
                             * ```kotlin
                             * .unitAmount()
                             * ```
                             *
                             * @throws IllegalStateException if any required field is unset.
                             */
                            fun build(): Tier =
                                Tier(
                                    checkRequired("unitAmount", unitAmount),
                                    tierLowerBound,
                                    additionalProperties.toMutableMap(),
                                )
                        }

                        private var validated: Boolean = false

                        fun validate(): Tier = apply {
                            if (validated) {
                                return@apply
                            }

                            unitAmount()
                            tierLowerBound()
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        internal fun validity(): Int =
                            (if (unitAmount.asKnown() == null) 0 else 1) +
                                (if (tierLowerBound.asKnown() == null) 0 else 1)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Tier &&
                                unitAmount == other.unitAmount &&
                                tierLowerBound == other.tierLowerBound &&
                                additionalProperties == other.additionalProperties
                        }

                        private val hashCode: Int by lazy {
                            Objects.hash(unitAmount, tierLowerBound, additionalProperties)
                        }

                        override fun hashCode(): Int = hashCode

                        override fun toString() =
                            "Tier{unitAmount=$unitAmount, tierLowerBound=$tierLowerBound, additionalProperties=$additionalProperties}"
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is BulkWithFiltersConfig &&
                            filters == other.filters &&
                            tiers == other.tiers &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(filters, tiers, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "BulkWithFiltersConfig{filters=$filters, tiers=$tiers, additionalProperties=$additionalProperties}"
                }

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Cadence = apply {
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

                        return other is Cadence && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BulkWithFilters &&
                        bulkWithFiltersConfig == other.bulkWithFiltersConfig &&
                        cadence == other.cadence &&
                        currency == other.currency &&
                        itemId == other.itemId &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        bulkWithFiltersConfig,
                        cadence,
                        currency,
                        itemId,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BulkWithFilters{bulkWithFiltersConfig=$bulkWithFiltersConfig, cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            class GroupedWithMinMaxThresholds
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val currency: JsonField<String>,
                private val groupedWithMinMaxThresholdsConfig:
                    JsonField<GroupedWithMinMaxThresholdsConfig>,
                private val itemId: JsonField<String>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("grouped_with_min_max_thresholds_config")
                    @ExcludeMissing
                    groupedWithMinMaxThresholdsConfig:
                        JsonField<GroupedWithMinMaxThresholdsConfig> =
                        JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(
                    cadence,
                    currency,
                    groupedWithMinMaxThresholdsConfig,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * An ISO 4217 currency string for which this price is billed in.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Configuration for grouped_with_min_max_thresholds pricing
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun groupedWithMinMaxThresholdsConfig(): GroupedWithMinMaxThresholdsConfig =
                    groupedWithMinMaxThresholdsConfig.getRequired(
                        "grouped_with_min_max_thresholds_config"
                    )

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The pricing model type
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("grouped_with_min_max_thresholds")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [groupedWithMinMaxThresholdsConfig].
                 *
                 * Unlike [groupedWithMinMaxThresholdsConfig], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("grouped_with_min_max_thresholds_config")
                @ExcludeMissing
                fun _groupedWithMinMaxThresholdsConfig():
                    JsonField<GroupedWithMinMaxThresholdsConfig> = groupedWithMinMaxThresholdsConfig

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * [GroupedWithMinMaxThresholds].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .currency()
                     * .groupedWithMinMaxThresholdsConfig()
                     * .itemId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [GroupedWithMinMaxThresholds]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var currency: JsonField<String>? = null
                    private var groupedWithMinMaxThresholdsConfig:
                        JsonField<GroupedWithMinMaxThresholdsConfig>? =
                        null
                    private var itemId: JsonField<String>? = null
                    private var modelType: JsonValue =
                        JsonValue.from("grouped_with_min_max_thresholds")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(groupedWithMinMaxThresholds: GroupedWithMinMaxThresholds) =
                        apply {
                            cadence = groupedWithMinMaxThresholds.cadence
                            currency = groupedWithMinMaxThresholds.currency
                            groupedWithMinMaxThresholdsConfig =
                                groupedWithMinMaxThresholds.groupedWithMinMaxThresholdsConfig
                            itemId = groupedWithMinMaxThresholds.itemId
                            modelType = groupedWithMinMaxThresholds.modelType
                            name = groupedWithMinMaxThresholds.name
                            billableMetricId = groupedWithMinMaxThresholds.billableMetricId
                            billedInAdvance = groupedWithMinMaxThresholds.billedInAdvance
                            billingCycleConfiguration =
                                groupedWithMinMaxThresholds.billingCycleConfiguration
                            conversionRate = groupedWithMinMaxThresholds.conversionRate
                            conversionRateConfig = groupedWithMinMaxThresholds.conversionRateConfig
                            dimensionalPriceConfiguration =
                                groupedWithMinMaxThresholds.dimensionalPriceConfiguration
                            externalPriceId = groupedWithMinMaxThresholds.externalPriceId
                            fixedPriceQuantity = groupedWithMinMaxThresholds.fixedPriceQuantity
                            invoiceGroupingKey = groupedWithMinMaxThresholds.invoiceGroupingKey
                            invoicingCycleConfiguration =
                                groupedWithMinMaxThresholds.invoicingCycleConfiguration
                            metadata = groupedWithMinMaxThresholds.metadata
                            additionalProperties =
                                groupedWithMinMaxThresholds.additionalProperties.toMutableMap()
                        }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** Configuration for grouped_with_min_max_thresholds pricing */
                    fun groupedWithMinMaxThresholdsConfig(
                        groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                    ) =
                        groupedWithMinMaxThresholdsConfig(
                            JsonField.of(groupedWithMinMaxThresholdsConfig)
                        )

                    /**
                     * Sets [Builder.groupedWithMinMaxThresholdsConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.groupedWithMinMaxThresholdsConfig] with a
                     * well-typed [GroupedWithMinMaxThresholdsConfig] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun groupedWithMinMaxThresholdsConfig(
                        groupedWithMinMaxThresholdsConfig:
                            JsonField<GroupedWithMinMaxThresholdsConfig>
                    ) = apply {
                        this.groupedWithMinMaxThresholdsConfig = groupedWithMinMaxThresholdsConfig
                    }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("grouped_with_min_max_thresholds")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                     * Returns an immutable instance of [GroupedWithMinMaxThresholds].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .currency()
                     * .groupedWithMinMaxThresholdsConfig()
                     * .itemId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GroupedWithMinMaxThresholds =
                        GroupedWithMinMaxThresholds(
                            checkRequired("cadence", cadence),
                            checkRequired("currency", currency),
                            checkRequired(
                                "groupedWithMinMaxThresholdsConfig",
                                groupedWithMinMaxThresholdsConfig,
                            ),
                            checkRequired("itemId", itemId),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): GroupedWithMinMaxThresholds = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    currency()
                    groupedWithMinMaxThresholdsConfig().validate()
                    itemId()
                    _modelType().let {
                        if (it != JsonValue.from("grouped_with_min_max_thresholds")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
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
                    (cadence.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (groupedWithMinMaxThresholdsConfig.asKnown()?.validity() ?: 0) +
                        (if (itemId.asKnown() == null) 0 else 1) +
                        modelType.let {
                            if (it == JsonValue.from("grouped_with_min_max_thresholds")) 1 else 0
                        } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Cadence = apply {
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

                        return other is Cadence && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Configuration for grouped_with_min_max_thresholds pricing */
                class GroupedWithMinMaxThresholdsConfig
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val groupingKey: JsonField<String>,
                    private val maximumCharge: JsonField<String>,
                    private val minimumCharge: JsonField<String>,
                    private val perUnitRate: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("grouping_key")
                        @ExcludeMissing
                        groupingKey: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("maximum_charge")
                        @ExcludeMissing
                        maximumCharge: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("minimum_charge")
                        @ExcludeMissing
                        minimumCharge: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("per_unit_rate")
                        @ExcludeMissing
                        perUnitRate: JsonField<String> = JsonMissing.of(),
                    ) : this(groupingKey, maximumCharge, minimumCharge, perUnitRate, mutableMapOf())

                    /**
                     * The event property used to group before applying thresholds
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun groupingKey(): String = groupingKey.getRequired("grouping_key")

                    /**
                     * The maximum amount to charge each group
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun maximumCharge(): String = maximumCharge.getRequired("maximum_charge")

                    /**
                     * The minimum amount to charge each group, regardless of usage
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun minimumCharge(): String = minimumCharge.getRequired("minimum_charge")

                    /**
                     * The base price charged per group
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun perUnitRate(): String = perUnitRate.getRequired("per_unit_rate")

                    /**
                     * Returns the raw JSON value of [groupingKey].
                     *
                     * Unlike [groupingKey], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("grouping_key")
                    @ExcludeMissing
                    fun _groupingKey(): JsonField<String> = groupingKey

                    /**
                     * Returns the raw JSON value of [maximumCharge].
                     *
                     * Unlike [maximumCharge], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("maximum_charge")
                    @ExcludeMissing
                    fun _maximumCharge(): JsonField<String> = maximumCharge

                    /**
                     * Returns the raw JSON value of [minimumCharge].
                     *
                     * Unlike [minimumCharge], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("minimum_charge")
                    @ExcludeMissing
                    fun _minimumCharge(): JsonField<String> = minimumCharge

                    /**
                     * Returns the raw JSON value of [perUnitRate].
                     *
                     * Unlike [perUnitRate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("per_unit_rate")
                    @ExcludeMissing
                    fun _perUnitRate(): JsonField<String> = perUnitRate

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
                         * [GroupedWithMinMaxThresholdsConfig].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .groupingKey()
                         * .maximumCharge()
                         * .minimumCharge()
                         * .perUnitRate()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [GroupedWithMinMaxThresholdsConfig]. */
                    class Builder internal constructor() {

                        private var groupingKey: JsonField<String>? = null
                        private var maximumCharge: JsonField<String>? = null
                        private var minimumCharge: JsonField<String>? = null
                        private var perUnitRate: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            groupedWithMinMaxThresholdsConfig: GroupedWithMinMaxThresholdsConfig
                        ) = apply {
                            groupingKey = groupedWithMinMaxThresholdsConfig.groupingKey
                            maximumCharge = groupedWithMinMaxThresholdsConfig.maximumCharge
                            minimumCharge = groupedWithMinMaxThresholdsConfig.minimumCharge
                            perUnitRate = groupedWithMinMaxThresholdsConfig.perUnitRate
                            additionalProperties =
                                groupedWithMinMaxThresholdsConfig.additionalProperties
                                    .toMutableMap()
                        }

                        /** The event property used to group before applying thresholds */
                        fun groupingKey(groupingKey: String) =
                            groupingKey(JsonField.of(groupingKey))

                        /**
                         * Sets [Builder.groupingKey] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.groupingKey] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun groupingKey(groupingKey: JsonField<String>) = apply {
                            this.groupingKey = groupingKey
                        }

                        /** The maximum amount to charge each group */
                        fun maximumCharge(maximumCharge: String) =
                            maximumCharge(JsonField.of(maximumCharge))

                        /**
                         * Sets [Builder.maximumCharge] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.maximumCharge] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun maximumCharge(maximumCharge: JsonField<String>) = apply {
                            this.maximumCharge = maximumCharge
                        }

                        /** The minimum amount to charge each group, regardless of usage */
                        fun minimumCharge(minimumCharge: String) =
                            minimumCharge(JsonField.of(minimumCharge))

                        /**
                         * Sets [Builder.minimumCharge] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.minimumCharge] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun minimumCharge(minimumCharge: JsonField<String>) = apply {
                            this.minimumCharge = minimumCharge
                        }

                        /** The base price charged per group */
                        fun perUnitRate(perUnitRate: String) =
                            perUnitRate(JsonField.of(perUnitRate))

                        /**
                         * Sets [Builder.perUnitRate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.perUnitRate] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun perUnitRate(perUnitRate: JsonField<String>) = apply {
                            this.perUnitRate = perUnitRate
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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

                        /**
                         * Returns an immutable instance of [GroupedWithMinMaxThresholdsConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .groupingKey()
                         * .maximumCharge()
                         * .minimumCharge()
                         * .perUnitRate()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): GroupedWithMinMaxThresholdsConfig =
                            GroupedWithMinMaxThresholdsConfig(
                                checkRequired("groupingKey", groupingKey),
                                checkRequired("maximumCharge", maximumCharge),
                                checkRequired("minimumCharge", minimumCharge),
                                checkRequired("perUnitRate", perUnitRate),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): GroupedWithMinMaxThresholdsConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        groupingKey()
                        maximumCharge()
                        minimumCharge()
                        perUnitRate()
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
                        (if (groupingKey.asKnown() == null) 0 else 1) +
                            (if (maximumCharge.asKnown() == null) 0 else 1) +
                            (if (minimumCharge.asKnown() == null) 0 else 1) +
                            (if (perUnitRate.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is GroupedWithMinMaxThresholdsConfig &&
                            groupingKey == other.groupingKey &&
                            maximumCharge == other.maximumCharge &&
                            minimumCharge == other.minimumCharge &&
                            perUnitRate == other.perUnitRate &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            groupingKey,
                            maximumCharge,
                            minimumCharge,
                            perUnitRate,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "GroupedWithMinMaxThresholdsConfig{groupingKey=$groupingKey, maximumCharge=$maximumCharge, minimumCharge=$minimumCharge, perUnitRate=$perUnitRate, additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GroupedWithMinMaxThresholds &&
                        cadence == other.cadence &&
                        currency == other.currency &&
                        groupedWithMinMaxThresholdsConfig ==
                            other.groupedWithMinMaxThresholdsConfig &&
                        itemId == other.itemId &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        currency,
                        groupedWithMinMaxThresholdsConfig,
                        itemId,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GroupedWithMinMaxThresholds{cadence=$cadence, currency=$currency, groupedWithMinMaxThresholdsConfig=$groupedWithMinMaxThresholdsConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            class CumulativeGroupedAllocation
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val cumulativeGroupedAllocationConfig:
                    JsonField<CumulativeGroupedAllocationConfig>,
                private val currency: JsonField<String>,
                private val itemId: JsonField<String>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("cumulative_grouped_allocation_config")
                    @ExcludeMissing
                    cumulativeGroupedAllocationConfig:
                        JsonField<CumulativeGroupedAllocationConfig> =
                        JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(
                    cadence,
                    cumulativeGroupedAllocationConfig,
                    currency,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * Configuration for cumulative_grouped_allocation pricing
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cumulativeGroupedAllocationConfig(): CumulativeGroupedAllocationConfig =
                    cumulativeGroupedAllocationConfig.getRequired(
                        "cumulative_grouped_allocation_config"
                    )

                /**
                 * An ISO 4217 currency string for which this price is billed in.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The pricing model type
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("cumulative_grouped_allocation")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [cumulativeGroupedAllocationConfig].
                 *
                 * Unlike [cumulativeGroupedAllocationConfig], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("cumulative_grouped_allocation_config")
                @ExcludeMissing
                fun _cumulativeGroupedAllocationConfig():
                    JsonField<CumulativeGroupedAllocationConfig> = cumulativeGroupedAllocationConfig

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * [CumulativeGroupedAllocation].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .cumulativeGroupedAllocationConfig()
                     * .currency()
                     * .itemId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [CumulativeGroupedAllocation]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var cumulativeGroupedAllocationConfig:
                        JsonField<CumulativeGroupedAllocationConfig>? =
                        null
                    private var currency: JsonField<String>? = null
                    private var itemId: JsonField<String>? = null
                    private var modelType: JsonValue =
                        JsonValue.from("cumulative_grouped_allocation")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(cumulativeGroupedAllocation: CumulativeGroupedAllocation) =
                        apply {
                            cadence = cumulativeGroupedAllocation.cadence
                            cumulativeGroupedAllocationConfig =
                                cumulativeGroupedAllocation.cumulativeGroupedAllocationConfig
                            currency = cumulativeGroupedAllocation.currency
                            itemId = cumulativeGroupedAllocation.itemId
                            modelType = cumulativeGroupedAllocation.modelType
                            name = cumulativeGroupedAllocation.name
                            billableMetricId = cumulativeGroupedAllocation.billableMetricId
                            billedInAdvance = cumulativeGroupedAllocation.billedInAdvance
                            billingCycleConfiguration =
                                cumulativeGroupedAllocation.billingCycleConfiguration
                            conversionRate = cumulativeGroupedAllocation.conversionRate
                            conversionRateConfig = cumulativeGroupedAllocation.conversionRateConfig
                            dimensionalPriceConfiguration =
                                cumulativeGroupedAllocation.dimensionalPriceConfiguration
                            externalPriceId = cumulativeGroupedAllocation.externalPriceId
                            fixedPriceQuantity = cumulativeGroupedAllocation.fixedPriceQuantity
                            invoiceGroupingKey = cumulativeGroupedAllocation.invoiceGroupingKey
                            invoicingCycleConfiguration =
                                cumulativeGroupedAllocation.invoicingCycleConfiguration
                            metadata = cumulativeGroupedAllocation.metadata
                            additionalProperties =
                                cumulativeGroupedAllocation.additionalProperties.toMutableMap()
                        }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /** Configuration for cumulative_grouped_allocation pricing */
                    fun cumulativeGroupedAllocationConfig(
                        cumulativeGroupedAllocationConfig: CumulativeGroupedAllocationConfig
                    ) =
                        cumulativeGroupedAllocationConfig(
                            JsonField.of(cumulativeGroupedAllocationConfig)
                        )

                    /**
                     * Sets [Builder.cumulativeGroupedAllocationConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cumulativeGroupedAllocationConfig] with a
                     * well-typed [CumulativeGroupedAllocationConfig] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun cumulativeGroupedAllocationConfig(
                        cumulativeGroupedAllocationConfig:
                            JsonField<CumulativeGroupedAllocationConfig>
                    ) = apply {
                        this.cumulativeGroupedAllocationConfig = cumulativeGroupedAllocationConfig
                    }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("cumulative_grouped_allocation")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                     * Returns an immutable instance of [CumulativeGroupedAllocation].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .cumulativeGroupedAllocationConfig()
                     * .currency()
                     * .itemId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): CumulativeGroupedAllocation =
                        CumulativeGroupedAllocation(
                            checkRequired("cadence", cadence),
                            checkRequired(
                                "cumulativeGroupedAllocationConfig",
                                cumulativeGroupedAllocationConfig,
                            ),
                            checkRequired("currency", currency),
                            checkRequired("itemId", itemId),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): CumulativeGroupedAllocation = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    cumulativeGroupedAllocationConfig().validate()
                    currency()
                    itemId()
                    _modelType().let {
                        if (it != JsonValue.from("cumulative_grouped_allocation")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
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
                    (cadence.asKnown()?.validity() ?: 0) +
                        (cumulativeGroupedAllocationConfig.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (if (itemId.asKnown() == null) 0 else 1) +
                        modelType.let {
                            if (it == JsonValue.from("cumulative_grouped_allocation")) 1 else 0
                        } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Cadence = apply {
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

                        return other is Cadence && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Configuration for cumulative_grouped_allocation pricing */
                class CumulativeGroupedAllocationConfig
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val cumulativeAllocation: JsonField<String>,
                    private val groupAllocation: JsonField<String>,
                    private val groupingKey: JsonField<String>,
                    private val unitAmount: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("cumulative_allocation")
                        @ExcludeMissing
                        cumulativeAllocation: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("group_allocation")
                        @ExcludeMissing
                        groupAllocation: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("grouping_key")
                        @ExcludeMissing
                        groupingKey: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("unit_amount")
                        @ExcludeMissing
                        unitAmount: JsonField<String> = JsonMissing.of(),
                    ) : this(
                        cumulativeAllocation,
                        groupAllocation,
                        groupingKey,
                        unitAmount,
                        mutableMapOf(),
                    )

                    /**
                     * The overall allocation across all groups
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun cumulativeAllocation(): String =
                        cumulativeAllocation.getRequired("cumulative_allocation")

                    /**
                     * The allocation per individual group
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun groupAllocation(): String = groupAllocation.getRequired("group_allocation")

                    /**
                     * The event property used to group usage before applying allocations
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun groupingKey(): String = groupingKey.getRequired("grouping_key")

                    /**
                     * The amount to charge for each unit outside of the allocation
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun unitAmount(): String = unitAmount.getRequired("unit_amount")

                    /**
                     * Returns the raw JSON value of [cumulativeAllocation].
                     *
                     * Unlike [cumulativeAllocation], this method doesn't throw if the JSON field
                     * has an unexpected type.
                     */
                    @JsonProperty("cumulative_allocation")
                    @ExcludeMissing
                    fun _cumulativeAllocation(): JsonField<String> = cumulativeAllocation

                    /**
                     * Returns the raw JSON value of [groupAllocation].
                     *
                     * Unlike [groupAllocation], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("group_allocation")
                    @ExcludeMissing
                    fun _groupAllocation(): JsonField<String> = groupAllocation

                    /**
                     * Returns the raw JSON value of [groupingKey].
                     *
                     * Unlike [groupingKey], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("grouping_key")
                    @ExcludeMissing
                    fun _groupingKey(): JsonField<String> = groupingKey

                    /**
                     * Returns the raw JSON value of [unitAmount].
                     *
                     * Unlike [unitAmount], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unit_amount")
                    @ExcludeMissing
                    fun _unitAmount(): JsonField<String> = unitAmount

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
                         * [CumulativeGroupedAllocationConfig].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .cumulativeAllocation()
                         * .groupAllocation()
                         * .groupingKey()
                         * .unitAmount()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [CumulativeGroupedAllocationConfig]. */
                    class Builder internal constructor() {

                        private var cumulativeAllocation: JsonField<String>? = null
                        private var groupAllocation: JsonField<String>? = null
                        private var groupingKey: JsonField<String>? = null
                        private var unitAmount: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(
                            cumulativeGroupedAllocationConfig: CumulativeGroupedAllocationConfig
                        ) = apply {
                            cumulativeAllocation =
                                cumulativeGroupedAllocationConfig.cumulativeAllocation
                            groupAllocation = cumulativeGroupedAllocationConfig.groupAllocation
                            groupingKey = cumulativeGroupedAllocationConfig.groupingKey
                            unitAmount = cumulativeGroupedAllocationConfig.unitAmount
                            additionalProperties =
                                cumulativeGroupedAllocationConfig.additionalProperties
                                    .toMutableMap()
                        }

                        /** The overall allocation across all groups */
                        fun cumulativeAllocation(cumulativeAllocation: String) =
                            cumulativeAllocation(JsonField.of(cumulativeAllocation))

                        /**
                         * Sets [Builder.cumulativeAllocation] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.cumulativeAllocation] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun cumulativeAllocation(cumulativeAllocation: JsonField<String>) = apply {
                            this.cumulativeAllocation = cumulativeAllocation
                        }

                        /** The allocation per individual group */
                        fun groupAllocation(groupAllocation: String) =
                            groupAllocation(JsonField.of(groupAllocation))

                        /**
                         * Sets [Builder.groupAllocation] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.groupAllocation] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun groupAllocation(groupAllocation: JsonField<String>) = apply {
                            this.groupAllocation = groupAllocation
                        }

                        /** The event property used to group usage before applying allocations */
                        fun groupingKey(groupingKey: String) =
                            groupingKey(JsonField.of(groupingKey))

                        /**
                         * Sets [Builder.groupingKey] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.groupingKey] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun groupingKey(groupingKey: JsonField<String>) = apply {
                            this.groupingKey = groupingKey
                        }

                        /** The amount to charge for each unit outside of the allocation */
                        fun unitAmount(unitAmount: String) = unitAmount(JsonField.of(unitAmount))

                        /**
                         * Sets [Builder.unitAmount] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitAmount] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun unitAmount(unitAmount: JsonField<String>) = apply {
                            this.unitAmount = unitAmount
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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

                        /**
                         * Returns an immutable instance of [CumulativeGroupedAllocationConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .cumulativeAllocation()
                         * .groupAllocation()
                         * .groupingKey()
                         * .unitAmount()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): CumulativeGroupedAllocationConfig =
                            CumulativeGroupedAllocationConfig(
                                checkRequired("cumulativeAllocation", cumulativeAllocation),
                                checkRequired("groupAllocation", groupAllocation),
                                checkRequired("groupingKey", groupingKey),
                                checkRequired("unitAmount", unitAmount),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): CumulativeGroupedAllocationConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        cumulativeAllocation()
                        groupAllocation()
                        groupingKey()
                        unitAmount()
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
                        (if (cumulativeAllocation.asKnown() == null) 0 else 1) +
                            (if (groupAllocation.asKnown() == null) 0 else 1) +
                            (if (groupingKey.asKnown() == null) 0 else 1) +
                            (if (unitAmount.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CumulativeGroupedAllocationConfig &&
                            cumulativeAllocation == other.cumulativeAllocation &&
                            groupAllocation == other.groupAllocation &&
                            groupingKey == other.groupingKey &&
                            unitAmount == other.unitAmount &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            cumulativeAllocation,
                            groupAllocation,
                            groupingKey,
                            unitAmount,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CumulativeGroupedAllocationConfig{cumulativeAllocation=$cumulativeAllocation, groupAllocation=$groupAllocation, groupingKey=$groupingKey, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CumulativeGroupedAllocation &&
                        cadence == other.cadence &&
                        cumulativeGroupedAllocationConfig ==
                            other.cumulativeGroupedAllocationConfig &&
                        currency == other.currency &&
                        itemId == other.itemId &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        cumulativeGroupedAllocationConfig,
                        currency,
                        itemId,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CumulativeGroupedAllocation{cadence=$cadence, cumulativeGroupedAllocationConfig=$cumulativeGroupedAllocationConfig, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            class Percent
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val currency: JsonField<String>,
                private val itemId: JsonField<String>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val percentConfig: JsonField<PercentConfig>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("percent_config")
                    @ExcludeMissing
                    percentConfig: JsonField<PercentConfig> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(
                    cadence,
                    currency,
                    itemId,
                    modelType,
                    name,
                    percentConfig,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * An ISO 4217 currency string for which this price is billed in.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The pricing model type
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("percent")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Configuration for percent pricing
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun percentConfig(): PercentConfig = percentConfig.getRequired("percent_config")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [percentConfig].
                 *
                 * Unlike [percentConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("percent_config")
                @ExcludeMissing
                fun _percentConfig(): JsonField<PercentConfig> = percentConfig

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * Returns a mutable builder for constructing an instance of [Percent].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .currency()
                     * .itemId()
                     * .name()
                     * .percentConfig()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Percent]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var currency: JsonField<String>? = null
                    private var itemId: JsonField<String>? = null
                    private var modelType: JsonValue = JsonValue.from("percent")
                    private var name: JsonField<String>? = null
                    private var percentConfig: JsonField<PercentConfig>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(percent: Percent) = apply {
                        cadence = percent.cadence
                        currency = percent.currency
                        itemId = percent.itemId
                        modelType = percent.modelType
                        name = percent.name
                        percentConfig = percent.percentConfig
                        billableMetricId = percent.billableMetricId
                        billedInAdvance = percent.billedInAdvance
                        billingCycleConfiguration = percent.billingCycleConfiguration
                        conversionRate = percent.conversionRate
                        conversionRateConfig = percent.conversionRateConfig
                        dimensionalPriceConfiguration = percent.dimensionalPriceConfiguration
                        externalPriceId = percent.externalPriceId
                        fixedPriceQuantity = percent.fixedPriceQuantity
                        invoiceGroupingKey = percent.invoiceGroupingKey
                        invoicingCycleConfiguration = percent.invoicingCycleConfiguration
                        metadata = percent.metadata
                        additionalProperties = percent.additionalProperties.toMutableMap()
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("percent")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /** Configuration for percent pricing */
                    fun percentConfig(percentConfig: PercentConfig) =
                        percentConfig(JsonField.of(percentConfig))

                    /**
                     * Sets [Builder.percentConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.percentConfig] with a well-typed
                     * [PercentConfig] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun percentConfig(percentConfig: JsonField<PercentConfig>) = apply {
                        this.percentConfig = percentConfig
                    }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                     * Returns an immutable instance of [Percent].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .currency()
                     * .itemId()
                     * .name()
                     * .percentConfig()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Percent =
                        Percent(
                            checkRequired("cadence", cadence),
                            checkRequired("currency", currency),
                            checkRequired("itemId", itemId),
                            modelType,
                            checkRequired("name", name),
                            checkRequired("percentConfig", percentConfig),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Percent = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    currency()
                    itemId()
                    _modelType().let {
                        if (it != JsonValue.from("percent")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    percentConfig().validate()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
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
                    (cadence.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (if (itemId.asKnown() == null) 0 else 1) +
                        modelType.let { if (it == JsonValue.from("percent")) 1 else 0 } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (percentConfig.asKnown()?.validity() ?: 0) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Cadence = apply {
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

                        return other is Cadence && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Configuration for percent pricing */
                class PercentConfig
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val percent: JsonField<Double>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("percent")
                        @ExcludeMissing
                        percent: JsonField<Double> = JsonMissing.of()
                    ) : this(percent, mutableMapOf())

                    /**
                     * What percent of the component subtotals to charge
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun percent(): Double = percent.getRequired("percent")

                    /**
                     * Returns the raw JSON value of [percent].
                     *
                     * Unlike [percent], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("percent")
                    @ExcludeMissing
                    fun _percent(): JsonField<Double> = percent

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
                         * [PercentConfig].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .percent()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [PercentConfig]. */
                    class Builder internal constructor() {

                        private var percent: JsonField<Double>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(percentConfig: PercentConfig) = apply {
                            percent = percentConfig.percent
                            additionalProperties = percentConfig.additionalProperties.toMutableMap()
                        }

                        /** What percent of the component subtotals to charge */
                        fun percent(percent: Double) = percent(JsonField.of(percent))

                        /**
                         * Sets [Builder.percent] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.percent] with a well-typed [Double]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun percent(percent: JsonField<Double>) = apply { this.percent = percent }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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

                        /**
                         * Returns an immutable instance of [PercentConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .percent()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): PercentConfig =
                            PercentConfig(
                                checkRequired("percent", percent),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): PercentConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        percent()
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
                    internal fun validity(): Int = (if (percent.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PercentConfig &&
                            percent == other.percent &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(percent, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "PercentConfig{percent=$percent, additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Percent &&
                        cadence == other.cadence &&
                        currency == other.currency &&
                        itemId == other.itemId &&
                        modelType == other.modelType &&
                        name == other.name &&
                        percentConfig == other.percentConfig &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        currency,
                        itemId,
                        modelType,
                        name,
                        percentConfig,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Percent{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, percentConfig=$percentConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
            }

            class EventOutput
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val cadence: JsonField<Cadence>,
                private val currency: JsonField<String>,
                private val eventOutputConfig: JsonField<EventOutputConfig>,
                private val itemId: JsonField<String>,
                private val modelType: JsonValue,
                private val name: JsonField<String>,
                private val billableMetricId: JsonField<String>,
                private val billedInAdvance: JsonField<Boolean>,
                private val billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val conversionRate: JsonField<Double>,
                private val conversionRateConfig: JsonField<ConversionRateConfig>,
                private val dimensionalPriceConfiguration:
                    JsonField<NewDimensionalPriceConfiguration>,
                private val externalPriceId: JsonField<String>,
                private val fixedPriceQuantity: JsonField<Double>,
                private val invoiceGroupingKey: JsonField<String>,
                private val invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>,
                private val metadata: JsonField<Metadata>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("cadence")
                    @ExcludeMissing
                    cadence: JsonField<Cadence> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("event_output_config")
                    @ExcludeMissing
                    eventOutputConfig: JsonField<EventOutputConfig> = JsonMissing.of(),
                    @JsonProperty("item_id")
                    @ExcludeMissing
                    itemId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("model_type")
                    @ExcludeMissing
                    modelType: JsonValue = JsonMissing.of(),
                    @JsonProperty("name")
                    @ExcludeMissing
                    name: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billable_metric_id")
                    @ExcludeMissing
                    billableMetricId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("billed_in_advance")
                    @ExcludeMissing
                    billedInAdvance: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("billing_cycle_configuration")
                    @ExcludeMissing
                    billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("conversion_rate_config")
                    @ExcludeMissing
                    conversionRateConfig: JsonField<ConversionRateConfig> = JsonMissing.of(),
                    @JsonProperty("dimensional_price_configuration")
                    @ExcludeMissing
                    dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("external_price_id")
                    @ExcludeMissing
                    externalPriceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("fixed_price_quantity")
                    @ExcludeMissing
                    fixedPriceQuantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_grouping_key")
                    @ExcludeMissing
                    invoiceGroupingKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("invoicing_cycle_configuration")
                    @ExcludeMissing
                    invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of(),
                    @JsonProperty("metadata")
                    @ExcludeMissing
                    metadata: JsonField<Metadata> = JsonMissing.of(),
                ) : this(
                    cadence,
                    currency,
                    eventOutputConfig,
                    itemId,
                    modelType,
                    name,
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    conversionRateConfig,
                    dimensionalPriceConfiguration,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
                    mutableMapOf(),
                )

                /**
                 * The cadence to bill for this price on.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun cadence(): Cadence = cadence.getRequired("cadence")

                /**
                 * An ISO 4217 currency string for which this price is billed in.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Configuration for event_output pricing
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun eventOutputConfig(): EventOutputConfig =
                    eventOutputConfig.getRequired("event_output_config")

                /**
                 * The id of the item the price will be associated with.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun itemId(): String = itemId.getRequired("item_id")

                /**
                 * The pricing model type
                 *
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("event_output")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("model_type") @ExcludeMissing fun _modelType(): JsonValue = modelType

                /**
                 * The name of the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * The id of the billable metric for the price. Only needed if the price is
                 * usage-based.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billableMetricId(): String? = billableMetricId.getNullable("billable_metric_id")

                /**
                 * If the Price represents a fixed cost, the price will be billed in-advance if this
                 * is true, and in-arrears if this is false.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billedInAdvance(): Boolean? = billedInAdvance.getNullable("billed_in_advance")

                /**
                 * For custom cadence: specifies the duration of the billing period in days or
                 * months.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun billingCycleConfiguration(): NewBillingCycleConfiguration? =
                    billingCycleConfiguration.getNullable("billing_cycle_configuration")

                /**
                 * The per unit conversion rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRate(): Double? = conversionRate.getNullable("conversion_rate")

                /**
                 * The configuration for the rate of the price currency to the invoicing currency.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun conversionRateConfig(): ConversionRateConfig? =
                    conversionRateConfig.getNullable("conversion_rate_config")

                /**
                 * For dimensional price: specifies a price group and dimension values
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun dimensionalPriceConfiguration(): NewDimensionalPriceConfiguration? =
                    dimensionalPriceConfiguration.getNullable("dimensional_price_configuration")

                /**
                 * An alias for the price.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

                /**
                 * If the Price represents a fixed cost, this represents the quantity of units
                 * applied.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun fixedPriceQuantity(): Double? =
                    fixedPriceQuantity.getNullable("fixed_price_quantity")

                /**
                 * The property used to group this price on an invoice
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoiceGroupingKey(): String? =
                    invoiceGroupingKey.getNullable("invoice_grouping_key")

                /**
                 * Within each billing cycle, specifies the cadence at which invoices are produced.
                 * If unspecified, a single invoice is produced per billing cycle.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun invoicingCycleConfiguration(): NewBillingCycleConfiguration? =
                    invoicingCycleConfiguration.getNullable("invoicing_cycle_configuration")

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
                 *
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if
                 *   the server responded with an unexpected value).
                 */
                fun metadata(): Metadata? = metadata.getNullable("metadata")

                /**
                 * Returns the raw JSON value of [cadence].
                 *
                 * Unlike [cadence], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cadence")
                @ExcludeMissing
                fun _cadence(): JsonField<Cadence> = cadence

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                /**
                 * Returns the raw JSON value of [eventOutputConfig].
                 *
                 * Unlike [eventOutputConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("event_output_config")
                @ExcludeMissing
                fun _eventOutputConfig(): JsonField<EventOutputConfig> = eventOutputConfig

                /**
                 * Returns the raw JSON value of [itemId].
                 *
                 * Unlike [itemId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("item_id") @ExcludeMissing fun _itemId(): JsonField<String> = itemId

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * Returns the raw JSON value of [billableMetricId].
                 *
                 * Unlike [billableMetricId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billable_metric_id")
                @ExcludeMissing
                fun _billableMetricId(): JsonField<String> = billableMetricId

                /**
                 * Returns the raw JSON value of [billedInAdvance].
                 *
                 * Unlike [billedInAdvance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("billed_in_advance")
                @ExcludeMissing
                fun _billedInAdvance(): JsonField<Boolean> = billedInAdvance

                /**
                 * Returns the raw JSON value of [billingCycleConfiguration].
                 *
                 * Unlike [billingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("billing_cycle_configuration")
                @ExcludeMissing
                fun _billingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    billingCycleConfiguration

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<Double> = conversionRate

                /**
                 * Returns the raw JSON value of [conversionRateConfig].
                 *
                 * Unlike [conversionRateConfig], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate_config")
                @ExcludeMissing
                fun _conversionRateConfig(): JsonField<ConversionRateConfig> = conversionRateConfig

                /**
                 * Returns the raw JSON value of [dimensionalPriceConfiguration].
                 *
                 * Unlike [dimensionalPriceConfiguration], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("dimensional_price_configuration")
                @ExcludeMissing
                fun _dimensionalPriceConfiguration(): JsonField<NewDimensionalPriceConfiguration> =
                    dimensionalPriceConfiguration

                /**
                 * Returns the raw JSON value of [externalPriceId].
                 *
                 * Unlike [externalPriceId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_price_id")
                @ExcludeMissing
                fun _externalPriceId(): JsonField<String> = externalPriceId

                /**
                 * Returns the raw JSON value of [fixedPriceQuantity].
                 *
                 * Unlike [fixedPriceQuantity], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("fixed_price_quantity")
                @ExcludeMissing
                fun _fixedPriceQuantity(): JsonField<Double> = fixedPriceQuantity

                /**
                 * Returns the raw JSON value of [invoiceGroupingKey].
                 *
                 * Unlike [invoiceGroupingKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_grouping_key")
                @ExcludeMissing
                fun _invoiceGroupingKey(): JsonField<String> = invoiceGroupingKey

                /**
                 * Returns the raw JSON value of [invoicingCycleConfiguration].
                 *
                 * Unlike [invoicingCycleConfiguration], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("invoicing_cycle_configuration")
                @ExcludeMissing
                fun _invoicingCycleConfiguration(): JsonField<NewBillingCycleConfiguration> =
                    invoicingCycleConfiguration

                /**
                 * Returns the raw JSON value of [metadata].
                 *
                 * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("metadata")
                @ExcludeMissing
                fun _metadata(): JsonField<Metadata> = metadata

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
                     * Returns a mutable builder for constructing an instance of [EventOutput].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .currency()
                     * .eventOutputConfig()
                     * .itemId()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [EventOutput]. */
                class Builder internal constructor() {

                    private var cadence: JsonField<Cadence>? = null
                    private var currency: JsonField<String>? = null
                    private var eventOutputConfig: JsonField<EventOutputConfig>? = null
                    private var itemId: JsonField<String>? = null
                    private var modelType: JsonValue = JsonValue.from("event_output")
                    private var name: JsonField<String>? = null
                    private var billableMetricId: JsonField<String> = JsonMissing.of()
                    private var billedInAdvance: JsonField<Boolean> = JsonMissing.of()
                    private var billingCycleConfiguration: JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var conversionRate: JsonField<Double> = JsonMissing.of()
                    private var conversionRateConfig: JsonField<ConversionRateConfig> =
                        JsonMissing.of()
                    private var dimensionalPriceConfiguration:
                        JsonField<NewDimensionalPriceConfiguration> =
                        JsonMissing.of()
                    private var externalPriceId: JsonField<String> = JsonMissing.of()
                    private var fixedPriceQuantity: JsonField<Double> = JsonMissing.of()
                    private var invoiceGroupingKey: JsonField<String> = JsonMissing.of()
                    private var invoicingCycleConfiguration:
                        JsonField<NewBillingCycleConfiguration> =
                        JsonMissing.of()
                    private var metadata: JsonField<Metadata> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(eventOutput: EventOutput) = apply {
                        cadence = eventOutput.cadence
                        currency = eventOutput.currency
                        eventOutputConfig = eventOutput.eventOutputConfig
                        itemId = eventOutput.itemId
                        modelType = eventOutput.modelType
                        name = eventOutput.name
                        billableMetricId = eventOutput.billableMetricId
                        billedInAdvance = eventOutput.billedInAdvance
                        billingCycleConfiguration = eventOutput.billingCycleConfiguration
                        conversionRate = eventOutput.conversionRate
                        conversionRateConfig = eventOutput.conversionRateConfig
                        dimensionalPriceConfiguration = eventOutput.dimensionalPriceConfiguration
                        externalPriceId = eventOutput.externalPriceId
                        fixedPriceQuantity = eventOutput.fixedPriceQuantity
                        invoiceGroupingKey = eventOutput.invoiceGroupingKey
                        invoicingCycleConfiguration = eventOutput.invoicingCycleConfiguration
                        metadata = eventOutput.metadata
                        additionalProperties = eventOutput.additionalProperties.toMutableMap()
                    }

                    /** The cadence to bill for this price on. */
                    fun cadence(cadence: Cadence) = cadence(JsonField.of(cadence))

                    /**
                     * Sets [Builder.cadence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cadence] with a well-typed [Cadence] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun cadence(cadence: JsonField<Cadence>) = apply { this.cadence = cadence }

                    /** An ISO 4217 currency string for which this price is billed in. */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    /** Configuration for event_output pricing */
                    fun eventOutputConfig(eventOutputConfig: EventOutputConfig) =
                        eventOutputConfig(JsonField.of(eventOutputConfig))

                    /**
                     * Sets [Builder.eventOutputConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.eventOutputConfig] with a well-typed
                     * [EventOutputConfig] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun eventOutputConfig(eventOutputConfig: JsonField<EventOutputConfig>) = apply {
                        this.eventOutputConfig = eventOutputConfig
                    }

                    /** The id of the item the price will be associated with. */
                    fun itemId(itemId: String) = itemId(JsonField.of(itemId))

                    /**
                     * Sets [Builder.itemId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.itemId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun itemId(itemId: JsonField<String>) = apply { this.itemId = itemId }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("event_output")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun modelType(modelType: JsonValue) = apply { this.modelType = modelType }

                    /** The name of the price. */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The id of the billable metric for the price. Only needed if the price is
                     * usage-based.
                     */
                    fun billableMetricId(billableMetricId: String?) =
                        billableMetricId(JsonField.ofNullable(billableMetricId))

                    /**
                     * Sets [Builder.billableMetricId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billableMetricId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                        this.billableMetricId = billableMetricId
                    }

                    /**
                     * If the Price represents a fixed cost, the price will be billed in-advance if
                     * this is true, and in-arrears if this is false.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean?) =
                        billedInAdvance(JsonField.ofNullable(billedInAdvance))

                    /**
                     * Alias for [Builder.billedInAdvance].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun billedInAdvance(billedInAdvance: Boolean) =
                        billedInAdvance(billedInAdvance as Boolean?)

                    /**
                     * Sets [Builder.billedInAdvance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billedInAdvance] with a well-typed [Boolean]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun billedInAdvance(billedInAdvance: JsonField<Boolean>) = apply {
                        this.billedInAdvance = billedInAdvance
                    }

                    /**
                     * For custom cadence: specifies the duration of the billing period in days or
                     * months.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: NewBillingCycleConfiguration?
                    ) = billingCycleConfiguration(JsonField.ofNullable(billingCycleConfiguration))

                    /**
                     * Sets [Builder.billingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.billingCycleConfiguration] with a well-typed
                     * [NewBillingCycleConfiguration] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun billingCycleConfiguration(
                        billingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.billingCycleConfiguration = billingCycleConfiguration }

                    /**
                     * The per unit conversion rate of the price currency to the invoicing currency.
                     */
                    fun conversionRate(conversionRate: Double?) =
                        conversionRate(JsonField.ofNullable(conversionRate))

                    /**
                     * Alias for [Builder.conversionRate].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun conversionRate(conversionRate: Double) =
                        conversionRate(conversionRate as Double?)

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<Double>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * The configuration for the rate of the price currency to the invoicing
                     * currency.
                     */
                    fun conversionRateConfig(conversionRateConfig: ConversionRateConfig?) =
                        conversionRateConfig(JsonField.ofNullable(conversionRateConfig))

                    /**
                     * Sets [Builder.conversionRateConfig] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRateConfig] with a well-typed
                     * [ConversionRateConfig] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun conversionRateConfig(
                        conversionRateConfig: JsonField<ConversionRateConfig>
                    ) = apply { this.conversionRateConfig = conversionRateConfig }

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofUnit(unit)`.
                     */
                    fun conversionRateConfig(unit: UnitConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofUnit(unit))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * UnitConversionRateConfig.builder()
                     *     .conversionRateType(UnitConversionRateConfig.ConversionRateType.UNIT)
                     *     .unitConfig(unitConfig)
                     *     .build()
                     * ```
                     */
                    fun unitConversionRateConfig(unitConfig: ConversionRateUnitConfig) =
                        conversionRateConfig(
                            UnitConversionRateConfig.builder()
                                .conversionRateType(
                                    UnitConversionRateConfig.ConversionRateType.UNIT
                                )
                                .unitConfig(unitConfig)
                                .build()
                        )

                    /**
                     * Alias for calling [conversionRateConfig] with
                     * `ConversionRateConfig.ofTiered(tiered)`.
                     */
                    fun conversionRateConfig(tiered: TieredConversionRateConfig) =
                        conversionRateConfig(ConversionRateConfig.ofTiered(tiered))

                    /**
                     * Alias for calling [conversionRateConfig] with the following:
                     * ```kotlin
                     * TieredConversionRateConfig.builder()
                     *     .conversionRateType(TieredConversionRateConfig.ConversionRateType.TIERED)
                     *     .tieredConfig(tieredConfig)
                     *     .build()
                     * ```
                     */
                    fun tieredConversionRateConfig(tieredConfig: ConversionRateTieredConfig) =
                        conversionRateConfig(
                            TieredConversionRateConfig.builder()
                                .conversionRateType(
                                    TieredConversionRateConfig.ConversionRateType.TIERED
                                )
                                .tieredConfig(tieredConfig)
                                .build()
                        )

                    /** For dimensional price: specifies a price group and dimension values */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: NewDimensionalPriceConfiguration?
                    ) =
                        dimensionalPriceConfiguration(
                            JsonField.ofNullable(dimensionalPriceConfiguration)
                        )

                    /**
                     * Sets [Builder.dimensionalPriceConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.dimensionalPriceConfiguration] with a
                     * well-typed [NewDimensionalPriceConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun dimensionalPriceConfiguration(
                        dimensionalPriceConfiguration: JsonField<NewDimensionalPriceConfiguration>
                    ) = apply { this.dimensionalPriceConfiguration = dimensionalPriceConfiguration }

                    /** An alias for the price. */
                    fun externalPriceId(externalPriceId: String?) =
                        externalPriceId(JsonField.ofNullable(externalPriceId))

                    /**
                     * Sets [Builder.externalPriceId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalPriceId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalPriceId(externalPriceId: JsonField<String>) = apply {
                        this.externalPriceId = externalPriceId
                    }

                    /**
                     * If the Price represents a fixed cost, this represents the quantity of units
                     * applied.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double?) =
                        fixedPriceQuantity(JsonField.ofNullable(fixedPriceQuantity))

                    /**
                     * Alias for [Builder.fixedPriceQuantity].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                        fixedPriceQuantity(fixedPriceQuantity as Double?)

                    /**
                     * Sets [Builder.fixedPriceQuantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fixedPriceQuantity] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun fixedPriceQuantity(fixedPriceQuantity: JsonField<Double>) = apply {
                        this.fixedPriceQuantity = fixedPriceQuantity
                    }

                    /** The property used to group this price on an invoice */
                    fun invoiceGroupingKey(invoiceGroupingKey: String?) =
                        invoiceGroupingKey(JsonField.ofNullable(invoiceGroupingKey))

                    /**
                     * Sets [Builder.invoiceGroupingKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceGroupingKey] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun invoiceGroupingKey(invoiceGroupingKey: JsonField<String>) = apply {
                        this.invoiceGroupingKey = invoiceGroupingKey
                    }

                    /**
                     * Within each billing cycle, specifies the cadence at which invoices are
                     * produced. If unspecified, a single invoice is produced per billing cycle.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: NewBillingCycleConfiguration?
                    ) =
                        invoicingCycleConfiguration(
                            JsonField.ofNullable(invoicingCycleConfiguration)
                        )

                    /**
                     * Sets [Builder.invoicingCycleConfiguration] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoicingCycleConfiguration] with a
                     * well-typed [NewBillingCycleConfiguration] value instead. This method is
                     * primarily for setting the field to an undocumented or not yet supported
                     * value.
                     */
                    fun invoicingCycleConfiguration(
                        invoicingCycleConfiguration: JsonField<NewBillingCycleConfiguration>
                    ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

                    /**
                     * User-specified key/value pairs for the resource. Individual keys can be
                     * removed by setting the value to `null`, and the entire metadata mapping can
                     * be cleared by setting `metadata` to `null`.
                     */
                    fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

                    /**
                     * Sets [Builder.metadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.metadata] with a well-typed [Metadata] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

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
                     * Returns an immutable instance of [EventOutput].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .cadence()
                     * .currency()
                     * .eventOutputConfig()
                     * .itemId()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): EventOutput =
                        EventOutput(
                            checkRequired("cadence", cadence),
                            checkRequired("currency", currency),
                            checkRequired("eventOutputConfig", eventOutputConfig),
                            checkRequired("itemId", itemId),
                            modelType,
                            checkRequired("name", name),
                            billableMetricId,
                            billedInAdvance,
                            billingCycleConfiguration,
                            conversionRate,
                            conversionRateConfig,
                            dimensionalPriceConfiguration,
                            externalPriceId,
                            fixedPriceQuantity,
                            invoiceGroupingKey,
                            invoicingCycleConfiguration,
                            metadata,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): EventOutput = apply {
                    if (validated) {
                        return@apply
                    }

                    cadence().validate()
                    currency()
                    eventOutputConfig().validate()
                    itemId()
                    _modelType().let {
                        if (it != JsonValue.from("event_output")) {
                            throw OrbInvalidDataException("'modelType' is invalid, received $it")
                        }
                    }
                    name()
                    billableMetricId()
                    billedInAdvance()
                    billingCycleConfiguration()?.validate()
                    conversionRate()
                    conversionRateConfig()?.validate()
                    dimensionalPriceConfiguration()?.validate()
                    externalPriceId()
                    fixedPriceQuantity()
                    invoiceGroupingKey()
                    invoicingCycleConfiguration()?.validate()
                    metadata()?.validate()
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
                    (cadence.asKnown()?.validity() ?: 0) +
                        (if (currency.asKnown() == null) 0 else 1) +
                        (eventOutputConfig.asKnown()?.validity() ?: 0) +
                        (if (itemId.asKnown() == null) 0 else 1) +
                        modelType.let { if (it == JsonValue.from("event_output")) 1 else 0 } +
                        (if (name.asKnown() == null) 0 else 1) +
                        (if (billableMetricId.asKnown() == null) 0 else 1) +
                        (if (billedInAdvance.asKnown() == null) 0 else 1) +
                        (billingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (if (conversionRate.asKnown() == null) 0 else 1) +
                        (conversionRateConfig.asKnown()?.validity() ?: 0) +
                        (dimensionalPriceConfiguration.asKnown()?.validity() ?: 0) +
                        (if (externalPriceId.asKnown() == null) 0 else 1) +
                        (if (fixedPriceQuantity.asKnown() == null) 0 else 1) +
                        (if (invoiceGroupingKey.asKnown() == null) 0 else 1) +
                        (invoicingCycleConfiguration.asKnown()?.validity() ?: 0) +
                        (metadata.asKnown()?.validity() ?: 0)

                /** The cadence to bill for this price on. */
                class Cadence
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val ANNUAL = of("annual")

                        val SEMI_ANNUAL = of("semi_annual")

                        val MONTHLY = of("monthly")

                        val QUARTERLY = of("quarterly")

                        val ONE_TIME = of("one_time")

                        val CUSTOM = of("custom")

                        fun of(value: String) = Cadence(JsonField.of(value))
                    }

                    /** An enum containing [Cadence]'s known values. */
                    enum class Known {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                    }

                    /**
                     * An enum containing [Cadence]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Cadence] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        ANNUAL,
                        SEMI_ANNUAL,
                        MONTHLY,
                        QUARTERLY,
                        ONE_TIME,
                        CUSTOM,
                        /**
                         * An enum member indicating that [Cadence] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            ANNUAL -> Value.ANNUAL
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ONE_TIME -> Value.ONE_TIME
                            CUSTOM -> Value.CUSTOM
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws OrbInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            ANNUAL -> Known.ANNUAL
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            ONE_TIME -> Known.ONE_TIME
                            CUSTOM -> Known.CUSTOM
                            else -> throw OrbInvalidDataException("Unknown Cadence: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws OrbInvalidDataException if this class instance's value does not have
                     *   the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw OrbInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Cadence = apply {
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

                        return other is Cadence && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Configuration for event_output pricing */
                class EventOutputConfig
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val unitRatingKey: JsonField<String>,
                    private val defaultUnitRate: JsonField<String>,
                    private val groupingKey: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("unit_rating_key")
                        @ExcludeMissing
                        unitRatingKey: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("default_unit_rate")
                        @ExcludeMissing
                        defaultUnitRate: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("grouping_key")
                        @ExcludeMissing
                        groupingKey: JsonField<String> = JsonMissing.of(),
                    ) : this(unitRatingKey, defaultUnitRate, groupingKey, mutableMapOf())

                    /**
                     * The key in the event data to extract the unit rate from.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type or
                     *   is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun unitRatingKey(): String = unitRatingKey.getRequired("unit_rating_key")

                    /**
                     * If provided, this amount will be used as the unit rate when an event does not
                     * have a value for the `unit_rating_key`. If not provided, events missing a
                     * unit rate will be ignored.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun defaultUnitRate(): String? =
                        defaultUnitRate.getNullable("default_unit_rate")

                    /**
                     * An optional key in the event data to group by (e.g., event ID). All events
                     * will also be grouped by their unit rate.
                     *
                     * @throws OrbInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun groupingKey(): String? = groupingKey.getNullable("grouping_key")

                    /**
                     * Returns the raw JSON value of [unitRatingKey].
                     *
                     * Unlike [unitRatingKey], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("unit_rating_key")
                    @ExcludeMissing
                    fun _unitRatingKey(): JsonField<String> = unitRatingKey

                    /**
                     * Returns the raw JSON value of [defaultUnitRate].
                     *
                     * Unlike [defaultUnitRate], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("default_unit_rate")
                    @ExcludeMissing
                    fun _defaultUnitRate(): JsonField<String> = defaultUnitRate

                    /**
                     * Returns the raw JSON value of [groupingKey].
                     *
                     * Unlike [groupingKey], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("grouping_key")
                    @ExcludeMissing
                    fun _groupingKey(): JsonField<String> = groupingKey

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
                         * [EventOutputConfig].
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .unitRatingKey()
                         * ```
                         */
                        fun builder() = Builder()
                    }

                    /** A builder for [EventOutputConfig]. */
                    class Builder internal constructor() {

                        private var unitRatingKey: JsonField<String>? = null
                        private var defaultUnitRate: JsonField<String> = JsonMissing.of()
                        private var groupingKey: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(eventOutputConfig: EventOutputConfig) = apply {
                            unitRatingKey = eventOutputConfig.unitRatingKey
                            defaultUnitRate = eventOutputConfig.defaultUnitRate
                            groupingKey = eventOutputConfig.groupingKey
                            additionalProperties =
                                eventOutputConfig.additionalProperties.toMutableMap()
                        }

                        /** The key in the event data to extract the unit rate from. */
                        fun unitRatingKey(unitRatingKey: String) =
                            unitRatingKey(JsonField.of(unitRatingKey))

                        /**
                         * Sets [Builder.unitRatingKey] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.unitRatingKey] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun unitRatingKey(unitRatingKey: JsonField<String>) = apply {
                            this.unitRatingKey = unitRatingKey
                        }

                        /**
                         * If provided, this amount will be used as the unit rate when an event does
                         * not have a value for the `unit_rating_key`. If not provided, events
                         * missing a unit rate will be ignored.
                         */
                        fun defaultUnitRate(defaultUnitRate: String?) =
                            defaultUnitRate(JsonField.ofNullable(defaultUnitRate))

                        /**
                         * Sets [Builder.defaultUnitRate] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.defaultUnitRate] with a well-typed
                         * [String] value instead. This method is primarily for setting the field to
                         * an undocumented or not yet supported value.
                         */
                        fun defaultUnitRate(defaultUnitRate: JsonField<String>) = apply {
                            this.defaultUnitRate = defaultUnitRate
                        }

                        /**
                         * An optional key in the event data to group by (e.g., event ID). All
                         * events will also be grouped by their unit rate.
                         */
                        fun groupingKey(groupingKey: String?) =
                            groupingKey(JsonField.ofNullable(groupingKey))

                        /**
                         * Sets [Builder.groupingKey] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.groupingKey] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun groupingKey(groupingKey: JsonField<String>) = apply {
                            this.groupingKey = groupingKey
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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

                        /**
                         * Returns an immutable instance of [EventOutputConfig].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```kotlin
                         * .unitRatingKey()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): EventOutputConfig =
                            EventOutputConfig(
                                checkRequired("unitRatingKey", unitRatingKey),
                                defaultUnitRate,
                                groupingKey,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): EventOutputConfig = apply {
                        if (validated) {
                            return@apply
                        }

                        unitRatingKey()
                        defaultUnitRate()
                        groupingKey()
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
                        (if (unitRatingKey.asKnown() == null) 0 else 1) +
                            (if (defaultUnitRate.asKnown() == null) 0 else 1) +
                            (if (groupingKey.asKnown() == null) 0 else 1)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is EventOutputConfig &&
                            unitRatingKey == other.unitRatingKey &&
                            defaultUnitRate == other.defaultUnitRate &&
                            groupingKey == other.groupingKey &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(
                            unitRatingKey,
                            defaultUnitRate,
                            groupingKey,
                            additionalProperties,
                        )
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "EventOutputConfig{unitRatingKey=$unitRatingKey, defaultUnitRate=$defaultUnitRate, groupingKey=$groupingKey, additionalProperties=$additionalProperties}"
                }

                /**
                 * User-specified key/value pairs for the resource. Individual keys can be removed
                 * by setting the value to `null`, and the entire metadata mapping can be cleared by
                 * setting `metadata` to `null`.
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

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(metadata: Metadata) = apply {
                            additionalProperties = metadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

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
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Metadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is EventOutput &&
                        cadence == other.cadence &&
                        currency == other.currency &&
                        eventOutputConfig == other.eventOutputConfig &&
                        itemId == other.itemId &&
                        modelType == other.modelType &&
                        name == other.name &&
                        billableMetricId == other.billableMetricId &&
                        billedInAdvance == other.billedInAdvance &&
                        billingCycleConfiguration == other.billingCycleConfiguration &&
                        conversionRate == other.conversionRate &&
                        conversionRateConfig == other.conversionRateConfig &&
                        dimensionalPriceConfiguration == other.dimensionalPriceConfiguration &&
                        externalPriceId == other.externalPriceId &&
                        fixedPriceQuantity == other.fixedPriceQuantity &&
                        invoiceGroupingKey == other.invoiceGroupingKey &&
                        invoicingCycleConfiguration == other.invoicingCycleConfiguration &&
                        metadata == other.metadata &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        cadence,
                        currency,
                        eventOutputConfig,
                        itemId,
                        modelType,
                        name,
                        billableMetricId,
                        billedInAdvance,
                        billingCycleConfiguration,
                        conversionRate,
                        conversionRateConfig,
                        dimensionalPriceConfiguration,
                        externalPriceId,
                        fixedPriceQuantity,
                        invoiceGroupingKey,
                        invoicingCycleConfiguration,
                        metadata,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "EventOutput{cadence=$cadence, currency=$currency, eventOutputConfig=$eventOutputConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, conversionRateConfig=$conversionRateConfig, dimensionalPriceConfiguration=$dimensionalPriceConfiguration, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Add &&
                startDate == other.startDate &&
                allocationPrice == other.allocationPrice &&
                discounts == other.discounts &&
                endDate == other.endDate &&
                externalPriceId == other.externalPriceId &&
                filter == other.filter &&
                fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions &&
                maximumAmount == other.maximumAmount &&
                minimumAmount == other.minimumAmount &&
                price == other.price &&
                priceId == other.priceId &&
                usageCustomerIds == other.usageCustomerIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                startDate,
                allocationPrice,
                discounts,
                endDate,
                externalPriceId,
                filter,
                fixedFeeQuantityTransitions,
                maximumAmount,
                minimumAmount,
                price,
                priceId,
                usageCustomerIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Add{startDate=$startDate, allocationPrice=$allocationPrice, discounts=$discounts, endDate=$endDate, externalPriceId=$externalPriceId, filter=$filter, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, price=$price, priceId=$priceId, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    class AddAdjustment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val startDate: JsonField<StartDate>,
        private val adjustment: JsonField<Adjustment>,
        private val adjustmentId: JsonField<String>,
        private val endDate: JsonField<EndDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<StartDate> = JsonMissing.of(),
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("adjustment_id")
            @ExcludeMissing
            adjustmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date") @ExcludeMissing endDate: JsonField<EndDate> = JsonMissing.of(),
        ) : this(startDate, adjustment, adjustmentId, endDate, mutableMapOf())

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription. The adjustment will apply to invoice dates
         * that overlap with this `start_date`. This `start_date` is treated as inclusive for
         * in-advance prices, and exclusive for in-arrears prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startDate(): StartDate = startDate.getRequired("start_date")

        /**
         * The definition of a new adjustment to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun adjustment(): Adjustment? = adjustment.getNullable("adjustment")

        /**
         * The ID of the adjustment to add to the subscription. Adjustment IDs can be re-used from
         * existing subscriptions or plans, but adjustments associated with coupon redemptions
         * cannot be re-used.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun adjustmentId(): String? = adjustmentId.getNullable("adjustment_id")

        /**
         * The end date of the adjustment interval. This is the date that the adjustment will stop
         * affecting prices on the subscription. The adjustment will apply to invoice dates that
         * overlap with this `end_date`.This `end_date` is treated as exclusive for in-advance
         * prices, and inclusive for in-arrears prices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): EndDate? = endDate.getNullable("end_date")

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

        /**
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [adjustmentId].
         *
         * Unlike [adjustmentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("adjustment_id")
        @ExcludeMissing
        fun _adjustmentId(): JsonField<String> = adjustmentId

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<EndDate> = endDate

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
             * Returns a mutable builder for constructing an instance of [AddAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .startDate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AddAdjustment]. */
        class Builder internal constructor() {

            private var startDate: JsonField<StartDate>? = null
            private var adjustment: JsonField<Adjustment> = JsonMissing.of()
            private var adjustmentId: JsonField<String> = JsonMissing.of()
            private var endDate: JsonField<EndDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addAdjustment: AddAdjustment) = apply {
                startDate = addAdjustment.startDate
                adjustment = addAdjustment.adjustment
                adjustmentId = addAdjustment.adjustmentId
                endDate = addAdjustment.endDate
                additionalProperties = addAdjustment.additionalProperties.toMutableMap()
            }

            /**
             * The start date of the adjustment interval. This is the date that the adjustment will
             * start affecting prices on the subscription. The adjustment will apply to invoice
             * dates that overlap with this `start_date`. This `start_date` is treated as inclusive
             * for in-advance prices, and exclusive for in-arrears prices.
             */
            fun startDate(startDate: StartDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [StartDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<StartDate>) = apply { this.startDate = startDate }

            /** Alias for calling [startDate] with `StartDate.ofDateTime(dateTime)`. */
            fun startDate(dateTime: OffsetDateTime) = startDate(StartDate.ofDateTime(dateTime))

            /**
             * Alias for calling [startDate] with
             * `StartDate.ofBillingCycleRelative(billingCycleRelative)`.
             */
            fun startDate(billingCycleRelative: BillingCycleRelativeDate) =
                startDate(StartDate.ofBillingCycleRelative(billingCycleRelative))

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(adjustment: Adjustment?) = adjustment(JsonField.ofNullable(adjustment))

            /**
             * Sets [Builder.adjustment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustment] with a well-typed [Adjustment] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustment(adjustment: JsonField<Adjustment>) = apply {
                this.adjustment = adjustment
            }

            /**
             * Alias for calling [adjustment] with
             * `Adjustment.ofPercentageDiscount(percentageDiscount)`.
             */
            fun adjustment(percentageDiscount: NewPercentageDiscount) =
                adjustment(Adjustment.ofPercentageDiscount(percentageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewPercentageDiscount.builder()
             *     .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
             *     .percentageDiscount(percentageDiscount)
             *     .build()
             * ```
             */
            fun percentageDiscountAdjustment(percentageDiscount: Double) =
                adjustment(
                    NewPercentageDiscount.builder()
                        .adjustmentType(NewPercentageDiscount.AdjustmentType.PERCENTAGE_DISCOUNT)
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofUsageDiscount(usageDiscount)`. */
            fun adjustment(usageDiscount: NewUsageDiscount) =
                adjustment(Adjustment.ofUsageDiscount(usageDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewUsageDiscount.builder()
             *     .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
             *     .usageDiscount(usageDiscount)
             *     .build()
             * ```
             */
            fun usageDiscountAdjustment(usageDiscount: Double) =
                adjustment(
                    NewUsageDiscount.builder()
                        .adjustmentType(NewUsageDiscount.AdjustmentType.USAGE_DISCOUNT)
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /**
             * Alias for calling [adjustment] with `Adjustment.ofAmountDiscount(amountDiscount)`.
             */
            fun adjustment(amountDiscount: NewAmountDiscount) =
                adjustment(Adjustment.ofAmountDiscount(amountDiscount))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewAmountDiscount.builder()
             *     .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
             *     .amountDiscount(amountDiscount)
             *     .build()
             * ```
             */
            fun amountDiscountAdjustment(amountDiscount: String) =
                adjustment(
                    NewAmountDiscount.builder()
                        .adjustmentType(NewAmountDiscount.AdjustmentType.AMOUNT_DISCOUNT)
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** Alias for calling [adjustment] with `Adjustment.ofMinimum(minimum)`. */
            fun adjustment(minimum: NewMinimum) = adjustment(Adjustment.ofMinimum(minimum))

            /** Alias for calling [adjustment] with `Adjustment.ofMaximum(maximum)`. */
            fun adjustment(maximum: NewMaximum) = adjustment(Adjustment.ofMaximum(maximum))

            /**
             * Alias for calling [adjustment] with the following:
             * ```kotlin
             * NewMaximum.builder()
             *     .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
             *     .maximumAmount(maximumAmount)
             *     .build()
             * ```
             */
            fun maximumAdjustment(maximumAmount: String) =
                adjustment(
                    NewMaximum.builder()
                        .adjustmentType(NewMaximum.AdjustmentType.MAXIMUM)
                        .maximumAmount(maximumAmount)
                        .build()
                )

            /**
             * The ID of the adjustment to add to the subscription. Adjustment IDs can be re-used
             * from existing subscriptions or plans, but adjustments associated with coupon
             * redemptions cannot be re-used.
             */
            fun adjustmentId(adjustmentId: String?) =
                adjustmentId(JsonField.ofNullable(adjustmentId))

            /**
             * Sets [Builder.adjustmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun adjustmentId(adjustmentId: JsonField<String>) = apply {
                this.adjustmentId = adjustmentId
            }

            /**
             * The end date of the adjustment interval. This is the date that the adjustment will
             * stop affecting prices on the subscription. The adjustment will apply to invoice dates
             * that overlap with this `end_date`.This `end_date` is treated as exclusive for
             * in-advance prices, and inclusive for in-arrears prices.
             */
            fun endDate(endDate: EndDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [EndDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<EndDate>) = apply { this.endDate = endDate }

            /** Alias for calling [endDate] with `EndDate.ofDateTime(dateTime)`. */
            fun endDate(dateTime: OffsetDateTime) = endDate(EndDate.ofDateTime(dateTime))

            /**
             * Alias for calling [endDate] with
             * `EndDate.ofBillingCycleRelative(billingCycleRelative)`.
             */
            fun endDate(billingCycleRelative: BillingCycleRelativeDate) =
                endDate(EndDate.ofBillingCycleRelative(billingCycleRelative))

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
             * Returns an immutable instance of [AddAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AddAdjustment =
                AddAdjustment(
                    checkRequired("startDate", startDate),
                    adjustment,
                    adjustmentId,
                    endDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddAdjustment = apply {
            if (validated) {
                return@apply
            }

            startDate().validate()
            adjustment()?.validate()
            adjustmentId()
            endDate()?.validate()
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
            (startDate.asKnown()?.validity() ?: 0) +
                (adjustment.asKnown()?.validity() ?: 0) +
                (if (adjustmentId.asKnown() == null) 0 else 1) +
                (endDate.asKnown()?.validity() ?: 0)

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription. The adjustment will apply to invoice dates
         * that overlap with this `start_date`. This `start_date` is treated as inclusive for
         * in-advance prices, and exclusive for in-arrears prices.
         */
        @JsonDeserialize(using = StartDate.Deserializer::class)
        @JsonSerialize(using = StartDate.Serializer::class)
        class StartDate
        private constructor(
            private val dateTime: OffsetDateTime? = null,
            private val billingCycleRelative: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dateTime(): OffsetDateTime? = dateTime

            fun billingCycleRelative(): BillingCycleRelativeDate? = billingCycleRelative

            fun isDateTime(): Boolean = dateTime != null

            fun isBillingCycleRelative(): Boolean = billingCycleRelative != null

            fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

            fun asBillingCycleRelative(): BillingCycleRelativeDate =
                billingCycleRelative.getOrThrow("billingCycleRelative")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): StartDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDateTime(dateTime: OffsetDateTime) {}

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) {
                            billingCycleRelative.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDateTime(dateTime: OffsetDateTime) = 1

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) = billingCycleRelative.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartDate &&
                    dateTime == other.dateTime &&
                    billingCycleRelative == other.billingCycleRelative
            }

            override fun hashCode(): Int = Objects.hash(dateTime, billingCycleRelative)

            override fun toString(): String =
                when {
                    dateTime != null -> "StartDate{dateTime=$dateTime}"
                    billingCycleRelative != null ->
                        "StartDate{billingCycleRelative=$billingCycleRelative}"
                    _json != null -> "StartDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StartDate")
                }

            companion object {

                fun ofDateTime(dateTime: OffsetDateTime) = StartDate(dateTime = dateTime)

                fun ofBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate) =
                    StartDate(billingCycleRelative = billingCycleRelative)
            }

            /**
             * An interface that defines how to map each variant of [StartDate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDateTime(dateTime: OffsetDateTime): T

                fun visitBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate): T

                /**
                 * Maps an unknown variant of [StartDate] to a value of type [T].
                 *
                 * An instance of [StartDate] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown StartDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<StartDate>(StartDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StartDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())
                                    ?.let { StartDate(billingCycleRelative = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    StartDate(dateTime = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> StartDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<StartDate>(StartDate::class) {

                override fun serialize(
                    value: StartDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dateTime != null -> generator.writeObject(value.dateTime)
                        value.billingCycleRelative != null ->
                            generator.writeObject(value.billingCycleRelative)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StartDate")
                    }
                }
            }
        }

        /** The definition of a new adjustment to create and add to the subscription. */
        @JsonDeserialize(using = Adjustment.Deserializer::class)
        @JsonSerialize(using = Adjustment.Serializer::class)
        class Adjustment
        private constructor(
            private val percentageDiscount: NewPercentageDiscount? = null,
            private val usageDiscount: NewUsageDiscount? = null,
            private val amountDiscount: NewAmountDiscount? = null,
            private val minimum: NewMinimum? = null,
            private val maximum: NewMaximum? = null,
            private val _json: JsonValue? = null,
        ) {

            fun percentageDiscount(): NewPercentageDiscount? = percentageDiscount

            fun usageDiscount(): NewUsageDiscount? = usageDiscount

            fun amountDiscount(): NewAmountDiscount? = amountDiscount

            fun minimum(): NewMinimum? = minimum

            fun maximum(): NewMaximum? = maximum

            fun isPercentageDiscount(): Boolean = percentageDiscount != null

            fun isUsageDiscount(): Boolean = usageDiscount != null

            fun isAmountDiscount(): Boolean = amountDiscount != null

            fun isMinimum(): Boolean = minimum != null

            fun isMaximum(): Boolean = maximum != null

            fun asPercentageDiscount(): NewPercentageDiscount =
                percentageDiscount.getOrThrow("percentageDiscount")

            fun asUsageDiscount(): NewUsageDiscount = usageDiscount.getOrThrow("usageDiscount")

            fun asAmountDiscount(): NewAmountDiscount = amountDiscount.getOrThrow("amountDiscount")

            fun asMinimum(): NewMinimum = minimum.getOrThrow("minimum")

            fun asMaximum(): NewMaximum = maximum.getOrThrow("maximum")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    percentageDiscount != null ->
                        visitor.visitPercentageDiscount(percentageDiscount)
                    usageDiscount != null -> visitor.visitUsageDiscount(usageDiscount)
                    amountDiscount != null -> visitor.visitAmountDiscount(amountDiscount)
                    minimum != null -> visitor.visitMinimum(minimum)
                    maximum != null -> visitor.visitMaximum(maximum)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Adjustment = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) {
                            percentageDiscount.validate()
                        }

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) {
                            usageDiscount.validate()
                        }

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) {
                            amountDiscount.validate()
                        }

                        override fun visitMinimum(minimum: NewMinimum) {
                            minimum.validate()
                        }

                        override fun visitMaximum(maximum: NewMaximum) {
                            maximum.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitPercentageDiscount(
                            percentageDiscount: NewPercentageDiscount
                        ) = percentageDiscount.validity()

                        override fun visitUsageDiscount(usageDiscount: NewUsageDiscount) =
                            usageDiscount.validity()

                        override fun visitAmountDiscount(amountDiscount: NewAmountDiscount) =
                            amountDiscount.validity()

                        override fun visitMinimum(minimum: NewMinimum) = minimum.validity()

                        override fun visitMaximum(maximum: NewMaximum) = maximum.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Adjustment &&
                    percentageDiscount == other.percentageDiscount &&
                    usageDiscount == other.usageDiscount &&
                    amountDiscount == other.amountDiscount &&
                    minimum == other.minimum &&
                    maximum == other.maximum
            }

            override fun hashCode(): Int =
                Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum)

            override fun toString(): String =
                when {
                    percentageDiscount != null ->
                        "Adjustment{percentageDiscount=$percentageDiscount}"
                    usageDiscount != null -> "Adjustment{usageDiscount=$usageDiscount}"
                    amountDiscount != null -> "Adjustment{amountDiscount=$amountDiscount}"
                    minimum != null -> "Adjustment{minimum=$minimum}"
                    maximum != null -> "Adjustment{maximum=$maximum}"
                    _json != null -> "Adjustment{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Adjustment")
                }

            companion object {

                fun ofPercentageDiscount(percentageDiscount: NewPercentageDiscount) =
                    Adjustment(percentageDiscount = percentageDiscount)

                fun ofUsageDiscount(usageDiscount: NewUsageDiscount) =
                    Adjustment(usageDiscount = usageDiscount)

                fun ofAmountDiscount(amountDiscount: NewAmountDiscount) =
                    Adjustment(amountDiscount = amountDiscount)

                fun ofMinimum(minimum: NewMinimum) = Adjustment(minimum = minimum)

                fun ofMaximum(maximum: NewMaximum) = Adjustment(maximum = maximum)
            }

            /**
             * An interface that defines how to map each variant of [Adjustment] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitPercentageDiscount(percentageDiscount: NewPercentageDiscount): T

                fun visitUsageDiscount(usageDiscount: NewUsageDiscount): T

                fun visitAmountDiscount(amountDiscount: NewAmountDiscount): T

                fun visitMinimum(minimum: NewMinimum): T

                fun visitMaximum(maximum: NewMaximum): T

                /**
                 * Maps an unknown variant of [Adjustment] to a value of type [T].
                 *
                 * An instance of [Adjustment] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown Adjustment: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Adjustment>(Adjustment::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Adjustment {
                    val json = JsonValue.fromJsonNode(node)
                    val adjustmentType = json.asObject()?.get("adjustment_type")?.asString()

                    when (adjustmentType) {
                        "percentage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewPercentageDiscount>())
                                ?.let { Adjustment(percentageDiscount = it, _json = json) }
                                ?: Adjustment(_json = json)
                        }
                        "usage_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewUsageDiscount>())?.let {
                                Adjustment(usageDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "amount_discount" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewAmountDiscount>())?.let {
                                Adjustment(amountDiscount = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "minimum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMinimum>())?.let {
                                Adjustment(minimum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                        "maximum" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewMaximum>())?.let {
                                Adjustment(maximum = it, _json = json)
                            } ?: Adjustment(_json = json)
                        }
                    }

                    return Adjustment(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Adjustment>(Adjustment::class) {

                override fun serialize(
                    value: Adjustment,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.percentageDiscount != null ->
                            generator.writeObject(value.percentageDiscount)
                        value.usageDiscount != null -> generator.writeObject(value.usageDiscount)
                        value.amountDiscount != null -> generator.writeObject(value.amountDiscount)
                        value.minimum != null -> generator.writeObject(value.minimum)
                        value.maximum != null -> generator.writeObject(value.maximum)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Adjustment")
                    }
                }
            }
        }

        /**
         * The end date of the adjustment interval. This is the date that the adjustment will stop
         * affecting prices on the subscription. The adjustment will apply to invoice dates that
         * overlap with this `end_date`.This `end_date` is treated as exclusive for in-advance
         * prices, and inclusive for in-arrears prices.
         */
        @JsonDeserialize(using = EndDate.Deserializer::class)
        @JsonSerialize(using = EndDate.Serializer::class)
        class EndDate
        private constructor(
            private val dateTime: OffsetDateTime? = null,
            private val billingCycleRelative: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dateTime(): OffsetDateTime? = dateTime

            fun billingCycleRelative(): BillingCycleRelativeDate? = billingCycleRelative

            fun isDateTime(): Boolean = dateTime != null

            fun isBillingCycleRelative(): Boolean = billingCycleRelative != null

            fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

            fun asBillingCycleRelative(): BillingCycleRelativeDate =
                billingCycleRelative.getOrThrow("billingCycleRelative")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): EndDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDateTime(dateTime: OffsetDateTime) {}

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) {
                            billingCycleRelative.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDateTime(dateTime: OffsetDateTime) = 1

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) = billingCycleRelative.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EndDate &&
                    dateTime == other.dateTime &&
                    billingCycleRelative == other.billingCycleRelative
            }

            override fun hashCode(): Int = Objects.hash(dateTime, billingCycleRelative)

            override fun toString(): String =
                when {
                    dateTime != null -> "EndDate{dateTime=$dateTime}"
                    billingCycleRelative != null ->
                        "EndDate{billingCycleRelative=$billingCycleRelative}"
                    _json != null -> "EndDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid EndDate")
                }

            companion object {

                fun ofDateTime(dateTime: OffsetDateTime) = EndDate(dateTime = dateTime)

                fun ofBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate) =
                    EndDate(billingCycleRelative = billingCycleRelative)
            }

            /**
             * An interface that defines how to map each variant of [EndDate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDateTime(dateTime: OffsetDateTime): T

                fun visitBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate): T

                /**
                 * Maps an unknown variant of [EndDate] to a value of type [T].
                 *
                 * An instance of [EndDate] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown EndDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<EndDate>(EndDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): EndDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())
                                    ?.let { EndDate(billingCycleRelative = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    EndDate(dateTime = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> EndDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<EndDate>(EndDate::class) {

                override fun serialize(
                    value: EndDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dateTime != null -> generator.writeObject(value.dateTime)
                        value.billingCycleRelative != null ->
                            generator.writeObject(value.billingCycleRelative)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid EndDate")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AddAdjustment &&
                startDate == other.startDate &&
                adjustment == other.adjustment &&
                adjustmentId == other.adjustmentId &&
                endDate == other.endDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(startDate, adjustment, adjustmentId, endDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddAdjustment{startDate=$startDate, adjustment=$adjustment, adjustmentId=$adjustmentId, endDate=$endDate, additionalProperties=$additionalProperties}"
    }

    class Edit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val priceIntervalId: JsonField<String>,
        private val billingCycleDay: JsonField<Long>,
        private val canDeferBilling: JsonField<Boolean>,
        private val endDate: JsonField<EndDate>,
        private val filter: JsonField<String>,
        private val fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>,
        private val startDate: JsonField<StartDate>,
        private val usageCustomerIds: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("price_interval_id")
            @ExcludeMissing
            priceIntervalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_cycle_day")
            @ExcludeMissing
            billingCycleDay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("can_defer_billing")
            @ExcludeMissing
            canDeferBilling: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<EndDate> = JsonMissing.of(),
            @JsonProperty("filter") @ExcludeMissing filter: JsonField<String> = JsonMissing.of(),
            @JsonProperty("fixed_fee_quantity_transitions")
            @ExcludeMissing
            fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>> =
                JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<StartDate> = JsonMissing.of(),
            @JsonProperty("usage_customer_ids")
            @ExcludeMissing
            usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            priceIntervalId,
            billingCycleDay,
            canDeferBilling,
            endDate,
            filter,
            fixedFeeQuantityTransitions,
            startDate,
            usageCustomerIds,
            mutableMapOf(),
        )

        /**
         * The id of the price interval to edit.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun priceIntervalId(): String = priceIntervalId.getRequired("price_interval_id")

        /**
         * The updated billing cycle day for this price interval. If not specified, the billing
         * cycle day will not be updated. Note that overlapping price intervals must have the same
         * billing cycle day.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun billingCycleDay(): Long? = billingCycleDay.getNullable("billing_cycle_day")

        /**
         * If true, ending an in-arrears price interval mid-cycle will defer billing the final line
         * itemuntil the next scheduled invoice. If false, it will be billed on its end date. If not
         * provided, behaviorwill follow account default.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun canDeferBilling(): Boolean? = canDeferBilling.getNullable("can_defer_billing")

        /**
         * The updated end date of this price interval. If not specified, the end date will not be
         * updated.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): EndDate? = endDate.getNullable("end_date")

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun filter(): String? = filter.getNullable("filter")

        /**
         * A list of fixed fee quantity transitions to use for this price interval. Note that this
         * list will overwrite all existing fixed fee quantity transitions on the price interval.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun fixedFeeQuantityTransitions(): List<FixedFeeQuantityTransition>? =
            fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")

        /**
         * The updated start date of this price interval. If not specified, the start date will not
         * be updated.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): StartDate? = startDate.getNullable("start_date")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

        /**
         * Returns the raw JSON value of [priceIntervalId].
         *
         * Unlike [priceIntervalId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_interval_id")
        @ExcludeMissing
        fun _priceIntervalId(): JsonField<String> = priceIntervalId

        /**
         * Returns the raw JSON value of [billingCycleDay].
         *
         * Unlike [billingCycleDay], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        fun _billingCycleDay(): JsonField<Long> = billingCycleDay

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
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<EndDate> = endDate

        /**
         * Returns the raw JSON value of [filter].
         *
         * Unlike [filter], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * Returns the raw JSON value of [fixedFeeQuantityTransitions].
         *
         * Unlike [fixedFeeQuantityTransitions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions(): JsonField<List<FixedFeeQuantityTransition>> =
            fixedFeeQuantityTransitions

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

        /**
         * Returns the raw JSON value of [usageCustomerIds].
         *
         * Unlike [usageCustomerIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

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
             * Returns a mutable builder for constructing an instance of [Edit].
             *
             * The following fields are required:
             * ```kotlin
             * .priceIntervalId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Edit]. */
        class Builder internal constructor() {

            private var priceIntervalId: JsonField<String>? = null
            private var billingCycleDay: JsonField<Long> = JsonMissing.of()
            private var canDeferBilling: JsonField<Boolean> = JsonMissing.of()
            private var endDate: JsonField<EndDate> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var fixedFeeQuantityTransitions:
                JsonField<MutableList<FixedFeeQuantityTransition>>? =
                null
            private var startDate: JsonField<StartDate> = JsonMissing.of()
            private var usageCustomerIds: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(edit: Edit) = apply {
                priceIntervalId = edit.priceIntervalId
                billingCycleDay = edit.billingCycleDay
                canDeferBilling = edit.canDeferBilling
                endDate = edit.endDate
                filter = edit.filter
                fixedFeeQuantityTransitions =
                    edit.fixedFeeQuantityTransitions.map { it.toMutableList() }
                startDate = edit.startDate
                usageCustomerIds = edit.usageCustomerIds.map { it.toMutableList() }
                additionalProperties = edit.additionalProperties.toMutableMap()
            }

            /** The id of the price interval to edit. */
            fun priceIntervalId(priceIntervalId: String) =
                priceIntervalId(JsonField.of(priceIntervalId))

            /**
             * Sets [Builder.priceIntervalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priceIntervalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priceIntervalId(priceIntervalId: JsonField<String>) = apply {
                this.priceIntervalId = priceIntervalId
            }

            /**
             * The updated billing cycle day for this price interval. If not specified, the billing
             * cycle day will not be updated. Note that overlapping price intervals must have the
             * same billing cycle day.
             */
            fun billingCycleDay(billingCycleDay: Long?) =
                billingCycleDay(JsonField.ofNullable(billingCycleDay))

            /**
             * Alias for [Builder.billingCycleDay].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun billingCycleDay(billingCycleDay: Long) = billingCycleDay(billingCycleDay as Long?)

            /**
             * Sets [Builder.billingCycleDay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingCycleDay] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
                this.billingCycleDay = billingCycleDay
            }

            /**
             * If true, ending an in-arrears price interval mid-cycle will defer billing the final
             * line itemuntil the next scheduled invoice. If false, it will be billed on its end
             * date. If not provided, behaviorwill follow account default.
             */
            fun canDeferBilling(canDeferBilling: Boolean?) =
                canDeferBilling(JsonField.ofNullable(canDeferBilling))

            /**
             * Alias for [Builder.canDeferBilling].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun canDeferBilling(canDeferBilling: Boolean) =
                canDeferBilling(canDeferBilling as Boolean?)

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
             * The updated end date of this price interval. If not specified, the end date will not
             * be updated.
             */
            fun endDate(endDate: EndDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [EndDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<EndDate>) = apply { this.endDate = endDate }

            /** Alias for calling [endDate] with `EndDate.ofDateTime(dateTime)`. */
            fun endDate(dateTime: OffsetDateTime) = endDate(EndDate.ofDateTime(dateTime))

            /**
             * Alias for calling [endDate] with
             * `EndDate.ofBillingCycleRelative(billingCycleRelative)`.
             */
            fun endDate(billingCycleRelative: BillingCycleRelativeDate) =
                endDate(EndDate.ofBillingCycleRelative(billingCycleRelative))

            /**
             * An additional filter to apply to usage queries. This filter must be expressed as a
             * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
             * null, usage queries will not include any additional filter.
             */
            fun filter(filter: String?) = filter(JsonField.ofNullable(filter))

            /**
             * Sets [Builder.filter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.filter] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * A list of fixed fee quantity transitions to use for this price interval. Note that
             * this list will overwrite all existing fixed fee quantity transitions on the price
             * interval.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<FixedFeeQuantityTransition>?
            ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

            /**
             * Sets [Builder.fixedFeeQuantityTransitions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedFeeQuantityTransitions] with a well-typed
             * `List<FixedFeeQuantityTransition>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: JsonField<List<FixedFeeQuantityTransition>>
            ) = apply {
                this.fixedFeeQuantityTransitions =
                    fixedFeeQuantityTransitions.map { it.toMutableList() }
            }

            /**
             * Adds a single [FixedFeeQuantityTransition] to [fixedFeeQuantityTransitions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addFixedFeeQuantityTransition(
                fixedFeeQuantityTransition: FixedFeeQuantityTransition
            ) = apply {
                fixedFeeQuantityTransitions =
                    (fixedFeeQuantityTransitions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("fixedFeeQuantityTransitions", it)
                            .add(fixedFeeQuantityTransition)
                    }
            }

            /**
             * The updated start date of this price interval. If not specified, the start date will
             * not be updated.
             */
            fun startDate(startDate: StartDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [StartDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<StartDate>) = apply { this.startDate = startDate }

            /** Alias for calling [startDate] with `StartDate.ofDateTime(dateTime)`. */
            fun startDate(dateTime: OffsetDateTime) = startDate(StartDate.ofDateTime(dateTime))

            /**
             * Alias for calling [startDate] with
             * `StartDate.ofBillingCycleRelative(billingCycleRelative)`.
             */
            fun startDate(billingCycleRelative: BillingCycleRelativeDate) =
                startDate(StartDate.ofBillingCycleRelative(billingCycleRelative))

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
             */
            fun usageCustomerIds(usageCustomerIds: List<String>?) =
                usageCustomerIds(JsonField.ofNullable(usageCustomerIds))

            /**
             * Sets [Builder.usageCustomerIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.usageCustomerIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
                this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [usageCustomerIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addUsageCustomerId(usageCustomerId: String) = apply {
                usageCustomerIds =
                    (usageCustomerIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("usageCustomerIds", it).add(usageCustomerId)
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
             * Returns an immutable instance of [Edit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .priceIntervalId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Edit =
                Edit(
                    checkRequired("priceIntervalId", priceIntervalId),
                    billingCycleDay,
                    canDeferBilling,
                    endDate,
                    filter,
                    (fixedFeeQuantityTransitions ?: JsonMissing.of()).map { it.toImmutable() },
                    startDate,
                    (usageCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Edit = apply {
            if (validated) {
                return@apply
            }

            priceIntervalId()
            billingCycleDay()
            canDeferBilling()
            endDate()?.validate()
            filter()
            fixedFeeQuantityTransitions()?.forEach { it.validate() }
            startDate()?.validate()
            usageCustomerIds()
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
            (if (priceIntervalId.asKnown() == null) 0 else 1) +
                (if (billingCycleDay.asKnown() == null) 0 else 1) +
                (if (canDeferBilling.asKnown() == null) 0 else 1) +
                (endDate.asKnown()?.validity() ?: 0) +
                (if (filter.asKnown() == null) 0 else 1) +
                (fixedFeeQuantityTransitions.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (startDate.asKnown()?.validity() ?: 0) +
                (usageCustomerIds.asKnown()?.size ?: 0)

        /**
         * The updated end date of this price interval. If not specified, the end date will not be
         * updated.
         */
        @JsonDeserialize(using = EndDate.Deserializer::class)
        @JsonSerialize(using = EndDate.Serializer::class)
        class EndDate
        private constructor(
            private val dateTime: OffsetDateTime? = null,
            private val billingCycleRelative: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dateTime(): OffsetDateTime? = dateTime

            fun billingCycleRelative(): BillingCycleRelativeDate? = billingCycleRelative

            fun isDateTime(): Boolean = dateTime != null

            fun isBillingCycleRelative(): Boolean = billingCycleRelative != null

            fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

            fun asBillingCycleRelative(): BillingCycleRelativeDate =
                billingCycleRelative.getOrThrow("billingCycleRelative")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): EndDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDateTime(dateTime: OffsetDateTime) {}

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) {
                            billingCycleRelative.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDateTime(dateTime: OffsetDateTime) = 1

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) = billingCycleRelative.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EndDate &&
                    dateTime == other.dateTime &&
                    billingCycleRelative == other.billingCycleRelative
            }

            override fun hashCode(): Int = Objects.hash(dateTime, billingCycleRelative)

            override fun toString(): String =
                when {
                    dateTime != null -> "EndDate{dateTime=$dateTime}"
                    billingCycleRelative != null ->
                        "EndDate{billingCycleRelative=$billingCycleRelative}"
                    _json != null -> "EndDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid EndDate")
                }

            companion object {

                fun ofDateTime(dateTime: OffsetDateTime) = EndDate(dateTime = dateTime)

                fun ofBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate) =
                    EndDate(billingCycleRelative = billingCycleRelative)
            }

            /**
             * An interface that defines how to map each variant of [EndDate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDateTime(dateTime: OffsetDateTime): T

                fun visitBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate): T

                /**
                 * Maps an unknown variant of [EndDate] to a value of type [T].
                 *
                 * An instance of [EndDate] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown EndDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<EndDate>(EndDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): EndDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())
                                    ?.let { EndDate(billingCycleRelative = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    EndDate(dateTime = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> EndDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<EndDate>(EndDate::class) {

                override fun serialize(
                    value: EndDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dateTime != null -> generator.writeObject(value.dateTime)
                        value.billingCycleRelative != null ->
                            generator.writeObject(value.billingCycleRelative)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid EndDate")
                    }
                }
            }
        }

        class FixedFeeQuantityTransition
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val effectiveDate: JsonField<OffsetDateTime>,
            private val quantity: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("effective_date")
                @ExcludeMissing
                effectiveDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Long> = JsonMissing.of(),
            ) : this(effectiveDate, quantity, mutableMapOf())

            /**
             * The date that the fixed fee quantity transition should take effect.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun effectiveDate(): OffsetDateTime = effectiveDate.getRequired("effective_date")

            /**
             * The quantity of the fixed fee quantity transition.
             *
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Long = quantity.getRequired("quantity")

            /**
             * Returns the raw JSON value of [effectiveDate].
             *
             * Unlike [effectiveDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun _effectiveDate(): JsonField<OffsetDateTime> = effectiveDate

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

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
                 * [FixedFeeQuantityTransition].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .effectiveDate()
                 * .quantity()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [FixedFeeQuantityTransition]. */
            class Builder internal constructor() {

                private var effectiveDate: JsonField<OffsetDateTime>? = null
                private var quantity: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(fixedFeeQuantityTransition: FixedFeeQuantityTransition) = apply {
                    effectiveDate = fixedFeeQuantityTransition.effectiveDate
                    quantity = fixedFeeQuantityTransition.quantity
                    additionalProperties =
                        fixedFeeQuantityTransition.additionalProperties.toMutableMap()
                }

                /** The date that the fixed fee quantity transition should take effect. */
                fun effectiveDate(effectiveDate: OffsetDateTime) =
                    effectiveDate(JsonField.of(effectiveDate))

                /**
                 * Sets [Builder.effectiveDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.effectiveDate] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun effectiveDate(effectiveDate: JsonField<OffsetDateTime>) = apply {
                    this.effectiveDate = effectiveDate
                }

                /** The quantity of the fixed fee quantity transition. */
                fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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
                 * Returns an immutable instance of [FixedFeeQuantityTransition].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .effectiveDate()
                 * .quantity()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): FixedFeeQuantityTransition =
                    FixedFeeQuantityTransition(
                        checkRequired("effectiveDate", effectiveDate),
                        checkRequired("quantity", quantity),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): FixedFeeQuantityTransition = apply {
                if (validated) {
                    return@apply
                }

                effectiveDate()
                quantity()
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
                (if (effectiveDate.asKnown() == null) 0 else 1) +
                    (if (quantity.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FixedFeeQuantityTransition &&
                    effectiveDate == other.effectiveDate &&
                    quantity == other.quantity &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(effectiveDate, quantity, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FixedFeeQuantityTransition{effectiveDate=$effectiveDate, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        /**
         * The updated start date of this price interval. If not specified, the start date will not
         * be updated.
         */
        @JsonDeserialize(using = StartDate.Deserializer::class)
        @JsonSerialize(using = StartDate.Serializer::class)
        class StartDate
        private constructor(
            private val dateTime: OffsetDateTime? = null,
            private val billingCycleRelative: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dateTime(): OffsetDateTime? = dateTime

            fun billingCycleRelative(): BillingCycleRelativeDate? = billingCycleRelative

            fun isDateTime(): Boolean = dateTime != null

            fun isBillingCycleRelative(): Boolean = billingCycleRelative != null

            fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

            fun asBillingCycleRelative(): BillingCycleRelativeDate =
                billingCycleRelative.getOrThrow("billingCycleRelative")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): StartDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDateTime(dateTime: OffsetDateTime) {}

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) {
                            billingCycleRelative.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDateTime(dateTime: OffsetDateTime) = 1

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) = billingCycleRelative.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartDate &&
                    dateTime == other.dateTime &&
                    billingCycleRelative == other.billingCycleRelative
            }

            override fun hashCode(): Int = Objects.hash(dateTime, billingCycleRelative)

            override fun toString(): String =
                when {
                    dateTime != null -> "StartDate{dateTime=$dateTime}"
                    billingCycleRelative != null ->
                        "StartDate{billingCycleRelative=$billingCycleRelative}"
                    _json != null -> "StartDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StartDate")
                }

            companion object {

                fun ofDateTime(dateTime: OffsetDateTime) = StartDate(dateTime = dateTime)

                fun ofBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate) =
                    StartDate(billingCycleRelative = billingCycleRelative)
            }

            /**
             * An interface that defines how to map each variant of [StartDate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDateTime(dateTime: OffsetDateTime): T

                fun visitBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate): T

                /**
                 * Maps an unknown variant of [StartDate] to a value of type [T].
                 *
                 * An instance of [StartDate] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown StartDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<StartDate>(StartDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StartDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())
                                    ?.let { StartDate(billingCycleRelative = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    StartDate(dateTime = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> StartDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<StartDate>(StartDate::class) {

                override fun serialize(
                    value: StartDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dateTime != null -> generator.writeObject(value.dateTime)
                        value.billingCycleRelative != null ->
                            generator.writeObject(value.billingCycleRelative)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StartDate")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Edit &&
                priceIntervalId == other.priceIntervalId &&
                billingCycleDay == other.billingCycleDay &&
                canDeferBilling == other.canDeferBilling &&
                endDate == other.endDate &&
                filter == other.filter &&
                fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions &&
                startDate == other.startDate &&
                usageCustomerIds == other.usageCustomerIds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                priceIntervalId,
                billingCycleDay,
                canDeferBilling,
                endDate,
                filter,
                fixedFeeQuantityTransitions,
                startDate,
                usageCustomerIds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Edit{priceIntervalId=$priceIntervalId, billingCycleDay=$billingCycleDay, canDeferBilling=$canDeferBilling, endDate=$endDate, filter=$filter, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, startDate=$startDate, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    class EditAdjustment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val adjustmentIntervalId: JsonField<String>,
        private val endDate: JsonField<EndDate>,
        private val startDate: JsonField<StartDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment_interval_id")
            @ExcludeMissing
            adjustmentIntervalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            endDate: JsonField<EndDate> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<StartDate> = JsonMissing.of(),
        ) : this(adjustmentIntervalId, endDate, startDate, mutableMapOf())

        /**
         * The id of the adjustment interval to edit.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustmentIntervalId(): String =
            adjustmentIntervalId.getRequired("adjustment_interval_id")

        /**
         * The updated end date of this adjustment interval. If not specified, the end date will not
         * be updated.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun endDate(): EndDate? = endDate.getNullable("end_date")

        /**
         * The updated start date of this adjustment interval. If not specified, the start date will
         * not be updated.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startDate(): StartDate? = startDate.getNullable("start_date")

        /**
         * Returns the raw JSON value of [adjustmentIntervalId].
         *
         * Unlike [adjustmentIntervalId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("adjustment_interval_id")
        @ExcludeMissing
        fun _adjustmentIntervalId(): JsonField<String> = adjustmentIntervalId

        /**
         * Returns the raw JSON value of [endDate].
         *
         * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<EndDate> = endDate

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

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
             * Returns a mutable builder for constructing an instance of [EditAdjustment].
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentIntervalId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [EditAdjustment]. */
        class Builder internal constructor() {

            private var adjustmentIntervalId: JsonField<String>? = null
            private var endDate: JsonField<EndDate> = JsonMissing.of()
            private var startDate: JsonField<StartDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(editAdjustment: EditAdjustment) = apply {
                adjustmentIntervalId = editAdjustment.adjustmentIntervalId
                endDate = editAdjustment.endDate
                startDate = editAdjustment.startDate
                additionalProperties = editAdjustment.additionalProperties.toMutableMap()
            }

            /** The id of the adjustment interval to edit. */
            fun adjustmentIntervalId(adjustmentIntervalId: String) =
                adjustmentIntervalId(JsonField.of(adjustmentIntervalId))

            /**
             * Sets [Builder.adjustmentIntervalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.adjustmentIntervalId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun adjustmentIntervalId(adjustmentIntervalId: JsonField<String>) = apply {
                this.adjustmentIntervalId = adjustmentIntervalId
            }

            /**
             * The updated end date of this adjustment interval. If not specified, the end date will
             * not be updated.
             */
            fun endDate(endDate: EndDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * Sets [Builder.endDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endDate] with a well-typed [EndDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endDate(endDate: JsonField<EndDate>) = apply { this.endDate = endDate }

            /** Alias for calling [endDate] with `EndDate.ofDateTime(dateTime)`. */
            fun endDate(dateTime: OffsetDateTime) = endDate(EndDate.ofDateTime(dateTime))

            /**
             * Alias for calling [endDate] with
             * `EndDate.ofBillingCycleRelative(billingCycleRelative)`.
             */
            fun endDate(billingCycleRelative: BillingCycleRelativeDate) =
                endDate(EndDate.ofBillingCycleRelative(billingCycleRelative))

            /**
             * The updated start date of this adjustment interval. If not specified, the start date
             * will not be updated.
             */
            fun startDate(startDate: StartDate) = startDate(JsonField.of(startDate))

            /**
             * Sets [Builder.startDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startDate] with a well-typed [StartDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startDate(startDate: JsonField<StartDate>) = apply { this.startDate = startDate }

            /** Alias for calling [startDate] with `StartDate.ofDateTime(dateTime)`. */
            fun startDate(dateTime: OffsetDateTime) = startDate(StartDate.ofDateTime(dateTime))

            /**
             * Alias for calling [startDate] with
             * `StartDate.ofBillingCycleRelative(billingCycleRelative)`.
             */
            fun startDate(billingCycleRelative: BillingCycleRelativeDate) =
                startDate(StartDate.ofBillingCycleRelative(billingCycleRelative))

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
             * Returns an immutable instance of [EditAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .adjustmentIntervalId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EditAdjustment =
                EditAdjustment(
                    checkRequired("adjustmentIntervalId", adjustmentIntervalId),
                    endDate,
                    startDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EditAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustmentIntervalId()
            endDate()?.validate()
            startDate()?.validate()
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
            (if (adjustmentIntervalId.asKnown() == null) 0 else 1) +
                (endDate.asKnown()?.validity() ?: 0) +
                (startDate.asKnown()?.validity() ?: 0)

        /**
         * The updated end date of this adjustment interval. If not specified, the end date will not
         * be updated.
         */
        @JsonDeserialize(using = EndDate.Deserializer::class)
        @JsonSerialize(using = EndDate.Serializer::class)
        class EndDate
        private constructor(
            private val dateTime: OffsetDateTime? = null,
            private val billingCycleRelative: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dateTime(): OffsetDateTime? = dateTime

            fun billingCycleRelative(): BillingCycleRelativeDate? = billingCycleRelative

            fun isDateTime(): Boolean = dateTime != null

            fun isBillingCycleRelative(): Boolean = billingCycleRelative != null

            fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

            fun asBillingCycleRelative(): BillingCycleRelativeDate =
                billingCycleRelative.getOrThrow("billingCycleRelative")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): EndDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDateTime(dateTime: OffsetDateTime) {}

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) {
                            billingCycleRelative.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDateTime(dateTime: OffsetDateTime) = 1

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) = billingCycleRelative.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EndDate &&
                    dateTime == other.dateTime &&
                    billingCycleRelative == other.billingCycleRelative
            }

            override fun hashCode(): Int = Objects.hash(dateTime, billingCycleRelative)

            override fun toString(): String =
                when {
                    dateTime != null -> "EndDate{dateTime=$dateTime}"
                    billingCycleRelative != null ->
                        "EndDate{billingCycleRelative=$billingCycleRelative}"
                    _json != null -> "EndDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid EndDate")
                }

            companion object {

                fun ofDateTime(dateTime: OffsetDateTime) = EndDate(dateTime = dateTime)

                fun ofBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate) =
                    EndDate(billingCycleRelative = billingCycleRelative)
            }

            /**
             * An interface that defines how to map each variant of [EndDate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDateTime(dateTime: OffsetDateTime): T

                fun visitBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate): T

                /**
                 * Maps an unknown variant of [EndDate] to a value of type [T].
                 *
                 * An instance of [EndDate] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown EndDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<EndDate>(EndDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): EndDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())
                                    ?.let { EndDate(billingCycleRelative = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    EndDate(dateTime = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> EndDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<EndDate>(EndDate::class) {

                override fun serialize(
                    value: EndDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dateTime != null -> generator.writeObject(value.dateTime)
                        value.billingCycleRelative != null ->
                            generator.writeObject(value.billingCycleRelative)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid EndDate")
                    }
                }
            }
        }

        /**
         * The updated start date of this adjustment interval. If not specified, the start date will
         * not be updated.
         */
        @JsonDeserialize(using = StartDate.Deserializer::class)
        @JsonSerialize(using = StartDate.Serializer::class)
        class StartDate
        private constructor(
            private val dateTime: OffsetDateTime? = null,
            private val billingCycleRelative: BillingCycleRelativeDate? = null,
            private val _json: JsonValue? = null,
        ) {

            fun dateTime(): OffsetDateTime? = dateTime

            fun billingCycleRelative(): BillingCycleRelativeDate? = billingCycleRelative

            fun isDateTime(): Boolean = dateTime != null

            fun isBillingCycleRelative(): Boolean = billingCycleRelative != null

            fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

            fun asBillingCycleRelative(): BillingCycleRelativeDate =
                billingCycleRelative.getOrThrow("billingCycleRelative")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): StartDate = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitDateTime(dateTime: OffsetDateTime) {}

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) {
                            billingCycleRelative.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                accept(
                    object : Visitor<Int> {
                        override fun visitDateTime(dateTime: OffsetDateTime) = 1

                        override fun visitBillingCycleRelative(
                            billingCycleRelative: BillingCycleRelativeDate
                        ) = billingCycleRelative.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is StartDate &&
                    dateTime == other.dateTime &&
                    billingCycleRelative == other.billingCycleRelative
            }

            override fun hashCode(): Int = Objects.hash(dateTime, billingCycleRelative)

            override fun toString(): String =
                when {
                    dateTime != null -> "StartDate{dateTime=$dateTime}"
                    billingCycleRelative != null ->
                        "StartDate{billingCycleRelative=$billingCycleRelative}"
                    _json != null -> "StartDate{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid StartDate")
                }

            companion object {

                fun ofDateTime(dateTime: OffsetDateTime) = StartDate(dateTime = dateTime)

                fun ofBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate) =
                    StartDate(billingCycleRelative = billingCycleRelative)
            }

            /**
             * An interface that defines how to map each variant of [StartDate] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitDateTime(dateTime: OffsetDateTime): T

                fun visitBillingCycleRelative(billingCycleRelative: BillingCycleRelativeDate): T

                /**
                 * Maps an unknown variant of [StartDate] to a value of type [T].
                 *
                 * An instance of [StartDate] can contain an unknown variant if it was deserialized
                 * from data that doesn't match any known variant. For example, if the SDK is on an
                 * older version than the API, then the API may respond with new variants that the
                 * SDK is unaware of.
                 *
                 * @throws OrbInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw OrbInvalidDataException("Unknown StartDate: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<StartDate>(StartDate::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): StartDate {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())
                                    ?.let { StartDate(billingCycleRelative = it, _json = json) },
                                tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                    StartDate(dateTime = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from object).
                        0 -> StartDate(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer : BaseSerializer<StartDate>(StartDate::class) {

                override fun serialize(
                    value: StartDate,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.dateTime != null -> generator.writeObject(value.dateTime)
                        value.billingCycleRelative != null ->
                            generator.writeObject(value.billingCycleRelative)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid StartDate")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EditAdjustment &&
                adjustmentIntervalId == other.adjustmentIntervalId &&
                endDate == other.endDate &&
                startDate == other.startDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(adjustmentIntervalId, endDate, startDate, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EditAdjustment{adjustmentIntervalId=$adjustmentIntervalId, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionPriceIntervalsParams &&
            subscriptionId == other.subscriptionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionPriceIntervalsParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
