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
import com.withorb.api.core.toUnmodifiable
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

        return /* spotless:off */ other is SubscriptionUsage && this.ungroupedSubscriptionUsage == other.ungroupedSubscriptionUsage && this.groupedSubscriptionUsage == other.groupedSubscriptionUsage /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(ungroupedSubscriptionUsage, groupedSubscriptionUsage) /* spotless:on */
    }

    override fun toString(): String {
        return when {
            ungroupedSubscriptionUsage != null ->
                "SubscriptionUsage{ungroupedSubscriptionUsage=$ungroupedSubscriptionUsage}"
            groupedSubscriptionUsage != null ->
                "SubscriptionUsage{groupedSubscriptionUsage=$groupedSubscriptionUsage}"
            _json != null -> "SubscriptionUsage{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid SubscriptionUsage")
        }
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

    @JsonDeserialize(builder = UngroupedSubscriptionUsage.Builder::class)
    @NoAutoDetect
    class UngroupedSubscriptionUsage
    private constructor(
        private val data: JsonField<List<Data>>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun data(): List<Data> = data.getRequired("data")

        @JsonProperty("data") @ExcludeMissing fun _data() = data

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                this.data = ungroupedSubscriptionUsage.data
                additionalProperties(ungroupedSubscriptionUsage.additionalProperties)
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            @JsonProperty("data")
            @ExcludeMissing
            fun data(data: JsonField<List<Data>>) = apply { this.data = data }

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

            fun build(): UngroupedSubscriptionUsage =
                UngroupedSubscriptionUsage(
                    data.map { it.toUnmodifiable() },
                    additionalProperties.toUnmodifiable()
                )
        }

        @JsonDeserialize(builder = Data.Builder::class)
        @NoAutoDetect
        class Data
        private constructor(
            private val usage: JsonField<List<Usage>>,
            private val billableMetric: JsonField<BillableMetric>,
            private val viewMode: JsonField<ViewMode>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun usage(): List<Usage> = usage.getRequired("usage")

            fun billableMetric(): BillableMetric = billableMetric.getRequired("billable_metric")

            fun viewMode(): ViewMode = viewMode.getRequired("view_mode")

            @JsonProperty("usage") @ExcludeMissing fun _usage() = usage

            @JsonProperty("billable_metric") @ExcludeMissing fun _billableMetric() = billableMetric

            @JsonProperty("view_mode") @ExcludeMissing fun _viewMode() = viewMode

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                    this.usage = data.usage
                    this.billableMetric = data.billableMetric
                    this.viewMode = data.viewMode
                    additionalProperties(data.additionalProperties)
                }

                fun usage(usage: List<Usage>) = usage(JsonField.of(usage))

                @JsonProperty("usage")
                @ExcludeMissing
                fun usage(usage: JsonField<List<Usage>>) = apply { this.usage = usage }

                fun billableMetric(billableMetric: BillableMetric) =
                    billableMetric(JsonField.of(billableMetric))

                @JsonProperty("billable_metric")
                @ExcludeMissing
                fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                    this.billableMetric = billableMetric
                }

                fun viewMode(viewMode: ViewMode) = viewMode(JsonField.of(viewMode))

                @JsonProperty("view_mode")
                @ExcludeMissing
                fun viewMode(viewMode: JsonField<ViewMode>) = apply { this.viewMode = viewMode }

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

                fun build(): Data =
                    Data(
                        usage.map { it.toUnmodifiable() },
                        billableMetric,
                        viewMode,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BillableMetric.Builder::class)
            @NoAutoDetect
            class BillableMetric
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                        this.id = billableMetric.id
                        this.name = billableMetric.name
                        additionalProperties(billableMetric.additionalProperties)
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): BillableMetric =
                        BillableMetric(
                            id,
                            name,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillableMetric && this.id == other.id && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(id, name, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "BillableMetric{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = Usage.Builder::class)
            @NoAutoDetect
            class Usage
            private constructor(
                private val quantity: JsonField<Double>,
                private val timeframeStart: JsonField<OffsetDateTime>,
                private val timeframeEnd: JsonField<OffsetDateTime>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

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
                        this.quantity = usage.quantity
                        this.timeframeStart = usage.timeframeStart
                        this.timeframeEnd = usage.timeframeEnd
                        additionalProperties(usage.additionalProperties)
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun timeframeStart(timeframeStart: OffsetDateTime) =
                        timeframeStart(JsonField.of(timeframeStart))

                    @JsonProperty("timeframe_start")
                    @ExcludeMissing
                    fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                        this.timeframeStart = timeframeStart
                    }

                    fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                        timeframeEnd(JsonField.of(timeframeEnd))

                    @JsonProperty("timeframe_end")
                    @ExcludeMissing
                    fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                        this.timeframeEnd = timeframeEnd
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

                    fun build(): Usage =
                        Usage(
                            quantity,
                            timeframeStart,
                            timeframeEnd,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Usage && this.quantity == other.quantity && this.timeframeStart == other.timeframeStart && this.timeframeEnd == other.timeframeEnd && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(quantity, timeframeStart, timeframeEnd, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Usage{quantity=$quantity, timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, additionalProperties=$additionalProperties}"
            }

            class ViewMode
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ViewMode && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val PERIODIC = ViewMode(JsonField.of("periodic"))

                    val CUMULATIVE = ViewMode(JsonField.of("cumulative"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Data && this.usage == other.usage && this.billableMetric == other.billableMetric && this.viewMode == other.viewMode && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(usage, billableMetric, viewMode, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Data{usage=$usage, billableMetric=$billableMetric, viewMode=$viewMode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UngroupedSubscriptionUsage && this.data == other.data && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(data, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "UngroupedSubscriptionUsage{data=$data, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = GroupedSubscriptionUsage.Builder::class)
    @NoAutoDetect
    class GroupedSubscriptionUsage
    private constructor(
        private val data: JsonField<List<Data>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                this.data = groupedSubscriptionUsage.data
                this.paginationMetadata = groupedSubscriptionUsage.paginationMetadata
                additionalProperties(groupedSubscriptionUsage.additionalProperties)
            }

            fun data(data: List<Data>) = data(JsonField.of(data))

            @JsonProperty("data")
            @ExcludeMissing
            fun data(data: JsonField<List<Data>>) = apply { this.data = data }

            fun paginationMetadata(paginationMetadata: PaginationMetadata) =
                paginationMetadata(JsonField.of(paginationMetadata))

            @JsonProperty("pagination_metadata")
            @ExcludeMissing
            fun paginationMetadata(paginationMetadata: JsonField<PaginationMetadata>) = apply {
                this.paginationMetadata = paginationMetadata
            }

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

            fun build(): GroupedSubscriptionUsage =
                GroupedSubscriptionUsage(
                    data.map { it.toUnmodifiable() },
                    paginationMetadata,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = Data.Builder::class)
        @NoAutoDetect
        class Data
        private constructor(
            private val usage: JsonField<List<Usage>>,
            private val billableMetric: JsonField<BillableMetric>,
            private val metricGroup: JsonField<MetricGroup>,
            private val viewMode: JsonField<ViewMode>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

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
                    this.usage = data.usage
                    this.billableMetric = data.billableMetric
                    this.metricGroup = data.metricGroup
                    this.viewMode = data.viewMode
                    additionalProperties(data.additionalProperties)
                }

                fun usage(usage: List<Usage>) = usage(JsonField.of(usage))

                @JsonProperty("usage")
                @ExcludeMissing
                fun usage(usage: JsonField<List<Usage>>) = apply { this.usage = usage }

                fun billableMetric(billableMetric: BillableMetric) =
                    billableMetric(JsonField.of(billableMetric))

                @JsonProperty("billable_metric")
                @ExcludeMissing
                fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                    this.billableMetric = billableMetric
                }

                fun metricGroup(metricGroup: MetricGroup) = metricGroup(JsonField.of(metricGroup))

                @JsonProperty("metric_group")
                @ExcludeMissing
                fun metricGroup(metricGroup: JsonField<MetricGroup>) = apply {
                    this.metricGroup = metricGroup
                }

                fun viewMode(viewMode: ViewMode) = viewMode(JsonField.of(viewMode))

                @JsonProperty("view_mode")
                @ExcludeMissing
                fun viewMode(viewMode: JsonField<ViewMode>) = apply { this.viewMode = viewMode }

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

                fun build(): Data =
                    Data(
                        usage.map { it.toUnmodifiable() },
                        billableMetric,
                        metricGroup,
                        viewMode,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = BillableMetric.Builder::class)
            @NoAutoDetect
            class BillableMetric
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id() = id

                @JsonProperty("name") @ExcludeMissing fun _name() = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                        this.id = billableMetric.id
                        this.name = billableMetric.name
                        additionalProperties(billableMetric.additionalProperties)
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    @JsonProperty("id")
                    @ExcludeMissing
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    @JsonProperty("name")
                    @ExcludeMissing
                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): BillableMetric =
                        BillableMetric(
                            id,
                            name,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillableMetric && this.id == other.id && this.name == other.name && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(id, name, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "BillableMetric{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = MetricGroup.Builder::class)
            @NoAutoDetect
            class MetricGroup
            private constructor(
                private val propertyKey: JsonField<String>,
                private val propertyValue: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun propertyKey(): String = propertyKey.getRequired("property_key")

                fun propertyValue(): String = propertyValue.getRequired("property_value")

                @JsonProperty("property_key") @ExcludeMissing fun _propertyKey() = propertyKey

                @JsonProperty("property_value") @ExcludeMissing fun _propertyValue() = propertyValue

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                        this.propertyKey = metricGroup.propertyKey
                        this.propertyValue = metricGroup.propertyValue
                        additionalProperties(metricGroup.additionalProperties)
                    }

                    fun propertyKey(propertyKey: String) = propertyKey(JsonField.of(propertyKey))

                    @JsonProperty("property_key")
                    @ExcludeMissing
                    fun propertyKey(propertyKey: JsonField<String>) = apply {
                        this.propertyKey = propertyKey
                    }

                    fun propertyValue(propertyValue: String) =
                        propertyValue(JsonField.of(propertyValue))

                    @JsonProperty("property_value")
                    @ExcludeMissing
                    fun propertyValue(propertyValue: JsonField<String>) = apply {
                        this.propertyValue = propertyValue
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

                    fun build(): MetricGroup =
                        MetricGroup(
                            propertyKey,
                            propertyValue,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MetricGroup && this.propertyKey == other.propertyKey && this.propertyValue == other.propertyValue && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(propertyKey, propertyValue, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "MetricGroup{propertyKey=$propertyKey, propertyValue=$propertyValue, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = Usage.Builder::class)
            @NoAutoDetect
            class Usage
            private constructor(
                private val quantity: JsonField<Double>,
                private val timeframeStart: JsonField<OffsetDateTime>,
                private val timeframeEnd: JsonField<OffsetDateTime>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

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
                        this.quantity = usage.quantity
                        this.timeframeStart = usage.timeframeStart
                        this.timeframeEnd = usage.timeframeEnd
                        additionalProperties(usage.additionalProperties)
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun timeframeStart(timeframeStart: OffsetDateTime) =
                        timeframeStart(JsonField.of(timeframeStart))

                    @JsonProperty("timeframe_start")
                    @ExcludeMissing
                    fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                        this.timeframeStart = timeframeStart
                    }

                    fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                        timeframeEnd(JsonField.of(timeframeEnd))

                    @JsonProperty("timeframe_end")
                    @ExcludeMissing
                    fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                        this.timeframeEnd = timeframeEnd
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

                    fun build(): Usage =
                        Usage(
                            quantity,
                            timeframeStart,
                            timeframeEnd,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Usage && this.quantity == other.quantity && this.timeframeStart == other.timeframeStart && this.timeframeEnd == other.timeframeEnd && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(quantity, timeframeStart, timeframeEnd, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Usage{quantity=$quantity, timeframeStart=$timeframeStart, timeframeEnd=$timeframeEnd, additionalProperties=$additionalProperties}"
            }

            class ViewMode
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ViewMode && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val PERIODIC = ViewMode(JsonField.of("periodic"))

                    val CUMULATIVE = ViewMode(JsonField.of("cumulative"))

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
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Data && this.usage == other.usage && this.billableMetric == other.billableMetric && this.metricGroup == other.metricGroup && this.viewMode == other.viewMode && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(usage, billableMetric, metricGroup, viewMode, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Data{usage=$usage, billableMetric=$billableMetric, metricGroup=$metricGroup, viewMode=$viewMode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupedSubscriptionUsage && this.data == other.data && this.paginationMetadata == other.paginationMetadata && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(data, paginationMetadata, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "GroupedSubscriptionUsage{data=$data, paginationMetadata=$paginationMetadata, additionalProperties=$additionalProperties}"
    }
}
