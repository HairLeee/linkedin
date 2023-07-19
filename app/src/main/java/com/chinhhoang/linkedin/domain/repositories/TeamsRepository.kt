package com.chinhhoang.linkedin.domain.repositories

import com.chinhhoang.linkedin.data.entiti.response.TeamsRp

interface TeamsRepository {
    suspend fun getTeams(): TeamsRp
}