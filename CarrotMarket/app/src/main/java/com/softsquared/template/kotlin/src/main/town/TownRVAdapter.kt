package com.softsquared.template.kotlin.src.main.town

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.softsquared.template.kotlin.databinding.TownRvLayoutBinding

class TownRVAdapter(private val itemList: ArrayList<townItem>) :
    RecyclerView.Adapter<TownRVAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: TownRvLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        //item 객체의 데이터를 연결함
        fun bind(itemList: ArrayList<townItem>, position: Int) {
            binding.tvTitle.text = itemList[position].title
            binding.tvLocation.text = itemList[position].loction
            if(position+1 < itemCount) {
                binding.tvTitleSecond.text = itemList[position+1].title
                binding.tvLocationSecond.text = itemList[position+1].loction
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            TownRvLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (position * 2 < itemCount) {
            holder.bind(itemList, position * 2)
        } else
            return
    }

    override fun getItemCount(): Int = itemList.size
}