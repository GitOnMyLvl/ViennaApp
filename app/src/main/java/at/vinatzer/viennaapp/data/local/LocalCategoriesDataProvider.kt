package at.vinatzer.viennaapp.data.local


import at.vinatzer.viennaapp.R
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.entertainmentSpots
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.foodAndDrinksSpots
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.museumSpots
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.nightLifeSpots
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.shoppingSpots
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.sportsClubSpots
import at.vinatzer.viennaapp.data.local.LocalSpotsDataProvider.universitySpots
import at.vinatzer.viennaapp.model.Category

object LocalCategoriesDataProvider {

    val defaultCategory = getCategoryData()[0]
    fun getCategoryData(): List<Category> {
        return listOf(
            Category(
                id = 0,
                name = R.string.entertainment,
                spots = entertainmentSpots
            ),
            Category(
                id = 1,
                name = R.string.food_and_drinks,
                spots = foodAndDrinksSpots
            ),
            Category(
                id = 2,
                name = R.string.museums,
                spots = museumSpots
            ),
            Category(
                id = 3,
                name = R.string.night_life,
                spots = nightLifeSpots
            ),
            Category(
                id = 4,
                name = R.string.shopping,
                spots = shoppingSpots
            ),
            Category(
                id = 5,
                name = R.string.sports_clubs,
                spots = sportsClubSpots
            ),
            Category(
                id = 6,
                name = R.string.universities,
                spots = universitySpots
            )
        )
    }
}