package com.nfach98.githubuserfavorite.app.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.nfach98.githubuserfavorite.app.main.MainActivity
import com.nfach98.githubuserfavoritefavorite.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        setupView()
        toMainActivity()
    }

    private fun setupView(){
        supportActionBar?.hide()
    }

    private fun toMainActivity(){
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 4000)
    }
}