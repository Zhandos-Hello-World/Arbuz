package com.zhandos.arbuz.items

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.databinding.FragmentItemsBinding
import com.zhandos.arbuz.domain.ArbuzCondition
import com.zhandos.arbuz.domain.model.Arbuz
import com.zhandos.arbuz.items.adapter.ArbuzAdapter

class ItemsFragment: Fragment() {
    private var _binding: FragmentItemsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemsBinding.inflate(layoutInflater, container, false)
        var view = binding.root

        var adapter = ArbuzAdapter()

        adapter.submitList(mutableListOf(
            Arbuz("ripped", ArbuzCondition.RIPE, 10, 3),
            Arbuz("ripped", ArbuzCondition.RIPE, 10, 3),
            Arbuz("ripped", ArbuzCondition.RIPE, 10, 3),
            Arbuz("ripped", ArbuzCondition.RIPE, 10, 3),
            Arbuz("ripped", ArbuzCondition.RIPE, 10, 3),
            Arbuz("ripped", ArbuzCondition.RIPE, 10, 3),
            Arbuz("ripped", ArbuzCondition.RIPE, 10, 3),
            Arbuz("ripped", ArbuzCondition.RIPE, 10, 3),
            ))


        binding.arbuzItems.adapter = adapter
        binding.lifecycleOwner = this



        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}