package com.example.edvgerial.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.edvgerial.fragment.viewpagersfragments.ActionsFragment
import com.example.edvgerial.fragment.viewpagersfragments.HistoryFragment

class PagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> ActionsFragment()
            else -> {HistoryFragment()}
        }
    }

}