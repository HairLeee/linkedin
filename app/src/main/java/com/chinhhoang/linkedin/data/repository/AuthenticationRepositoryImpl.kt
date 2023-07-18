package com.chinhhoang.linkedin.data.repository

import com.chinhhoang.linkedin.common.network.WeatherApi
import com.chinhhoang.linkedin.data.entiti.request.ForgotPasswordRq
import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.request.RegisterRq
import com.chinhhoang.linkedin.data.entiti.response.ForgotPasswordRp
import com.chinhhoang.linkedin.data.entiti.response.LoginRp
import com.chinhhoang.linkedin.domain.repositories.AuthenticationRepository

class AuthenticationRepositoryImpl constructor(
    private val weatherApi: WeatherApi
): AuthenticationRepository {
    override suspend fun login(request: LoginRequest): LoginRp {
        return LoginRp(success = true)
    }

    override suspend fun register(request: RegisterRq): Boolean {
        return true
    }

    override suspend fun forgotPassword(request : ForgotPasswordRq) : ForgotPasswordRp {
        return ForgotPasswordRp(notification = "")
    }
}