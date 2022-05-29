package com.zhandos.arbuz.feature_arbuz.domain.use_cases

import androidx.lifecycle.LiveData
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.model.ArbuzUser
import com.zhandos.arbuz.feature_arbuz.domain.repository.BasketArbuzRepository

class GetBasketArbuz(
    private val repositoryBasket: BasketArbuzRepository
) {
    operator fun invoke(): LiveData<List<Arbuz>> {
        return repositoryBasket.getAll()
    }
}