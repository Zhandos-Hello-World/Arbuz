package com.zhandos.arbuz.feature_arbuz.data.repsitory

import androidx.lifecycle.LiveData
import com.zhandos.arbuz.feature_arbuz.data.data_source.BasketArbuzUserDao
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.repository.BasketArbuzRepository

class BasketArbuzRepositoryImpl(private val userDaoBasket: BasketArbuzUserDao): BasketArbuzRepository {

    override fun getAll(): LiveData<List<Arbuz>> {
        return userDaoBasket.getAll()
    }


    override suspend fun insert(arbuz: Arbuz) {
        userDaoBasket.insert(arbuz)
    }

    override suspend fun update(arbuz: Arbuz) {
        userDaoBasket.update(arbuz)
    }

    override suspend fun delete(arbuz: Arbuz) {
        userDaoBasket.deleteByName(arbuz)
    }


}