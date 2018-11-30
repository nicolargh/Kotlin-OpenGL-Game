package com.example.nicolargh.opengltest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nicolargh.opengltest.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment())
                .commitNow()
        }
    }
}
