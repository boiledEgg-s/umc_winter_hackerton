package com.softsquared.template.kotlin.src.main.myPage

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResultLauncher
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmentMyPageBinding

class MyPageFragment :
    BaseFragment<FragmentMyPageBinding>(FragmentMyPageBinding::bind, R.layout.fragment_my_page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.svCv4Btn.setOnClickListener {
            val intent = Intent(this.activity, MyPageProfileActivity::class.java)
            startActivity(intent)
        }
        binding.svCv5Img.setOnClickListener {

        }
        binding.svCv6Img.setOnClickListener {
            val intent = Intent(this.activity, MyPagePurchaseActivity::class.java)
            startActivity(intent)
        }
    }
}