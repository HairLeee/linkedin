package com.chinhhoang.linkedin.domain.usecase

import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.response.LoginRp
import com.chinhhoang.linkedin.domain.repositories.AuthenticationRepository

class LoginUseCase constructor(
    private val authenticationRepository: AuthenticationRepository
) {
    suspend fun login(request: LoginRequest): LoginRp {
        return authenticationRepository.login(request)
    }
}