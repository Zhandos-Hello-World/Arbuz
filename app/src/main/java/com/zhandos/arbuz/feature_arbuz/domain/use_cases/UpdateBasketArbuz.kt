package com.zhandos.arbuz.feature_arbuz.domain.use_cases

import androidx.lifecycle.LiveData
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.repository.BasketArbuzRepository

class UpdateBasketArbuz(
    private val repository: BasketArbuzRepository
) {
    suspend operator fun invoke(arbuz: Arbuz) {
        repository.update(arbuz)
    }
}