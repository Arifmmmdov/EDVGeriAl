package com.example.edvgerial.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.edvgerial.R
import com.example.edvgerial.databinding.ActivityMainBinding
import com.example.edvgerial.fragment.BonusesFragment
import com.example.edvgerial.fragment.EnterFiscalIDFragment

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
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,BonusesFragment()).commit()
    }

}