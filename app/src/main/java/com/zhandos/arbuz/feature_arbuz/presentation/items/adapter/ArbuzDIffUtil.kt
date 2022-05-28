package com.zhandos.arbuz.feature_arbuz.presentation.items.adapter

import androidx.recyclerview.widget.DiffUtil
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz

class ArbuzDIffUtil: DiffUtil.ItemCallback<Arbuz>() {

    override fun areItemsTheSame(oldItem: Arbuz, newItem: Arbuz): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Arbuz, newItem: Arbuz): Boolean {
        return oldItem == newItem
    }
}