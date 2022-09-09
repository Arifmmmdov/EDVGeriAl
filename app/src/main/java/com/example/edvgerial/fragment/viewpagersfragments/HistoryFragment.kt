package com.example.edvgerial.fragment.viewpagersfragments

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.edvgerial.adapter.HistoryAdapter
import com.example.edvgerial.databinding.FragmentHistoryBinding
import com.example.edvgerial.repository.MyRepo

class HistoryFragment : Fragment() {
    private val binding by lazy {
        FragmentHistoryBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setRecyclerAdapter()
        return binding.root
    }

    private fun setRecyclerAdapter() {
        binding.recycHistory.adapter = HistoryAdapter(MyRepo.getHistoryItems())
        binding.recycHistory.layoutManager = LinearLayoutManager(requireContext())

    }

}