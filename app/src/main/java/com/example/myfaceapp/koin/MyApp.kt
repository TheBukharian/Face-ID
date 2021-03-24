package com.example.myfaceapp.koin

import android.app.Application
import com.example.myfaceapp.koin.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModules))
        }
    }
}