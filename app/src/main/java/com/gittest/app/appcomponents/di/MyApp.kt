package com.gittest.app.appcomponents.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        startKoin {
            androidContext(this@MyApp)
        }
    }

    companion object {
        private lateinit var instance: MyApp

        fun getInstance(): MyApp {
            return instance
        }

    }
}