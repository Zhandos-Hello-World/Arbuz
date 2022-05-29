package com.zhandos.arbuz.feature_arbuz.presentation.basket

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.zhandos.arbuz.databinding.FragmentBasketBinding
import com.zhandos.arbuz.feature_arbuz.presentation.basket.adapter.BasketAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class BasketFragment : Fragment() {
    private var _binding: FragmentBasketBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var viewModel: BasketViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBasketBinding.inflate(inflater, container, false)
        val view = binding.root


        val adapter = BasketAdapter(listenerClick = {
            val navigation = findNavController()
            navigation.navigate(
                BasketFragmentDirections.actionBasketFragmentToDetailBasketFragment(
                    it
                )
            )
        }, listenerDelete = {
            viewModel.deleteArbuz(it)
        })
        binding.arbuzItems.adapter = adapter
        binding.lifecycleOwner = this

        viewModel.allItems.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })

        binding.pay.setOnClickListener {
            val navigation = findNavController()
            navigation.navigate(BasketFragmentDirections.actionFragmentBasketToBuyFragment())
        }




        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}