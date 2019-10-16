package com.mlyc.retorfittest.network.httpService.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GetDevicesResponse (
    var error: Int,
    var message: String,
    @Json(name = "data")var data: GetDevicesData
) {
    data class GetDevicesData (
        @Json(name = "content")var content : List<DeviceData> = emptyList()
    )
    data class DeviceData (
        var deviceId : Int,
        var organizationId : Int,
        var modelId : Int,
        var serialNumber : String,
        var firmwareVersion : Int,
        var hardwareVersion : Int,
        //var macAddress : String,
        var status : Int,
        var createdAt : Double
    )
}
