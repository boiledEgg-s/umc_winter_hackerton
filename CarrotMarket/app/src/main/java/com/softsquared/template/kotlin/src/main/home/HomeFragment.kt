package com.softsquared.template.kotlin.src.main.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.size
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmentHomeBinding
import com.softsquared.template.kotlin.src.main.home.models.PostSignUpRequest
import com.softsquared.template.kotlin.src.main.home.models.SignUpResponse
import com.softsquared.template.kotlin.src.main.home.models.UserResponse
import com.softsquared.template.kotlin.src.main.myPage.LikeActivity
import com.softsquared.template.kotlin.src.main.myPage.SoldHistoryActivity

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        val itemList : ArrayList<item> = arrayListOf()
        val adapter = HomeRVAdapter(itemList)

        //adapter의 click action 지정
        adapter.setItemClickListener(object : HomeRVAdapter.OnItemClickListener{
            override fun onClick(v: View, position: Int) {
                //데이터를 가지고 상세 페이지로 넘어가기.

            }
        })

        val decoration = DividerItemDecoration(context, LinearLayout.VERTICAL)
        binding.homeRv.addItemDecoration(decoration)

        binding.homeRv.adapter = adapter
        binding.homeRv.layoutManager = LinearLayoutManager(context)

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

        //글쓰기 화면으로 넘어가기
        //작동 확인을 위해 임시로 연결함
        binding.floatingButton.setOnClickListener {
            val intent = Intent(context, LikeActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }
}