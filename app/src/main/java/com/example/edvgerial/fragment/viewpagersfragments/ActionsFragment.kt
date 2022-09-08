package com.example.edvgerial.fragment.viewpagersfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edvgerial.databinding.FragmentActionsBinding

class ActionsFragment : Fragment() {
    private val binding by lazy{
        FragmentActionsBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}