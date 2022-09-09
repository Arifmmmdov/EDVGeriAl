package com.example.edvgerial.textwatcher

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import androidx.core.content.ContextCompat
import com.example.edvgerial.R
import com.example.edvgerial.databinding.FragmentEnterFiscalIDBinding

class MyTextWatcher(private val binding:FragmentEnterFiscalIDBinding,private val context:Context):TextWatcher {
    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
    }

    override fun afterTextChanged(p0: Editable?) {
        if(p0.toString().length == 16){
            binding.btnContinue.setBackgroundColor(ContextCompat.getColor(context,R.color.orange))
            binding.btnContinue.isClickable = true
        }else{
            binding.btnContinue.setBackgroundColor(ContextCompat.getColor(context,R.color.grey))
            binding.btnContinue.isClickable = false
        }
    }
}