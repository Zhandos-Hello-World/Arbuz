package com.zhandos.arbuz.feature_arbuz.items

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.databinding.FragmentItemsBinding
import com.zhandos.arbuz.feature_arbuz.domain.ArbuzCondition
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.items.adapter.ArbuzAdapter

class ItemsFragment: Fragment() {
    private var _binding: FragmentItemsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemsBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        val adapter = ArbuzAdapter()

        adapter.submitList(mutableListOf(
            Arbuz("Chinese Arbuz", ArbuzCondition.RIPE, 4, 2, "Chinese"),
            Arbuz("American Arbuz", ArbuzCondition.UNRIPE, 3, 2, "USA"),
            Arbuz("Kazakhstan Arbuz", ArbuzCondition.THWARTED, 4, 0, "Kazakhstan"),
            Arbuz("Chinese Arbuz", ArbuzCondition.RIPE, 4, 2, "Chinese"),
            Arbuz("Chinese Arbuz", ArbuzCondition.RIPE, 4, 2, "Chinese"),
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