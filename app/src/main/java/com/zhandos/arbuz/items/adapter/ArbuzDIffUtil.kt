package com.zhandos.arbuz.items.adapter

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.zhandos.arbuz.domain.model.Arbuz

class ArbuzDIffUtil: DiffUtil.ItemCallback<Arbuz>() {

    override fun areItemsTheSame(oldItem: Arbuz, newItem: Arbuz): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Arbuz, newItem: Arbuz): Boolean {
        return oldItem == newItem
    }
}