package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.ActivityLikeBinding
import com.softsquared.template.kotlin.src.main.home.item

class LikeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLikeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLikeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val itemList = ArrayList<item>()
        val adapter = LikeRVAdapter(itemList)

        val decoration = DividerItemDecoration(this, LinearLayout.VERTICAL)
        binding.likeRv.addItemDecoration(decoration)

        binding.likeRv.adapter = adapter
        binding.likeRv.layoutManager = LinearLayoutManager(this)

        //서버에서 데이터 받아오기
        //테스트용 데이터
        adapter.apply {
            itemList.add(item(R.drawable.default_error, "테스트입니다", "자양동", "5분 전", 10000, 0, 0))
            itemList.add(item(R.drawable.default_error, "테스트입니다", "자양동", "5분 전", 10000, 0, 0))
            itemList.add(item(R.drawable.default_error, "테스트입니다", "자양동", "5분 전", 10000, 0, 0))
            itemList.add(item(R.drawable.default_error, "테스트입니다", "자양동", "5분 전", 10000, 0, 0))
            itemList.add(item(R.drawable.default_error, "테스트입니다", "자양동", "5분 전", 10000, 0, 0))
            itemList.add(item(R.drawable.default_error, "테스트입니다", "자양동", "5분 전", 10000, 0, 0))
        }

        //돌아가는 기능 추가
        binding.arrowButton.setOnClickListener {
            finish();
        }
    }
}