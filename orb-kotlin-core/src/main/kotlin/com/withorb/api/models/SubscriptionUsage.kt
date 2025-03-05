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
import com.withorb.api.core.JsonMissing
import com.withorb.api.core.JsonValue
import com.withorb.api.core.NoAutoDetect
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Objects

@JsonDeserialize(using = SubscriptionUsage.Deserializer::class)
@JsonSerialize(using = SubscriptionUsage.Serializer::class)
class SubscriptionUsage
private constructor(
    private val ungrouped: UngroupedSubscriptionUsage? = null,
    private val grouped: GroupedSubscriptionUsage? = null,
    private val _json: JsonValue? = null,
) {

    fun ungrouped(): UngroupedSubscriptionUsage? = ungrouped

    fun grouped(): GroupedSubscriptionUsage? = grouped

    fun isUngrouped(): Boolean = ungrouped != null

    fun isGrouped(): Boolean = grouped != null

    fun asUngrouped(): UngroupedSubscriptionUsage = ungrouped.getOrThrow("ungrouped")

    fun asGrouped(): GroupedSubscriptionUsage = grouped.getOrThrow("grouped")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            ungrouped != null -> visitor.visitUngrouped(ungrouped)
            grouped != null -> visitor.visitGrouped(grouped)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): SubscriptionUsage = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUngrouped(ungrouped: UngroupedSubscriptionUsage) {
                    ungrouped.validate()
                }

                override fun visitGrouped(grouped: GroupedSubscriptionUsage) {
                    grouped.validate()
                }
            }
        )
        validated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUsage && ungrouped == other.ungrouped && grouped == other.grouped /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ungrouped, grouped) /* spotless:on */

    override fun toString(): String =
        when {
            ungrouped != null -> "SubscriptionUsage{ungrouped=$ungrouped}"
            grouped != null -> "SubscriptionUsage{grouped=$grouped}"
            _json != null -> "SubscriptionUsage{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid SubscriptionUsage")
        }

    companion object {

        fun ofUngrouped(ungrouped: UngroupedSubscriptionUsage) =
            SubscriptionUsage(ungrouped = ungrouped)

        fun ofGrouped(grouped: GroupedSubscriptionUsage) = SubscriptionUsage(grouped = grouped)
    }

    /**
     * An interface that defines how to map each variant of [SubscriptionUsage] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        fun visitUngrouped(ungrouped: UngroupedSubscriptionUsage): T

        fun visitGrouped(grouped: GroupedSubscriptionUsage): T

        /**
         * Maps an unknown variant of [SubscriptionUsage] to a value of type [T].
         *
         * An instance of [SubscriptionUsage] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws OrbInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown SubscriptionUsage: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<SubscriptionUsage>(SubscriptionUsage::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): SubscriptionUsage {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<UngroupedSubscriptionUsage>()) { it.validate() }
                ?.let {
                    return SubscriptionUsage(ungrouped = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<GroupedSubscriptionUsage>()) { it.validate() }
                ?.let {
                    return SubscriptionUsage(grouped = it, _json = json)
                }

            return SubscriptionUsage(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<SubscriptionUsage>(SubscriptionUsage::class) {

        override fun serialize(
            value: SubscriptionUsage,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.ungrouped != null -> generator.writeObject(value.ungrouped)
                value.grouped != null -> generator.writeObject(value.grouped)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid SubscriptionUsage")
            }
        }
    }

    @NoAutoDetect
    class UngroupedSubscriptionUsage
    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<Data> = data.getRequired("data")

        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UngroupedSubscriptionUsage = apply {
            if (validated) {
                return@apply
            }

            data().forEach { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [UngroupedSubscriptionUsage].
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UngroupedSubscriptionUsage]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<Data>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ungroupedSubscriptionUsage: UngroupedSubscriptionUsage) = apply {
                data = ungroupedSubscriptionUsage.data.map { it.toMutableList() }
                additionalProperties =
                    ungroupedSubscriptionUsage.additionalProperties.toMutableMap()
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Data>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            fun addData(data: Data) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
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

            fun build(): UngroupedSubscriptionUsage =
                UngroupedSubscriptionUsage(
                    checkRequired("data", data).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Data
        @JsonCreator
        private constructor(
            @JsonProperty("billable_metric")
            @ExcludeMissing
            private val billableMetric: JsonField<BillableMetricSimpleModel> = JsonMissing.of(),
            @JsonProperty("usage")
            @ExcludeMissing
            private val usage: JsonField<List<UsageModel>> = JsonMissing.of(),
            @JsonProperty("view_mode")
            @ExcludeMissing
            private val viewMode: JsonField<ViewMode> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun billableMetric(): BillableMetricSimpleModel =
                billableMetric.getRequired("billable_metric")

            fun usage(): List<UsageModel> = usage.getRequired("usage")

            fun viewMode(): ViewMode = viewMode.getRequired("view_mode")

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun _billableMetric(): JsonField<BillableMetricSimpleModel> = billableMetric

            @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<List<UsageModel>> = usage

            @JsonProperty("view_mode")
            @ExcludeMissing
            fun _viewMode(): JsonField<ViewMode> = viewMode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                billableMetric().validate()
                usage().forEach { it.validate() }
                viewMode()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Data].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .billableMetric()
                 * .usage()
                 * .viewMode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Data]. */
            class Builder internal constructor() {

                private var billableMetric: JsonField<BillableMetricSimpleModel>? = null
                private var usage: JsonField<MutableList<UsageModel>>? = null
                private var viewMode: JsonField<ViewMode>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(data: Data) = apply {
                    billableMetric = data.billableMetric
                    usage = data.usage.map { it.toMutableList() }
                    viewMode = data.viewMode
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun billableMetric(billableMetric: BillableMetricSimpleModel) =
                    billableMetric(JsonField.of(billableMetric))

                fun billableMetric(billableMetric: JsonField<BillableMetricSimpleModel>) = apply {
                    this.billableMetric = billableMetric
                }

                fun usage(usage: List<UsageModel>) = usage(JsonField.of(usage))

                fun usage(usage: JsonField<List<UsageModel>>) = apply {
                    this.usage = usage.map { it.toMutableList() }
                }

                fun addUsage(usage: UsageModel) = apply {
                    this.usage =
                        (this.usage ?: JsonField.of(mutableListOf())).also {
                            checkKnown("usage", it).add(usage)
                        }
                }

                fun viewMode(viewMode: ViewMode) = viewMode(JsonField.of(viewMode))

                fun viewMode(viewMode: JsonField<ViewMode>) = apply { this.viewMode = viewMode }

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

                fun build(): Data =
                    Data(
                        checkRequired("billableMetric", billableMetric),
                        checkRequired("usage", usage).map { it.toImmutable() },
                        checkRequired("viewMode", viewMode),
                        additionalProperties.toImmutable(),
                    )
            }

            class ViewMode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERIODIC = of("periodic")

                    val CUMULATIVE = of("cumulative")

                    fun of(value: String) = ViewMode(JsonField.of(value))
                }

                /** An enum containing [ViewMode]'s known values. */
                enum class Known {
                    PERIODIC,
                    CUMULATIVE,
                }

                /**
                 * An enum containing [ViewMode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ViewMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERIODIC,
                    CUMULATIVE,
                    /**
                     * An enum member indicating that [ViewMode] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERIODIC -> Value.PERIODIC
                        CUMULATIVE -> Value.CUMULATIVE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        PERIODIC -> Known.PERIODIC
                        CUMULATIVE -> Known.CUMULATIVE
                        else -> throw OrbInvalidDataException("Unknown ViewMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ViewMode && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Data && billableMetric == other.billableMetric && usage == other.usage && viewMode == other.viewMode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(billableMetric, usage, viewMode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{billableMetric=$billableMetric, usage=$usage, viewMode=$viewMode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UngroupedSubscriptionUsage && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UngroupedSubscriptionUsage{data=$data, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class GroupedSubscriptionUsage
    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        private val data: JsonField<List<Data>> = JsonMissing.of(),
        @JsonProperty("pagination_metadata")
        @ExcludeMissing
        private val paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun data(): List<Data> = data.getRequired("data")

        fun paginationMetadata(): PaginationMetadata? =
            paginationMetadata.getNullable("pagination_metadata")

        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

        @JsonProperty("pagination_metadata")
        @ExcludeMissing
        fun _paginationMetadata(): JsonField<PaginationMetadata> = paginationMetadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GroupedSubscriptionUsage = apply {
            if (validated) {
                return@apply
            }

            data().forEach { it.validate() }
            paginationMetadata()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [GroupedSubscriptionUsage].
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [GroupedSubscriptionUsage]. */
        class Builder internal constructor() {

            private var data: JsonField<MutableList<Data>>? = null
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(groupedSubscriptionUsage: GroupedSubscriptionUsage) = apply {
                data = groupedSubscriptionUsage.data.map { it.toMutableList() }
                paginationMetadata = groupedSubscriptionUsage.paginationMetadata
                additionalProperties = groupedSubscriptionUsage.additionalProperties.toMutableMap()
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Data>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            fun addData(data: Data) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            fun paginationMetadata(paginationMetadata: PaginationMetadata?) =
                paginationMetadata(JsonField.ofNullable(paginationMetadata))

            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
                this.paginationMetadata = paginationMetadata
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

            fun build(): GroupedSubscriptionUsage =
                GroupedSubscriptionUsage(
                    checkRequired("data", data).map { it.toImmutable() },
                    paginationMetadata,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Data
        @JsonCreator
        private constructor(
            @JsonProperty("billable_metric")
            @ExcludeMissing
            private val billableMetric: JsonField<BillableMetricSimpleModel> = JsonMissing.of(),
            @JsonProperty("metric_group")
            @ExcludeMissing
            private val metricGroup: JsonField<MetricGroup> = JsonMissing.of(),
            @JsonProperty("usage")
            @ExcludeMissing
            private val usage: JsonField<List<UsageModel>> = JsonMissing.of(),
            @JsonProperty("view_mode")
            @ExcludeMissing
            private val viewMode: JsonField<ViewMode> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun billableMetric(): BillableMetricSimpleModel =
                billableMetric.getRequired("billable_metric")

            fun metricGroup(): MetricGroup = metricGroup.getRequired("metric_group")

            fun usage(): List<UsageModel> = usage.getRequired("usage")

            fun viewMode(): ViewMode = viewMode.getRequired("view_mode")

            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun _billableMetric(): JsonField<BillableMetricSimpleModel> = billableMetric

            @JsonProperty("metric_group")
            @ExcludeMissing
            fun _metricGroup(): JsonField<MetricGroup> = metricGroup

            @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<List<UsageModel>> = usage

            @JsonProperty("view_mode")
            @ExcludeMissing
            fun _viewMode(): JsonField<ViewMode> = viewMode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Data = apply {
                if (validated) {
                    return@apply
                }

                billableMetric().validate()
                metricGroup().validate()
                usage().forEach { it.validate() }
                viewMode()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Data].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .billableMetric()
                 * .metricGroup()
                 * .usage()
                 * .viewMode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Data]. */
            class Builder internal constructor() {

                private var billableMetric: JsonField<BillableMetricSimpleModel>? = null
                private var metricGroup: JsonField<MetricGroup>? = null
                private var usage: JsonField<MutableList<UsageModel>>? = null
                private var viewMode: JsonField<ViewMode>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(data: Data) = apply {
                    billableMetric = data.billableMetric
                    metricGroup = data.metricGroup
                    usage = data.usage.map { it.toMutableList() }
                    viewMode = data.viewMode
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun billableMetric(billableMetric: BillableMetricSimpleModel) =
                    billableMetric(JsonField.of(billableMetric))

                fun billableMetric(billableMetric: JsonField<BillableMetricSimpleModel>) = apply {
                    this.billableMetric = billableMetric
                }

                fun metricGroup(metricGroup: MetricGroup) = metricGroup(JsonField.of(metricGroup))

                fun metricGroup(metricGroup: JsonField<MetricGroup>) = apply {
                    this.metricGroup = metricGroup
                }

                fun usage(usage: List<UsageModel>) = usage(JsonField.of(usage))

                fun usage(usage: JsonField<List<UsageModel>>) = apply {
                    this.usage = usage.map { it.toMutableList() }
                }

                fun addUsage(usage: UsageModel) = apply {
                    this.usage =
                        (this.usage ?: JsonField.of(mutableListOf())).also {
                            checkKnown("usage", it).add(usage)
                        }
                }

                fun viewMode(viewMode: ViewMode) = viewMode(JsonField.of(viewMode))

                fun viewMode(viewMode: JsonField<ViewMode>) = apply { this.viewMode = viewMode }

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

                fun build(): Data =
                    Data(
                        checkRequired("billableMetric", billableMetric),
                        checkRequired("metricGroup", metricGroup),
                        checkRequired("usage", usage).map { it.toImmutable() },
                        checkRequired("viewMode", viewMode),
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class MetricGroup
            @JsonCreator
            private constructor(
                @JsonProperty("property_key")
                @ExcludeMissing
                private val propertyKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("property_value")
                @ExcludeMissing
                private val propertyValue: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun propertyKey(): String = propertyKey.getRequired("property_key")

                fun propertyValue(): String = propertyValue.getRequired("property_value")

                @JsonProperty("property_key")
                @ExcludeMissing
                fun _propertyKey(): JsonField<String> = propertyKey

                @JsonProperty("property_value")
                @ExcludeMissing
                fun _propertyValue(): JsonField<String> = propertyValue

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MetricGroup = apply {
                    if (validated) {
                        return@apply
                    }

                    propertyKey()
                    propertyValue()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [MetricGroup].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .propertyKey()
                     * .propertyValue()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [MetricGroup]. */
                class Builder internal constructor() {

                    private var propertyKey: JsonField<String>? = null
                    private var propertyValue: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(metricGroup: MetricGroup) = apply {
                        propertyKey = metricGroup.propertyKey
                        propertyValue = metricGroup.propertyValue
                        additionalProperties = metricGroup.additionalProperties.toMutableMap()
                    }

                    fun propertyKey(propertyKey: String) = propertyKey(JsonField.of(propertyKey))

                    fun propertyKey(propertyKey: JsonField<String>) = apply {
                        this.propertyKey = propertyKey
                    }

                    fun propertyValue(propertyValue: String) =
                        propertyValue(JsonField.of(propertyValue))

                    fun propertyValue(propertyValue: JsonField<String>) = apply {
                        this.propertyValue = propertyValue
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

                    fun build(): MetricGroup =
                        MetricGroup(
                            checkRequired("propertyKey", propertyKey),
                            checkRequired("propertyValue", propertyValue),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MetricGroup && propertyKey == other.propertyKey && propertyValue == other.propertyValue && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(propertyKey, propertyValue, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MetricGroup{propertyKey=$propertyKey, propertyValue=$propertyValue, additionalProperties=$additionalProperties}"
            }

            class ViewMode @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERIODIC = of("periodic")

                    val CUMULATIVE = of("cumulative")

                    fun of(value: String) = ViewMode(JsonField.of(value))
                }

                /** An enum containing [ViewMode]'s known values. */
                enum class Known {
                    PERIODIC,
                    CUMULATIVE,
                }

                /**
                 * An enum containing [ViewMode]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [ViewMode] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PERIODIC,
                    CUMULATIVE,
                    /**
                     * An enum member indicating that [ViewMode] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PERIODIC -> Value.PERIODIC
                        CUMULATIVE -> Value.CUMULATIVE
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws OrbInvalidDataException if this class instance's value is a not a known
                 *   member.
                 */
                fun known(): Known =
                    when (this) {
                        PERIODIC -> Known.PERIODIC
                        CUMULATIVE -> Known.CUMULATIVE
                        else -> throw OrbInvalidDataException("Unknown ViewMode: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws OrbInvalidDataException if this class instance's value does not have the
                 *   expected primitive type.
                 */
                fun asString(): String =
                    _value().asString() ?: throw OrbInvalidDataException("Value is not a String")

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ViewMode && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Data && billableMetric == other.billableMetric && metricGroup == other.metricGroup && usage == other.usage && viewMode == other.viewMode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(billableMetric, metricGroup, usage, viewMode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{billableMetric=$billableMetric, metricGroup=$metricGroup, usage=$usage, viewMode=$viewMode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupedSubscriptionUsage && data == other.data && paginationMetadata == other.paginationMetadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(data, paginationMetadata, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GroupedSubscriptionUsage{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"
    }
}
