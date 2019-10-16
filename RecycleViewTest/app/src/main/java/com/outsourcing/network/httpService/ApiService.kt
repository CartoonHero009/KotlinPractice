package com.mlyc.retorfittest.network.httpService

import com.mlyc.retorfittest.TestData.QueryMSGAmountRequest
import com.mlyc.retorfittest.TestData.RequestData

object ApiService {
    fun tesApi(params: RequestData<QueryMSGAmountRequest>) = RetrofitFactory.retrofit().testApi(params)
    fun tesApi2(params: QueryMSGAmountRequest) = RetrofitFactory.retrofit().testApi2(params)
    //fun testApi() = RetrofitFactory.retrofit().testApi(@Body params: Re)
}