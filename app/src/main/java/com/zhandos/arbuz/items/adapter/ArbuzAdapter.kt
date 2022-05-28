package com.zhandos.arbuz.items.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.zhandos.arbuz.databinding.FragmentItemBinding
import com.zhandos.arbuz.domain.model.Arbuz

class ArbuzAdapter : ListAdapter<Arbuz, ArbuzAdapter.ArbuzHolder>(ArbuzDIffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArbuzHolder {
        return ArbuzHolder.inflate(parent)
    }

    override fun onBindViewHolder(holder: ArbuzHolder, position: Int) {
        holder.bind(getItem(position))
    }


    class ArbuzHolder(private val binding: FragmentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(arbuz: Arbuz) {
            binding.arbuz = arbuz
        }


        companion object {
            fun inflate(parent: ViewGroup): ArbuzHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding: FragmentItemBinding =
                    FragmentItemBinding.inflate(layoutInflater, parent, false)
                return ArbuzHolder(binding)
            }
        }
    }
}