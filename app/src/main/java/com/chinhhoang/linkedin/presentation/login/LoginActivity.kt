package com.chinhhoang.linkedin.presentation.login

import android.os.Bundle
import com.chinhhoang.linkedin.R
import com.chinhhoang.linkedin.common.base.BaseActivity
import com.chinhhoang.linkedin.data.entiti.request.LoginRequest
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : BaseActivity() {

    private val loginViewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginViewModel.login(
            LoginRequest(email = "", password = "")
        )

        loginViewModel.loginSuccessfully.observe(this) {

        }

    }
}