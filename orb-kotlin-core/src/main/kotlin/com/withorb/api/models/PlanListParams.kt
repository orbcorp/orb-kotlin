// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.withorb.api.core.Enum
import com.withorb.api.core.JsonField
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

class PlanListParams
constructor(
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val cursor: String?,
    private val limit: Long?,
    private val status: Status?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun createdAtGt(): OffsetDateTime? = createdAtGt

    fun createdAtGte(): OffsetDateTime? = createdAtGte

    fun createdAtLt(): OffsetDateTime? = createdAtLt

    fun createdAtLte(): OffsetDateTime? = createdAtLte

    fun cursor(): String? = cursor

    fun limit(): Long? = limit

    fun status(): Status? = status

    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.createdAtGt?.let {
            params.put("created_at[gt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtGte?.let {
            params.put("created_at[gte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtLt?.let {
            params.put("created_at[lt]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.createdAtLte?.let {
            params.put("created_at[lte]", listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)))
        }
        this.cursor?.let { params.put("cursor", listOf(it.toString())) }
        this.limit?.let { params.put("limit", listOf(it.toString())) }
        this.status?.let { params.put("status", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toUnmodifiable()
    }

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanListParams && this.createdAtGt == other.createdAtGt && this.createdAtGte == other.createdAtGte && this.createdAtLt == other.createdAtLt && this.createdAtLte == other.createdAtLte && this.cursor == other.cursor && this.limit == other.limit && this.status == other.status && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(createdAtGt, createdAtGte, createdAtLt, createdAtLte, cursor, limit, status, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "PlanListParams{createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, cursor=$cursor, limit=$limit, status=$status, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var cursor: String? = null
        private var limit: Long? = null
        private var status: Status? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(planListParams: PlanListParams) = apply {
            this.createdAtGt = planListParams.createdAtGt
            this.createdAtGte = planListParams.createdAtGte
            this.createdAtLt = planListParams.createdAtLt
            this.createdAtLte = planListParams.createdAtLte
            this.cursor = planListParams.cursor
            this.limit = planListParams.limit
            this.status = planListParams.status
            additionalQueryParams(planListParams.additionalQueryParams)
            additionalHeaders(planListParams.additionalHeaders)
        }

        fun createdAtGt(createdAtGt: OffsetDateTime) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGte(createdAtGte: OffsetDateTime) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLt(createdAtLt: OffsetDateTime) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLte(createdAtLte: OffsetDateTime) = apply { this.createdAtLte = createdAtLte }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String) = apply { this.cursor = cursor }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long) = apply { this.limit = limit }

        /** The plan status to filter to ('active', 'archived', or 'draft'). */
        fun status(status: Status) = apply { this.status = status }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun build(): PlanListParams =
            PlanListParams(
                createdAtGt,
                createdAtGte,
                createdAtLt,
                createdAtLte,
                cursor,
                limit,
                status,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = Status(JsonField.of("active"))

            val ARCHIVED = Status(JsonField.of("archived"))

            val DRAFT = Status(JsonField.of("draft"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            ARCHIVED,
            DRAFT,
        }

        enum class Value {
            ACTIVE,
            ARCHIVED,
            DRAFT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                ARCHIVED -> Value.ARCHIVED
                DRAFT -> Value.DRAFT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                ARCHIVED -> Known.ARCHIVED
                DRAFT -> Known.DRAFT
                else -> throw OrbInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
