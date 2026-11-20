// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.Params
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.toImmutable
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects

/**
 * This endpoint returns a list of all subscriptions for an account as a
 * [paginated](/api-reference/pagination) list, ordered starting from the most recently created
 * subscription. For a full discussion of the subscription resource, see
 * [Subscription](/core-concepts##subscription).
 *
 * Subscriptions can be filtered for a specific customer by using either the customer_id or
 * external_customer_id query parameters. To filter subscriptions for multiple customers, use the
 * customer_id[] or external_customer_id[] query parameters.
 *
 * Subscriptions can be filtered by status using the status query parameter (one of `active`,
 * `ended`, or `upcoming`). To filter for multiple statuses in a single request, use the status[]
 * query parameter, e.g. `status[]=active&status[]=ended`.
 */
class SubscriptionListParams
private constructor(
    private val billingEntityId: String?,
    private val createdAtGt: OffsetDateTime?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLt: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val cursor: String?,
    private val customerId: CustomerId?,
    private val externalCustomerId: ExternalCustomerId?,
    private val externalPlanId: String?,
    private val limit: Long?,
    private val planId: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filters to objects issued by this billing entity. Filtering on the account's default billing
     * entity also matches objects created before the account had billing entities.
     */
    fun billingEntityId(): String? = billingEntityId

    fun createdAtGt(): OffsetDateTime? = createdAtGt

    fun createdAtGte(): OffsetDateTime? = createdAtGte

    fun createdAtLt(): OffsetDateTime? = createdAtLt

    fun createdAtLte(): OffsetDateTime? = createdAtLte

    /**
     * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
     * initial request.
     */
    fun cursor(): String? = cursor

    fun customerId(): CustomerId? = customerId

    fun externalCustomerId(): ExternalCustomerId? = externalCustomerId

    fun externalPlanId(): String? = externalPlanId

    /** The number of items to fetch. Defaults to 20. */
    fun limit(): Long? = limit

    fun planId(): String? = planId

    fun status(): Status? = status

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): SubscriptionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionListParams]. */
        fun builder() = Builder()
    }

    /** A builder for [SubscriptionListParams]. */
    class Builder internal constructor() {

        private var billingEntityId: String? = null
        private var createdAtGt: OffsetDateTime? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLt: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var cursor: String? = null
        private var customerId: CustomerId? = null
        private var externalCustomerId: ExternalCustomerId? = null
        private var externalPlanId: String? = null
        private var limit: Long? = null
        private var planId: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(subscriptionListParams: SubscriptionListParams) = apply {
            billingEntityId = subscriptionListParams.billingEntityId
            createdAtGt = subscriptionListParams.createdAtGt
            createdAtGte = subscriptionListParams.createdAtGte
            createdAtLt = subscriptionListParams.createdAtLt
            createdAtLte = subscriptionListParams.createdAtLte
            cursor = subscriptionListParams.cursor
            customerId = subscriptionListParams.customerId
            externalCustomerId = subscriptionListParams.externalCustomerId
            externalPlanId = subscriptionListParams.externalPlanId
            limit = subscriptionListParams.limit
            planId = subscriptionListParams.planId
            status = subscriptionListParams.status
            additionalHeaders = subscriptionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionListParams.additionalQueryParams.toBuilder()
        }

        /**
         * Filters to objects issued by this billing entity. Filtering on the account's default
         * billing entity also matches objects created before the account had billing entities.
         */
        fun billingEntityId(billingEntityId: String?) = apply {
            this.billingEntityId = billingEntityId
        }

        fun createdAtGt(createdAtGt: OffsetDateTime?) = apply { this.createdAtGt = createdAtGt }

        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        fun createdAtLt(createdAtLt: OffsetDateTime?) = apply { this.createdAtLt = createdAtLt }

        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /**
         * Cursor for pagination. This can be populated by the `next_cursor` value returned from the
         * initial request.
         */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        fun customerId(customerId: CustomerId?) = apply { this.customerId = customerId }

        /** Alias for calling [customerId] with `CustomerId.ofString(string)`. */
        fun customerId(string: String) = customerId(CustomerId.ofString(string))

        /** Alias for calling [customerId] with `CustomerId.ofStrings(strings)`. */
        fun customerIdOfStrings(strings: List<String>) = customerId(CustomerId.ofStrings(strings))

        fun externalCustomerId(externalCustomerId: ExternalCustomerId?) = apply {
            this.externalCustomerId = externalCustomerId
        }

        /** Alias for calling [externalCustomerId] with `ExternalCustomerId.ofString(string)`. */
        fun externalCustomerId(string: String) =
            externalCustomerId(ExternalCustomerId.ofString(string))

        /** Alias for calling [externalCustomerId] with `ExternalCustomerId.ofStrings(strings)`. */
        fun externalCustomerIdOfStrings(strings: List<String>) =
            externalCustomerId(ExternalCustomerId.ofStrings(strings))

        fun externalPlanId(externalPlanId: String?) = apply { this.externalPlanId = externalPlanId }

        /** The number of items to fetch. Defaults to 20. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        fun planId(planId: String?) = apply { this.planId = planId }

        fun status(status: Status?) = apply { this.status = status }

        /**
         * Alias for calling [status] with
         * `Status.ofSubscriptionStatusFilter(subscriptionStatusFilter)`.
         */
        fun status(subscriptionStatusFilter: SubscriptionStatusFilter) =
            status(Status.ofSubscriptionStatusFilter(subscriptionStatusFilter))

        /**
         * Alias for calling [status] with
         * `Status.ofSubscriptionStatusFilters(subscriptionStatusFilters)`.
         */
        fun statusOfSubscriptionStatusFilters(
            subscriptionStatusFilters: List<SubscriptionStatusFilter>
        ) = status(Status.ofSubscriptionStatusFilters(subscriptionStatusFilters))

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
         * Returns an immutable instance of [SubscriptionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionListParams =
            SubscriptionListParams(
                billingEntityId,
                createdAtGt,
                createdAtGte,
                createdAtLt,
                createdAtLte,
                cursor,
                customerId,
                externalCustomerId,
                externalPlanId,
                limit,
                planId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                billingEntityId?.let { put("billing_entity_id", it) }
                createdAtGt?.let {
                    put("created_at[gt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtGte?.let {
                    put("created_at[gte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLt?.let {
                    put("created_at[lt]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("created_at[lte]", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                cursor?.let { put("cursor", it) }
                customerId?.accept(
                    object : CustomerId.Visitor<Unit> {
                        override fun visitString(string: String) {
                            put("customer_id", string)
                        }

                        override fun visitStrings(strings: List<String>) {
                            strings.forEach { put("customer_id[]", it) }
                        }
                    }
                )
                externalCustomerId?.accept(
                    object : ExternalCustomerId.Visitor<Unit> {
                        override fun visitString(string: String) {
                            put("external_customer_id", string)
                        }

                        override fun visitStrings(strings: List<String>) {
                            strings.forEach { put("external_customer_id[]", it) }
                        }
                    }
                )
                externalPlanId?.let { put("external_plan_id", it) }
                limit?.let { put("limit", it.toString()) }
                planId?.let { put("plan_id", it) }
                status?.accept(
                    object : Status.Visitor<Unit> {
                        override fun visitSubscriptionStatusFilter(
                            subscriptionStatusFilter: SubscriptionStatusFilter
                        ) {
                            put("status", subscriptionStatusFilter.toString())
                        }

                        override fun visitSubscriptionStatusFilters(
                            subscriptionStatusFilters: List<SubscriptionStatusFilter>
                        ) {
                            subscriptionStatusFilters.forEach { put("status[]", it.toString()) }
                        }
                    }
                )
                putAll(additionalQueryParams)
            }
            .build()

    class CustomerId
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
    ) {

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> throw IllegalStateException("Invalid CustomerId")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerId && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "CustomerId{string=$string}"
                strings != null -> "CustomerId{strings=$strings}"
                else -> throw IllegalStateException("Invalid CustomerId")
            }

        companion object {

            fun ofString(string: String) = CustomerId(string = string)

            fun ofStrings(strings: List<String>) = CustomerId(strings = strings.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [CustomerId] to a value of type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T
        }
    }

    class ExternalCustomerId
    private constructor(
        private val string: String? = null,
        private val strings: List<String>? = null,
    ) {

        fun string(): String? = string

        fun strings(): List<String>? = strings

        fun isString(): Boolean = string != null

        fun isStrings(): Boolean = strings != null

        fun asString(): String = string.getOrThrow("string")

        fun asStrings(): List<String> = strings.getOrThrow("strings")

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                string != null -> visitor.visitString(string)
                strings != null -> visitor.visitStrings(strings)
                else -> throw IllegalStateException("Invalid ExternalCustomerId")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalCustomerId && string == other.string && strings == other.strings
        }

        override fun hashCode(): Int = Objects.hash(string, strings)

        override fun toString(): String =
            when {
                string != null -> "ExternalCustomerId{string=$string}"
                strings != null -> "ExternalCustomerId{strings=$strings}"
                else -> throw IllegalStateException("Invalid ExternalCustomerId")
            }

        companion object {

            fun ofString(string: String) = ExternalCustomerId(string = string)

            fun ofStrings(strings: List<String>) =
                ExternalCustomerId(strings = strings.toImmutable())
        }

        /**
         * An interface that defines how to map each variant of [ExternalCustomerId] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitString(string: String): T

            fun visitStrings(strings: List<String>): T
        }
    }

    class Status
    private constructor(
        private val subscriptionStatusFilter: SubscriptionStatusFilter? = null,
        private val subscriptionStatusFilters: List<SubscriptionStatusFilter>? = null,
    ) {

        fun subscriptionStatusFilter(): SubscriptionStatusFilter? = subscriptionStatusFilter

        fun subscriptionStatusFilters(): List<SubscriptionStatusFilter>? = subscriptionStatusFilters

        fun isSubscriptionStatusFilter(): Boolean = subscriptionStatusFilter != null

        fun isSubscriptionStatusFilters(): Boolean = subscriptionStatusFilters != null

        fun asSubscriptionStatusFilter(): SubscriptionStatusFilter =
            subscriptionStatusFilter.getOrThrow("subscriptionStatusFilter")

        fun asSubscriptionStatusFilters(): List<SubscriptionStatusFilter> =
            subscriptionStatusFilters.getOrThrow("subscriptionStatusFilters")

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                subscriptionStatusFilter != null ->
                    visitor.visitSubscriptionStatusFilter(subscriptionStatusFilter)
                subscriptionStatusFilters != null ->
                    visitor.visitSubscriptionStatusFilters(subscriptionStatusFilters)
                else -> throw IllegalStateException("Invalid Status")
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status &&
                subscriptionStatusFilter == other.subscriptionStatusFilter &&
                subscriptionStatusFilters == other.subscriptionStatusFilters
        }

        override fun hashCode(): Int =
            Objects.hash(subscriptionStatusFilter, subscriptionStatusFilters)

        override fun toString(): String =
            when {
                subscriptionStatusFilter != null ->
                    "Status{subscriptionStatusFilter=$subscriptionStatusFilter}"
                subscriptionStatusFilters != null ->
                    "Status{subscriptionStatusFilters=$subscriptionStatusFilters}"
                else -> throw IllegalStateException("Invalid Status")
            }

        companion object {

            fun ofSubscriptionStatusFilter(subscriptionStatusFilter: SubscriptionStatusFilter) =
                Status(subscriptionStatusFilter = subscriptionStatusFilter)

            fun ofSubscriptionStatusFilters(
                subscriptionStatusFilters: List<SubscriptionStatusFilter>
            ) = Status(subscriptionStatusFilters = subscriptionStatusFilters.toImmutable())
        }

        /** An interface that defines how to map each variant of [Status] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitSubscriptionStatusFilter(subscriptionStatusFilter: SubscriptionStatusFilter): T

            fun visitSubscriptionStatusFilters(
                subscriptionStatusFilters: List<SubscriptionStatusFilter>
            ): T
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListParams &&
            billingEntityId == other.billingEntityId &&
            createdAtGt == other.createdAtGt &&
            createdAtGte == other.createdAtGte &&
            createdAtLt == other.createdAtLt &&
            createdAtLte == other.createdAtLte &&
            cursor == other.cursor &&
            customerId == other.customerId &&
            externalCustomerId == other.externalCustomerId &&
            externalPlanId == other.externalPlanId &&
            limit == other.limit &&
            planId == other.planId &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            billingEntityId,
            createdAtGt,
            createdAtGte,
            createdAtLt,
            createdAtLte,
            cursor,
            customerId,
            externalCustomerId,
            externalPlanId,
            limit,
            planId,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SubscriptionListParams{billingEntityId=$billingEntityId, createdAtGt=$createdAtGt, createdAtGte=$createdAtGte, createdAtLt=$createdAtLt, createdAtLte=$createdAtLte, cursor=$cursor, customerId=$customerId, externalCustomerId=$externalCustomerId, externalPlanId=$externalPlanId, limit=$limit, planId=$planId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
