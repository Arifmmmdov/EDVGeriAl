package com.example.edvgerial.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.edvgerial.R
import com.example.edvgerial.adapter.PagerAdapter
import com.example.edvgerial.databinding.FragmentBonusesBinding

class BonusesFragment : Fragment() {

    private val binding by lazy {
        FragmentBonusesBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setUpViewPager()
        return binding.root
    }

    private fun setUpViewPager() {
        binding.viewPager.adapter = PagerAdapter(childFragmentManager) as RecyclerView.Adapter<*>
        binding.tabs.setupWithViewPager(binding.viewPager as ViewPager,true)
    }

}