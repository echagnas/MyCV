package com.echag.mycv.di

import com.echag.mycv.FirstClass
import org.koin.dsl.module

val module = module {
    single { FirstClass() }
}