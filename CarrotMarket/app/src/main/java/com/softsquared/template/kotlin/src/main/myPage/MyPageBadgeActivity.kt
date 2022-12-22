package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityMyPageBadgeBinding

class MyPageBadgeActivity : BaseActivity<ActivityMyPageBadgeBinding>(ActivityMyPageBadgeBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnBack.setOnClickListener {
            finish();
        }
    }
}