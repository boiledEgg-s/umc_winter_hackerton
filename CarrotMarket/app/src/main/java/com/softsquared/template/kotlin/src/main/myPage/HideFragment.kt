package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.softsquared.template.kotlin.databinding.FragmentHideBinding

class HideFragment : Fragment() {
    private lateinit var binding: FragmentHideBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHideBinding.inflate(layoutInflater)
        return binding.root
    }
}