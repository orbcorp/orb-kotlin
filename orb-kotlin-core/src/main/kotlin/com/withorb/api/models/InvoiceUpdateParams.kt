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
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * This endpoint allows you to update the `metadata`, `net_terms`, `due_date`, and `invoice_date`
 * properties on an invoice. If you pass null for the metadata value, it will clear any existing
 * metadata for that invoice.
 *
 * `metadata` can be modified regardless of invoice state. `net_terms`, `due_date`, and
 * `invoice_date` can only be modified if the invoice is in a `draft` state. `invoice_date` can only
 * be modified for non-subscription invoices.
 */
class InvoiceUpdateParams
private constructor(
    private val invoiceId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun invoiceId(): String? = invoiceId

    /**
     * An optional custom due date for the invoice. If not set, the due date will be calculated
     * based on the `net_terms` value.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun dueDate(): DueDate? = body.dueDate()

    /**
     * The date of the invoice. Can only be modified for one-off draft invoices.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun invoiceDate(): InvoiceDate? = body.invoiceDate()

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun metadata(): Metadata? = body.metadata()

    /**
     * The net terms determines the due date of the invoice. Due date is calculated based on the
     * invoice or issuance date, depending on the account's configured due date calculation method.
     * A value of '0' here represents that the invoice is due on issue, whereas a value of '30'
     * represents that the customer has 30 days to pay the invoice. Do not set this field if you
     * want to set a custom due date.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the server
     *   responded with an unexpected value).
     */
    fun netTerms(): Long? = body.netTerms()

    /**
     * Returns the raw JSON value of [dueDate].
     *
     * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dueDate(): JsonField<DueDate> = body._dueDate()

    /**
     * Returns the raw JSON value of [invoiceDate].
     *
     * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _invoiceDate(): JsonField<InvoiceDate> = body._invoiceDate()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [netTerms].
     *
     * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _netTerms(): JsonField<Long> = body._netTerms()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): InvoiceUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [InvoiceUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [InvoiceUpdateParams]. */
    class Builder internal constructor() {

        private var invoiceId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(invoiceUpdateParams: InvoiceUpdateParams) = apply {
            invoiceId = invoiceUpdateParams.invoiceId
            body = invoiceUpdateParams.body.toBuilder()
            additionalHeaders = invoiceUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = invoiceUpdateParams.additionalQueryParams.toBuilder()
        }

        fun invoiceId(invoiceId: String?) = apply { this.invoiceId = invoiceId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [dueDate]
         * - [invoiceDate]
         * - [metadata]
         * - [netTerms]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * An optional custom due date for the invoice. If not set, the due date will be calculated
         * based on the `net_terms` value.
         */
        fun dueDate(dueDate: DueDate?) = apply { body.dueDate(dueDate) }

        /**
         * Sets [Builder.dueDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dueDate] with a well-typed [DueDate] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun dueDate(dueDate: JsonField<DueDate>) = apply { body.dueDate(dueDate) }

        /** Alias for calling [dueDate] with `DueDate.ofDate(date)`. */
        fun dueDate(date: LocalDate) = apply { body.dueDate(date) }

        /** Alias for calling [dueDate] with `DueDate.ofDateTime(dateTime)`. */
        fun dueDate(dateTime: OffsetDateTime) = apply { body.dueDate(dateTime) }

        /** The date of the invoice. Can only be modified for one-off draft invoices. */
        fun invoiceDate(invoiceDate: InvoiceDate?) = apply { body.invoiceDate(invoiceDate) }

        /**
         * Sets [Builder.invoiceDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceDate] with a well-typed [InvoiceDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invoiceDate(invoiceDate: JsonField<InvoiceDate>) = apply {
            body.invoiceDate(invoiceDate)
        }

        /** Alias for calling [invoiceDate] with `InvoiceDate.ofDate(date)`. */
        fun invoiceDate(date: LocalDate) = apply { body.invoiceDate(date) }

        /** Alias for calling [invoiceDate] with `InvoiceDate.ofDateTime(dateTime)`. */
        fun invoiceDate(dateTime: OffsetDateTime) = apply { body.invoiceDate(dateTime) }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * The net terms determines the due date of the invoice. Due date is calculated based on the
         * invoice or issuance date, depending on the account's configured due date calculation
         * method. A value of '0' here represents that the invoice is due on issue, whereas a value
         * of '30' represents that the customer has 30 days to pay the invoice. Do not set this
         * field if you want to set a custom due date.
         */
        fun netTerms(netTerms: Long?) = apply { body.netTerms(netTerms) }

        /**
         * Alias for [Builder.netTerms].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

        /**
         * Sets [Builder.netTerms] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netTerms] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netTerms(netTerms: JsonField<Long>) = apply { body.netTerms(netTerms) }

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
         * Returns an immutable instance of [InvoiceUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InvoiceUpdateParams =
            InvoiceUpdateParams(
                invoiceId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> invoiceId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val dueDate: JsonField<DueDate>,
        private val invoiceDate: JsonField<InvoiceDate>,
        private val metadata: JsonField<Metadata>,
        private val netTerms: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("due_date")
            @ExcludeMissing
            dueDate: JsonField<DueDate> = JsonMissing.of(),
            @JsonProperty("invoice_date")
            @ExcludeMissing
            invoiceDate: JsonField<InvoiceDate> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("net_terms") @ExcludeMissing netTerms: JsonField<Long> = JsonMissing.of(),
        ) : this(dueDate, invoiceDate, metadata, netTerms, mutableMapOf())

        /**
         * An optional custom due date for the invoice. If not set, the due date will be calculated
         * based on the `net_terms` value.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dueDate(): DueDate? = dueDate.getNullable("due_date")

        /**
         * The date of the invoice. Can only be modified for one-off draft invoices.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun invoiceDate(): InvoiceDate? = invoiceDate.getNullable("invoice_date")

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Metadata? = metadata.getNullable("metadata")

        /**
         * The net terms determines the due date of the invoice. Due date is calculated based on the
         * invoice or issuance date, depending on the account's configured due date calculation
         * method. A value of '0' here represents that the invoice is due on issue, whereas a value
         * of '30' represents that the customer has 30 days to pay the invoice. Do not set this
         * field if you want to set a custom due date.
         *
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun netTerms(): Long? = netTerms.getNullable("net_terms")

        /**
         * Returns the raw JSON value of [dueDate].
         *
         * Unlike [dueDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("due_date") @ExcludeMissing fun _dueDate(): JsonField<DueDate> = dueDate

        /**
         * Returns the raw JSON value of [invoiceDate].
         *
         * Unlike [invoiceDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_date")
        @ExcludeMissing
        fun _invoiceDate(): JsonField<InvoiceDate> = invoiceDate

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [netTerms].
         *
         * Unlike [netTerms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("net_terms") @ExcludeMissing fun _netTerms(): JsonField<Long> = netTerms

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

            private var dueDate: JsonField<DueDate> = JsonMissing.of()
            private var invoiceDate: JsonField<InvoiceDate> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var netTerms: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                dueDate = body.dueDate
                invoiceDate = body.invoiceDate
                metadata = body.metadata
                netTerms = body.netTerms
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * An optional custom due date for the invoice. If not set, the due date will be
             * calculated based on the `net_terms` value.
             */
            fun dueDate(dueDate: DueDate?) = dueDate(JsonField.ofNullable(dueDate))

            /**
             * Sets [Builder.dueDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dueDate] with a well-typed [DueDate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dueDate(dueDate: JsonField<DueDate>) = apply { this.dueDate = dueDate }

            /** Alias for calling [dueDate] with `DueDate.ofDate(date)`. */
            fun dueDate(date: LocalDate) = dueDate(DueDate.ofDate(date))

            /** Alias for calling [dueDate] with `DueDate.ofDateTime(dateTime)`. */
            fun dueDate(dateTime: OffsetDateTime) = dueDate(DueDate.ofDateTime(dateTime))

            /** The date of the invoice. Can only be modified for one-off draft invoices. */
            fun invoiceDate(invoiceDate: InvoiceDate?) =
                invoiceDate(JsonField.ofNullable(invoiceDate))

            /**
             * Sets [Builder.invoiceDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceDate] with a well-typed [InvoiceDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceDate(invoiceDate: JsonField<InvoiceDate>) = apply {
                this.invoiceDate = invoiceDate
            }

            /** Alias for calling [invoiceDate] with `InvoiceDate.ofDate(date)`. */
            fun invoiceDate(date: LocalDate) = invoiceDate(InvoiceDate.ofDate(date))

            /** Alias for calling [invoiceDate] with `InvoiceDate.ofDateTime(dateTime)`. */
            fun invoiceDate(dateTime: OffsetDateTime) =
                invoiceDate(InvoiceDate.ofDateTime(dateTime))

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * The net terms determines the due date of the invoice. Due date is calculated based on
             * the invoice or issuance date, depending on the account's configured due date
             * calculation method. A value of '0' here represents that the invoice is due on issue,
             * whereas a value of '30' represents that the customer has 30 days to pay the invoice.
             * Do not set this field if you want to set a custom due date.
             */
            fun netTerms(netTerms: Long?) = netTerms(JsonField.ofNullable(netTerms))

            /**
             * Alias for [Builder.netTerms].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun netTerms(netTerms: Long) = netTerms(netTerms as Long?)

            /**
             * Sets [Builder.netTerms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netTerms] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netTerms(netTerms: JsonField<Long>) = apply { this.netTerms = netTerms }

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
                Body(dueDate, invoiceDate, metadata, netTerms, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            dueDate()?.validate()
            invoiceDate()?.validate()
            metadata()?.validate()
            netTerms()
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
            (dueDate.asKnown()?.validity() ?: 0) +
                (invoiceDate.asKnown()?.validity() ?: 0) +
                (metadata.asKnown()?.validity() ?: 0) +
                (if (netTerms.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                dueDate == other.dueDate &&
                invoiceDate == other.invoiceDate &&
                metadata == other.metadata &&
                netTerms == other.netTerms &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(dueDate, invoiceDate, metadata, netTerms, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{dueDate=$dueDate, invoiceDate=$invoiceDate, metadata=$metadata, netTerms=$netTerms, additionalProperties=$additionalProperties}"
    }

    /**
     * An optional custom due date for the invoice. If not set, the due date will be calculated
     * based on the `net_terms` value.
     */
    @JsonDeserialize(using = DueDate.Deserializer::class)
    @JsonSerialize(using = DueDate.Serializer::class)
    class DueDate
    private constructor(
        private val date: LocalDate? = null,
        private val dateTime: OffsetDateTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun date(): LocalDate? = date

        fun dateTime(): OffsetDateTime? = dateTime

        fun isDate(): Boolean = date != null

        fun isDateTime(): Boolean = dateTime != null

        fun asDate(): LocalDate = date.getOrThrow("date")

        fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                date != null -> visitor.visitDate(date)
                dateTime != null -> visitor.visitDateTime(dateTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): DueDate = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDate(date: LocalDate) {}

                    override fun visitDateTime(dateTime: OffsetDateTime) {}
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
                    override fun visitDate(date: LocalDate) = 1

                    override fun visitDateTime(dateTime: OffsetDateTime) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DueDate && date == other.date && dateTime == other.dateTime
        }

        override fun hashCode(): Int = Objects.hash(date, dateTime)

        override fun toString(): String =
            when {
                date != null -> "DueDate{date=$date}"
                dateTime != null -> "DueDate{dateTime=$dateTime}"
                _json != null -> "DueDate{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid DueDate")
            }

        companion object {

            fun ofDate(date: LocalDate) = DueDate(date = date)

            fun ofDateTime(dateTime: OffsetDateTime) = DueDate(dateTime = dateTime)
        }

        /**
         * An interface that defines how to map each variant of [DueDate] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitDate(date: LocalDate): T

            fun visitDateTime(dateTime: OffsetDateTime): T

            /**
             * Maps an unknown variant of [DueDate] to a value of type [T].
             *
             * An instance of [DueDate] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown DueDate: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<DueDate>(DueDate::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): DueDate {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<LocalDate>())?.let {
                                DueDate(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                DueDate(dateTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> DueDate(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<DueDate>(DueDate::class) {

            override fun serialize(
                value: DueDate,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.date != null -> generator.writeObject(value.date)
                    value.dateTime != null -> generator.writeObject(value.dateTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid DueDate")
                }
            }
        }
    }

    /** The date of the invoice. Can only be modified for one-off draft invoices. */
    @JsonDeserialize(using = InvoiceDate.Deserializer::class)
    @JsonSerialize(using = InvoiceDate.Serializer::class)
    class InvoiceDate
    private constructor(
        private val date: LocalDate? = null,
        private val dateTime: OffsetDateTime? = null,
        private val _json: JsonValue? = null,
    ) {

        fun date(): LocalDate? = date

        fun dateTime(): OffsetDateTime? = dateTime

        fun isDate(): Boolean = date != null

        fun isDateTime(): Boolean = dateTime != null

        fun asDate(): LocalDate = date.getOrThrow("date")

        fun asDateTime(): OffsetDateTime = dateTime.getOrThrow("dateTime")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                date != null -> visitor.visitDate(date)
                dateTime != null -> visitor.visitDateTime(dateTime)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): InvoiceDate = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitDate(date: LocalDate) {}

                    override fun visitDateTime(dateTime: OffsetDateTime) {}
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
                    override fun visitDate(date: LocalDate) = 1

                    override fun visitDateTime(dateTime: OffsetDateTime) = 1

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceDate && date == other.date && dateTime == other.dateTime
        }

        override fun hashCode(): Int = Objects.hash(date, dateTime)

        override fun toString(): String =
            when {
                date != null -> "InvoiceDate{date=$date}"
                dateTime != null -> "InvoiceDate{dateTime=$dateTime}"
                _json != null -> "InvoiceDate{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid InvoiceDate")
            }

        companion object {

            fun ofDate(date: LocalDate) = InvoiceDate(date = date)

            fun ofDateTime(dateTime: OffsetDateTime) = InvoiceDate(dateTime = dateTime)
        }

        /**
         * An interface that defines how to map each variant of [InvoiceDate] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitDate(date: LocalDate): T

            fun visitDateTime(dateTime: OffsetDateTime): T

            /**
             * Maps an unknown variant of [InvoiceDate] to a value of type [T].
             *
             * An instance of [InvoiceDate] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws OrbInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown InvoiceDate: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<InvoiceDate>(InvoiceDate::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): InvoiceDate {
                val json = JsonValue.fromJsonNode(node)

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<LocalDate>())?.let {
                                InvoiceDate(date = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<OffsetDateTime>())?.let {
                                InvoiceDate(dateTime = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from object).
                    0 -> InvoiceDate(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<InvoiceDate>(InvoiceDate::class) {

            override fun serialize(
                value: InvoiceDate,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.date != null -> generator.writeObject(value.date)
                    value.dateTime != null -> generator.writeObject(value.dateTime)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid InvoiceDate")
                }
            }
        }
    }

    /**
     * User-specified key/value pairs for the resource. Individual keys can be removed by setting
     * the value to `null`, and the entire metadata mapping can be cleared by setting `metadata` to
     * `null`.
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceUpdateParams &&
            invoiceId == other.invoiceId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(invoiceId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "InvoiceUpdateParams{invoiceId=$invoiceId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
