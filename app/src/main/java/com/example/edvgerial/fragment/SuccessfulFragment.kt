package com.example.edvgerial.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edvgerial.R
import com.example.edvgerial.databinding.FragmentSuccessfulBinding

class SuccessfulFragment : Fragment() {
    private val binding by lazy {
        FragmentSuccessfulBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setListeners()
        return binding.root
    }

    private fun setListeners() {
        binding.returnToGeriAl.setOnClickListener(this::returnToBonusesFragment)
    }

    private fun returnToBonusesFragment(view:View) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,BonusesFragment())
            .commit()
    }
}