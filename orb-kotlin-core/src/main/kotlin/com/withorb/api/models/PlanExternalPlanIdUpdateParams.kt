// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.models

import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.Params
import com.withorb.api.core.checkRequired
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import java.util.Objects

/**
 * This endpoint can be used to update the `external_plan_id`, and `metadata` of an existing plan.
 *
 * Other fields on a customer are currently immutable.
 */
class PlanExternalPlanIdUpdateParams
private constructor(
    private val otherExternalPlanId: String,
    private val editPlanModel: EditPlanModel,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun otherExternalPlanId(): String = otherExternalPlanId

    fun editPlanModel(): EditPlanModel = editPlanModel

    fun _additionalBodyProperties(): Map<String, JsonValue> = editPlanModel._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): EditPlanModel = editPlanModel

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> otherExternalPlanId
            else -> ""
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PlanExternalPlanIdUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .otherExternalPlanId()
         * .editPlanModel()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PlanExternalPlanIdUpdateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var otherExternalPlanId: String? = null
        private var editPlanModel: EditPlanModel? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(planExternalPlanIdUpdateParams: PlanExternalPlanIdUpdateParams) = apply {
            otherExternalPlanId = planExternalPlanIdUpdateParams.otherExternalPlanId
            editPlanModel = planExternalPlanIdUpdateParams.editPlanModel
            additionalHeaders = planExternalPlanIdUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = planExternalPlanIdUpdateParams.additionalQueryParams.toBuilder()
        }

        fun otherExternalPlanId(otherExternalPlanId: String) = apply {
            this.otherExternalPlanId = otherExternalPlanId
        }

        fun editPlanModel(editPlanModel: EditPlanModel) = apply {
            this.editPlanModel = editPlanModel
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

        fun build(): PlanExternalPlanIdUpdateParams =
            PlanExternalPlanIdUpdateParams(
                checkRequired("otherExternalPlanId", otherExternalPlanId),
                checkRequired("editPlanModel", editPlanModel),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanExternalPlanIdUpdateParams && otherExternalPlanId == other.otherExternalPlanId && editPlanModel == other.editPlanModel && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(otherExternalPlanId, editPlanModel, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PlanExternalPlanIdUpdateParams{otherExternalPlanId=$otherExternalPlanId, editPlanModel=$editPlanModel, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
