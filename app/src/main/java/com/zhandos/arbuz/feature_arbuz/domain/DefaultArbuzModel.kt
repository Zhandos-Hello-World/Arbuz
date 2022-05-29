package com.zhandos.arbuz.feature_arbuz.domain

import com.zhandos.arbuz.feature_arbuz.domain.model.Arbuz
import com.zhandos.arbuz.feature_arbuz.domain.model.ArbuzCondition

object DefaultArbuzModel {
    val items = mutableListOf(
        Arbuz("Allsweet", ArbuzCondition.RIPE, 3, 1, "Chinese", 3.2, "‘Allsweet’ has the classic look of a picnic watermelon variety. With good disease resistance, it’s well-suited to long growing seasons.This cultivar produces large oblong fruits weighing in at 25-30 pounds each, with dark and light green striped skin."),
        Arbuz("Charleston Gray", ArbuzCondition.UNRIPE, 3, 1, "USA", 3.4, "‘Charleston Gray’ is a distinguished heirloom variety producing large cylindrical fruit that have uniform greenish-gray skin.Also sometimes referred to as ‘Charleston Grey,’ this open-pollinated picnic cultivar’s sweet red flesh is crisp and fiberless. The fruits’ hard rinds make them good keepers."),
        Arbuz("Crimson Sweet", ArbuzCondition.THWARTED, 4, 1, "Kazakhstan", 2.3, "‘Crimson Sweet’ is an open-pollinated picnic-type heirloom variety that remains many gardeners’ top pick, and for good reason – it’s delicious, productive, and disease resistant.This large, round cultivar weighs in at around 25-35 pounds at harvest, and it has a light green rind with dark green stripes.This watermelon’s flesh is dark red and firm, with a fine texture and small dark seeds"),
        Arbuz("Georgia Rattlesnake", ArbuzCondition.RIPE, 4, 1, "Chinese", 3.9, "‘Georgia Rattlesnake’ bears large, oblong fruits with light green skin and dark green stripes – bringing rattlesnake skin to mind to some gardenersThis picnic-type heirloom variety can reach 24 inches long and averages 30 pounds at maturity, with bright pink sweet flesh, and a thin rind."),
        Arbuz("Klondike Blue Ribbon Striped", ArbuzCondition.RIPE, 4, 1, "Chinese", 2.41, "‘Klondike Blue Ribbon Striped’ is an open-pollinated heirloom variety that has been a garden favorite since the early 1900s, beloved for its delicious sweet flesh.This picnic cultivar produces oblong melons that will max out at 20-30 pounds."),

    )
}