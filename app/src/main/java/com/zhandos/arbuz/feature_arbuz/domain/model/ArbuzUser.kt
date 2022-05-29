package com.zhandos.arbuz.feature_arbuz.domain.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class ArbuzUser(
    var name: String,
    var phone: Int,
    var city: String,
    @ColumnInfo(name="street_and_number_of_home")
    var streetAndNumberOfHome: String,
    @ColumnInfo(name="number_of_home")
    var numberOfHome: String,
    @ColumnInfo(name="apartment_number")
    var apartmentNumber: String,
    @PrimaryKey(autoGenerate = true)
    var id: Long? = 0,
)