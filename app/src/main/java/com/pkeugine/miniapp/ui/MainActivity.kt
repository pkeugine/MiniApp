package com.pkeugine.miniapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pkeugine.miniapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, CardViewFragment())
                .commit()
        }
    }
}