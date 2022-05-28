package com.zhandos.arbuz.feature_arbuz.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.zhandos.arbuz.feature_arbuz.domain.ArbuzCondition

@BindingAdapter("android:src")
fun loadImage(view: ImageView, condition: ArbuzCondition) {
    view.setImageResource(condition.imageResources)
}