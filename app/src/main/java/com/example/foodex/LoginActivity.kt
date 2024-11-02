package com.example.foodex

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodex.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    // Declare binding as lateinit to initialize it later
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout using view binding
        binding = ActivityLoginBinding.inflate(layoutInflater)

        // Set the content view to the root of the binding
        setContentView(binding.root)

        // Set up a click listener for the Login button
        binding.LoginBtn.setOnClickListener {
            // Create an intent to navigate to Signin_Activity
            val intent = Intent(this, Signin_Activity::class.java)
            startActivity(intent)

        // Set up a click listener for the Login button
        binding.DontAcc.setOnClickListener {
            // Create an intent to navigate to Signin_Activity
            val intent = Intent(this, Signin_Activity::class.java)
            startActivity(intent)
        }
    }
}}
