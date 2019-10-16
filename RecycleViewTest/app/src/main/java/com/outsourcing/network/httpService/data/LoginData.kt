package com.mlyc.retorfittest.network.httpService.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.http.Header

data class LoginRequest(
    val username: String = "aaa",
    val password: String = "bbb"
)

/*
"header": {
    "appVersion": "1.0.2",
    "channel": "CCDTW",
    "deviceBrand": "LG",
    "deviceModel": "M9",
    "deviceType": "Android",
    "deviceUUID": "deviceUUID123",
    "deviceVersion": "android 4.4",
    "lang": "zh-TW",
    "pushToken": "pushToken123",
    "sessionID": "q123456789012345678901234567890123456789012345678901234567890123",
    "signCode": "1234567890ABCDEF1234567890ABCDEF1234567890ABCDEF1234567890ABCDEF",
    "txDate": "20170512120000",
    "txID": "CCD040602",
    "txSN": "12000012345678",
    "txToken": "CCD010101",
    "userAgent": "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.96 Safari/537.36",
    "userIP": "IP"
  }
*/
