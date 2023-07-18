package com.chinhhoang.linkedin.domain.usecase

import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.request.RegisterRq
import com.chinhhoang.linkedin.data.entiti.response.LoginRp
import com.chinhhoang.linkedin.domain.repositories.AuthenticationRepository

class RegisterUseCase constructor(
    private val authenticationRepository: AuthenticationRepository
) {
    suspend fun register(request: RegisterRq) : Boolean {
        return authenticationRepository.register(request)
    }
}