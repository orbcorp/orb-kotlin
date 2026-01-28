// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.withorb.api.core.ExcludeMissing
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.Params
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Apply a subscription change to perform the intended action. If a positive amount is passed with a
 * request to this endpoint, any eligible invoices that were created will be issued immediately if
 * they only contain in-advance fees.
 */
class SubscriptionChangeApplyParams
private constructor(
    private val subscriptionChangeId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionChangeId(): String? = subscriptionChangeId

    /**
     * Description to apply to the balance transaction representing this credit.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * Mark all pending invoices that are payable as paid. If amount is also provided, mark as paid
     * and credit the difference to the customer's balance.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun markAsPaid(): Boolean? = body.markAsPaid()

    /**
     * An optional external ID to associate with the payment. Only applicable when mark_as_paid is
     * true.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentExternalId(): String? = body.paymentExternalId()

    /**
     * Optional notes about the payment. Only applicable when mark_as_paid is true.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentNotes(): String? = body.paymentNotes()

    /**
     * A date string to specify the date the payment was received. Only applicable when mark_as_paid
     * is true. If not provided, defaults to the current date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun paymentReceivedDate(): LocalDate? = body.paymentReceivedDate()

    /**
     * Amount already collected to apply to the customer's balance. If mark_as_paid is also
     * provided, credit the difference to the customer's balance.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun previouslyCollectedAmount(): String? = body.previouslyCollectedAmount()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [markAsPaid].
     *
     * Unlike [markAsPaid], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _markAsPaid(): JsonField<Boolean> = body._markAsPaid()

    /**
     * Returns the raw JSON value of [paymentExternalId].
     *
     * Unlike [paymentExternalId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _paymentExternalId(): JsonField<String> = body._paymentExternalId()

    /**
     * Returns the raw JSON value of [paymentNotes].
     *
     * Unlike [paymentNotes], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _paymentNotes(): JsonField<String> = body._paymentNotes()

    /**
     * Returns the raw JSON value of [paymentReceivedDate].
     *
     * Unlike [paymentReceivedDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _paymentReceivedDate(): JsonField<LocalDate> = body._paymentReceivedDate()

    /**
     * Returns the raw JSON value of [previouslyCollectedAmount].
     *
     * Unlike [previouslyCollectedAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _previouslyCollectedAmount(): JsonField<String> = body._previouslyCollectedAmount()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SubscriptionChangeApplyParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionChangeApplyParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionChangeApplyParams]. */
    class Builder internal constructor() {

        private var subscriptionChangeId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionChangeApplyParams: SubscriptionChangeApplyParams) = apply {
            subscriptionChangeId = subscriptionChangeApplyParams.subscriptionChangeId
            body = subscriptionChangeApplyParams.body.toBuilder()
            additionalHeaders = subscriptionChangeApplyParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionChangeApplyParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionChangeId(subscriptionChangeId: String?) = apply {
            this.subscriptionChangeId = subscriptionChangeId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [description]
         * - [markAsPaid]
         * - [paymentExternalId]
         * - [paymentNotes]
         * - [paymentReceivedDate]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Description to apply to the balance transaction representing this credit. */
        fun description(description: String?) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * Mark all pending invoices that are payable as paid. If amount is also provided, mark as
         * paid and credit the difference to the customer's balance.
         */
        fun markAsPaid(markAsPaid: Boolean?) = apply { body.markAsPaid(markAsPaid) }

        /**
         * Alias for [Builder.markAsPaid].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun markAsPaid(markAsPaid: Boolean) = markAsPaid(markAsPaid as Boolean?)

        /**
         * Sets [Builder.markAsPaid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.markAsPaid] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun markAsPaid(markAsPaid: JsonField<Boolean>) = apply { body.markAsPaid(markAsPaid) }

        /**
         * An optional external ID to associate with the payment. Only applicable when mark_as_paid
         * is true.
         */
        fun paymentExternalId(paymentExternalId: String?) = apply {
            body.paymentExternalId(paymentExternalId)
        }

        /**
         * Sets [Builder.paymentExternalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentExternalId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentExternalId(paymentExternalId: JsonField<String>) = apply {
            body.paymentExternalId(paymentExternalId)
        }

        /** Optional notes about the payment. Only applicable when mark_as_paid is true. */
        fun paymentNotes(paymentNotes: String?) = apply { body.paymentNotes(paymentNotes) }

        /**
         * Sets [Builder.paymentNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentNotes] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentNotes(paymentNotes: JsonField<String>) = apply {
            body.paymentNotes(paymentNotes)
        }

        /**
         * A date string to specify the date the payment was received. Only applicable when
         * mark_as_paid is true. If not provided, defaults to the current date.
         */
        fun paymentReceivedDate(paymentReceivedDate: LocalDate?) = apply {
            body.paymentReceivedDate(paymentReceivedDate)
        }

        /**
         * Sets [Builder.paymentReceivedDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentReceivedDate] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentReceivedDate(paymentReceivedDate: JsonField<LocalDate>) = apply {
            body.paymentReceivedDate(paymentReceivedDate)
        }

        /**
         * Amount already collected to apply to the customer's balance. If mark_as_paid is also
         * provided, credit the difference to the customer's balance.
         */
        fun previouslyCollectedAmount(previouslyCollectedAmount: String?) = apply {
            body.previouslyCollectedAmount(previouslyCollectedAmount)
        }

        /**
         * Sets [Builder.previouslyCollectedAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previouslyCollectedAmount] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun previouslyCollectedAmount(previouslyCollectedAmount: JsonField<String>) = apply {
            body.previouslyCollectedAmount(previouslyCollectedAmount)
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
         * Returns an immutable instance of [SubscriptionChangeApplyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionChangeApplyParams =
            SubscriptionChangeApplyParams(
                subscriptionChangeId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionChangeId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val description: JsonField<String>,
        private val markAsPaid: JsonField<Boolean>,
        private val paymentExternalId: JsonField<String>,
        private val paymentNotes: JsonField<String>,
        private val paymentReceivedDate: JsonField<LocalDate>,
        private val previouslyCollectedAmount: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mark_as_paid")
            @ExcludeMissing
            markAsPaid: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("payment_external_id")
            @ExcludeMissing
            paymentExternalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_notes")
            @ExcludeMissing
            paymentNotes: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_received_date")
            @ExcludeMissing
            paymentReceivedDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("previously_collected_amount")
            @ExcludeMissing
            previouslyCollectedAmount: JsonField<String> = JsonMissing.of(),
        ) : this(
            description,
            markAsPaid,
            paymentExternalId,
            paymentNotes,
            paymentReceivedDate,
            previouslyCollectedAmount,
            mutableMapOf(),
        )

        /**
         * Description to apply to the balance transaction representing this credit.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * Mark all pending invoices that are payable as paid. If amount is also provided, mark as
         * paid and credit the difference to the customer's balance.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun markAsPaid(): Boolean? = markAsPaid.getNullable("mark_as_paid")

        /**
         * An optional external ID to associate with the payment. Only applicable when mark_as_paid
         * is true.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentExternalId(): String? = paymentExternalId.getNullable("payment_external_id")

        /**
         * Optional notes about the payment. Only applicable when mark_as_paid is true.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentNotes(): String? = paymentNotes.getNullable("payment_notes")

        /**
         * A date string to specify the date the payment was received. Only applicable when
         * mark_as_paid is true. If not provided, defaults to the current date.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paymentReceivedDate(): LocalDate? =
            paymentReceivedDate.getNullable("payment_received_date")

        /**
         * Amount already collected to apply to the customer's balance. If mark_as_paid is also
         * provided, credit the difference to the customer's balance.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun previouslyCollectedAmount(): String? =
            previouslyCollectedAmount.getNullable("previously_collected_amount")

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [markAsPaid].
         *
         * Unlike [markAsPaid], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mark_as_paid")
        @ExcludeMissing
        fun _markAsPaid(): JsonField<Boolean> = markAsPaid

        /**
         * Returns the raw JSON value of [paymentExternalId].
         *
         * Unlike [paymentExternalId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_external_id")
        @ExcludeMissing
        fun _paymentExternalId(): JsonField<String> = paymentExternalId

        /**
         * Returns the raw JSON value of [paymentNotes].
         *
         * Unlike [paymentNotes], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_notes")
        @ExcludeMissing
        fun _paymentNotes(): JsonField<String> = paymentNotes

        /**
         * Returns the raw JSON value of [paymentReceivedDate].
         *
         * Unlike [paymentReceivedDate], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("payment_received_date")
        @ExcludeMissing
        fun _paymentReceivedDate(): JsonField<LocalDate> = paymentReceivedDate

        /**
         * Returns the raw JSON value of [previouslyCollectedAmount].
         *
         * Unlike [previouslyCollectedAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("previously_collected_amount")
        @ExcludeMissing
        fun _previouslyCollectedAmount(): JsonField<String> = previouslyCollectedAmount

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

            private var description: JsonField<String> = JsonMissing.of()
            private var markAsPaid: JsonField<Boolean> = JsonMissing.of()
            private var paymentExternalId: JsonField<String> = JsonMissing.of()
            private var paymentNotes: JsonField<String> = JsonMissing.of()
            private var paymentReceivedDate: JsonField<LocalDate> = JsonMissing.of()
            private var previouslyCollectedAmount: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                description = body.description
                markAsPaid = body.markAsPaid
                paymentExternalId = body.paymentExternalId
                paymentNotes = body.paymentNotes
                paymentReceivedDate = body.paymentReceivedDate
                previouslyCollectedAmount = body.previouslyCollectedAmount
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Description to apply to the balance transaction representing this credit. */
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
             * Mark all pending invoices that are payable as paid. If amount is also provided, mark
             * as paid and credit the difference to the customer's balance.
             */
            fun markAsPaid(markAsPaid: Boolean?) = markAsPaid(JsonField.ofNullable(markAsPaid))

            /**
             * Alias for [Builder.markAsPaid].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun markAsPaid(markAsPaid: Boolean) = markAsPaid(markAsPaid as Boolean?)

            /**
             * Sets [Builder.markAsPaid] to an arbitrary JSON value.
             *
             * You should usually call [Builder.markAsPaid] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun markAsPaid(markAsPaid: JsonField<Boolean>) = apply { this.markAsPaid = markAsPaid }

            /**
             * An optional external ID to associate with the payment. Only applicable when
             * mark_as_paid is true.
             */
            fun paymentExternalId(paymentExternalId: String?) =
                paymentExternalId(JsonField.ofNullable(paymentExternalId))

            /**
             * Sets [Builder.paymentExternalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentExternalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentExternalId(paymentExternalId: JsonField<String>) = apply {
                this.paymentExternalId = paymentExternalId
            }

            /** Optional notes about the payment. Only applicable when mark_as_paid is true. */
            fun paymentNotes(paymentNotes: String?) =
                paymentNotes(JsonField.ofNullable(paymentNotes))

            /**
             * Sets [Builder.paymentNotes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentNotes] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentNotes(paymentNotes: JsonField<String>) = apply {
                this.paymentNotes = paymentNotes
            }

            /**
             * A date string to specify the date the payment was received. Only applicable when
             * mark_as_paid is true. If not provided, defaults to the current date.
             */
            fun paymentReceivedDate(paymentReceivedDate: LocalDate?) =
                paymentReceivedDate(JsonField.ofNullable(paymentReceivedDate))

            /**
             * Sets [Builder.paymentReceivedDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentReceivedDate] with a well-typed [LocalDate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun paymentReceivedDate(paymentReceivedDate: JsonField<LocalDate>) = apply {
                this.paymentReceivedDate = paymentReceivedDate
            }

            /**
             * Amount already collected to apply to the customer's balance. If mark_as_paid is also
             * provided, credit the difference to the customer's balance.
             */
            fun previouslyCollectedAmount(previouslyCollectedAmount: String?) =
                previouslyCollectedAmount(JsonField.ofNullable(previouslyCollectedAmount))

            /**
             * Sets [Builder.previouslyCollectedAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.previouslyCollectedAmount] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun previouslyCollectedAmount(previouslyCollectedAmount: JsonField<String>) = apply {
                this.previouslyCollectedAmount = previouslyCollectedAmount
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
                    description,
                    markAsPaid,
                    paymentExternalId,
                    paymentNotes,
                    paymentReceivedDate,
                    previouslyCollectedAmount,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            description()
            markAsPaid()
            paymentExternalId()
            paymentNotes()
            paymentReceivedDate()
            previouslyCollectedAmount()
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
            (if (description.asKnown() == null) 0 else 1) +
                (if (markAsPaid.asKnown() == null) 0 else 1) +
                (if (paymentExternalId.asKnown() == null) 0 else 1) +
                (if (paymentNotes.asKnown() == null) 0 else 1) +
                (if (paymentReceivedDate.asKnown() == null) 0 else 1) +
                (if (previouslyCollectedAmount.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                description == other.description &&
                markAsPaid == other.markAsPaid &&
                paymentExternalId == other.paymentExternalId &&
                paymentNotes == other.paymentNotes &&
                paymentReceivedDate == other.paymentReceivedDate &&
                previouslyCollectedAmount == other.previouslyCollectedAmount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                description,
                markAsPaid,
                paymentExternalId,
                paymentNotes,
                paymentReceivedDate,
                previouslyCollectedAmount,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{description=$description, markAsPaid=$markAsPaid, paymentExternalId=$paymentExternalId, paymentNotes=$paymentNotes, paymentReceivedDate=$paymentReceivedDate, previouslyCollectedAmount=$previouslyCollectedAmount, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionChangeApplyParams &&
            subscriptionChangeId == other.subscriptionChangeId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionChangeId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionChangeApplyParams{subscriptionChangeId=$subscriptionChangeId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
