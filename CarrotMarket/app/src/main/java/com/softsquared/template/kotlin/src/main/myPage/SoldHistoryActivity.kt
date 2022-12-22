package com.softsquared.template.kotlin.src.main.myPage

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.softsquared.template.kotlin.databinding.ActivitySoldHistoryBinding

//판매 내역 페이지
class SoldHistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySoldHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySoldHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val historyRVAdapter = HistoryRVAdapter(this)
        binding.viewPager.adapter = historyRVAdapter

        val titleList = arrayOf(
            "판매중",
            "거래완료",
            "숨김"
        )

        TabLayoutMediator(binding.tabLayout, binding.viewPager){ tab, position->
            tab.text = titleList[position]
        }.attach()

        //뒤로 돌아가는 버튼 기능 추가
        binding.arrowButton.setOnClickListener {
            finish()
        }
    }
}