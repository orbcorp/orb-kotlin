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
import com.withorb.api.core.Params
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
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
    private val subscriptionId: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): String = subscriptionId

    /** A list of price intervals to add to the subscription. */
    fun add(): List<Add>? = body.add()

    /** A list of adjustments to add to the subscription. */
    fun addAdjustments(): List<AddAdjustment>? = body.addAdjustments()

    /**
     * If false, this request will fail if it would void an issued invoice or create a credit note.
     * Consider using this as a safety mechanism if you do not expect existing invoices to be
     * changed.
     */
    fun allowInvoiceCreditOrVoid(): Boolean? = body.allowInvoiceCreditOrVoid()

    /** A list of price intervals to edit on the subscription. */
    fun edit(): List<Edit>? = body.edit()

    /** A list of adjustments to edit on the subscription. */
    fun editAdjustments(): List<EditAdjustment>? = body.editAdjustments()

    /** A list of price intervals to add to the subscription. */
    fun _add(): JsonField<List<Add>> = body._add()

    /** A list of adjustments to add to the subscription. */
    fun _addAdjustments(): JsonField<List<AddAdjustment>> = body._addAdjustments()

    /**
     * If false, this request will fail if it would void an issued invoice or create a credit note.
     * Consider using this as a safety mechanism if you do not expect existing invoices to be
     * changed.
     */
    fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = body._allowInvoiceCreditOrVoid()

    /** A list of price intervals to edit on the subscription. */
    fun _edit(): JsonField<List<Edit>> = body._edit()

    /** A list of adjustments to edit on the subscription. */
    fun _editAdjustments(): JsonField<List<EditAdjustment>> = body._editAdjustments()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> subscriptionId
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("add")
        @ExcludeMissing
        private val add: JsonField<List<Add>> = JsonMissing.of(),
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        private val addAdjustments: JsonField<List<AddAdjustment>> = JsonMissing.of(),
        @JsonProperty("allow_invoice_credit_or_void")
        @ExcludeMissing
        private val allowInvoiceCreditOrVoid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("edit")
        @ExcludeMissing
        private val edit: JsonField<List<Edit>> = JsonMissing.of(),
        @JsonProperty("edit_adjustments")
        @ExcludeMissing
        private val editAdjustments: JsonField<List<EditAdjustment>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A list of price intervals to add to the subscription. */
        fun add(): List<Add>? = add.getNullable("add")

        /** A list of adjustments to add to the subscription. */
        fun addAdjustments(): List<AddAdjustment>? = addAdjustments.getNullable("add_adjustments")

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(): Boolean? =
            allowInvoiceCreditOrVoid.getNullable("allow_invoice_credit_or_void")

        /** A list of price intervals to edit on the subscription. */
        fun edit(): List<Edit>? = edit.getNullable("edit")

        /** A list of adjustments to edit on the subscription. */
        fun editAdjustments(): List<EditAdjustment>? =
            editAdjustments.getNullable("edit_adjustments")

        /** A list of price intervals to add to the subscription. */
        @JsonProperty("add") @ExcludeMissing fun _add(): JsonField<List<Add>> = add

        /** A list of adjustments to add to the subscription. */
        @JsonProperty("add_adjustments")
        @ExcludeMissing
        fun _addAdjustments(): JsonField<List<AddAdjustment>> = addAdjustments

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        @JsonProperty("allow_invoice_credit_or_void")
        @ExcludeMissing
        fun _allowInvoiceCreditOrVoid(): JsonField<Boolean> = allowInvoiceCreditOrVoid

        /** A list of price intervals to edit on the subscription. */
        @JsonProperty("edit") @ExcludeMissing fun _edit(): JsonField<List<Edit>> = edit

        /** A list of adjustments to edit on the subscription. */
        @JsonProperty("edit_adjustments")
        @ExcludeMissing
        fun _editAdjustments(): JsonField<List<EditAdjustment>> = editAdjustments

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /** A list of price intervals to add to the subscription. */
            fun add(add: JsonField<List<Add>>) = apply { this.add = add.map { it.toMutableList() } }

            /** A list of price intervals to add to the subscription. */
            fun addAdd(add: Add) = apply {
                this.add =
                    (this.add ?: JsonField.of(mutableListOf())).also {
                        checkKnown("add", it).add(add)
                    }
            }

            /** A list of adjustments to add to the subscription. */
            fun addAdjustments(addAdjustments: List<AddAdjustment>) =
                addAdjustments(JsonField.of(addAdjustments))

            /** A list of adjustments to add to the subscription. */
            fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
                this.addAdjustments = addAdjustments.map { it.toMutableList() }
            }

            /** A list of adjustments to add to the subscription. */
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
             * If false, this request will fail if it would void an issued invoice or create a
             * credit note. Consider using this as a safety mechanism if you do not expect existing
             * invoices to be changed.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
                allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

            /**
             * If false, this request will fail if it would void an issued invoice or create a
             * credit note. Consider using this as a safety mechanism if you do not expect existing
             * invoices to be changed.
             */
            fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
                this.allowInvoiceCreditOrVoid = allowInvoiceCreditOrVoid
            }

            /** A list of price intervals to edit on the subscription. */
            fun edit(edit: List<Edit>) = edit(JsonField.of(edit))

            /** A list of price intervals to edit on the subscription. */
            fun edit(edit: JsonField<List<Edit>>) = apply {
                this.edit = edit.map { it.toMutableList() }
            }

            /** A list of price intervals to edit on the subscription. */
            fun addEdit(edit: Edit) = apply {
                this.edit =
                    (this.edit ?: JsonField.of(mutableListOf())).also {
                        checkKnown("edit", it).add(edit)
                    }
            }

            /** A list of adjustments to edit on the subscription. */
            fun editAdjustments(editAdjustments: List<EditAdjustment>) =
                editAdjustments(JsonField.of(editAdjustments))

            /** A list of adjustments to edit on the subscription. */
            fun editAdjustments(editAdjustments: JsonField<List<EditAdjustment>>) = apply {
                this.editAdjustments = editAdjustments.map { it.toMutableList() }
            }

            /** A list of adjustments to edit on the subscription. */
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

            fun build(): Body =
                Body(
                    (add ?: JsonMissing.of()).map { it.toImmutable() },
                    (addAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    allowInvoiceCreditOrVoid,
                    (edit ?: JsonMissing.of()).map { it.toImmutable() },
                    (editAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

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

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionPriceIntervalsParams].
         *
         * The following fields are required:
         * ```kotlin
         * .subscriptionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionPriceIntervalsParams]. */
    @NoAutoDetect
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

        fun subscriptionId(subscriptionId: String) = apply { this.subscriptionId = subscriptionId }

        /** A list of price intervals to add to the subscription. */
        fun add(add: List<Add>) = apply { body.add(add) }

        /** A list of price intervals to add to the subscription. */
        fun add(add: JsonField<List<Add>>) = apply { body.add(add) }

        /** A list of price intervals to add to the subscription. */
        fun addAdd(add: Add) = apply { body.addAdd(add) }

        /** A list of adjustments to add to the subscription. */
        fun addAdjustments(addAdjustments: List<AddAdjustment>) = apply {
            body.addAdjustments(addAdjustments)
        }

        /** A list of adjustments to add to the subscription. */
        fun addAdjustments(addAdjustments: JsonField<List<AddAdjustment>>) = apply {
            body.addAdjustments(addAdjustments)
        }

        /** A list of adjustments to add to the subscription. */
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
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: Boolean) =
            allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid as Boolean?)

        /**
         * If false, this request will fail if it would void an issued invoice or create a credit
         * note. Consider using this as a safety mechanism if you do not expect existing invoices to
         * be changed.
         */
        fun allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid: JsonField<Boolean>) = apply {
            body.allowInvoiceCreditOrVoid(allowInvoiceCreditOrVoid)
        }

        /** A list of price intervals to edit on the subscription. */
        fun edit(edit: List<Edit>) = apply { body.edit(edit) }

        /** A list of price intervals to edit on the subscription. */
        fun edit(edit: JsonField<List<Edit>>) = apply { body.edit(edit) }

        /** A list of price intervals to edit on the subscription. */
        fun addEdit(edit: Edit) = apply { body.addEdit(edit) }

        /** A list of adjustments to edit on the subscription. */
        fun editAdjustments(editAdjustments: List<EditAdjustment>) = apply {
            body.editAdjustments(editAdjustments)
        }

        /** A list of adjustments to edit on the subscription. */
        fun editAdjustments(editAdjustments: JsonField<List<EditAdjustment>>) = apply {
            body.editAdjustments(editAdjustments)
        }

        /** A list of adjustments to edit on the subscription. */
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

        fun build(): SubscriptionPriceIntervalsParams =
            SubscriptionPriceIntervalsParams(
                checkRequired("subscriptionId", subscriptionId),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Add
    @JsonCreator
    private constructor(
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<StartDate> = JsonMissing.of(),
        @JsonProperty("allocation_price")
        @ExcludeMissing
        private val allocationPrice: JsonField<NewAllocationPriceModel> = JsonMissing.of(),
        @JsonProperty("discounts")
        @ExcludeMissing
        private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<EndDate> = JsonMissing.of(),
        @JsonProperty("external_price_id")
        @ExcludeMissing
        private val externalPriceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("filter")
        @ExcludeMissing
        private val filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        private val fixedFeeQuantityTransitions:
            JsonField<List<PriceIntervalFixedFeeQuantityTransitionModel>> =
            JsonMissing.of(),
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        private val maximumAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        private val minimumAmount: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("price")
        @ExcludeMissing
        private val price: JsonField<NewFloatingPriceModel> = JsonMissing.of(),
        @JsonProperty("price_id")
        @ExcludeMissing
        private val priceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        private val usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription.
         */
        fun startDate(): StartDate = startDate.getRequired("start_date")

        /** The definition of a new allocation price to create and add to the subscription. */
        fun allocationPrice(): NewAllocationPriceModel? =
            allocationPrice.getNullable("allocation_price")

        /** A list of discounts to initialize on the price interval. */
        fun discounts(): List<Discount>? = discounts.getNullable("discounts")

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription.
         */
        fun endDate(): EndDate? = endDate.getNullable("end_date")

        /** The external price id of the price to add to the subscription. */
        fun externalPriceId(): String? = externalPriceId.getNullable("external_price_id")

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        fun filter(): String? = filter.getNullable("filter")

        /** A list of fixed fee quantity transitions to initialize on the price interval. */
        fun fixedFeeQuantityTransitions(): List<PriceIntervalFixedFeeQuantityTransitionModel>? =
            fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")

        /**
         * The maximum amount that will be billed for this price interval for a given billing
         * period.
         */
        fun maximumAmount(): Double? = maximumAmount.getNullable("maximum_amount")

        /**
         * The minimum amount that will be billed for this price interval for a given billing
         * period.
         */
        fun minimumAmount(): Double? = minimumAmount.getNullable("minimum_amount")

        /** The definition of a new price to create and add to the subscription. */
        fun price(): NewFloatingPriceModel? = price.getNullable("price")

        /** The id of the price to add to the subscription. */
        fun priceId(): String? = priceId.getNullable("price_id")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

        /**
         * The start date of the price interval. This is the date that the price will start billing
         * on the subscription.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

        /** The definition of a new allocation price to create and add to the subscription. */
        @JsonProperty("allocation_price")
        @ExcludeMissing
        fun _allocationPrice(): JsonField<NewAllocationPriceModel> = allocationPrice

        /** A list of discounts to initialize on the price interval. */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<Discount>> = discounts

        /**
         * The end date of the price interval. This is the date that the price will stop billing on
         * the subscription.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<EndDate> = endDate

        /** The external price id of the price to add to the subscription. */
        @JsonProperty("external_price_id")
        @ExcludeMissing
        fun _externalPriceId(): JsonField<String> = externalPriceId

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /** A list of fixed fee quantity transitions to initialize on the price interval. */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions():
            JsonField<List<PriceIntervalFixedFeeQuantityTransitionModel>> =
            fixedFeeQuantityTransitions

        /**
         * The maximum amount that will be billed for this price interval for a given billing
         * period.
         */
        @JsonProperty("maximum_amount")
        @ExcludeMissing
        fun _maximumAmount(): JsonField<Double> = maximumAmount

        /**
         * The minimum amount that will be billed for this price interval for a given billing
         * period.
         */
        @JsonProperty("minimum_amount")
        @ExcludeMissing
        fun _minimumAmount(): JsonField<Double> = minimumAmount

        /** The definition of a new price to create and add to the subscription. */
        @JsonProperty("price")
        @ExcludeMissing
        fun _price(): JsonField<NewFloatingPriceModel> = price

        /** The id of the price to add to the subscription. */
        @JsonProperty("price_id") @ExcludeMissing fun _priceId(): JsonField<String> = priceId

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            private var allocationPrice: JsonField<NewAllocationPriceModel> = JsonMissing.of()
            private var discounts: JsonField<MutableList<Discount>>? = null
            private var endDate: JsonField<EndDate> = JsonMissing.of()
            private var externalPriceId: JsonField<String> = JsonMissing.of()
            private var filter: JsonField<String> = JsonMissing.of()
            private var fixedFeeQuantityTransitions:
                JsonField<MutableList<PriceIntervalFixedFeeQuantityTransitionModel>>? =
                null
            private var maximumAmount: JsonField<Double> = JsonMissing.of()
            private var minimumAmount: JsonField<Double> = JsonMissing.of()
            private var price: JsonField<NewFloatingPriceModel> = JsonMissing.of()
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
             * The start date of the price interval. This is the date that the price will start
             * billing on the subscription.
             */
            fun startDate(startDate: JsonField<StartDate>) = apply { this.startDate = startDate }

            /**
             * The start date of the price interval. This is the date that the price will start
             * billing on the subscription.
             */
            fun startDate(dateTime: OffsetDateTime) = startDate(StartDate.ofDateTime(dateTime))

            /**
             * The start date of the price interval. This is the date that the price will start
             * billing on the subscription.
             */
            fun startDate(billingCycleRelative: BillingCycleRelativeDate) =
                startDate(StartDate.ofBillingCycleRelative(billingCycleRelative))

            /** The definition of a new allocation price to create and add to the subscription. */
            fun allocationPrice(allocationPrice: NewAllocationPriceModel?) =
                allocationPrice(JsonField.ofNullable(allocationPrice))

            /** The definition of a new allocation price to create and add to the subscription. */
            fun allocationPrice(allocationPrice: JsonField<NewAllocationPriceModel>) = apply {
                this.allocationPrice = allocationPrice
            }

            /** A list of discounts to initialize on the price interval. */
            fun discounts(discounts: List<Discount>?) = discounts(JsonField.ofNullable(discounts))

            /** A list of discounts to initialize on the price interval. */
            fun discounts(discounts: JsonField<List<Discount>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /** A list of discounts to initialize on the price interval. */
            fun addDiscount(discount: Discount) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /** A list of discounts to initialize on the price interval. */
            fun addDiscount(amountDiscountCreationParams: Discount.AmountDiscountCreationParams) =
                addDiscount(Discount.ofAmountDiscountCreationParams(amountDiscountCreationParams))

            /** A list of discounts to initialize on the price interval. */
            fun addAmountDiscountCreationParamsDiscount(amountDiscount: Double) =
                addDiscount(
                    Discount.AmountDiscountCreationParams.builder()
                        .discountType(
                            SubscriptionPriceIntervalsParams.Add.Discount
                                .AmountDiscountCreationParams
                                .DiscountType
                                .AMOUNT
                        )
                        .amountDiscount(amountDiscount)
                        .build()
                )

            /** A list of discounts to initialize on the price interval. */
            fun addDiscount(
                percentageDiscountCreationParams: Discount.PercentageDiscountCreationParams
            ) =
                addDiscount(
                    Discount.ofPercentageDiscountCreationParams(percentageDiscountCreationParams)
                )

            /** A list of discounts to initialize on the price interval. */
            fun addPercentageDiscountCreationParamsDiscount(percentageDiscount: Double) =
                addDiscount(
                    Discount.PercentageDiscountCreationParams.builder()
                        .discountType(
                            SubscriptionPriceIntervalsParams.Add.Discount
                                .PercentageDiscountCreationParams
                                .DiscountType
                                .PERCENTAGE
                        )
                        .percentageDiscount(percentageDiscount)
                        .build()
                )

            /** A list of discounts to initialize on the price interval. */
            fun addDiscount(usageDiscountCreationParams: Discount.UsageDiscountCreationParams) =
                addDiscount(Discount.ofUsageDiscountCreationParams(usageDiscountCreationParams))

            /** A list of discounts to initialize on the price interval. */
            fun addUsageDiscountCreationParamsDiscount(usageDiscount: Double) =
                addDiscount(
                    Discount.UsageDiscountCreationParams.builder()
                        .discountType(
                            SubscriptionPriceIntervalsParams.Add.Discount
                                .UsageDiscountCreationParams
                                .DiscountType
                                .USAGE
                        )
                        .usageDiscount(usageDiscount)
                        .build()
                )

            /**
             * The end date of the price interval. This is the date that the price will stop billing
             * on the subscription.
             */
            fun endDate(endDate: EndDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * The end date of the price interval. This is the date that the price will stop billing
             * on the subscription.
             */
            fun endDate(endDate: JsonField<EndDate>) = apply { this.endDate = endDate }

            /**
             * The end date of the price interval. This is the date that the price will stop billing
             * on the subscription.
             */
            fun endDate(dateTime: OffsetDateTime) = endDate(EndDate.ofDateTime(dateTime))

            /**
             * The end date of the price interval. This is the date that the price will stop billing
             * on the subscription.
             */
            fun endDate(billingCycleRelative: BillingCycleRelativeDate) =
                endDate(EndDate.ofBillingCycleRelative(billingCycleRelative))

            /** The external price id of the price to add to the subscription. */
            fun externalPriceId(externalPriceId: String?) =
                externalPriceId(JsonField.ofNullable(externalPriceId))

            /** The external price id of the price to add to the subscription. */
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
             * An additional filter to apply to usage queries. This filter must be expressed as a
             * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
             * null, usage queries will not include any additional filter.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /** A list of fixed fee quantity transitions to initialize on the price interval. */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<PriceIntervalFixedFeeQuantityTransitionModel>?
            ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

            /** A list of fixed fee quantity transitions to initialize on the price interval. */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions:
                    JsonField<List<PriceIntervalFixedFeeQuantityTransitionModel>>
            ) = apply {
                this.fixedFeeQuantityTransitions =
                    fixedFeeQuantityTransitions.map { it.toMutableList() }
            }

            /** A list of fixed fee quantity transitions to initialize on the price interval. */
            fun addFixedFeeQuantityTransition(
                fixedFeeQuantityTransition: PriceIntervalFixedFeeQuantityTransitionModel
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
             * The maximum amount that will be billed for this price interval for a given billing
             * period.
             */
            fun maximumAmount(maximumAmount: Double) = maximumAmount(maximumAmount as Double?)

            /**
             * The maximum amount that will be billed for this price interval for a given billing
             * period.
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
             * The minimum amount that will be billed for this price interval for a given billing
             * period.
             */
            fun minimumAmount(minimumAmount: Double) = minimumAmount(minimumAmount as Double?)

            /**
             * The minimum amount that will be billed for this price interval for a given billing
             * period.
             */
            fun minimumAmount(minimumAmount: JsonField<Double>) = apply {
                this.minimumAmount = minimumAmount
            }

            /** The definition of a new price to create and add to the subscription. */
            fun price(price: NewFloatingPriceModel?) = price(JsonField.ofNullable(price))

            /** The definition of a new price to create and add to the subscription. */
            fun price(price: JsonField<NewFloatingPriceModel>) = apply { this.price = price }

            /** The definition of a new price to create and add to the subscription. */
            fun price(unitPrice: NewFloatingPriceModel.NewFloatingUnitPrice) =
                price(NewFloatingPriceModel.ofUnitPrice(unitPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(packagePrice: NewFloatingPriceModel.NewFloatingPackagePrice) =
                price(NewFloatingPriceModel.ofPackagePrice(packagePrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(matrixPrice: NewFloatingPriceModel.NewFloatingMatrixPrice) =
                price(NewFloatingPriceModel.ofMatrixPrice(matrixPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                matrixWithAllocationPrice:
                    NewFloatingPriceModel.NewFloatingMatrixWithAllocationPrice
            ) = price(NewFloatingPriceModel.ofMatrixWithAllocationPrice(matrixWithAllocationPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(tieredPrice: NewFloatingPriceModel.NewFloatingTieredPrice) =
                price(NewFloatingPriceModel.ofTieredPrice(tieredPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(tieredBpsPrice: NewFloatingPriceModel.NewFloatingTieredBpsPrice) =
                price(NewFloatingPriceModel.ofTieredBpsPrice(tieredBpsPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(bpsPrice: NewFloatingPriceModel.NewFloatingBpsPrice) =
                price(NewFloatingPriceModel.ofBpsPrice(bpsPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(bulkBpsPrice: NewFloatingPriceModel.NewFloatingBulkBpsPrice) =
                price(NewFloatingPriceModel.ofBulkBpsPrice(bulkBpsPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(bulkPrice: NewFloatingPriceModel.NewFloatingBulkPrice) =
                price(NewFloatingPriceModel.ofBulkPrice(bulkPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                thresholdTotalAmountPrice:
                    NewFloatingPriceModel.NewFloatingThresholdTotalAmountPrice
            ) = price(NewFloatingPriceModel.ofThresholdTotalAmountPrice(thresholdTotalAmountPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(tieredPackagePrice: NewFloatingPriceModel.NewFloatingTieredPackagePrice) =
                price(NewFloatingPriceModel.ofTieredPackagePrice(tieredPackagePrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(groupedTieredPrice: NewFloatingPriceModel.NewFloatingGroupedTieredPrice) =
                price(NewFloatingPriceModel.ofGroupedTieredPrice(groupedTieredPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                maxGroupTieredPackagePrice:
                    NewFloatingPriceModel.NewFloatingMaxGroupTieredPackagePrice
            ) =
                price(
                    NewFloatingPriceModel.ofMaxGroupTieredPackagePrice(maxGroupTieredPackagePrice)
                )

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                tieredWithMinimumPrice: NewFloatingPriceModel.NewFloatingTieredWithMinimumPrice
            ) = price(NewFloatingPriceModel.ofTieredWithMinimumPrice(tieredWithMinimumPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                packageWithAllocationPrice:
                    NewFloatingPriceModel.NewFloatingPackageWithAllocationPrice
            ) =
                price(
                    NewFloatingPriceModel.ofPackageWithAllocationPrice(packageWithAllocationPrice)
                )

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                tieredPackageWithMinimumPrice:
                    NewFloatingPriceModel.NewFloatingTieredPackageWithMinimumPrice
            ) =
                price(
                    NewFloatingPriceModel.ofTieredPackageWithMinimumPrice(
                        tieredPackageWithMinimumPrice
                    )
                )

            /** The definition of a new price to create and add to the subscription. */
            fun price(unitWithPercentPrice: NewFloatingPriceModel.NewFloatingUnitWithPercentPrice) =
                price(NewFloatingPriceModel.ofUnitWithPercentPrice(unitWithPercentPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                tieredWithProrationPrice: NewFloatingPriceModel.NewFloatingTieredWithProrationPrice
            ) = price(NewFloatingPriceModel.ofTieredWithProrationPrice(tieredWithProrationPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                unitWithProrationPrice: NewFloatingPriceModel.NewFloatingUnitWithProrationPrice
            ) = price(NewFloatingPriceModel.ofUnitWithProrationPrice(unitWithProrationPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                groupedAllocationPrice: NewFloatingPriceModel.NewFloatingGroupedAllocationPrice
            ) = price(NewFloatingPriceModel.ofGroupedAllocationPrice(groupedAllocationPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                groupedWithProratedMinimumPrice:
                    NewFloatingPriceModel.NewFloatingGroupedWithProratedMinimumPrice
            ) =
                price(
                    NewFloatingPriceModel.ofGroupedWithProratedMinimumPrice(
                        groupedWithProratedMinimumPrice
                    )
                )

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                groupedWithMeteredMinimumPrice:
                    NewFloatingPriceModel.NewFloatingGroupedWithMeteredMinimumPrice
            ) =
                price(
                    NewFloatingPriceModel.ofGroupedWithMeteredMinimumPrice(
                        groupedWithMeteredMinimumPrice
                    )
                )

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                matrixWithDisplayNamePrice:
                    NewFloatingPriceModel.NewFloatingMatrixWithDisplayNamePrice
            ) =
                price(
                    NewFloatingPriceModel.ofMatrixWithDisplayNamePrice(matrixWithDisplayNamePrice)
                )

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                bulkWithProrationPrice: NewFloatingPriceModel.NewFloatingBulkWithProrationPrice
            ) = price(NewFloatingPriceModel.ofBulkWithProrationPrice(bulkWithProrationPrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                groupedTieredPackagePrice:
                    NewFloatingPriceModel.NewFloatingGroupedTieredPackagePrice
            ) = price(NewFloatingPriceModel.ofGroupedTieredPackagePrice(groupedTieredPackagePrice))

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                scalableMatrixWithUnitPricingPrice:
                    NewFloatingPriceModel.NewFloatingScalableMatrixWithUnitPricingPrice
            ) =
                price(
                    NewFloatingPriceModel.ofScalableMatrixWithUnitPricingPrice(
                        scalableMatrixWithUnitPricingPrice
                    )
                )

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                scalableMatrixWithTieredPricingPrice:
                    NewFloatingPriceModel.NewFloatingScalableMatrixWithTieredPricingPrice
            ) =
                price(
                    NewFloatingPriceModel.ofScalableMatrixWithTieredPricingPrice(
                        scalableMatrixWithTieredPricingPrice
                    )
                )

            /** The definition of a new price to create and add to the subscription. */
            fun price(
                cumulativeGroupedBulkPrice:
                    NewFloatingPriceModel.NewFloatingCumulativeGroupedBulkPrice
            ) =
                price(
                    NewFloatingPriceModel.ofCumulativeGroupedBulkPrice(cumulativeGroupedBulkPrice)
                )

            /** The id of the price to add to the subscription. */
            fun priceId(priceId: String?) = priceId(JsonField.ofNullable(priceId))

            /** The id of the price to add to the subscription. */
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
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
             */
            fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
                this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
            }

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
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
                    additionalProperties.toImmutable(),
                )
        }

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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }
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
                        ) {}
                    }
                )
                validated = true
            }

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

                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return StartDate(dateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return StartDate(billingCycleRelative = it, _json = json)
                    }

                    return StartDate(_json = json)
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
            private val amountDiscountCreationParams: AmountDiscountCreationParams? = null,
            private val percentageDiscountCreationParams: PercentageDiscountCreationParams? = null,
            private val usageDiscountCreationParams: UsageDiscountCreationParams? = null,
            private val _json: JsonValue? = null,
        ) {

            fun amountDiscountCreationParams(): AmountDiscountCreationParams? =
                amountDiscountCreationParams

            fun percentageDiscountCreationParams(): PercentageDiscountCreationParams? =
                percentageDiscountCreationParams

            fun usageDiscountCreationParams(): UsageDiscountCreationParams? =
                usageDiscountCreationParams

            fun isAmountDiscountCreationParams(): Boolean = amountDiscountCreationParams != null

            fun isPercentageDiscountCreationParams(): Boolean =
                percentageDiscountCreationParams != null

            fun isUsageDiscountCreationParams(): Boolean = usageDiscountCreationParams != null

            fun asAmountDiscountCreationParams(): AmountDiscountCreationParams =
                amountDiscountCreationParams.getOrThrow("amountDiscountCreationParams")

            fun asPercentageDiscountCreationParams(): PercentageDiscountCreationParams =
                percentageDiscountCreationParams.getOrThrow("percentageDiscountCreationParams")

            fun asUsageDiscountCreationParams(): UsageDiscountCreationParams =
                usageDiscountCreationParams.getOrThrow("usageDiscountCreationParams")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    amountDiscountCreationParams != null ->
                        visitor.visitAmountDiscountCreationParams(amountDiscountCreationParams)
                    percentageDiscountCreationParams != null ->
                        visitor.visitPercentageDiscountCreationParams(
                            percentageDiscountCreationParams
                        )
                    usageDiscountCreationParams != null ->
                        visitor.visitUsageDiscountCreationParams(usageDiscountCreationParams)
                    else -> visitor.unknown(_json)
                }
            }

            private var validated: Boolean = false

            fun validate(): Discount = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitAmountDiscountCreationParams(
                            amountDiscountCreationParams: AmountDiscountCreationParams
                        ) {
                            amountDiscountCreationParams.validate()
                        }

                        override fun visitPercentageDiscountCreationParams(
                            percentageDiscountCreationParams: PercentageDiscountCreationParams
                        ) {
                            percentageDiscountCreationParams.validate()
                        }

                        override fun visitUsageDiscountCreationParams(
                            usageDiscountCreationParams: UsageDiscountCreationParams
                        ) {
                            usageDiscountCreationParams.validate()
                        }
                    }
                )
                validated = true
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Discount && amountDiscountCreationParams == other.amountDiscountCreationParams && percentageDiscountCreationParams == other.percentageDiscountCreationParams && usageDiscountCreationParams == other.usageDiscountCreationParams /* spotless:on */
            }

            override fun hashCode(): Int = /* spotless:off */ Objects.hash(amountDiscountCreationParams, percentageDiscountCreationParams, usageDiscountCreationParams) /* spotless:on */

            override fun toString(): String =
                when {
                    amountDiscountCreationParams != null ->
                        "Discount{amountDiscountCreationParams=$amountDiscountCreationParams}"
                    percentageDiscountCreationParams != null ->
                        "Discount{percentageDiscountCreationParams=$percentageDiscountCreationParams}"
                    usageDiscountCreationParams != null ->
                        "Discount{usageDiscountCreationParams=$usageDiscountCreationParams}"
                    _json != null -> "Discount{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Discount")
                }

            companion object {

                fun ofAmountDiscountCreationParams(
                    amountDiscountCreationParams: AmountDiscountCreationParams
                ) = Discount(amountDiscountCreationParams = amountDiscountCreationParams)

                fun ofPercentageDiscountCreationParams(
                    percentageDiscountCreationParams: PercentageDiscountCreationParams
                ) = Discount(percentageDiscountCreationParams = percentageDiscountCreationParams)

                fun ofUsageDiscountCreationParams(
                    usageDiscountCreationParams: UsageDiscountCreationParams
                ) = Discount(usageDiscountCreationParams = usageDiscountCreationParams)
            }

            /**
             * An interface that defines how to map each variant of [Discount] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitAmountDiscountCreationParams(
                    amountDiscountCreationParams: AmountDiscountCreationParams
                ): T

                fun visitPercentageDiscountCreationParams(
                    percentageDiscountCreationParams: PercentageDiscountCreationParams
                ): T

                fun visitUsageDiscountCreationParams(
                    usageDiscountCreationParams: UsageDiscountCreationParams
                ): T

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
                            tryDeserialize(node, jacksonTypeRef<AmountDiscountCreationParams>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Discount(amountDiscountCreationParams = it, _json = json)
                                }
                        }
                        "percentage" -> {
                            tryDeserialize(
                                    node,
                                    jacksonTypeRef<PercentageDiscountCreationParams>(),
                                ) {
                                    it.validate()
                                }
                                ?.let {
                                    return Discount(
                                        percentageDiscountCreationParams = it,
                                        _json = json,
                                    )
                                }
                        }
                        "usage" -> {
                            tryDeserialize(node, jacksonTypeRef<UsageDiscountCreationParams>()) {
                                    it.validate()
                                }
                                ?.let {
                                    return Discount(usageDiscountCreationParams = it, _json = json)
                                }
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
                        value.amountDiscountCreationParams != null ->
                            generator.writeObject(value.amountDiscountCreationParams)
                        value.percentageDiscountCreationParams != null ->
                            generator.writeObject(value.percentageDiscountCreationParams)
                        value.usageDiscountCreationParams != null ->
                            generator.writeObject(value.usageDiscountCreationParams)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Discount")
                    }
                }
            }

            @NoAutoDetect
            class AmountDiscountCreationParams
            @JsonCreator
            private constructor(
                @JsonProperty("amount_discount")
                @ExcludeMissing
                private val amountDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("discount_type")
                @ExcludeMissing
                private val discountType: JsonField<DiscountType> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Only available if discount_type is `amount`. */
                fun amountDiscount(): Double = amountDiscount.getRequired("amount_discount")

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /** Only available if discount_type is `amount`. */
                @JsonProperty("amount_discount")
                @ExcludeMissing
                fun _amountDiscount(): JsonField<Double> = amountDiscount

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun _discountType(): JsonField<DiscountType> = discountType

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AmountDiscountCreationParams = apply {
                    if (validated) {
                        return@apply
                    }

                    amountDiscount()
                    discountType()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [AmountDiscountCreationParams].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amountDiscount()
                     * .discountType()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [AmountDiscountCreationParams]. */
                class Builder internal constructor() {

                    private var amountDiscount: JsonField<Double>? = null
                    private var discountType: JsonField<DiscountType>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(amountDiscountCreationParams: AmountDiscountCreationParams) =
                        apply {
                            amountDiscount = amountDiscountCreationParams.amountDiscount
                            discountType = amountDiscountCreationParams.discountType
                            additionalProperties =
                                amountDiscountCreationParams.additionalProperties.toMutableMap()
                        }

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: Double) =
                        amountDiscount(JsonField.of(amountDiscount))

                    /** Only available if discount_type is `amount`. */
                    fun amountDiscount(amountDiscount: JsonField<Double>) = apply {
                        this.amountDiscount = amountDiscount
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    fun discountType(discountType: JsonField<DiscountType>) = apply {
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

                    fun build(): AmountDiscountCreationParams =
                        AmountDiscountCreationParams(
                            checkRequired("amountDiscount", amountDiscount),
                            checkRequired("discountType", discountType),
                            additionalProperties.toImmutable(),
                        )
                }

                class DiscountType
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

                        val AMOUNT = of("amount")

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    /** An enum containing [DiscountType]'s known values. */
                    enum class Known {
                        AMOUNT
                    }

                    /**
                     * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [DiscountType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        AMOUNT,
                        /**
                         * An enum member indicating that [DiscountType] was instantiated with an
                         * unknown value.
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
                            AMOUNT -> Value.AMOUNT
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
                            AMOUNT -> Known.AMOUNT
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AmountDiscountCreationParams && amountDiscount == other.amountDiscount && discountType == other.discountType && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amountDiscount, discountType, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AmountDiscountCreationParams{amountDiscount=$amountDiscount, discountType=$discountType, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class PercentageDiscountCreationParams
            @JsonCreator
            private constructor(
                @JsonProperty("discount_type")
                @ExcludeMissing
                private val discountType: JsonField<DiscountType> = JsonMissing.of(),
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                private val percentageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                fun percentageDiscount(): Double =
                    percentageDiscount.getRequired("percentage_discount")

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun _discountType(): JsonField<DiscountType> = discountType

                /**
                 * Only available if discount_type is `percentage`. This is a number between 0
                 * and 1.
                 */
                @JsonProperty("percentage_discount")
                @ExcludeMissing
                fun _percentageDiscount(): JsonField<Double> = percentageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): PercentageDiscountCreationParams = apply {
                    if (validated) {
                        return@apply
                    }

                    discountType()
                    percentageDiscount()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PercentageDiscountCreationParams].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .discountType()
                     * .percentageDiscount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [PercentageDiscountCreationParams]. */
                class Builder internal constructor() {

                    private var discountType: JsonField<DiscountType>? = null
                    private var percentageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(
                        percentageDiscountCreationParams: PercentageDiscountCreationParams
                    ) = apply {
                        discountType = percentageDiscountCreationParams.discountType
                        percentageDiscount = percentageDiscountCreationParams.percentageDiscount
                        additionalProperties =
                            percentageDiscountCreationParams.additionalProperties.toMutableMap()
                    }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
                     */
                    fun percentageDiscount(percentageDiscount: Double) =
                        percentageDiscount(JsonField.of(percentageDiscount))

                    /**
                     * Only available if discount_type is `percentage`. This is a number between 0
                     * and 1.
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

                    fun build(): PercentageDiscountCreationParams =
                        PercentageDiscountCreationParams(
                            checkRequired("discountType", discountType),
                            checkRequired("percentageDiscount", percentageDiscount),
                            additionalProperties.toImmutable(),
                        )
                }

                class DiscountType
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

                        val PERCENTAGE = of("percentage")

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    /** An enum containing [DiscountType]'s known values. */
                    enum class Known {
                        PERCENTAGE
                    }

                    /**
                     * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [DiscountType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PERCENTAGE,
                        /**
                         * An enum member indicating that [DiscountType] was instantiated with an
                         * unknown value.
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
                            PERCENTAGE -> Value.PERCENTAGE
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
                            PERCENTAGE -> Known.PERCENTAGE
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PercentageDiscountCreationParams && discountType == other.discountType && percentageDiscount == other.percentageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(discountType, percentageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PercentageDiscountCreationParams{discountType=$discountType, percentageDiscount=$percentageDiscount, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class UsageDiscountCreationParams
            @JsonCreator
            private constructor(
                @JsonProperty("discount_type")
                @ExcludeMissing
                private val discountType: JsonField<DiscountType> = JsonMissing.of(),
                @JsonProperty("usage_discount")
                @ExcludeMissing
                private val usageDiscount: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun discountType(): DiscountType = discountType.getRequired("discount_type")

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for.
                 */
                fun usageDiscount(): Double = usageDiscount.getRequired("usage_discount")

                @JsonProperty("discount_type")
                @ExcludeMissing
                fun _discountType(): JsonField<DiscountType> = discountType

                /**
                 * Only available if discount_type is `usage`. Number of usage units that this
                 * discount is for.
                 */
                @JsonProperty("usage_discount")
                @ExcludeMissing
                fun _usageDiscount(): JsonField<Double> = usageDiscount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): UsageDiscountCreationParams = apply {
                    if (validated) {
                        return@apply
                    }

                    discountType()
                    usageDiscount()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [UsageDiscountCreationParams].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .discountType()
                     * .usageDiscount()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [UsageDiscountCreationParams]. */
                class Builder internal constructor() {

                    private var discountType: JsonField<DiscountType>? = null
                    private var usageDiscount: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usageDiscountCreationParams: UsageDiscountCreationParams) =
                        apply {
                            discountType = usageDiscountCreationParams.discountType
                            usageDiscount = usageDiscountCreationParams.usageDiscount
                            additionalProperties =
                                usageDiscountCreationParams.additionalProperties.toMutableMap()
                        }

                    fun discountType(discountType: DiscountType) =
                        discountType(JsonField.of(discountType))

                    fun discountType(discountType: JsonField<DiscountType>) = apply {
                        this.discountType = discountType
                    }

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for.
                     */
                    fun usageDiscount(usageDiscount: Double) =
                        usageDiscount(JsonField.of(usageDiscount))

                    /**
                     * Only available if discount_type is `usage`. Number of usage units that this
                     * discount is for.
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

                    fun build(): UsageDiscountCreationParams =
                        UsageDiscountCreationParams(
                            checkRequired("discountType", discountType),
                            checkRequired("usageDiscount", usageDiscount),
                            additionalProperties.toImmutable(),
                        )
                }

                class DiscountType
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

                        val USAGE = of("usage")

                        fun of(value: String) = DiscountType(JsonField.of(value))
                    }

                    /** An enum containing [DiscountType]'s known values. */
                    enum class Known {
                        USAGE
                    }

                    /**
                     * An enum containing [DiscountType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [DiscountType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USAGE,
                        /**
                         * An enum member indicating that [DiscountType] was instantiated with an
                         * unknown value.
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
                            USAGE -> Value.USAGE
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
                            USAGE -> Known.USAGE
                            else -> throw OrbInvalidDataException("Unknown DiscountType: $value")
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is DiscountType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is UsageDiscountCreationParams && discountType == other.discountType && usageDiscount == other.usageDiscount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(discountType, usageDiscount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "UsageDiscountCreationParams{discountType=$discountType, usageDiscount=$usageDiscount, additionalProperties=$additionalProperties}"
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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }
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
                        ) {}
                    }
                )
                validated = true
            }

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

                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return EndDate(dateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return EndDate(billingCycleRelative = it, _json = json)
                    }

                    return EndDate(_json = json)
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

            return /* spotless:off */ other is Add && startDate == other.startDate && allocationPrice == other.allocationPrice && discounts == other.discounts && endDate == other.endDate && externalPriceId == other.externalPriceId && filter == other.filter && fixedFeeQuantityTransitions == other.fixedFeeQuantityTransitions && maximumAmount == other.maximumAmount && minimumAmount == other.minimumAmount && price == other.price && priceId == other.priceId && usageCustomerIds == other.usageCustomerIds && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(startDate, allocationPrice, discounts, endDate, externalPriceId, filter, fixedFeeQuantityTransitions, maximumAmount, minimumAmount, price, priceId, usageCustomerIds, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Add{startDate=$startDate, allocationPrice=$allocationPrice, discounts=$discounts, endDate=$endDate, externalPriceId=$externalPriceId, filter=$filter, fixedFeeQuantityTransitions=$fixedFeeQuantityTransitions, maximumAmount=$maximumAmount, minimumAmount=$minimumAmount, price=$price, priceId=$priceId, usageCustomerIds=$usageCustomerIds, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class AddAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment")
        @ExcludeMissing
        private val adjustment: JsonField<NewAdjustmentModel> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<StartDate> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<EndDate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The definition of a new adjustment to create and add to the subscription. */
        fun adjustment(): NewAdjustmentModel = adjustment.getRequired("adjustment")

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription.
         */
        fun startDate(): StartDate = startDate.getRequired("start_date")

        /**
         * The end date of the adjustment interval. This is the date that the adjustment will stop
         * affecting prices on the subscription.
         */
        fun endDate(): EndDate? = endDate.getNullable("end_date")

        /** The definition of a new adjustment to create and add to the subscription. */
        @JsonProperty("adjustment")
        @ExcludeMissing
        fun _adjustment(): JsonField<NewAdjustmentModel> = adjustment

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

        /**
         * The end date of the adjustment interval. This is the date that the adjustment will stop
         * affecting prices on the subscription.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<EndDate> = endDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            private var adjustment: JsonField<NewAdjustmentModel>? = null
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
            fun adjustment(adjustment: NewAdjustmentModel) = adjustment(JsonField.of(adjustment))

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(adjustment: JsonField<NewAdjustmentModel>) = apply {
                this.adjustment = adjustment
            }

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(percentageDiscount: NewAdjustmentModel.NewPercentageDiscount) =
                adjustment(NewAdjustmentModel.ofPercentageDiscount(percentageDiscount))

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(usageDiscount: NewAdjustmentModel.NewUsageDiscount) =
                adjustment(NewAdjustmentModel.ofUsageDiscount(usageDiscount))

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(amountDiscount: NewAdjustmentModel.NewAmountDiscount) =
                adjustment(NewAdjustmentModel.ofAmountDiscount(amountDiscount))

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(minimum: NewAdjustmentModel.NewMinimum) =
                adjustment(NewAdjustmentModel.ofMinimum(minimum))

            /** The definition of a new adjustment to create and add to the subscription. */
            fun adjustment(maximum: NewAdjustmentModel.NewMaximum) =
                adjustment(NewAdjustmentModel.ofMaximum(maximum))

            /**
             * The start date of the adjustment interval. This is the date that the adjustment will
             * start affecting prices on the subscription.
             */
            fun startDate(startDate: StartDate) = startDate(JsonField.of(startDate))

            /**
             * The start date of the adjustment interval. This is the date that the adjustment will
             * start affecting prices on the subscription.
             */
            fun startDate(startDate: JsonField<StartDate>) = apply { this.startDate = startDate }

            /**
             * The start date of the adjustment interval. This is the date that the adjustment will
             * start affecting prices on the subscription.
             */
            fun startDate(dateTime: OffsetDateTime) = startDate(StartDate.ofDateTime(dateTime))

            /**
             * The start date of the adjustment interval. This is the date that the adjustment will
             * start affecting prices on the subscription.
             */
            fun startDate(billingCycleRelative: BillingCycleRelativeDate) =
                startDate(StartDate.ofBillingCycleRelative(billingCycleRelative))

            /**
             * The end date of the adjustment interval. This is the date that the adjustment will
             * stop affecting prices on the subscription.
             */
            fun endDate(endDate: EndDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * The end date of the adjustment interval. This is the date that the adjustment will
             * stop affecting prices on the subscription.
             */
            fun endDate(endDate: JsonField<EndDate>) = apply { this.endDate = endDate }

            /**
             * The end date of the adjustment interval. This is the date that the adjustment will
             * stop affecting prices on the subscription.
             */
            fun endDate(dateTime: OffsetDateTime) = endDate(EndDate.ofDateTime(dateTime))

            /**
             * The end date of the adjustment interval. This is the date that the adjustment will
             * stop affecting prices on the subscription.
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

            fun build(): AddAdjustment =
                AddAdjustment(
                    checkRequired("adjustment", adjustment),
                    checkRequired("startDate", startDate),
                    endDate,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The start date of the adjustment interval. This is the date that the adjustment will
         * start affecting prices on the subscription.
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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }
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
                        ) {}
                    }
                )
                validated = true
            }

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

                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return StartDate(dateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return StartDate(billingCycleRelative = it, _json = json)
                    }

                    return StartDate(_json = json)
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
         * affecting prices on the subscription.
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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }
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
                        ) {}
                    }
                )
                validated = true
            }

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

                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return EndDate(dateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return EndDate(billingCycleRelative = it, _json = json)
                    }

                    return EndDate(_json = json)
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

    @NoAutoDetect
    class Edit
    @JsonCreator
    private constructor(
        @JsonProperty("price_interval_id")
        @ExcludeMissing
        private val priceIntervalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        private val billingCycleDay: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<EndDate> = JsonMissing.of(),
        @JsonProperty("filter")
        @ExcludeMissing
        private val filter: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        private val fixedFeeQuantityTransitions:
            JsonField<List<PriceIntervalFixedFeeQuantityTransitionModel>> =
            JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<StartDate> = JsonMissing.of(),
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        private val usageCustomerIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The id of the price interval to edit. */
        fun priceIntervalId(): String = priceIntervalId.getRequired("price_interval_id")

        /**
         * The updated billing cycle day for this price interval. If not specified, the billing
         * cycle day will not be updated. Note that overlapping price intervals must have the same
         * billing cycle day.
         */
        fun billingCycleDay(): Long? = billingCycleDay.getNullable("billing_cycle_day")

        /**
         * The updated end date of this price interval. If not specified, the start date will not be
         * updated.
         */
        fun endDate(): EndDate? = endDate.getNullable("end_date")

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        fun filter(): String? = filter.getNullable("filter")

        /**
         * A list of fixed fee quantity transitions to use for this price interval. Note that this
         * list will overwrite all existing fixed fee quantity transitions on the price interval.
         */
        fun fixedFeeQuantityTransitions(): List<PriceIntervalFixedFeeQuantityTransitionModel>? =
            fixedFeeQuantityTransitions.getNullable("fixed_fee_quantity_transitions")

        /**
         * The updated start date of this price interval. If not specified, the start date will not
         * be updated.
         */
        fun startDate(): StartDate? = startDate.getNullable("start_date")

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        fun usageCustomerIds(): List<String>? = usageCustomerIds.getNullable("usage_customer_ids")

        /** The id of the price interval to edit. */
        @JsonProperty("price_interval_id")
        @ExcludeMissing
        fun _priceIntervalId(): JsonField<String> = priceIntervalId

        /**
         * The updated billing cycle day for this price interval. If not specified, the billing
         * cycle day will not be updated. Note that overlapping price intervals must have the same
         * billing cycle day.
         */
        @JsonProperty("billing_cycle_day")
        @ExcludeMissing
        fun _billingCycleDay(): JsonField<Long> = billingCycleDay

        /**
         * The updated end date of this price interval. If not specified, the start date will not be
         * updated.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<EndDate> = endDate

        /**
         * An additional filter to apply to usage queries. This filter must be expressed as a
         * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
         * null, usage queries will not include any additional filter.
         */
        @JsonProperty("filter") @ExcludeMissing fun _filter(): JsonField<String> = filter

        /**
         * A list of fixed fee quantity transitions to use for this price interval. Note that this
         * list will overwrite all existing fixed fee quantity transitions on the price interval.
         */
        @JsonProperty("fixed_fee_quantity_transitions")
        @ExcludeMissing
        fun _fixedFeeQuantityTransitions():
            JsonField<List<PriceIntervalFixedFeeQuantityTransitionModel>> =
            fixedFeeQuantityTransitions

        /**
         * The updated start date of this price interval. If not specified, the start date will not
         * be updated.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

        /**
         * A list of customer IDs whose usage events will be aggregated and billed under this
         * subscription. By default, a subscription only considers usage events associated with its
         * attached customer's customer_id. When usage_customer_ids is provided, the subscription
         * includes usage events from the specified customers only. Provided usage_customer_ids must
         * be either the customer for this subscription itself, or any of that customer's children.
         */
        @JsonProperty("usage_customer_ids")
        @ExcludeMissing
        fun _usageCustomerIds(): JsonField<List<String>> = usageCustomerIds

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                JsonField<MutableList<PriceIntervalFixedFeeQuantityTransitionModel>>? =
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

            /** The id of the price interval to edit. */
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
             * The updated billing cycle day for this price interval. If not specified, the billing
             * cycle day will not be updated. Note that overlapping price intervals must have the
             * same billing cycle day.
             */
            fun billingCycleDay(billingCycleDay: Long) = billingCycleDay(billingCycleDay as Long?)

            /**
             * The updated billing cycle day for this price interval. If not specified, the billing
             * cycle day will not be updated. Note that overlapping price intervals must have the
             * same billing cycle day.
             */
            fun billingCycleDay(billingCycleDay: JsonField<Long>) = apply {
                this.billingCycleDay = billingCycleDay
            }

            /**
             * The updated end date of this price interval. If not specified, the start date will
             * not be updated.
             */
            fun endDate(endDate: EndDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * The updated end date of this price interval. If not specified, the start date will
             * not be updated.
             */
            fun endDate(endDate: JsonField<EndDate>) = apply { this.endDate = endDate }

            /**
             * The updated end date of this price interval. If not specified, the start date will
             * not be updated.
             */
            fun endDate(dateTime: OffsetDateTime) = endDate(EndDate.ofDateTime(dateTime))

            /**
             * The updated end date of this price interval. If not specified, the start date will
             * not be updated.
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
             * An additional filter to apply to usage queries. This filter must be expressed as a
             * boolean [computed property](/extensibility/advanced-metrics#computed-properties). If
             * null, usage queries will not include any additional filter.
             */
            fun filter(filter: JsonField<String>) = apply { this.filter = filter }

            /**
             * A list of fixed fee quantity transitions to use for this price interval. Note that
             * this list will overwrite all existing fixed fee quantity transitions on the price
             * interval.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions: List<PriceIntervalFixedFeeQuantityTransitionModel>?
            ) = fixedFeeQuantityTransitions(JsonField.ofNullable(fixedFeeQuantityTransitions))

            /**
             * A list of fixed fee quantity transitions to use for this price interval. Note that
             * this list will overwrite all existing fixed fee quantity transitions on the price
             * interval.
             */
            fun fixedFeeQuantityTransitions(
                fixedFeeQuantityTransitions:
                    JsonField<List<PriceIntervalFixedFeeQuantityTransitionModel>>
            ) = apply {
                this.fixedFeeQuantityTransitions =
                    fixedFeeQuantityTransitions.map { it.toMutableList() }
            }

            /**
             * A list of fixed fee quantity transitions to use for this price interval. Note that
             * this list will overwrite all existing fixed fee quantity transitions on the price
             * interval.
             */
            fun addFixedFeeQuantityTransition(
                fixedFeeQuantityTransition: PriceIntervalFixedFeeQuantityTransitionModel
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
             * The updated start date of this price interval. If not specified, the start date will
             * not be updated.
             */
            fun startDate(startDate: JsonField<StartDate>) = apply { this.startDate = startDate }

            /**
             * The updated start date of this price interval. If not specified, the start date will
             * not be updated.
             */
            fun startDate(dateTime: OffsetDateTime) = startDate(StartDate.ofDateTime(dateTime))

            /**
             * The updated start date of this price interval. If not specified, the start date will
             * not be updated.
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
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
             */
            fun usageCustomerIds(usageCustomerIds: JsonField<List<String>>) = apply {
                this.usageCustomerIds = usageCustomerIds.map { it.toMutableList() }
            }

            /**
             * A list of customer IDs whose usage events will be aggregated and billed under this
             * subscription. By default, a subscription only considers usage events associated with
             * its attached customer's customer_id. When usage_customer_ids is provided, the
             * subscription includes usage events from the specified customers only. Provided
             * usage_customer_ids must be either the customer for this subscription itself, or any
             * of that customer's children.
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

            fun build(): Edit =
                Edit(
                    checkRequired("priceIntervalId", priceIntervalId),
                    billingCycleDay,
                    endDate,
                    filter,
                    (fixedFeeQuantityTransitions ?: JsonMissing.of()).map { it.toImmutable() },
                    startDate,
                    (usageCustomerIds ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The updated end date of this price interval. If not specified, the start date will not be
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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }
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
                        ) {}
                    }
                )
                validated = true
            }

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

                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return EndDate(dateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return EndDate(billingCycleRelative = it, _json = json)
                    }

                    return EndDate(_json = json)
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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }
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
                        ) {}
                    }
                )
                validated = true
            }

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

                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return StartDate(dateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return StartDate(billingCycleRelative = it, _json = json)
                    }

                    return StartDate(_json = json)
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

    @NoAutoDetect
    class EditAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("adjustment_interval_id")
        @ExcludeMissing
        private val adjustmentIntervalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("end_date")
        @ExcludeMissing
        private val endDate: JsonField<EndDate> = JsonMissing.of(),
        @JsonProperty("start_date")
        @ExcludeMissing
        private val startDate: JsonField<StartDate> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The id of the adjustment interval to edit. */
        fun adjustmentIntervalId(): String =
            adjustmentIntervalId.getRequired("adjustment_interval_id")

        /**
         * The updated end date of this adjustment interval. If not specified, the start date will
         * not be updated.
         */
        fun endDate(): EndDate? = endDate.getNullable("end_date")

        /**
         * The updated start date of this adjustment interval. If not specified, the start date will
         * not be updated.
         */
        fun startDate(): StartDate? = startDate.getNullable("start_date")

        /** The id of the adjustment interval to edit. */
        @JsonProperty("adjustment_interval_id")
        @ExcludeMissing
        fun _adjustmentIntervalId(): JsonField<String> = adjustmentIntervalId

        /**
         * The updated end date of this adjustment interval. If not specified, the start date will
         * not be updated.
         */
        @JsonProperty("end_date") @ExcludeMissing fun _endDate(): JsonField<EndDate> = endDate

        /**
         * The updated start date of this adjustment interval. If not specified, the start date will
         * not be updated.
         */
        @JsonProperty("start_date")
        @ExcludeMissing
        fun _startDate(): JsonField<StartDate> = startDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            /** The id of the adjustment interval to edit. */
            fun adjustmentIntervalId(adjustmentIntervalId: JsonField<String>) = apply {
                this.adjustmentIntervalId = adjustmentIntervalId
            }

            /**
             * The updated end date of this adjustment interval. If not specified, the start date
             * will not be updated.
             */
            fun endDate(endDate: EndDate?) = endDate(JsonField.ofNullable(endDate))

            /**
             * The updated end date of this adjustment interval. If not specified, the start date
             * will not be updated.
             */
            fun endDate(endDate: JsonField<EndDate>) = apply { this.endDate = endDate }

            /**
             * The updated end date of this adjustment interval. If not specified, the start date
             * will not be updated.
             */
            fun endDate(dateTime: OffsetDateTime) = endDate(EndDate.ofDateTime(dateTime))

            /**
             * The updated end date of this adjustment interval. If not specified, the start date
             * will not be updated.
             */
            fun endDate(billingCycleRelative: BillingCycleRelativeDate) =
                endDate(EndDate.ofBillingCycleRelative(billingCycleRelative))

            /**
             * The updated start date of this adjustment interval. If not specified, the start date
             * will not be updated.
             */
            fun startDate(startDate: StartDate) = startDate(JsonField.of(startDate))

            /**
             * The updated start date of this adjustment interval. If not specified, the start date
             * will not be updated.
             */
            fun startDate(startDate: JsonField<StartDate>) = apply { this.startDate = startDate }

            /**
             * The updated start date of this adjustment interval. If not specified, the start date
             * will not be updated.
             */
            fun startDate(dateTime: OffsetDateTime) = startDate(StartDate.ofDateTime(dateTime))

            /**
             * The updated start date of this adjustment interval. If not specified, the start date
             * will not be updated.
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

            fun build(): EditAdjustment =
                EditAdjustment(
                    checkRequired("adjustmentIntervalId", adjustmentIntervalId),
                    endDate,
                    startDate,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The updated end date of this adjustment interval. If not specified, the start date will
         * not be updated.
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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }
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
                        ) {}
                    }
                )
                validated = true
            }

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

                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return EndDate(dateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return EndDate(billingCycleRelative = it, _json = json)
                    }

                    return EndDate(_json = json)
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

            fun <T> accept(visitor: Visitor<T>): T {
                return when {
                    dateTime != null -> visitor.visitDateTime(dateTime)
                    billingCycleRelative != null ->
                        visitor.visitBillingCycleRelative(billingCycleRelative)
                    else -> visitor.unknown(_json)
                }
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
                        ) {}
                    }
                )
                validated = true
            }

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

                    tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                        return StartDate(dateTime = it, _json = json)
                    }
                    tryDeserialize(node, jacksonTypeRef<BillingCycleRelativeDate>())?.let {
                        return StartDate(billingCycleRelative = it, _json = json)
                    }

                    return StartDate(_json = json)
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
