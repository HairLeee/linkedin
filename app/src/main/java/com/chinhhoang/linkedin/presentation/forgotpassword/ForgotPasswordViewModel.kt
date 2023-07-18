package com.chinhhoang.linkedin.presentation.forgotpassword

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chinhhoang.linkedin.data.entiti.request.ForgotPasswordRq
import com.chinhhoang.linkedin.data.entiti.response.ForgotPasswordRp
import com.chinhhoang.linkedin.domain.usecase.ForgotPasswordUseCase
import kotlinx.coroutines.launch

class ForgotPasswordViewModel constructor(
    private val forgotPasswordUseCase: ForgotPasswordUseCase
) : ViewModel() {
    private val _forgotPassword = MutableLiveData<ForgotPasswordRp>()
    val forgotPassword: LiveData<ForgotPasswordRp> = _forgotPassword

    fun forgotPassword(request: ForgotPasswordRq) {
        viewModelScope.launch {
            val forgotPasswordRes = forgotPasswordUseCase.forgotPassword(request)

        }
    }
}