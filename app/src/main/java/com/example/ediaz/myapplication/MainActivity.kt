package com.example.ediaz.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ediaz.myapplication.specs.ListItem
import com.facebook.litho.ComponentContext
import com.facebook.litho.LithoView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val c = ComponentContext(this)

        val component = ListItem.create(c).build()

        setContentView(LithoView.create(this, component))
    }
}
