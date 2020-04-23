package com.echag.mycv.application

import android.app.Application
import com.echag.mycv.di.module
import org.koin.core.context.*

class MyCVApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {

            modules(module)
        }
    }
}