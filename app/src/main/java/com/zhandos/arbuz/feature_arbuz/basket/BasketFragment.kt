package com.zhandos.arbuz.feature_arbuz.basket

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.databinding.FragmentBasketBinding

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


        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}