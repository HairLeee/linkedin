package com.chinhhoang.linkedin.common.network

import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.response.LoginRp
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface WeatherApi {

    @POST("weather")
    suspend fun login(@Body loginRequest: LoginRequest
    ): LoginRp

    companion object {
        const val NEWS_API_URL = "https://newsapi.org/v2/"
    }
}