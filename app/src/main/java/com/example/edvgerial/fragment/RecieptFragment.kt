package com.example.edvgerial.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edvgerial.R
import com.example.edvgerial.databinding.FragmentRecieptBinding


class ReceiptFragment : Fragment() {
    private val binding by lazy {
        FragmentRecieptBinding.inflate(layoutInflater)
    }

    private val mFragmentManager by lazy {
        parentFragmentManager
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setListeners()
        return binding.root
    }

    private fun setListeners() {
        binding.btnReceiptContinue.setOnClickListener(this::onClickedContinue)
        binding.arrowBack.setOnClickListener(this::onBackPressed)
    }

    private fun onBackPressed(view:View) {
        requireActivity().onBackPressed()
    }

    private fun onClickedContinue(view:View) {
        mFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,SuccessfulFragment())
            .commit()
    }

}