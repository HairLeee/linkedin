package com.chinhhoang.linkedin.domain.usecase

import com.chinhhoang.linkedin.data.entiti.response.TeamsRp
import com.chinhhoang.linkedin.domain.repositories.TeamsRepository

class TeamsUseCase constructor(
    private val teamsRepository: TeamsRepository
) {
    suspend fun getTeams(): TeamsRp {
        return teamsRepository.getTeams()
    }
}