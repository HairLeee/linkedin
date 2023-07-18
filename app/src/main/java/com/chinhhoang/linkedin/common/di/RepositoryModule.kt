package com.chinhhoang.linkedin.common.di

import com.chinhhoang.linkedin.data.repository.AuthenticationRepositoryImpl
import com.chinhhoang.linkedin.domain.repositories.AuthenticationRepository
import org.koin.dsl.module

val repositoryModule = module{
    factory<AuthenticationRepository> { AuthenticationRepositoryImpl(get())  }
}