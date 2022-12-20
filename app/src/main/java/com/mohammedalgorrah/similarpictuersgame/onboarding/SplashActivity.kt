package com.mohammedalgorrah.similarpictuersgame.onboarding

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mohammedalgorrah.similarpictuersgame.MainActivity
import com.mohammedalgorrah.similarpictuersgame.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar!!.hide()

        if (onBoarding()) {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun onBoarding(): Boolean {
        val sharedPre = this.getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPre.getBoolean("Finished", false)
    }
}
