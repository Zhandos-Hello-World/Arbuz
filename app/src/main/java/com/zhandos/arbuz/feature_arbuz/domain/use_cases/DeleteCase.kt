package com.zhandos.arbuz.feature_arbuz.domain.use_cases

import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.repository.BasketArbuzRepository

class DeleteCase(
    private val repositoryBasket: BasketArbuzRepository
) {
    suspend operator fun invoke(arbuz: Arbuz) {
        repositoryBasket.update(arbuz)
    }
}