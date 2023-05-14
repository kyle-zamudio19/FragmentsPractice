package com.example.fragmentspractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragmentspractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragBtn1.setOnClickListener {

            replaceFragment(Fragment1())
        }

        binding.fragBtn2.setOnClickListener {

            replaceFragment(Fragment2())
        }

        binding.fragBtn3.setOnClickListener {

            replaceFragment(Fragment3())
        }
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragments,fragment)
        fragmentTransaction.commit()
    }
}