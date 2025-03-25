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
import com.withorb.api.core.checkKnown
import com.withorb.api.core.checkRequired
import com.withorb.api.core.getOrThrow
import com.withorb.api.core.toImmutable
import com.withorb.api.errors.OrbInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
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

    class UngroupedSubscriptionUsage
    private constructor(
        private val data: JsonField<List<Data>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
        ) : this(data, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): List<Data> = data.getRequired("data")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<Data>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<Data>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [Data] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
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

            /**
             * Returns an immutable instance of [UngroupedSubscriptionUsage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UngroupedSubscriptionUsage =
                UngroupedSubscriptionUsage(
                    checkRequired("data", data).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UngroupedSubscriptionUsage = apply {
            if (validated) {
                return@apply
            }

            data().forEach { it.validate() }
            validated = true
        }

        class Data
        private constructor(
            private val billableMetric: JsonField<BillableMetric>,
            private val usage: JsonField<List<Usage>>,
            private val viewMode: JsonField<ViewMode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billable_metric")
                @ExcludeMissing
                billableMetric: JsonField<BillableMetric> = JsonMissing.of(),
                @JsonProperty("usage")
                @ExcludeMissing
                usage: JsonField<List<Usage>> = JsonMissing.of(),
                @JsonProperty("view_mode")
                @ExcludeMissing
                viewMode: JsonField<ViewMode> = JsonMissing.of(),
            ) : this(billableMetric, usage, viewMode, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billableMetric(): BillableMetric = billableMetric.getRequired("billable_metric")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usage(): List<Usage> = usage.getRequired("usage")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun viewMode(): ViewMode = viewMode.getRequired("view_mode")

            /**
             * Returns the raw JSON value of [billableMetric].
             *
             * Unlike [billableMetric], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun _billableMetric(): JsonField<BillableMetric> = billableMetric

            /**
             * Returns the raw JSON value of [usage].
             *
             * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<List<Usage>> = usage

            /**
             * Returns the raw JSON value of [viewMode].
             *
             * Unlike [viewMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("view_mode")
            @ExcludeMissing
            fun _viewMode(): JsonField<ViewMode> = viewMode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                private var billableMetric: JsonField<BillableMetric>? = null
                private var usage: JsonField<MutableList<Usage>>? = null
                private var viewMode: JsonField<ViewMode>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(data: Data) = apply {
                    billableMetric = data.billableMetric
                    usage = data.usage.map { it.toMutableList() }
                    viewMode = data.viewMode
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun billableMetric(billableMetric: BillableMetric) =
                    billableMetric(JsonField.of(billableMetric))

                /**
                 * Sets [Builder.billableMetric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetric] with a well-typed
                 * [BillableMetric] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                    this.billableMetric = billableMetric
                }

                fun usage(usage: List<Usage>) = usage(JsonField.of(usage))

                /**
                 * Sets [Builder.usage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usage] with a well-typed `List<Usage>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usage(usage: JsonField<List<Usage>>) = apply {
                    this.usage = usage.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Usage] to [Builder.usage].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addUsage(usage: Usage) = apply {
                    this.usage =
                        (this.usage ?: JsonField.of(mutableListOf())).also {
                            checkKnown("usage", it).add(usage)
                        }
                }

                fun viewMode(viewMode: ViewMode) = viewMode(JsonField.of(viewMode))

                /**
                 * Sets [Builder.viewMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.viewMode] with a well-typed [ViewMode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .billableMetric()
                 * .usage()
                 * .viewMode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Data =
                    Data(
                        checkRequired("billableMetric", billableMetric),
                        checkRequired("usage", usage).map { it.toImmutable() },
                        checkRequired("viewMode", viewMode),
                        additionalProperties.toMutableMap(),
                    )
            }

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

            class BillableMetric
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(id, name, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [BillableMetric].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [BillableMetric]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(billableMetric: BillableMetric) = apply {
                        id = billableMetric.id
                        name = billableMetric.name
                        additionalProperties = billableMetric.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [BillableMetric].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BillableMetric =
                        BillableMetric(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): BillableMetric = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    validated = true
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

            class Usage
            private constructor(
                private val quantity: JsonField<Double>,
                private val timeframeEnd: JsonField<OffsetDateTime>,
                private val timeframeStart: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timeframe_end")
                    @ExcludeMissing
                    timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("timeframe_start")
                    @ExcludeMissing
                    timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(quantity, timeframeEnd, timeframeStart, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [timeframeEnd].
                 *
                 * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timeframe_end")
                @ExcludeMissing
                fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

                /**
                 * Returns the raw JSON value of [timeframeStart].
                 *
                 * Unlike [timeframeStart], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timeframe_start")
                @ExcludeMissing
                fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Usage].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .quantity()
                     * .timeframeEnd()
                     * .timeframeStart()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Usage]. */
                class Builder internal constructor() {

                    private var quantity: JsonField<Double>? = null
                    private var timeframeEnd: JsonField<OffsetDateTime>? = null
                    private var timeframeStart: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usage: Usage) = apply {
                        quantity = usage.quantity
                        timeframeEnd = usage.timeframeEnd
                        timeframeStart = usage.timeframeStart
                        additionalProperties = usage.additionalProperties.toMutableMap()
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                        timeframeEnd(JsonField.of(timeframeEnd))

                    /**
                     * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeframeEnd] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                        this.timeframeEnd = timeframeEnd
                    }

                    fun timeframeStart(timeframeStart: OffsetDateTime) =
                        timeframeStart(JsonField.of(timeframeStart))

                    /**
                     * Sets [Builder.timeframeStart] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeframeStart] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                        this.timeframeStart = timeframeStart
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

                    /**
                     * Returns an immutable instance of [Usage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .quantity()
                     * .timeframeEnd()
                     * .timeframeStart()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Usage =
                        Usage(
                            checkRequired("quantity", quantity),
                            checkRequired("timeframeEnd", timeframeEnd),
                            checkRequired("timeframeStart", timeframeStart),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Usage = apply {
                    if (validated) {
                        return@apply
                    }

                    quantity()
                    timeframeEnd()
                    timeframeStart()
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Usage && quantity == other.quantity && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(quantity, timeframeEnd, timeframeStart, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Usage{quantity=$quantity, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalProperties=$additionalProperties}"
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

    class GroupedSubscriptionUsage
    private constructor(
        private val data: JsonField<List<Data>>,
        private val paginationMetadata: JsonField<PaginationMetadata>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of(),
            @JsonProperty("pagination_metadata")
            @ExcludeMissing
            paginationMetadata: JsonField<PaginationMetadata> = JsonMissing.of(),
        ) : this(data, paginationMetadata, mutableMapOf())

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun data(): List<Data> = data.getRequired("data")

        /**
         * @throws OrbInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun paginationMetadata(): PaginationMetadata? =
            paginationMetadata.getNullable("pagination_metadata")

        /**
         * Returns the raw JSON value of [data].
         *
         * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

        /**
         * Returns the raw JSON value of [paginationMetadata].
         *
         * Unlike [paginationMetadata], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pagination_metadata")
        @ExcludeMissing
        fun _paginationMetadata(): JsonField<PaginationMetadata> = paginationMetadata

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

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

            /**
             * Sets [Builder.data] to an arbitrary JSON value.
             *
             * You should usually call [Builder.data] with a well-typed `List<Data>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun data(data: JsonField<List<Data>>) = apply {
                this.data = data.map { it.toMutableList() }
            }

            /**
             * Adds a single [Data] to [Builder.data].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addData(data: Data) = apply {
                this.data =
                    (this.data ?: JsonField.of(mutableListOf())).also {
                        checkKnown("data", it).add(data)
                    }
            }

            fun paginationMetadata(paginationMetadata: PaginationMetadata?) =
                paginationMetadata(JsonField.ofNullable(paginationMetadata))

            /**
             * Sets [Builder.paginationMetadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paginationMetadata] with a well-typed
             * [PaginationMetadata] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
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

            /**
             * Returns an immutable instance of [GroupedSubscriptionUsage].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .data()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GroupedSubscriptionUsage =
                GroupedSubscriptionUsage(
                    checkRequired("data", data).map { it.toImmutable() },
                    paginationMetadata,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GroupedSubscriptionUsage = apply {
            if (validated) {
                return@apply
            }

            data().forEach { it.validate() }
            paginationMetadata()?.validate()
            validated = true
        }

        class Data
        private constructor(
            private val billableMetric: JsonField<BillableMetric>,
            private val metricGroup: JsonField<MetricGroup>,
            private val usage: JsonField<List<Usage>>,
            private val viewMode: JsonField<ViewMode>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billable_metric")
                @ExcludeMissing
                billableMetric: JsonField<BillableMetric> = JsonMissing.of(),
                @JsonProperty("metric_group")
                @ExcludeMissing
                metricGroup: JsonField<MetricGroup> = JsonMissing.of(),
                @JsonProperty("usage")
                @ExcludeMissing
                usage: JsonField<List<Usage>> = JsonMissing.of(),
                @JsonProperty("view_mode")
                @ExcludeMissing
                viewMode: JsonField<ViewMode> = JsonMissing.of(),
            ) : this(billableMetric, metricGroup, usage, viewMode, mutableMapOf())

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billableMetric(): BillableMetric = billableMetric.getRequired("billable_metric")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun metricGroup(): MetricGroup = metricGroup.getRequired("metric_group")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun usage(): List<Usage> = usage.getRequired("usage")

            /**
             * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun viewMode(): ViewMode = viewMode.getRequired("view_mode")

            /**
             * Returns the raw JSON value of [billableMetric].
             *
             * Unlike [billableMetric], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billable_metric")
            @ExcludeMissing
            fun _billableMetric(): JsonField<BillableMetric> = billableMetric

            /**
             * Returns the raw JSON value of [metricGroup].
             *
             * Unlike [metricGroup], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("metric_group")
            @ExcludeMissing
            fun _metricGroup(): JsonField<MetricGroup> = metricGroup

            /**
             * Returns the raw JSON value of [usage].
             *
             * Unlike [usage], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("usage") @ExcludeMissing fun _usage(): JsonField<List<Usage>> = usage

            /**
             * Returns the raw JSON value of [viewMode].
             *
             * Unlike [viewMode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("view_mode")
            @ExcludeMissing
            fun _viewMode(): JsonField<ViewMode> = viewMode

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

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

                private var billableMetric: JsonField<BillableMetric>? = null
                private var metricGroup: JsonField<MetricGroup>? = null
                private var usage: JsonField<MutableList<Usage>>? = null
                private var viewMode: JsonField<ViewMode>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(data: Data) = apply {
                    billableMetric = data.billableMetric
                    metricGroup = data.metricGroup
                    usage = data.usage.map { it.toMutableList() }
                    viewMode = data.viewMode
                    additionalProperties = data.additionalProperties.toMutableMap()
                }

                fun billableMetric(billableMetric: BillableMetric) =
                    billableMetric(JsonField.of(billableMetric))

                /**
                 * Sets [Builder.billableMetric] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billableMetric] with a well-typed
                 * [BillableMetric] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun billableMetric(billableMetric: JsonField<BillableMetric>) = apply {
                    this.billableMetric = billableMetric
                }

                fun metricGroup(metricGroup: MetricGroup) = metricGroup(JsonField.of(metricGroup))

                /**
                 * Sets [Builder.metricGroup] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.metricGroup] with a well-typed [MetricGroup]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun metricGroup(metricGroup: JsonField<MetricGroup>) = apply {
                    this.metricGroup = metricGroup
                }

                fun usage(usage: List<Usage>) = usage(JsonField.of(usage))

                /**
                 * Sets [Builder.usage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.usage] with a well-typed `List<Usage>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun usage(usage: JsonField<List<Usage>>) = apply {
                    this.usage = usage.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Usage] to [Builder.usage].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addUsage(usage: Usage) = apply {
                    this.usage =
                        (this.usage ?: JsonField.of(mutableListOf())).also {
                            checkKnown("usage", it).add(usage)
                        }
                }

                fun viewMode(viewMode: ViewMode) = viewMode(JsonField.of(viewMode))

                /**
                 * Sets [Builder.viewMode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.viewMode] with a well-typed [ViewMode] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
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

                /**
                 * Returns an immutable instance of [Data].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .billableMetric()
                 * .metricGroup()
                 * .usage()
                 * .viewMode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Data =
                    Data(
                        checkRequired("billableMetric", billableMetric),
                        checkRequired("metricGroup", metricGroup),
                        checkRequired("usage", usage).map { it.toImmutable() },
                        checkRequired("viewMode", viewMode),
                        additionalProperties.toMutableMap(),
                    )
            }

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

            class BillableMetric
            private constructor(
                private val id: JsonField<String>,
                private val name: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                ) : this(id, name, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun name(): String = name.getRequired("name")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [name].
                 *
                 * Unlike [name], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [BillableMetric].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .name()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [BillableMetric]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(billableMetric: BillableMetric) = apply {
                        id = billableMetric.id
                        name = billableMetric.name
                        additionalProperties = billableMetric.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Sets [Builder.name] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.name] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [BillableMetric].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .id()
                     * .name()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): BillableMetric =
                        BillableMetric(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): BillableMetric = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    validated = true
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

            class MetricGroup
            private constructor(
                private val propertyKey: JsonField<String>,
                private val propertyValue: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("property_key")
                    @ExcludeMissing
                    propertyKey: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("property_value")
                    @ExcludeMissing
                    propertyValue: JsonField<String> = JsonMissing.of(),
                ) : this(propertyKey, propertyValue, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun propertyKey(): String = propertyKey.getRequired("property_key")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun propertyValue(): String = propertyValue.getRequired("property_value")

                /**
                 * Returns the raw JSON value of [propertyKey].
                 *
                 * Unlike [propertyKey], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("property_key")
                @ExcludeMissing
                fun _propertyKey(): JsonField<String> = propertyKey

                /**
                 * Returns the raw JSON value of [propertyValue].
                 *
                 * Unlike [propertyValue], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("property_value")
                @ExcludeMissing
                fun _propertyValue(): JsonField<String> = propertyValue

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

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

                    /**
                     * Sets [Builder.propertyKey] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.propertyKey] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun propertyKey(propertyKey: JsonField<String>) = apply {
                        this.propertyKey = propertyKey
                    }

                    fun propertyValue(propertyValue: String) =
                        propertyValue(JsonField.of(propertyValue))

                    /**
                     * Sets [Builder.propertyValue] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.propertyValue] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [MetricGroup].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .propertyKey()
                     * .propertyValue()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): MetricGroup =
                        MetricGroup(
                            checkRequired("propertyKey", propertyKey),
                            checkRequired("propertyValue", propertyValue),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): MetricGroup = apply {
                    if (validated) {
                        return@apply
                    }

                    propertyKey()
                    propertyValue()
                    validated = true
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

            class Usage
            private constructor(
                private val quantity: JsonField<Double>,
                private val timeframeEnd: JsonField<OffsetDateTime>,
                private val timeframeStart: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timeframe_end")
                    @ExcludeMissing
                    timeframeEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("timeframe_start")
                    @ExcludeMissing
                    timeframeStart: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(quantity, timeframeEnd, timeframeStart, mutableMapOf())

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timeframeEnd(): OffsetDateTime = timeframeEnd.getRequired("timeframe_end")

                /**
                 * @throws OrbInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun timeframeStart(): OffsetDateTime = timeframeStart.getRequired("timeframe_start")

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [timeframeEnd].
                 *
                 * Unlike [timeframeEnd], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timeframe_end")
                @ExcludeMissing
                fun _timeframeEnd(): JsonField<OffsetDateTime> = timeframeEnd

                /**
                 * Returns the raw JSON value of [timeframeStart].
                 *
                 * Unlike [timeframeStart], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("timeframe_start")
                @ExcludeMissing
                fun _timeframeStart(): JsonField<OffsetDateTime> = timeframeStart

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Usage].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .quantity()
                     * .timeframeEnd()
                     * .timeframeStart()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Usage]. */
                class Builder internal constructor() {

                    private var quantity: JsonField<Double>? = null
                    private var timeframeEnd: JsonField<OffsetDateTime>? = null
                    private var timeframeStart: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(usage: Usage) = apply {
                        quantity = usage.quantity
                        timeframeEnd = usage.timeframeEnd
                        timeframeStart = usage.timeframeStart
                        additionalProperties = usage.additionalProperties.toMutableMap()
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun timeframeEnd(timeframeEnd: OffsetDateTime) =
                        timeframeEnd(JsonField.of(timeframeEnd))

                    /**
                     * Sets [Builder.timeframeEnd] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeframeEnd] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timeframeEnd(timeframeEnd: JsonField<OffsetDateTime>) = apply {
                        this.timeframeEnd = timeframeEnd
                    }

                    fun timeframeStart(timeframeStart: OffsetDateTime) =
                        timeframeStart(JsonField.of(timeframeStart))

                    /**
                     * Sets [Builder.timeframeStart] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timeframeStart] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timeframeStart(timeframeStart: JsonField<OffsetDateTime>) = apply {
                        this.timeframeStart = timeframeStart
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

                    /**
                     * Returns an immutable instance of [Usage].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .quantity()
                     * .timeframeEnd()
                     * .timeframeStart()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Usage =
                        Usage(
                            checkRequired("quantity", quantity),
                            checkRequired("timeframeEnd", timeframeEnd),
                            checkRequired("timeframeStart", timeframeStart),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Usage = apply {
                    if (validated) {
                        return@apply
                    }

                    quantity()
                    timeframeEnd()
                    timeframeStart()
                    validated = true
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Usage && quantity == other.quantity && timeframeEnd == other.timeframeEnd && timeframeStart == other.timeframeStart && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(quantity, timeframeEnd, timeframeStart, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Usage{quantity=$quantity, timeframeEnd=$timeframeEnd, timeframeStart=$timeframeStart, additionalProperties=$additionalProperties}"
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
