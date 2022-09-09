package com.example.edvgerial.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edvgerial.R
import com.example.edvgerial.databinding.ActivityMainBinding
import com.example.edvgerial.fragment.BonusesFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setFragmentView()
    }

    private fun setFragmentView() {
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container,BonusesFragment()).commit()
    }
}