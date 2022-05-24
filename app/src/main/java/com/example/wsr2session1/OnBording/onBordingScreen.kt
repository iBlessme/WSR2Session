package com.example.wsr2session1.OnBording

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wsr2session1.Auth.SignIn
import com.example.wsr2session1.Auth.SignUp
import com.example.wsr2session1.MainActivity
import com.example.wsr2session1.R
import kotlinx.android.synthetic.main.activity_on_bording_screen.*

class onBordingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_bording_screen)

        btnSignIn.setOnClickListener { startActivity(Intent(this, SignIn::class.java)) }
        btnSignUp.setOnClickListener { startActivity(Intent(this, SignUp::class.java)) }
        skip.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }
    }
}