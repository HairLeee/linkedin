package com.chinhhoang.linkedin.data.repository

import com.chinhhoang.linkedin.common.network.WeatherApi
import com.chinhhoang.linkedin.data.entiti.response.TeamsRp
import com.chinhhoang.linkedin.domain.repositories.TeamsRepository

class TeamsRepositoryImpl constructor(
    private val weatherApi: WeatherApi
) : TeamsRepository {
    override suspend fun getTeams(): TeamsRp {
        return weatherApi.getTeams()
    }
}