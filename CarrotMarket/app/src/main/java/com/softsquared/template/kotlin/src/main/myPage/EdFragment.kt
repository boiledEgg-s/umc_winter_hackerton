package com.softsquared.template.kotlin.src.main.myPage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.databinding.FragmentEdBinding
import com.softsquared.template.kotlin.src.main.home.item

class EdFragment : Fragment() {
    private lateinit var binding: FragmentEdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentEdBinding.inflate(layoutInflater)

        val itemList = ArrayList<item>()
        val adapter = HList2RVAdapter(itemList)

        val decoration = DividerItemDecoration(context, LinearLayout.VERTICAL)
        binding.edRv.addItemDecoration(decoration)

        binding.edRv.adapter = adapter
        binding.edRv.layoutManager = LinearLayoutManager(context)

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

        return binding.root
    }
}