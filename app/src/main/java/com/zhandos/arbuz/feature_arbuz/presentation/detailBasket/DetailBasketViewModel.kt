package com.zhandos.arbuz.feature_arbuz.presentation.detailBasket

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.use_cases.BasketArbuzUseCases
import javax.inject.Inject

class DetailBasketViewModel @Inject constructor(private val useCases: BasketArbuzUseCases): ViewModel() {

    val _arbuz = MutableLiveData<Arbuz>()

    val arbuz: LiveData<Arbuz> = _arbuz

}