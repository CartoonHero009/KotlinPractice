package com.mlyc.retorfittest.network.httpService

import com.mlyc.retorfittest.TestData.QueryMSGAmountRequest
import com.mlyc.retorfittest.TestData.QueryMSGAmountResponse
import com.mlyc.retorfittest.TestData.RequestData
import com.mlyc.retorfittest.TestData.ResponseData
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface ApiInterface {

    @Headers("Content-Type: application/json")
    @POST("/ccdsNewAPI/ccd04/06/ccd040601")
    fun testApi(@Body params: RequestData<QueryMSGAmountRequest>): Deferred<Response<ResponseData>>
    @Headers("Content-Type: application/json")
    @POST("/ccdsNewAPI/ccd04/06/ccd040601")
    fun testApi2(@Body params: QueryMSGAmountRequest): Deferred<Response<ResponseData>>
    //fun testApi(@Body params: RequestData<QueryMSGAmountRequest>):Deferred<Response<QueryMSGAmountResponse>>
}
