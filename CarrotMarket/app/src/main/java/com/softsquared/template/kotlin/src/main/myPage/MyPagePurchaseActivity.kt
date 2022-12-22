package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseActivity
import com.softsquared.template.kotlin.databinding.ActivityMyPagePurchaseBinding
import com.softsquared.template.kotlin.src.main.home.item

class MyPagePurchaseActivity : BaseActivity<ActivityMyPagePurchaseBinding>(
    ActivityMyPagePurchaseBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        val itemList : ArrayList<item> = arrayListOf()
        val adapter = PurchaseRVAdapter(itemList)

        val decoration = DividerItemDecoration(this, LinearLayout.VERTICAL)

        binding.purchaseRv.addItemDecoration(decoration)

        binding.purchaseRv.adapter = adapter
        binding.purchaseRv.layoutManager = LinearLayoutManager(this)

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

        binding.btnBack.setOnClickListener {
            finish();
        }
    }
}