package com.example.imo_app_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initViews()
    }

    private fun initViews() {
        val button_light = findViewById<Button>(R.id.b_light_mode)
        val button_dark = findViewById<Button>(R.id.b_dark_mode)

        button_light.setOnClickListener(View.OnClickListener {
            openMainActivity();
        })

        button_dark.setOnClickListener(View.OnClickListener {
            openDarkModeActivity()
        })
    }
    fun openMainActivity(){
        intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    fun openDarkModeActivity(){
        intent = Intent(this,DarkModeActivity::class.java)
        startActivity(intent)
    }
}


