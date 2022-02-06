package com.nazirov.instagramclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SignUpActivity : AppCompatActivity() {

    lateinit var et_password : EditText
    lateinit var et_cpassword : EditText
    lateinit var et_email : EditText
    lateinit var et_fullname : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        initViews()
    }

    private fun initViews() {
        et_cpassword = findViewById(R.id.et_confirmpassword)
        et_password = findViewById(R.id.et_password)
        et_email = findViewById(R.id.et_email)
        et_fullname = findViewById(R.id.et_fullname)

        var b_signup = findViewById<Button>(R.id.btn_signUp)
        var  tv_signin = findViewById<TextView>(R.id.tv_signIn)

        b_signup.setOnClickListener {
            View.OnClickListener {
                finish()
            }
        }
        tv_signin.setOnClickListener(View.OnClickListener {
            finish()
        })

    }
}