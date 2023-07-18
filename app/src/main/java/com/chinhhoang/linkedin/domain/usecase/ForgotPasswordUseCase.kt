package com.chinhhoang.linkedin.domain.usecase

import com.chinhhoang.linkedin.data.entiti.request.ForgotPasswordRq
import com.chinhhoang.linkedin.data.entiti.response.ForgotPasswordRp
import com.chinhhoang.linkedin.domain.repositories.AuthenticationRepository

class ForgotPasswordUseCase constructor(
    private val authenticationRepository: AuthenticationRepository
) {
    suspend fun forgotPassword(request : ForgotPasswordRq) : ForgotPasswordRp {
        return authenticationRepository.forgotPassword(request)
    }
}