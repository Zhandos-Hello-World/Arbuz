package com.zhandos.arbuz.feature_arbuz.presentation.detailPreview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.databinding.FragmentDetailPreviewBinding

class DetailPreviewFragment : Fragment() {
    private var _binding: FragmentDetailPreviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailPreviewBinding.inflate(inflater, container, false)
        val view = binding.root



        return view
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}