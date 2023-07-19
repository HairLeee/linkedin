package com.chinhhoang.linkedin.common.network

import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.response.LoginRp
import com.chinhhoang.linkedin.data.entiti.response.TeamsRp
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface WeatherApi {

    @POST("weather")
    suspend fun login(@Body loginRequest: LoginRequest
    ): LoginRp

    @GET("teams")
    suspend fun getTeams() : TeamsRp

    companion object {
//        const val NEWS_API_URL = "https://newsapi.org/v2/"
        const val NEWS_API_URL = "https://jmde6xvjr4.execute-api.us-east-1.amazonaws.com/"
    }
}