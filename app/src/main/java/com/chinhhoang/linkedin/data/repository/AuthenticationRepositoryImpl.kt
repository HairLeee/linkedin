package com.chinhhoang.linkedin.data.repository

import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.request.RegisterRq
import com.chinhhoang.linkedin.data.entiti.response.LoginRp
import com.chinhhoang.linkedin.domain.repositories.AuthenticationRepository

class AuthenticationRepositoryImpl : AuthenticationRepository {
    override suspend fun login(request: LoginRequest): LoginRp {
        return LoginRp(true)
    }

    override suspend fun register(registerRq: RegisterRq): Boolean {
        return true
    }
}