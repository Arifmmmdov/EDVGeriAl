package com.example.edvgerial.fragment.viewpagersfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edvgerial.R
import com.example.edvgerial.databinding.FragmentHistoryBinding

class HistoryFragment : Fragment() {
    private val binding by lazy {
        FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

}