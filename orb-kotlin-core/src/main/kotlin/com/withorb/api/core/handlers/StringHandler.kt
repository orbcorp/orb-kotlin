@file:JvmName("StringHandler")

package com.withorb.api.core.handlers

import com.withorb.api.core.http.HttpResponse
import com.withorb.api.core.http.HttpResponse.Handler

internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
