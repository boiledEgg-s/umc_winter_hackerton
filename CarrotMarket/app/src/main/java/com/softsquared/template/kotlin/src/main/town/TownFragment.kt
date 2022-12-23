package com.softsquared.template.kotlin.src.main.town

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.softsquared.template.kotlin.R
import com.softsquared.template.kotlin.config.BaseFragment
import com.softsquared.template.kotlin.databinding.FragmentHomeBinding
import com.softsquared.template.kotlin.databinding.FragmentMyPageBinding
import com.softsquared.template.kotlin.databinding.FragmentTownBinding
import com.softsquared.template.kotlin.src.main.home.HomeRVAdapter
import com.softsquared.template.kotlin.src.main.home.item
import com.softsquared.template.kotlin.src.main.myPage.LikeActivity

class TownFragment: Fragment() {
    private lateinit var binding: FragmentTownBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTownBinding.inflate(layoutInflater)

        val itemList : ArrayList<townItem> = arrayListOf()
        val adapter = TownRVAdapter(itemList)

        //adapter의 click action 지정
//        adapter.setItemClickListener(object : TownRVAdapter.OnItemClickListener{
//            override fun onClick(v: View, position: Int) {
//                //데이터를 가지고 상세 페이지로 넘어가기.
//
//            }
//        })

        val decoration = DividerItemDecoration(context, LinearLayout.VERTICAL)
        binding.townRv.addItemDecoration(decoration)

        binding.townRv.adapter = adapter
        binding.townRv.layoutManager = LinearLayoutManager(context)

        //서버에서 데이터 받아오기
        //테스트용 데이터
        adapter.apply {
            itemList.add(townItem("테스트입니다", "자양동"))
            itemList.add(townItem("테스트입니다", "자양동"))
            itemList.add(townItem("테스트입니다", "자양동"))
            itemList.add(townItem("테스트입니다", "자양동"))
            itemList.add(townItem("테스트입니다", "자양동"))
            itemList.add(townItem("테스트입니다", "자양동"))
            itemList.add(townItem("테스트입니다", "자양동"))
        }

        //글쓰기 화면으로 넘어가기
//        //작동 확인을 위해 임시로 연결함
//        binding.floatingButton.setOnClickListener {
//            val intent = Intent(context, LikeActivity::class.java)
//            startActivity(intent)
//        }

        return binding.root
    }
}