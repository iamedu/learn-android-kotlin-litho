package com.example.ediaz.myapplication

import android.app.Application
import com.facebook.soloader.SoLoader

/**
 * Created by ediaz on 6/26/17.
 */
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        SoLoader.init(this, false)
    }
}