package com.zhandos.arbuz.feature_arbuz.presentation.basket

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zhandos.arbuz.feature_arbuz.domain.DefaultArbuzModel
import com.zhandos.arbuz.feature_arbuz.domain.use_cases.BasketArbuzUseCases
import kotlinx.coroutines.launch
import javax.inject.Inject

class BasketViewModel @Inject constructor(private var useCases: BasketArbuzUseCases): ViewModel() {
    var allItems = useCases.getBasketArbuz()


    fun deleteArbuz(name: String) {
        val items = DefaultArbuzModel.items
        val arbuz = items[items.indexOfFirst { it.name == name }]
        viewModelScope.launch {
            useCases.deleteCase(arbuz)
        }
    }
}