package com.nazirov.instagramclone

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    final var TAG :String = SignInActivity::class.java.toString()
    lateinit var et_mail : EditText
    lateinit var et_password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initViews()
    }

    private fun initViews() {
        et_mail = findViewById(R.id.et_email)
        et_password = findViewById(R.id.et_password)
         var btn_signIn = findViewById<Button>(R.id.btn_signIn)
        var tv_signup: TextView = findViewById(R.id.tv_signUp)

        btn_signIn.setOnClickListener(View.OnClickListener {
            openSignUpActivity()
        })
    }

    private fun openSignUpActivity() {
        var intent = Intent(this,SignUpActivity::class.java)
        startActivity(intent)
    }
     private fun openHomeActivity() {
        var intent = Intent(this,HomeActivity::class.java)
        startActivity(intent)
    }

}















