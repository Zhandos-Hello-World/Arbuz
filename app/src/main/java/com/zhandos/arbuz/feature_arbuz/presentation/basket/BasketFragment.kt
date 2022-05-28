package com.zhandos.arbuz.feature_arbuz.presentation.basket

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.databinding.FragmentBasketBinding
import com.zhandos.arbuz.feature_arbuz.domain.ArbuzCondition
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.presentation.basket.adapter.BasketAdapter

class BasketFragment: Fragment() {
    private var _binding: FragmentBasketBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasketBinding.inflate(inflater, container, false)
        val view = binding.root


        val adapter = BasketAdapter()
        adapter.submitList(mutableListOf(
            Arbuz("Chinese Arbuz", ArbuzCondition.RIPE, 4, 2, "Chinese"),
            Arbuz("American Arbuz", ArbuzCondition.UNRIPE, 3, 2, "USA"),
            Arbuz("Kazakhstan Arbuz", ArbuzCondition.THWARTED, 4, 0, "Kazakhstan"),
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