package com.zhandos.arbuz.feature_arbuz.domain.repository

import androidx.lifecycle.LiveData
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.model.ArbuzUser

interface BasketArbuzRepository {

    fun getAll(): LiveData<List<Arbuz>>

    suspend fun insert(arbuz: Arbuz)

    suspend fun update(arbuz: Arbuz)

    suspend fun delete(arbuz: Arbuz)
}