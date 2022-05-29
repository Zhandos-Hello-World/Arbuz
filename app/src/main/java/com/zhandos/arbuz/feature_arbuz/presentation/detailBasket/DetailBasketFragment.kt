package com.zhandos.arbuz.feature_arbuz.presentation.detailBasket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.databinding.FragmentDetailBasketBinding
import com.zhandos.arbuz.feature_arbuz.domain.DefaultArbuzModel
import com.zhandos.arbuz.feature_arbuz.presentation.detailPreview.DetailPreviewFragmentArgs
import com.zhandos.arbuz.feature_arbuz.presentation.detailPreview.DetailViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class DetailBasketFragment: Fragment() {
    private var _binding: FragmentDetailBasketBinding? = null
    private val binding get() = _binding!!
    @Inject
    lateinit var viewModel: DetailViewModel


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBasketBinding.inflate(inflater, container, false)
        val view = binding.root

        val name = DetailPreviewFragmentArgs.fromBundle(requireArguments()).name
        val arbuz = DefaultArbuzModel.items[DefaultArbuzModel.items.indexOfFirst { it.name == name }]
        viewModel._arbuz.value = arbuz

        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        return view
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}