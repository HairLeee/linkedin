package com.chinhhoang.linkedin.domain.repositories

import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.request.RegisterRq
import com.chinhhoang.linkedin.data.entiti.response.LoginRp

interface AuthenticationRepository {
    suspend fun login(request: LoginRequest) : LoginRp

    suspend fun register(registerRq: RegisterRq) : Boolean
}