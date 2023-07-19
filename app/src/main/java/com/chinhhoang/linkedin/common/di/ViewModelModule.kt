package com.chinhhoang.linkedin.common.di


import com.chinhhoang.linkedin.presentation.login.LoginViewModel
import com.chinhhoang.linkedin.presentation.teams.TeamsViewModel
import com.chinhhoang.linkedin.presentation.viewmodel.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel() }
    viewModel { LoginViewModel(get()) }
    viewModel { TeamsViewModel(get()) }
}


