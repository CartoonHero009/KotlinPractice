package com.mlyc.retorfittest.network.httpService.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Created by mr.chihlungchen on 2019-05-28, Hey Yo Man!
 */
@JsonClass(generateAdapter = true)
data class User(
    @Json(name = "userId") val userId: Int,
    @Json(name = "organizationId") val organizationId: Int,
    @Json(name = "username") val username: String,
    @Json(name = "level") val level: Int,
    @Json(name = "status") val status: Int,
    @Json(name = "token") val token: String,
    @Json(name = "sessionTimeout") val sessionTimeout: Int,
    @Json(name = "touch") val touch: Long
)