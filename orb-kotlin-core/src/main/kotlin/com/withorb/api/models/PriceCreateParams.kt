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
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("unit_config") private val unitConfig: UnitConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("unit_config") fun unitConfig(): UnitConfig = unitConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var unitConfig: UnitConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingUnitPrice: NewFloatingUnitPrice) = apply {
                cadence = newFloatingUnitPrice.cadence
                currency = newFloatingUnitPrice.currency
                itemId = newFloatingUnitPrice.itemId
                modelType = newFloatingUnitPrice.modelType
                name = newFloatingUnitPrice.name
                unitConfig = newFloatingUnitPrice.unitConfig
                billableMetricId = newFloatingUnitPrice.billableMetricId
                billedInAdvance = newFloatingUnitPrice.billedInAdvance
                billingCycleConfiguration = newFloatingUnitPrice.billingCycleConfiguration
                conversionRate = newFloatingUnitPrice.conversionRate
                externalPriceId = newFloatingUnitPrice.externalPriceId
                fixedPriceQuantity = newFloatingUnitPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingUnitPrice.invoiceGroupingKey
                invoicingCycleConfiguration = newFloatingUnitPrice.invoicingCycleConfiguration
                metadata = newFloatingUnitPrice.metadata
                additionalProperties = newFloatingUnitPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun unitConfig(unitConfig: UnitConfig) = apply { this.unitConfig = unitConfig }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(unitConfig) { "`unitConfig` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingUnitPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && unitConfig == other.unitConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, unitConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingUnitPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, unitConfig=$unitConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingPackagePrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("package_config") private val packageConfig: PackageConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("package_config") fun packageConfig(): PackageConfig = packageConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var packageConfig: PackageConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingPackagePrice: NewFloatingPackagePrice) = apply {
                cadence = newFloatingPackagePrice.cadence
                currency = newFloatingPackagePrice.currency
                itemId = newFloatingPackagePrice.itemId
                modelType = newFloatingPackagePrice.modelType
                name = newFloatingPackagePrice.name
                packageConfig = newFloatingPackagePrice.packageConfig
                billableMetricId = newFloatingPackagePrice.billableMetricId
                billedInAdvance = newFloatingPackagePrice.billedInAdvance
                billingCycleConfiguration = newFloatingPackagePrice.billingCycleConfiguration
                conversionRate = newFloatingPackagePrice.conversionRate
                externalPriceId = newFloatingPackagePrice.externalPriceId
                fixedPriceQuantity = newFloatingPackagePrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingPackagePrice.invoiceGroupingKey
                invoicingCycleConfiguration = newFloatingPackagePrice.invoicingCycleConfiguration
                metadata = newFloatingPackagePrice.metadata
                additionalProperties = newFloatingPackagePrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun packageConfig(packageConfig: PackageConfig) = apply {
                this.packageConfig = packageConfig
            }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(packageConfig) { "`packageConfig` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingPackagePrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && packageConfig == other.packageConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, packageConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingPackagePrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, packageConfig=$packageConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingMatrixPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("matrix_config") private val matrixConfig: MatrixConfig,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("matrix_config") fun matrixConfig(): MatrixConfig = matrixConfig

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var matrixConfig: MatrixConfig? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingMatrixPrice: NewFloatingMatrixPrice) = apply {
                cadence = newFloatingMatrixPrice.cadence
                currency = newFloatingMatrixPrice.currency
                itemId = newFloatingMatrixPrice.itemId
                matrixConfig = newFloatingMatrixPrice.matrixConfig
                modelType = newFloatingMatrixPrice.modelType
                name = newFloatingMatrixPrice.name
                billableMetricId = newFloatingMatrixPrice.billableMetricId
                billedInAdvance = newFloatingMatrixPrice.billedInAdvance
                billingCycleConfiguration = newFloatingMatrixPrice.billingCycleConfiguration
                conversionRate = newFloatingMatrixPrice.conversionRate
                externalPriceId = newFloatingMatrixPrice.externalPriceId
                fixedPriceQuantity = newFloatingMatrixPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingMatrixPrice.invoiceGroupingKey
                invoicingCycleConfiguration = newFloatingMatrixPrice.invoicingCycleConfiguration
                metadata = newFloatingMatrixPrice.metadata
                additionalProperties = newFloatingMatrixPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun matrixConfig(matrixConfig: MatrixConfig) = apply {
                this.matrixConfig = matrixConfig
            }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(matrixConfig) { "`matrixConfig` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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
            @JsonProperty("default_unit_amount") private val defaultUnitAmount: String,
            @JsonProperty("dimensions") private val dimensions: List<String?>,
            @JsonProperty("matrix_values") private val matrixValues: List<MatrixValue>,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            @JsonProperty("default_unit_amount") fun defaultUnitAmount(): String = defaultUnitAmount

            /** One or two event property values to evaluate matrix groups by */
            @JsonProperty("dimensions") fun dimensions(): List<String?> = dimensions

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

                private var defaultUnitAmount: String? = null
                private var dimensions: MutableList<String?>? = null
                private var matrixValues: MutableList<MatrixValue>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixConfig: MatrixConfig) = apply {
                    defaultUnitAmount = matrixConfig.defaultUnitAmount
                    dimensions = matrixConfig.dimensions.toMutableList()
                    matrixValues = matrixConfig.matrixValues.toMutableList()
                    additionalProperties = matrixConfig.additionalProperties.toMutableMap()
                }

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                fun defaultUnitAmount(defaultUnitAmount: String) = apply {
                    this.defaultUnitAmount = defaultUnitAmount
                }

                /** One or two event property values to evaluate matrix groups by */
                fun dimensions(dimensions: List<String?>) = apply {
                    this.dimensions = dimensions.toMutableList()
                }

                /** One or two event property values to evaluate matrix groups by */
                fun addDimension(dimension: String) = apply {
                    dimensions = (dimensions ?: mutableListOf()).apply { add(dimension) }
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
                        checkNotNull(defaultUnitAmount) {
                            "`defaultUnitAmount` is required but was not set"
                        },
                        checkNotNull(dimensions) { "`dimensions` is required but was not set" }
                            .toImmutable(),
                        checkNotNull(matrixValues) { "`matrixValues` is required but was not set" }
                            .toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class MatrixValue
            @JsonCreator
            private constructor(
                @JsonProperty("dimension_values") private val dimensionValues: List<String?>,
                @JsonProperty("unit_amount") private val unitAmount: String,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                @JsonProperty("dimension_values")
                fun dimensionValues(): List<String?> = dimensionValues

                /** Unit price for the specified dimension_values */
                @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var dimensionValues: MutableList<String?>? = null
                    private var unitAmount: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixValue: MatrixValue) = apply {
                        dimensionValues = matrixValue.dimensionValues.toMutableList()
                        unitAmount = matrixValue.unitAmount
                        additionalProperties = matrixValue.additionalProperties.toMutableMap()
                    }

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

                    /** Unit price for the specified dimension_values */
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

                    fun build(): MatrixValue =
                        MatrixValue(
                            checkNotNull(dimensionValues) {
                                    "`dimensionValues` is required but was not set"
                                }
                                .toImmutable(),
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixValue && dimensionValues == other.dimensionValues && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(dimensionValues, unitAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixValue{dimensionValues=$dimensionValues, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixConfig && defaultUnitAmount == other.defaultUnitAmount && dimensions == other.dimensions && matrixValues == other.matrixValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(defaultUnitAmount, dimensions, matrixValues, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixConfig{defaultUnitAmount=$defaultUnitAmount, dimensions=$dimensions, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is NewFloatingMatrixPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && matrixConfig == other.matrixConfig && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, matrixConfig, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingMatrixPrice{cadence=$cadence, currency=$currency, itemId=$itemId, matrixConfig=$matrixConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingMatrixWithAllocationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("matrix_with_allocation_config")
        private val matrixWithAllocationConfig: MatrixWithAllocationConfig,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("matrix_with_allocation_config")
        fun matrixWithAllocationConfig(): MatrixWithAllocationConfig = matrixWithAllocationConfig

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var matrixWithAllocationConfig: MatrixWithAllocationConfig? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
            ) = apply {
                cadence = newFloatingMatrixWithAllocationPrice.cadence
                currency = newFloatingMatrixWithAllocationPrice.currency
                itemId = newFloatingMatrixWithAllocationPrice.itemId
                matrixWithAllocationConfig =
                    newFloatingMatrixWithAllocationPrice.matrixWithAllocationConfig
                modelType = newFloatingMatrixWithAllocationPrice.modelType
                name = newFloatingMatrixWithAllocationPrice.name
                billableMetricId = newFloatingMatrixWithAllocationPrice.billableMetricId
                billedInAdvance = newFloatingMatrixWithAllocationPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingMatrixWithAllocationPrice.billingCycleConfiguration
                conversionRate = newFloatingMatrixWithAllocationPrice.conversionRate
                externalPriceId = newFloatingMatrixWithAllocationPrice.externalPriceId
                fixedPriceQuantity = newFloatingMatrixWithAllocationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingMatrixWithAllocationPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingMatrixWithAllocationPrice.invoicingCycleConfiguration
                metadata = newFloatingMatrixWithAllocationPrice.metadata
                additionalProperties =
                    newFloatingMatrixWithAllocationPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun matrixWithAllocationConfig(matrixWithAllocationConfig: MatrixWithAllocationConfig) =
                apply {
                    this.matrixWithAllocationConfig = matrixWithAllocationConfig
                }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(matrixWithAllocationConfig) {
                        "`matrixWithAllocationConfig` is required but was not set"
                    },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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
            @JsonProperty("allocation") private val allocation: Double,
            @JsonProperty("default_unit_amount") private val defaultUnitAmount: String,
            @JsonProperty("dimensions") private val dimensions: List<String?>,
            @JsonProperty("matrix_values") private val matrixValues: List<MatrixValue>,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Allocation to be used to calculate the price */
            @JsonProperty("allocation") fun allocation(): Double = allocation

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            @JsonProperty("default_unit_amount") fun defaultUnitAmount(): String = defaultUnitAmount

            /** One or two event property values to evaluate matrix groups by */
            @JsonProperty("dimensions") fun dimensions(): List<String?> = dimensions

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

                private var allocation: Double? = null
                private var defaultUnitAmount: String? = null
                private var dimensions: MutableList<String?>? = null
                private var matrixValues: MutableList<MatrixValue>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixWithAllocationConfig: MatrixWithAllocationConfig) = apply {
                    allocation = matrixWithAllocationConfig.allocation
                    defaultUnitAmount = matrixWithAllocationConfig.defaultUnitAmount
                    dimensions = matrixWithAllocationConfig.dimensions.toMutableList()
                    matrixValues = matrixWithAllocationConfig.matrixValues.toMutableList()
                    additionalProperties =
                        matrixWithAllocationConfig.additionalProperties.toMutableMap()
                }

                /** Allocation to be used to calculate the price */
                fun allocation(allocation: Double) = apply { this.allocation = allocation }

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                fun defaultUnitAmount(defaultUnitAmount: String) = apply {
                    this.defaultUnitAmount = defaultUnitAmount
                }

                /** One or two event property values to evaluate matrix groups by */
                fun dimensions(dimensions: List<String?>) = apply {
                    this.dimensions = dimensions.toMutableList()
                }

                /** One or two event property values to evaluate matrix groups by */
                fun addDimension(dimension: String) = apply {
                    dimensions = (dimensions ?: mutableListOf()).apply { add(dimension) }
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

                fun build(): MatrixWithAllocationConfig =
                    MatrixWithAllocationConfig(
                        checkNotNull(allocation) { "`allocation` is required but was not set" },
                        checkNotNull(defaultUnitAmount) {
                            "`defaultUnitAmount` is required but was not set"
                        },
                        checkNotNull(dimensions) { "`dimensions` is required but was not set" }
                            .toImmutable(),
                        checkNotNull(matrixValues) { "`matrixValues` is required but was not set" }
                            .toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class MatrixValue
            @JsonCreator
            private constructor(
                @JsonProperty("dimension_values") private val dimensionValues: List<String?>,
                @JsonProperty("unit_amount") private val unitAmount: String,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                @JsonProperty("dimension_values")
                fun dimensionValues(): List<String?> = dimensionValues

                /** Unit price for the specified dimension_values */
                @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var dimensionValues: MutableList<String?>? = null
                    private var unitAmount: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixValue: MatrixValue) = apply {
                        dimensionValues = matrixValue.dimensionValues.toMutableList()
                        unitAmount = matrixValue.unitAmount
                        additionalProperties = matrixValue.additionalProperties.toMutableMap()
                    }

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

                    /** Unit price for the specified dimension_values */
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

                    fun build(): MatrixValue =
                        MatrixValue(
                            checkNotNull(dimensionValues) {
                                    "`dimensionValues` is required but was not set"
                                }
                                .toImmutable(),
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixValue && dimensionValues == other.dimensionValues && unitAmount == other.unitAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(dimensionValues, unitAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MatrixValue{dimensionValues=$dimensionValues, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixWithAllocationConfig && allocation == other.allocation && defaultUnitAmount == other.defaultUnitAmount && dimensions == other.dimensions && matrixValues == other.matrixValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(allocation, defaultUnitAmount, dimensions, matrixValues, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MatrixWithAllocationConfig{allocation=$allocation, defaultUnitAmount=$defaultUnitAmount, dimensions=$dimensions, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is NewFloatingMatrixWithAllocationPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && matrixWithAllocationConfig == other.matrixWithAllocationConfig && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, matrixWithAllocationConfig, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingMatrixWithAllocationPrice{cadence=$cadence, currency=$currency, itemId=$itemId, matrixWithAllocationConfig=$matrixWithAllocationConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("tiered_config") private val tieredConfig: TieredConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("tiered_config") fun tieredConfig(): TieredConfig = tieredConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var tieredConfig: TieredConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingTieredPrice: NewFloatingTieredPrice) = apply {
                cadence = newFloatingTieredPrice.cadence
                currency = newFloatingTieredPrice.currency
                itemId = newFloatingTieredPrice.itemId
                modelType = newFloatingTieredPrice.modelType
                name = newFloatingTieredPrice.name
                tieredConfig = newFloatingTieredPrice.tieredConfig
                billableMetricId = newFloatingTieredPrice.billableMetricId
                billedInAdvance = newFloatingTieredPrice.billedInAdvance
                billingCycleConfiguration = newFloatingTieredPrice.billingCycleConfiguration
                conversionRate = newFloatingTieredPrice.conversionRate
                externalPriceId = newFloatingTieredPrice.externalPriceId
                fixedPriceQuantity = newFloatingTieredPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredPrice.invoiceGroupingKey
                invoicingCycleConfiguration = newFloatingTieredPrice.invoicingCycleConfiguration
                metadata = newFloatingTieredPrice.metadata
                additionalProperties = newFloatingTieredPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun tieredConfig(tieredConfig: TieredConfig) = apply {
                this.tieredConfig = tieredConfig
            }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(tieredConfig) { "`tieredConfig` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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
                @JsonProperty("unit_amount") private val unitAmount: String,
                @JsonProperty("last_unit") private val lastUnit: Double?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Inclusive tier starting value */
                @JsonProperty("first_unit") fun firstUnit(): Double = firstUnit

                /** Amount per unit */
                @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

                /** Exclusive tier ending value. If null, this is treated as the last tier */
                @JsonProperty("last_unit") fun lastUnit(): Double? = lastUnit

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var firstUnit: Double? = null
                    private var unitAmount: String? = null
                    private var lastUnit: Double? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        firstUnit = tier.firstUnit
                        unitAmount = tier.unitAmount
                        lastUnit = tier.lastUnit
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Inclusive tier starting value */
                    fun firstUnit(firstUnit: Double) = apply { this.firstUnit = firstUnit }

                    /** Amount per unit */
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    fun lastUnit(lastUnit: Double?) = apply { this.lastUnit = lastUnit }

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    fun lastUnit(lastUnit: Double) = lastUnit(lastUnit as Double?)

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
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            lastUnit,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && firstUnit == other.firstUnit && unitAmount == other.unitAmount && lastUnit == other.lastUnit && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(firstUnit, unitAmount, lastUnit, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{firstUnit=$firstUnit, unitAmount=$unitAmount, lastUnit=$lastUnit, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is NewFloatingTieredPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && tieredConfig == other.tieredConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, tieredConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, tieredConfig=$tieredConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredBpsPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("tiered_bps_config") private val tieredBpsConfig: TieredBpsConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("tiered_bps_config") fun tieredBpsConfig(): TieredBpsConfig = tieredBpsConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var tieredBpsConfig: TieredBpsConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice) = apply {
                cadence = newFloatingTieredBpsPrice.cadence
                currency = newFloatingTieredBpsPrice.currency
                itemId = newFloatingTieredBpsPrice.itemId
                modelType = newFloatingTieredBpsPrice.modelType
                name = newFloatingTieredBpsPrice.name
                tieredBpsConfig = newFloatingTieredBpsPrice.tieredBpsConfig
                billableMetricId = newFloatingTieredBpsPrice.billableMetricId
                billedInAdvance = newFloatingTieredBpsPrice.billedInAdvance
                billingCycleConfiguration = newFloatingTieredBpsPrice.billingCycleConfiguration
                conversionRate = newFloatingTieredBpsPrice.conversionRate
                externalPriceId = newFloatingTieredBpsPrice.externalPriceId
                fixedPriceQuantity = newFloatingTieredBpsPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredBpsPrice.invoiceGroupingKey
                invoicingCycleConfiguration = newFloatingTieredBpsPrice.invoicingCycleConfiguration
                metadata = newFloatingTieredBpsPrice.metadata
                additionalProperties = newFloatingTieredBpsPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun tieredBpsConfig(tieredBpsConfig: TieredBpsConfig) = apply {
                this.tieredBpsConfig = tieredBpsConfig
            }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(tieredBpsConfig) {
                        "`tieredBpsConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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
                @JsonProperty("bps") private val bps: Double,
                @JsonProperty("minimum_amount") private val minimumAmount: String,
                @JsonProperty("maximum_amount") private val maximumAmount: String?,
                @JsonProperty("per_unit_maximum") private val perUnitMaximum: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Per-event basis point rate */
                @JsonProperty("bps") fun bps(): Double = bps

                /** Inclusive tier starting value */
                @JsonProperty("minimum_amount") fun minimumAmount(): String = minimumAmount

                /** Exclusive tier ending value */
                @JsonProperty("maximum_amount") fun maximumAmount(): String? = maximumAmount

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

                    private var bps: Double? = null
                    private var minimumAmount: String? = null
                    private var maximumAmount: String? = null
                    private var perUnitMaximum: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        bps = tier.bps
                        minimumAmount = tier.minimumAmount
                        maximumAmount = tier.maximumAmount
                        perUnitMaximum = tier.perUnitMaximum
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Per-event basis point rate */
                    fun bps(bps: Double) = apply { this.bps = bps }

                    /** Inclusive tier starting value */
                    fun minimumAmount(minimumAmount: String) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** Exclusive tier ending value */
                    fun maximumAmount(maximumAmount: String?) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** Per unit maximum to charge */
                    fun perUnitMaximum(perUnitMaximum: String?) = apply {
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
                            checkNotNull(bps) { "`bps` is required but was not set" },
                            checkNotNull(minimumAmount) {
                                "`minimumAmount` is required but was not set"
                            },
                            maximumAmount,
                            perUnitMaximum,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && bps == other.bps && minimumAmount == other.minimumAmount && maximumAmount == other.maximumAmount && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(bps, minimumAmount, maximumAmount, perUnitMaximum, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{bps=$bps, minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is NewFloatingTieredBpsPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && tieredBpsConfig == other.tieredBpsConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, tieredBpsConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredBpsPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, tieredBpsConfig=$tieredBpsConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingBpsPrice
    @JsonCreator
    private constructor(
        @JsonProperty("bps_config") private val bpsConfig: BpsConfig,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("bps_config") fun bpsConfig(): BpsConfig = bpsConfig

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var bpsConfig: BpsConfig? = null
            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingBpsPrice: NewFloatingBpsPrice) = apply {
                bpsConfig = newFloatingBpsPrice.bpsConfig
                cadence = newFloatingBpsPrice.cadence
                currency = newFloatingBpsPrice.currency
                itemId = newFloatingBpsPrice.itemId
                modelType = newFloatingBpsPrice.modelType
                name = newFloatingBpsPrice.name
                billableMetricId = newFloatingBpsPrice.billableMetricId
                billedInAdvance = newFloatingBpsPrice.billedInAdvance
                billingCycleConfiguration = newFloatingBpsPrice.billingCycleConfiguration
                conversionRate = newFloatingBpsPrice.conversionRate
                externalPriceId = newFloatingBpsPrice.externalPriceId
                fixedPriceQuantity = newFloatingBpsPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingBpsPrice.invoiceGroupingKey
                invoicingCycleConfiguration = newFloatingBpsPrice.invoicingCycleConfiguration
                metadata = newFloatingBpsPrice.metadata
                additionalProperties = newFloatingBpsPrice.additionalProperties.toMutableMap()
            }

            fun bpsConfig(bpsConfig: BpsConfig) = apply { this.bpsConfig = bpsConfig }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(bpsConfig) { "`bpsConfig` is required but was not set" },
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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
                fun perUnitMaximum(perUnitMaximum: String?) = apply {
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

            return /* spotless:off */ other is NewFloatingBpsPrice && bpsConfig == other.bpsConfig && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bpsConfig, cadence, currency, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingBpsPrice{bpsConfig=$bpsConfig, cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingBulkBpsPrice
    @JsonCreator
    private constructor(
        @JsonProperty("bulk_bps_config") private val bulkBpsConfig: BulkBpsConfig,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("bulk_bps_config") fun bulkBpsConfig(): BulkBpsConfig = bulkBpsConfig

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var bulkBpsConfig: BulkBpsConfig? = null
            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice) = apply {
                bulkBpsConfig = newFloatingBulkBpsPrice.bulkBpsConfig
                cadence = newFloatingBulkBpsPrice.cadence
                currency = newFloatingBulkBpsPrice.currency
                itemId = newFloatingBulkBpsPrice.itemId
                modelType = newFloatingBulkBpsPrice.modelType
                name = newFloatingBulkBpsPrice.name
                billableMetricId = newFloatingBulkBpsPrice.billableMetricId
                billedInAdvance = newFloatingBulkBpsPrice.billedInAdvance
                billingCycleConfiguration = newFloatingBulkBpsPrice.billingCycleConfiguration
                conversionRate = newFloatingBulkBpsPrice.conversionRate
                externalPriceId = newFloatingBulkBpsPrice.externalPriceId
                fixedPriceQuantity = newFloatingBulkBpsPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingBulkBpsPrice.invoiceGroupingKey
                invoicingCycleConfiguration = newFloatingBulkBpsPrice.invoicingCycleConfiguration
                metadata = newFloatingBulkBpsPrice.metadata
                additionalProperties = newFloatingBulkBpsPrice.additionalProperties.toMutableMap()
            }

            fun bulkBpsConfig(bulkBpsConfig: BulkBpsConfig) = apply {
                this.bulkBpsConfig = bulkBpsConfig
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(bulkBpsConfig) { "`bulkBpsConfig` is required but was not set" },
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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
                @JsonProperty("bps") private val bps: Double,
                @JsonProperty("maximum_amount") private val maximumAmount: String?,
                @JsonProperty("per_unit_maximum") private val perUnitMaximum: String?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Basis points to rate on */
                @JsonProperty("bps") fun bps(): Double = bps

                /** Upper bound for tier */
                @JsonProperty("maximum_amount") fun maximumAmount(): String? = maximumAmount

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

                    private var bps: Double? = null
                    private var maximumAmount: String? = null
                    private var perUnitMaximum: String? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        bps = tier.bps
                        maximumAmount = tier.maximumAmount
                        perUnitMaximum = tier.perUnitMaximum
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Basis points to rate on */
                    fun bps(bps: Double) = apply { this.bps = bps }

                    /** Upper bound for tier */
                    fun maximumAmount(maximumAmount: String?) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** The maximum amount to charge for any one event */
                    fun perUnitMaximum(perUnitMaximum: String?) = apply {
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
                            checkNotNull(bps) { "`bps` is required but was not set" },
                            maximumAmount,
                            perUnitMaximum,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && bps == other.bps && maximumAmount == other.maximumAmount && perUnitMaximum == other.perUnitMaximum && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(bps, maximumAmount, perUnitMaximum, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{bps=$bps, maximumAmount=$maximumAmount, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is NewFloatingBulkBpsPrice && bulkBpsConfig == other.bulkBpsConfig && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bulkBpsConfig, cadence, currency, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingBulkBpsPrice{bulkBpsConfig=$bulkBpsConfig, cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingBulkPrice
    @JsonCreator
    private constructor(
        @JsonProperty("bulk_config") private val bulkConfig: BulkConfig,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("bulk_config") fun bulkConfig(): BulkConfig = bulkConfig

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var bulkConfig: BulkConfig? = null
            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingBulkPrice: NewFloatingBulkPrice) = apply {
                bulkConfig = newFloatingBulkPrice.bulkConfig
                cadence = newFloatingBulkPrice.cadence
                currency = newFloatingBulkPrice.currency
                itemId = newFloatingBulkPrice.itemId
                modelType = newFloatingBulkPrice.modelType
                name = newFloatingBulkPrice.name
                billableMetricId = newFloatingBulkPrice.billableMetricId
                billedInAdvance = newFloatingBulkPrice.billedInAdvance
                billingCycleConfiguration = newFloatingBulkPrice.billingCycleConfiguration
                conversionRate = newFloatingBulkPrice.conversionRate
                externalPriceId = newFloatingBulkPrice.externalPriceId
                fixedPriceQuantity = newFloatingBulkPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingBulkPrice.invoiceGroupingKey
                invoicingCycleConfiguration = newFloatingBulkPrice.invoicingCycleConfiguration
                metadata = newFloatingBulkPrice.metadata
                additionalProperties = newFloatingBulkPrice.additionalProperties.toMutableMap()
            }

            fun bulkConfig(bulkConfig: BulkConfig) = apply { this.bulkConfig = bulkConfig }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(bulkConfig) { "`bulkConfig` is required but was not set" },
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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
                @JsonProperty("unit_amount") private val unitAmount: String,
                @JsonProperty("maximum_units") private val maximumUnits: Double?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Amount per unit */
                @JsonProperty("unit_amount") fun unitAmount(): String = unitAmount

                /** Upper bound for this tier */
                @JsonProperty("maximum_units") fun maximumUnits(): Double? = maximumUnits

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: String? = null
                    private var maximumUnits: Double? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(tier: Tier) = apply {
                        unitAmount = tier.unitAmount
                        maximumUnits = tier.maximumUnits
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    /** Amount per unit */
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                    /** Upper bound for this tier */
                    fun maximumUnits(maximumUnits: Double?) = apply {
                        this.maximumUnits = maximumUnits
                    }

                    /** Upper bound for this tier */
                    fun maximumUnits(maximumUnits: Double) = maximumUnits(maximumUnits as Double?)

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
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            maximumUnits,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && unitAmount == other.unitAmount && maximumUnits == other.maximumUnits && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(unitAmount, maximumUnits, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{unitAmount=$unitAmount, maximumUnits=$maximumUnits, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is NewFloatingBulkPrice && bulkConfig == other.bulkConfig && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bulkConfig, cadence, currency, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingBulkPrice{bulkConfig=$bulkConfig, cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingThresholdTotalAmountPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("threshold_total_amount_config")
        private val thresholdTotalAmountConfig: ThresholdTotalAmountConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("threshold_total_amount_config")
        fun thresholdTotalAmountConfig(): ThresholdTotalAmountConfig = thresholdTotalAmountConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var thresholdTotalAmountConfig: ThresholdTotalAmountConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
            ) = apply {
                cadence = newFloatingThresholdTotalAmountPrice.cadence
                currency = newFloatingThresholdTotalAmountPrice.currency
                itemId = newFloatingThresholdTotalAmountPrice.itemId
                modelType = newFloatingThresholdTotalAmountPrice.modelType
                name = newFloatingThresholdTotalAmountPrice.name
                thresholdTotalAmountConfig =
                    newFloatingThresholdTotalAmountPrice.thresholdTotalAmountConfig
                billableMetricId = newFloatingThresholdTotalAmountPrice.billableMetricId
                billedInAdvance = newFloatingThresholdTotalAmountPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingThresholdTotalAmountPrice.billingCycleConfiguration
                conversionRate = newFloatingThresholdTotalAmountPrice.conversionRate
                externalPriceId = newFloatingThresholdTotalAmountPrice.externalPriceId
                fixedPriceQuantity = newFloatingThresholdTotalAmountPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingThresholdTotalAmountPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingThresholdTotalAmountPrice.invoicingCycleConfiguration
                metadata = newFloatingThresholdTotalAmountPrice.metadata
                additionalProperties =
                    newFloatingThresholdTotalAmountPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun thresholdTotalAmountConfig(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) =
                apply {
                    this.thresholdTotalAmountConfig = thresholdTotalAmountConfig
                }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(thresholdTotalAmountConfig) {
                        "`thresholdTotalAmountConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingThresholdTotalAmountPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && thresholdTotalAmountConfig == other.thresholdTotalAmountConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, thresholdTotalAmountConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingThresholdTotalAmountPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, thresholdTotalAmountConfig=$thresholdTotalAmountConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredPackagePrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("tiered_package_config") private val tieredPackageConfig: TieredPackageConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("tiered_package_config")
        fun tieredPackageConfig(): TieredPackageConfig = tieredPackageConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var tieredPackageConfig: TieredPackageConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice) =
                apply {
                    cadence = newFloatingTieredPackagePrice.cadence
                    currency = newFloatingTieredPackagePrice.currency
                    itemId = newFloatingTieredPackagePrice.itemId
                    modelType = newFloatingTieredPackagePrice.modelType
                    name = newFloatingTieredPackagePrice.name
                    tieredPackageConfig = newFloatingTieredPackagePrice.tieredPackageConfig
                    billableMetricId = newFloatingTieredPackagePrice.billableMetricId
                    billedInAdvance = newFloatingTieredPackagePrice.billedInAdvance
                    billingCycleConfiguration =
                        newFloatingTieredPackagePrice.billingCycleConfiguration
                    conversionRate = newFloatingTieredPackagePrice.conversionRate
                    externalPriceId = newFloatingTieredPackagePrice.externalPriceId
                    fixedPriceQuantity = newFloatingTieredPackagePrice.fixedPriceQuantity
                    invoiceGroupingKey = newFloatingTieredPackagePrice.invoiceGroupingKey
                    invoicingCycleConfiguration =
                        newFloatingTieredPackagePrice.invoicingCycleConfiguration
                    metadata = newFloatingTieredPackagePrice.metadata
                    additionalProperties =
                        newFloatingTieredPackagePrice.additionalProperties.toMutableMap()
                }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun tieredPackageConfig(tieredPackageConfig: TieredPackageConfig) = apply {
                this.tieredPackageConfig = tieredPackageConfig
            }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(tieredPackageConfig) {
                        "`tieredPackageConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingTieredPackagePrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && tieredPackageConfig == other.tieredPackageConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, tieredPackageConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredPackagePrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, tieredPackageConfig=$tieredPackageConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedTieredPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("grouped_tiered_config") private val groupedTieredConfig: GroupedTieredConfig,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonProperty("grouped_tiered_config")
        fun groupedTieredConfig(): GroupedTieredConfig = groupedTieredConfig

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var groupedTieredConfig: GroupedTieredConfig? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice) =
                apply {
                    cadence = newFloatingGroupedTieredPrice.cadence
                    currency = newFloatingGroupedTieredPrice.currency
                    groupedTieredConfig = newFloatingGroupedTieredPrice.groupedTieredConfig
                    itemId = newFloatingGroupedTieredPrice.itemId
                    modelType = newFloatingGroupedTieredPrice.modelType
                    name = newFloatingGroupedTieredPrice.name
                    billableMetricId = newFloatingGroupedTieredPrice.billableMetricId
                    billedInAdvance = newFloatingGroupedTieredPrice.billedInAdvance
                    billingCycleConfiguration =
                        newFloatingGroupedTieredPrice.billingCycleConfiguration
                    conversionRate = newFloatingGroupedTieredPrice.conversionRate
                    externalPriceId = newFloatingGroupedTieredPrice.externalPriceId
                    fixedPriceQuantity = newFloatingGroupedTieredPrice.fixedPriceQuantity
                    invoiceGroupingKey = newFloatingGroupedTieredPrice.invoiceGroupingKey
                    invoicingCycleConfiguration =
                        newFloatingGroupedTieredPrice.invoicingCycleConfiguration
                    metadata = newFloatingGroupedTieredPrice.metadata
                    additionalProperties =
                        newFloatingGroupedTieredPrice.additionalProperties.toMutableMap()
                }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            fun groupedTieredConfig(groupedTieredConfig: GroupedTieredConfig) = apply {
                this.groupedTieredConfig = groupedTieredConfig
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(groupedTieredConfig) {
                        "`groupedTieredConfig` is required but was not set"
                    },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingGroupedTieredPrice && cadence == other.cadence && currency == other.currency && groupedTieredConfig == other.groupedTieredConfig && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, groupedTieredConfig, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedTieredPrice{cadence=$cadence, currency=$currency, groupedTieredConfig=$groupedTieredConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredWithMinimumPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("tiered_with_minimum_config")
        private val tieredWithMinimumConfig: TieredWithMinimumConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("tiered_with_minimum_config")
        fun tieredWithMinimumConfig(): TieredWithMinimumConfig = tieredWithMinimumConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var tieredWithMinimumConfig: TieredWithMinimumConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
            ) = apply {
                cadence = newFloatingTieredWithMinimumPrice.cadence
                currency = newFloatingTieredWithMinimumPrice.currency
                itemId = newFloatingTieredWithMinimumPrice.itemId
                modelType = newFloatingTieredWithMinimumPrice.modelType
                name = newFloatingTieredWithMinimumPrice.name
                tieredWithMinimumConfig = newFloatingTieredWithMinimumPrice.tieredWithMinimumConfig
                billableMetricId = newFloatingTieredWithMinimumPrice.billableMetricId
                billedInAdvance = newFloatingTieredWithMinimumPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingTieredWithMinimumPrice.billingCycleConfiguration
                conversionRate = newFloatingTieredWithMinimumPrice.conversionRate
                externalPriceId = newFloatingTieredWithMinimumPrice.externalPriceId
                fixedPriceQuantity = newFloatingTieredWithMinimumPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredWithMinimumPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingTieredWithMinimumPrice.invoicingCycleConfiguration
                metadata = newFloatingTieredWithMinimumPrice.metadata
                additionalProperties =
                    newFloatingTieredWithMinimumPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun tieredWithMinimumConfig(tieredWithMinimumConfig: TieredWithMinimumConfig) = apply {
                this.tieredWithMinimumConfig = tieredWithMinimumConfig
            }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(tieredWithMinimumConfig) {
                        "`tieredWithMinimumConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingTieredWithMinimumPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && tieredWithMinimumConfig == other.tieredWithMinimumConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, tieredWithMinimumConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredWithMinimumPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, tieredWithMinimumConfig=$tieredWithMinimumConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingPackageWithAllocationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("package_with_allocation_config")
        private val packageWithAllocationConfig: PackageWithAllocationConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("package_with_allocation_config")
        fun packageWithAllocationConfig(): PackageWithAllocationConfig = packageWithAllocationConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var packageWithAllocationConfig: PackageWithAllocationConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
            ) = apply {
                cadence = newFloatingPackageWithAllocationPrice.cadence
                currency = newFloatingPackageWithAllocationPrice.currency
                itemId = newFloatingPackageWithAllocationPrice.itemId
                modelType = newFloatingPackageWithAllocationPrice.modelType
                name = newFloatingPackageWithAllocationPrice.name
                packageWithAllocationConfig =
                    newFloatingPackageWithAllocationPrice.packageWithAllocationConfig
                billableMetricId = newFloatingPackageWithAllocationPrice.billableMetricId
                billedInAdvance = newFloatingPackageWithAllocationPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingPackageWithAllocationPrice.billingCycleConfiguration
                conversionRate = newFloatingPackageWithAllocationPrice.conversionRate
                externalPriceId = newFloatingPackageWithAllocationPrice.externalPriceId
                fixedPriceQuantity = newFloatingPackageWithAllocationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingPackageWithAllocationPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingPackageWithAllocationPrice.invoicingCycleConfiguration
                metadata = newFloatingPackageWithAllocationPrice.metadata
                additionalProperties =
                    newFloatingPackageWithAllocationPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun packageWithAllocationConfig(
                packageWithAllocationConfig: PackageWithAllocationConfig
            ) = apply { this.packageWithAllocationConfig = packageWithAllocationConfig }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(packageWithAllocationConfig) {
                        "`packageWithAllocationConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingPackageWithAllocationPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && packageWithAllocationConfig == other.packageWithAllocationConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, packageWithAllocationConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingPackageWithAllocationPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, packageWithAllocationConfig=$packageWithAllocationConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredPackageWithMinimumPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("tiered_package_with_minimum_config")
        private val tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("tiered_package_with_minimum_config")
        fun tieredPackageWithMinimumConfig(): TieredPackageWithMinimumConfig =
            tieredPackageWithMinimumConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingTieredPackageWithMinimumPrice: NewFloatingTieredPackageWithMinimumPrice
            ) = apply {
                cadence = newFloatingTieredPackageWithMinimumPrice.cadence
                currency = newFloatingTieredPackageWithMinimumPrice.currency
                itemId = newFloatingTieredPackageWithMinimumPrice.itemId
                modelType = newFloatingTieredPackageWithMinimumPrice.modelType
                name = newFloatingTieredPackageWithMinimumPrice.name
                tieredPackageWithMinimumConfig =
                    newFloatingTieredPackageWithMinimumPrice.tieredPackageWithMinimumConfig
                billableMetricId = newFloatingTieredPackageWithMinimumPrice.billableMetricId
                billedInAdvance = newFloatingTieredPackageWithMinimumPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingTieredPackageWithMinimumPrice.billingCycleConfiguration
                conversionRate = newFloatingTieredPackageWithMinimumPrice.conversionRate
                externalPriceId = newFloatingTieredPackageWithMinimumPrice.externalPriceId
                fixedPriceQuantity = newFloatingTieredPackageWithMinimumPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredPackageWithMinimumPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingTieredPackageWithMinimumPrice.invoicingCycleConfiguration
                metadata = newFloatingTieredPackageWithMinimumPrice.metadata
                additionalProperties =
                    newFloatingTieredPackageWithMinimumPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun tieredPackageWithMinimumConfig(
                tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig
            ) = apply { this.tieredPackageWithMinimumConfig = tieredPackageWithMinimumConfig }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(tieredPackageWithMinimumConfig) {
                        "`tieredPackageWithMinimumConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingTieredPackageWithMinimumPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && tieredPackageWithMinimumConfig == other.tieredPackageWithMinimumConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, tieredPackageWithMinimumConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredPackageWithMinimumPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, tieredPackageWithMinimumConfig=$tieredPackageWithMinimumConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingUnitWithPercentPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("unit_with_percent_config")
        private val unitWithPercentConfig: UnitWithPercentConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("unit_with_percent_config")
        fun unitWithPercentConfig(): UnitWithPercentConfig = unitWithPercentConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var unitWithPercentConfig: UnitWithPercentConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice) =
                apply {
                    cadence = newFloatingUnitWithPercentPrice.cadence
                    currency = newFloatingUnitWithPercentPrice.currency
                    itemId = newFloatingUnitWithPercentPrice.itemId
                    modelType = newFloatingUnitWithPercentPrice.modelType
                    name = newFloatingUnitWithPercentPrice.name
                    unitWithPercentConfig = newFloatingUnitWithPercentPrice.unitWithPercentConfig
                    billableMetricId = newFloatingUnitWithPercentPrice.billableMetricId
                    billedInAdvance = newFloatingUnitWithPercentPrice.billedInAdvance
                    billingCycleConfiguration =
                        newFloatingUnitWithPercentPrice.billingCycleConfiguration
                    conversionRate = newFloatingUnitWithPercentPrice.conversionRate
                    externalPriceId = newFloatingUnitWithPercentPrice.externalPriceId
                    fixedPriceQuantity = newFloatingUnitWithPercentPrice.fixedPriceQuantity
                    invoiceGroupingKey = newFloatingUnitWithPercentPrice.invoiceGroupingKey
                    invoicingCycleConfiguration =
                        newFloatingUnitWithPercentPrice.invoicingCycleConfiguration
                    metadata = newFloatingUnitWithPercentPrice.metadata
                    additionalProperties =
                        newFloatingUnitWithPercentPrice.additionalProperties.toMutableMap()
                }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun unitWithPercentConfig(unitWithPercentConfig: UnitWithPercentConfig) = apply {
                this.unitWithPercentConfig = unitWithPercentConfig
            }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(unitWithPercentConfig) {
                        "`unitWithPercentConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingUnitWithPercentPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && unitWithPercentConfig == other.unitWithPercentConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, unitWithPercentConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingUnitWithPercentPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, unitWithPercentConfig=$unitWithPercentConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingTieredWithProrationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("tiered_with_proration_config")
        private val tieredWithProrationConfig: TieredWithProrationConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("tiered_with_proration_config")
        fun tieredWithProrationConfig(): TieredWithProrationConfig = tieredWithProrationConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var tieredWithProrationConfig: TieredWithProrationConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
            ) = apply {
                cadence = newFloatingTieredWithProrationPrice.cadence
                currency = newFloatingTieredWithProrationPrice.currency
                itemId = newFloatingTieredWithProrationPrice.itemId
                modelType = newFloatingTieredWithProrationPrice.modelType
                name = newFloatingTieredWithProrationPrice.name
                tieredWithProrationConfig =
                    newFloatingTieredWithProrationPrice.tieredWithProrationConfig
                billableMetricId = newFloatingTieredWithProrationPrice.billableMetricId
                billedInAdvance = newFloatingTieredWithProrationPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingTieredWithProrationPrice.billingCycleConfiguration
                conversionRate = newFloatingTieredWithProrationPrice.conversionRate
                externalPriceId = newFloatingTieredWithProrationPrice.externalPriceId
                fixedPriceQuantity = newFloatingTieredWithProrationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingTieredWithProrationPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingTieredWithProrationPrice.invoicingCycleConfiguration
                metadata = newFloatingTieredWithProrationPrice.metadata
                additionalProperties =
                    newFloatingTieredWithProrationPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun tieredWithProrationConfig(tieredWithProrationConfig: TieredWithProrationConfig) =
                apply {
                    this.tieredWithProrationConfig = tieredWithProrationConfig
                }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(tieredWithProrationConfig) {
                        "`tieredWithProrationConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingTieredWithProrationPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && tieredWithProrationConfig == other.tieredWithProrationConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, tieredWithProrationConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingTieredWithProrationPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, tieredWithProrationConfig=$tieredWithProrationConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingUnitWithProrationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("unit_with_proration_config")
        private val unitWithProrationConfig: UnitWithProrationConfig,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        @JsonProperty("unit_with_proration_config")
        fun unitWithProrationConfig(): UnitWithProrationConfig = unitWithProrationConfig

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var unitWithProrationConfig: UnitWithProrationConfig? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
            ) = apply {
                cadence = newFloatingUnitWithProrationPrice.cadence
                currency = newFloatingUnitWithProrationPrice.currency
                itemId = newFloatingUnitWithProrationPrice.itemId
                modelType = newFloatingUnitWithProrationPrice.modelType
                name = newFloatingUnitWithProrationPrice.name
                unitWithProrationConfig = newFloatingUnitWithProrationPrice.unitWithProrationConfig
                billableMetricId = newFloatingUnitWithProrationPrice.billableMetricId
                billedInAdvance = newFloatingUnitWithProrationPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingUnitWithProrationPrice.billingCycleConfiguration
                conversionRate = newFloatingUnitWithProrationPrice.conversionRate
                externalPriceId = newFloatingUnitWithProrationPrice.externalPriceId
                fixedPriceQuantity = newFloatingUnitWithProrationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingUnitWithProrationPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingUnitWithProrationPrice.invoicingCycleConfiguration
                metadata = newFloatingUnitWithProrationPrice.metadata
                additionalProperties =
                    newFloatingUnitWithProrationPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            fun unitWithProrationConfig(unitWithProrationConfig: UnitWithProrationConfig) = apply {
                this.unitWithProrationConfig = unitWithProrationConfig
            }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(unitWithProrationConfig) {
                        "`unitWithProrationConfig` is required but was not set"
                    },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingUnitWithProrationPrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && unitWithProrationConfig == other.unitWithProrationConfig && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, modelType, name, unitWithProrationConfig, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingUnitWithProrationPrice{cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, unitWithProrationConfig=$unitWithProrationConfig, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedAllocationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("grouped_allocation_config")
        private val groupedAllocationConfig: GroupedAllocationConfig,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonProperty("grouped_allocation_config")
        fun groupedAllocationConfig(): GroupedAllocationConfig = groupedAllocationConfig

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var groupedAllocationConfig: GroupedAllocationConfig? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice
            ) = apply {
                cadence = newFloatingGroupedAllocationPrice.cadence
                currency = newFloatingGroupedAllocationPrice.currency
                groupedAllocationConfig = newFloatingGroupedAllocationPrice.groupedAllocationConfig
                itemId = newFloatingGroupedAllocationPrice.itemId
                modelType = newFloatingGroupedAllocationPrice.modelType
                name = newFloatingGroupedAllocationPrice.name
                billableMetricId = newFloatingGroupedAllocationPrice.billableMetricId
                billedInAdvance = newFloatingGroupedAllocationPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingGroupedAllocationPrice.billingCycleConfiguration
                conversionRate = newFloatingGroupedAllocationPrice.conversionRate
                externalPriceId = newFloatingGroupedAllocationPrice.externalPriceId
                fixedPriceQuantity = newFloatingGroupedAllocationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingGroupedAllocationPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingGroupedAllocationPrice.invoicingCycleConfiguration
                metadata = newFloatingGroupedAllocationPrice.metadata
                additionalProperties =
                    newFloatingGroupedAllocationPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            fun groupedAllocationConfig(groupedAllocationConfig: GroupedAllocationConfig) = apply {
                this.groupedAllocationConfig = groupedAllocationConfig
            }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(groupedAllocationConfig) {
                        "`groupedAllocationConfig` is required but was not set"
                    },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingGroupedAllocationPrice && cadence == other.cadence && currency == other.currency && groupedAllocationConfig == other.groupedAllocationConfig && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, groupedAllocationConfig, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedAllocationPrice{cadence=$cadence, currency=$currency, groupedAllocationConfig=$groupedAllocationConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedWithProratedMinimumPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("grouped_with_prorated_minimum_config")
        private val groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonProperty("grouped_with_prorated_minimum_config")
        fun groupedWithProratedMinimumConfig(): GroupedWithProratedMinimumConfig =
            groupedWithProratedMinimumConfig

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingGroupedWithProratedMinimumPrice:
                    NewFloatingGroupedWithProratedMinimumPrice
            ) = apply {
                cadence = newFloatingGroupedWithProratedMinimumPrice.cadence
                currency = newFloatingGroupedWithProratedMinimumPrice.currency
                groupedWithProratedMinimumConfig =
                    newFloatingGroupedWithProratedMinimumPrice.groupedWithProratedMinimumConfig
                itemId = newFloatingGroupedWithProratedMinimumPrice.itemId
                modelType = newFloatingGroupedWithProratedMinimumPrice.modelType
                name = newFloatingGroupedWithProratedMinimumPrice.name
                billableMetricId = newFloatingGroupedWithProratedMinimumPrice.billableMetricId
                billedInAdvance = newFloatingGroupedWithProratedMinimumPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingGroupedWithProratedMinimumPrice.billingCycleConfiguration
                conversionRate = newFloatingGroupedWithProratedMinimumPrice.conversionRate
                externalPriceId = newFloatingGroupedWithProratedMinimumPrice.externalPriceId
                fixedPriceQuantity = newFloatingGroupedWithProratedMinimumPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingGroupedWithProratedMinimumPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingGroupedWithProratedMinimumPrice.invoicingCycleConfiguration
                metadata = newFloatingGroupedWithProratedMinimumPrice.metadata
                additionalProperties =
                    newFloatingGroupedWithProratedMinimumPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            fun groupedWithProratedMinimumConfig(
                groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig
            ) = apply { this.groupedWithProratedMinimumConfig = groupedWithProratedMinimumConfig }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(groupedWithProratedMinimumConfig) {
                        "`groupedWithProratedMinimumConfig` is required but was not set"
                    },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingGroupedWithProratedMinimumPrice && cadence == other.cadence && currency == other.currency && groupedWithProratedMinimumConfig == other.groupedWithProratedMinimumConfig && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, groupedWithProratedMinimumConfig, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedWithProratedMinimumPrice{cadence=$cadence, currency=$currency, groupedWithProratedMinimumConfig=$groupedWithProratedMinimumConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedWithMeteredMinimumPrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("grouped_with_metered_minimum_config")
        private val groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonProperty("grouped_with_metered_minimum_config")
        fun groupedWithMeteredMinimumConfig(): GroupedWithMeteredMinimumConfig =
            groupedWithMeteredMinimumConfig

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingGroupedWithMeteredMinimumPrice: NewFloatingGroupedWithMeteredMinimumPrice
            ) = apply {
                cadence = newFloatingGroupedWithMeteredMinimumPrice.cadence
                currency = newFloatingGroupedWithMeteredMinimumPrice.currency
                groupedWithMeteredMinimumConfig =
                    newFloatingGroupedWithMeteredMinimumPrice.groupedWithMeteredMinimumConfig
                itemId = newFloatingGroupedWithMeteredMinimumPrice.itemId
                modelType = newFloatingGroupedWithMeteredMinimumPrice.modelType
                name = newFloatingGroupedWithMeteredMinimumPrice.name
                billableMetricId = newFloatingGroupedWithMeteredMinimumPrice.billableMetricId
                billedInAdvance = newFloatingGroupedWithMeteredMinimumPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingGroupedWithMeteredMinimumPrice.billingCycleConfiguration
                conversionRate = newFloatingGroupedWithMeteredMinimumPrice.conversionRate
                externalPriceId = newFloatingGroupedWithMeteredMinimumPrice.externalPriceId
                fixedPriceQuantity = newFloatingGroupedWithMeteredMinimumPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingGroupedWithMeteredMinimumPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingGroupedWithMeteredMinimumPrice.invoicingCycleConfiguration
                metadata = newFloatingGroupedWithMeteredMinimumPrice.metadata
                additionalProperties =
                    newFloatingGroupedWithMeteredMinimumPrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            fun groupedWithMeteredMinimumConfig(
                groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig
            ) = apply { this.groupedWithMeteredMinimumConfig = groupedWithMeteredMinimumConfig }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(groupedWithMeteredMinimumConfig) {
                        "`groupedWithMeteredMinimumConfig` is required but was not set"
                    },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingGroupedWithMeteredMinimumPrice && cadence == other.cadence && currency == other.currency && groupedWithMeteredMinimumConfig == other.groupedWithMeteredMinimumConfig && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, groupedWithMeteredMinimumConfig, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedWithMeteredMinimumPrice{cadence=$cadence, currency=$currency, groupedWithMeteredMinimumConfig=$groupedWithMeteredMinimumConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingMatrixWithDisplayNamePrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("matrix_with_display_name_config")
        private val matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("matrix_with_display_name_config")
        fun matrixWithDisplayNameConfig(): MatrixWithDisplayNameConfig = matrixWithDisplayNameConfig

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice
            ) = apply {
                cadence = newFloatingMatrixWithDisplayNamePrice.cadence
                currency = newFloatingMatrixWithDisplayNamePrice.currency
                itemId = newFloatingMatrixWithDisplayNamePrice.itemId
                matrixWithDisplayNameConfig =
                    newFloatingMatrixWithDisplayNamePrice.matrixWithDisplayNameConfig
                modelType = newFloatingMatrixWithDisplayNamePrice.modelType
                name = newFloatingMatrixWithDisplayNamePrice.name
                billableMetricId = newFloatingMatrixWithDisplayNamePrice.billableMetricId
                billedInAdvance = newFloatingMatrixWithDisplayNamePrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingMatrixWithDisplayNamePrice.billingCycleConfiguration
                conversionRate = newFloatingMatrixWithDisplayNamePrice.conversionRate
                externalPriceId = newFloatingMatrixWithDisplayNamePrice.externalPriceId
                fixedPriceQuantity = newFloatingMatrixWithDisplayNamePrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingMatrixWithDisplayNamePrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingMatrixWithDisplayNamePrice.invoicingCycleConfiguration
                metadata = newFloatingMatrixWithDisplayNamePrice.metadata
                additionalProperties =
                    newFloatingMatrixWithDisplayNamePrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun matrixWithDisplayNameConfig(
                matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig
            ) = apply { this.matrixWithDisplayNameConfig = matrixWithDisplayNameConfig }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(matrixWithDisplayNameConfig) {
                        "`matrixWithDisplayNameConfig` is required but was not set"
                    },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingMatrixWithDisplayNamePrice && cadence == other.cadence && currency == other.currency && itemId == other.itemId && matrixWithDisplayNameConfig == other.matrixWithDisplayNameConfig && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, itemId, matrixWithDisplayNameConfig, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingMatrixWithDisplayNamePrice{cadence=$cadence, currency=$currency, itemId=$itemId, matrixWithDisplayNameConfig=$matrixWithDisplayNameConfig, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingBulkWithProrationPrice
    @JsonCreator
    private constructor(
        @JsonProperty("bulk_with_proration_config")
        private val bulkWithProrationConfig: BulkWithProrationConfig,
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("bulk_with_proration_config")
        fun bulkWithProrationConfig(): BulkWithProrationConfig = bulkWithProrationConfig

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var bulkWithProrationConfig: BulkWithProrationConfig? = null
            private var cadence: Cadence? = null
            private var currency: String? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice
            ) = apply {
                bulkWithProrationConfig = newFloatingBulkWithProrationPrice.bulkWithProrationConfig
                cadence = newFloatingBulkWithProrationPrice.cadence
                currency = newFloatingBulkWithProrationPrice.currency
                itemId = newFloatingBulkWithProrationPrice.itemId
                modelType = newFloatingBulkWithProrationPrice.modelType
                name = newFloatingBulkWithProrationPrice.name
                billableMetricId = newFloatingBulkWithProrationPrice.billableMetricId
                billedInAdvance = newFloatingBulkWithProrationPrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingBulkWithProrationPrice.billingCycleConfiguration
                conversionRate = newFloatingBulkWithProrationPrice.conversionRate
                externalPriceId = newFloatingBulkWithProrationPrice.externalPriceId
                fixedPriceQuantity = newFloatingBulkWithProrationPrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingBulkWithProrationPrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingBulkWithProrationPrice.invoicingCycleConfiguration
                metadata = newFloatingBulkWithProrationPrice.metadata
                additionalProperties =
                    newFloatingBulkWithProrationPrice.additionalProperties.toMutableMap()
            }

            fun bulkWithProrationConfig(bulkWithProrationConfig: BulkWithProrationConfig) = apply {
                this.bulkWithProrationConfig = bulkWithProrationConfig
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(bulkWithProrationConfig) {
                        "`bulkWithProrationConfig` is required but was not set"
                    },
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingBulkWithProrationPrice && bulkWithProrationConfig == other.bulkWithProrationConfig && cadence == other.cadence && currency == other.currency && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(bulkWithProrationConfig, cadence, currency, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingBulkWithProrationPrice{bulkWithProrationConfig=$bulkWithProrationConfig, cadence=$cadence, currency=$currency, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class NewFloatingGroupedTieredPackagePrice
    @JsonCreator
    private constructor(
        @JsonProperty("cadence") private val cadence: Cadence,
        @JsonProperty("currency") private val currency: String,
        @JsonProperty("grouped_tiered_package_config")
        private val groupedTieredPackageConfig: GroupedTieredPackageConfig,
        @JsonProperty("item_id") private val itemId: String,
        @JsonProperty("model_type") private val modelType: ModelType,
        @JsonProperty("name") private val name: String,
        @JsonProperty("billable_metric_id") private val billableMetricId: String?,
        @JsonProperty("billed_in_advance") private val billedInAdvance: Boolean?,
        @JsonProperty("billing_cycle_configuration")
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        @JsonProperty("conversion_rate") private val conversionRate: Double?,
        @JsonProperty("external_price_id") private val externalPriceId: String?,
        @JsonProperty("fixed_price_quantity") private val fixedPriceQuantity: Double?,
        @JsonProperty("invoice_grouping_key") private val invoiceGroupingKey: String?,
        @JsonProperty("invoicing_cycle_configuration")
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The cadence to bill for this price on. */
        @JsonProperty("cadence") fun cadence(): Cadence = cadence

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String = currency

        @JsonProperty("grouped_tiered_package_config")
        fun groupedTieredPackageConfig(): GroupedTieredPackageConfig = groupedTieredPackageConfig

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String = itemId

        @JsonProperty("model_type") fun modelType(): ModelType = modelType

        /** The name of the price. */
        @JsonProperty("name") fun name(): String = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * If the Price represents a fixed cost, the price will be billed in-advance if this is
         * true, and in-arrears if this is false.
         */
        @JsonProperty("billed_in_advance") fun billedInAdvance(): Boolean? = billedInAdvance

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonProperty("billing_cycle_configuration")
        fun billingCycleConfiguration(): BillingCycleConfiguration? = billingCycleConfiguration

        /** The per unit conversion rate of the price currency to the invoicing currency. */
        @JsonProperty("conversion_rate") fun conversionRate(): Double? = conversionRate

        /** An alias for the price. */
        @JsonProperty("external_price_id") fun externalPriceId(): String? = externalPriceId

        /** If the Price represents a fixed cost, this represents the quantity of units applied. */
        @JsonProperty("fixed_price_quantity") fun fixedPriceQuantity(): Double? = fixedPriceQuantity

        /** The property used to group this price on an invoice */
        @JsonProperty("invoice_grouping_key") fun invoiceGroupingKey(): String? = invoiceGroupingKey

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonProperty("invoicing_cycle_configuration")
        fun invoicingCycleConfiguration(): InvoicingCycleConfiguration? =
            invoicingCycleConfiguration

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonProperty("metadata") fun metadata(): Metadata? = metadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var cadence: Cadence? = null
            private var currency: String? = null
            private var groupedTieredPackageConfig: GroupedTieredPackageConfig? = null
            private var itemId: String? = null
            private var modelType: ModelType? = null
            private var name: String? = null
            private var billableMetricId: String? = null
            private var billedInAdvance: Boolean? = null
            private var billingCycleConfiguration: BillingCycleConfiguration? = null
            private var conversionRate: Double? = null
            private var externalPriceId: String? = null
            private var fixedPriceQuantity: Double? = null
            private var invoiceGroupingKey: String? = null
            private var invoicingCycleConfiguration: InvoicingCycleConfiguration? = null
            private var metadata: Metadata? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                newFloatingGroupedTieredPackagePrice: NewFloatingGroupedTieredPackagePrice
            ) = apply {
                cadence = newFloatingGroupedTieredPackagePrice.cadence
                currency = newFloatingGroupedTieredPackagePrice.currency
                groupedTieredPackageConfig =
                    newFloatingGroupedTieredPackagePrice.groupedTieredPackageConfig
                itemId = newFloatingGroupedTieredPackagePrice.itemId
                modelType = newFloatingGroupedTieredPackagePrice.modelType
                name = newFloatingGroupedTieredPackagePrice.name
                billableMetricId = newFloatingGroupedTieredPackagePrice.billableMetricId
                billedInAdvance = newFloatingGroupedTieredPackagePrice.billedInAdvance
                billingCycleConfiguration =
                    newFloatingGroupedTieredPackagePrice.billingCycleConfiguration
                conversionRate = newFloatingGroupedTieredPackagePrice.conversionRate
                externalPriceId = newFloatingGroupedTieredPackagePrice.externalPriceId
                fixedPriceQuantity = newFloatingGroupedTieredPackagePrice.fixedPriceQuantity
                invoiceGroupingKey = newFloatingGroupedTieredPackagePrice.invoiceGroupingKey
                invoicingCycleConfiguration =
                    newFloatingGroupedTieredPackagePrice.invoicingCycleConfiguration
                metadata = newFloatingGroupedTieredPackagePrice.metadata
                additionalProperties =
                    newFloatingGroupedTieredPackagePrice.additionalProperties.toMutableMap()
            }

            /** The cadence to bill for this price on. */
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /** An ISO 4217 currency string for which this price is billed in. */
            fun currency(currency: String) = apply { this.currency = currency }

            fun groupedTieredPackageConfig(groupedTieredPackageConfig: GroupedTieredPackageConfig) =
                apply {
                    this.groupedTieredPackageConfig = groupedTieredPackageConfig
                }

            /** The id of the item the plan will be associated with. */
            fun itemId(itemId: String) = apply { this.itemId = itemId }

            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            /** The name of the price. */
            fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            fun billableMetricId(billableMetricId: String?) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean?) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            fun billedInAdvance(billedInAdvance: Boolean) =
                billedInAdvance(billedInAdvance as Boolean?)

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration?) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double?) = apply {
                this.conversionRate = conversionRate
            }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            fun conversionRate(conversionRate: Double) = conversionRate(conversionRate as Double?)

            /** An alias for the price. */
            fun externalPriceId(externalPriceId: String?) = apply {
                this.externalPriceId = externalPriceId
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double?) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            fun fixedPriceQuantity(fixedPriceQuantity: Double) =
                fixedPriceQuantity(fixedPriceQuantity as Double?)

            /** The property used to group this price on an invoice */
            fun invoiceGroupingKey(invoiceGroupingKey: String?) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration?
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            fun metadata(metadata: Metadata?) = apply { this.metadata = metadata }

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
                    checkNotNull(cadence) { "`cadence` is required but was not set" },
                    checkNotNull(currency) { "`currency` is required but was not set" },
                    checkNotNull(groupedTieredPackageConfig) {
                        "`groupedTieredPackageConfig` is required but was not set"
                    },
                    checkNotNull(itemId) { "`itemId` is required but was not set" },
                    checkNotNull(modelType) { "`modelType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    billableMetricId,
                    billedInAdvance,
                    billingCycleConfiguration,
                    conversionRate,
                    externalPriceId,
                    fixedPriceQuantity,
                    invoiceGroupingKey,
                    invoicingCycleConfiguration,
                    metadata,
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

            return /* spotless:off */ other is NewFloatingGroupedTieredPackagePrice && cadence == other.cadence && currency == other.currency && groupedTieredPackageConfig == other.groupedTieredPackageConfig && itemId == other.itemId && modelType == other.modelType && name == other.name && billableMetricId == other.billableMetricId && billedInAdvance == other.billedInAdvance && billingCycleConfiguration == other.billingCycleConfiguration && conversionRate == other.conversionRate && externalPriceId == other.externalPriceId && fixedPriceQuantity == other.fixedPriceQuantity && invoiceGroupingKey == other.invoiceGroupingKey && invoicingCycleConfiguration == other.invoicingCycleConfiguration && metadata == other.metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cadence, currency, groupedTieredPackageConfig, itemId, modelType, name, billableMetricId, billedInAdvance, billingCycleConfiguration, conversionRate, externalPriceId, fixedPriceQuantity, invoiceGroupingKey, invoicingCycleConfiguration, metadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NewFloatingGroupedTieredPackagePrice{cadence=$cadence, currency=$currency, groupedTieredPackageConfig=$groupedTieredPackageConfig, itemId=$itemId, modelType=$modelType, name=$name, billableMetricId=$billableMetricId, billedInAdvance=$billedInAdvance, billingCycleConfiguration=$billingCycleConfiguration, conversionRate=$conversionRate, externalPriceId=$externalPriceId, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, invoicingCycleConfiguration=$invoicingCycleConfiguration, metadata=$metadata, additionalProperties=$additionalProperties}"
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
