package com.zhandos.arbuz.feature_arbuz.presentation.buy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.databinding.FragmentBuyBinding

class BuyFragment: Fragment() {
    private var _binding: FragmentBuyBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBuyBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}