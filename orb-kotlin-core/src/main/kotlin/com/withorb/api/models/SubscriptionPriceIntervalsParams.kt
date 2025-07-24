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
 *
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
         * - [edit]
         * - [editAdjustments]
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
    private constructor(
        private val add: JsonField<List<Add>>,
        private val addAdjustments: JsonField<List<AddAdjustment>>,
        private val allowInvoiceCreditOrVoid: JsonField<Boolean>,
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
            @JsonProperty("edit") @ExcludeMissing edit: JsonField<List<Edit>> = JsonMissing.of(),
            @JsonProperty("edit_adjustments")
            @ExcludeMissing
            editAdjustments: JsonField<List<EditAdjustment>> = JsonMissing.of(),
        ) : this(
            add,
            addAdjustments,
            allowInvoiceCreditOrVoid,
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
            private var edit: JsonField<MutableList<Edit>>? = null
            private var editAdjustments: JsonField<MutableList<EditAdjustment>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                add = body.add.map { it.toMutableList() }
                addAdjustments = body.addAdjustments.map { it.toMutableList() }
                allowInvoiceCreditOrVoid = body.allowInvoiceCreditOrVoid
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
                (edit.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (editAdjustments.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && add == other.add && addAdjustments == other.addAdjustments && allowInvoiceCreditOrVoid == other.allowInvoiceCreditOrVoid && edit == other.edit && editAdjustments == other.editAdjustments && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(add, addAdjustments, allowInvoiceCreditOrVoid, edit, editAdjustments, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{add=$add, addAdjustments=$addAdjustments, allowInvoiceCreditOrVoid=$allowInvoiceCreditOrVoid, edit=$edit, editAdjustments=$editAdjustments, additionalProperties=$additionalProperties}"
    }

    class Add
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
         * The definition of a new price to create and add to the subscription.
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

            /** The definition of a new price to create and add to the subscription. */
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

            /** Alias for calling [price] with `Price.ofPackage(package_)`. */
            fun price(package_: NewFloatingPackagePrice) = price(Price.ofPackage(package_))

            /** Alias for calling [price] with `Price.ofMatrix(matrix)`. */
            fun price(matrix: NewFloatingMatrixPrice) = price(Price.ofMatrix(matrix))

            /**
             * Alias for calling [price] with `Price.ofMatrixWithAllocation(matrixWithAllocation)`.
             */
            fun price(matrixWithAllocation: NewFloatingMatrixWithAllocationPrice) =
                price(Price.ofMatrixWithAllocation(matrixWithAllocation))

            /** Alias for calling [price] with `Price.ofTiered(tiered)`. */
            fun price(tiered: NewFloatingTieredPrice) = price(Price.ofTiered(tiered))

            /** Alias for calling [price] with `Price.ofTieredBps(tieredBps)`. */
            fun price(tieredBps: NewFloatingTieredBpsPrice) = price(Price.ofTieredBps(tieredBps))

            /** Alias for calling [price] with `Price.ofBps(bps)`. */
            fun price(bps: NewFloatingBpsPrice) = price(Price.ofBps(bps))

            /** Alias for calling [price] with `Price.ofBulkBps(bulkBps)`. */
            fun price(bulkBps: NewFloatingBulkBpsPrice) = price(Price.ofBulkBps(bulkBps))

            /** Alias for calling [price] with `Price.ofBulk(bulk)`. */
            fun price(bulk: NewFloatingBulkPrice) = price(Price.ofBulk(bulk))

            /**
             * Alias for calling [price] with `Price.ofThresholdTotalAmount(thresholdTotalAmount)`.
             */
            fun price(thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice) =
                price(Price.ofThresholdTotalAmount(thresholdTotalAmount))

            /** Alias for calling [price] with `Price.ofTieredPackage(tieredPackage)`. */
            fun price(tieredPackage: NewFloatingTieredPackagePrice) =
                price(Price.ofTieredPackage(tieredPackage))

            /** Alias for calling [price] with `Price.ofGroupedTiered(groupedTiered)`. */
            fun price(groupedTiered: NewFloatingGroupedTieredPrice) =
                price(Price.ofGroupedTiered(groupedTiered))

            /**
             * Alias for calling [price] with
             * `Price.ofMaxGroupTieredPackage(maxGroupTieredPackage)`.
             */
            fun price(maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice) =
                price(Price.ofMaxGroupTieredPackage(maxGroupTieredPackage))

            /** Alias for calling [price] with `Price.ofTieredWithMinimum(tieredWithMinimum)`. */
            fun price(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                price(Price.ofTieredWithMinimum(tieredWithMinimum))

            /**
             * Alias for calling [price] with
             * `Price.ofPackageWithAllocation(packageWithAllocation)`.
             */
            fun price(packageWithAllocation: NewFloatingPackageWithAllocationPrice) =
                price(Price.ofPackageWithAllocation(packageWithAllocation))

            /**
             * Alias for calling [price] with
             * `Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum)`.
             */
            fun price(tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice) =
                price(Price.ofTieredPackageWithMinimum(tieredPackageWithMinimum))

            /** Alias for calling [price] with `Price.ofUnitWithPercent(unitWithPercent)`. */
            fun price(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                price(Price.ofUnitWithPercent(unitWithPercent))

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
             * `Price.ofMatrixWithDisplayName(matrixWithDisplayName)`.
             */
            fun price(matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice) =
                price(Price.ofMatrixWithDisplayName(matrixWithDisplayName))

            /** Alias for calling [price] with `Price.ofBulkWithProration(bulkWithProration)`. */
            fun price(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                price(Price.ofBulkWithProration(bulkWithProration))

            /**
             * Alias for calling [price] with `Price.ofGroupedTieredPackage(groupedTieredPackage)`.
             */
            fun price(groupedTieredPackage: NewFloatingGroupedTieredPackagePrice) =
                price(Price.ofGroupedTieredPackage(groupedTieredPackage))

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

                return /* spotless:off */ other is StartDate && dateTime == other.dateTime && billingCycleRelative == other.billingCycleRelative /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateTime, billingCycleRelative) /* spotless:on */

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

                return /* spotless:off */ other is Discount && amount == other.amount && percentage == other.percentage && usage == other.usage /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, percentage, usage) /* spotless:on */

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

                    return /* spotless:off */ other is Amount && amountDiscount == other.amountDiscount && discountType == other.discountType && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amountDiscount, discountType, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Amount{amountDiscount=$amountDiscount, discountType=$discountType, additionalProperties=$additionalProperties}"
            }

            class Percentage
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

                    return /* spotless:off */ other is Percentage && discountType == other.discountType && percentageDiscount == other.percentageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(discountType, percentageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Percentage{discountType=$discountType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"
            }

            class Usage
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

                    return /* spotless:off */ other is Usage && discountType == other.discountType && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(discountType, usageDiscount, additionalProperties) }
                /* spotless:on */

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

                return /* spotless:off */ other is EndDate && dateTime == other.dateTime && billingCycleRelative == other.billingCycleRelative /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateTime, billingCycleRelative) /* spotless:on */

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

                return /* spotless:off */ other is FixedFeeQuantityTransition && effectiveDate == other.effectiveDate && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(effectiveDate, quantity, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FixedFeeQuantityTransition{effectiveDate=$effectiveDate, quantity=$quantity, additionalProperties=$additionalProperties}"
        }

        /** The definition of a new price to create and add to the subscription. */
        @JsonDeserialize(using = Price.Deserializer::class)
        @JsonSerialize(using = Price.Serializer::class)
        class Price
        private constructor(
            private val unit: NewFloatingUnitPrice? = null,
            private val package_: NewFloatingPackagePrice? = null,
            private val matrix: NewFloatingMatrixPrice? = null,
            private val matrixWithAllocation: NewFloatingMatrixWithAllocationPrice? = null,
            private val tiered: NewFloatingTieredPrice? = null,
            private val tieredBps: NewFloatingTieredBpsPrice? = null,
            private val bps: NewFloatingBpsPrice? = null,
            private val bulkBps: NewFloatingBulkBpsPrice? = null,
            private val bulk: NewFloatingBulkPrice? = null,
            private val thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice? = null,
            private val tieredPackage: NewFloatingTieredPackagePrice? = null,
            private val groupedTiered: NewFloatingGroupedTieredPrice? = null,
            private val maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice? = null,
            private val tieredWithMinimum: NewFloatingTieredWithMinimumPrice? = null,
            private val packageWithAllocation: NewFloatingPackageWithAllocationPrice? = null,
            private val tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice? = null,
            private val unitWithPercent: NewFloatingUnitWithPercentPrice? = null,
            private val tieredWithProration: NewFloatingTieredWithProrationPrice? = null,
            private val unitWithProration: NewFloatingUnitWithProrationPrice? = null,
            private val groupedAllocation: NewFloatingGroupedAllocationPrice? = null,
            private val groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice? =
                null,
            private val groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice? =
                null,
            private val matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice? = null,
            private val bulkWithProration: NewFloatingBulkWithProrationPrice? = null,
            private val groupedTieredPackage: NewFloatingGroupedTieredPackagePrice? = null,
            private val scalableMatrixWithUnitPricing:
                NewFloatingScalableMatrixWithUnitPricingPrice? =
                null,
            private val scalableMatrixWithTieredPricing:
                NewFloatingScalableMatrixWithTieredPricingPrice? =
                null,
            private val cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice? = null,
            private val _json: JsonValue? = null,
        ) {

            fun unit(): NewFloatingUnitPrice? = unit

            fun package_(): NewFloatingPackagePrice? = package_

            fun matrix(): NewFloatingMatrixPrice? = matrix

            fun matrixWithAllocation(): NewFloatingMatrixWithAllocationPrice? = matrixWithAllocation

            fun tiered(): NewFloatingTieredPrice? = tiered

            fun tieredBps(): NewFloatingTieredBpsPrice? = tieredBps

            fun bps(): NewFloatingBpsPrice? = bps

            fun bulkBps(): NewFloatingBulkBpsPrice? = bulkBps

            fun bulk(): NewFloatingBulkPrice? = bulk

            fun thresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice? = thresholdTotalAmount

            fun tieredPackage(): NewFloatingTieredPackagePrice? = tieredPackage

            fun groupedTiered(): NewFloatingGroupedTieredPrice? = groupedTiered

            fun maxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice? =
                maxGroupTieredPackage

            fun tieredWithMinimum(): NewFloatingTieredWithMinimumPrice? = tieredWithMinimum

            fun packageWithAllocation(): NewFloatingPackageWithAllocationPrice? =
                packageWithAllocation

            fun tieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice? =
                tieredPackageWithMinimum

            fun unitWithPercent(): NewFloatingUnitWithPercentPrice? = unitWithPercent

            fun tieredWithProration(): NewFloatingTieredWithProrationPrice? = tieredWithProration

            fun unitWithProration(): NewFloatingUnitWithProrationPrice? = unitWithProration

            fun groupedAllocation(): NewFloatingGroupedAllocationPrice? = groupedAllocation

            fun groupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice? =
                groupedWithProratedMinimum

            fun groupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice? =
                groupedWithMeteredMinimum

            fun matrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice? =
                matrixWithDisplayName

            fun bulkWithProration(): NewFloatingBulkWithProrationPrice? = bulkWithProration

            fun groupedTieredPackage(): NewFloatingGroupedTieredPackagePrice? = groupedTieredPackage

            fun scalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice? =
                scalableMatrixWithUnitPricing

            fun scalableMatrixWithTieredPricing():
                NewFloatingScalableMatrixWithTieredPricingPrice? = scalableMatrixWithTieredPricing

            fun cumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice? =
                cumulativeGroupedBulk

            fun isUnit(): Boolean = unit != null

            fun isPackage(): Boolean = package_ != null

            fun isMatrix(): Boolean = matrix != null

            fun isMatrixWithAllocation(): Boolean = matrixWithAllocation != null

            fun isTiered(): Boolean = tiered != null

            fun isTieredBps(): Boolean = tieredBps != null

            fun isBps(): Boolean = bps != null

            fun isBulkBps(): Boolean = bulkBps != null

            fun isBulk(): Boolean = bulk != null

            fun isThresholdTotalAmount(): Boolean = thresholdTotalAmount != null

            fun isTieredPackage(): Boolean = tieredPackage != null

            fun isGroupedTiered(): Boolean = groupedTiered != null

            fun isMaxGroupTieredPackage(): Boolean = maxGroupTieredPackage != null

            fun isTieredWithMinimum(): Boolean = tieredWithMinimum != null

            fun isPackageWithAllocation(): Boolean = packageWithAllocation != null

            fun isTieredPackageWithMinimum(): Boolean = tieredPackageWithMinimum != null

            fun isUnitWithPercent(): Boolean = unitWithPercent != null

            fun isTieredWithProration(): Boolean = tieredWithProration != null

            fun isUnitWithProration(): Boolean = unitWithProration != null

            fun isGroupedAllocation(): Boolean = groupedAllocation != null

            fun isGroupedWithProratedMinimum(): Boolean = groupedWithProratedMinimum != null

            fun isGroupedWithMeteredMinimum(): Boolean = groupedWithMeteredMinimum != null

            fun isMatrixWithDisplayName(): Boolean = matrixWithDisplayName != null

            fun isBulkWithProration(): Boolean = bulkWithProration != null

            fun isGroupedTieredPackage(): Boolean = groupedTieredPackage != null

            fun isScalableMatrixWithUnitPricing(): Boolean = scalableMatrixWithUnitPricing != null

            fun isScalableMatrixWithTieredPricing(): Boolean =
                scalableMatrixWithTieredPricing != null

            fun isCumulativeGroupedBulk(): Boolean = cumulativeGroupedBulk != null

            fun asUnit(): NewFloatingUnitPrice = unit.getOrThrow("unit")

            fun asPackage(): NewFloatingPackagePrice = package_.getOrThrow("package_")

            fun asMatrix(): NewFloatingMatrixPrice = matrix.getOrThrow("matrix")

            fun asMatrixWithAllocation(): NewFloatingMatrixWithAllocationPrice =
                matrixWithAllocation.getOrThrow("matrixWithAllocation")

            fun asTiered(): NewFloatingTieredPrice = tiered.getOrThrow("tiered")

            fun asTieredBps(): NewFloatingTieredBpsPrice = tieredBps.getOrThrow("tieredBps")

            fun asBps(): NewFloatingBpsPrice = bps.getOrThrow("bps")

            fun asBulkBps(): NewFloatingBulkBpsPrice = bulkBps.getOrThrow("bulkBps")

            fun asBulk(): NewFloatingBulkPrice = bulk.getOrThrow("bulk")

            fun asThresholdTotalAmount(): NewFloatingThresholdTotalAmountPrice =
                thresholdTotalAmount.getOrThrow("thresholdTotalAmount")

            fun asTieredPackage(): NewFloatingTieredPackagePrice =
                tieredPackage.getOrThrow("tieredPackage")

            fun asGroupedTiered(): NewFloatingGroupedTieredPrice =
                groupedTiered.getOrThrow("groupedTiered")

            fun asMaxGroupTieredPackage(): NewFloatingMaxGroupTieredPackagePrice =
                maxGroupTieredPackage.getOrThrow("maxGroupTieredPackage")

            fun asTieredWithMinimum(): NewFloatingTieredWithMinimumPrice =
                tieredWithMinimum.getOrThrow("tieredWithMinimum")

            fun asPackageWithAllocation(): NewFloatingPackageWithAllocationPrice =
                packageWithAllocation.getOrThrow("packageWithAllocation")

            fun asTieredPackageWithMinimum(): NewFloatingTieredPackageWithMinimumPrice =
                tieredPackageWithMinimum.getOrThrow("tieredPackageWithMinimum")

            fun asUnitWithPercent(): NewFloatingUnitWithPercentPrice =
                unitWithPercent.getOrThrow("unitWithPercent")

            fun asTieredWithProration(): NewFloatingTieredWithProrationPrice =
                tieredWithProration.getOrThrow("tieredWithProration")

            fun asUnitWithProration(): NewFloatingUnitWithProrationPrice =
                unitWithProration.getOrThrow("unitWithProration")

            fun asGroupedAllocation(): NewFloatingGroupedAllocationPrice =
                groupedAllocation.getOrThrow("groupedAllocation")

            fun asGroupedWithProratedMinimum(): NewFloatingGroupedWithProratedMinimumPrice =
                groupedWithProratedMinimum.getOrThrow("groupedWithProratedMinimum")

            fun asGroupedWithMeteredMinimum(): NewFloatingGroupedWithMeteredMinimumPrice =
                groupedWithMeteredMinimum.getOrThrow("groupedWithMeteredMinimum")

            fun asMatrixWithDisplayName(): NewFloatingMatrixWithDisplayNamePrice =
                matrixWithDisplayName.getOrThrow("matrixWithDisplayName")

            fun asBulkWithProration(): NewFloatingBulkWithProrationPrice =
                bulkWithProration.getOrThrow("bulkWithProration")

            fun asGroupedTieredPackage(): NewFloatingGroupedTieredPackagePrice =
                groupedTieredPackage.getOrThrow("groupedTieredPackage")

            fun asScalableMatrixWithUnitPricing(): NewFloatingScalableMatrixWithUnitPricingPrice =
                scalableMatrixWithUnitPricing.getOrThrow("scalableMatrixWithUnitPricing")

            fun asScalableMatrixWithTieredPricing():
                NewFloatingScalableMatrixWithTieredPricingPrice =
                scalableMatrixWithTieredPricing.getOrThrow("scalableMatrixWithTieredPricing")

            fun asCumulativeGroupedBulk(): NewFloatingCumulativeGroupedBulkPrice =
                cumulativeGroupedBulk.getOrThrow("cumulativeGroupedBulk")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    unit != null -> visitor.visitUnit(unit)
                    package_ != null -> visitor.visitPackage(package_)
                    matrix != null -> visitor.visitMatrix(matrix)
                    matrixWithAllocation != null ->
                        visitor.visitMatrixWithAllocation(matrixWithAllocation)
                    tiered != null -> visitor.visitTiered(tiered)
                    tieredBps != null -> visitor.visitTieredBps(tieredBps)
                    bps != null -> visitor.visitBps(bps)
                    bulkBps != null -> visitor.visitBulkBps(bulkBps)
                    bulk != null -> visitor.visitBulk(bulk)
                    thresholdTotalAmount != null ->
                        visitor.visitThresholdTotalAmount(thresholdTotalAmount)
                    tieredPackage != null -> visitor.visitTieredPackage(tieredPackage)
                    groupedTiered != null -> visitor.visitGroupedTiered(groupedTiered)
                    maxGroupTieredPackage != null ->
                        visitor.visitMaxGroupTieredPackage(maxGroupTieredPackage)
                    tieredWithMinimum != null -> visitor.visitTieredWithMinimum(tieredWithMinimum)
                    packageWithAllocation != null ->
                        visitor.visitPackageWithAllocation(packageWithAllocation)
                    tieredPackageWithMinimum != null ->
                        visitor.visitTieredPackageWithMinimum(tieredPackageWithMinimum)
                    unitWithPercent != null -> visitor.visitUnitWithPercent(unitWithPercent)
                    tieredWithProration != null ->
                        visitor.visitTieredWithProration(tieredWithProration)
                    unitWithProration != null -> visitor.visitUnitWithProration(unitWithProration)
                    groupedAllocation != null -> visitor.visitGroupedAllocation(groupedAllocation)
                    groupedWithProratedMinimum != null ->
                        visitor.visitGroupedWithProratedMinimum(groupedWithProratedMinimum)
                    groupedWithMeteredMinimum != null ->
                        visitor.visitGroupedWithMeteredMinimum(groupedWithMeteredMinimum)
                    matrixWithDisplayName != null ->
                        visitor.visitMatrixWithDisplayName(matrixWithDisplayName)
                    bulkWithProration != null -> visitor.visitBulkWithProration(bulkWithProration)
                    groupedTieredPackage != null ->
                        visitor.visitGroupedTieredPackage(groupedTieredPackage)
                    scalableMatrixWithUnitPricing != null ->
                        visitor.visitScalableMatrixWithUnitPricing(scalableMatrixWithUnitPricing)
                    scalableMatrixWithTieredPricing != null ->
                        visitor.visitScalableMatrixWithTieredPricing(
                            scalableMatrixWithTieredPricing
                        )
                    cumulativeGroupedBulk != null ->
                        visitor.visitCumulativeGroupedBulk(cumulativeGroupedBulk)
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

                        override fun visitPackage(package_: NewFloatingPackagePrice) {
                            package_.validate()
                        }

                        override fun visitMatrix(matrix: NewFloatingMatrixPrice) {
                            matrix.validate()
                        }

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                        ) {
                            matrixWithAllocation.validate()
                        }

                        override fun visitTiered(tiered: NewFloatingTieredPrice) {
                            tiered.validate()
                        }

                        override fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice) {
                            tieredBps.validate()
                        }

                        override fun visitBps(bps: NewFloatingBpsPrice) {
                            bps.validate()
                        }

                        override fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice) {
                            bulkBps.validate()
                        }

                        override fun visitBulk(bulk: NewFloatingBulkPrice) {
                            bulk.validate()
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

                        override fun visitGroupedTiered(
                            groupedTiered: NewFloatingGroupedTieredPrice
                        ) {
                            groupedTiered.validate()
                        }

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                        ) {
                            maxGroupTieredPackage.validate()
                        }

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                        ) {
                            tieredWithMinimum.validate()
                        }

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewFloatingPackageWithAllocationPrice
                        ) {
                            packageWithAllocation.validate()
                        }

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                        ) {
                            tieredPackageWithMinimum.validate()
                        }

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewFloatingUnitWithPercentPrice
                        ) {
                            unitWithPercent.validate()
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

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                        ) {
                            matrixWithDisplayName.validate()
                        }

                        override fun visitBulkWithProration(
                            bulkWithProration: NewFloatingBulkWithProrationPrice
                        ) {
                            bulkWithProration.validate()
                        }

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                        ) {
                            groupedTieredPackage.validate()
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

                        override fun visitPackage(package_: NewFloatingPackagePrice) =
                            package_.validity()

                        override fun visitMatrix(matrix: NewFloatingMatrixPrice) = matrix.validity()

                        override fun visitMatrixWithAllocation(
                            matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                        ) = matrixWithAllocation.validity()

                        override fun visitTiered(tiered: NewFloatingTieredPrice) = tiered.validity()

                        override fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice) =
                            tieredBps.validity()

                        override fun visitBps(bps: NewFloatingBpsPrice) = bps.validity()

                        override fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice) =
                            bulkBps.validity()

                        override fun visitBulk(bulk: NewFloatingBulkPrice) = bulk.validity()

                        override fun visitThresholdTotalAmount(
                            thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                        ) = thresholdTotalAmount.validity()

                        override fun visitTieredPackage(
                            tieredPackage: NewFloatingTieredPackagePrice
                        ) = tieredPackage.validity()

                        override fun visitGroupedTiered(
                            groupedTiered: NewFloatingGroupedTieredPrice
                        ) = groupedTiered.validity()

                        override fun visitMaxGroupTieredPackage(
                            maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                        ) = maxGroupTieredPackage.validity()

                        override fun visitTieredWithMinimum(
                            tieredWithMinimum: NewFloatingTieredWithMinimumPrice
                        ) = tieredWithMinimum.validity()

                        override fun visitPackageWithAllocation(
                            packageWithAllocation: NewFloatingPackageWithAllocationPrice
                        ) = packageWithAllocation.validity()

                        override fun visitTieredPackageWithMinimum(
                            tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                        ) = tieredPackageWithMinimum.validity()

                        override fun visitUnitWithPercent(
                            unitWithPercent: NewFloatingUnitWithPercentPrice
                        ) = unitWithPercent.validity()

                        override fun visitTieredWithProration(
                            tieredWithProration: NewFloatingTieredWithProrationPrice
                        ) = tieredWithProration.validity()

                        override fun visitUnitWithProration(
                            unitWithProration: NewFloatingUnitWithProrationPrice
                        ) = unitWithProration.validity()

                        override fun visitGroupedAllocation(
                            groupedAllocation: NewFloatingGroupedAllocationPrice
                        ) = groupedAllocation.validity()

                        override fun visitGroupedWithProratedMinimum(
                            groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                        ) = groupedWithProratedMinimum.validity()

                        override fun visitGroupedWithMeteredMinimum(
                            groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                        ) = groupedWithMeteredMinimum.validity()

                        override fun visitMatrixWithDisplayName(
                            matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                        ) = matrixWithDisplayName.validity()

                        override fun visitBulkWithProration(
                            bulkWithProration: NewFloatingBulkWithProrationPrice
                        ) = bulkWithProration.validity()

                        override fun visitGroupedTieredPackage(
                            groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                        ) = groupedTieredPackage.validity()

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

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Price && unit == other.unit && package_ == other.package_ && matrix == other.matrix && matrixWithAllocation == other.matrixWithAllocation && tiered == other.tiered && tieredBps == other.tieredBps && bps == other.bps && bulkBps == other.bulkBps && bulk == other.bulk && thresholdTotalAmount == other.thresholdTotalAmount && tieredPackage == other.tieredPackage && groupedTiered == other.groupedTiered && maxGroupTieredPackage == other.maxGroupTieredPackage && tieredWithMinimum == other.tieredWithMinimum && packageWithAllocation == other.packageWithAllocation && tieredPackageWithMinimum == other.tieredPackageWithMinimum && unitWithPercent == other.unitWithPercent && tieredWithProration == other.tieredWithProration && unitWithProration == other.unitWithProration && groupedAllocation == other.groupedAllocation && groupedWithProratedMinimum == other.groupedWithProratedMinimum && groupedWithMeteredMinimum == other.groupedWithMeteredMinimum && matrixWithDisplayName == other.matrixWithDisplayName && bulkWithProration == other.bulkWithProration && groupedTieredPackage == other.groupedTieredPackage && scalableMatrixWithUnitPricing == other.scalableMatrixWithUnitPricing && scalableMatrixWithTieredPricing == other.scalableMatrixWithTieredPricing && cumulativeGroupedBulk == other.cumulativeGroupedBulk /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(unit, package_, matrix, matrixWithAllocation, tiered, tieredBps, bps, bulkBps, bulk, thresholdTotalAmount, tieredPackage, groupedTiered, maxGroupTieredPackage, tieredWithMinimum, packageWithAllocation, tieredPackageWithMinimum, unitWithPercent, tieredWithProration, unitWithProration, groupedAllocation, groupedWithProratedMinimum, groupedWithMeteredMinimum, matrixWithDisplayName, bulkWithProration, groupedTieredPackage, scalableMatrixWithUnitPricing, scalableMatrixWithTieredPricing, cumulativeGroupedBulk) /* spotless:on */

            override fun toString(): String =
                when {
                    unit != null -> "Price{unit=$unit}"
                    package_ != null -> "Price{package_=$package_}"
                    matrix != null -> "Price{matrix=$matrix}"
                    matrixWithAllocation != null ->
                        "Price{matrixWithAllocation=$matrixWithAllocation}"
                    tiered != null -> "Price{tiered=$tiered}"
                    tieredBps != null -> "Price{tieredBps=$tieredBps}"
                    bps != null -> "Price{bps=$bps}"
                    bulkBps != null -> "Price{bulkBps=$bulkBps}"
                    bulk != null -> "Price{bulk=$bulk}"
                    thresholdTotalAmount != null ->
                        "Price{thresholdTotalAmount=$thresholdTotalAmount}"
                    tieredPackage != null -> "Price{tieredPackage=$tieredPackage}"
                    groupedTiered != null -> "Price{groupedTiered=$groupedTiered}"
                    maxGroupTieredPackage != null ->
                        "Price{maxGroupTieredPackage=$maxGroupTieredPackage}"
                    tieredWithMinimum != null -> "Price{tieredWithMinimum=$tieredWithMinimum}"
                    packageWithAllocation != null ->
                        "Price{packageWithAllocation=$packageWithAllocation}"
                    tieredPackageWithMinimum != null ->
                        "Price{tieredPackageWithMinimum=$tieredPackageWithMinimum}"
                    unitWithPercent != null -> "Price{unitWithPercent=$unitWithPercent}"
                    tieredWithProration != null -> "Price{tieredWithProration=$tieredWithProration}"
                    unitWithProration != null -> "Price{unitWithProration=$unitWithProration}"
                    groupedAllocation != null -> "Price{groupedAllocation=$groupedAllocation}"
                    groupedWithProratedMinimum != null ->
                        "Price{groupedWithProratedMinimum=$groupedWithProratedMinimum}"
                    groupedWithMeteredMinimum != null ->
                        "Price{groupedWithMeteredMinimum=$groupedWithMeteredMinimum}"
                    matrixWithDisplayName != null ->
                        "Price{matrixWithDisplayName=$matrixWithDisplayName}"
                    bulkWithProration != null -> "Price{bulkWithProration=$bulkWithProration}"
                    groupedTieredPackage != null ->
                        "Price{groupedTieredPackage=$groupedTieredPackage}"
                    scalableMatrixWithUnitPricing != null ->
                        "Price{scalableMatrixWithUnitPricing=$scalableMatrixWithUnitPricing}"
                    scalableMatrixWithTieredPricing != null ->
                        "Price{scalableMatrixWithTieredPricing=$scalableMatrixWithTieredPricing}"
                    cumulativeGroupedBulk != null ->
                        "Price{cumulativeGroupedBulk=$cumulativeGroupedBulk}"
                    _json != null -> "Price{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Price")
                }

            companion object {

                fun ofUnit(unit: NewFloatingUnitPrice) = Price(unit = unit)

                fun ofPackage(package_: NewFloatingPackagePrice) = Price(package_ = package_)

                fun ofMatrix(matrix: NewFloatingMatrixPrice) = Price(matrix = matrix)

                fun ofMatrixWithAllocation(
                    matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                ) = Price(matrixWithAllocation = matrixWithAllocation)

                fun ofTiered(tiered: NewFloatingTieredPrice) = Price(tiered = tiered)

                fun ofTieredBps(tieredBps: NewFloatingTieredBpsPrice) = Price(tieredBps = tieredBps)

                fun ofBps(bps: NewFloatingBpsPrice) = Price(bps = bps)

                fun ofBulkBps(bulkBps: NewFloatingBulkBpsPrice) = Price(bulkBps = bulkBps)

                fun ofBulk(bulk: NewFloatingBulkPrice) = Price(bulk = bulk)

                fun ofThresholdTotalAmount(
                    thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                ) = Price(thresholdTotalAmount = thresholdTotalAmount)

                fun ofTieredPackage(tieredPackage: NewFloatingTieredPackagePrice) =
                    Price(tieredPackage = tieredPackage)

                fun ofGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice) =
                    Price(groupedTiered = groupedTiered)

                fun ofMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                ) = Price(maxGroupTieredPackage = maxGroupTieredPackage)

                fun ofTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice) =
                    Price(tieredWithMinimum = tieredWithMinimum)

                fun ofPackageWithAllocation(
                    packageWithAllocation: NewFloatingPackageWithAllocationPrice
                ) = Price(packageWithAllocation = packageWithAllocation)

                fun ofTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                ) = Price(tieredPackageWithMinimum = tieredPackageWithMinimum)

                fun ofUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice) =
                    Price(unitWithPercent = unitWithPercent)

                fun ofTieredWithProration(
                    tieredWithProration: NewFloatingTieredWithProrationPrice
                ) = Price(tieredWithProration = tieredWithProration)

                fun ofUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice) =
                    Price(unitWithProration = unitWithProration)

                fun ofGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice) =
                    Price(groupedAllocation = groupedAllocation)

                fun ofGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                ) = Price(groupedWithProratedMinimum = groupedWithProratedMinimum)

                fun ofGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                ) = Price(groupedWithMeteredMinimum = groupedWithMeteredMinimum)

                fun ofMatrixWithDisplayName(
                    matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                ) = Price(matrixWithDisplayName = matrixWithDisplayName)

                fun ofBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice) =
                    Price(bulkWithProration = bulkWithProration)

                fun ofGroupedTieredPackage(
                    groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
                ) = Price(groupedTieredPackage = groupedTieredPackage)

                fun ofScalableMatrixWithUnitPricing(
                    scalableMatrixWithUnitPricing: NewFloatingScalableMatrixWithUnitPricingPrice
                ) = Price(scalableMatrixWithUnitPricing = scalableMatrixWithUnitPricing)

                fun ofScalableMatrixWithTieredPricing(
                    scalableMatrixWithTieredPricing: NewFloatingScalableMatrixWithTieredPricingPrice
                ) = Price(scalableMatrixWithTieredPricing = scalableMatrixWithTieredPricing)

                fun ofCumulativeGroupedBulk(
                    cumulativeGroupedBulk: NewFloatingCumulativeGroupedBulkPrice
                ) = Price(cumulativeGroupedBulk = cumulativeGroupedBulk)
            }

            /**
             * An interface that defines how to map each variant of [Price] to a value of type [T].
             */
            interface Visitor<out T> {

                fun visitUnit(unit: NewFloatingUnitPrice): T

                fun visitPackage(package_: NewFloatingPackagePrice): T

                fun visitMatrix(matrix: NewFloatingMatrixPrice): T

                fun visitMatrixWithAllocation(
                    matrixWithAllocation: NewFloatingMatrixWithAllocationPrice
                ): T

                fun visitTiered(tiered: NewFloatingTieredPrice): T

                fun visitTieredBps(tieredBps: NewFloatingTieredBpsPrice): T

                fun visitBps(bps: NewFloatingBpsPrice): T

                fun visitBulkBps(bulkBps: NewFloatingBulkBpsPrice): T

                fun visitBulk(bulk: NewFloatingBulkPrice): T

                fun visitThresholdTotalAmount(
                    thresholdTotalAmount: NewFloatingThresholdTotalAmountPrice
                ): T

                fun visitTieredPackage(tieredPackage: NewFloatingTieredPackagePrice): T

                fun visitGroupedTiered(groupedTiered: NewFloatingGroupedTieredPrice): T

                fun visitMaxGroupTieredPackage(
                    maxGroupTieredPackage: NewFloatingMaxGroupTieredPackagePrice
                ): T

                fun visitTieredWithMinimum(tieredWithMinimum: NewFloatingTieredWithMinimumPrice): T

                fun visitPackageWithAllocation(
                    packageWithAllocation: NewFloatingPackageWithAllocationPrice
                ): T

                fun visitTieredPackageWithMinimum(
                    tieredPackageWithMinimum: NewFloatingTieredPackageWithMinimumPrice
                ): T

                fun visitUnitWithPercent(unitWithPercent: NewFloatingUnitWithPercentPrice): T

                fun visitTieredWithProration(
                    tieredWithProration: NewFloatingTieredWithProrationPrice
                ): T

                fun visitUnitWithProration(unitWithProration: NewFloatingUnitWithProrationPrice): T

                fun visitGroupedAllocation(groupedAllocation: NewFloatingGroupedAllocationPrice): T

                fun visitGroupedWithProratedMinimum(
                    groupedWithProratedMinimum: NewFloatingGroupedWithProratedMinimumPrice
                ): T

                fun visitGroupedWithMeteredMinimum(
                    groupedWithMeteredMinimum: NewFloatingGroupedWithMeteredMinimumPrice
                ): T

                fun visitMatrixWithDisplayName(
                    matrixWithDisplayName: NewFloatingMatrixWithDisplayNamePrice
                ): T

                fun visitBulkWithProration(bulkWithProration: NewFloatingBulkWithProrationPrice): T

                fun visitGroupedTieredPackage(
                    groupedTieredPackage: NewFloatingGroupedTieredPackagePrice
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
                        "package" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingPackagePrice>())
                                ?.let { Price(package_ = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixPrice>())
                                ?.let { Price(matrix = it, _json = json) } ?: Price(_json = json)
                        }
                        "matrix_with_allocation" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>(),
                                )
                                ?.let { Price(matrixWithAllocation = it, _json = json) }
                                ?: Price(_json = json)
                        }
                        "tiered" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPrice>())
                                ?.let { Price(tiered = it, _json = json) } ?: Price(_json = json)
                        }
                        "tiered_bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingTieredBpsPrice>())
                                ?.let { Price(tieredBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingBpsPrice>())
                                ?.let { Price(bps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk_bps" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkBpsPrice>())
                                ?.let { Price(bulkBps = it, _json = json) } ?: Price(_json = json)
                        }
                        "bulk" -> {
                            return tryDeserialize(node, jacksonTypeRef<NewFloatingBulkPrice>())
                                ?.let { Price(bulk = it, _json = json) } ?: Price(_json = json)
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
                        "grouped_tiered" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedTieredPrice>(),
                                )
                                ?.let { Price(groupedTiered = it, _json = json) }
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
                        "tiered_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredWithMinimum = it, _json = json) }
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
                        "tiered_package_with_minimum" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>(),
                                )
                                ?.let { Price(tieredPackageWithMinimum = it, _json = json) }
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
                        "matrix_with_display_name" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingMatrixWithDisplayNamePrice>(),
                                )
                                ?.let { Price(matrixWithDisplayName = it, _json = json) }
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
                        "grouped_tiered_package" -> {
                            return tryDeserialize(
                                    node,
                                    jacksonTypeRef<NewFloatingGroupedTieredPackagePrice>(),
                                )
                                ?.let { Price(groupedTieredPackage = it, _json = json) }
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
                        value.package_ != null -> generator.writeObject(value.package_)
                        value.matrix != null -> generator.writeObject(value.matrix)
                        value.matrixWithAllocation != null ->
                            generator.writeObject(value.matrixWithAllocation)
                        value.tiered != null -> generator.writeObject(value.tiered)
                        value.tieredBps != null -> generator.writeObject(value.tieredBps)
                        value.bps != null -> generator.writeObject(value.bps)
                        value.bulkBps != null -> generator.writeObject(value.bulkBps)
                        value.bulk != null -> generator.writeObject(value.bulk)
                        value.thresholdTotalAmount != null ->
                            generator.writeObject(value.thresholdTotalAmount)
                        value.tieredPackage != null -> generator.writeObject(value.tieredPackage)
                        value.groupedTiered != null -> generator.writeObject(value.groupedTiered)
                        value.maxGroupTieredPackage != null ->
                            generator.writeObject(value.maxGroupTieredPackage)
                        value.tieredWithMinimum != null ->
                            generator.writeObject(value.tieredWithMinimum)
                        value.packageWithAllocation != null ->
                            generator.writeObject(value.packageWithAllocation)
                        value.tieredPackageWithMinimum != null ->
                            generator.writeObject(value.tieredPackageWithMinimum)
                        value.unitWithPercent != null ->
                            generator.writeObject(value.unitWithPercent)
                        value.tieredWithProration != null ->
                            generator.writeObject(value.tieredWithProration)
                        value.unitWithProration != null ->
                            generator.writeObject(value.unitWithProration)
                        value.groupedAllocation != null ->
                            generator.writeObject(value.groupedAllocation)
                        value.groupedWithProratedMinimum != null ->
                            generator.writeObject(value.groupedWithProratedMinimum)
                        value.groupedWithMeteredMinimum != null ->
                            generator.writeObject(value.groupedWithMeteredMinimum)
                        value.matrixWithDisplayName != null ->
                            generator.writeObject(value.matrixWithDisplayName)
                        value.bulkWithProration != null ->
                            generator.writeObject(value.bulkWithProration)
                        value.groupedTieredPackage != null ->
                            generator.writeObject(value.groupedTieredPackage)
                        value.scalableMatrixWithUnitPricing != null ->
                            generator.writeObject(value.scalableMatrixWithUnitPricing)
                        value.scalableMatrixWithTieredPricing != null ->
                            generator.writeObject(value.scalableMatrixWithTieredPricing)
                        value.cumulativeGroupedBulk != null ->
                            generator.writeObject(value.cumulativeGroupedBulk)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Price")
                    }
                }
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Add && startDate == other.startDate && allocationPrice == other.allocationPrice && discounts == other.discounts && endDate == other.endDate && externalPriceId == other.externalPriceId && filter == other.filter && fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && maximumAmount == other.maximumAmount && minimumAmount == other.minimumAmount && price == other.price && priceId == other.priceId && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(startDate, allocationPrice, discounts, endDate, externalPriceId, filter, fixedFeeQuantityTransitions, maximumAmount, minimumAmount, price, priceId, usageCustomerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Add{startDate=$startDate, allocationPrice=$allocationPrice, discounts=$discounts, endDate=$endDate, externalPriceId=$externalPriceId, filter=$filter, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, price=$price, priceId=$priceId, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    class AddAdjustment
    private constructor(
        private val adjustment: JsonField<Adjustment>,
        private val startDate: JsonField<StartDate>,
        private val endDate: JsonField<EndDate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("adjustment")
            @ExcludeMissing
            adjustment: JsonField<Adjustment> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            startDate: JsonField<StartDate> = JsonMissing.of(),
            @JsonProperty("end_date") @ExcludeMissing endDate: JsonField<EndDate> = JsonMissing.of(),
        ) : this(adjustment, startDate, endDate, mutableMapOf())

        /**
         * The definition of a new adjustment to create and add to the subscription.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun adjustment(): Adjustment = adjustment.getRequired("adjustment")

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
         * Returns the raw JSON value of [adjustment].
         *
         * Unlike [adjustment], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<Adjustment> = adjustment

        /**
         * Returns the raw JSON value of [startDate].
         *
         * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

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
             * .adjustment()
             * .startDate()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AddAdjustment]. */
        class Builder internal constructor() {

            private var adjustment: JsonField<Adjustment>? = null
            private var startDate: JsonField<StartDate>? = null
            private var endDate: JsonField<EndDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addAdjustment: AddAdjustment) = apply {
                adjustment = addAdjustment.adjustment
                startDate = addAdjustment.startDate
                endDate = addAdjustment.endDate
                additionalProperties = addAdjustment.additionalProperties.toMutableMap()
            }

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(adjustment: Adjustment) = adjustment(JsonField.of(adjustment))

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
             * .adjustment()
             * .startDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AddAdjustment =
                AddAdjustment(
                    checkRequired("adjustment", adjustment),
                    checkRequired("startDate", startDate),
                    endDate,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AddAdjustment = apply {
            if (validated) {
                return@apply
            }

            adjustment().validate()
            startDate().validate()
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
            (adjustment.asKnown()?.validity() ?: 0) +
                (startDate.asKnown()?.validity() ?: 0) +
                (endDate.asKnown()?.validity() ?: 0)

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

                return /* spotless:off */ other is Adjustment && percentageDiscount == other.percentageDiscount && usageDiscount == other.usageDiscount && amountDiscount == other.amountDiscount && minimum == other.minimum && maximum == other.maximum /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(percentageDiscount, usageDiscount, amountDiscount, minimum, maximum) /* spotless:on */

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

                return /* spotless:off */ other is StartDate && dateTime == other.dateTime && billingCycleRelative == other.billingCycleRelative /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateTime, billingCycleRelative) /* spotless:on */

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

                return /* spotless:off */ other is EndDate && dateTime == other.dateTime && billingCycleRelative == other.billingCycleRelative /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateTime, billingCycleRelative) /* spotless:on */

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

            return /* spotless:off */ other is AddAdjustment && adjustment == other.adjustment && startDate == other.startDate && endDate == other.endDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustment, startDate, endDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AddAdjustment{adjustment=$adjustment, startDate=$startDate, endDate=$endDate, additionalProperties=$additionalProperties}"
    }

    class Edit
    private constructor(
        private val priceIntervalId: JsonField<String>,
        private val billingCycleDay: JsonField<Long>,
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

                return /* spotless:off */ other is EndDate && dateTime == other.dateTime && billingCycleRelative == other.billingCycleRelative /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateTime, billingCycleRelative) /* spotless:on */

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

                return /* spotless:off */ other is FixedFeeQuantityTransition && effectiveDate == other.effectiveDate && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(effectiveDate, quantity, additionalProperties) }
            /* spotless:on */

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

                return /* spotless:off */ other is StartDate && dateTime == other.dateTime && billingCycleRelative == other.billingCycleRelative /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateTime, billingCycleRelative) /* spotless:on */

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

            return /* spotless:off */ other is Edit && priceIntervalId == other.priceIntervalId && billingCycleDay == other.billingCycleDay && endDate == other.endDate && filter == other.filter && fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && startDate == other.startDate && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(priceIntervalId, billingCycleDay, endDate, filter, fixedFeeQuantityTransitions, startDate, usageCustomerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Edit{priceIntervalId=$priceIntervalId, billingCycleDay=$billingCycleDay, endDate=$endDate, filter=$filter, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, startDate=$startDate, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    class EditAdjustment
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

                return /* spotless:off */ other is EndDate && dateTime == other.dateTime && billingCycleRelative == other.billingCycleRelative /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateTime, billingCycleRelative) /* spotless:on */

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

                return /* spotless:off */ other is StartDate && dateTime == other.dateTime && billingCycleRelative == other.billingCycleRelative /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(dateTime, billingCycleRelative) /* spotless:on */

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

            return /* spotless:off */ other is EditAdjustment && adjustmentIntervalId == other.adjustmentIntervalId && endDate == other.endDate && startDate == other.startDate && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(adjustmentIntervalId, endDate, startDate, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EditAdjustment{adjustmentIntervalId=$adjustmentIntervalId, endDate=$endDate, startDate=$startDate, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionPriceIntervalsParams && subscriptionId == other.subscriptionId && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SubscriptionPriceIntervalsParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
