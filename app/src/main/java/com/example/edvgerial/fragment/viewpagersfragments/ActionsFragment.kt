package com.example.edvgerial.fragment.viewpagersfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.edvgerial.adapter.ActionsAdapter
import com.example.edvgerial.databinding.FragmentActionsBinding
import com.example.edvgerial.repository.MyRepo

class ActionsFragment : Fragment() {
    private val binding by lazy{
        FragmentActionsBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setRecyclerAdapter()
        return binding.root
    }

    private fun setRecyclerAdapter() {
        binding.actionsRecycler.adapter = ActionsAdapter(MyRepo.getActionItems())
        binding.actionsRecycler.layoutManager = LinearLayoutManager(requireContext())
    }
}