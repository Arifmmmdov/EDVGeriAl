package com.example.edvgerial.fragment.viewpagersfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.edvgerial.R
import com.example.edvgerial.adapter.ActionsAdapter
import com.example.edvgerial.databinding.FragmentActionsBinding
import com.example.edvgerial.fragment.EnterFiscalIDFragment
import com.example.edvgerial.fragment.QRScannerFragment
import com.example.edvgerial.repository.MyRepo
import java.text.FieldPosition

interface FragmentChanger{
    fun changeFragment(position: Int)
}

class ActionsFragment : Fragment(),FragmentChanger {
    private val binding by lazy{
        FragmentActionsBinding.inflate(layoutInflater)
    }

    private val mFragmentManager by lazy {
        parentFragmentManager
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
        binding.actionsRecycler.adapter = ActionsAdapter(MyRepo.getActionItems(),this)
        binding.actionsRecycler.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun changeFragment(position: Int) {
        when(position){
            1->requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragment_container,EnterFiscalIDFragment())
                .addToBackStack("").commit()
            0->requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,QRScannerFragment())
                .addToBackStack("").commit()
        }
    }
}