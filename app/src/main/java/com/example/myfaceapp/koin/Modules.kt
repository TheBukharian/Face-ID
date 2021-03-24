package com.example.myfaceapp.koin

import com.example.myfaceapp.SharedPreferences
import org.koin.dsl.module

val appModules = module() {

    single { SharedPreferences(get()) }
}