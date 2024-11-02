package com.example.foodex

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodex.databinding.ActivitySigninBinding

class Signin_Activity : AppCompatActivity() {
    private val binding:ActivitySigninBinding by lazy {
        ActivitySigninBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.AlrdyAcc.setOnClickListener{
            val intent = Intent (this,LoginActivity::class.java)
            startActivity(intent)
        }
        }
    }
