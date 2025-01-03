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
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.http.Headers
import com.withorb.api.core.http.QueryParams
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

class PriceCreateParams
constructor(
    private val body: PriceCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun newFloatingUnitPrice(): NewFloatingUnitPrice? = body.newFloatingUnitPrice()

    fun newFloatingPackagePrice(): NewFloatingPackagePrice? = body.newFloatingPackagePrice()

    fun newFloatingMatrixPrice(): NewFloatingMatrixPrice? = body.newFloatingMatrixPrice()

    fun newFloatingMatrixWithAllocationPrice(): NewFloatingMatrixWithAllocationPrice? =
        body.newFloatingMatrixWithAllocationPrice()

    fun newFloatingTieredPrice(): NewFloatingTieredPrice? = body.newFloatingTieredPrice()

    fun newFloatingTieredBpsPrice(): NewFloatingTieredBpsPrice? = body.newFloatingTieredBpsPrice()

    fun newFloatingBpsPrice(): NewFloatingBpsPrice? = body.newFloatingBpsPrice()

    fun newFloatingBulkBpsPrice(): NewFloatingBulkBpsPrice? = body.newFloatingBulkBpsPrice()

    fun newFloatingBulkPrice(): NewFloatingBulkPrice? = body.newFloatingBulkPrice()

    fun newFloatingThresholdTotalAmountPrice(): NewFloatingThresholdTotalAmountPrice? =
        body.newFloatingThresholdTotalAmountPrice()

    fun newFloatingTieredPackagePrice(): NewFloatingTieredPackagePrice? =
        body.newFloatingTieredPackagePrice()

    fun newFloatingGroupedTieredPrice(): NewFloatingGroupedTieredPrice? =
        body.newFloatingGroupedTieredPrice()

    fun newFloatingTieredWithMinimumPrice(): NewFloatingTieredWithMinimumPrice? =
        body.newFloatingTieredWithMinimumPrice()

    fun newFloatingPackageWithAllocationPrice(): NewFloatingPackageWithAllocationPrice? =
        body.newFloatingPackageWithAllocationPrice()

    fun newFloatingTieredPackageWithMinimumPrice(): NewFloatingTieredPackageWithMinimumPrice? =
        body.newFloatingTieredPackageWithMinimumPrice()

    fun newFloatingUnitWithPercentPrice(): NewFloatingUnitWithPercentPrice? =
        body.newFloatingUnitWithPercentPrice()

    fun newFloatingTieredWithProrationPrice(): NewFloatingTieredWithProrationPrice? =
        body.newFloatingTieredWithProrationPrice()

    fun newFloatingUnitWithProrationPrice(): NewFloatingUnitWithProrationPrice? =
        body.newFloatingUnitWithProrationPrice()

    fun newFloatingGroupedAllocationPrice(): NewFloatingGroupedAllocationPrice? =
        body.newFloatingGroupedAllocationPrice()

    fun newFloatingGroupedWithProratedMinimumPrice(): NewFloatingGroupedWithProratedMinimumPrice? =
        body.newFloatingGroupedWithProratedMinimumPrice()

    fun newFloatingGroupedWithMeteredMinimumPrice(): NewFloatingGroupedWithMeteredMinimumPrice? =
        body.newFloatingGroupedWithMeteredMinimumPrice()

    fun newFloatingMatrixWithDisplayNamePrice(): NewFloatingMatrixWithDisplayNamePrice? =
        body.newFloatingMatrixWithDisplayNamePrice()

    fun newFloatingBulkWithProrationPrice(): NewFloatingBulkWithProrationPrice? =
        body.newFloatingBulkWithProrationPrice()

    fun newFloatingGroupedTieredPackagePrice(): NewFloatingGroupedTieredPackagePrice? =
        body.newFloatingGroupedTieredPackagePrice()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun getBody(): PriceCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = PriceCreateBody.Deserializer::class)
    @JsonSerialize(using = PriceCreateBody.Serializer::class)
    class PriceCreateBody
    internal constructor(
        private val newFloatingUnitPrice: NewFloatingUnitPrice? = null,
        private val newFloatingPackagePrice: NewFloatingPackagePrice? = null,
        private val newFloatingMatrixPrice: NewFloatingMatrixPrice? = null,
        private val newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice? =
            null,
        private val newFloatingTieredPrice: NewFloatingTieredPrice? = null,
        private val newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice? = null,
        private val newFloatingBpsPrice: NewFloatingBpsPrice? = null,
        private val newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice? = null,
        private val newFloatingBulkPrice: NewFloatingBulkPrice? = null,
        private val newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice? =
            null,
        private val newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice? = null,
        private val newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice? = null,
        private val newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice? = null,
        private val newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice? =
            null,
        private val newFloatingTieredPackageWithMinimumPrice:
            NewFloatingTieredPackageWithMinimumPrice? =
            null,
        private val newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice? = null,
        private val newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice? =
            null,
        private val newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice? = null,
        private val newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice? = null,
        private val newFloatingGroupedWithProratedMinimumPrice:
            NewFloatingGroupedWithProratedMinimumPrice? =
            null,
        private val newFloatingGroupedWithMeteredMinimumPrice:
            NewFloatingGroupedWithMeteredMinimumPrice? =
            null,
        private val newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice? =
            null,
        private val newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice? = null,
        private val newFloatingGroupedTieredPackagePrice: NewFloatingGroupedTieredPackagePrice? =
            null,
        private val _json: JsonValue? = null,
    ) {

        fun newFloatingUnitPrice(): NewFloatingUnitPrice? = newFloatingUnitPrice

        fun newFloatingPackagePrice(): NewFloatingPackagePrice? = newFloatingPackagePrice

        fun newFloatingMatrixPrice(): NewFloatingMatrixPrice? = newFloatingMatrixPrice

        fun newFloatingMatrixWithAllocationPrice(): NewFloatingMatrixWithAllocationPrice? =
            newFloatingMatrixWithAllocationPrice

        fun newFloatingTieredPrice(): NewFloatingTieredPrice? = newFloatingTieredPrice

        fun newFloatingTieredBpsPrice(): NewFloatingTieredBpsPrice? = newFloatingTieredBpsPrice

        fun newFloatingBpsPrice(): NewFloatingBpsPrice? = newFloatingBpsPrice

        fun newFloatingBulkBpsPrice(): NewFloatingBulkBpsPrice? = newFloatingBulkBpsPrice

        fun newFloatingBulkPrice(): NewFloatingBulkPrice? = newFloatingBulkPrice

        fun newFloatingThresholdTotalAmountPrice(): NewFloatingThresholdTotalAmountPrice? =
            newFloatingThresholdTotalAmountPrice

        fun newFloatingTieredPackagePrice(): NewFloatingTieredPackagePrice? =
            newFloatingTieredPackagePrice

        fun newFloatingGroupedTieredPrice(): NewFloatingGroupedTieredPrice? =
            newFloatingGroupedTieredPrice

        fun newFloatingTieredWithMinimumPrice(): NewFloatingTieredWithMinimumPrice? =
            newFloatingTieredWithMinimumPrice

        fun newFloatingPackageWithAllocationPrice(): NewFloatingPackageWithAllocationPrice? =
            newFloatingPackageWithAllocationPrice

        fun newFloatingTieredPackageWithMinimumPrice(): NewFloatingTieredPackageWithMinimumPrice? =
            newFloatingTieredPackageWithMinimumPrice

        fun newFloatingUnitWithPercentPrice(): NewFloatingUnitWithPercentPrice? =
            newFloatingUnitWithPercentPrice

        fun newFloatingTieredWithProrationPrice(): NewFloatingTieredWithProrationPrice? =
            newFloatingTieredWithProrationPrice

        fun newFloatingUnitWithProrationPrice(): NewFloatingUnitWithProrationPrice? =
            newFloatingUnitWithProrationPrice

        fun newFloatingGroupedAllocationPrice(): NewFloatingGroupedAllocationPrice? =
            newFloatingGroupedAllocationPrice

        fun newFloatingGroupedWithProratedMinimumPrice():
            NewFloatingGroupedWithProratedMinimumPrice? = newFloatingGroupedWithProratedMinimumPrice

        fun newFloatingGroupedWithMeteredMinimumPrice():
            NewFloatingGroupedWithMeteredMinimumPrice? = newFloatingGroupedWithMeteredMinimumPrice

        fun newFloatingMatrixWithDisplayNamePrice(): NewFloatingMatrixWithDisplayNamePrice? =
            newFloatingMatrixWithDisplayNamePrice

        fun newFloatingBulkWithProrationPrice(): NewFloatingBulkWithProrationPrice? =
            newFloatingBulkWithProrationPrice

        fun newFloatingGroupedTieredPackagePrice(): NewFloatingGroupedTieredPackagePrice? =
            newFloatingGroupedTieredPackagePrice

        fun isNewFloatingUnitPrice(): Boolean = newFloatingUnitPrice != null

        fun isNewFloatingPackagePrice(): Boolean = newFloatingPackagePrice != null

        fun isNewFloatingMatrixPrice(): Boolean = newFloatingMatrixPrice != null

        fun isNewFloatingMatrixWithAllocationPrice(): Boolean =
            newFloatingMatrixWithAllocationPrice != null

        fun isNewFloatingTieredPrice(): Boolean = newFloatingTieredPrice != null

        fun isNewFloatingTieredBpsPrice(): Boolean = newFloatingTieredBpsPrice != null

        fun isNewFloatingBpsPrice(): Boolean = newFloatingBpsPrice != null

        fun isNewFloatingBulkBpsPrice(): Boolean = newFloatingBulkBpsPrice != null

        fun isNewFloatingBulkPrice(): Boolean = newFloatingBulkPrice != null

        fun isNewFloatingThresholdTotalAmountPrice(): Boolean =
            newFloatingThresholdTotalAmountPrice != null

        fun isNewFloatingTieredPackagePrice(): Boolean = newFloatingTieredPackagePrice != null

        fun isNewFloatingGroupedTieredPrice(): Boolean = newFloatingGroupedTieredPrice != null

        fun isNewFloatingTieredWithMinimumPrice(): Boolean =
            newFloatingTieredWithMinimumPrice != null

        fun isNewFloatingPackageWithAllocationPrice(): Boolean =
            newFloatingPackageWithAllocationPrice != null

        fun isNewFloatingTieredPackageWithMinimumPrice(): Boolean =
            newFloatingTieredPackageWithMinimumPrice != null

        fun isNewFloatingUnitWithPercentPrice(): Boolean = newFloatingUnitWithPercentPrice != null

        fun isNewFloatingTieredWithProrationPrice(): Boolean =
            newFloatingTieredWithProrationPrice != null

        fun isNewFloatingUnitWithProrationPrice(): Boolean =
            newFloatingUnitWithProrationPrice != null

        fun isNewFloatingGroupedAllocationPrice(): Boolean =
            newFloatingGroupedAllocationPrice != null

        fun isNewFloatingGroupedWithProratedMinimumPrice(): Boolean =
            newFloatingGroupedWithProratedMinimumPrice != null

        fun isNewFloatingGroupedWithMeteredMinimumPrice(): Boolean =
            newFloatingGroupedWithMeteredMinimumPrice != null

        fun isNewFloatingMatrixWithDisplayNamePrice(): Boolean =
            newFloatingMatrixWithDisplayNamePrice != null

        fun isNewFloatingBulkWithProrationPrice(): Boolean =
            newFloatingBulkWithProrationPrice != null

        fun isNewFloatingGroupedTieredPackagePrice(): Boolean =
            newFloatingGroupedTieredPackagePrice != null

        fun asNewFloatingUnitPrice(): NewFloatingUnitPrice =
            newFloatingUnitPrice.getOrThrow("newFloatingUnitPrice")

        fun asNewFloatingPackagePrice(): NewFloatingPackagePrice =
            newFloatingPackagePrice.getOrThrow("newFloatingPackagePrice")

        fun asNewFloatingMatrixPrice(): NewFloatingMatrixPrice =
            newFloatingMatrixPrice.getOrThrow("newFloatingMatrixPrice")

        fun asNewFloatingMatrixWithAllocationPrice(): NewFloatingMatrixWithAllocationPrice =
            newFloatingMatrixWithAllocationPrice.getOrThrow("newFloatingMatrixWithAllocationPrice")

        fun asNewFloatingTieredPrice(): NewFloatingTieredPrice =
            newFloatingTieredPrice.getOrThrow("newFloatingTieredPrice")

        fun asNewFloatingTieredBpsPrice(): NewFloatingTieredBpsPrice =
            newFloatingTieredBpsPrice.getOrThrow("newFloatingTieredBpsPrice")

        fun asNewFloatingBpsPrice(): NewFloatingBpsPrice =
            newFloatingBpsPrice.getOrThrow("newFloatingBpsPrice")

        fun asNewFloatingBulkBpsPrice(): NewFloatingBulkBpsPrice =
            newFloatingBulkBpsPrice.getOrThrow("newFloatingBulkBpsPrice")

        fun asNewFloatingBulkPrice(): NewFloatingBulkPrice =
            newFloatingBulkPrice.getOrThrow("newFloatingBulkPrice")

        fun asNewFloatingThresholdTotalAmountPrice(): NewFloatingThresholdTotalAmountPrice =
            newFloatingThresholdTotalAmountPrice.getOrThrow("newFloatingThresholdTotalAmountPrice")

        fun asNewFloatingTieredPackagePrice(): NewFloatingTieredPackagePrice =
            newFloatingTieredPackagePrice.getOrThrow("newFloatingTieredPackagePrice")

        fun asNewFloatingGroupedTieredPrice(): NewFloatingGroupedTieredPrice =
            newFloatingGroupedTieredPrice.getOrThrow("newFloatingGroupedTieredPrice")

        fun asNewFloatingTieredWithMinimumPrice(): NewFloatingTieredWithMinimumPrice =
            newFloatingTieredWithMinimumPrice.getOrThrow("newFloatingTieredWithMinimumPrice")

        fun asNewFloatingPackageWithAllocationPrice(): NewFloatingPackageWithAllocationPrice =
            newFloatingPackageWithAllocationPrice.getOrThrow(
                "newFloatingPackageWithAllocationPrice"
            )

        fun asNewFloatingTieredPackageWithMinimumPrice(): NewFloatingTieredPackageWithMinimumPrice =
            newFloatingTieredPackageWithMinimumPrice.getOrThrow(
                "newFloatingTieredPackageWithMinimumPrice"
            )

        fun asNewFloatingUnitWithPercentPrice(): NewFloatingUnitWithPercentPrice =
            newFloatingUnitWithPercentPrice.getOrThrow("newFloatingUnitWithPercentPrice")

        fun asNewFloatingTieredWithProrationPrice(): NewFloatingTieredWithProrationPrice =
            newFloatingTieredWithProrationPrice.getOrThrow("newFloatingTieredWithProrationPrice")

        fun asNewFloatingUnitWithProrationPrice(): NewFloatingUnitWithProrationPrice =
            newFloatingUnitWithProrationPrice.getOrThrow("newFloatingUnitWithProrationPrice")

        fun asNewFloatingGroupedAllocationPrice(): NewFloatingGroupedAllocationPrice =
            newFloatingGroupedAllocationPrice.getOrThrow("newFloatingGroupedAllocationPrice")

        fun asNewFloatingGroupedWithProratedMinimumPrice():
            NewFloatingGroupedWithProratedMinimumPrice =
            newFloatingGroupedWithProratedMinimumPrice.getOrThrow(
                "newFloatingGroupedWithProratedMinimumPrice"
            )

        fun asNewFloatingGroupedWithMeteredMinimumPrice():
            NewFloatingGroupedWithMeteredMinimumPrice =
            newFloatingGroupedWithMeteredMinimumPrice.getOrThrow(
                "newFloatingGroupedWithMeteredMinimumPrice"
            )

        fun asNewFloatingMatrixWithDisplayNamePrice(): NewFloatingMatrixWithDisplayNamePrice =
            newFloatingMatrixWithDisplayNamePrice.getOrThrow(
                "newFloatingMatrixWithDisplayNamePrice"
            )

        fun asNewFloatingBulkWithProrationPrice(): NewFloatingBulkWithProrationPrice =
            newFloatingBulkWithProrationPrice.getOrThrow("newFloatingBulkWithProrationPrice")

        fun asNewFloatingGroupedTieredPackagePrice(): NewFloatingGroupedTieredPackagePrice =
            newFloatingGroupedTieredPackagePrice.getOrThrow("newFloatingGroupedTieredPackagePrice")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T {
            return when {
                newFloatingUnitPrice != null ->
                    visitor.visitNewFloatingUnitPrice(newFloatingUnitPrice)
                newFloatingPackagePrice != null ->
                    visitor.visitNewFloatingPackagePrice(newFloatingPackagePrice)
                newFloatingMatrixPrice != null ->
                    visitor.visitNewFloatingMatrixPrice(newFloatingMatrixPrice)
                newFloatingMatrixWithAllocationPrice != null ->
                    visitor.visitNewFloatingMatrixWithAllocationPrice(
                        newFloatingMatrixWithAllocationPrice
                    )
                newFloatingTieredPrice != null ->
                    visitor.visitNewFloatingTieredPrice(newFloatingTieredPrice)
                newFloatingTieredBpsPrice != null ->
                    visitor.visitNewFloatingTieredBpsPrice(newFloatingTieredBpsPrice)
                newFloatingBpsPrice != null -> visitor.visitNewFloatingBpsPrice(newFloatingBpsPrice)
                newFloatingBulkBpsPrice != null ->
                    visitor.visitNewFloatingBulkBpsPrice(newFloatingBulkBpsPrice)
                newFloatingBulkPrice != null ->
                    visitor.visitNewFloatingBulkPrice(newFloatingBulkPrice)
                newFloatingThresholdTotalAmountPrice != null ->
                    visitor.visitNewFloatingThresholdTotalAmountPrice(
                        newFloatingThresholdTotalAmountPrice
                    )
                newFloatingTieredPackagePrice != null ->
                    visitor.visitNewFloatingTieredPackagePrice(newFloatingTieredPackagePrice)
                newFloatingGroupedTieredPrice != null ->
                    visitor.visitNewFloatingGroupedTieredPrice(newFloatingGroupedTieredPrice)
                newFloatingTieredWithMinimumPrice != null ->
                    visitor.visitNewFloatingTieredWithMinimumPrice(
                        newFloatingTieredWithMinimumPrice
                    )
                newFloatingPackageWithAllocationPrice != null ->
                    visitor.visitNewFloatingPackageWithAllocationPrice(
                        newFloatingPackageWithAllocationPrice
                    )
                newFloatingTieredPackageWithMinimumPrice != null ->
                    visitor.visitNewFloatingTieredPackageWithMinimumPrice(
                        newFloatingTieredPackageWithMinimumPrice
                    )
                newFloatingUnitWithPercentPrice != null ->
                    visitor.visitNewFloatingUnitWithPercentPrice(newFloatingUnitWithPercentPrice)
                newFloatingTieredWithProrationPrice != null ->
                    visitor.visitNewFloatingTieredWithProrationPrice(
                        newFloatingTieredWithProrationPrice
                    )
                newFloatingUnitWithProrationPrice != null ->
                    visitor.visitNewFloatingUnitWithProrationPrice(
                        newFloatingUnitWithProrationPrice
                    )
                newFloatingGroupedAllocationPrice != null ->
                    visitor.visitNewFloatingGroupedAllocationPrice(
                        newFloatingGroupedAllocationPrice
                    )
                newFloatingGroupedWithProratedMinimumPrice != null ->
                    visitor.visitNewFloatingGroupedWithProratedMinimumPrice(
                        newFloatingGroupedWithProratedMinimumPrice
                    )
                newFloatingGroupedWithMeteredMinimumPrice != null ->
                    visitor.visitNewFloatingGroupedWithMeteredMinimumPrice(
                        newFloatingGroupedWithMeteredMinimumPrice
                    )
                newFloatingMatrixWithDisplayNamePrice != null ->
                    visitor.visitNewFloatingMatrixWithDisplayNamePrice(
                        newFloatingMatrixWithDisplayNamePrice
                    )
                newFloatingBulkWithProrationPrice != null ->
                    visitor.visitNewFloatingBulkWithProrationPrice(
                        newFloatingBulkWithProrationPrice
                    )
                newFloatingGroupedTieredPackagePrice != null ->
                    visitor.visitNewFloatingGroupedTieredPackagePrice(
                        newFloatingGroupedTieredPackagePrice
                    )
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceCreateBody && newFloatingUnitPrice == other.newFloatingUnitPrice && newFloatingPackagePrice == other.newFloatingPackagePrice && newFloatingMatrixPrice == other.newFloatingMatrixPrice && newFloatingMatrixWithAllocationPrice == other.newFloatingMatrixWithAllocationPrice && newFloatingTieredPrice == other.newFloatingTieredPrice && newFloatingTieredBpsPrice == other.newFloatingTieredBpsPrice && newFloatingBpsPrice == other.newFloatingBpsPrice && newFloatingBulkBpsPrice == other.newFloatingBulkBpsPrice && newFloatingBulkPrice == other.newFloatingBulkPrice && newFloatingThresholdTotalAmountPrice == other.newFloatingThresholdTotalAmountPrice && newFloatingTieredPackagePrice == other.newFloatingTieredPackagePrice && newFloatingGroupedTieredPrice == other.newFloatingGroupedTieredPrice && newFloatingTieredWithMinimumPrice == other.newFloatingTieredWithMinimumPrice && newFloatingPackageWithAllocationPrice == other.newFloatingPackageWithAllocationPrice && newFloatingTieredPackageWithMinimumPrice == other.newFloatingTieredPackageWithMinimumPrice && newFloatingUnitWithPercentPrice == other.newFloatingUnitWithPercentPrice && newFloatingTieredWithProrationPrice == other.newFloatingTieredWithProrationPrice && newFloatingUnitWithProrationPrice == other.newFloatingUnitWithProrationPrice && newFloatingGroupedAllocationPrice == other.newFloatingGroupedAllocationPrice && newFloatingGroupedWithProratedMinimumPrice == other.newFloatingGroupedWithProratedMinimumPrice && newFloatingGroupedWithMeteredMinimumPrice == other.newFloatingGroupedWithMeteredMinimumPrice && newFloatingMatrixWithDisplayNamePrice == other.newFloatingMatrixWithDisplayNamePrice && newFloatingBulkWithProrationPrice == other.newFloatingBulkWithProrationPrice && newFloatingGroupedTieredPackagePrice == other.newFloatingGroupedTieredPackagePrice /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(newFloatingUnitPrice, newFloatingPackagePrice, newFloatingMatrixPrice, newFloatingMatrixWithAllocationPrice, newFloatingTieredPrice, newFloatingTieredBpsPrice, newFloatingBpsPrice, newFloatingBulkBpsPrice, newFloatingBulkPrice, newFloatingThresholdTotalAmountPrice, newFloatingTieredPackagePrice, newFloatingGroupedTieredPrice, newFloatingTieredWithMinimumPrice, newFloatingPackageWithAllocationPrice, newFloatingTieredPackageWithMinimumPrice, newFloatingUnitWithPercentPrice, newFloatingTieredWithProrationPrice, newFloatingUnitWithProrationPrice, newFloatingGroupedAllocationPrice, newFloatingGroupedWithProratedMinimumPrice, newFloatingGroupedWithMeteredMinimumPrice, newFloatingMatrixWithDisplayNamePrice, newFloatingBulkWithProrationPrice, newFloatingGroupedTieredPackagePrice) /* spotless:on */

        override fun toString(): String =
            when {
                newFloatingUnitPrice != null ->
                    "PriceCreateBody{newFloatingUnitPrice=$newFloatingUnitPrice}"
                newFloatingPackagePrice != null ->
                    "PriceCreateBody{newFloatingPackagePrice=$newFloatingPackagePrice}"
                newFloatingMatrixPrice != null ->
                    "PriceCreateBody{newFloatingMatrixPrice=$newFloatingMatrixPrice}"
                newFloatingMatrixWithAllocationPrice != null ->
                    "PriceCreateBody{newFloatingMatrixWithAllocationPrice=$newFloatingMatrixWithAllocationPrice}"
                newFloatingTieredPrice != null ->
                    "PriceCreateBody{newFloatingTieredPrice=$newFloatingTieredPrice}"
                newFloatingTieredBpsPrice != null ->
                    "PriceCreateBody{newFloatingTieredBpsPrice=$newFloatingTieredBpsPrice}"
                newFloatingBpsPrice != null ->
                    "PriceCreateBody{newFloatingBpsPrice=$newFloatingBpsPrice}"
                newFloatingBulkBpsPrice != null ->
                    "PriceCreateBody{newFloatingBulkBpsPrice=$newFloatingBulkBpsPrice}"
                newFloatingBulkPrice != null ->
                    "PriceCreateBody{newFloatingBulkPrice=$newFloatingBulkPrice}"
                newFloatingThresholdTotalAmountPrice != null ->
                    "PriceCreateBody{newFloatingThresholdTotalAmountPrice=$newFloatingThresholdTotalAmountPrice}"
                newFloatingTieredPackagePrice != null ->
                    "PriceCreateBody{newFloatingTieredPackagePrice=$newFloatingTieredPackagePrice}"
                newFloatingGroupedTieredPrice != null ->
                    "PriceCreateBody{newFloatingGroupedTieredPrice=$newFloatingGroupedTieredPrice}"
                newFloatingTieredWithMinimumPrice != null ->
                    "PriceCreateBody{newFloatingTieredWithMinimumPrice=$newFloatingTieredWithMinimumPrice}"
                newFloatingPackageWithAllocationPrice != null ->
                    "PriceCreateBody{newFloatingPackageWithAllocationPrice=$newFloatingPackageWithAllocationPrice}"
                newFloatingTieredPackageWithMinimumPrice != null ->
                    "PriceCreateBody{newFloatingTieredPackageWithMinimumPrice=$newFloatingTieredPackageWithMinimumPrice}"
                newFloatingUnitWithPercentPrice != null ->
                    "PriceCreateBody{newFloatingUnitWithPercentPrice=$newFloatingUnitWithPercentPrice}"
                newFloatingTieredWithProrationPrice != null ->
                    "PriceCreateBody{newFloatingTieredWithProrationPrice=$newFloatingTieredWithProrationPrice}"
                newFloatingUnitWithProrationPrice != null ->
                    "PriceCreateBody{newFloatingUnitWithProrationPrice=$newFloatingUnitWithProrationPrice}"
                newFloatingGroupedAllocationPrice != null ->
                    "PriceCreateBody{newFloatingGroupedAllocationPrice=$newFloatingGroupedAllocationPrice}"
                newFloatingGroupedWithProratedMinimumPrice != null ->
                    "PriceCreateBody{newFloatingGroupedWithProratedMinimumPrice=$newFloatingGroupedWithProratedMinimumPrice}"
                newFloatingGroupedWithMeteredMinimumPrice != null ->
                    "PriceCreateBody{newFloatingGroupedWithMeteredMinimumPrice=$newFloatingGroupedWithMeteredMinimumPrice}"
                newFloatingMatrixWithDisplayNamePrice != null ->
                    "PriceCreateBody{newFloatingMatrixWithDisplayNamePrice=$newFloatingMatrixWithDisplayNamePrice}"
                newFloatingBulkWithProrationPrice != null ->
                    "PriceCreateBody{newFloatingBulkWithProrationPrice=$newFloatingBulkWithProrationPrice}"
                newFloatingGroupedTieredPackagePrice != null ->
                    "PriceCreateBody{newFloatingGroupedTieredPackagePrice=$newFloatingGroupedTieredPackagePrice}"
                _json != null -> "PriceCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PriceCreateBody")
            }

        companion object {

            fun ofNewFloatingUnitPrice(newFloatingUnitPrice: NewFloatingUnitPrice) =
                PriceCreateBody(newFloatingUnitPrice = newFloatingUnitPrice)

            fun ofNewFloatingPackagePrice(newFloatingPackagePrice: NewFloatingPackagePrice) =
                PriceCreateBody(newFloatingPackagePrice = newFloatingPackagePrice)

            fun ofNewFloatingMatrixPrice(newFloatingMatrixPrice: NewFloatingMatrixPrice) =
                PriceCreateBody(newFloatingMatrixPrice = newFloatingMatrixPrice)

            fun ofNewFloatingMatrixWithAllocationPrice(
                newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
            ) =
                PriceCreateBody(
                    newFloatingMatrixWithAllocationPrice = newFloatingMatrixWithAllocationPrice
                )

            fun ofNewFloatingTieredPrice(newFloatingTieredPrice: NewFloatingTieredPrice) =
                PriceCreateBody(newFloatingTieredPrice = newFloatingTieredPrice)

            fun ofNewFloatingTieredBpsPrice(newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice) =
                PriceCreateBody(newFloatingTieredBpsPrice = newFloatingTieredBpsPrice)

            fun ofNewFloatingBpsPrice(newFloatingBpsPrice: NewFloatingBpsPrice) =
                PriceCreateBody(newFloatingBpsPrice = newFloatingBpsPrice)

            fun ofNewFloatingBulkBpsPrice(newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice) =
                PriceCreateBody(newFloatingBulkBpsPrice = newFloatingBulkBpsPrice)

            fun ofNewFloatingBulkPrice(newFloatingBulkPrice: NewFloatingBulkPrice) =
                PriceCreateBody(newFloatingBulkPrice = newFloatingBulkPrice)

            fun ofNewFloatingThresholdTotalAmountPrice(
                newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
            ) =
                PriceCreateBody(
                    newFloatingThresholdTotalAmountPrice = newFloatingThresholdTotalAmountPrice
                )

            fun ofNewFloatingTieredPackagePrice(
                newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice
            ) = PriceCreateBody(newFloatingTieredPackagePrice = newFloatingTieredPackagePrice)

            fun ofNewFloatingGroupedTieredPrice(
                newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice
            ) = PriceCreateBody(newFloatingGroupedTieredPrice = newFloatingGroupedTieredPrice)

            fun ofNewFloatingTieredWithMinimumPrice(
                newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
            ) =
                PriceCreateBody(
                    newFloatingTieredWithMinimumPrice = newFloatingTieredWithMinimumPrice
                )

            fun ofNewFloatingPackageWithAllocationPrice(
                newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
            ) =
                PriceCreateBody(
                    newFloatingPackageWithAllocationPrice = newFloatingPackageWithAllocationPrice
                )

            fun ofNewFloatingTieredPackageWithMinimumPrice(
                newFloatingTieredPackageWithMinimumPrice: NewFloatingTieredPackageWithMinimumPrice
            ) =
                PriceCreateBody(
                    newFloatingTieredPackageWithMinimumPrice =
                        newFloatingTieredPackageWithMinimumPrice
                )

            fun ofNewFloatingUnitWithPercentPrice(
                newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice
            ) = PriceCreateBody(newFloatingUnitWithPercentPrice = newFloatingUnitWithPercentPrice)

            fun ofNewFloatingTieredWithProrationPrice(
                newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
            ) =
                PriceCreateBody(
                    newFloatingTieredWithProrationPrice = newFloatingTieredWithProrationPrice
                )

            fun ofNewFloatingUnitWithProrationPrice(
                newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
            ) =
                PriceCreateBody(
                    newFloatingUnitWithProrationPrice = newFloatingUnitWithProrationPrice
                )

            fun ofNewFloatingGroupedAllocationPrice(
                newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice
            ) =
                PriceCreateBody(
                    newFloatingGroupedAllocationPrice = newFloatingGroupedAllocationPrice
                )

            fun ofNewFloatingGroupedWithProratedMinimumPrice(
                newFloatingGroupedWithProratedMinimumPrice:
                    NewFloatingGroupedWithProratedMinimumPrice
            ) =
                PriceCreateBody(
                    newFloatingGroupedWithProratedMinimumPrice =
                        newFloatingGroupedWithProratedMinimumPrice
                )

            fun ofNewFloatingGroupedWithMeteredMinimumPrice(
                newFloatingGroupedWithMeteredMinimumPrice: NewFloatingGroupedWithMeteredMinimumPrice
            ) =
                PriceCreateBody(
                    newFloatingGroupedWithMeteredMinimumPrice =
                        newFloatingGroupedWithMeteredMinimumPrice
                )

            fun ofNewFloatingMatrixWithDisplayNamePrice(
                newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice
            ) =
                PriceCreateBody(
                    newFloatingMatrixWithDisplayNamePrice = newFloatingMatrixWithDisplayNamePrice
                )

            fun ofNewFloatingBulkWithProrationPrice(
                newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice
            ) =
                PriceCreateBody(
                    newFloatingBulkWithProrationPrice = newFloatingBulkWithProrationPrice
                )

            fun ofNewFloatingGroupedTieredPackagePrice(
                newFloatingGroupedTieredPackagePrice: NewFloatingGroupedTieredPackagePrice
            ) =
                PriceCreateBody(
                    newFloatingGroupedTieredPackagePrice = newFloatingGroupedTieredPackagePrice
                )
        }

        interface Visitor<out T> {

            fun visitNewFloatingUnitPrice(newFloatingUnitPrice: NewFloatingUnitPrice): T

            fun visitNewFloatingPackagePrice(newFloatingPackagePrice: NewFloatingPackagePrice): T

            fun visitNewFloatingMatrixPrice(newFloatingMatrixPrice: NewFloatingMatrixPrice): T

            fun visitNewFloatingMatrixWithAllocationPrice(
                newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
            ): T

            fun visitNewFloatingTieredPrice(newFloatingTieredPrice: NewFloatingTieredPrice): T

            fun visitNewFloatingTieredBpsPrice(
                newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice
            ): T

            fun visitNewFloatingBpsPrice(newFloatingBpsPrice: NewFloatingBpsPrice): T

            fun visitNewFloatingBulkBpsPrice(newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice): T

            fun visitNewFloatingBulkPrice(newFloatingBulkPrice: NewFloatingBulkPrice): T

            fun visitNewFloatingThresholdTotalAmountPrice(
                newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
            ): T

            fun visitNewFloatingTieredPackagePrice(
                newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice
            ): T

            fun visitNewFloatingGroupedTieredPrice(
                newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice
            ): T

            fun visitNewFloatingTieredWithMinimumPrice(
                newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
            ): T

            fun visitNewFloatingPackageWithAllocationPrice(
                newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
            ): T

            fun visitNewFloatingTieredPackageWithMinimumPrice(
                newFloatingTieredPackageWithMinimumPrice: NewFloatingTieredPackageWithMinimumPrice
            ): T

            fun visitNewFloatingUnitWithPercentPrice(
                newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice
            ): T

            fun visitNewFloatingTieredWithProrationPrice(
                newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
            ): T

            fun visitNewFloatingUnitWithProrationPrice(
                newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
            ): T

            fun visitNewFloatingGroupedAllocationPrice(
                newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice
            ): T

            fun visitNewFloatingGroupedWithProratedMinimumPrice(
                newFloatingGroupedWithProratedMinimumPrice:
                    NewFloatingGroupedWithProratedMinimumPrice
            ): T

            fun visitNewFloatingGroupedWithMeteredMinimumPrice(
                newFloatingGroupedWithMeteredMinimumPrice: NewFloatingGroupedWithMeteredMinimumPrice
            ): T

            fun visitNewFloatingMatrixWithDisplayNamePrice(
                newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice
            ): T

            fun visitNewFloatingBulkWithProrationPrice(
                newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice
            ): T

            fun visitNewFloatingGroupedTieredPackagePrice(
                newFloatingGroupedTieredPackagePrice: NewFloatingGroupedTieredPackagePrice
            ): T

            fun unknown(json: JsonValue?): T {
                throw OrbInvalidDataException("Unknown PriceCreateBody: $json")
            }
        }

        class Deserializer : BaseDeserializer<PriceCreateBody>(PriceCreateBody::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): PriceCreateBody {
                val json = JsonValue.fromJsonNode(node)
                val modelType = json.asObject()?.get("model_type")?.asString()

                when (modelType) {
                    "unit" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingUnitPrice>())?.let {
                            return PriceCreateBody(newFloatingUnitPrice = it, _json = json)
                        }
                    }
                    "package" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingPackagePrice>())?.let {
                            return PriceCreateBody(newFloatingPackagePrice = it, _json = json)
                        }
                    }
                    "matrix" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixPrice>())?.let {
                            return PriceCreateBody(newFloatingMatrixPrice = it, _json = json)
                        }
                    }
                    "matrix_with_allocation" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingMatrixWithAllocationPrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingMatrixWithAllocationPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "tiered" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPrice>())?.let {
                            return PriceCreateBody(newFloatingTieredPrice = it, _json = json)
                        }
                    }
                    "tiered_bps" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingTieredBpsPrice>())?.let {
                            return PriceCreateBody(newFloatingTieredBpsPrice = it, _json = json)
                        }
                    }
                    "bps" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingBpsPrice>())?.let {
                            return PriceCreateBody(newFloatingBpsPrice = it, _json = json)
                        }
                    }
                    "bulk_bps" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingBulkBpsPrice>())?.let {
                            return PriceCreateBody(newFloatingBulkBpsPrice = it, _json = json)
                        }
                    }
                    "bulk" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingBulkPrice>())?.let {
                            return PriceCreateBody(newFloatingBulkPrice = it, _json = json)
                        }
                    }
                    "threshold_total_amount" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingThresholdTotalAmountPrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingThresholdTotalAmountPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "tiered_package" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingTieredPackagePrice>())?.let {
                            return PriceCreateBody(newFloatingTieredPackagePrice = it, _json = json)
                        }
                    }
                    "grouped_tiered" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingGroupedTieredPrice>())?.let {
                            return PriceCreateBody(newFloatingGroupedTieredPrice = it, _json = json)
                        }
                    }
                    "tiered_with_minimum" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingTieredWithMinimumPrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingTieredWithMinimumPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "package_with_allocation" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingPackageWithAllocationPrice>()
                            )
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingPackageWithAllocationPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "tiered_package_with_minimum" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingTieredPackageWithMinimumPrice>()
                            )
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingTieredPackageWithMinimumPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "unit_with_percent" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingUnitWithPercentPrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingUnitWithPercentPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "tiered_with_proration" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingTieredWithProrationPrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingTieredWithProrationPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "unit_with_proration" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingUnitWithProrationPrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingUnitWithProrationPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "grouped_allocation" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingGroupedAllocationPrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingGroupedAllocationPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "grouped_with_prorated_minimum" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingGroupedWithProratedMinimumPrice>()
                            )
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingGroupedWithProratedMinimumPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "grouped_with_metered_minimum" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingGroupedWithMeteredMinimumPrice>()
                            )
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingGroupedWithMeteredMinimumPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "matrix_with_display_name" -> {
                        tryDeserialize(
                                node,
                                jacksonTypeRef<NewFloatingMatrixWithDisplayNamePrice>()
                            )
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingMatrixWithDisplayNamePrice = it,
                                    _json = json
                                )
                            }
                    }
                    "bulk_with_proration" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingBulkWithProrationPrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingBulkWithProrationPrice = it,
                                    _json = json
                                )
                            }
                    }
                    "grouped_tiered_package" -> {
                        tryDeserialize(node, jacksonTypeRef<NewFloatingGroupedTieredPackagePrice>())
                            ?.let {
                                return PriceCreateBody(
                                    newFloatingGroupedTieredPackagePrice = it,
                                    _json = json
                                )
                            }
                    }
                }

                return PriceCreateBody(_json = json)
            }
        }

        class Serializer : BaseSerializer<PriceCreateBody>(PriceCreateBody::class) {

            override fun serialize(
                value: PriceCreateBody,
                generator: JsonGenerator,
                provider: SerializerProvider
            ) {
                when {
                    value.newFloatingUnitPrice != null ->
                        generator.writeObject(value.newFloatingUnitPrice)
                    value.newFloatingPackagePrice != null ->
                        generator.writeObject(value.newFloatingPackagePrice)
                    value.newFloatingMatrixPrice != null ->
                        generator.writeObject(value.newFloatingMatrixPrice)
                    value.newFloatingMatrixWithAllocationPrice != null ->
                        generator.writeObject(value.newFloatingMatrixWithAllocationPrice)
                    value.newFloatingTieredPrice != null ->
                        generator.writeObject(value.newFloatingTieredPrice)
                    value.newFloatingTieredBpsPrice != null ->
                        generator.writeObject(value.newFloatingTieredBpsPrice)
                    value.newFloatingBpsPrice != null ->
                        generator.writeObject(value.newFloatingBpsPrice)
                    value.newFloatingBulkBpsPrice != null ->
                        generator.writeObject(value.newFloatingBulkBpsPrice)
                    value.newFloatingBulkPrice != null ->
                        generator.writeObject(value.newFloatingBulkPrice)
                    value.newFloatingThresholdTotalAmountPrice != null ->
                        generator.writeObject(value.newFloatingThresholdTotalAmountPrice)
                    value.newFloatingTieredPackagePrice != null ->
                        generator.writeObject(value.newFloatingTieredPackagePrice)
                    value.newFloatingGroupedTieredPrice != null ->
                        generator.writeObject(value.newFloatingGroupedTieredPrice)
                    value.newFloatingTieredWithMinimumPrice != null ->
                        generator.writeObject(value.newFloatingTieredWithMinimumPrice)
                    value.newFloatingPackageWithAllocationPrice != null ->
                        generator.writeObject(value.newFloatingPackageWithAllocationPrice)
                    value.newFloatingTieredPackageWithMinimumPrice != null ->
                        generator.writeObject(value.newFloatingTieredPackageWithMinimumPrice)
                    value.newFloatingUnitWithPercentPrice != null ->
                        generator.writeObject(value.newFloatingUnitWithPercentPrice)
                    value.newFloatingTieredWithProrationPrice != null ->
                        generator.writeObject(value.newFloatingTieredWithProrationPrice)
                    value.newFloatingUnitWithProrationPrice != null ->
                        generator.writeObject(value.newFloatingUnitWithProrationPrice)
                    value.newFloatingGroupedAllocationPrice != null ->
                        generator.writeObject(value.newFloatingGroupedAllocationPrice)
                    value.newFloatingGroupedWithProratedMinimumPrice != null ->
                        generator.writeObject(value.newFloatingGroupedWithProratedMinimumPrice)
                    value.newFloatingGroupedWithMeteredMinimumPrice != null ->
                        generator.writeObject(value.newFloatingGroupedWithMeteredMinimumPrice)
                    value.newFloatingMatrixWithDisplayNamePrice != null ->
                        generator.writeObject(value.newFloatingMatrixWithDisplayNamePrice)
                    value.newFloatingBulkWithProrationPrice != null ->
                        generator.writeObject(value.newFloatingBulkWithProrationPrice)
                    value.newFloatingGroupedTieredPackagePrice != null ->
                        generator.writeObject(value.newFloatingGroupedTieredPackagePrice)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PriceCreateBody")
                }
            }
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: PriceCreateBody? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(priceCreateParams: PriceCreateParams) = apply {
            body = priceCreateParams.body
            additionalHeaders = priceCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = priceCreateParams.additionalQueryParams.toBuilder()
        }

        fun forNewFloatingUnitPrice(newFloatingUnitPrice: NewFloatingUnitPrice) = apply {
            body = PriceCreateBody.ofNewFloatingUnitPrice(newFloatingUnitPrice)
        }

        fun forNewFloatingPackagePrice(newFloatingPackagePrice: NewFloatingPackagePrice) = apply {
            body = PriceCreateBody.ofNewFloatingPackagePrice(newFloatingPackagePrice)
        }

        fun forNewFloatingMatrixPrice(newFloatingMatrixPrice: NewFloatingMatrixPrice) = apply {
            body = PriceCreateBody.ofNewFloatingMatrixPrice(newFloatingMatrixPrice)
        }

        fun forNewFloatingMatrixWithAllocationPrice(
            newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingMatrixWithAllocationPrice(
                    newFloatingMatrixWithAllocationPrice
                )
        }

        fun forNewFloatingTieredPrice(newFloatingTieredPrice: NewFloatingTieredPrice) = apply {
            body = PriceCreateBody.ofNewFloatingTieredPrice(newFloatingTieredPrice)
        }

        fun forNewFloatingTieredBpsPrice(newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice) =
            apply {
                body = PriceCreateBody.ofNewFloatingTieredBpsPrice(newFloatingTieredBpsPrice)
            }

        fun forNewFloatingBpsPrice(newFloatingBpsPrice: NewFloatingBpsPrice) = apply {
            body = PriceCreateBody.ofNewFloatingBpsPrice(newFloatingBpsPrice)
        }

        fun forNewFloatingBulkBpsPrice(newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice) = apply {
            body = PriceCreateBody.ofNewFloatingBulkBpsPrice(newFloatingBulkBpsPrice)
        }

        fun forNewFloatingBulkPrice(newFloatingBulkPrice: NewFloatingBulkPrice) = apply {
            body = PriceCreateBody.ofNewFloatingBulkPrice(newFloatingBulkPrice)
        }

        fun forNewFloatingThresholdTotalAmountPrice(
            newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingThresholdTotalAmountPrice(
                    newFloatingThresholdTotalAmountPrice
                )
        }

        fun forNewFloatingTieredPackagePrice(
            newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice
        ) = apply {
            body = PriceCreateBody.ofNewFloatingTieredPackagePrice(newFloatingTieredPackagePrice)
        }

        fun forNewFloatingGroupedTieredPrice(
            newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice
        ) = apply {
            body = PriceCreateBody.ofNewFloatingGroupedTieredPrice(newFloatingGroupedTieredPrice)
        }

        fun forNewFloatingTieredWithMinimumPrice(
            newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingTieredWithMinimumPrice(
                    newFloatingTieredWithMinimumPrice
                )
        }

        fun forNewFloatingPackageWithAllocationPrice(
            newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingPackageWithAllocationPrice(
                    newFloatingPackageWithAllocationPrice
                )
        }

        fun forNewFloatingTieredPackageWithMinimumPrice(
            newFloatingTieredPackageWithMinimumPrice: NewFloatingTieredPackageWithMinimumPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingTieredPackageWithMinimumPrice(
                    newFloatingTieredPackageWithMinimumPrice
                )
        }

        fun forNewFloatingUnitWithPercentPrice(
            newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingUnitWithPercentPrice(newFloatingUnitWithPercentPrice)
        }

        fun forNewFloatingTieredWithProrationPrice(
            newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingTieredWithProrationPrice(
                    newFloatingTieredWithProrationPrice
                )
        }

        fun forNewFloatingUnitWithProrationPrice(
            newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingUnitWithProrationPrice(
                    newFloatingUnitWithProrationPrice
                )
        }

        fun forNewFloatingGroupedAllocationPrice(
            newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingGroupedAllocationPrice(
                    newFloatingGroupedAllocationPrice
                )
        }

        fun forNewFloatingGroupedWithProratedMinimumPrice(
            newFloatingGroupedWithProratedMinimumPrice: NewFloatingGroupedWithProratedMinimumPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingGroupedWithProratedMinimumPrice(
                    newFloatingGroupedWithProratedMinimumPrice
                )
        }

        fun forNewFloatingGroupedWithMeteredMinimumPrice(
            newFloatingGroupedWithMeteredMinimumPrice: NewFloatingGroupedWithMeteredMinimumPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingGroupedWithMeteredMinimumPrice(
                    newFloatingGroupedWithMeteredMinimumPrice
                )
        }

        fun forNewFloatingMatrixWithDisplayNamePrice(
            newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingMatrixWithDisplayNamePrice(
                    newFloatingMatrixWithDisplayNamePrice
                )
        }

        fun forNewFloatingBulkWithProrationPrice(
            newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingBulkWithProrationPrice(
                    newFloatingBulkWithProrationPrice
                )
        }

        fun forNewFloatingGroupedTieredPackagePrice(
            newFloatingGroupedTieredPackagePrice: NewFloatingGroupedTieredPackagePrice
        ) = apply {
            body =
                PriceCreateBody.ofNewFloatingGroupedTieredPackagePrice(
                    newFloatingGroupedTieredPackagePrice
                )
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

        fun build(): PriceCreateParams =
            PriceCreateParams(
                body ?: PriceCreateBody(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class NewFloatingUnitPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("unit_config") private val unitConfig: UnitConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("unit_config") fun unitConfig(): UnitConfig = unitConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var unitConfig: UnitConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingUnitPrice: NewFloatingUnitPrice) = apply {
                metadata = newFloatingUnitPrice.metadata
                externalPriceId = newFloatingUnitPrice.externalPriceId
                name = newFloatingUnitPrice.name
                billableMetricId = newFloatingUnitPrice.billableMetricId
                itemId = newFloatingUnitPrice.itemId
                billedInAdvance = newFloatingUnitPrice.billedInAdvance
                fixedPriceQuantity = newFloatingUnitPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingUnitPrice.invoiceGroupingKey
                cadence = newFloatingUnitPrice.cadence
                billingCycleConfiguration = newFloatingUnitPrice.billingCycleConfiguration
                invoicingCycleConfiguration = newFloatingUnitPrice.invoicingCycleConfiguration
                conversionRate = newFloatingUnitPrice.conversionRate
                modelType = newFloatingUnitPrice.modelType
                unitConfig = newFloatingUnitPrice.unitConfig
                currency = newFloatingUnitPrice.currency
                additionalProperties = newFloatingUnitPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun unitConfig(unitConfig: UnitConfig) = apply { this.unitConfig = unitConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingUnitPrice =
                NewFloatingUnitPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(unitConfig) { "`unitConfig` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val UNIT = of("unit")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                UNIT,
            }

            enum class Value {
                UNIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNIT -> Value.UNIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNIT -> Known.UNIT
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class UnitConfig
        @JsonCreator
        private constructor(
            @JsonProperty("unit_amount") private val unitAmount: String,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Rate per unit of usage */
            @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var unitAmount: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitConfig: UnitConfig) = apply {
                    unitAmount = unitConfig.unitAmount
                    additionalProperties = unitConfig.additionalProperties.toMutableMap()
                }

                /** Rate per unit of usage */
                fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

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

                fun build(): UnitConfig =
                    UnitConfig(
                        checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                        additionalProperties.toImmutable()
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitConfig && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(unitAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnitConfig{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingUnitPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && unitConfig == other.unitConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, unitConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingUnitPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, unitConfig=$unitConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingPackagePrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("package_config") private val packageConfig: PackageConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("package_config") fun packageConfig(): PackageConfig = packageConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var packageConfig: PackageConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingPackagePrice: NewFloatingPackagePrice) = apply {
                metadata = newFloatingPackagePrice.metadata
                externalPriceId = newFloatingPackagePrice.externalPriceId
                name = newFloatingPackagePrice.name
                billableMetricId = newFloatingPackagePrice.billableMetricId
                itemId = newFloatingPackagePrice.itemId
                billedInAdvance = newFloatingPackagePrice.billedInAdvance
                fixedPriceQuantity = newFloatingPackagePrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingPackagePrice.invoiceGroupingKey
                cadence = newFloatingPackagePrice.cadence
                billingCycleConfiguration = newFloatingPackagePrice.billingCycleConfiguration
                invoicingCycleConfiguration = newFloatingPackagePrice.invoicingCycleConfiguration
                conversionRate = newFloatingPackagePrice.conversionRate
                modelType = newFloatingPackagePrice.modelType
                packageConfig = newFloatingPackagePrice.packageConfig
                currency = newFloatingPackagePrice.currency
                additionalProperties = newFloatingPackagePrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun packageConfig(packageConfig: PackageConfig) = apply {
                this.packageConfig = packageConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingPackagePrice =
                NewFloatingPackagePrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(packageConfig) { "`packageConfig` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PACKAGE = of("package")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                PACKAGE,
            }

            enum class Value {
                PACKAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PACKAGE -> Value.PACKAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PACKAGE -> Known.PACKAGE
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class PackageConfig
        @JsonCreator
        private constructor(
            @JsonProperty("package_amount") private val packageAmount: String,
            @JsonProperty("package_size") private val packageSize: Long,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** A currency amount to rate usage by */
            @JsonProperty("package_amount") fun packageAmount(): String = packageAmount

            /**
             * An integer amount to represent package size. For example, 1000 here would divide
             * usage by 1000 before multiplying by package_amount in rating
             */
            @JsonProperty("package_size") fun packageSize(): Long = packageSize

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var packageAmount: String? = null
                private var packageSize: Long? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(packageConfig: PackageConfig) = apply {
                    packageAmount = packageConfig.packageAmount
                    packageSize = packageConfig.packageSize
                    additionalProperties = packageConfig.additionalProperties.toMutableMap()
                }

                /** A currency amount to rate usage by */
                fun packageAmount(packageAmount: String) = apply {
                    this.packageAmount = packageAmount
                }

                /**
                 * An integer amount to represent package size. For example, 1000 here would divide
                 * usage by 1000 before multiplying by package_amount in rating
                 */
                fun packageSize(packageSize: Long) = apply { this.packageSize = packageSize }

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

                fun build(): PackageConfig =
                    PackageConfig(
                        checkNotNull(packageAmount) {
                            "`packageAmount` is required but was not set"
                        },
                        checkNotNull(packageSize) { "`packageSize` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PackageConfig && packageAmount == other.packageAmount && packageSize == other.packageSize && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(packageAmount, packageSize, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PackageConfig{packageAmount=$packageAmount, packageSize=$packageSize, additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingPackagePrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && packageConfig == other.packageConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, packageConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingPackagePrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, packageConfig=$packageConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingMatrixPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("matrix_config") private val matrixConfig: MatrixConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("matrix_config") fun matrixConfig(): MatrixConfig = matrixConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var matrixConfig: MatrixConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingMatrixPrice: NewFloatingMatrixPrice) = apply {
                metadata = newFloatingMatrixPrice.metadata
                externalPriceId = newFloatingMatrixPrice.externalPriceId
                name = newFloatingMatrixPrice.name
                billableMetricId = newFloatingMatrixPrice.billableMetricId
                itemId = newFloatingMatrixPrice.itemId
                billedInAdvance = newFloatingMatrixPrice.billedInAdvance
                fixedPriceQuantity = newFloatingMatrixPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingMatrixPrice.invoiceGroupingKey
                cadence = newFloatingMatrixPrice.cadence
                billingCycleConfiguration = newFloatingMatrixPrice.billingCycleConfiguration
                invoicingCycleConfiguration = newFloatingMatrixPrice.invoicingCycleConfiguration
                conversionRate = newFloatingMatrixPrice.conversionRate
                modelType = newFloatingMatrixPrice.modelType
                matrixConfig = newFloatingMatrixPrice.matrixConfig
                currency = newFloatingMatrixPrice.currency
                additionalProperties = newFloatingMatrixPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun matrixConfig(matrixConfig: MatrixConfig) = apply {
                this.matrixConfig = matrixConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingMatrixPrice =
                NewFloatingMatrixPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(matrixConfig) { "`matrixConfig` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class MatrixConfig
        @JsonCreator
        private constructor(
            @JsonProperty("dimensions") private val dimensions: List<String?>,
            @JsonProperty("default_unit_amount") private val defaultUnitAmount: String,
            @JsonProperty("matrix_values") private val matrixValues: List<MatrixValue>,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** One or two event property values to evaluate matrix groups by */
            @JsonProperty("dimensions") fun dimensions(): List<String?> = dimensions

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            @JsonProperty("default_unit_amount") fun defaultUnitAmount(): String = defaultUnitAmount

            /** Matrix values for specified matrix grouping keys */
            @JsonProperty("matrix_values") fun matrixValues(): List<MatrixValue> = matrixValues

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var dimensions: MutableList<String?>? = null
                private var defaultUnitAmount: String? = null
                private var matrixValues: MutableList<MatrixValue>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixConfig: MatrixConfig) = apply {
                    dimensions = matrixConfig.dimensions.toMutableList()
                    defaultUnitAmount = matrixConfig.defaultUnitAmount
                    matrixValues = matrixConfig.matrixValues.toMutableList()
                    additionalProperties = matrixConfig.additionalProperties.toMutableMap()
                }

                /** One or two event property values to evaluate matrix groups by */
                fun dimensions(dimensions: List<String?>) = apply {
                    this.dimensions = dimensions.toMutableList()
                }

                /** One or two event property values to evaluate matrix groups by */
                fun addDimension(dimension: String) = apply {
                    dimensions = (dimensions ?: mutableListOf()).apply { add(dimension) }
                }

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                fun defaultUnitAmount(defaultUnitAmount: String) = apply {
                    this.defaultUnitAmount = defaultUnitAmount
                }

                /** Matrix values for specified matrix grouping keys */
                fun matrixValues(matrixValues: List<MatrixValue>) = apply {
                    this.matrixValues = matrixValues.toMutableList()
                }

                /** Matrix values for specified matrix grouping keys */
                fun addMatrixValue(matrixValue: MatrixValue) = apply {
                    matrixValues = (matrixValues ?: mutableListOf()).apply { add(matrixValue) }
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

                fun build(): MatrixConfig =
                    MatrixConfig(
                        checkNotNull(dimensions) { "`dimensions` is required but was not set" }
                            .toImmutable(),
                        checkNotNull(defaultUnitAmount) {
                            "`defaultUnitAmount` is required but was not set"
                        },
                        checkNotNull(matrixValues) { "`matrixValues` is required but was not set" }
                            .toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class MatrixValue
            @JsonCreator
            private constructor(
                @JsonProperty("unit_amount") private val unitAmount: String,
                @JsonProperty("dimension_values") private val dimensionValues: List<String?>,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Unit price for the specified dimension_values */
                @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                @JsonProperty("dimension_values")
                fun dimensionValues(): List<String?> = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: String? = null
                    private var dimensionValues: MutableList<String?>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixValue: MatrixValue) = apply {
                        unitAmount = matrixValue.unitAmount
                        dimensionValues = matrixValue.dimensionValues.toMutableList()
                        additionalProperties = matrixValue.additionalProperties.toMutableMap()
                    }

                    /** Unit price for the specified dimension_values */
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    fun dimensionValues(dimensionValues: List<String?>) = apply {
                        this.dimensionValues = dimensionValues.toMutableList()
                    }

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    fun addDimensionValue(dimensionValue: String) = apply {
                        dimensionValues =
                            (dimensionValues ?: mutableListOf()).apply { add(dimensionValue) }
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

                    fun build(): MatrixValue =
                        MatrixValue(
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            checkNotNull(dimensionValues) {
                                    "`dimensionValues` is required but was not set"
                                }
                                .toImmutable(),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixValue && unitAmount == other.unitAmount && dimensionValues == other.dimensionValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(unitAmount, dimensionValues, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixConfig && dimensions == other.dimensions && defaultUnitAmount == other.defaultUnitAmount && matrixValues == other.matrixValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(dimensions, defaultUnitAmount, matrixValues, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MATRIX = of("matrix")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                MATRIX,
            }

            enum class Value {
                MATRIX,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MATRIX -> Value.MATRIX
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MATRIX -> Known.MATRIX
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingMatrixPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && matrixConfig == other.matrixConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, matrixConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingMatrixPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, matrixConfig=$matrixConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingMatrixWithAllocationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("matrix_with_allocation_config")
        private val matrixWithAllocationConfig: MatrixWithAllocationConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("matrix_with_allocation_config")
        fun matrixWithAllocationConfig(): MatrixWithAllocationConfig = matrixWithAllocationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var matrixWithAllocationConfig: MatrixWithAllocationConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
            ) = apply {
                metadata = newFloatingMatrixWithAllocationPrice.metadata
                externalPriceId = newFloatingMatrixWithAllocationPrice.externalPriceId
                name = newFloatingMatrixWithAllocationPrice.name
                billableMetricId = newFloatingMatrixWithAllocationPrice.billableMetricId
                itemId = newFloatingMatrixWithAllocationPrice.itemId
                billedInAdvance = newFloatingMatrixWithAllocationPrice.billedInAdvance
                fixedPriceQuantity = newFloatingMatrixWithAllocationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingMatrixWithAllocationPrice.invoiceGroupingKey
                cadence = newFloatingMatrixWithAllocationPrice.cadence
                billingCycleConfiguration =
                    newFloatingMatrixWithAllocationPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingMatrixWithAllocationPrice.invoicingCycleConfiguration
                conversionRate = newFloatingMatrixWithAllocationPrice.conversionRate
                modelType = newFloatingMatrixWithAllocationPrice.modelType
                matrixWithAllocationConfig =
                    newFloatingMatrixWithAllocationPrice.matrixWithAllocationConfig
                currency = newFloatingMatrixWithAllocationPrice.currency
                additionalProperties =
                    newFloatingMatrixWithAllocationPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun matrixWithAllocationConfig(matrixWithAllocationConfig: MatrixWithAllocationConfig) =
                apply {
                    this.matrixWithAllocationConfig = matrixWithAllocationConfig
                }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingMatrixWithAllocationPrice =
                NewFloatingMatrixWithAllocationPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(matrixWithAllocationConfig) {
                        "`matrixWithAllocationConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class MatrixWithAllocationConfig
        @JsonCreator
        private constructor(
            @JsonProperty("dimensions") private val dimensions: List<String?>,
            @JsonProperty("default_unit_amount") private val defaultUnitAmount: String,
            @JsonProperty("matrix_values") private val matrixValues: List<MatrixValue>,
            @JsonProperty("allocation") private val allocation: Double,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** One or two event property values to evaluate matrix groups by */
            @JsonProperty("dimensions") fun dimensions(): List<String?> = dimensions

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            @JsonProperty("default_unit_amount") fun defaultUnitAmount(): String = defaultUnitAmount

            /** Matrix values for specified matrix grouping keys */
            @JsonProperty("matrix_values") fun matrixValues(): List<MatrixValue> = matrixValues

            /** Allocation to be used to calculate the price */
            @JsonProperty("allocation") fun allocation(): Double = allocation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var dimensions: MutableList<String?>? = null
                private var defaultUnitAmount: String? = null
                private var matrixValues: MutableList<MatrixValue>? = null
                private var allocation: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixWithAllocationConfig: MatrixWithAllocationConfig) = apply {
                    dimensions = matrixWithAllocationConfig.dimensions.toMutableList()
                    defaultUnitAmount = matrixWithAllocationConfig.defaultUnitAmount
                    matrixValues = matrixWithAllocationConfig.matrixValues.toMutableList()
                    allocation = matrixWithAllocationConfig.allocation
                    additionalProperties =
                        matrixWithAllocationConfig.additionalProperties.toMutableMap()
                }

                /** One or two event property values to evaluate matrix groups by */
                fun dimensions(dimensions: List<String?>) = apply {
                    this.dimensions = dimensions.toMutableList()
                }

                /** One or two event property values to evaluate matrix groups by */
                fun addDimension(dimension: String) = apply {
                    dimensions = (dimensions ?: mutableListOf()).apply { add(dimension) }
                }

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                fun defaultUnitAmount(defaultUnitAmount: String) = apply {
                    this.defaultUnitAmount = defaultUnitAmount
                }

                /** Matrix values for specified matrix grouping keys */
                fun matrixValues(matrixValues: List<MatrixValue>) = apply {
                    this.matrixValues = matrixValues.toMutableList()
                }

                /** Matrix values for specified matrix grouping keys */
                fun addMatrixValue(matrixValue: MatrixValue) = apply {
                    matrixValues = (matrixValues ?: mutableListOf()).apply { add(matrixValue) }
                }

                /** Allocation to be used to calculate the price */
                fun allocation(allocation: Double) = apply { this.allocation = allocation }

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

                fun build(): MatrixWithAllocationConfig =
                    MatrixWithAllocationConfig(
                        checkNotNull(dimensions) { "`dimensions` is required but was not set" }
                            .toImmutable(),
                        checkNotNull(defaultUnitAmount) {
                            "`defaultUnitAmount` is required but was not set"
                        },
                        checkNotNull(matrixValues) { "`matrixValues` is required but was not set" }
                            .toImmutable(),
                        checkNotNull(allocation) { "`allocation` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class MatrixValue
            @JsonCreator
            private constructor(
                @JsonProperty("unit_amount") private val unitAmount: String,
                @JsonProperty("dimension_values") private val dimensionValues: List<String?>,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Unit price for the specified dimension_values */
                @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                @JsonProperty("dimension_values")
                fun dimensionValues(): List<String?> = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: String? = null
                    private var dimensionValues: MutableList<String?>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixValue: MatrixValue) = apply {
                        unitAmount = matrixValue.unitAmount
                        dimensionValues = matrixValue.dimensionValues.toMutableList()
                        additionalProperties = matrixValue.additionalProperties.toMutableMap()
                    }

                    /** Unit price for the specified dimension_values */
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    fun dimensionValues(dimensionValues: List<String?>) = apply {
                        this.dimensionValues = dimensionValues.toMutableList()
                    }

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    fun addDimensionValue(dimensionValue: String) = apply {
                        dimensionValues =
                            (dimensionValues ?: mutableListOf()).apply { add(dimensionValue) }
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

                    fun build(): MatrixValue =
                        MatrixValue(
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            checkNotNull(dimensionValues) {
                                    "`dimensionValues` is required but was not set"
                                }
                                .toImmutable(),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixValue && unitAmount == other.unitAmount && dimensionValues == other.dimensionValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(unitAmount, dimensionValues, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixWithAllocationConfig && dimensions == other.dimensions && defaultUnitAmount == other.defaultUnitAmount && matrixValues == other.matrixValues && allocation == other.allocation && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(dimensions, defaultUnitAmount, matrixValues, allocation, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixWithAllocationConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, allocation=$allocation, additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MATRIX_WITH_ALLOCATION = of("matrix_with_allocation")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                MATRIX_WITH_ALLOCATION,
            }

            enum class Value {
                MATRIX_WITH_ALLOCATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MATRIX_WITH_ALLOCATION -> Value.MATRIX_WITH_ALLOCATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MATRIX_WITH_ALLOCATION -> Known.MATRIX_WITH_ALLOCATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingMatrixWithAllocationPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && matrixWithAllocationConfig == other.matrixWithAllocationConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, matrixWithAllocationConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingMatrixWithAllocationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, matrixWithAllocationConfig=$matrixWithAllocationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("tiered_config") private val tieredConfig: TieredConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("tiered_config") fun tieredConfig(): TieredConfig = tieredConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var tieredConfig: TieredConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingTieredPrice: NewFloatingTieredPrice) = apply {
                metadata = newFloatingTieredPrice.metadata
                externalPriceId = newFloatingTieredPrice.externalPriceId
                name = newFloatingTieredPrice.name
                billableMetricId = newFloatingTieredPrice.billableMetricId
                itemId = newFloatingTieredPrice.itemId
                billedInAdvance = newFloatingTieredPrice.billedInAdvance
                fixedPriceQuantity = newFloatingTieredPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredPrice.invoiceGroupingKey
                cadence = newFloatingTieredPrice.cadence
                billingCycleConfiguration = newFloatingTieredPrice.billingCycleConfiguration
                invoicingCycleConfiguration = newFloatingTieredPrice.invoicingCycleConfiguration
                conversionRate = newFloatingTieredPrice.conversionRate
                modelType = newFloatingTieredPrice.modelType
                tieredConfig = newFloatingTieredPrice.tieredConfig
                currency = newFloatingTieredPrice.currency
                additionalProperties = newFloatingTieredPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun tieredConfig(tieredConfig: TieredConfig) = apply {
                this.tieredConfig = tieredConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingTieredPrice =
                NewFloatingTieredPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(tieredConfig) { "`tieredConfig` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TIERED = of("tiered")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED,
            }

            enum class Value {
                TIERED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED -> Value.TIERED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED -> Known.TIERED
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class TieredConfig
        @JsonCreator
        private constructor(
            @JsonProperty("tiers") private val tiers: List<Tier>,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Tiers for rating based on total usage quantities into the specified tier */
            @JsonProperty("tiers") fun tiers(): List<Tier> = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: MutableList<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredConfig: TieredConfig) = apply {
                    tiers = tieredConfig.tiers.toMutableList()
                    additionalProperties = tieredConfig.additionalProperties.toMutableMap()
                }

                /** Tiers for rating based on total usage quantities into the specified tier */
                fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers.toMutableList() }

                /** Tiers for rating based on total usage quantities into the specified tier */
                fun addTier(tier: Tier) = apply {
                    tiers = (tiers ?: mutableListOf()).apply { add(tier) }
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

                fun build(): TieredConfig =
                    TieredConfig(
                        checkNotNull(tiers) { "`tiers` is required but was not set" }.toImmutable(),
                        additionalProperties.toImmutable()
                    )
            }

            @NoAutoDetect
            class Tier
            @JsonCreator
            private constructor(
                @JsonProperty("first_unit") private val firstUnit: Double,
                @JsonProperty("last_unit") private val lastUnit: Double?,
                @JsonProperty("unit_amount") private val unitAmount: String,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Inclusive tier starting value */
                @JsonProperty("first_unit") fun firstUnit(): Double = firstUnit

                /** Exclusive tier ending value. If null, this is treated as the last tier */
                @JsonProperty("last_unit") fun lastUnit(): Double? = lastUnit

                /** Amount per unit */
                @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var firstUnit: Double? = null
                    private var lastUnit: Double? = null
                    private var unitAmount: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        firstUnit = tier.firstUnit
                        lastUnit = tier.lastUnit
                        unitAmount = tier.unitAmount
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Inclusive tier starting value */
                    fun firstUnit(firstUnit: Double) = apply { this.firstUnit = firstUnit }

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    fun lastUnit(lastUnit: Double) = apply { this.lastUnit = lastUnit }

                    /** Amount per unit */
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

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

                    fun build(): Tier =
                        Tier(
                            checkNotNull(firstUnit) { "`firstUnit` is required but was not set" },
                            lastUnit,
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && firstUnit == other.firstUnit && lastUnit == other.lastUnit && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(firstUnit, lastUnit, unitAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredConfig && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TieredConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && tieredConfig == other.tieredConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredConfig=$tieredConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredBpsPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("tiered_bps_config") private val tieredBpsConfig: TieredBpsConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("tiered_bps_config") fun tieredBpsConfig(): TieredBpsConfig = tieredBpsConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var tieredBpsConfig: TieredBpsConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice) = apply {
                metadata = newFloatingTieredBpsPrice.metadata
                externalPriceId = newFloatingTieredBpsPrice.externalPriceId
                name = newFloatingTieredBpsPrice.name
                billableMetricId = newFloatingTieredBpsPrice.billableMetricId
                itemId = newFloatingTieredBpsPrice.itemId
                billedInAdvance = newFloatingTieredBpsPrice.billedInAdvance
                fixedPriceQuantity = newFloatingTieredBpsPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredBpsPrice.invoiceGroupingKey
                cadence = newFloatingTieredBpsPrice.cadence
                billingCycleConfiguration = newFloatingTieredBpsPrice.billingCycleConfiguration
                invoicingCycleConfiguration = newFloatingTieredBpsPrice.invoicingCycleConfiguration
                conversionRate = newFloatingTieredBpsPrice.conversionRate
                modelType = newFloatingTieredBpsPrice.modelType
                tieredBpsConfig = newFloatingTieredBpsPrice.tieredBpsConfig
                currency = newFloatingTieredBpsPrice.currency
                additionalProperties = newFloatingTieredBpsPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun tieredBpsConfig(tieredBpsConfig: TieredBpsConfig) = apply {
                this.tieredBpsConfig = tieredBpsConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingTieredBpsPrice =
                NewFloatingTieredBpsPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(tieredBpsConfig) {
                        "`tieredBpsConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TIERED_BPS = of("tiered_bps")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_BPS,
            }

            enum class Value {
                TIERED_BPS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_BPS -> Value.TIERED_BPS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_BPS -> Known.TIERED_BPS
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class TieredBpsConfig
        @JsonCreator
        private constructor(
            @JsonProperty("tiers") private val tiers: List<Tier>,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers
             */
            @JsonProperty("tiers") fun tiers(): List<Tier> = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: MutableList<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredBpsConfig: TieredBpsConfig) = apply {
                    tiers = tieredBpsConfig.tiers.toMutableList()
                    additionalProperties = tieredBpsConfig.additionalProperties.toMutableMap()
                }

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers.toMutableList() }

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                fun addTier(tier: Tier) = apply {
                    tiers = (tiers ?: mutableListOf()).apply { add(tier) }
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

                fun build(): TieredBpsConfig =
                    TieredBpsConfig(
                        checkNotNull(tiers) { "`tiers` is required but was not set" }.toImmutable(),
                        additionalProperties.toImmutable()
                    )
            }

            @NoAutoDetect
            class Tier
            @JsonCreator
            private constructor(
                @JsonProperty("minimum_amount") private val minimumAmount: String,
                @JsonProperty("maximum_amount") private val maximumAmount: String?,
                @JsonProperty("bps") private val bps: Double,
                @JsonProperty("per_unit_maximum") private val perUnitMaximum: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Inclusive tier starting value */
                @JsonProperty("minimum_amount") fun minimumAmount(): String = minimumAmount

                /** Exclusive tier ending value */
                @JsonProperty("maximum_amount") fun maximumAmount(): String? = maximumAmount

                /** Per-event basis point rate */
                @JsonProperty("bps") fun bps(): Double = bps

                /** Per unit maximum to charge */
                @JsonProperty("per_unit_maximum") fun perUnitMaximum(): String? = perUnitMaximum

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var minimumAmount: String? = null
                    private var maximumAmount: String? = null
                    private var bps: Double? = null
                    private var perUnitMaximum: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        minimumAmount = tier.minimumAmount
                        maximumAmount = tier.maximumAmount
                        bps = tier.bps
                        perUnitMaximum = tier.perUnitMaximum
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Inclusive tier starting value */
                    fun minimumAmount(minimumAmount: String) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** Exclusive tier ending value */
                    fun maximumAmount(maximumAmount: String) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** Per-event basis point rate */
                    fun bps(bps: Double) = apply { this.bps = bps }

                    /** Per unit maximum to charge */
                    fun perUnitMaximum(perUnitMaximum: String) = apply {
                        this.perUnitMaximum = perUnitMaximum
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

                    fun build(): Tier =
                        Tier(
                            checkNotNull(minimumAmount) {
                                "`minimumAmount` is required but was not set"
                            },
                            maximumAmount,
                            checkNotNull(bps) { "`bps` is required but was not set" },
                            perUnitMaximum,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && minimumAmount == other.minimumAmount && maximumAmount == other.maximumAmount && bps == other.bps && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(minimumAmount, maximumAmount, bps, perUnitMaximum, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredBpsConfig && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TieredBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredBpsPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && tieredBpsConfig == other.tieredBpsConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredBpsConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredBpsPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredBpsConfig=$tieredBpsConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingBpsPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("bps_config") private val bpsConfig: BpsConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("bps_config") fun bpsConfig(): BpsConfig = bpsConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var bpsConfig: BpsConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingBpsPrice: NewFloatingBpsPrice) = apply {
                metadata = newFloatingBpsPrice.metadata
                externalPriceId = newFloatingBpsPrice.externalPriceId
                name = newFloatingBpsPrice.name
                billableMetricId = newFloatingBpsPrice.billableMetricId
                itemId = newFloatingBpsPrice.itemId
                billedInAdvance = newFloatingBpsPrice.billedInAdvance
                fixedPriceQuantity = newFloatingBpsPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingBpsPrice.invoiceGroupingKey
                cadence = newFloatingBpsPrice.cadence
                billingCycleConfiguration = newFloatingBpsPrice.billingCycleConfiguration
                invoicingCycleConfiguration = newFloatingBpsPrice.invoicingCycleConfiguration
                conversionRate = newFloatingBpsPrice.conversionRate
                modelType = newFloatingBpsPrice.modelType
                bpsConfig = newFloatingBpsPrice.bpsConfig
                currency = newFloatingBpsPrice.currency
                additionalProperties = newFloatingBpsPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun bpsConfig(bpsConfig: BpsConfig) = apply { this.bpsConfig = bpsConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingBpsPrice =
                NewFloatingBpsPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(bpsConfig) { "`bpsConfig` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class BpsConfig
        @JsonCreator
        private constructor(
            @JsonProperty("bps") private val bps: Double,
            @JsonProperty("per_unit_maximum") private val perUnitMaximum: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Basis point take rate per event */
            @JsonProperty("bps") fun bps(): Double = bps

            /** Optional currency amount maximum to cap spend per event */
            @JsonProperty("per_unit_maximum") fun perUnitMaximum(): String? = perUnitMaximum

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var bps: Double? = null
                private var perUnitMaximum: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bpsConfig: BpsConfig) = apply {
                    bps = bpsConfig.bps
                    perUnitMaximum = bpsConfig.perUnitMaximum
                    additionalProperties = bpsConfig.additionalProperties.toMutableMap()
                }

                /** Basis point take rate per event */
                fun bps(bps: Double) = apply { this.bps = bps }

                /** Optional currency amount maximum to cap spend per event */
                fun perUnitMaximum(perUnitMaximum: String) = apply {
                    this.perUnitMaximum = perUnitMaximum
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

                fun build(): BpsConfig =
                    BpsConfig(
                        checkNotNull(bps) { "`bps` is required but was not set" },
                        perUnitMaximum,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BpsConfig && bps == other.bps && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(bps, perUnitMaximum, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BpsConfig{bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BPS = of("bps")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                BPS,
            }

            enum class Value {
                BPS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BPS -> Value.BPS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BPS -> Known.BPS
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingBpsPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && bpsConfig == other.bpsConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, bpsConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingBpsPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, bpsConfig=$bpsConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingBulkBpsPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("bulk_bps_config") private val bulkBpsConfig: BulkBpsConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("bulk_bps_config") fun bulkBpsConfig(): BulkBpsConfig = bulkBpsConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var bulkBpsConfig: BulkBpsConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice) = apply {
                metadata = newFloatingBulkBpsPrice.metadata
                externalPriceId = newFloatingBulkBpsPrice.externalPriceId
                name = newFloatingBulkBpsPrice.name
                billableMetricId = newFloatingBulkBpsPrice.billableMetricId
                itemId = newFloatingBulkBpsPrice.itemId
                billedInAdvance = newFloatingBulkBpsPrice.billedInAdvance
                fixedPriceQuantity = newFloatingBulkBpsPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingBulkBpsPrice.invoiceGroupingKey
                cadence = newFloatingBulkBpsPrice.cadence
                billingCycleConfiguration = newFloatingBulkBpsPrice.billingCycleConfiguration
                invoicingCycleConfiguration = newFloatingBulkBpsPrice.invoicingCycleConfiguration
                conversionRate = newFloatingBulkBpsPrice.conversionRate
                modelType = newFloatingBulkBpsPrice.modelType
                bulkBpsConfig = newFloatingBulkBpsPrice.bulkBpsConfig
                currency = newFloatingBulkBpsPrice.currency
                additionalProperties = newFloatingBulkBpsPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun bulkBpsConfig(bulkBpsConfig: BulkBpsConfig) = apply {
                this.bulkBpsConfig = bulkBpsConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingBulkBpsPrice =
                NewFloatingBulkBpsPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(bulkBpsConfig) { "`bulkBpsConfig` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class BulkBpsConfig
        @JsonCreator
        private constructor(
            @JsonProperty("tiers") private val tiers: List<Tier>,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
             * based on total volume
             */
            @JsonProperty("tiers") fun tiers(): List<Tier> = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: MutableList<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bulkBpsConfig: BulkBpsConfig) = apply {
                    tiers = bulkBpsConfig.tiers.toMutableList()
                    additionalProperties = bulkBpsConfig.additionalProperties.toMutableMap()
                }

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers.toMutableList() }

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                fun addTier(tier: Tier) = apply {
                    tiers = (tiers ?: mutableListOf()).apply { add(tier) }
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

                fun build(): BulkBpsConfig =
                    BulkBpsConfig(
                        checkNotNull(tiers) { "`tiers` is required but was not set" }.toImmutable(),
                        additionalProperties.toImmutable()
                    )
            }

            @NoAutoDetect
            class Tier
            @JsonCreator
            private constructor(
                @JsonProperty("maximum_amount") private val maximumAmount: String?,
                @JsonProperty("bps") private val bps: Double,
                @JsonProperty("per_unit_maximum") private val perUnitMaximum: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Upper bound for tier */
                @JsonProperty("maximum_amount") fun maximumAmount(): String? = maximumAmount

                /** Basis points to rate on */
                @JsonProperty("bps") fun bps(): Double = bps

                /** The maximum amount to charge for any one event */
                @JsonProperty("per_unit_maximum") fun perUnitMaximum(): String? = perUnitMaximum

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var maximumAmount: String? = null
                    private var bps: Double? = null
                    private var perUnitMaximum: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        maximumAmount = tier.maximumAmount
                        bps = tier.bps
                        perUnitMaximum = tier.perUnitMaximum
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Upper bound for tier */
                    fun maximumAmount(maximumAmount: String) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** Basis points to rate on */
                    fun bps(bps: Double) = apply { this.bps = bps }

                    /** The maximum amount to charge for any one event */
                    fun perUnitMaximum(perUnitMaximum: String) = apply {
                        this.perUnitMaximum = perUnitMaximum
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

                    fun build(): Tier =
                        Tier(
                            maximumAmount,
                            checkNotNull(bps) { "`bps` is required but was not set" },
                            perUnitMaximum,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && maximumAmount == other.maximumAmount && bps == other.bps && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(maximumAmount, bps, perUnitMaximum, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BulkBpsConfig && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BulkBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BULK_BPS = of("bulk_bps")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                BULK_BPS,
            }

            enum class Value {
                BULK_BPS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BULK_BPS -> Value.BULK_BPS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BULK_BPS -> Known.BULK_BPS
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingBulkBpsPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && bulkBpsConfig == other.bulkBpsConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, bulkBpsConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingBulkBpsPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, bulkBpsConfig=$bulkBpsConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingBulkPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("bulk_config") private val bulkConfig: BulkConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("bulk_config") fun bulkConfig(): BulkConfig = bulkConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var bulkConfig: BulkConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingBulkPrice: NewFloatingBulkPrice) = apply {
                metadata = newFloatingBulkPrice.metadata
                externalPriceId = newFloatingBulkPrice.externalPriceId
                name = newFloatingBulkPrice.name
                billableMetricId = newFloatingBulkPrice.billableMetricId
                itemId = newFloatingBulkPrice.itemId
                billedInAdvance = newFloatingBulkPrice.billedInAdvance
                fixedPriceQuantity = newFloatingBulkPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingBulkPrice.invoiceGroupingKey
                cadence = newFloatingBulkPrice.cadence
                billingCycleConfiguration = newFloatingBulkPrice.billingCycleConfiguration
                invoicingCycleConfiguration = newFloatingBulkPrice.invoicingCycleConfiguration
                conversionRate = newFloatingBulkPrice.conversionRate
                modelType = newFloatingBulkPrice.modelType
                bulkConfig = newFloatingBulkPrice.bulkConfig
                currency = newFloatingBulkPrice.currency
                additionalProperties = newFloatingBulkPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun bulkConfig(bulkConfig: BulkConfig) = apply { this.bulkConfig = bulkConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingBulkPrice =
                NewFloatingBulkPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(bulkConfig) { "`bulkConfig` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class BulkConfig
        @JsonCreator
        private constructor(
            @JsonProperty("tiers") private val tiers: List<Tier>,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Bulk tiers for rating based on total usage volume */
            @JsonProperty("tiers") fun tiers(): List<Tier> = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: MutableList<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bulkConfig: BulkConfig) = apply {
                    tiers = bulkConfig.tiers.toMutableList()
                    additionalProperties = bulkConfig.additionalProperties.toMutableMap()
                }

                /** Bulk tiers for rating based on total usage volume */
                fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers.toMutableList() }

                /** Bulk tiers for rating based on total usage volume */
                fun addTier(tier: Tier) = apply {
                    tiers = (tiers ?: mutableListOf()).apply { add(tier) }
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

                fun build(): BulkConfig =
                    BulkConfig(
                        checkNotNull(tiers) { "`tiers` is required but was not set" }.toImmutable(),
                        additionalProperties.toImmutable()
                    )
            }

            @NoAutoDetect
            class Tier
            @JsonCreator
            private constructor(
                @JsonProperty("maximum_units") private val maximumUnits: Double?,
                @JsonProperty("unit_amount") private val unitAmount: String,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Upper bound for this tier */
                @JsonProperty("maximum_units") fun maximumUnits(): Double? = maximumUnits

                /** Amount per unit */
                @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var maximumUnits: Double? = null
                    private var unitAmount: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        maximumUnits = tier.maximumUnits
                        unitAmount = tier.unitAmount
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Upper bound for this tier */
                    fun maximumUnits(maximumUnits: Double) = apply {
                        this.maximumUnits = maximumUnits
                    }

                    /** Amount per unit */
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

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

                    fun build(): Tier =
                        Tier(
                            maximumUnits,
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && maximumUnits == other.maximumUnits && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(maximumUnits, unitAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{maximumUnits=$maximumUnits, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BulkConfig && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(tiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BulkConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BULK = of("bulk")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                BULK,
            }

            enum class Value {
                BULK,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BULK -> Value.BULK
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BULK -> Known.BULK
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingBulkPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && bulkConfig == other.bulkConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, bulkConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingBulkPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, bulkConfig=$bulkConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingThresholdTotalAmountPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("threshold_total_amount_config")
        private val thresholdTotalAmountConfig: ThresholdTotalAmountConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("threshold_total_amount_config")
        fun thresholdTotalAmountConfig(): ThresholdTotalAmountConfig = thresholdTotalAmountConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var thresholdTotalAmountConfig: ThresholdTotalAmountConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
            ) = apply {
                metadata = newFloatingThresholdTotalAmountPrice.metadata
                externalPriceId = newFloatingThresholdTotalAmountPrice.externalPriceId
                name = newFloatingThresholdTotalAmountPrice.name
                billableMetricId = newFloatingThresholdTotalAmountPrice.billableMetricId
                itemId = newFloatingThresholdTotalAmountPrice.itemId
                billedInAdvance = newFloatingThresholdTotalAmountPrice.billedInAdvance
                fixedPriceQuantity = newFloatingThresholdTotalAmountPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingThresholdTotalAmountPrice.invoiceGroupingKey
                cadence = newFloatingThresholdTotalAmountPrice.cadence
                billingCycleConfiguration =
                    newFloatingThresholdTotalAmountPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingThresholdTotalAmountPrice.invoicingCycleConfiguration
                conversionRate = newFloatingThresholdTotalAmountPrice.conversionRate
                modelType = newFloatingThresholdTotalAmountPrice.modelType
                thresholdTotalAmountConfig =
                    newFloatingThresholdTotalAmountPrice.thresholdTotalAmountConfig
                currency = newFloatingThresholdTotalAmountPrice.currency
                additionalProperties =
                    newFloatingThresholdTotalAmountPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun thresholdTotalAmountConfig(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) =
                apply {
                    this.thresholdTotalAmountConfig = thresholdTotalAmountConfig
                }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingThresholdTotalAmountPrice =
                NewFloatingThresholdTotalAmountPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(thresholdTotalAmountConfig) {
                        "`thresholdTotalAmountConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val THRESHOLD_TOTAL_AMOUNT = of("threshold_total_amount")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                THRESHOLD_TOTAL_AMOUNT,
            }

            enum class Value {
                THRESHOLD_TOTAL_AMOUNT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    THRESHOLD_TOTAL_AMOUNT -> Value.THRESHOLD_TOTAL_AMOUNT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    THRESHOLD_TOTAL_AMOUNT -> Known.THRESHOLD_TOTAL_AMOUNT
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class ThresholdTotalAmountConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) = apply {
                    additionalProperties =
                        thresholdTotalAmountConfig.additionalProperties.toMutableMap()
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

                fun build(): ThresholdTotalAmountConfig =
                    ThresholdTotalAmountConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ThresholdTotalAmountConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ThresholdTotalAmountConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingThresholdTotalAmountPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && thresholdTotalAmountConfig == other.thresholdTotalAmountConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, thresholdTotalAmountConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingThresholdTotalAmountPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, thresholdTotalAmountConfig=$thresholdTotalAmountConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredPackagePrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("tiered_package_config") private val tieredPackageConfig: TieredPackageConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("tiered_package_config")
        fun tieredPackageConfig(): TieredPackageConfig = tieredPackageConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var tieredPackageConfig: TieredPackageConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice) =
                apply {
                    metadata = newFloatingTieredPackagePrice.metadata
                    externalPriceId = newFloatingTieredPackagePrice.externalPriceId
                    name = newFloatingTieredPackagePrice.name
                    billableMetricId = newFloatingTieredPackagePrice.billableMetricId
                    itemId = newFloatingTieredPackagePrice.itemId
                    billedInAdvance = newFloatingTieredPackagePrice.billedInAdvance
                    fixedPriceQuantity = newFloatingTieredPackagePrice.fixedPriceQuantity
                    invoiceGroupingKey = newFloatingTieredPackagePrice.invoiceGroupingKey
                    cadence = newFloatingTieredPackagePrice.cadence
                    billingCycleConfiguration =
                        newFloatingTieredPackagePrice.billingCycleConfiguration
                    invoicingCycleConfiguration =
                        newFloatingTieredPackagePrice.invoicingCycleConfiguration
                    conversionRate = newFloatingTieredPackagePrice.conversionRate
                    modelType = newFloatingTieredPackagePrice.modelType
                    tieredPackageConfig = newFloatingTieredPackagePrice.tieredPackageConfig
                    currency = newFloatingTieredPackagePrice.currency
                    additionalProperties =
                        newFloatingTieredPackagePrice.additionalProperties.toMutableMap()
                }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun tieredPackageConfig(tieredPackageConfig: TieredPackageConfig) = apply {
                this.tieredPackageConfig = tieredPackageConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingTieredPackagePrice =
                NewFloatingTieredPackagePrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(tieredPackageConfig) {
                        "`tieredPackageConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TIERED_PACKAGE = of("tiered_package")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_PACKAGE,
            }

            enum class Value {
                TIERED_PACKAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_PACKAGE -> Value.TIERED_PACKAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_PACKAGE -> Known.TIERED_PACKAGE
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class TieredPackageConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredPackageConfig: TieredPackageConfig) = apply {
                    additionalProperties = tieredPackageConfig.additionalProperties.toMutableMap()
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

                fun build(): TieredPackageConfig =
                    TieredPackageConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredPackageConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TieredPackageConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredPackagePrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && tieredPackageConfig == other.tieredPackageConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredPackageConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredPackagePrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredPackageConfig=$tieredPackageConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedTieredPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("grouped_tiered_config") private val groupedTieredConfig: GroupedTieredConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("grouped_tiered_config")
        fun groupedTieredConfig(): GroupedTieredConfig = groupedTieredConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var groupedTieredConfig: GroupedTieredConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice) =
                apply {
                    metadata = newFloatingGroupedTieredPrice.metadata
                    externalPriceId = newFloatingGroupedTieredPrice.externalPriceId
                    name = newFloatingGroupedTieredPrice.name
                    billableMetricId = newFloatingGroupedTieredPrice.billableMetricId
                    itemId = newFloatingGroupedTieredPrice.itemId
                    billedInAdvance = newFloatingGroupedTieredPrice.billedInAdvance
                    fixedPriceQuantity = newFloatingGroupedTieredPrice.fixedPriceQuantity
                    invoiceGroupingKey = newFloatingGroupedTieredPrice.invoiceGroupingKey
                    cadence = newFloatingGroupedTieredPrice.cadence
                    billingCycleConfiguration =
                        newFloatingGroupedTieredPrice.billingCycleConfiguration
                    invoicingCycleConfiguration =
                        newFloatingGroupedTieredPrice.invoicingCycleConfiguration
                    conversionRate = newFloatingGroupedTieredPrice.conversionRate
                    modelType = newFloatingGroupedTieredPrice.modelType
                    groupedTieredConfig = newFloatingGroupedTieredPrice.groupedTieredConfig
                    currency = newFloatingGroupedTieredPrice.currency
                    additionalProperties =
                        newFloatingGroupedTieredPrice.additionalProperties.toMutableMap()
                }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun groupedTieredConfig(groupedTieredConfig: GroupedTieredConfig) = apply {
                this.groupedTieredConfig = groupedTieredConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingGroupedTieredPrice =
                NewFloatingGroupedTieredPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(groupedTieredConfig) {
                        "`groupedTieredConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class GroupedTieredConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(groupedTieredConfig: GroupedTieredConfig) = apply {
                    additionalProperties = groupedTieredConfig.additionalProperties.toMutableMap()
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

                fun build(): GroupedTieredConfig =
                    GroupedTieredConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedTieredConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupedTieredConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val GROUPED_TIERED = of("grouped_tiered")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                GROUPED_TIERED,
            }

            enum class Value {
                GROUPED_TIERED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    GROUPED_TIERED -> Value.GROUPED_TIERED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    GROUPED_TIERED -> Known.GROUPED_TIERED
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedTieredPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && groupedTieredConfig == other.groupedTieredConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedTieredConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedTieredPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedTieredConfig=$groupedTieredConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredWithMinimumPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("tiered_with_minimum_config")
        private val tieredWithMinimumConfig: TieredWithMinimumConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("tiered_with_minimum_config")
        fun tieredWithMinimumConfig(): TieredWithMinimumConfig = tieredWithMinimumConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var tieredWithMinimumConfig: TieredWithMinimumConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
            ) = apply {
                metadata = newFloatingTieredWithMinimumPrice.metadata
                externalPriceId = newFloatingTieredWithMinimumPrice.externalPriceId
                name = newFloatingTieredWithMinimumPrice.name
                billableMetricId = newFloatingTieredWithMinimumPrice.billableMetricId
                itemId = newFloatingTieredWithMinimumPrice.itemId
                billedInAdvance = newFloatingTieredWithMinimumPrice.billedInAdvance
                fixedPriceQuantity = newFloatingTieredWithMinimumPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredWithMinimumPrice.invoiceGroupingKey
                cadence = newFloatingTieredWithMinimumPrice.cadence
                billingCycleConfiguration =
                    newFloatingTieredWithMinimumPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingTieredWithMinimumPrice.invoicingCycleConfiguration
                conversionRate = newFloatingTieredWithMinimumPrice.conversionRate
                modelType = newFloatingTieredWithMinimumPrice.modelType
                tieredWithMinimumConfig = newFloatingTieredWithMinimumPrice.tieredWithMinimumConfig
                currency = newFloatingTieredWithMinimumPrice.currency
                additionalProperties =
                    newFloatingTieredWithMinimumPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun tieredWithMinimumConfig(tieredWithMinimumConfig: TieredWithMinimumConfig) = apply {
                this.tieredWithMinimumConfig = tieredWithMinimumConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingTieredWithMinimumPrice =
                NewFloatingTieredWithMinimumPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(tieredWithMinimumConfig) {
                        "`tieredWithMinimumConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TIERED_WITH_MINIMUM = of("tiered_with_minimum")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_WITH_MINIMUM,
            }

            enum class Value {
                TIERED_WITH_MINIMUM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_WITH_MINIMUM -> Value.TIERED_WITH_MINIMUM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_WITH_MINIMUM -> Known.TIERED_WITH_MINIMUM
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class TieredWithMinimumConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredWithMinimumConfig: TieredWithMinimumConfig) = apply {
                    additionalProperties =
                        tieredWithMinimumConfig.additionalProperties.toMutableMap()
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

                fun build(): TieredWithMinimumConfig =
                    TieredWithMinimumConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredWithMinimumConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TieredWithMinimumConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredWithMinimumPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && tieredWithMinimumConfig == other.tieredWithMinimumConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredWithMinimumConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredWithMinimumPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredWithMinimumConfig=$tieredWithMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingPackageWithAllocationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("package_with_allocation_config")
        private val packageWithAllocationConfig: PackageWithAllocationConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("package_with_allocation_config")
        fun packageWithAllocationConfig(): PackageWithAllocationConfig = packageWithAllocationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var packageWithAllocationConfig: PackageWithAllocationConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
            ) = apply {
                metadata = newFloatingPackageWithAllocationPrice.metadata
                externalPriceId = newFloatingPackageWithAllocationPrice.externalPriceId
                name = newFloatingPackageWithAllocationPrice.name
                billableMetricId = newFloatingPackageWithAllocationPrice.billableMetricId
                itemId = newFloatingPackageWithAllocationPrice.itemId
                billedInAdvance = newFloatingPackageWithAllocationPrice.billedInAdvance
                fixedPriceQuantity = newFloatingPackageWithAllocationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingPackageWithAllocationPrice.invoiceGroupingKey
                cadence = newFloatingPackageWithAllocationPrice.cadence
                billingCycleConfiguration =
                    newFloatingPackageWithAllocationPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingPackageWithAllocationPrice.invoicingCycleConfiguration
                conversionRate = newFloatingPackageWithAllocationPrice.conversionRate
                modelType = newFloatingPackageWithAllocationPrice.modelType
                packageWithAllocationConfig =
                    newFloatingPackageWithAllocationPrice.packageWithAllocationConfig
                currency = newFloatingPackageWithAllocationPrice.currency
                additionalProperties =
                    newFloatingPackageWithAllocationPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun packageWithAllocationConfig(
                packageWithAllocationConfig: PackageWithAllocationConfig
            ) = apply { this.packageWithAllocationConfig = packageWithAllocationConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingPackageWithAllocationPrice =
                NewFloatingPackageWithAllocationPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(packageWithAllocationConfig) {
                        "`packageWithAllocationConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PACKAGE_WITH_ALLOCATION = of("package_with_allocation")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                PACKAGE_WITH_ALLOCATION,
            }

            enum class Value {
                PACKAGE_WITH_ALLOCATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PACKAGE_WITH_ALLOCATION -> Value.PACKAGE_WITH_ALLOCATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PACKAGE_WITH_ALLOCATION -> Known.PACKAGE_WITH_ALLOCATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class PackageWithAllocationConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(packageWithAllocationConfig: PackageWithAllocationConfig) =
                    apply {
                        additionalProperties =
                            packageWithAllocationConfig.additionalProperties.toMutableMap()
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

                fun build(): PackageWithAllocationConfig =
                    PackageWithAllocationConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PackageWithAllocationConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PackageWithAllocationConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingPackageWithAllocationPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && packageWithAllocationConfig == other.packageWithAllocationConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, packageWithAllocationConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingPackageWithAllocationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, packageWithAllocationConfig=$packageWithAllocationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredPackageWithMinimumPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("tiered_package_with_minimum_config")
        private val tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("tiered_package_with_minimum_config")
        fun tieredPackageWithMinimumConfig(): TieredPackageWithMinimumConfig =
            tieredPackageWithMinimumConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingTieredPackageWithMinimumPrice: NewFloatingTieredPackageWithMinimumPrice
            ) = apply {
                metadata = newFloatingTieredPackageWithMinimumPrice.metadata
                externalPriceId = newFloatingTieredPackageWithMinimumPrice.externalPriceId
                name = newFloatingTieredPackageWithMinimumPrice.name
                billableMetricId = newFloatingTieredPackageWithMinimumPrice.billableMetricId
                itemId = newFloatingTieredPackageWithMinimumPrice.itemId
                billedInAdvance = newFloatingTieredPackageWithMinimumPrice.billedInAdvance
                fixedPriceQuantity = newFloatingTieredPackageWithMinimumPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredPackageWithMinimumPrice.invoiceGroupingKey
                cadence = newFloatingTieredPackageWithMinimumPrice.cadence
                billingCycleConfiguration =
                    newFloatingTieredPackageWithMinimumPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingTieredPackageWithMinimumPrice.invoicingCycleConfiguration
                conversionRate = newFloatingTieredPackageWithMinimumPrice.conversionRate
                modelType = newFloatingTieredPackageWithMinimumPrice.modelType
                tieredPackageWithMinimumConfig =
                    newFloatingTieredPackageWithMinimumPrice.tieredPackageWithMinimumConfig
                currency = newFloatingTieredPackageWithMinimumPrice.currency
                additionalProperties =
                    newFloatingTieredPackageWithMinimumPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun tieredPackageWithMinimumConfig(
                tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig
            ) = apply { this.tieredPackageWithMinimumConfig = tieredPackageWithMinimumConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingTieredPackageWithMinimumPrice =
                NewFloatingTieredPackageWithMinimumPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(tieredPackageWithMinimumConfig) {
                        "`tieredPackageWithMinimumConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TIERED_PACKAGE_WITH_MINIMUM = of("tiered_package_with_minimum")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_PACKAGE_WITH_MINIMUM,
            }

            enum class Value {
                TIERED_PACKAGE_WITH_MINIMUM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_PACKAGE_WITH_MINIMUM -> Value.TIERED_PACKAGE_WITH_MINIMUM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_PACKAGE_WITH_MINIMUM -> Known.TIERED_PACKAGE_WITH_MINIMUM
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class TieredPackageWithMinimumConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig) =
                    apply {
                        additionalProperties =
                            tieredPackageWithMinimumConfig.additionalProperties.toMutableMap()
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

                fun build(): TieredPackageWithMinimumConfig =
                    TieredPackageWithMinimumConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredPackageWithMinimumConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TieredPackageWithMinimumConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredPackageWithMinimumPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && tieredPackageWithMinimumConfig == other.tieredPackageWithMinimumConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredPackageWithMinimumConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredPackageWithMinimumPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredPackageWithMinimumConfig=$tieredPackageWithMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingUnitWithPercentPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("unit_with_percent_config")
        private val unitWithPercentConfig: UnitWithPercentConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("unit_with_percent_config")
        fun unitWithPercentConfig(): UnitWithPercentConfig = unitWithPercentConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var unitWithPercentConfig: UnitWithPercentConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice) =
                apply {
                    metadata = newFloatingUnitWithPercentPrice.metadata
                    externalPriceId = newFloatingUnitWithPercentPrice.externalPriceId
                    name = newFloatingUnitWithPercentPrice.name
                    billableMetricId = newFloatingUnitWithPercentPrice.billableMetricId
                    itemId = newFloatingUnitWithPercentPrice.itemId
                    billedInAdvance = newFloatingUnitWithPercentPrice.billedInAdvance
                    fixedPriceQuantity = newFloatingUnitWithPercentPrice.fixedPriceQuantity
                    invoiceGroupingKey = newFloatingUnitWithPercentPrice.invoiceGroupingKey
                    cadence = newFloatingUnitWithPercentPrice.cadence
                    billingCycleConfiguration =
                        newFloatingUnitWithPercentPrice.billingCycleConfiguration
                    invoicingCycleConfiguration =
                        newFloatingUnitWithPercentPrice.invoicingCycleConfiguration
                    conversionRate = newFloatingUnitWithPercentPrice.conversionRate
                    modelType = newFloatingUnitWithPercentPrice.modelType
                    unitWithPercentConfig = newFloatingUnitWithPercentPrice.unitWithPercentConfig
                    currency = newFloatingUnitWithPercentPrice.currency
                    additionalProperties =
                        newFloatingUnitWithPercentPrice.additionalProperties.toMutableMap()
                }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun unitWithPercentConfig(unitWithPercentConfig: UnitWithPercentConfig) = apply {
                this.unitWithPercentConfig = unitWithPercentConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingUnitWithPercentPrice =
                NewFloatingUnitWithPercentPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(unitWithPercentConfig) {
                        "`unitWithPercentConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val UNIT_WITH_PERCENT = of("unit_with_percent")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                UNIT_WITH_PERCENT,
            }

            enum class Value {
                UNIT_WITH_PERCENT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNIT_WITH_PERCENT -> Value.UNIT_WITH_PERCENT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNIT_WITH_PERCENT -> Known.UNIT_WITH_PERCENT
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class UnitWithPercentConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitWithPercentConfig: UnitWithPercentConfig) = apply {
                    additionalProperties = unitWithPercentConfig.additionalProperties.toMutableMap()
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

                fun build(): UnitWithPercentConfig =
                    UnitWithPercentConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitWithPercentConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnitWithPercentConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingUnitWithPercentPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && unitWithPercentConfig == other.unitWithPercentConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, unitWithPercentConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingUnitWithPercentPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, unitWithPercentConfig=$unitWithPercentConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredWithProrationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("tiered_with_proration_config")
        private val tieredWithProrationConfig: TieredWithProrationConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("tiered_with_proration_config")
        fun tieredWithProrationConfig(): TieredWithProrationConfig = tieredWithProrationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var tieredWithProrationConfig: TieredWithProrationConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
            ) = apply {
                metadata = newFloatingTieredWithProrationPrice.metadata
                externalPriceId = newFloatingTieredWithProrationPrice.externalPriceId
                name = newFloatingTieredWithProrationPrice.name
                billableMetricId = newFloatingTieredWithProrationPrice.billableMetricId
                itemId = newFloatingTieredWithProrationPrice.itemId
                billedInAdvance = newFloatingTieredWithProrationPrice.billedInAdvance
                fixedPriceQuantity = newFloatingTieredWithProrationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredWithProrationPrice.invoiceGroupingKey
                cadence = newFloatingTieredWithProrationPrice.cadence
                billingCycleConfiguration =
                    newFloatingTieredWithProrationPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingTieredWithProrationPrice.invoicingCycleConfiguration
                conversionRate = newFloatingTieredWithProrationPrice.conversionRate
                modelType = newFloatingTieredWithProrationPrice.modelType
                tieredWithProrationConfig =
                    newFloatingTieredWithProrationPrice.tieredWithProrationConfig
                currency = newFloatingTieredWithProrationPrice.currency
                additionalProperties =
                    newFloatingTieredWithProrationPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun tieredWithProrationConfig(tieredWithProrationConfig: TieredWithProrationConfig) =
                apply {
                    this.tieredWithProrationConfig = tieredWithProrationConfig
                }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingTieredWithProrationPrice =
                NewFloatingTieredWithProrationPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(tieredWithProrationConfig) {
                        "`tieredWithProrationConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val TIERED_WITH_PRORATION = of("tiered_with_proration")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                TIERED_WITH_PRORATION,
            }

            enum class Value {
                TIERED_WITH_PRORATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    TIERED_WITH_PRORATION -> Value.TIERED_WITH_PRORATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    TIERED_WITH_PRORATION -> Known.TIERED_WITH_PRORATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class TieredWithProrationConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredWithProrationConfig: TieredWithProrationConfig) = apply {
                    additionalProperties =
                        tieredWithProrationConfig.additionalProperties.toMutableMap()
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

                fun build(): TieredWithProrationConfig =
                    TieredWithProrationConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredWithProrationConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TieredWithProrationConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredWithProrationPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && tieredWithProrationConfig == other.tieredWithProrationConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredWithProrationConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredWithProrationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredWithProrationConfig=$tieredWithProrationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingUnitWithProrationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("unit_with_proration_config")
        private val unitWithProrationConfig: UnitWithProrationConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("unit_with_proration_config")
        fun unitWithProrationConfig(): UnitWithProrationConfig = unitWithProrationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var unitWithProrationConfig: UnitWithProrationConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
            ) = apply {
                metadata = newFloatingUnitWithProrationPrice.metadata
                externalPriceId = newFloatingUnitWithProrationPrice.externalPriceId
                name = newFloatingUnitWithProrationPrice.name
                billableMetricId = newFloatingUnitWithProrationPrice.billableMetricId
                itemId = newFloatingUnitWithProrationPrice.itemId
                billedInAdvance = newFloatingUnitWithProrationPrice.billedInAdvance
                fixedPriceQuantity = newFloatingUnitWithProrationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingUnitWithProrationPrice.invoiceGroupingKey
                cadence = newFloatingUnitWithProrationPrice.cadence
                billingCycleConfiguration =
                    newFloatingUnitWithProrationPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingUnitWithProrationPrice.invoicingCycleConfiguration
                conversionRate = newFloatingUnitWithProrationPrice.conversionRate
                modelType = newFloatingUnitWithProrationPrice.modelType
                unitWithProrationConfig = newFloatingUnitWithProrationPrice.unitWithProrationConfig
                currency = newFloatingUnitWithProrationPrice.currency
                additionalProperties =
                    newFloatingUnitWithProrationPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun unitWithProrationConfig(unitWithProrationConfig: UnitWithProrationConfig) = apply {
                this.unitWithProrationConfig = unitWithProrationConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingUnitWithProrationPrice =
                NewFloatingUnitWithProrationPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(unitWithProrationConfig) {
                        "`unitWithProrationConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val UNIT_WITH_PRORATION = of("unit_with_proration")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                UNIT_WITH_PRORATION,
            }

            enum class Value {
                UNIT_WITH_PRORATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    UNIT_WITH_PRORATION -> Value.UNIT_WITH_PRORATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    UNIT_WITH_PRORATION -> Known.UNIT_WITH_PRORATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class UnitWithProrationConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(unitWithProrationConfig: UnitWithProrationConfig) = apply {
                    additionalProperties =
                        unitWithProrationConfig.additionalProperties.toMutableMap()
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

                fun build(): UnitWithProrationConfig =
                    UnitWithProrationConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitWithProrationConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UnitWithProrationConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingUnitWithProrationPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && unitWithProrationConfig == other.unitWithProrationConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, unitWithProrationConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingUnitWithProrationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, unitWithProrationConfig=$unitWithProrationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedAllocationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("grouped_allocation_config")
        private val groupedAllocationConfig: GroupedAllocationConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("grouped_allocation_config")
        fun groupedAllocationConfig(): GroupedAllocationConfig = groupedAllocationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var groupedAllocationConfig: GroupedAllocationConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice
            ) = apply {
                metadata = newFloatingGroupedAllocationPrice.metadata
                externalPriceId = newFloatingGroupedAllocationPrice.externalPriceId
                name = newFloatingGroupedAllocationPrice.name
                billableMetricId = newFloatingGroupedAllocationPrice.billableMetricId
                itemId = newFloatingGroupedAllocationPrice.itemId
                billedInAdvance = newFloatingGroupedAllocationPrice.billedInAdvance
                fixedPriceQuantity = newFloatingGroupedAllocationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingGroupedAllocationPrice.invoiceGroupingKey
                cadence = newFloatingGroupedAllocationPrice.cadence
                billingCycleConfiguration =
                    newFloatingGroupedAllocationPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingGroupedAllocationPrice.invoicingCycleConfiguration
                conversionRate = newFloatingGroupedAllocationPrice.conversionRate
                modelType = newFloatingGroupedAllocationPrice.modelType
                groupedAllocationConfig = newFloatingGroupedAllocationPrice.groupedAllocationConfig
                currency = newFloatingGroupedAllocationPrice.currency
                additionalProperties =
                    newFloatingGroupedAllocationPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun groupedAllocationConfig(groupedAllocationConfig: GroupedAllocationConfig) = apply {
                this.groupedAllocationConfig = groupedAllocationConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingGroupedAllocationPrice =
                NewFloatingGroupedAllocationPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(groupedAllocationConfig) {
                        "`groupedAllocationConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class GroupedAllocationConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(groupedAllocationConfig: GroupedAllocationConfig) = apply {
                    additionalProperties =
                        groupedAllocationConfig.additionalProperties.toMutableMap()
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

                fun build(): GroupedAllocationConfig =
                    GroupedAllocationConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedAllocationConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupedAllocationConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val GROUPED_ALLOCATION = of("grouped_allocation")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                GROUPED_ALLOCATION,
            }

            enum class Value {
                GROUPED_ALLOCATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    GROUPED_ALLOCATION -> Value.GROUPED_ALLOCATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    GROUPED_ALLOCATION -> Known.GROUPED_ALLOCATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedAllocationPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && groupedAllocationConfig == other.groupedAllocationConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedAllocationConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedAllocationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedAllocationConfig=$groupedAllocationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedWithProratedMinimumPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("grouped_with_prorated_minimum_config")
        private val groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("grouped_with_prorated_minimum_config")
        fun groupedWithProratedMinimumConfig(): GroupedWithProratedMinimumConfig =
            groupedWithProratedMinimumConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingGroupedWithProratedMinimumPrice:
                    NewFloatingGroupedWithProratedMinimumPrice
            ) = apply {
                metadata = newFloatingGroupedWithProratedMinimumPrice.metadata
                externalPriceId = newFloatingGroupedWithProratedMinimumPrice.externalPriceId
                name = newFloatingGroupedWithProratedMinimumPrice.name
                billableMetricId = newFloatingGroupedWithProratedMinimumPrice.billableMetricId
                itemId = newFloatingGroupedWithProratedMinimumPrice.itemId
                billedInAdvance = newFloatingGroupedWithProratedMinimumPrice.billedInAdvance
                fixedPriceQuantity = newFloatingGroupedWithProratedMinimumPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingGroupedWithProratedMinimumPrice.invoiceGroupingKey
                cadence = newFloatingGroupedWithProratedMinimumPrice.cadence
                billingCycleConfiguration =
                    newFloatingGroupedWithProratedMinimumPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingGroupedWithProratedMinimumPrice.invoicingCycleConfiguration
                conversionRate = newFloatingGroupedWithProratedMinimumPrice.conversionRate
                modelType = newFloatingGroupedWithProratedMinimumPrice.modelType
                groupedWithProratedMinimumConfig =
                    newFloatingGroupedWithProratedMinimumPrice.groupedWithProratedMinimumConfig
                currency = newFloatingGroupedWithProratedMinimumPrice.currency
                additionalProperties =
                    newFloatingGroupedWithProratedMinimumPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun groupedWithProratedMinimumConfig(
                groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig
            ) = apply { this.groupedWithProratedMinimumConfig = groupedWithProratedMinimumConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingGroupedWithProratedMinimumPrice =
                NewFloatingGroupedWithProratedMinimumPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(groupedWithProratedMinimumConfig) {
                        "`groupedWithProratedMinimumConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class GroupedWithProratedMinimumConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig
                ) = apply {
                    additionalProperties =
                        groupedWithProratedMinimumConfig.additionalProperties.toMutableMap()
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

                fun build(): GroupedWithProratedMinimumConfig =
                    GroupedWithProratedMinimumConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedWithProratedMinimumConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupedWithProratedMinimumConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val GROUPED_WITH_PRORATED_MINIMUM = of("grouped_with_prorated_minimum")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                GROUPED_WITH_PRORATED_MINIMUM,
            }

            enum class Value {
                GROUPED_WITH_PRORATED_MINIMUM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    GROUPED_WITH_PRORATED_MINIMUM -> Value.GROUPED_WITH_PRORATED_MINIMUM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    GROUPED_WITH_PRORATED_MINIMUM -> Known.GROUPED_WITH_PRORATED_MINIMUM
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedWithProratedMinimumPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && groupedWithProratedMinimumConfig == other.groupedWithProratedMinimumConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedWithProratedMinimumConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedWithProratedMinimumPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedWithProratedMinimumConfig=$groupedWithProratedMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedWithMeteredMinimumPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("grouped_with_metered_minimum_config")
        private val groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("grouped_with_metered_minimum_config")
        fun groupedWithMeteredMinimumConfig(): GroupedWithMeteredMinimumConfig =
            groupedWithMeteredMinimumConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingGroupedWithMeteredMinimumPrice: NewFloatingGroupedWithMeteredMinimumPrice
            ) = apply {
                metadata = newFloatingGroupedWithMeteredMinimumPrice.metadata
                externalPriceId = newFloatingGroupedWithMeteredMinimumPrice.externalPriceId
                name = newFloatingGroupedWithMeteredMinimumPrice.name
                billableMetricId = newFloatingGroupedWithMeteredMinimumPrice.billableMetricId
                itemId = newFloatingGroupedWithMeteredMinimumPrice.itemId
                billedInAdvance = newFloatingGroupedWithMeteredMinimumPrice.billedInAdvance
                fixedPriceQuantity = newFloatingGroupedWithMeteredMinimumPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingGroupedWithMeteredMinimumPrice.invoiceGroupingKey
                cadence = newFloatingGroupedWithMeteredMinimumPrice.cadence
                billingCycleConfiguration =
                    newFloatingGroupedWithMeteredMinimumPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingGroupedWithMeteredMinimumPrice.invoicingCycleConfiguration
                conversionRate = newFloatingGroupedWithMeteredMinimumPrice.conversionRate
                modelType = newFloatingGroupedWithMeteredMinimumPrice.modelType
                groupedWithMeteredMinimumConfig =
                    newFloatingGroupedWithMeteredMinimumPrice.groupedWithMeteredMinimumConfig
                currency = newFloatingGroupedWithMeteredMinimumPrice.currency
                additionalProperties =
                    newFloatingGroupedWithMeteredMinimumPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun groupedWithMeteredMinimumConfig(
                groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig
            ) = apply { this.groupedWithMeteredMinimumConfig = groupedWithMeteredMinimumConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingGroupedWithMeteredMinimumPrice =
                NewFloatingGroupedWithMeteredMinimumPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(groupedWithMeteredMinimumConfig) {
                        "`groupedWithMeteredMinimumConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class GroupedWithMeteredMinimumConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig
                ) = apply {
                    additionalProperties =
                        groupedWithMeteredMinimumConfig.additionalProperties.toMutableMap()
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

                fun build(): GroupedWithMeteredMinimumConfig =
                    GroupedWithMeteredMinimumConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedWithMeteredMinimumConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupedWithMeteredMinimumConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val GROUPED_WITH_METERED_MINIMUM = of("grouped_with_metered_minimum")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                GROUPED_WITH_METERED_MINIMUM,
            }

            enum class Value {
                GROUPED_WITH_METERED_MINIMUM,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    GROUPED_WITH_METERED_MINIMUM -> Value.GROUPED_WITH_METERED_MINIMUM
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    GROUPED_WITH_METERED_MINIMUM -> Known.GROUPED_WITH_METERED_MINIMUM
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedWithMeteredMinimumPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && groupedWithMeteredMinimumConfig == other.groupedWithMeteredMinimumConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedWithMeteredMinimumConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedWithMeteredMinimumPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedWithMeteredMinimumConfig=$groupedWithMeteredMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingMatrixWithDisplayNamePrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("matrix_with_display_name_config")
        private val matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("matrix_with_display_name_config")
        fun matrixWithDisplayNameConfig(): MatrixWithDisplayNameConfig = matrixWithDisplayNameConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice
            ) = apply {
                metadata = newFloatingMatrixWithDisplayNamePrice.metadata
                externalPriceId = newFloatingMatrixWithDisplayNamePrice.externalPriceId
                name = newFloatingMatrixWithDisplayNamePrice.name
                billableMetricId = newFloatingMatrixWithDisplayNamePrice.billableMetricId
                itemId = newFloatingMatrixWithDisplayNamePrice.itemId
                billedInAdvance = newFloatingMatrixWithDisplayNamePrice.billedInAdvance
                fixedPriceQuantity = newFloatingMatrixWithDisplayNamePrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingMatrixWithDisplayNamePrice.invoiceGroupingKey
                cadence = newFloatingMatrixWithDisplayNamePrice.cadence
                billingCycleConfiguration =
                    newFloatingMatrixWithDisplayNamePrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingMatrixWithDisplayNamePrice.invoicingCycleConfiguration
                conversionRate = newFloatingMatrixWithDisplayNamePrice.conversionRate
                modelType = newFloatingMatrixWithDisplayNamePrice.modelType
                matrixWithDisplayNameConfig =
                    newFloatingMatrixWithDisplayNamePrice.matrixWithDisplayNameConfig
                currency = newFloatingMatrixWithDisplayNamePrice.currency
                additionalProperties =
                    newFloatingMatrixWithDisplayNamePrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun matrixWithDisplayNameConfig(
                matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig
            ) = apply { this.matrixWithDisplayNameConfig = matrixWithDisplayNameConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingMatrixWithDisplayNamePrice =
                NewFloatingMatrixWithDisplayNamePrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(matrixWithDisplayNameConfig) {
                        "`matrixWithDisplayNameConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class MatrixWithDisplayNameConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig) =
                    apply {
                        additionalProperties =
                            matrixWithDisplayNameConfig.additionalProperties.toMutableMap()
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

                fun build(): MatrixWithDisplayNameConfig =
                    MatrixWithDisplayNameConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixWithDisplayNameConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixWithDisplayNameConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MATRIX_WITH_DISPLAY_NAME = of("matrix_with_display_name")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                MATRIX_WITH_DISPLAY_NAME,
            }

            enum class Value {
                MATRIX_WITH_DISPLAY_NAME,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MATRIX_WITH_DISPLAY_NAME -> Value.MATRIX_WITH_DISPLAY_NAME
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MATRIX_WITH_DISPLAY_NAME -> Known.MATRIX_WITH_DISPLAY_NAME
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingMatrixWithDisplayNamePrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && matrixWithDisplayNameConfig == other.matrixWithDisplayNameConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, matrixWithDisplayNameConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingMatrixWithDisplayNamePrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, matrixWithDisplayNameConfig=$matrixWithDisplayNameConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingBulkWithProrationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("bulk_with_proration_config")
        private val bulkWithProrationConfig: BulkWithProrationConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("bulk_with_proration_config")
        fun bulkWithProrationConfig(): BulkWithProrationConfig = bulkWithProrationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var bulkWithProrationConfig: BulkWithProrationConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice
            ) = apply {
                metadata = newFloatingBulkWithProrationPrice.metadata
                externalPriceId = newFloatingBulkWithProrationPrice.externalPriceId
                name = newFloatingBulkWithProrationPrice.name
                billableMetricId = newFloatingBulkWithProrationPrice.billableMetricId
                itemId = newFloatingBulkWithProrationPrice.itemId
                billedInAdvance = newFloatingBulkWithProrationPrice.billedInAdvance
                fixedPriceQuantity = newFloatingBulkWithProrationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingBulkWithProrationPrice.invoiceGroupingKey
                cadence = newFloatingBulkWithProrationPrice.cadence
                billingCycleConfiguration =
                    newFloatingBulkWithProrationPrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingBulkWithProrationPrice.invoicingCycleConfiguration
                conversionRate = newFloatingBulkWithProrationPrice.conversionRate
                modelType = newFloatingBulkWithProrationPrice.modelType
                bulkWithProrationConfig = newFloatingBulkWithProrationPrice.bulkWithProrationConfig
                currency = newFloatingBulkWithProrationPrice.currency
                additionalProperties =
                    newFloatingBulkWithProrationPrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun bulkWithProrationConfig(bulkWithProrationConfig: BulkWithProrationConfig) = apply {
                this.bulkWithProrationConfig = bulkWithProrationConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingBulkWithProrationPrice =
                NewFloatingBulkWithProrationPrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(bulkWithProrationConfig) {
                        "`bulkWithProrationConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class BulkWithProrationConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bulkWithProrationConfig: BulkWithProrationConfig) = apply {
                    additionalProperties =
                        bulkWithProrationConfig.additionalProperties.toMutableMap()
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

                fun build(): BulkWithProrationConfig =
                    BulkWithProrationConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BulkWithProrationConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BulkWithProrationConfig{additionalProperties=$additionalProperties}"
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val BULK_WITH_PRORATION = of("bulk_with_proration")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                BULK_WITH_PRORATION,
            }

            enum class Value {
                BULK_WITH_PRORATION,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    BULK_WITH_PRORATION -> Value.BULK_WITH_PRORATION
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    BULK_WITH_PRORATION -> Known.BULK_WITH_PRORATION
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingBulkWithProrationPrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && bulkWithProrationConfig == other.bulkWithProrationConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, bulkWithProrationConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingBulkWithProrationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, bulkWithProrationConfig=$bulkWithProrationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedTieredPackagePrice
    @JsonCreator
    private constructor(
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("grouped_tiered_package_config")
        private val groupedTieredPackageConfig: GroupedTieredPackageConfig,
        @JsonProperty("currency") private val currency: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        @JsonProperty("grouped_tiered_package_config")
        fun groupedTieredPackageConfig(): GroupedTieredPackageConfig = groupedTieredPackageConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var metadata: Metadata? = null
            private var externalPriceId: String? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var itemId: String? = null
            private var billedInAdvance: Boolean? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var cadence: Cadence? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var modelType: ModelType? = null
            private var groupedTieredPackageConfig: GroupedTieredPackageConfig? = null
            private var currency: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingGroupedTieredPackagePrice: NewFloatingGroupedTieredPackagePrice
            ) = apply {
                metadata = newFloatingGroupedTieredPackagePrice.metadata
                externalPriceId = newFloatingGroupedTieredPackagePrice.externalPriceId
                name = newFloatingGroupedTieredPackagePrice.name
                billableMetricId = newFloatingGroupedTieredPackagePrice.billableMetricId
                itemId = newFloatingGroupedTieredPackagePrice.itemId
                billedInAdvance = newFloatingGroupedTieredPackagePrice.billedInAdvance
                fixedPriceQuantity = newFloatingGroupedTieredPackagePrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingGroupedTieredPackagePrice.invoiceGroupingKey
                cadence = newFloatingGroupedTieredPackagePrice.cadence
                billingCycleConfiguration =
                    newFloatingGroupedTieredPackagePrice.billingCycleConfiguration
                invoicingCycleConfiguration =
                    newFloatingGroupedTieredPackagePrice.invoicingCycleConfiguration
                conversionRate = newFloatingGroupedTieredPackagePrice.conversionRate
                modelType = newFloatingGroupedTieredPackagePrice.modelType
                groupedTieredPackageConfig =
                    newFloatingGroupedTieredPackagePrice.groupedTieredPackageConfig
                currency = newFloatingGroupedTieredPackagePrice.currency
                additionalProperties =
                    newFloatingGroupedTieredPackagePrice.additionalProperties.toMutableMap()
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            fun groupedTieredPackageConfig(groupedTieredPackageConfig: GroupedTieredPackageConfig) =
                apply {
                    this.groupedTieredPackageConfig = groupedTieredPackageConfig
                }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

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

            fun build(): NewFloatingGroupedTieredPackagePrice =
                NewFloatingGroupedTieredPackagePrice(
                    metadata,
                    externalPriceId,
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    billedInAdvance,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    billingCycleConfiguration,
                    invoicingCycleConfiguration,
                    conversionRate,
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(groupedTieredPackageConfig) {
                        "`groupedTieredPackageConfig` is required but was not set"
                    },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ANNUAL = of("annual")

                val SEMI_ANNUAL = of("semi_annual")

                val MONTHLY = of("monthly")

                val QUARTERLY = of("quarterly")

                val ONE_TIME = of("one_time")

                val CUSTOM = of("custom")

                fun of(value: String) = Cadence(JsonField.of(value))
            }

            enum class Known {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
            }

            enum class Value {
                ANNUAL,
                SEMI_ANNUAL,
                MONTHLY,
                QUARTERLY,
                ONE_TIME,
                CUSTOM,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class GroupedTieredPackageConfig
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(groupedTieredPackageConfig: GroupedTieredPackageConfig) = apply {
                    additionalProperties =
                        groupedTieredPackageConfig.additionalProperties.toMutableMap()
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

                fun build(): GroupedTieredPackageConfig =
                    GroupedTieredPackageConfig(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedTieredPackageConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GroupedTieredPackageConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val GROUPED_TIERED_PACKAGE = of("grouped_tiered_package")

                fun of(value: String) = ModelType(JsonField.of(value))
            }

            enum class Known {
                GROUPED_TIERED_PACKAGE,
            }

            enum class Value {
                GROUPED_TIERED_PACKAGE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    GROUPED_TIERED_PACKAGE -> Value.GROUPED_TIERED_PACKAGE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    GROUPED_TIERED_PACKAGE -> Known.GROUPED_TIERED_PACKAGE
                    else -> throw OrbInvalidDataException("Unknown ModelType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @NoAutoDetect
        class BillingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(billingCycleConfiguration: BillingCycleConfiguration) = apply {
                    duration = billingCycleConfiguration.duration
                    durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties =
                        billingCycleConfiguration.additionalProperties.toMutableMap()
                }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @NoAutoDetect
        class InvoicingCycleConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("duration") private val duration: Long,
            @JsonProperty("duration_unit") private val durationUnit: DurationUnit,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit = durationUnit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var duration: Long? = null
                private var durationUnit: DurationUnit? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(invoicingCycleConfiguration: InvoicingCycleConfiguration) =
                    apply {
                        duration = invoicingCycleConfiguration.duration
                        durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties =
                            invoicingCycleConfiguration.additionalProperties.toMutableMap()
                    }

                /** The duration of the billing period. */
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
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

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val DAY = of("day")

                    val MONTH = of("month")

                    fun of(value: String) = DurationUnit(JsonField.of(value))
                }

                enum class Known {
                    DAY,
                    MONTH,
                }

                enum class Value {
                    DAY,
                    MONTH,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DAY -> Value.DAY
                        MONTH -> Value.MONTH
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        DAY -> Known.DAY
                        MONTH -> Known.MONTH
                        else -> throw OrbInvalidDataException("Unknown DurationUnit: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && duration == other.duration && durationUnit == other.durationUnit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(duration, durationUnit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @NoAutoDetect
        class Metadata
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

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

                fun build(): Metadata = Metadata(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedTieredPackagePrice && metadata == other.metadata && externalPriceId == other.externalPriceId && name == other.name && billableMetricId == other.billableMetricId && itemId == other.itemId && billedInAdvance == other.billedInAdvance && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && cadence == other.cadence && billingCycleConfiguration == other.billingCycleConfiguration && invoicingCycleConfiguration == other.invoicingCycleConfiguration && conversionRate == other.conversionRate && modelType == other.modelType && groupedTieredPackageConfig == other.groupedTieredPackageConfig && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedTieredPackageConfig, currency, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedTieredPackagePrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedTieredPackageConfig=$groupedTieredPackageConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PriceCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
