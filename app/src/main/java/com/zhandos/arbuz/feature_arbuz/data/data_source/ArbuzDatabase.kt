package com.zhandos.arbuz.feature_arbuz.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz

@Database(entities = [Arbuz::class], version = 1, exportSchema = false)
abstract class ArbuzDatabase: RoomDatabase() {
    abstract val basketArbuzUserDao: BasketArbuzUserDao

}