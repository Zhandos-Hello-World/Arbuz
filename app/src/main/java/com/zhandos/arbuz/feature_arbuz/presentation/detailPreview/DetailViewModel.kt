package com.zhandos.arbuz.feature_arbuz.presentation.detailPreview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.use_cases.BasketArbuzUseCases
import kotlinx.coroutines.launch
import javax.inject.Inject



class DetailViewModel @Inject constructor(var useCases: BasketArbuzUseCases): ViewModel() {
    val _arbuz = MutableLiveData<Arbuz>()

    val arbuz: LiveData<Arbuz> = _arbuz

    fun addToBasket() {
        viewModelScope.launch {
            if (arbuz.value != null) {
                useCases.addBasketArbuz(arbuz.value!!)
            }
        }
    }

}