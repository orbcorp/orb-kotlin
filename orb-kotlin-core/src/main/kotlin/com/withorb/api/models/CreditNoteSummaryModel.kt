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
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkRequired
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects

@NoAutoDetect
class CreditNoteSummaryModel
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_note_number")
    @ExcludeMissing
    private val creditNoteNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("memo") @ExcludeMissing private val memo: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reason")
    @ExcludeMissing
    private val reason: JsonField<String> = JsonMissing.of(),
    @JsonProperty("total") @ExcludeMissing private val total: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<String> = JsonMissing.of(),
    @JsonProperty("voided_at")
    @ExcludeMissing
    private val voidedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun creditNoteNumber(): String = creditNoteNumber.getRequired("credit_note_number")

    /** An optional memo supplied on the credit note. */
    fun memo(): String? = memo.getNullable("memo")

    fun reason(): String = reason.getRequired("reason")

    fun total(): String = total.getRequired("total")

    fun type(): String = type.getRequired("type")

    /**
     * If the credit note has a status of `void`, this gives a timestamp when the credit note was
     * voided.
     */
    fun voidedAt(): OffsetDateTime? = voidedAt.getNullable("voided_at")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("credit_note_number")
    @ExcludeMissing
    fun _creditNoteNumber(): JsonField<String> = creditNoteNumber

    /** An optional memo supplied on the credit note. */
    @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<String> = total

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * If the credit note has a status of `void`, this gives a timestamp when the credit note was
     * voided.
     */
    @JsonProperty("voided_at") @ExcludeMissing fun _voidedAt(): JsonField<OffsetDateTime> = voidedAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): CreditNoteSummaryModel = apply {
        if (validated) {
            return@apply
        }

        id()
        creditNoteNumber()
        memo()
        reason()
        total()
        type()
        voidedAt()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CreditNoteSummaryModel].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .creditNoteNumber()
         * .memo()
         * .reason()
         * .total()
         * .type()
         * .voidedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CreditNoteSummaryModel]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var creditNoteNumber: JsonField<String>? = null
        private var memo: JsonField<String>? = null
        private var reason: JsonField<String>? = null
        private var total: JsonField<String>? = null
        private var type: JsonField<String>? = null
        private var voidedAt: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(creditNoteSummaryModel: CreditNoteSummaryModel) = apply {
            id = creditNoteSummaryModel.id
            creditNoteNumber = creditNoteSummaryModel.creditNoteNumber
            memo = creditNoteSummaryModel.memo
            reason = creditNoteSummaryModel.reason
            total = creditNoteSummaryModel.total
            type = creditNoteSummaryModel.type
            voidedAt = creditNoteSummaryModel.voidedAt
            additionalProperties = creditNoteSummaryModel.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun creditNoteNumber(creditNoteNumber: String) =
            creditNoteNumber(JsonField.of(creditNoteNumber))

        fun creditNoteNumber(creditNoteNumber: JsonField<String>) = apply {
            this.creditNoteNumber = creditNoteNumber
        }

        /** An optional memo supplied on the credit note. */
        fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

        /** An optional memo supplied on the credit note. */
        fun memo(memo: JsonField<String>) = apply { this.memo = memo }

        fun reason(reason: String) = reason(JsonField.of(reason))

        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        fun total(total: String) = total(JsonField.of(total))

        fun total(total: JsonField<String>) = apply { this.total = total }

        fun type(type: String) = type(JsonField.of(type))

        fun type(type: JsonField<String>) = apply { this.type = type }

        /**
         * If the credit note has a status of `void`, this gives a timestamp when the credit note
         * was voided.
         */
        fun voidedAt(voidedAt: OffsetDateTime?) = voidedAt(JsonField.ofNullable(voidedAt))

        /**
         * If the credit note has a status of `void`, this gives a timestamp when the credit note
         * was voided.
         */
        fun voidedAt(voidedAt: JsonField<OffsetDateTime>) = apply { this.voidedAt = voidedAt }

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

        fun build(): CreditNoteSummaryModel =
            CreditNoteSummaryModel(
                checkRequired("id", id),
                checkRequired("creditNoteNumber", creditNoteNumber),
                checkRequired("memo", memo),
                checkRequired("reason", reason),
                checkRequired("total", total),
                checkRequired("type", type),
                checkRequired("voidedAt", voidedAt),
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CreditNoteSummaryModel && id == other.id && creditNoteNumber == other.creditNoteNumber && memo == other.memo && reason == other.reason && total == other.total && type == other.type && voidedAt == other.voidedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, creditNoteNumber, memo, reason, total, type, voidedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CreditNoteSummaryModel{id=$id, creditNoteNumber=$creditNoteNumber, memo=$memo, reason=$reason, total=$total, type=$type, voidedAt=$voidedAt, additionalProperties=$additionalProperties}"
}
