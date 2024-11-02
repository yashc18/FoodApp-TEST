package com.example.foodex

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodex.databinding.ActivityLocationBinding

class Location_Activity : AppCompatActivity() {
    private val binding: ActivityLocationBinding by lazy {
        ActivityLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationlist = arrayOf("Pune","Mumbai","Delhi","Kolkata","Chennai","Bangalore")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locationlist)
        val autoCompleteTextView:AutoCompleteTextView=binding.ListOfLoc
        autoCompleteTextView.setAdapter(adapter)
    }
}