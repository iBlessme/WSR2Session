package com.example.wsr2session1.splashScreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wsr2session1.MainActivity
import com.example.wsr2session1.OnBording.onBordingScreen
import com.example.wsr2session1.R
import kotlinx.android.synthetic.main.activity_splash_screen.*

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

    vSplash.alpha = 0f
        vSplash.animate().setDuration(1500).alpha(1f).withEndAction{
            startActivity(Intent(this, onBordingScreen::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

    }
}