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
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.immutableEmptyMap
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

@JsonDeserialize(using = SubscriptionUsage.Deserializer::class)
@JsonSerialize(using = SubscriptionUsage.Serializer::class)
class SubscriptionUsage
private constructor(
    private val ungroupedSubscriptionUsage: UngroupedSubscriptionUsage? = null,
    private val groupedSubscriptionUsage: GroupedSubscriptionUsage? = null,
    private val _json: JsonValue? = null,
) {

    private var validated: Boolean = false

    fun ungroupedSubscriptionUsage(): UngroupedSubscriptionUsage? = ungroupedSubscriptionUsage

    fun groupedSubscriptionUsage(): GroupedSubscriptionUsage? = groupedSubscriptionUsage

    fun isUngroupedSubscriptionUsage(): Boolean = ungroupedSubscriptionUsage != null

    fun isGroupedSubscriptionUsage(): Boolean = groupedSubscriptionUsage != null

    fun asUngroupedSubscriptionUsage(): UngroupedSubscriptionUsage =
        ungroupedSubscriptionUsage.getOrThrow("ungroupedSubscriptionUsage")

    fun asGroupedSubscriptionUsage(): GroupedSubscriptionUsage =
        groupedSubscriptionUsage.getOrThrow("groupedSubscriptionUsage")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            ungroupedSubscriptionUsage != null ->
                visitor.visitUngroupedSubscriptionUsage(ungroupedSubscriptionUsage)
            groupedSubscriptionUsage != null ->
                visitor.visitGroupedSubscriptionUsage(groupedSubscriptionUsage)
            else -> visitor.unknown(_json)
        }
    }

    fun validate(): SubscriptionUsage = apply {
        if (!validated) {
            if (ungroupedSubscriptionUsage == null && groupedSubscriptionUsage == null) {
                throw OrbInvalidDataException("Unknown SubscriptionUsage: $_json")
            }
            ungroupedSubscriptionUsage?.validate()
            groupedSubscriptionUsage?.validate()
            validated = true
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionUsage && ungroupedSubscriptionUsage == other.ungroupedSubscriptionUsage && groupedSubscriptionUsage == other.groupedSubscriptionUsage /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(ungroupedSubscriptionUsage, groupedSubscriptionUsage) /* spotless:on */

    override fun toString(): String =
        when {
            ungroupedSubscriptionUsage != null ->
                "SubscriptionUsage{ungroupedSubscriptionUsage=$ungroupedSubscriptionUsage}"
            groupedSubscriptionUsage != null ->
                "SubscriptionUsage{groupedSubscriptionUsage=$groupedSubscriptionUsage}"
            _json != null -> "SubscriptionUsage{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid SubscriptionUsage")
        }

    companion object {

        fun ofUngroupedSubscriptionUsage(ungroupedSubscriptionUsage: UngroupedSubscriptionUsage) =
            SubscriptionUsage(ungroupedSubscriptionUsage = ungroupedSubscriptionUsage)

        fun ofGroupedSubscriptionUsage(groupedSubscriptionUsage: GroupedSubscriptionUsage) =
            SubscriptionUsage(groupedSubscriptionUsage = groupedSubscriptionUsage)
    }

    interface Visitor<out T> {

        fun visitUngroupedSubscriptionUsage(
            ungroupedSubscriptionUsage: UngroupedSubscriptionUsage
        ): T

        fun visitGroupedSubscriptionUsage(groupedSubscriptionUsage: GroupedSubscriptionUsage): T

        fun unknown(json: JsonValue?): T {
            throw OrbInvalidDataException("Unknown SubscriptionUsage: $json")
        }
    }

    class Deserializer : BaseDeserializer<SubscriptionUsage>(SubscriptionUsage::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): SubscriptionUsage {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<UngroupedSubscriptionUsage>()) { it.validate() }
                ?.let {
                    return SubscriptionUsage(ungroupedSubscriptionUsage = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<GroupedSubscriptionUsage>()) { it.validate() }
                ?.let {
                    return SubscriptionUsage(groupedSubscriptionUsage = it, _json = json)
                }

            return SubscriptionUsage(_json = json)
        }
    }

    class Serializer : BaseSerializer<SubscriptionUsage>(SubscriptionUsage::class) {

        override fun serialize(
            value: SubscriptionUsage,
            generator: JsonGenerator,
            provider: SerializerProvider
        ) {
            when {
                value.ungroupedSubscriptionUsage != null ->
                    generator.writeObject(value.ungroupedSubscriptionUsage)
                value.groupedSubscriptionUsage != null ->
                    generator.writeObject(value.groupedSubscriptionUsage)
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

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): UngroupedSubscriptionUsage = apply {
            if (!validated) {
                data().forEach { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Data>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ungroupedSubscriptionUsage: UngroupedSubscriptionUsage) = apply {
                data = ungroupedSubscriptionUsage.data
                additionalProperties =
                    ungroupedSubscriptionUsage.additionalProperties.toMutableMap()
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Data>>) = apply { this.data = data }

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
                    data.map { it.toImmutable() },
                    additionalProperties.toImmutable()
                )
        }

        @NoAutoDetect
        class Data
        @JsonCreator
        private constructor(
            @JsonProperty("usage")
            @ExcludeMissing
            private val usage: JsonField<List<Usage>> = JsonMissing.of(),
            @JsonProperty("billable_metric")
            @ExcludeMissing
            private val billableMetric: JsonField<BillableMetric> = JsonMissing.of(),
            @JsonProperty("view_mode")
            @ExcludeMissing
            private val viewMode: JsonField<ViewMode> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun usage(): List<Usage> = usage.getRequired("usage")

            fun billableMetric(): BillableMetric = billableMetric.getRequired("billable_metric")

            fun viewMode(): ViewMode = viewMode.getRequired("view_mode")

            @JsonProperty("usage") @ExcludeMissing fun _usage() = usage

            @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

            @JsonProperty("view_mode") @ExcludeMissing fun _viewMode() = viewMode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Data = apply {
                if (!validated) {
                    usage().forEach { it.validate() }
                    billableMetric().validate()
                    viewMode()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var usage: JsonField<List<Usage>> = JsonMissing.of()
                private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
                private var viewMode: JsonField<ViewMode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(data: Data) = apply {
                    usage = data.usage
                    billableMetric = data.billableMetric
                    viewMode = data.viewMode
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun usage(usage: List<Usage>) = usage(JsonField.of(usage))

                fun usage(usage: JsonField<List<Usage>>) = apply { this.usage = usage }

                fun billableMetric(billableMetric: BillableMetric) =
                    billableMetric(JsonField.of(billableMetric))

                fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                    this.billableMetric = billableMetric
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
                        usage.map { it.toImmutable() },
                        billableMetric,
                        viewMode,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class BillableMetric
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): BillableMetric = apply {
                    if (!validated) {
                        id()
                        name()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(billableMetric: BillableMetric) = apply {
                        id = billableMetric.id
                        name = billableMetric.name
                        additionalProperties = billableMetric.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): BillableMetric =
                        BillableMetric(
                            id,
                            name,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillableMetric && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BillableMetric{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Usage
            @JsonCreator
            private constructor(
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timeframe_start")
                @ExcludeMissing
                private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("timeframe_end")
                @ExcludeMissing
                private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun quantity(): Double = quantity.getRequired("quantity")

                fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

                fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

                @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

                @JsonProperty("timeframe_start")
                @ExcludeMissing
                fun _timeframeStart() = timeframeStart

                @JsonProperty("timeframe_end") @ExcludeMissing fun _timeframeEnd() = timeframeEnd

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Usage = apply {
                    if (!validated) {
                        quantity()
                        timeframeStart()
                        timeframeEnd()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usage: Usage) = apply {
                        quantity = usage.quantity
                        timeframeStart = usage.timeframeStart
                        timeframeEnd = usage.timeframeEnd
                        additionalProperties = usage.additionalProperties.toMutableMap()
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun timeframeStart(timeframeStart: OffsetDateTime) =
                        timeframeStart(JsonField.of(timeframeStart))

                    fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                        this.timeframeStart = timeframeStart
                    }

                    fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                        timeframeEnd(JsonField.of(timeframeEnd))

                    fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                        this.timeframeEnd = timeframeEnd
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

                    fun build(): Usage =
                        Usage(
                            quantity,
                            timeframeStart,
                            timeframeEnd,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Usage && quantity == other.quantity && timeframeStart == other.timeframeStart && timeframeEnd == other.timeframeEnd && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(quantity, timeframeStart, timeframeEnd, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Usage{quantity=$quantity, timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, additionalProperties=$additionalProperties}"
            }

            class ViewMode
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERIODIC = of("periodic")

                    val CUMULATIVE = of("cumulative")

                    fun of(value: String) = ViewMode(JsonField.of(value))
                }

                enum class Known {
                    PERIODIC,
                    CUMULATIVE,
                }

                enum class Value {
                    PERIODIC,
                    CUMULATIVE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PERIODIC -> Value.PERIODIC
                        CUMULATIVE -> Value.CUMULATIVE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PERIODIC -> Known.PERIODIC
                        CUMULATIVE -> Known.CUMULATIVE
                        else -> throw OrbInvalidDataException("Unknown ViewMode: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is Data && usage == other.usage && billableMetric == other.billableMetric && viewMode == other.viewMode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(usage, billableMetric, viewMode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{usage=$usage, billableMetric=$billableMetric, viewMode=$viewMode, additionalProperties=$additionalProperties}"
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

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonProperty("pagination_metadata")
        @ExcludeMissing
        fun _paginationMetadata() = paginationMetadata

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GroupedSubscriptionUsage = apply {
            if (!validated) {
                data().forEach { it.validate() }
                paginationMetadata()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var data: JsonField<List<Data>> = JsonMissing.of()
            private var paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(groupedSubscriptionUsage: GroupedSubscriptionUsage) = apply {
                data = groupedSubscriptionUsage.data
                paginationMetadata = groupedSubscriptionUsage.paginationMetadata
                additionalProperties = groupedSubscriptionUsage.additionalProperties.toMutableMap()
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            fun data(data: JsonField<List<Data>>) = apply { this.data = data }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) =
                paginationMetadata(JsonField.of(paginationMetadata))

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
                    data.map { it.toImmutable() },
                    paginationMetadata,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Data
        @JsonCreator
        private constructor(
            @JsonProperty("usage")
            @ExcludeMissing
            private val usage: JsonField<List<Usage>> = JsonMissing.of(),
            @JsonProperty("billable_metric")
            @ExcludeMissing
            private val billableMetric: JsonField<BillableMetric> = JsonMissing.of(),
            @JsonProperty("metric_group")
            @ExcludeMissing
            private val metricGroup: JsonField<MetricGroup> = JsonMissing.of(),
            @JsonProperty("view_mode")
            @ExcludeMissing
            private val viewMode: JsonField<ViewMode> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun usage(): List<Usage> = usage.getRequired("usage")

            fun billableMetric(): BillableMetric = billableMetric.getRequired("billable_metric")

            fun metricGroup(): MetricGroup = metricGroup.getRequired("metric_group")

            fun viewMode(): ViewMode = viewMode.getRequired("view_mode")

            @JsonProperty("usage") @ExcludeMissing fun _usage() = usage

            @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

            @JsonProperty("metric_group") @ExcludeMissing fun _metricGroup() = metricGroup

            @JsonProperty("view_mode") @ExcludeMissing fun _viewMode() = viewMode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Data = apply {
                if (!validated) {
                    usage().forEach { it.validate() }
                    billableMetric().validate()
                    metricGroup().validate()
                    viewMode()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var usage: JsonField<List<Usage>> = JsonMissing.of()
                private var billableMetric: JsonField<BillableMetric> = JsonMissing.of()
                private var metricGroup: JsonField<MetricGroup> = JsonMissing.of()
                private var viewMode: JsonField<ViewMode> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(data: Data) = apply {
                    usage = data.usage
                    billableMetric = data.billableMetric
                    metricGroup = data.metricGroup
                    viewMode = data.viewMode
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun usage(usage: List<Usage>) = usage(JsonField.of(usage))

                fun usage(usage: JsonField<List<Usage>>) = apply { this.usage = usage }

                fun billableMetric(billableMetric: BillableMetric) =
                    billableMetric(JsonField.of(billableMetric))

                fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                    this.billableMetric = billableMetric
                }

                fun metricGroup(metricGroup: MetricGroup) = metricGroup(JsonField.of(metricGroup))

                fun metricGroup(metricGroup: JsonField<MetricGroup>) = apply {
                    this.metricGroup = metricGroup
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
                        usage.map { it.toImmutable() },
                        billableMetric,
                        metricGroup,
                        viewMode,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class BillableMetric
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): BillableMetric = apply {
                    if (!validated) {
                        id()
                        name()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var id: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(billableMetric: BillableMetric) = apply {
                        id = billableMetric.id
                        name = billableMetric.name
                        additionalProperties = billableMetric.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): BillableMetric =
                        BillableMetric(
                            id,
                            name,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillableMetric && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BillableMetric{id=$id, name=$name, additionalProperties=$additionalProperties}"
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

                @JsonProperty("property_key") @ExcludeMissing fun _propertyKey() = propertyKey

                @JsonProperty("property_value") @ExcludeMissing fun _propertyValue() = propertyValue

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): MetricGroup = apply {
                    if (!validated) {
                        propertyKey()
                        propertyValue()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var propertyKey: JsonField<String> = JsonMissing.of()
                    private var propertyValue: JsonField<String> = JsonMissing.of()
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
                            propertyKey,
                            propertyValue,
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

            @NoAutoDetect
            class Usage
            @JsonCreator
            private constructor(
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("timeframe_start")
                @ExcludeMissing
                private val timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("timeframe_end")
                @ExcludeMissing
                private val timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun quantity(): Double = quantity.getRequired("quantity")

                fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

                fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

                @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

                @JsonProperty("timeframe_start")
                @ExcludeMissing
                fun _timeframeStart() = timeframeStart

                @JsonProperty("timeframe_end") @ExcludeMissing fun _timeframeEnd() = timeframeEnd

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Usage = apply {
                    if (!validated) {
                        quantity()
                        timeframeStart()
                        timeframeEnd()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usage: Usage) = apply {
                        quantity = usage.quantity
                        timeframeStart = usage.timeframeStart
                        timeframeEnd = usage.timeframeEnd
                        additionalProperties = usage.additionalProperties.toMutableMap()
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun timeframeStart(timeframeStart: OffsetDateTime) =
                        timeframeStart(JsonField.of(timeframeStart))

                    fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                        this.timeframeStart = timeframeStart
                    }

                    fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                        timeframeEnd(JsonField.of(timeframeEnd))

                    fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                        this.timeframeEnd = timeframeEnd
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

                    fun build(): Usage =
                        Usage(
                            quantity,
                            timeframeStart,
                            timeframeEnd,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Usage && quantity == other.quantity && timeframeStart == other.timeframeStart && timeframeEnd == other.timeframeEnd && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(quantity, timeframeStart, timeframeEnd, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Usage{quantity=$quantity, timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, additionalProperties=$additionalProperties}"
            }

            class ViewMode
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PERIODIC = of("periodic")

                    val CUMULATIVE = of("cumulative")

                    fun of(value: String) = ViewMode(JsonField.of(value))
                }

                enum class Known {
                    PERIODIC,
                    CUMULATIVE,
                }

                enum class Value {
                    PERIODIC,
                    CUMULATIVE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PERIODIC -> Value.PERIODIC
                        CUMULATIVE -> Value.CUMULATIVE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PERIODIC -> Known.PERIODIC
                        CUMULATIVE -> Known.CUMULATIVE
                        else -> throw OrbInvalidDataException("Unknown ViewMode: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

                return /* spotless:off */ other is Data && usage == other.usage && billableMetric == other.billableMetric && metricGroup == other.metricGroup && viewMode == other.viewMode && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(usage, billableMetric, metricGroup, viewMode, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Data{usage=$usage, billableMetric=$billableMetric, metricGroup=$metricGroup, viewMode=$viewMode, additionalProperties=$additionalProperties}"
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
