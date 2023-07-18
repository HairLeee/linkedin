package com.chinhhoang.linkedin.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.chinhhoang.linkedin.common.base.BaseViewModel
import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import com.chinhhoang.linkedin.data.entiti.response.LoginRp
import com.chinhhoang.linkedin.domain.usecase.LoginUseCase
import kotlinx.coroutines.launch

class LoginViewModel constructor(
    private val loginUseCase: LoginUseCase
) : BaseViewModel() {
    private val _loginSuccessfully = MutableLiveData<LoginRp>()
    val loginSuccessfully: LiveData<LoginRp> = _loginSuccessfully

    fun login(request: LoginRequest) {
        viewModelScope.launch {
            val loginRes = loginUseCase.login(request)
            if (loginRes.success == true) {
                _loginSuccessfully.value = loginRes
            } else {

            }
        }
    }
}