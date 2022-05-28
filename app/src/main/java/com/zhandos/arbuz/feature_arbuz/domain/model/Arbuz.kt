package com.zhandos.arbuz.feature_arbuz.domain.model

import com.zhandos.arbuz.feature_arbuz.domain.ArbuzCondition

class Arbuz(
    var name: String,
    var condition: ArbuzCondition,
    var weight: Int,
    var quantity: Int,
    var country: String
)