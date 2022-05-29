package com.zhandos.arbuz.feature_arbuz.data.data_source

import androidx.lifecycle.LiveData
import androidx.room.*
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.model.ArbuzUser

@Dao
interface BasketArbuzUserDao {

    @Update
    suspend fun update(arbuz: Arbuz)

    @Query("SELECT * FROM Arbuz")
    fun getAll(): LiveData<List<Arbuz>>

    @Query("SELECT * FROM Arbuz WHERE id = :id")
    fun getById(id: Long): LiveData<Arbuz>

    @Delete
    suspend fun deleteByName(arbuz: Arbuz)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(arbuz: Arbuz)
}