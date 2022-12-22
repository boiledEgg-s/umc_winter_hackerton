package com.softsquared.template.kotlin.src.main.myPage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.softsquared.template.kotlin.databinding.PurchaseRvLayoutBinding
import com.softsquared.template.kotlin.src.main.home.item

class PurchaseRVAdapter(private val itemList: ArrayList<item>) :
    RecyclerView.Adapter<PurchaseRVAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: PurchaseRvLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        //item 객체의 데이터를 연결함
        fun bind(data: item) {
            binding.image.setImageResource(data.image)
            binding.title.text = data.title
            binding.location.text = data.loction
            binding.time.text = data.time
            binding.price.text = data.price.toString()
            binding.chatNum.text = data.chatNum.toString()
            binding.heartNum.text = data.heartNum.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PurchaseRvLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size
}