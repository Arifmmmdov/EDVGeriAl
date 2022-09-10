package com.example.edvgerial.fragment

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PackageManagerCompat
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.DecodeCallback
import com.example.edvgerial.R
import com.example.edvgerial.databinding.FragmentQRScannerBinding
class QRScannerFragment : Fragment() {
    private val binding by lazy {
        FragmentQRScannerBinding.inflate(layoutInflater)
    }

    private val codeScanner by lazy{
        CodeScanner(requireContext(),binding.codeScanner)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        checkCameraPermission()
        setCodeScanner()
        setListeners()
        return binding.root
    }

    private fun checkCameraPermission() {
        if(ContextCompat.checkSelfPermission(requireContext(), Manifest.permission.CAMERA)== PackageManager.PERMISSION_DENIED){
            ActivityCompat.requestPermissions(requireActivity(), arrayOf(Manifest.permission.CAMERA),123)
        }
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
        binding.codeScanner.setOnClickListener { codeScanner.startPreview() }
        binding.enterFiscalCode.setOnClickListener(this::enterFiscalCodeManually)
    }

    private fun onBackClicked(view: View) {
        requireActivity().onBackPressed()
    }

    private fun onFlashClicked(view:View) {
        if(codeScanner.isFlashEnabled) {
            codeScanner.isFlashEnabled = false
            binding.flashButton.setBackgroundResource(R.drawable.ic_flash_off)
        }else{
            codeScanner.isFlashEnabled = true
            binding.flashButton.setBackgroundResource(R.drawable.ic_flash)
        }
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

    private fun enterFiscalCodeManually(view:View) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container,EnterFiscalIDFragment())
            .addToBackStack("")
            .commit()
    }
}
