package com.chinhhoang.linkedin.domain.repositories

import com.chinhhoang.linkedin.data.entiti.request.ForgotPasswordRq
import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.request.RegisterRq
import com.chinhhoang.linkedin.data.entiti.response.ForgotPasswordRp
import com.chinhhoang.linkedin.data.entiti.response.LoginRp

interface AuthenticationRepository {
    suspend fun login(request: LoginRequest) : LoginRp

    suspend fun register(request: RegisterRq) : Boolean

    suspend fun forgotPassword(request : ForgotPasswordRq) : ForgotPasswordRp
}