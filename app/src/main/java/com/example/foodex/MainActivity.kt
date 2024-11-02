package com.example.foodex

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.foodex.Fragment.CartFragment
import com.example.foodex.Fragment.HomeFragment
import com.example.foodex.Fragment.ProfileFragment
import com.example.foodex.Fragment.SearchFragment
import com.example.foodex.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // Set default fragment when the activity starts
        replaceFragment(HomeFragment())

        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.homeFragment -> replaceFragment(HomeFragment())
                R.id.profileFragment -> replaceFragment(ProfileFragment())
                R.id.cartFragment -> replaceFragment(CartFragment())
                R.id.searchFragment -> replaceFragment(SearchFragment())
                R.id.historyFragment -> replaceFragment(CartFragment())
                else -> false
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainerView4, fragment)
        fragmentTransaction.commit()
    }
}
