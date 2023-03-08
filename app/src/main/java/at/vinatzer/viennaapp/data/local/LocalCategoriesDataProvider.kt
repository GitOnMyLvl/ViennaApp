package at.vinatzer.viennaapp.data.local


import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.entertainmentSpots
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.nightLifeSpots
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.shoppingSpots
import at.vinatzer.viennaapp.model.Category

object LocalCategoriesDataProvider {
    val categories = listOf(
        Category(
            id = 1,
            name = "Night Life",
            spots = nightLifeSpots
        ),
        Category(
            id = 2,
            name = "Shopping",
            spots = shoppingSpots
        ),
        Category(
            id = 3,
            name = "Entertainment",
            spots = entertainmentSpots
        )
    )
}