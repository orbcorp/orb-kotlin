// File generated from our OpenAPI spec by Stainless.

package com.withorb.api.core

class AutoPager<T> private constructor(private val firstPage: Page<T>) : Sequence<T> {

    companion object {

        fun <T> from(firstPage: Page<T>): AutoPager<T> = AutoPager(firstPage)
    }

    override fun iterator(): Iterator<T> =
        generateSequence(firstPage) { if (it.hasNextPage()) it.nextPage() else null }
            .flatMap { it.items() }
            .iterator()
}
