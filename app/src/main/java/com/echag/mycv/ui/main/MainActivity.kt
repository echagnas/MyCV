package com.echag.mycv.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.echag.mycv.FirstClass
import com.echag.mycv.R
import org.koin.java.KoinJavaComponent.inject

class MainActivity : AppCompatActivity() {

    private val firstClass: FirstClass by inject(
        FirstClass::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstClass.test()
    }
}
