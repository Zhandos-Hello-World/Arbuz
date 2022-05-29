package com.zhandos.arbuz.feature_arbuz.presentation.items

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.zhandos.arbuz.R
import com.zhandos.arbuz.databinding.FragmentItemsBinding
import com.zhandos.arbuz.feature_arbuz.domain.DefaultArbuzModel
import com.zhandos.arbuz.feature_arbuz.domain.model.ArbuzCondition
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.presentation.items.adapter.ArbuzAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ItemsFragment: Fragment() {
    private var _binding: FragmentItemsBinding? = null
    private val binding get() = _binding!!
    @Inject
    lateinit var viewModel: ItemViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentItemsBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        val adapter = ArbuzAdapter {
            val navigation = findNavController()
            navigation.navigate(ItemsFragmentDirections.actionItemsFragmentToDetailPreviewFragment(it))
        }

        adapter.submitList(DefaultArbuzModel.items)


        binding.arbuzItems.adapter = adapter
        binding.lifecycleOwner = this




        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}