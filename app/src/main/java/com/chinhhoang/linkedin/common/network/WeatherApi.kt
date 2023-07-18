package com.chinhhoang.linkedin.common.network

import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface WeatherApi {

    @GET("weather")
    suspend fun getForecast(
        @Query("q") location: String,
        @Query("units") unit: String
    ): String

    @POST("weather")
    suspend fun login(@Body loginRequest: LoginRequest
    ): String
}