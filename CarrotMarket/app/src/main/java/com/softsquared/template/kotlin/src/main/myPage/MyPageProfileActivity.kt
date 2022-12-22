package com.softsquared.template.kotlin.src.main.myPage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityMyPageProfileBinding

class MyPageProfileActivity : BaseActivity<ActivityMyPageProfileBinding>(ActivityMyPageProfileBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.btnBack.setOnClickListener {
            finish();
        }

        binding.btnProfileBadges.setOnClickListener {
            val intent = Intent(this, MyPageBadgeActivity::class.java)
            startActivity(intent)
        }
        binding.btnSelling.setOnClickListener {

        }
        binding.btnLiving.setOnClickListener {

        }
        binding.btnManner.setOnClickListener {

        }
        binding.btnReview.setOnClickListener {

        }
    }
}