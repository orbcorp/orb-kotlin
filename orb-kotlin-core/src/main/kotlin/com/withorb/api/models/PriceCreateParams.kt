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
import com.withorb.api.core.toUnmodifiable
import com.withorb.api.errors.OrbInvalidDataException
import com.withorb.api.models.*
import java.util.Objects

class PriceCreateParams
constructor(
    private val newFloatingUnitPrice: NewFloatingUnitPrice?,
    private val newFloatingPackagePrice: NewFloatingPackagePrice?,
    private val newFloatingMatrixPrice: NewFloatingMatrixPrice?,
    private val newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice?,
    private val newFloatingTieredPrice: NewFloatingTieredPrice?,
    private val newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice?,
    private val newFloatingBpsPrice: NewFloatingBpsPrice?,
    private val newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice?,
    private val newFloatingBulkPrice: NewFloatingBulkPrice?,
    private val newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice?,
    private val newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice?,
    private val newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice?,
    private val newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice?,
    private val newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice?,
    private val newFloatingTieredPackageWithMinimumPrice: NewFloatingTieredPackageWithMinimumPrice?,
    private val newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice?,
    private val newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice?,
    private val newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice?,
    private val newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice?,
    private val newFloatingGroupedWithProratedMinimumPrice:
        NewFloatingGroupedWithProratedMinimumPrice?,
    private val newFloatingGroupedWithMeteredMinimumPrice:
        NewFloatingGroupedWithMeteredMinimumPrice?,
    private val newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice?,
    private val newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
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

    fun newFloatingGroupedWithProratedMinimumPrice(): NewFloatingGroupedWithProratedMinimumPrice? =
        newFloatingGroupedWithProratedMinimumPrice

    fun newFloatingGroupedWithMeteredMinimumPrice(): NewFloatingGroupedWithMeteredMinimumPrice? =
        newFloatingGroupedWithMeteredMinimumPrice

    fun newFloatingMatrixWithDisplayNamePrice(): NewFloatingMatrixWithDisplayNamePrice? =
        newFloatingMatrixWithDisplayNamePrice

    fun newFloatingBulkWithProrationPrice(): NewFloatingBulkWithProrationPrice? =
        newFloatingBulkWithProrationPrice

    internal fun getBody(): PriceCreateBody {
        return PriceCreateBody(
            newFloatingUnitPrice,
            newFloatingPackagePrice,
            newFloatingMatrixPrice,
            newFloatingMatrixWithAllocationPrice,
            newFloatingTieredPrice,
            newFloatingTieredBpsPrice,
            newFloatingBpsPrice,
            newFloatingBulkBpsPrice,
            newFloatingBulkPrice,
            newFloatingThresholdTotalAmountPrice,
            newFloatingTieredPackagePrice,
            newFloatingGroupedTieredPrice,
            newFloatingTieredWithMinimumPrice,
            newFloatingPackageWithAllocationPrice,
            newFloatingTieredPackageWithMinimumPrice,
            newFloatingUnitWithPercentPrice,
            newFloatingTieredWithProrationPrice,
            newFloatingUnitWithProrationPrice,
            newFloatingGroupedAllocationPrice,
            newFloatingGroupedWithProratedMinimumPrice,
            newFloatingGroupedWithMeteredMinimumPrice,
            newFloatingMatrixWithDisplayNamePrice,
            newFloatingBulkWithProrationPrice,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

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
                else -> visitor.unknown(_json)
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PriceCreateBody && this.newFloatingUnitPrice == other.newFloatingUnitPrice && this.newFloatingPackagePrice == other.newFloatingPackagePrice && this.newFloatingMatrixPrice == other.newFloatingMatrixPrice && this.newFloatingMatrixWithAllocationPrice == other.newFloatingMatrixWithAllocationPrice && this.newFloatingTieredPrice == other.newFloatingTieredPrice && this.newFloatingTieredBpsPrice == other.newFloatingTieredBpsPrice && this.newFloatingBpsPrice == other.newFloatingBpsPrice && this.newFloatingBulkBpsPrice == other.newFloatingBulkBpsPrice && this.newFloatingBulkPrice == other.newFloatingBulkPrice && this.newFloatingThresholdTotalAmountPrice == other.newFloatingThresholdTotalAmountPrice && this.newFloatingTieredPackagePrice == other.newFloatingTieredPackagePrice && this.newFloatingGroupedTieredPrice == other.newFloatingGroupedTieredPrice && this.newFloatingTieredWithMinimumPrice == other.newFloatingTieredWithMinimumPrice && this.newFloatingPackageWithAllocationPrice == other.newFloatingPackageWithAllocationPrice && this.newFloatingTieredPackageWithMinimumPrice == other.newFloatingTieredPackageWithMinimumPrice && this.newFloatingUnitWithPercentPrice == other.newFloatingUnitWithPercentPrice && this.newFloatingTieredWithProrationPrice == other.newFloatingTieredWithProrationPrice && this.newFloatingUnitWithProrationPrice == other.newFloatingUnitWithProrationPrice && this.newFloatingGroupedAllocationPrice == other.newFloatingGroupedAllocationPrice && this.newFloatingGroupedWithProratedMinimumPrice == other.newFloatingGroupedWithProratedMinimumPrice && this.newFloatingGroupedWithMeteredMinimumPrice == other.newFloatingGroupedWithMeteredMinimumPrice && this.newFloatingMatrixWithDisplayNamePrice == other.newFloatingMatrixWithDisplayNamePrice && this.newFloatingBulkWithProrationPrice == other.newFloatingBulkWithProrationPrice /* spotless:on */
        }

        override fun hashCode(): Int {
            return /* spotless:off */ Objects.hash(newFloatingUnitPrice, newFloatingPackagePrice, newFloatingMatrixPrice, newFloatingMatrixWithAllocationPrice, newFloatingTieredPrice, newFloatingTieredBpsPrice, newFloatingBpsPrice, newFloatingBulkBpsPrice, newFloatingBulkPrice, newFloatingThresholdTotalAmountPrice, newFloatingTieredPackagePrice, newFloatingGroupedTieredPrice, newFloatingTieredWithMinimumPrice, newFloatingPackageWithAllocationPrice, newFloatingTieredPackageWithMinimumPrice, newFloatingUnitWithPercentPrice, newFloatingTieredWithProrationPrice, newFloatingUnitWithProrationPrice, newFloatingGroupedAllocationPrice, newFloatingGroupedWithProratedMinimumPrice, newFloatingGroupedWithMeteredMinimumPrice, newFloatingMatrixWithDisplayNamePrice, newFloatingBulkWithProrationPrice) /* spotless:on */
        }

        override fun toString(): String {
            return when {
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
                _json != null -> "PriceCreateBody{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid PriceCreateBody")
            }
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
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid PriceCreateBody")
                }
            }
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PriceCreateParams && this.newFloatingUnitPrice == other.newFloatingUnitPrice && this.newFloatingPackagePrice == other.newFloatingPackagePrice && this.newFloatingMatrixPrice == other.newFloatingMatrixPrice && this.newFloatingMatrixWithAllocationPrice == other.newFloatingMatrixWithAllocationPrice && this.newFloatingTieredPrice == other.newFloatingTieredPrice && this.newFloatingTieredBpsPrice == other.newFloatingTieredBpsPrice && this.newFloatingBpsPrice == other.newFloatingBpsPrice && this.newFloatingBulkBpsPrice == other.newFloatingBulkBpsPrice && this.newFloatingBulkPrice == other.newFloatingBulkPrice && this.newFloatingThresholdTotalAmountPrice == other.newFloatingThresholdTotalAmountPrice && this.newFloatingTieredPackagePrice == other.newFloatingTieredPackagePrice && this.newFloatingGroupedTieredPrice == other.newFloatingGroupedTieredPrice && this.newFloatingTieredWithMinimumPrice == other.newFloatingTieredWithMinimumPrice && this.newFloatingPackageWithAllocationPrice == other.newFloatingPackageWithAllocationPrice && this.newFloatingTieredPackageWithMinimumPrice == other.newFloatingTieredPackageWithMinimumPrice && this.newFloatingUnitWithPercentPrice == other.newFloatingUnitWithPercentPrice && this.newFloatingTieredWithProrationPrice == other.newFloatingTieredWithProrationPrice && this.newFloatingUnitWithProrationPrice == other.newFloatingUnitWithProrationPrice && this.newFloatingGroupedAllocationPrice == other.newFloatingGroupedAllocationPrice && this.newFloatingGroupedWithProratedMinimumPrice == other.newFloatingGroupedWithProratedMinimumPrice && this.newFloatingGroupedWithMeteredMinimumPrice == other.newFloatingGroupedWithMeteredMinimumPrice && this.newFloatingMatrixWithDisplayNamePrice == other.newFloatingMatrixWithDisplayNamePrice && this.newFloatingBulkWithProrationPrice == other.newFloatingBulkWithProrationPrice && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(newFloatingUnitPrice, newFloatingPackagePrice, newFloatingMatrixPrice, newFloatingMatrixWithAllocationPrice, newFloatingTieredPrice, newFloatingTieredBpsPrice, newFloatingBpsPrice, newFloatingBulkBpsPrice, newFloatingBulkPrice, newFloatingThresholdTotalAmountPrice, newFloatingTieredPackagePrice, newFloatingGroupedTieredPrice, newFloatingTieredWithMinimumPrice, newFloatingPackageWithAllocationPrice, newFloatingTieredPackageWithMinimumPrice, newFloatingUnitWithPercentPrice, newFloatingTieredWithProrationPrice, newFloatingUnitWithProrationPrice, newFloatingGroupedAllocationPrice, newFloatingGroupedWithProratedMinimumPrice, newFloatingGroupedWithMeteredMinimumPrice, newFloatingMatrixWithDisplayNamePrice, newFloatingBulkWithProrationPrice, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "PriceCreateParams{newFloatingUnitPrice=$newFloatingUnitPrice, newFloatingPackagePrice=$newFloatingPackagePrice, newFloatingMatrixPrice=$newFloatingMatrixPrice, newFloatingMatrixWithAllocationPrice=$newFloatingMatrixWithAllocationPrice, newFloatingTieredPrice=$newFloatingTieredPrice, newFloatingTieredBpsPrice=$newFloatingTieredBpsPrice, newFloatingBpsPrice=$newFloatingBpsPrice, newFloatingBulkBpsPrice=$newFloatingBulkBpsPrice, newFloatingBulkPrice=$newFloatingBulkPrice, newFloatingThresholdTotalAmountPrice=$newFloatingThresholdTotalAmountPrice, newFloatingTieredPackagePrice=$newFloatingTieredPackagePrice, newFloatingGroupedTieredPrice=$newFloatingGroupedTieredPrice, newFloatingTieredWithMinimumPrice=$newFloatingTieredWithMinimumPrice, newFloatingPackageWithAllocationPrice=$newFloatingPackageWithAllocationPrice, newFloatingTieredPackageWithMinimumPrice=$newFloatingTieredPackageWithMinimumPrice, newFloatingUnitWithPercentPrice=$newFloatingUnitWithPercentPrice, newFloatingTieredWithProrationPrice=$newFloatingTieredWithProrationPrice, newFloatingUnitWithProrationPrice=$newFloatingUnitWithProrationPrice, newFloatingGroupedAllocationPrice=$newFloatingGroupedAllocationPrice, newFloatingGroupedWithProratedMinimumPrice=$newFloatingGroupedWithProratedMinimumPrice, newFloatingGroupedWithMeteredMinimumPrice=$newFloatingGroupedWithMeteredMinimumPrice, newFloatingMatrixWithDisplayNamePrice=$newFloatingMatrixWithDisplayNamePrice, newFloatingBulkWithProrationPrice=$newFloatingBulkWithProrationPrice, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var newFloatingUnitPrice: NewFloatingUnitPrice? = null
        private var newFloatingPackagePrice: NewFloatingPackagePrice? = null
        private var newFloatingMatrixPrice: NewFloatingMatrixPrice? = null
        private var newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice? =
            null
        private var newFloatingTieredPrice: NewFloatingTieredPrice? = null
        private var newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice? = null
        private var newFloatingBpsPrice: NewFloatingBpsPrice? = null
        private var newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice? = null
        private var newFloatingBulkPrice: NewFloatingBulkPrice? = null
        private var newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice? =
            null
        private var newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice? = null
        private var newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice? = null
        private var newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice? = null
        private var newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice? =
            null
        private var newFloatingTieredPackageWithMinimumPrice:
            NewFloatingTieredPackageWithMinimumPrice? =
            null
        private var newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice? = null
        private var newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice? = null
        private var newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice? = null
        private var newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice? = null
        private var newFloatingGroupedWithProratedMinimumPrice:
            NewFloatingGroupedWithProratedMinimumPrice? =
            null
        private var newFloatingGroupedWithMeteredMinimumPrice:
            NewFloatingGroupedWithMeteredMinimumPrice? =
            null
        private var newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice? =
            null
        private var newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(priceCreateParams: PriceCreateParams) = apply {
            this.newFloatingUnitPrice = priceCreateParams.newFloatingUnitPrice
            this.newFloatingPackagePrice = priceCreateParams.newFloatingPackagePrice
            this.newFloatingMatrixPrice = priceCreateParams.newFloatingMatrixPrice
            this.newFloatingMatrixWithAllocationPrice =
                priceCreateParams.newFloatingMatrixWithAllocationPrice
            this.newFloatingTieredPrice = priceCreateParams.newFloatingTieredPrice
            this.newFloatingTieredBpsPrice = priceCreateParams.newFloatingTieredBpsPrice
            this.newFloatingBpsPrice = priceCreateParams.newFloatingBpsPrice
            this.newFloatingBulkBpsPrice = priceCreateParams.newFloatingBulkBpsPrice
            this.newFloatingBulkPrice = priceCreateParams.newFloatingBulkPrice
            this.newFloatingThresholdTotalAmountPrice =
                priceCreateParams.newFloatingThresholdTotalAmountPrice
            this.newFloatingTieredPackagePrice = priceCreateParams.newFloatingTieredPackagePrice
            this.newFloatingGroupedTieredPrice = priceCreateParams.newFloatingGroupedTieredPrice
            this.newFloatingTieredWithMinimumPrice =
                priceCreateParams.newFloatingTieredWithMinimumPrice
            this.newFloatingPackageWithAllocationPrice =
                priceCreateParams.newFloatingPackageWithAllocationPrice
            this.newFloatingTieredPackageWithMinimumPrice =
                priceCreateParams.newFloatingTieredPackageWithMinimumPrice
            this.newFloatingUnitWithPercentPrice = priceCreateParams.newFloatingUnitWithPercentPrice
            this.newFloatingTieredWithProrationPrice =
                priceCreateParams.newFloatingTieredWithProrationPrice
            this.newFloatingUnitWithProrationPrice =
                priceCreateParams.newFloatingUnitWithProrationPrice
            this.newFloatingGroupedAllocationPrice =
                priceCreateParams.newFloatingGroupedAllocationPrice
            this.newFloatingGroupedWithProratedMinimumPrice =
                priceCreateParams.newFloatingGroupedWithProratedMinimumPrice
            this.newFloatingGroupedWithMeteredMinimumPrice =
                priceCreateParams.newFloatingGroupedWithMeteredMinimumPrice
            this.newFloatingMatrixWithDisplayNamePrice =
                priceCreateParams.newFloatingMatrixWithDisplayNamePrice
            this.newFloatingBulkWithProrationPrice =
                priceCreateParams.newFloatingBulkWithProrationPrice
            additionalQueryParams(priceCreateParams.additionalQueryParams)
            additionalHeaders(priceCreateParams.additionalHeaders)
        }

        fun forNewFloatingUnitPrice(newFloatingUnitPrice: NewFloatingUnitPrice) = apply {
            this.newFloatingUnitPrice = newFloatingUnitPrice
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingPackagePrice(newFloatingPackagePrice: NewFloatingPackagePrice) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = newFloatingPackagePrice
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingMatrixPrice(newFloatingMatrixPrice: NewFloatingMatrixPrice) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = newFloatingMatrixPrice
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingMatrixWithAllocationPrice(
            newFloatingMatrixWithAllocationPrice: NewFloatingMatrixWithAllocationPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = newFloatingMatrixWithAllocationPrice
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingTieredPrice(newFloatingTieredPrice: NewFloatingTieredPrice) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = newFloatingTieredPrice
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingTieredBpsPrice(newFloatingTieredBpsPrice: NewFloatingTieredBpsPrice) =
            apply {
                this.newFloatingUnitPrice = null
                this.newFloatingPackagePrice = null
                this.newFloatingMatrixPrice = null
                this.newFloatingMatrixWithAllocationPrice = null
                this.newFloatingTieredPrice = null
                this.newFloatingTieredBpsPrice = newFloatingTieredBpsPrice
                this.newFloatingBpsPrice = null
                this.newFloatingBulkBpsPrice = null
                this.newFloatingBulkPrice = null
                this.newFloatingThresholdTotalAmountPrice = null
                this.newFloatingTieredPackagePrice = null
                this.newFloatingGroupedTieredPrice = null
                this.newFloatingTieredWithMinimumPrice = null
                this.newFloatingPackageWithAllocationPrice = null
                this.newFloatingTieredPackageWithMinimumPrice = null
                this.newFloatingUnitWithPercentPrice = null
                this.newFloatingTieredWithProrationPrice = null
                this.newFloatingUnitWithProrationPrice = null
                this.newFloatingGroupedAllocationPrice = null
                this.newFloatingGroupedWithProratedMinimumPrice = null
                this.newFloatingGroupedWithMeteredMinimumPrice = null
                this.newFloatingMatrixWithDisplayNamePrice = null
                this.newFloatingBulkWithProrationPrice = null
            }

        fun forNewFloatingBpsPrice(newFloatingBpsPrice: NewFloatingBpsPrice) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = newFloatingBpsPrice
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingBulkBpsPrice(newFloatingBulkBpsPrice: NewFloatingBulkBpsPrice) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = newFloatingBulkBpsPrice
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingBulkPrice(newFloatingBulkPrice: NewFloatingBulkPrice) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = newFloatingBulkPrice
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingThresholdTotalAmountPrice(
            newFloatingThresholdTotalAmountPrice: NewFloatingThresholdTotalAmountPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = newFloatingThresholdTotalAmountPrice
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingTieredPackagePrice(
            newFloatingTieredPackagePrice: NewFloatingTieredPackagePrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = newFloatingTieredPackagePrice
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingGroupedTieredPrice(
            newFloatingGroupedTieredPrice: NewFloatingGroupedTieredPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = newFloatingGroupedTieredPrice
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingTieredWithMinimumPrice(
            newFloatingTieredWithMinimumPrice: NewFloatingTieredWithMinimumPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = newFloatingTieredWithMinimumPrice
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingPackageWithAllocationPrice(
            newFloatingPackageWithAllocationPrice: NewFloatingPackageWithAllocationPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = newFloatingPackageWithAllocationPrice
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingTieredPackageWithMinimumPrice(
            newFloatingTieredPackageWithMinimumPrice: NewFloatingTieredPackageWithMinimumPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = newFloatingTieredPackageWithMinimumPrice
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingUnitWithPercentPrice(
            newFloatingUnitWithPercentPrice: NewFloatingUnitWithPercentPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = newFloatingUnitWithPercentPrice
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingTieredWithProrationPrice(
            newFloatingTieredWithProrationPrice: NewFloatingTieredWithProrationPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = newFloatingTieredWithProrationPrice
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingUnitWithProrationPrice(
            newFloatingUnitWithProrationPrice: NewFloatingUnitWithProrationPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = newFloatingUnitWithProrationPrice
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingGroupedAllocationPrice(
            newFloatingGroupedAllocationPrice: NewFloatingGroupedAllocationPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = newFloatingGroupedAllocationPrice
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingGroupedWithProratedMinimumPrice(
            newFloatingGroupedWithProratedMinimumPrice: NewFloatingGroupedWithProratedMinimumPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice =
                newFloatingGroupedWithProratedMinimumPrice
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingGroupedWithMeteredMinimumPrice(
            newFloatingGroupedWithMeteredMinimumPrice: NewFloatingGroupedWithMeteredMinimumPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice =
                newFloatingGroupedWithMeteredMinimumPrice
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingMatrixWithDisplayNamePrice(
            newFloatingMatrixWithDisplayNamePrice: NewFloatingMatrixWithDisplayNamePrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = newFloatingMatrixWithDisplayNamePrice
            this.newFloatingBulkWithProrationPrice = null
        }

        fun forNewFloatingBulkWithProrationPrice(
            newFloatingBulkWithProrationPrice: NewFloatingBulkWithProrationPrice
        ) = apply {
            this.newFloatingUnitPrice = null
            this.newFloatingPackagePrice = null
            this.newFloatingMatrixPrice = null
            this.newFloatingMatrixWithAllocationPrice = null
            this.newFloatingTieredPrice = null
            this.newFloatingTieredBpsPrice = null
            this.newFloatingBpsPrice = null
            this.newFloatingBulkBpsPrice = null
            this.newFloatingBulkPrice = null
            this.newFloatingThresholdTotalAmountPrice = null
            this.newFloatingTieredPackagePrice = null
            this.newFloatingGroupedTieredPrice = null
            this.newFloatingTieredWithMinimumPrice = null
            this.newFloatingPackageWithAllocationPrice = null
            this.newFloatingTieredPackageWithMinimumPrice = null
            this.newFloatingUnitWithPercentPrice = null
            this.newFloatingTieredWithProrationPrice = null
            this.newFloatingUnitWithProrationPrice = null
            this.newFloatingGroupedAllocationPrice = null
            this.newFloatingGroupedWithProratedMinimumPrice = null
            this.newFloatingGroupedWithMeteredMinimumPrice = null
            this.newFloatingMatrixWithDisplayNamePrice = null
            this.newFloatingBulkWithProrationPrice = newFloatingBulkWithProrationPrice
        }

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

        fun build(): PriceCreateParams =
            PriceCreateParams(
                newFloatingUnitPrice,
                newFloatingPackagePrice,
                newFloatingMatrixPrice,
                newFloatingMatrixWithAllocationPrice,
                newFloatingTieredPrice,
                newFloatingTieredBpsPrice,
                newFloatingBpsPrice,
                newFloatingBulkBpsPrice,
                newFloatingBulkPrice,
                newFloatingThresholdTotalAmountPrice,
                newFloatingTieredPackagePrice,
                newFloatingGroupedTieredPrice,
                newFloatingTieredWithMinimumPrice,
                newFloatingPackageWithAllocationPrice,
                newFloatingTieredPackageWithMinimumPrice,
                newFloatingUnitWithPercentPrice,
                newFloatingTieredWithProrationPrice,
                newFloatingUnitWithProrationPrice,
                newFloatingGroupedAllocationPrice,
                newFloatingGroupedWithProratedMinimumPrice,
                newFloatingGroupedWithMeteredMinimumPrice,
                newFloatingMatrixWithDisplayNamePrice,
                newFloatingBulkWithProrationPrice,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = NewFloatingUnitPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingUnitPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val unitConfig: UnitConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("unit_config") fun unitConfig(): UnitConfig? = unitConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingUnitPrice.metadata
                this.externalPriceId = newFloatingUnitPrice.externalPriceId
                this.name = newFloatingUnitPrice.name
                this.billableMetricId = newFloatingUnitPrice.billableMetricId
                this.itemId = newFloatingUnitPrice.itemId
                this.billedInAdvance = newFloatingUnitPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingUnitPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingUnitPrice.invoiceGroupingKey
                this.cadence = newFloatingUnitPrice.cadence
                this.billingCycleConfiguration = newFloatingUnitPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration = newFloatingUnitPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingUnitPrice.conversionRate
                this.modelType = newFloatingUnitPrice.modelType
                this.unitConfig = newFloatingUnitPrice.unitConfig
                this.currency = newFloatingUnitPrice.currency
                additionalProperties(newFloatingUnitPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("unit_config")
            fun unitConfig(unitConfig: UnitConfig) = apply { this.unitConfig = unitConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val UNIT = ModelType(JsonField.of("unit"))

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
        }

        @JsonDeserialize(builder = UnitConfig.Builder::class)
        @NoAutoDetect
        class UnitConfig
        private constructor(
            private val unitAmount: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Rate per unit of usage */
            @JsonProperty("unit_amount") fun unitAmount(): String? = unitAmount

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
                    this.unitAmount = unitConfig.unitAmount
                    additionalProperties(unitConfig.additionalProperties)
                }

                /** Rate per unit of usage */
                @JsonProperty("unit_amount")
                fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnitConfig =
                    UnitConfig(
                        checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                        additionalProperties.toUnmodifiable()
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitConfig && this.unitAmount == other.unitAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(unitAmount, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "UnitConfig{unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingUnitPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.unitConfig == other.unitConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, unitConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingUnitPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, unitConfig=$unitConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingPackagePrice.Builder::class)
    @NoAutoDetect
    class NewFloatingPackagePrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val packageConfig: PackageConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("package_config") fun packageConfig(): PackageConfig? = packageConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingPackagePrice.metadata
                this.externalPriceId = newFloatingPackagePrice.externalPriceId
                this.name = newFloatingPackagePrice.name
                this.billableMetricId = newFloatingPackagePrice.billableMetricId
                this.itemId = newFloatingPackagePrice.itemId
                this.billedInAdvance = newFloatingPackagePrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingPackagePrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingPackagePrice.invoiceGroupingKey
                this.cadence = newFloatingPackagePrice.cadence
                this.billingCycleConfiguration = newFloatingPackagePrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingPackagePrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingPackagePrice.conversionRate
                this.modelType = newFloatingPackagePrice.modelType
                this.packageConfig = newFloatingPackagePrice.packageConfig
                this.currency = newFloatingPackagePrice.currency
                additionalProperties(newFloatingPackagePrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("package_config")
            fun packageConfig(packageConfig: PackageConfig) = apply {
                this.packageConfig = packageConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PACKAGE = ModelType(JsonField.of("package"))

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
        }

        @JsonDeserialize(builder = PackageConfig.Builder::class)
        @NoAutoDetect
        class PackageConfig
        private constructor(
            private val packageAmount: String?,
            private val packageSize: Long?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** A currency amount to rate usage by */
            @JsonProperty("package_amount") fun packageAmount(): String? = packageAmount

            /**
             * An integer amount to represent package size. For example, 1000 here would divide
             * usage by 1000 before multiplying by package_amount in rating
             */
            @JsonProperty("package_size") fun packageSize(): Long? = packageSize

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
                    this.packageAmount = packageConfig.packageAmount
                    this.packageSize = packageConfig.packageSize
                    additionalProperties(packageConfig.additionalProperties)
                }

                /** A currency amount to rate usage by */
                @JsonProperty("package_amount")
                fun packageAmount(packageAmount: String) = apply {
                    this.packageAmount = packageAmount
                }

                /**
                 * An integer amount to represent package size. For example, 1000 here would divide
                 * usage by 1000 before multiplying by package_amount in rating
                 */
                @JsonProperty("package_size")
                fun packageSize(packageSize: Long) = apply { this.packageSize = packageSize }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PackageConfig =
                    PackageConfig(
                        checkNotNull(packageAmount) {
                            "`packageAmount` is required but was not set"
                        },
                        checkNotNull(packageSize) { "`packageSize` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PackageConfig && this.packageAmount == other.packageAmount && this.packageSize == other.packageSize && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(packageAmount, packageSize, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PackageConfig{packageAmount=$packageAmount, packageSize=$packageSize, additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingPackagePrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.packageConfig == other.packageConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, packageConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingPackagePrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, packageConfig=$packageConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingMatrixPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingMatrixPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val matrixConfig: MatrixConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("matrix_config") fun matrixConfig(): MatrixConfig? = matrixConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingMatrixPrice.metadata
                this.externalPriceId = newFloatingMatrixPrice.externalPriceId
                this.name = newFloatingMatrixPrice.name
                this.billableMetricId = newFloatingMatrixPrice.billableMetricId
                this.itemId = newFloatingMatrixPrice.itemId
                this.billedInAdvance = newFloatingMatrixPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingMatrixPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingMatrixPrice.invoiceGroupingKey
                this.cadence = newFloatingMatrixPrice.cadence
                this.billingCycleConfiguration = newFloatingMatrixPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingMatrixPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingMatrixPrice.conversionRate
                this.modelType = newFloatingMatrixPrice.modelType
                this.matrixConfig = newFloatingMatrixPrice.matrixConfig
                this.currency = newFloatingMatrixPrice.currency
                additionalProperties(newFloatingMatrixPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("matrix_config")
            fun matrixConfig(matrixConfig: MatrixConfig) = apply {
                this.matrixConfig = matrixConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        @JsonDeserialize(builder = MatrixConfig.Builder::class)
        @NoAutoDetect
        class MatrixConfig
        private constructor(
            private val dimensions: List<String?>?,
            private val defaultUnitAmount: String?,
            private val matrixValues: List<MatrixValue>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** One or two event property values to evaluate matrix groups by */
            @JsonProperty("dimensions") fun dimensions(): List<String?>? = dimensions

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            @JsonProperty("default_unit_amount")
            fun defaultUnitAmount(): String? = defaultUnitAmount

            /** Matrix values for specified matrix grouping keys */
            @JsonProperty("matrix_values") fun matrixValues(): List<MatrixValue>? = matrixValues

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var dimensions: List<String?>? = null
                private var defaultUnitAmount: String? = null
                private var matrixValues: List<MatrixValue>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixConfig: MatrixConfig) = apply {
                    this.dimensions = matrixConfig.dimensions
                    this.defaultUnitAmount = matrixConfig.defaultUnitAmount
                    this.matrixValues = matrixConfig.matrixValues
                    additionalProperties(matrixConfig.additionalProperties)
                }

                /** One or two event property values to evaluate matrix groups by */
                @JsonProperty("dimensions")
                fun dimensions(dimensions: List<String?>) = apply { this.dimensions = dimensions }

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                @JsonProperty("default_unit_amount")
                fun defaultUnitAmount(defaultUnitAmount: String) = apply {
                    this.defaultUnitAmount = defaultUnitAmount
                }

                /** Matrix values for specified matrix grouping keys */
                @JsonProperty("matrix_values")
                fun matrixValues(matrixValues: List<MatrixValue>) = apply {
                    this.matrixValues = matrixValues
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): MatrixConfig =
                    MatrixConfig(
                        checkNotNull(dimensions) { "`dimensions` is required but was not set" }
                            .toUnmodifiable(),
                        checkNotNull(defaultUnitAmount) {
                            "`defaultUnitAmount` is required but was not set"
                        },
                        checkNotNull(matrixValues) { "`matrixValues` is required but was not set" }
                            .toUnmodifiable(),
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = MatrixValue.Builder::class)
            @NoAutoDetect
            class MatrixValue
            private constructor(
                private val unitAmount: String?,
                private val dimensionValues: List<String?>?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** Unit price for the specified dimension_values */
                @JsonProperty("unit_amount") fun unitAmount(): String? = unitAmount

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                @JsonProperty("dimension_values")
                fun dimensionValues(): List<String?>? = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: String? = null
                    private var dimensionValues: List<String?>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixValue: MatrixValue) = apply {
                        this.unitAmount = matrixValue.unitAmount
                        this.dimensionValues = matrixValue.dimensionValues
                        additionalProperties(matrixValue.additionalProperties)
                    }

                    /** Unit price for the specified dimension_values */
                    @JsonProperty("unit_amount")
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    @JsonProperty("dimension_values")
                    fun dimensionValues(dimensionValues: List<String?>) = apply {
                        this.dimensionValues = dimensionValues
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): MatrixValue =
                        MatrixValue(
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            checkNotNull(dimensionValues) {
                                    "`dimensionValues` is required but was not set"
                                }
                                .toUnmodifiable(),
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixValue && this.unitAmount == other.unitAmount && this.dimensionValues == other.dimensionValues && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(unitAmount, dimensionValues, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixConfig && this.dimensions == other.dimensions && this.defaultUnitAmount == other.defaultUnitAmount && this.matrixValues == other.matrixValues && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(dimensions, defaultUnitAmount, matrixValues, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "MatrixConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val MATRIX = ModelType(JsonField.of("matrix"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingMatrixPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.matrixConfig == other.matrixConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, matrixConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingMatrixPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, matrixConfig=$matrixConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingMatrixWithAllocationPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingMatrixWithAllocationPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val matrixWithAllocationConfig: MatrixWithAllocationConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("matrix_with_allocation_config")
        fun matrixWithAllocationConfig(): MatrixWithAllocationConfig? = matrixWithAllocationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingMatrixWithAllocationPrice.metadata
                this.externalPriceId = newFloatingMatrixWithAllocationPrice.externalPriceId
                this.name = newFloatingMatrixWithAllocationPrice.name
                this.billableMetricId = newFloatingMatrixWithAllocationPrice.billableMetricId
                this.itemId = newFloatingMatrixWithAllocationPrice.itemId
                this.billedInAdvance = newFloatingMatrixWithAllocationPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingMatrixWithAllocationPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingMatrixWithAllocationPrice.invoiceGroupingKey
                this.cadence = newFloatingMatrixWithAllocationPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingMatrixWithAllocationPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingMatrixWithAllocationPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingMatrixWithAllocationPrice.conversionRate
                this.modelType = newFloatingMatrixWithAllocationPrice.modelType
                this.matrixWithAllocationConfig =
                    newFloatingMatrixWithAllocationPrice.matrixWithAllocationConfig
                this.currency = newFloatingMatrixWithAllocationPrice.currency
                additionalProperties(newFloatingMatrixWithAllocationPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("matrix_with_allocation_config")
            fun matrixWithAllocationConfig(matrixWithAllocationConfig: MatrixWithAllocationConfig) =
                apply {
                    this.matrixWithAllocationConfig = matrixWithAllocationConfig
                }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        @JsonDeserialize(builder = MatrixWithAllocationConfig.Builder::class)
        @NoAutoDetect
        class MatrixWithAllocationConfig
        private constructor(
            private val dimensions: List<String?>?,
            private val defaultUnitAmount: String?,
            private val matrixValues: List<MatrixValue>?,
            private val allocation: Double?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** One or two event property values to evaluate matrix groups by */
            @JsonProperty("dimensions") fun dimensions(): List<String?>? = dimensions

            /** Default per unit rate for any usage not bucketed into a specified matrix_value */
            @JsonProperty("default_unit_amount")
            fun defaultUnitAmount(): String? = defaultUnitAmount

            /** Matrix values for specified matrix grouping keys */
            @JsonProperty("matrix_values") fun matrixValues(): List<MatrixValue>? = matrixValues

            /** Allocation to be used to calculate the price */
            @JsonProperty("allocation") fun allocation(): Double? = allocation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var dimensions: List<String?>? = null
                private var defaultUnitAmount: String? = null
                private var matrixValues: List<MatrixValue>? = null
                private var allocation: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(matrixWithAllocationConfig: MatrixWithAllocationConfig) = apply {
                    this.dimensions = matrixWithAllocationConfig.dimensions
                    this.defaultUnitAmount = matrixWithAllocationConfig.defaultUnitAmount
                    this.matrixValues = matrixWithAllocationConfig.matrixValues
                    this.allocation = matrixWithAllocationConfig.allocation
                    additionalProperties(matrixWithAllocationConfig.additionalProperties)
                }

                /** One or two event property values to evaluate matrix groups by */
                @JsonProperty("dimensions")
                fun dimensions(dimensions: List<String?>) = apply { this.dimensions = dimensions }

                /**
                 * Default per unit rate for any usage not bucketed into a specified matrix_value
                 */
                @JsonProperty("default_unit_amount")
                fun defaultUnitAmount(defaultUnitAmount: String) = apply {
                    this.defaultUnitAmount = defaultUnitAmount
                }

                /** Matrix values for specified matrix grouping keys */
                @JsonProperty("matrix_values")
                fun matrixValues(matrixValues: List<MatrixValue>) = apply {
                    this.matrixValues = matrixValues
                }

                /** Allocation to be used to calculate the price */
                @JsonProperty("allocation")
                fun allocation(allocation: Double) = apply { this.allocation = allocation }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): MatrixWithAllocationConfig =
                    MatrixWithAllocationConfig(
                        checkNotNull(dimensions) { "`dimensions` is required but was not set" }
                            .toUnmodifiable(),
                        checkNotNull(defaultUnitAmount) {
                            "`defaultUnitAmount` is required but was not set"
                        },
                        checkNotNull(matrixValues) { "`matrixValues` is required but was not set" }
                            .toUnmodifiable(),
                        checkNotNull(allocation) { "`allocation` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = MatrixValue.Builder::class)
            @NoAutoDetect
            class MatrixValue
            private constructor(
                private val unitAmount: String?,
                private val dimensionValues: List<String?>?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** Unit price for the specified dimension_values */
                @JsonProperty("unit_amount") fun unitAmount(): String? = unitAmount

                /**
                 * One or two matrix keys to filter usage to this Matrix value by. For example,
                 * ["region", "tier"] could be used to filter cloud usage by a cloud region and an
                 * instance tier.
                 */
                @JsonProperty("dimension_values")
                fun dimensionValues(): List<String?>? = dimensionValues

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var unitAmount: String? = null
                    private var dimensionValues: List<String?>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(matrixValue: MatrixValue) = apply {
                        this.unitAmount = matrixValue.unitAmount
                        this.dimensionValues = matrixValue.dimensionValues
                        additionalProperties(matrixValue.additionalProperties)
                    }

                    /** Unit price for the specified dimension_values */
                    @JsonProperty("unit_amount")
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                    /**
                     * One or two matrix keys to filter usage to this Matrix value by. For example,
                     * ["region", "tier"] could be used to filter cloud usage by a cloud region and
                     * an instance tier.
                     */
                    @JsonProperty("dimension_values")
                    fun dimensionValues(dimensionValues: List<String?>) = apply {
                        this.dimensionValues = dimensionValues
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): MatrixValue =
                        MatrixValue(
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            checkNotNull(dimensionValues) {
                                    "`dimensionValues` is required but was not set"
                                }
                                .toUnmodifiable(),
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MatrixValue && this.unitAmount == other.unitAmount && this.dimensionValues == other.dimensionValues && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(unitAmount, dimensionValues, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "MatrixValue{unitAmount=$unitAmount, dimensionValues=$dimensionValues, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixWithAllocationConfig && this.dimensions == other.dimensions && this.defaultUnitAmount == other.defaultUnitAmount && this.matrixValues == other.matrixValues && this.allocation == other.allocation && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(dimensions, defaultUnitAmount, matrixValues, allocation, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "MatrixWithAllocationConfig{dimensions=$dimensions, defaultUnitAmount=$defaultUnitAmount, matrixValues=$matrixValues, allocation=$allocation, additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val MATRIX_WITH_ALLOCATION = ModelType(JsonField.of("matrix_with_allocation"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingMatrixWithAllocationPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.matrixWithAllocationConfig == other.matrixWithAllocationConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, matrixWithAllocationConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingMatrixWithAllocationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, matrixWithAllocationConfig=$matrixWithAllocationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingTieredPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingTieredPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val tieredConfig: TieredConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("tiered_config") fun tieredConfig(): TieredConfig? = tieredConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingTieredPrice.metadata
                this.externalPriceId = newFloatingTieredPrice.externalPriceId
                this.name = newFloatingTieredPrice.name
                this.billableMetricId = newFloatingTieredPrice.billableMetricId
                this.itemId = newFloatingTieredPrice.itemId
                this.billedInAdvance = newFloatingTieredPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingTieredPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingTieredPrice.invoiceGroupingKey
                this.cadence = newFloatingTieredPrice.cadence
                this.billingCycleConfiguration = newFloatingTieredPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingTieredPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingTieredPrice.conversionRate
                this.modelType = newFloatingTieredPrice.modelType
                this.tieredConfig = newFloatingTieredPrice.tieredConfig
                this.currency = newFloatingTieredPrice.currency
                additionalProperties(newFloatingTieredPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("tiered_config")
            fun tieredConfig(tieredConfig: TieredConfig) = apply {
                this.tieredConfig = tieredConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED = ModelType(JsonField.of("tiered"))

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
        }

        @JsonDeserialize(builder = TieredConfig.Builder::class)
        @NoAutoDetect
        class TieredConfig
        private constructor(
            private val tiers: List<Tier>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Tiers for rating based on total usage quantities into the specified tier */
            @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: List<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredConfig: TieredConfig) = apply {
                    this.tiers = tieredConfig.tiers
                    additionalProperties(tieredConfig.additionalProperties)
                }

                /** Tiers for rating based on total usage quantities into the specified tier */
                @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredConfig =
                    TieredConfig(
                        checkNotNull(tiers) { "`tiers` is required but was not set" }
                            .toUnmodifiable(),
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val firstUnit: Double?,
                private val lastUnit: Double?,
                private val unitAmount: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** Inclusive tier starting value */
                @JsonProperty("first_unit") fun firstUnit(): Double? = firstUnit

                /** Exclusive tier ending value. If null, this is treated as the last tier */
                @JsonProperty("last_unit") fun lastUnit(): Double? = lastUnit

                /** Amount per unit */
                @JsonProperty("unit_amount") fun unitAmount(): String? = unitAmount

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
                        this.firstUnit = tier.firstUnit
                        this.lastUnit = tier.lastUnit
                        this.unitAmount = tier.unitAmount
                        additionalProperties(tier.additionalProperties)
                    }

                    /** Inclusive tier starting value */
                    @JsonProperty("first_unit")
                    fun firstUnit(firstUnit: Double) = apply { this.firstUnit = firstUnit }

                    /** Exclusive tier ending value. If null, this is treated as the last tier */
                    @JsonProperty("last_unit")
                    fun lastUnit(lastUnit: Double) = apply { this.lastUnit = lastUnit }

                    /** Amount per unit */
                    @JsonProperty("unit_amount")
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            checkNotNull(firstUnit) { "`firstUnit` is required but was not set" },
                            lastUnit,
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && this.firstUnit == other.firstUnit && this.lastUnit == other.lastUnit && this.unitAmount == other.unitAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(firstUnit, lastUnit, unitAmount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{firstUnit=$firstUnit, lastUnit=$lastUnit, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredConfig && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(tiers, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TieredConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.tieredConfig == other.tieredConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingTieredPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredConfig=$tieredConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingTieredBpsPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingTieredBpsPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val tieredBpsConfig: TieredBpsConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("tiered_bps_config") fun tieredBpsConfig(): TieredBpsConfig? = tieredBpsConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingTieredBpsPrice.metadata
                this.externalPriceId = newFloatingTieredBpsPrice.externalPriceId
                this.name = newFloatingTieredBpsPrice.name
                this.billableMetricId = newFloatingTieredBpsPrice.billableMetricId
                this.itemId = newFloatingTieredBpsPrice.itemId
                this.billedInAdvance = newFloatingTieredBpsPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingTieredBpsPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingTieredBpsPrice.invoiceGroupingKey
                this.cadence = newFloatingTieredBpsPrice.cadence
                this.billingCycleConfiguration = newFloatingTieredBpsPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingTieredBpsPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingTieredBpsPrice.conversionRate
                this.modelType = newFloatingTieredBpsPrice.modelType
                this.tieredBpsConfig = newFloatingTieredBpsPrice.tieredBpsConfig
                this.currency = newFloatingTieredBpsPrice.currency
                additionalProperties(newFloatingTieredBpsPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("tiered_bps_config")
            fun tieredBpsConfig(tieredBpsConfig: TieredBpsConfig) = apply {
                this.tieredBpsConfig = tieredBpsConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_BPS = ModelType(JsonField.of("tiered_bps"))

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
        }

        @JsonDeserialize(builder = TieredBpsConfig.Builder::class)
        @NoAutoDetect
        class TieredBpsConfig
        private constructor(
            private val tiers: List<Tier>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified tiers
             */
            @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: List<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(tieredBpsConfig: TieredBpsConfig) = apply {
                    this.tiers = tieredBpsConfig.tiers
                    additionalProperties(tieredBpsConfig.additionalProperties)
                }

                /**
                 * Tiers for a Graduated BPS pricing model, where usage is bucketed into specified
                 * tiers
                 */
                @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredBpsConfig =
                    TieredBpsConfig(
                        checkNotNull(tiers) { "`tiers` is required but was not set" }
                            .toUnmodifiable(),
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val minimumAmount: String?,
                private val maximumAmount: String?,
                private val bps: Double?,
                private val perUnitMaximum: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** Inclusive tier starting value */
                @JsonProperty("minimum_amount") fun minimumAmount(): String? = minimumAmount

                /** Exclusive tier ending value */
                @JsonProperty("maximum_amount") fun maximumAmount(): String? = maximumAmount

                /** Per-event basis point rate */
                @JsonProperty("bps") fun bps(): Double? = bps

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
                        this.minimumAmount = tier.minimumAmount
                        this.maximumAmount = tier.maximumAmount
                        this.bps = tier.bps
                        this.perUnitMaximum = tier.perUnitMaximum
                        additionalProperties(tier.additionalProperties)
                    }

                    /** Inclusive tier starting value */
                    @JsonProperty("minimum_amount")
                    fun minimumAmount(minimumAmount: String) = apply {
                        this.minimumAmount = minimumAmount
                    }

                    /** Exclusive tier ending value */
                    @JsonProperty("maximum_amount")
                    fun maximumAmount(maximumAmount: String) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** Per-event basis point rate */
                    @JsonProperty("bps") fun bps(bps: Double) = apply { this.bps = bps }

                    /** Per unit maximum to charge */
                    @JsonProperty("per_unit_maximum")
                    fun perUnitMaximum(perUnitMaximum: String) = apply {
                        this.perUnitMaximum = perUnitMaximum
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            checkNotNull(minimumAmount) {
                                "`minimumAmount` is required but was not set"
                            },
                            maximumAmount,
                            checkNotNull(bps) { "`bps` is required but was not set" },
                            perUnitMaximum,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && this.minimumAmount == other.minimumAmount && this.maximumAmount == other.maximumAmount && this.bps == other.bps && this.perUnitMaximum == other.perUnitMaximum && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(minimumAmount, maximumAmount, bps, perUnitMaximum, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{minimumAmount=$minimumAmount, maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredBpsConfig && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(tiers, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TieredBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredBpsPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.tieredBpsConfig == other.tieredBpsConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredBpsConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingTieredBpsPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredBpsConfig=$tieredBpsConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingBpsPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingBpsPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val bpsConfig: BpsConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("bps_config") fun bpsConfig(): BpsConfig? = bpsConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingBpsPrice.metadata
                this.externalPriceId = newFloatingBpsPrice.externalPriceId
                this.name = newFloatingBpsPrice.name
                this.billableMetricId = newFloatingBpsPrice.billableMetricId
                this.itemId = newFloatingBpsPrice.itemId
                this.billedInAdvance = newFloatingBpsPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingBpsPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingBpsPrice.invoiceGroupingKey
                this.cadence = newFloatingBpsPrice.cadence
                this.billingCycleConfiguration = newFloatingBpsPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration = newFloatingBpsPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingBpsPrice.conversionRate
                this.modelType = newFloatingBpsPrice.modelType
                this.bpsConfig = newFloatingBpsPrice.bpsConfig
                this.currency = newFloatingBpsPrice.currency
                additionalProperties(newFloatingBpsPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("bps_config")
            fun bpsConfig(bpsConfig: BpsConfig) = apply { this.bpsConfig = bpsConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BpsConfig.Builder::class)
        @NoAutoDetect
        class BpsConfig
        private constructor(
            private val bps: Double?,
            private val perUnitMaximum: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Basis point take rate per event */
            @JsonProperty("bps") fun bps(): Double? = bps

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
                    this.bps = bpsConfig.bps
                    this.perUnitMaximum = bpsConfig.perUnitMaximum
                    additionalProperties(bpsConfig.additionalProperties)
                }

                /** Basis point take rate per event */
                @JsonProperty("bps") fun bps(bps: Double) = apply { this.bps = bps }

                /** Optional currency amount maximum to cap spend per event */
                @JsonProperty("per_unit_maximum")
                fun perUnitMaximum(perUnitMaximum: String) = apply {
                    this.perUnitMaximum = perUnitMaximum
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BpsConfig =
                    BpsConfig(
                        checkNotNull(bps) { "`bps` is required but was not set" },
                        perUnitMaximum,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BpsConfig && this.bps == other.bps && this.perUnitMaximum == other.perUnitMaximum && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(bps, perUnitMaximum, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BpsConfig{bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BPS = ModelType(JsonField.of("bps"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingBpsPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.bpsConfig == other.bpsConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, bpsConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingBpsPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, bpsConfig=$bpsConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingBulkBpsPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingBulkBpsPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val bulkBpsConfig: BulkBpsConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("bulk_bps_config") fun bulkBpsConfig(): BulkBpsConfig? = bulkBpsConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingBulkBpsPrice.metadata
                this.externalPriceId = newFloatingBulkBpsPrice.externalPriceId
                this.name = newFloatingBulkBpsPrice.name
                this.billableMetricId = newFloatingBulkBpsPrice.billableMetricId
                this.itemId = newFloatingBulkBpsPrice.itemId
                this.billedInAdvance = newFloatingBulkBpsPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingBulkBpsPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingBulkBpsPrice.invoiceGroupingKey
                this.cadence = newFloatingBulkBpsPrice.cadence
                this.billingCycleConfiguration = newFloatingBulkBpsPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingBulkBpsPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingBulkBpsPrice.conversionRate
                this.modelType = newFloatingBulkBpsPrice.modelType
                this.bulkBpsConfig = newFloatingBulkBpsPrice.bulkBpsConfig
                this.currency = newFloatingBulkBpsPrice.currency
                additionalProperties(newFloatingBulkBpsPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("bulk_bps_config")
            fun bulkBpsConfig(bulkBpsConfig: BulkBpsConfig) = apply {
                this.bulkBpsConfig = bulkBpsConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BulkBpsConfig.Builder::class)
        @NoAutoDetect
        class BulkBpsConfig
        private constructor(
            private val tiers: List<Tier>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
             * based on total volume
             */
            @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: List<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bulkBpsConfig: BulkBpsConfig) = apply {
                    this.tiers = bulkBpsConfig.tiers
                    additionalProperties(bulkBpsConfig.additionalProperties)
                }

                /**
                 * Tiers for a bulk BPS pricing model where all usage is aggregated to a single tier
                 * based on total volume
                 */
                @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BulkBpsConfig =
                    BulkBpsConfig(
                        checkNotNull(tiers) { "`tiers` is required but was not set" }
                            .toUnmodifiable(),
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val maximumAmount: String?,
                private val bps: Double?,
                private val perUnitMaximum: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** Upper bound for tier */
                @JsonProperty("maximum_amount") fun maximumAmount(): String? = maximumAmount

                /** Basis points to rate on */
                @JsonProperty("bps") fun bps(): Double? = bps

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
                        this.maximumAmount = tier.maximumAmount
                        this.bps = tier.bps
                        this.perUnitMaximum = tier.perUnitMaximum
                        additionalProperties(tier.additionalProperties)
                    }

                    /** Upper bound for tier */
                    @JsonProperty("maximum_amount")
                    fun maximumAmount(maximumAmount: String) = apply {
                        this.maximumAmount = maximumAmount
                    }

                    /** Basis points to rate on */
                    @JsonProperty("bps") fun bps(bps: Double) = apply { this.bps = bps }

                    /** The maximum amount to charge for any one event */
                    @JsonProperty("per_unit_maximum")
                    fun perUnitMaximum(perUnitMaximum: String) = apply {
                        this.perUnitMaximum = perUnitMaximum
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            maximumAmount,
                            checkNotNull(bps) { "`bps` is required but was not set" },
                            perUnitMaximum,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && this.maximumAmount == other.maximumAmount && this.bps == other.bps && this.perUnitMaximum == other.perUnitMaximum && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(maximumAmount, bps, perUnitMaximum, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{maximumAmount=$maximumAmount, bps=$bps, perUnitMaximum=$perUnitMaximum, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BulkBpsConfig && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(tiers, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BulkBpsConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BULK_BPS = ModelType(JsonField.of("bulk_bps"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingBulkBpsPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.bulkBpsConfig == other.bulkBpsConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, bulkBpsConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingBulkBpsPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, bulkBpsConfig=$bulkBpsConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingBulkPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingBulkPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val bulkConfig: BulkConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("bulk_config") fun bulkConfig(): BulkConfig? = bulkConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingBulkPrice.metadata
                this.externalPriceId = newFloatingBulkPrice.externalPriceId
                this.name = newFloatingBulkPrice.name
                this.billableMetricId = newFloatingBulkPrice.billableMetricId
                this.itemId = newFloatingBulkPrice.itemId
                this.billedInAdvance = newFloatingBulkPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingBulkPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingBulkPrice.invoiceGroupingKey
                this.cadence = newFloatingBulkPrice.cadence
                this.billingCycleConfiguration = newFloatingBulkPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration = newFloatingBulkPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingBulkPrice.conversionRate
                this.modelType = newFloatingBulkPrice.modelType
                this.bulkConfig = newFloatingBulkPrice.bulkConfig
                this.currency = newFloatingBulkPrice.currency
                additionalProperties(newFloatingBulkPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("bulk_config")
            fun bulkConfig(bulkConfig: BulkConfig) = apply { this.bulkConfig = bulkConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BulkConfig.Builder::class)
        @NoAutoDetect
        class BulkConfig
        private constructor(
            private val tiers: List<Tier>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Bulk tiers for rating based on total usage volume */
            @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var tiers: List<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(bulkConfig: BulkConfig) = apply {
                    this.tiers = bulkConfig.tiers
                    additionalProperties(bulkConfig.additionalProperties)
                }

                /** Bulk tiers for rating based on total usage volume */
                @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BulkConfig =
                    BulkConfig(
                        checkNotNull(tiers) { "`tiers` is required but was not set" }
                            .toUnmodifiable(),
                        additionalProperties.toUnmodifiable()
                    )
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val maximumUnits: Double?,
                private val unitAmount: String?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** Upper bound for this tier */
                @JsonProperty("maximum_units") fun maximumUnits(): Double? = maximumUnits

                /** Amount per unit */
                @JsonProperty("unit_amount") fun unitAmount(): String? = unitAmount

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
                        this.maximumUnits = tier.maximumUnits
                        this.unitAmount = tier.unitAmount
                        additionalProperties(tier.additionalProperties)
                    }

                    /** Upper bound for this tier */
                    @JsonProperty("maximum_units")
                    fun maximumUnits(maximumUnits: Double) = apply {
                        this.maximumUnits = maximumUnits
                    }

                    /** Amount per unit */
                    @JsonProperty("unit_amount")
                    fun unitAmount(unitAmount: String) = apply { this.unitAmount = unitAmount }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            maximumUnits,
                            checkNotNull(unitAmount) { "`unitAmount` is required but was not set" },
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && this.maximumUnits == other.maximumUnits && this.unitAmount == other.unitAmount && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(maximumUnits, unitAmount, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{maximumUnits=$maximumUnits, unitAmount=$unitAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BulkConfig && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(tiers, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BulkConfig{tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BULK = ModelType(JsonField.of("bulk"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingBulkPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.bulkConfig == other.bulkConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, bulkConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingBulkPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, bulkConfig=$bulkConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingThresholdTotalAmountPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingThresholdTotalAmountPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val thresholdTotalAmountConfig: ThresholdTotalAmountConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("threshold_total_amount_config")
        fun thresholdTotalAmountConfig(): ThresholdTotalAmountConfig? = thresholdTotalAmountConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingThresholdTotalAmountPrice.metadata
                this.externalPriceId = newFloatingThresholdTotalAmountPrice.externalPriceId
                this.name = newFloatingThresholdTotalAmountPrice.name
                this.billableMetricId = newFloatingThresholdTotalAmountPrice.billableMetricId
                this.itemId = newFloatingThresholdTotalAmountPrice.itemId
                this.billedInAdvance = newFloatingThresholdTotalAmountPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingThresholdTotalAmountPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingThresholdTotalAmountPrice.invoiceGroupingKey
                this.cadence = newFloatingThresholdTotalAmountPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingThresholdTotalAmountPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingThresholdTotalAmountPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingThresholdTotalAmountPrice.conversionRate
                this.modelType = newFloatingThresholdTotalAmountPrice.modelType
                this.thresholdTotalAmountConfig =
                    newFloatingThresholdTotalAmountPrice.thresholdTotalAmountConfig
                this.currency = newFloatingThresholdTotalAmountPrice.currency
                additionalProperties(newFloatingThresholdTotalAmountPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("threshold_total_amount_config")
            fun thresholdTotalAmountConfig(thresholdTotalAmountConfig: ThresholdTotalAmountConfig) =
                apply {
                    this.thresholdTotalAmountConfig = thresholdTotalAmountConfig
                }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val THRESHOLD_TOTAL_AMOUNT = ModelType(JsonField.of("threshold_total_amount"))

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
        }

        @JsonDeserialize(builder = ThresholdTotalAmountConfig.Builder::class)
        @NoAutoDetect
        class ThresholdTotalAmountConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(thresholdTotalAmountConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ThresholdTotalAmountConfig =
                    ThresholdTotalAmountConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ThresholdTotalAmountConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ThresholdTotalAmountConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingThresholdTotalAmountPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.thresholdTotalAmountConfig == other.thresholdTotalAmountConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, thresholdTotalAmountConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingThresholdTotalAmountPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, thresholdTotalAmountConfig=$thresholdTotalAmountConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingTieredPackagePrice.Builder::class)
    @NoAutoDetect
    class NewFloatingTieredPackagePrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val tieredPackageConfig: TieredPackageConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("tiered_package_config")
        fun tieredPackageConfig(): TieredPackageConfig? = tieredPackageConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                    this.metadata = newFloatingTieredPackagePrice.metadata
                    this.externalPriceId = newFloatingTieredPackagePrice.externalPriceId
                    this.name = newFloatingTieredPackagePrice.name
                    this.billableMetricId = newFloatingTieredPackagePrice.billableMetricId
                    this.itemId = newFloatingTieredPackagePrice.itemId
                    this.billedInAdvance = newFloatingTieredPackagePrice.billedInAdvance
                    this.fixedPriceQuantity = newFloatingTieredPackagePrice.fixedPriceQuantity
                    this.invoiceGroupingKey = newFloatingTieredPackagePrice.invoiceGroupingKey
                    this.cadence = newFloatingTieredPackagePrice.cadence
                    this.billingCycleConfiguration =
                        newFloatingTieredPackagePrice.billingCycleConfiguration
                    this.invoicingCycleConfiguration =
                        newFloatingTieredPackagePrice.invoicingCycleConfiguration
                    this.conversionRate = newFloatingTieredPackagePrice.conversionRate
                    this.modelType = newFloatingTieredPackagePrice.modelType
                    this.tieredPackageConfig = newFloatingTieredPackagePrice.tieredPackageConfig
                    this.currency = newFloatingTieredPackagePrice.currency
                    additionalProperties(newFloatingTieredPackagePrice.additionalProperties)
                }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("tiered_package_config")
            fun tieredPackageConfig(tieredPackageConfig: TieredPackageConfig) = apply {
                this.tieredPackageConfig = tieredPackageConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_PACKAGE = ModelType(JsonField.of("tiered_package"))

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
        }

        @JsonDeserialize(builder = TieredPackageConfig.Builder::class)
        @NoAutoDetect
        class TieredPackageConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(tieredPackageConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredPackageConfig =
                    TieredPackageConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredPackageConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TieredPackageConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredPackagePrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.tieredPackageConfig == other.tieredPackageConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredPackageConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingTieredPackagePrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredPackageConfig=$tieredPackageConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingGroupedTieredPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingGroupedTieredPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val groupedTieredConfig: GroupedTieredConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("grouped_tiered_config")
        fun groupedTieredConfig(): GroupedTieredConfig? = groupedTieredConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                    this.metadata = newFloatingGroupedTieredPrice.metadata
                    this.externalPriceId = newFloatingGroupedTieredPrice.externalPriceId
                    this.name = newFloatingGroupedTieredPrice.name
                    this.billableMetricId = newFloatingGroupedTieredPrice.billableMetricId
                    this.itemId = newFloatingGroupedTieredPrice.itemId
                    this.billedInAdvance = newFloatingGroupedTieredPrice.billedInAdvance
                    this.fixedPriceQuantity = newFloatingGroupedTieredPrice.fixedPriceQuantity
                    this.invoiceGroupingKey = newFloatingGroupedTieredPrice.invoiceGroupingKey
                    this.cadence = newFloatingGroupedTieredPrice.cadence
                    this.billingCycleConfiguration =
                        newFloatingGroupedTieredPrice.billingCycleConfiguration
                    this.invoicingCycleConfiguration =
                        newFloatingGroupedTieredPrice.invoicingCycleConfiguration
                    this.conversionRate = newFloatingGroupedTieredPrice.conversionRate
                    this.modelType = newFloatingGroupedTieredPrice.modelType
                    this.groupedTieredConfig = newFloatingGroupedTieredPrice.groupedTieredConfig
                    this.currency = newFloatingGroupedTieredPrice.currency
                    additionalProperties(newFloatingGroupedTieredPrice.additionalProperties)
                }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("grouped_tiered_config")
            fun groupedTieredConfig(groupedTieredConfig: GroupedTieredConfig) = apply {
                this.groupedTieredConfig = groupedTieredConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        @JsonDeserialize(builder = GroupedTieredConfig.Builder::class)
        @NoAutoDetect
        class GroupedTieredConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(groupedTieredConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GroupedTieredConfig =
                    GroupedTieredConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedTieredConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GroupedTieredConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val GROUPED_TIERED = ModelType(JsonField.of("grouped_tiered"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedTieredPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.groupedTieredConfig == other.groupedTieredConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedTieredConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingGroupedTieredPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedTieredConfig=$groupedTieredConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingTieredWithMinimumPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingTieredWithMinimumPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val tieredWithMinimumConfig: TieredWithMinimumConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("tiered_with_minimum_config")
        fun tieredWithMinimumConfig(): TieredWithMinimumConfig? = tieredWithMinimumConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingTieredWithMinimumPrice.metadata
                this.externalPriceId = newFloatingTieredWithMinimumPrice.externalPriceId
                this.name = newFloatingTieredWithMinimumPrice.name
                this.billableMetricId = newFloatingTieredWithMinimumPrice.billableMetricId
                this.itemId = newFloatingTieredWithMinimumPrice.itemId
                this.billedInAdvance = newFloatingTieredWithMinimumPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingTieredWithMinimumPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingTieredWithMinimumPrice.invoiceGroupingKey
                this.cadence = newFloatingTieredWithMinimumPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingTieredWithMinimumPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingTieredWithMinimumPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingTieredWithMinimumPrice.conversionRate
                this.modelType = newFloatingTieredWithMinimumPrice.modelType
                this.tieredWithMinimumConfig =
                    newFloatingTieredWithMinimumPrice.tieredWithMinimumConfig
                this.currency = newFloatingTieredWithMinimumPrice.currency
                additionalProperties(newFloatingTieredWithMinimumPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("tiered_with_minimum_config")
            fun tieredWithMinimumConfig(tieredWithMinimumConfig: TieredWithMinimumConfig) = apply {
                this.tieredWithMinimumConfig = tieredWithMinimumConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_WITH_MINIMUM = ModelType(JsonField.of("tiered_with_minimum"))

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
        }

        @JsonDeserialize(builder = TieredWithMinimumConfig.Builder::class)
        @NoAutoDetect
        class TieredWithMinimumConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(tieredWithMinimumConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredWithMinimumConfig =
                    TieredWithMinimumConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredWithMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TieredWithMinimumConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredWithMinimumPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.tieredWithMinimumConfig == other.tieredWithMinimumConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredWithMinimumConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingTieredWithMinimumPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredWithMinimumConfig=$tieredWithMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingPackageWithAllocationPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingPackageWithAllocationPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val packageWithAllocationConfig: PackageWithAllocationConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("package_with_allocation_config")
        fun packageWithAllocationConfig(): PackageWithAllocationConfig? =
            packageWithAllocationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingPackageWithAllocationPrice.metadata
                this.externalPriceId = newFloatingPackageWithAllocationPrice.externalPriceId
                this.name = newFloatingPackageWithAllocationPrice.name
                this.billableMetricId = newFloatingPackageWithAllocationPrice.billableMetricId
                this.itemId = newFloatingPackageWithAllocationPrice.itemId
                this.billedInAdvance = newFloatingPackageWithAllocationPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingPackageWithAllocationPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingPackageWithAllocationPrice.invoiceGroupingKey
                this.cadence = newFloatingPackageWithAllocationPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingPackageWithAllocationPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingPackageWithAllocationPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingPackageWithAllocationPrice.conversionRate
                this.modelType = newFloatingPackageWithAllocationPrice.modelType
                this.packageWithAllocationConfig =
                    newFloatingPackageWithAllocationPrice.packageWithAllocationConfig
                this.currency = newFloatingPackageWithAllocationPrice.currency
                additionalProperties(newFloatingPackageWithAllocationPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("package_with_allocation_config")
            fun packageWithAllocationConfig(
                packageWithAllocationConfig: PackageWithAllocationConfig
            ) = apply { this.packageWithAllocationConfig = packageWithAllocationConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val PACKAGE_WITH_ALLOCATION = ModelType(JsonField.of("package_with_allocation"))

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
        }

        @JsonDeserialize(builder = PackageWithAllocationConfig.Builder::class)
        @NoAutoDetect
        class PackageWithAllocationConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                        additionalProperties(packageWithAllocationConfig.additionalProperties)
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PackageWithAllocationConfig =
                    PackageWithAllocationConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PackageWithAllocationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PackageWithAllocationConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingPackageWithAllocationPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.packageWithAllocationConfig == other.packageWithAllocationConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, packageWithAllocationConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingPackageWithAllocationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, packageWithAllocationConfig=$packageWithAllocationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingTieredPackageWithMinimumPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingTieredPackageWithMinimumPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("tiered_package_with_minimum_config")
        fun tieredPackageWithMinimumConfig(): TieredPackageWithMinimumConfig? =
            tieredPackageWithMinimumConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingTieredPackageWithMinimumPrice.metadata
                this.externalPriceId = newFloatingTieredPackageWithMinimumPrice.externalPriceId
                this.name = newFloatingTieredPackageWithMinimumPrice.name
                this.billableMetricId = newFloatingTieredPackageWithMinimumPrice.billableMetricId
                this.itemId = newFloatingTieredPackageWithMinimumPrice.itemId
                this.billedInAdvance = newFloatingTieredPackageWithMinimumPrice.billedInAdvance
                this.fixedPriceQuantity =
                    newFloatingTieredPackageWithMinimumPrice.fixedPriceQuantity
                this.invoiceGroupingKey =
                    newFloatingTieredPackageWithMinimumPrice.invoiceGroupingKey
                this.cadence = newFloatingTieredPackageWithMinimumPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingTieredPackageWithMinimumPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingTieredPackageWithMinimumPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingTieredPackageWithMinimumPrice.conversionRate
                this.modelType = newFloatingTieredPackageWithMinimumPrice.modelType
                this.tieredPackageWithMinimumConfig =
                    newFloatingTieredPackageWithMinimumPrice.tieredPackageWithMinimumConfig
                this.currency = newFloatingTieredPackageWithMinimumPrice.currency
                additionalProperties(newFloatingTieredPackageWithMinimumPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("tiered_package_with_minimum_config")
            fun tieredPackageWithMinimumConfig(
                tieredPackageWithMinimumConfig: TieredPackageWithMinimumConfig
            ) = apply { this.tieredPackageWithMinimumConfig = tieredPackageWithMinimumConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_PACKAGE_WITH_MINIMUM =
                    ModelType(JsonField.of("tiered_package_with_minimum"))

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
        }

        @JsonDeserialize(builder = TieredPackageWithMinimumConfig.Builder::class)
        @NoAutoDetect
        class TieredPackageWithMinimumConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                        additionalProperties(tieredPackageWithMinimumConfig.additionalProperties)
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredPackageWithMinimumConfig =
                    TieredPackageWithMinimumConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredPackageWithMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TieredPackageWithMinimumConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredPackageWithMinimumPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.tieredPackageWithMinimumConfig == other.tieredPackageWithMinimumConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredPackageWithMinimumConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingTieredPackageWithMinimumPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredPackageWithMinimumConfig=$tieredPackageWithMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingUnitWithPercentPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingUnitWithPercentPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val unitWithPercentConfig: UnitWithPercentConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("unit_with_percent_config")
        fun unitWithPercentConfig(): UnitWithPercentConfig? = unitWithPercentConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                    this.metadata = newFloatingUnitWithPercentPrice.metadata
                    this.externalPriceId = newFloatingUnitWithPercentPrice.externalPriceId
                    this.name = newFloatingUnitWithPercentPrice.name
                    this.billableMetricId = newFloatingUnitWithPercentPrice.billableMetricId
                    this.itemId = newFloatingUnitWithPercentPrice.itemId
                    this.billedInAdvance = newFloatingUnitWithPercentPrice.billedInAdvance
                    this.fixedPriceQuantity = newFloatingUnitWithPercentPrice.fixedPriceQuantity
                    this.invoiceGroupingKey = newFloatingUnitWithPercentPrice.invoiceGroupingKey
                    this.cadence = newFloatingUnitWithPercentPrice.cadence
                    this.billingCycleConfiguration =
                        newFloatingUnitWithPercentPrice.billingCycleConfiguration
                    this.invoicingCycleConfiguration =
                        newFloatingUnitWithPercentPrice.invoicingCycleConfiguration
                    this.conversionRate = newFloatingUnitWithPercentPrice.conversionRate
                    this.modelType = newFloatingUnitWithPercentPrice.modelType
                    this.unitWithPercentConfig =
                        newFloatingUnitWithPercentPrice.unitWithPercentConfig
                    this.currency = newFloatingUnitWithPercentPrice.currency
                    additionalProperties(newFloatingUnitWithPercentPrice.additionalProperties)
                }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("unit_with_percent_config")
            fun unitWithPercentConfig(unitWithPercentConfig: UnitWithPercentConfig) = apply {
                this.unitWithPercentConfig = unitWithPercentConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val UNIT_WITH_PERCENT = ModelType(JsonField.of("unit_with_percent"))

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
        }

        @JsonDeserialize(builder = UnitWithPercentConfig.Builder::class)
        @NoAutoDetect
        class UnitWithPercentConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(unitWithPercentConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnitWithPercentConfig =
                    UnitWithPercentConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitWithPercentConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "UnitWithPercentConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingUnitWithPercentPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.unitWithPercentConfig == other.unitWithPercentConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, unitWithPercentConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingUnitWithPercentPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, unitWithPercentConfig=$unitWithPercentConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingTieredWithProrationPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingTieredWithProrationPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val tieredWithProrationConfig: TieredWithProrationConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("tiered_with_proration_config")
        fun tieredWithProrationConfig(): TieredWithProrationConfig? = tieredWithProrationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingTieredWithProrationPrice.metadata
                this.externalPriceId = newFloatingTieredWithProrationPrice.externalPriceId
                this.name = newFloatingTieredWithProrationPrice.name
                this.billableMetricId = newFloatingTieredWithProrationPrice.billableMetricId
                this.itemId = newFloatingTieredWithProrationPrice.itemId
                this.billedInAdvance = newFloatingTieredWithProrationPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingTieredWithProrationPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingTieredWithProrationPrice.invoiceGroupingKey
                this.cadence = newFloatingTieredWithProrationPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingTieredWithProrationPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingTieredWithProrationPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingTieredWithProrationPrice.conversionRate
                this.modelType = newFloatingTieredWithProrationPrice.modelType
                this.tieredWithProrationConfig =
                    newFloatingTieredWithProrationPrice.tieredWithProrationConfig
                this.currency = newFloatingTieredWithProrationPrice.currency
                additionalProperties(newFloatingTieredWithProrationPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("tiered_with_proration_config")
            fun tieredWithProrationConfig(tieredWithProrationConfig: TieredWithProrationConfig) =
                apply {
                    this.tieredWithProrationConfig = tieredWithProrationConfig
                }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val TIERED_WITH_PRORATION = ModelType(JsonField.of("tiered_with_proration"))

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
        }

        @JsonDeserialize(builder = TieredWithProrationConfig.Builder::class)
        @NoAutoDetect
        class TieredWithProrationConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(tieredWithProrationConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TieredWithProrationConfig =
                    TieredWithProrationConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TieredWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TieredWithProrationConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingTieredWithProrationPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.tieredWithProrationConfig == other.tieredWithProrationConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, tieredWithProrationConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingTieredWithProrationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, tieredWithProrationConfig=$tieredWithProrationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingUnitWithProrationPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingUnitWithProrationPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val unitWithProrationConfig: UnitWithProrationConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("unit_with_proration_config")
        fun unitWithProrationConfig(): UnitWithProrationConfig? = unitWithProrationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingUnitWithProrationPrice.metadata
                this.externalPriceId = newFloatingUnitWithProrationPrice.externalPriceId
                this.name = newFloatingUnitWithProrationPrice.name
                this.billableMetricId = newFloatingUnitWithProrationPrice.billableMetricId
                this.itemId = newFloatingUnitWithProrationPrice.itemId
                this.billedInAdvance = newFloatingUnitWithProrationPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingUnitWithProrationPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingUnitWithProrationPrice.invoiceGroupingKey
                this.cadence = newFloatingUnitWithProrationPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingUnitWithProrationPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingUnitWithProrationPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingUnitWithProrationPrice.conversionRate
                this.modelType = newFloatingUnitWithProrationPrice.modelType
                this.unitWithProrationConfig =
                    newFloatingUnitWithProrationPrice.unitWithProrationConfig
                this.currency = newFloatingUnitWithProrationPrice.currency
                additionalProperties(newFloatingUnitWithProrationPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("unit_with_proration_config")
            fun unitWithProrationConfig(unitWithProrationConfig: UnitWithProrationConfig) = apply {
                this.unitWithProrationConfig = unitWithProrationConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val UNIT_WITH_PRORATION = ModelType(JsonField.of("unit_with_proration"))

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
        }

        @JsonDeserialize(builder = UnitWithProrationConfig.Builder::class)
        @NoAutoDetect
        class UnitWithProrationConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(unitWithProrationConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): UnitWithProrationConfig =
                    UnitWithProrationConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UnitWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "UnitWithProrationConfig{additionalProperties=$additionalProperties}"
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingUnitWithProrationPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.unitWithProrationConfig == other.unitWithProrationConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, unitWithProrationConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingUnitWithProrationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, unitWithProrationConfig=$unitWithProrationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingGroupedAllocationPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingGroupedAllocationPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val groupedAllocationConfig: GroupedAllocationConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("grouped_allocation_config")
        fun groupedAllocationConfig(): GroupedAllocationConfig? = groupedAllocationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingGroupedAllocationPrice.metadata
                this.externalPriceId = newFloatingGroupedAllocationPrice.externalPriceId
                this.name = newFloatingGroupedAllocationPrice.name
                this.billableMetricId = newFloatingGroupedAllocationPrice.billableMetricId
                this.itemId = newFloatingGroupedAllocationPrice.itemId
                this.billedInAdvance = newFloatingGroupedAllocationPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingGroupedAllocationPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingGroupedAllocationPrice.invoiceGroupingKey
                this.cadence = newFloatingGroupedAllocationPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingGroupedAllocationPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingGroupedAllocationPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingGroupedAllocationPrice.conversionRate
                this.modelType = newFloatingGroupedAllocationPrice.modelType
                this.groupedAllocationConfig =
                    newFloatingGroupedAllocationPrice.groupedAllocationConfig
                this.currency = newFloatingGroupedAllocationPrice.currency
                additionalProperties(newFloatingGroupedAllocationPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("grouped_allocation_config")
            fun groupedAllocationConfig(groupedAllocationConfig: GroupedAllocationConfig) = apply {
                this.groupedAllocationConfig = groupedAllocationConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        @JsonDeserialize(builder = GroupedAllocationConfig.Builder::class)
        @NoAutoDetect
        class GroupedAllocationConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(groupedAllocationConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GroupedAllocationConfig =
                    GroupedAllocationConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedAllocationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GroupedAllocationConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val GROUPED_ALLOCATION = ModelType(JsonField.of("grouped_allocation"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedAllocationPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.groupedAllocationConfig == other.groupedAllocationConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedAllocationConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingGroupedAllocationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedAllocationConfig=$groupedAllocationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingGroupedWithProratedMinimumPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingGroupedWithProratedMinimumPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("grouped_with_prorated_minimum_config")
        fun groupedWithProratedMinimumConfig(): GroupedWithProratedMinimumConfig? =
            groupedWithProratedMinimumConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingGroupedWithProratedMinimumPrice.metadata
                this.externalPriceId = newFloatingGroupedWithProratedMinimumPrice.externalPriceId
                this.name = newFloatingGroupedWithProratedMinimumPrice.name
                this.billableMetricId = newFloatingGroupedWithProratedMinimumPrice.billableMetricId
                this.itemId = newFloatingGroupedWithProratedMinimumPrice.itemId
                this.billedInAdvance = newFloatingGroupedWithProratedMinimumPrice.billedInAdvance
                this.fixedPriceQuantity =
                    newFloatingGroupedWithProratedMinimumPrice.fixedPriceQuantity
                this.invoiceGroupingKey =
                    newFloatingGroupedWithProratedMinimumPrice.invoiceGroupingKey
                this.cadence = newFloatingGroupedWithProratedMinimumPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingGroupedWithProratedMinimumPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingGroupedWithProratedMinimumPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingGroupedWithProratedMinimumPrice.conversionRate
                this.modelType = newFloatingGroupedWithProratedMinimumPrice.modelType
                this.groupedWithProratedMinimumConfig =
                    newFloatingGroupedWithProratedMinimumPrice.groupedWithProratedMinimumConfig
                this.currency = newFloatingGroupedWithProratedMinimumPrice.currency
                additionalProperties(
                    newFloatingGroupedWithProratedMinimumPrice.additionalProperties
                )
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("grouped_with_prorated_minimum_config")
            fun groupedWithProratedMinimumConfig(
                groupedWithProratedMinimumConfig: GroupedWithProratedMinimumConfig
            ) = apply { this.groupedWithProratedMinimumConfig = groupedWithProratedMinimumConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        @JsonDeserialize(builder = GroupedWithProratedMinimumConfig.Builder::class)
        @NoAutoDetect
        class GroupedWithProratedMinimumConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(groupedWithProratedMinimumConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GroupedWithProratedMinimumConfig =
                    GroupedWithProratedMinimumConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedWithProratedMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GroupedWithProratedMinimumConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val GROUPED_WITH_PRORATED_MINIMUM =
                    ModelType(JsonField.of("grouped_with_prorated_minimum"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedWithProratedMinimumPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.groupedWithProratedMinimumConfig == other.groupedWithProratedMinimumConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedWithProratedMinimumConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingGroupedWithProratedMinimumPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedWithProratedMinimumConfig=$groupedWithProratedMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingGroupedWithMeteredMinimumPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingGroupedWithMeteredMinimumPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("grouped_with_metered_minimum_config")
        fun groupedWithMeteredMinimumConfig(): GroupedWithMeteredMinimumConfig? =
            groupedWithMeteredMinimumConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingGroupedWithMeteredMinimumPrice.metadata
                this.externalPriceId = newFloatingGroupedWithMeteredMinimumPrice.externalPriceId
                this.name = newFloatingGroupedWithMeteredMinimumPrice.name
                this.billableMetricId = newFloatingGroupedWithMeteredMinimumPrice.billableMetricId
                this.itemId = newFloatingGroupedWithMeteredMinimumPrice.itemId
                this.billedInAdvance = newFloatingGroupedWithMeteredMinimumPrice.billedInAdvance
                this.fixedPriceQuantity =
                    newFloatingGroupedWithMeteredMinimumPrice.fixedPriceQuantity
                this.invoiceGroupingKey =
                    newFloatingGroupedWithMeteredMinimumPrice.invoiceGroupingKey
                this.cadence = newFloatingGroupedWithMeteredMinimumPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingGroupedWithMeteredMinimumPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingGroupedWithMeteredMinimumPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingGroupedWithMeteredMinimumPrice.conversionRate
                this.modelType = newFloatingGroupedWithMeteredMinimumPrice.modelType
                this.groupedWithMeteredMinimumConfig =
                    newFloatingGroupedWithMeteredMinimumPrice.groupedWithMeteredMinimumConfig
                this.currency = newFloatingGroupedWithMeteredMinimumPrice.currency
                additionalProperties(newFloatingGroupedWithMeteredMinimumPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("grouped_with_metered_minimum_config")
            fun groupedWithMeteredMinimumConfig(
                groupedWithMeteredMinimumConfig: GroupedWithMeteredMinimumConfig
            ) = apply { this.groupedWithMeteredMinimumConfig = groupedWithMeteredMinimumConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        @JsonDeserialize(builder = GroupedWithMeteredMinimumConfig.Builder::class)
        @NoAutoDetect
        class GroupedWithMeteredMinimumConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(groupedWithMeteredMinimumConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GroupedWithMeteredMinimumConfig =
                    GroupedWithMeteredMinimumConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GroupedWithMeteredMinimumConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GroupedWithMeteredMinimumConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val GROUPED_WITH_METERED_MINIMUM =
                    ModelType(JsonField.of("grouped_with_metered_minimum"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingGroupedWithMeteredMinimumPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.groupedWithMeteredMinimumConfig == other.groupedWithMeteredMinimumConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, groupedWithMeteredMinimumConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingGroupedWithMeteredMinimumPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, groupedWithMeteredMinimumConfig=$groupedWithMeteredMinimumConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingMatrixWithDisplayNamePrice.Builder::class)
    @NoAutoDetect
    class NewFloatingMatrixWithDisplayNamePrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("matrix_with_display_name_config")
        fun matrixWithDisplayNameConfig(): MatrixWithDisplayNameConfig? =
            matrixWithDisplayNameConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingMatrixWithDisplayNamePrice.metadata
                this.externalPriceId = newFloatingMatrixWithDisplayNamePrice.externalPriceId
                this.name = newFloatingMatrixWithDisplayNamePrice.name
                this.billableMetricId = newFloatingMatrixWithDisplayNamePrice.billableMetricId
                this.itemId = newFloatingMatrixWithDisplayNamePrice.itemId
                this.billedInAdvance = newFloatingMatrixWithDisplayNamePrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingMatrixWithDisplayNamePrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingMatrixWithDisplayNamePrice.invoiceGroupingKey
                this.cadence = newFloatingMatrixWithDisplayNamePrice.cadence
                this.billingCycleConfiguration =
                    newFloatingMatrixWithDisplayNamePrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingMatrixWithDisplayNamePrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingMatrixWithDisplayNamePrice.conversionRate
                this.modelType = newFloatingMatrixWithDisplayNamePrice.modelType
                this.matrixWithDisplayNameConfig =
                    newFloatingMatrixWithDisplayNamePrice.matrixWithDisplayNameConfig
                this.currency = newFloatingMatrixWithDisplayNamePrice.currency
                additionalProperties(newFloatingMatrixWithDisplayNamePrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("matrix_with_display_name_config")
            fun matrixWithDisplayNameConfig(
                matrixWithDisplayNameConfig: MatrixWithDisplayNameConfig
            ) = apply { this.matrixWithDisplayNameConfig = matrixWithDisplayNameConfig }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        @JsonDeserialize(builder = MatrixWithDisplayNameConfig.Builder::class)
        @NoAutoDetect
        class MatrixWithDisplayNameConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                        additionalProperties(matrixWithDisplayNameConfig.additionalProperties)
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): MatrixWithDisplayNameConfig =
                    MatrixWithDisplayNameConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MatrixWithDisplayNameConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "MatrixWithDisplayNameConfig{additionalProperties=$additionalProperties}"
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val MATRIX_WITH_DISPLAY_NAME = ModelType(JsonField.of("matrix_with_display_name"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingMatrixWithDisplayNamePrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.matrixWithDisplayNameConfig == other.matrixWithDisplayNameConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, matrixWithDisplayNameConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingMatrixWithDisplayNamePrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, matrixWithDisplayNameConfig=$matrixWithDisplayNameConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = NewFloatingBulkWithProrationPrice.Builder::class)
    @NoAutoDetect
    class NewFloatingBulkWithProrationPrice
    private constructor(
        private val metadata: Metadata?,
        private val externalPriceId: String?,
        private val name: String?,
        private val billableMetricId: String?,
        private val itemId: String?,
        private val billedInAdvance: Boolean?,
        private val fixedPriceQuantity: Double?,
        private val invoiceGroupingKey: String?,
        private val cadence: Cadence?,
        private val billingCycleConfiguration: BillingCycleConfiguration?,
        private val invoicingCycleConfiguration: InvoicingCycleConfiguration?,
        private val conversionRate: Double?,
        private val modelType: ModelType?,
        private val bulkWithProrationConfig: BulkWithProrationConfig?,
        private val currency: String?,
        private val additionalProperties: Map<String, JsonValue>,
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
        @JsonProperty("name") fun name(): String? = name

        /** The id of the billable metric for the price. Only needed if the price is usage-based. */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /** The id of the item the plan will be associated with. */
        @JsonProperty("item_id") fun itemId(): String? = itemId

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
        @JsonProperty("cadence") fun cadence(): Cadence? = cadence

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

        @JsonProperty("model_type") fun modelType(): ModelType? = modelType

        @JsonProperty("bulk_with_proration_config")
        fun bulkWithProrationConfig(): BulkWithProrationConfig? = bulkWithProrationConfig

        /** An ISO 4217 currency string for which this price is billed in. */
        @JsonProperty("currency") fun currency(): String? = currency

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
                this.metadata = newFloatingBulkWithProrationPrice.metadata
                this.externalPriceId = newFloatingBulkWithProrationPrice.externalPriceId
                this.name = newFloatingBulkWithProrationPrice.name
                this.billableMetricId = newFloatingBulkWithProrationPrice.billableMetricId
                this.itemId = newFloatingBulkWithProrationPrice.itemId
                this.billedInAdvance = newFloatingBulkWithProrationPrice.billedInAdvance
                this.fixedPriceQuantity = newFloatingBulkWithProrationPrice.fixedPriceQuantity
                this.invoiceGroupingKey = newFloatingBulkWithProrationPrice.invoiceGroupingKey
                this.cadence = newFloatingBulkWithProrationPrice.cadence
                this.billingCycleConfiguration =
                    newFloatingBulkWithProrationPrice.billingCycleConfiguration
                this.invoicingCycleConfiguration =
                    newFloatingBulkWithProrationPrice.invoicingCycleConfiguration
                this.conversionRate = newFloatingBulkWithProrationPrice.conversionRate
                this.modelType = newFloatingBulkWithProrationPrice.modelType
                this.bulkWithProrationConfig =
                    newFloatingBulkWithProrationPrice.bulkWithProrationConfig
                this.currency = newFloatingBulkWithProrationPrice.currency
                additionalProperties(newFloatingBulkWithProrationPrice.additionalProperties)
            }

            /**
             * User-specified key/value pairs for the resource. Individual keys can be removed by
             * setting the value to `null`, and the entire metadata mapping can be cleared by
             * setting `metadata` to `null`.
             */
            @JsonProperty("metadata")
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** An alias for the price. */
            @JsonProperty("external_price_id")
            fun externalPriceId(externalPriceId: String) = apply {
                this.externalPriceId = externalPriceId
            }

            /** The name of the price. */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * The id of the billable metric for the price. Only needed if the price is usage-based.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /** The id of the item the plan will be associated with. */
            @JsonProperty("item_id") fun itemId(itemId: String) = apply { this.itemId = itemId }

            /**
             * If the Price represents a fixed cost, the price will be billed in-advance if this is
             * true, and in-arrears if this is false.
             */
            @JsonProperty("billed_in_advance")
            fun billedInAdvance(billedInAdvance: Boolean) = apply {
                this.billedInAdvance = billedInAdvance
            }

            /**
             * If the Price represents a fixed cost, this represents the quantity of units applied.
             */
            @JsonProperty("fixed_price_quantity")
            fun fixedPriceQuantity(fixedPriceQuantity: Double) = apply {
                this.fixedPriceQuantity = fixedPriceQuantity
            }

            /** The property used to group this price on an invoice */
            @JsonProperty("invoice_grouping_key")
            fun invoiceGroupingKey(invoiceGroupingKey: String) = apply {
                this.invoiceGroupingKey = invoiceGroupingKey
            }

            /** The cadence to bill for this price on. */
            @JsonProperty("cadence")
            fun cadence(cadence: Cadence) = apply { this.cadence = cadence }

            /**
             * For custom cadence: specifies the duration of the billing period in days or months.
             */
            @JsonProperty("billing_cycle_configuration")
            fun billingCycleConfiguration(billingCycleConfiguration: BillingCycleConfiguration) =
                apply {
                    this.billingCycleConfiguration = billingCycleConfiguration
                }

            /**
             * Within each billing cycle, specifies the cadence at which invoices are produced. If
             * unspecified, a single invoice is produced per billing cycle.
             */
            @JsonProperty("invoicing_cycle_configuration")
            fun invoicingCycleConfiguration(
                invoicingCycleConfiguration: InvoicingCycleConfiguration
            ) = apply { this.invoicingCycleConfiguration = invoicingCycleConfiguration }

            /** The per unit conversion rate of the price currency to the invoicing currency. */
            @JsonProperty("conversion_rate")
            fun conversionRate(conversionRate: Double) = apply {
                this.conversionRate = conversionRate
            }

            @JsonProperty("model_type")
            fun modelType(modelType: ModelType) = apply { this.modelType = modelType }

            @JsonProperty("bulk_with_proration_config")
            fun bulkWithProrationConfig(bulkWithProrationConfig: BulkWithProrationConfig) = apply {
                this.bulkWithProrationConfig = bulkWithProrationConfig
            }

            /** An ISO 4217 currency string for which this price is billed in. */
            @JsonProperty("currency")
            fun currency(currency: String) = apply { this.currency = currency }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = BulkWithProrationConfig.Builder::class)
        @NoAutoDetect
        class BulkWithProrationConfig
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(bulkWithProrationConfig.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BulkWithProrationConfig =
                    BulkWithProrationConfig(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BulkWithProrationConfig && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BulkWithProrationConfig{additionalProperties=$additionalProperties}"
        }

        class Cadence
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cadence && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ANNUAL = Cadence(JsonField.of("annual"))

                val SEMI_ANNUAL = Cadence(JsonField.of("semi_annual"))

                val MONTHLY = Cadence(JsonField.of("monthly"))

                val QUARTERLY = Cadence(JsonField.of("quarterly"))

                val ONE_TIME = Cadence(JsonField.of("one_time"))

                val CUSTOM = Cadence(JsonField.of("custom"))

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
        }

        class ModelType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ModelType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val BULK_WITH_PRORATION = ModelType(JsonField.of("bulk_with_proration"))

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
        }

        /** For custom cadence: specifies the duration of the billing period in days or months. */
        @JsonDeserialize(builder = BillingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class BillingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                    this.duration = billingCycleConfiguration.duration
                    this.durationUnit = billingCycleConfiguration.durationUnit
                    additionalProperties(billingCycleConfiguration.additionalProperties)
                }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): BillingCycleConfiguration =
                    BillingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "BillingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * Within each billing cycle, specifies the cadence at which invoices are produced. If
         * unspecified, a single invoice is produced per billing cycle.
         */
        @JsonDeserialize(builder = InvoicingCycleConfiguration.Builder::class)
        @NoAutoDetect
        class InvoicingCycleConfiguration
        private constructor(
            private val duration: Long?,
            private val durationUnit: DurationUnit?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The duration of the billing period. */
            @JsonProperty("duration") fun duration(): Long? = duration

            /** The unit of billing period duration. */
            @JsonProperty("duration_unit") fun durationUnit(): DurationUnit? = durationUnit

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
                        this.duration = invoicingCycleConfiguration.duration
                        this.durationUnit = invoicingCycleConfiguration.durationUnit
                        additionalProperties(invoicingCycleConfiguration.additionalProperties)
                    }

                /** The duration of the billing period. */
                @JsonProperty("duration")
                fun duration(duration: Long) = apply { this.duration = duration }

                /** The unit of billing period duration. */
                @JsonProperty("duration_unit")
                fun durationUnit(durationUnit: DurationUnit) = apply {
                    this.durationUnit = durationUnit
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoicingCycleConfiguration =
                    InvoicingCycleConfiguration(
                        checkNotNull(duration) { "`duration` is required but was not set" },
                        checkNotNull(durationUnit) { "`durationUnit` is required but was not set" },
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class DurationUnit
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DurationUnit && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val DAY = DurationUnit(JsonField.of("day"))

                    val MONTH = DurationUnit(JsonField.of("month"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoicingCycleConfiguration && this.duration == other.duration && this.durationUnit == other.durationUnit && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(duration, durationUnit, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoicingCycleConfiguration{duration=$duration, durationUnit=$durationUnit, additionalProperties=$additionalProperties}"
        }

        /**
         * User-specified key/value pairs for the resource. Individual keys can be removed by
         * setting the value to `null`, and the entire metadata mapping can be cleared by setting
         * `metadata` to `null`.
         */
        @JsonDeserialize(builder = Metadata.Builder::class)
        @NoAutoDetect
        class Metadata
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(metadata.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Metadata = Metadata(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Metadata && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NewFloatingBulkWithProrationPrice && this.metadata == other.metadata && this.externalPriceId == other.externalPriceId && this.name == other.name && this.billableMetricId == other.billableMetricId && this.itemId == other.itemId && this.billedInAdvance == other.billedInAdvance && this.fixedPriceQuantity == other.fixedPriceQuantity && this.invoiceGroupingKey == other.invoiceGroupingKey && this.cadence == other.cadence && this.billingCycleConfiguration == other.billingCycleConfiguration && this.invoicingCycleConfiguration == other.invoicingCycleConfiguration && this.conversionRate == other.conversionRate && this.modelType == other.modelType && this.bulkWithProrationConfig == other.bulkWithProrationConfig && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(metadata, externalPriceId, name, billableMetricId, itemId, billedInAdvance, fixedPriceQuantity, invoiceGroupingKey, cadence, billingCycleConfiguration, invoicingCycleConfiguration, conversionRate, modelType, bulkWithProrationConfig, currency, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "NewFloatingBulkWithProrationPrice{metadata=$metadata, externalPriceId=$externalPriceId, name=$name, billableMetricId=$billableMetricId, itemId=$itemId, billedInAdvance=$billedInAdvance, fixedPriceQuantity=$fixedPriceQuantity, invoiceGroupingKey=$invoiceGroupingKey, cadence=$cadence, billingCycleConfiguration=$billingCycleConfiguration, invoicingCycleConfiguration=$invoicingCycleConfiguration, conversionRate=$conversionRate, modelType=$modelType, bulkWithProrationConfig=$bulkWithProrationConfig, currency=$currency, additionalProperties=$additionalProperties}"
    }
}
