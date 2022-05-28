package com.zhandos.arbuz.feature_arbuz.presentation.basket.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.zhandos.arbuz.databinding.ItemBasketBinding
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.presentation.items.adapter.ArbuzDIffUtil

class BasketAdapter : ListAdapter<Arbuz, BasketAdapter.BasketArbuzHolder>(ArbuzDIffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasketArbuzHolder {
        return BasketArbuzHolder.inflate(parent)
    }

    override fun onBindViewHolder(holder: BasketArbuzHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class BasketArbuzHolder(private val binding: ItemBasketBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(arbuz: Arbuz) {
            binding.arbuz = arbuz

        }

        companion object {
            fun inflate(parent: ViewGroup): BasketArbuzHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding: ItemBasketBinding =
                    ItemBasketBinding.inflate(layoutInflater, parent, false)
                return BasketArbuzHolder(binding)
            }
        }
    }
}