package com.example.edvgerial.fragment

import android.os.Bundle
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.edvgerial.R
import com.example.edvgerial.databinding.FragmentEnterFiscalIDBinding
import com.example.edvgerial.textwatcher.MyTextWatcher

class EnterFiscalIDFragment : Fragment() {
    private val binding by lazy {
        FragmentEnterFiscalIDBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        setListeners()
        return binding.root
    }

    private fun setListeners() {
        binding.editFiscalId.addTextChangedListener(MyTextWatcher(binding,requireContext()))
        binding.btnContinue.setOnClickListener(this::onContinueClicked)
        binding.arrowBackFiscalId.setOnClickListener(this::onBackPressed)
    }

    private fun onBackPressed(view:View) {
        requireActivity().onBackPressed()
    }

    private fun onContinueClicked(view:View) {
        if(binding.btnContinue.isEnabled)
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container,ReceiptFragment())
                .addToBackStack("")
                .commit()
    }

}