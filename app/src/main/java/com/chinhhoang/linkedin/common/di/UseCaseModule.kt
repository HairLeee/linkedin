package com.chinhhoang.linkedin.common.di

import com.chinhhoang.linkedin.domain.usecase.ForgotPasswordUseCase
import com.chinhhoang.linkedin.domain.usecase.LoginUseCase
import com.chinhhoang.linkedin.domain.usecase.RegisterUseCase
import com.chinhhoang.linkedin.domain.usecase.TeamsUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val useCaseModule = module {
    singleOf(::LoginUseCase)
    singleOf(::RegisterUseCase)
    singleOf(::ForgotPasswordUseCase)
    singleOf(::TeamsUseCase)
}