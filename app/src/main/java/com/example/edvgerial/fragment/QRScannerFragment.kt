package com.example.edvgerial.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.DecodeCallback
import com.example.edvgerial.R
import com.example.edvgerial.databinding.FragmentQRScannerBinding

class QRScannerFragment : Fragment() {
    private val binding by lazy {
        FragmentQRScannerBinding.inflate(layoutInflater)
    }

    private lateinit var codeScanner:CodeScanner

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        codeScanner = CodeScanner(requireContext(),binding.codeScanner)
        setCodeScanner()
        setListeners()
        return binding.root
    }

    private fun setCodeScanner() {
        codeScanner.decodeCallback = DecodeCallback {
            parentFragmentManager.beginTransaction().replace(R.id.fragment_container,ReceiptFragment())
                .commit()
        }
    }

    private fun setListeners() {
        binding.imageButton.setOnClickListener(this::onImageClicked)
        binding.flashButton.setOnClickListener(this::onFlashClicked)
        binding.arrowBack.setOnClickListener(this::onBackClicked)
        binding.codeScanner.setOnClickListener{codeScanner.startPreview()}
    }

    private fun onBackClicked(view: View) {
        requireActivity().onBackPressed()
    }

    private fun onFlashClicked(view:View) {
        codeScanner.isFlashEnabled = true
    }

    private fun onImageClicked(view: View) {
        //TODO open the gallery
    }

    override fun onStart() {
        super.onStart()
        codeScanner.startPreview()
    }

    override fun onStop() {
        codeScanner.releaseResources()
        super.onStop()
    }

}