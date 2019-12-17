package com.example.android_di_koin_example

import android.app.Application
import com.example.android_di_koin_example.di.networkModule
import com.example.android_di_koin_example.di.repositoryModule
import com.example.android_di_koin_example.di.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApp : Application() {

    private val appModules = listOf(
        repositoryModule,
        networkModule,
        vmModule
    )

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            modules(appModules)
        }
    }

}