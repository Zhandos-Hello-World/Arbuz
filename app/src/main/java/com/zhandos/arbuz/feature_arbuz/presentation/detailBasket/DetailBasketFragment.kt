package com.zhandos.arbuz.feature_arbuz.presentation.detailBasket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.databinding.FragmentDetailBasketBinding

class DetailBasketFragment: Fragment() {
    private var _binding: FragmentDetailBasketBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBasketBinding.inflate(inflater, container, false)
        val view = binding.root



        return view
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}