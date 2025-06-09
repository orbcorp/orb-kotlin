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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.Objects

class ChangedSubscriptionResources
private constructor(
    private val createdCreditNotes: JsonField<List<CreditNote>>,
    private val createdInvoices: JsonField<List<Invoice>>,
    private val voidedCreditNotes: JsonField<List<CreditNote>>,
    private val voidedInvoices: JsonField<List<Invoice>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_credit_notes")
        @ExcludeMissing
        createdCreditNotes: JsonField<List<CreditNote>> = JsonMissing.of(),
        @JsonProperty("created_invoices")
        @ExcludeMissing
        createdInvoices: JsonField<List<Invoice>> = JsonMissing.of(),
        @JsonProperty("voided_credit_notes")
        @ExcludeMissing
        voidedCreditNotes: JsonField<List<CreditNote>> = JsonMissing.of(),
        @JsonProperty("voided_invoices")
        @ExcludeMissing
        voidedInvoices: JsonField<List<Invoice>> = JsonMissing.of(),
    ) : this(createdCreditNotes, createdInvoices, voidedCreditNotes, voidedInvoices, mutableMapOf())

    /**
     * The credit notes that were created as part of this operation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdCreditNotes(): List<CreditNote> =
        createdCreditNotes.getRequired("created_credit_notes")

    /**
     * The invoices that were created as part of this operation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdInvoices(): List<Invoice> = createdInvoices.getRequired("created_invoices")

    /**
     * The credit notes that were voided as part of this operation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voidedCreditNotes(): List<CreditNote> = voidedCreditNotes.getRequired("voided_credit_notes")

    /**
     * The invoices that were voided as part of this operation.
     *
     * @throws OrbInvalidDataException if the JSON field has an unexpected type or is unexpectedly
     *   missing or null (e.g. if the server responded with an unexpected value).
     */
    fun voidedInvoices(): List<Invoice> = voidedInvoices.getRequired("voided_invoices")

    /**
     * Returns the raw JSON value of [createdCreditNotes].
     *
     * Unlike [createdCreditNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("created_credit_notes")
    @ExcludeMissing
    fun _createdCreditNotes(): JsonField<List<CreditNote>> = createdCreditNotes

    /**
     * Returns the raw JSON value of [createdInvoices].
     *
     * Unlike [createdInvoices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_invoices")
    @ExcludeMissing
    fun _createdInvoices(): JsonField<List<Invoice>> = createdInvoices

    /**
     * Returns the raw JSON value of [voidedCreditNotes].
     *
     * Unlike [voidedCreditNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("voided_credit_notes")
    @ExcludeMissing
    fun _voidedCreditNotes(): JsonField<List<CreditNote>> = voidedCreditNotes

    /**
     * Returns the raw JSON value of [voidedInvoices].
     *
     * Unlike [voidedInvoices], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("voided_invoices")
    @ExcludeMissing
    fun _voidedInvoices(): JsonField<List<Invoice>> = voidedInvoices

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
         * Returns a mutable builder for constructing an instance of [ChangedSubscriptionResources].
         *
         * The following fields are required:
         * ```kotlin
         * .createdCreditNotes()
         * .createdInvoices()
         * .voidedCreditNotes()
         * .voidedInvoices()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ChangedSubscriptionResources]. */
    class Builder internal constructor() {

        private var createdCreditNotes: JsonField<MutableList<CreditNote>>? = null
        private var createdInvoices: JsonField<MutableList<Invoice>>? = null
        private var voidedCreditNotes: JsonField<MutableList<CreditNote>>? = null
        private var voidedInvoices: JsonField<MutableList<Invoice>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(changedSubscriptionResources: ChangedSubscriptionResources) = apply {
            createdCreditNotes =
                changedSubscriptionResources.createdCreditNotes.map { it.toMutableList() }
            createdInvoices =
                changedSubscriptionResources.createdInvoices.map { it.toMutableList() }
            voidedCreditNotes =
                changedSubscriptionResources.voidedCreditNotes.map { it.toMutableList() }
            voidedInvoices = changedSubscriptionResources.voidedInvoices.map { it.toMutableList() }
            additionalProperties = changedSubscriptionResources.additionalProperties.toMutableMap()
        }

        /** The credit notes that were created as part of this operation. */
        fun createdCreditNotes(createdCreditNotes: List<CreditNote>) =
            createdCreditNotes(JsonField.of(createdCreditNotes))

        /**
         * Sets [Builder.createdCreditNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdCreditNotes] with a well-typed `List<CreditNote>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun createdCreditNotes(createdCreditNotes: JsonField<List<CreditNote>>) = apply {
            this.createdCreditNotes = createdCreditNotes.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditNote] to [createdCreditNotes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreatedCreditNote(createdCreditNote: CreditNote) = apply {
            createdCreditNotes =
                (createdCreditNotes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("createdCreditNotes", it).add(createdCreditNote)
                }
        }

        /** The invoices that were created as part of this operation. */
        fun createdInvoices(createdInvoices: List<Invoice>) =
            createdInvoices(JsonField.of(createdInvoices))

        /**
         * Sets [Builder.createdInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdInvoices] with a well-typed `List<Invoice>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdInvoices(createdInvoices: JsonField<List<Invoice>>) = apply {
            this.createdInvoices = createdInvoices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Invoice] to [createdInvoices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreatedInvoice(createdInvoice: Invoice) = apply {
            createdInvoices =
                (createdInvoices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("createdInvoices", it).add(createdInvoice)
                }
        }

        /** The credit notes that were voided as part of this operation. */
        fun voidedCreditNotes(voidedCreditNotes: List<CreditNote>) =
            voidedCreditNotes(JsonField.of(voidedCreditNotes))

        /**
         * Sets [Builder.voidedCreditNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidedCreditNotes] with a well-typed `List<CreditNote>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun voidedCreditNotes(voidedCreditNotes: JsonField<List<CreditNote>>) = apply {
            this.voidedCreditNotes = voidedCreditNotes.map { it.toMutableList() }
        }

        /**
         * Adds a single [CreditNote] to [voidedCreditNotes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVoidedCreditNote(voidedCreditNote: CreditNote) = apply {
            voidedCreditNotes =
                (voidedCreditNotes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("voidedCreditNotes", it).add(voidedCreditNote)
                }
        }

        /** The invoices that were voided as part of this operation. */
        fun voidedInvoices(voidedInvoices: List<Invoice>) =
            voidedInvoices(JsonField.of(voidedInvoices))

        /**
         * Sets [Builder.voidedInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.voidedInvoices] with a well-typed `List<Invoice>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun voidedInvoices(voidedInvoices: JsonField<List<Invoice>>) = apply {
            this.voidedInvoices = voidedInvoices.map { it.toMutableList() }
        }

        /**
         * Adds a single [Invoice] to [voidedInvoices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVoidedInvoice(voidedInvoice: Invoice) = apply {
            voidedInvoices =
                (voidedInvoices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("voidedInvoices", it).add(voidedInvoice)
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
         * Returns an immutable instance of [ChangedSubscriptionResources].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .createdCreditNotes()
         * .createdInvoices()
         * .voidedCreditNotes()
         * .voidedInvoices()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ChangedSubscriptionResources =
            ChangedSubscriptionResources(
                checkRequired("createdCreditNotes", createdCreditNotes).map { it.toImmutable() },
                checkRequired("createdInvoices", createdInvoices).map { it.toImmutable() },
                checkRequired("voidedCreditNotes", voidedCreditNotes).map { it.toImmutable() },
                checkRequired("voidedInvoices", voidedInvoices).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ChangedSubscriptionResources = apply {
        if (validated) {
            return@apply
        }

        createdCreditNotes().forEach { it.validate() }
        createdInvoices().forEach { it.validate() }
        voidedCreditNotes().forEach { it.validate() }
        voidedInvoices().forEach { it.validate() }
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
        (createdCreditNotes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (createdInvoices.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (voidedCreditNotes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (voidedInvoices.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ChangedSubscriptionResources && createdCreditNotes == other.createdCreditNotes && createdInvoices == other.createdInvoices && voidedCreditNotes == other.voidedCreditNotes && voidedInvoices == other.voidedInvoices && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdCreditNotes, createdInvoices, voidedCreditNotes, voidedInvoices, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ChangedSubscriptionResources{createdCreditNotes=$createdCreditNotes, createdInvoices=$createdInvoices, voidedCreditNotes=$voidedCreditNotes, voidedInvoices=$voidedInvoices, additionalProperties=$additionalProperties}"
}
