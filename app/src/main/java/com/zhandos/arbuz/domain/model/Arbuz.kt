package com.zhandos.arbuz.domain.model

import com.zhandos.arbuz.domain.ArbuzCondition

class Arbuz(
    var image: String,
    var condition: ArbuzCondition,
    var weight: Int,
    var quantity: Int
)