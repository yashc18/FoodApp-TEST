package com.example.foodex.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodex.databinding.PopularItemBinding

class PopularAdapter(
    private val items: List<String>,
    private val prices: List<String>,
    private val images: List<Int>
) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    class PopularViewHolder(private val binding: PopularItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: String, price: String, image: Int) {
            binding.FoodName.text = item
            binding.PricePOP.text = price
            binding.imageView5.setImageResource(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        val binding = PopularItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PopularViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        val item = items[position]
        val image = images[position]
        val price = prices[position]
        holder.bind(item, price, image)
    }
}
