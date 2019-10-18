package com.mlyc.retorfittest.TestData

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass


data class TestBody (
    val body  :TestData
)

data class TestData (
    var ccid: String = "ccid",
    var statusCode: String = "statusCode",
    var message: String = "message",
    var moreInfo: String = "moreInfo"
)

@JsonClass(generateAdapter = true)
data class BodyHeaderRequest(
    var appVersion: String = "1.0.2",
    var channel: String = "CCDTW",
    var deviceBrand: String = "LG",
    var deviceModel: String = "M9",
    var deviceType: String = "Android",
    var deviceUUID: String = "deviceUUID123",
    var lang: String = "zh-TW",
    var pushToken: String = "pushToken123",
    var sessionID: String = "",
    var signCode: String = "1234567890ABCDEF1234567890ABCDEF1234567890ABCDEF1234567890ABCDEF",
    var txDate: String = "20170512120000",
    var txID: String = "CCD040601",
    var txSN: String = "12000012345678",
    var txToken: String = "CCD040601",
    var userAgent: String = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Safari/537.36",
    var userIP: String = "IP"
)

@JsonClass(generateAdapter = true)
data class RequestData<T> (
    @Json(name = "header")val aHeader: BodyHeaderRequest,
    @Json(name = "body")val aBody : T
)
@JsonClass(generateAdapter = true)
data class QueryMSGAmountRequest (
    @Json(name = "custSeqNo")var custSeqNo : String = "1",
    @Json(name = "loginFlag")var loginFlag : String = "N"
)

@JsonClass(generateAdapter = true)
data class ResponseData (
    @Json(name = "body")val body: QueryMSGAmountResponse
)
@JsonClass(generateAdapter = true)
data class QueryMSGAmountResponse(
    @Json(name = "unreadCount") var unreadCount: String
)
/*
[星展+] 想要傳送通知

(1) 通知包含提示、聲音和圖像標記. 可以在「設定」中進行設定.
(2) 星展Card+ 相關通知, 陸續將以推播通知取代簡訊服務.
不允許/允許
 */