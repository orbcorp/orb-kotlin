@file:JvmName("Utils")

package com.withorb.api.core

import com.withorb.api.core.http.Headers
import com.withorb.api.errors.OrbInvalidDataException
import java.util.Collections
import java.util.SortedMap

internal fun <T : Any> T?.getOrThrow(name: String): T =
    this ?: throw OrbInvalidDataException("`${name}` is not present")

internal fun <T> List<T>.toImmutable(): List<T> =
    if (isEmpty()) Collections.emptyList() else Collections.unmodifiableList(toList())

internal fun <K, V> Map<K, V>.toImmutable(): Map<K, V> =
    if (isEmpty()) immutableEmptyMap() else Collections.unmodifiableMap(toMap())

internal fun <K, V> immutableEmptyMap(): Map<K, V> = Collections.emptyMap()

internal fun <K : Comparable<K>, V> SortedMap<K, V>.toImmutable(): SortedMap<K, V> =
    if (isEmpty()) Collections.emptySortedMap()
    else Collections.unmodifiableSortedMap(toSortedMap(comparator()))

internal fun Headers.getRequiredHeader(name: String): String =
    values(name).firstOrNull() ?: throw OrbInvalidDataException("Could not find $name header")

internal interface Enum
