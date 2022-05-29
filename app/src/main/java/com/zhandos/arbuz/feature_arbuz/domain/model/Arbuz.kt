package com.zhandos.arbuz.feature_arbuz.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Arbuz(
    var name: String,
    var condition: ArbuzCondition,
    var weight: Int,
    var quantity: Int,
    var location: String,
    var price: Double,
    var description: String,
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,
)