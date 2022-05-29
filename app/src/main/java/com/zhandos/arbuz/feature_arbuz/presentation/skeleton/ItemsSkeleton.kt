package com.zhandos.arbuz.feature_arbuz.presentation.skeleton

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zhandos.arbuz.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ItemsSkeleton: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.skeleton_items, container, false)
    }

}