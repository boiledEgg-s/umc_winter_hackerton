package com.softsquared.template.kotlin.src.main.myPage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class HistoryRVAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> IngFragment()
            1 -> EdFragment()
            2 -> HideFragment()
            else -> IngFragment()
        }
    }
}