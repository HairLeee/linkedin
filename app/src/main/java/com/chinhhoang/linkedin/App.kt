package com.chinhhoang.linkedin

import android.app.Application
import com.chinhhoang.linkedin.common.di.appModule
import com.chinhhoang.linkedin.common.di.repositoryModule
import com.chinhhoang.linkedin.common.di.useCaseModule
import com.chinhhoang.linkedin.common.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(appModule, viewModelModule, useCaseModule, repositoryModule)
        }
    }
}